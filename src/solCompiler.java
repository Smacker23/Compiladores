/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
import Sol.g4.SolLexer;
import Sol.g4.SolParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;

/** Esta classe em auxilio com o "SolCompilerMyVisitor" converte um ficheiro com o formato sol, para o formato tbc. Permitindo assim
 * com que a classe "VM" consigo interpretar os comandos dados pelo ficheiro Sol e retorner o resultado.
 * Para fazer isto esta classe lê um ficheiro que pode ser dado com argumento, ou caso não haja argumentos, pede no terminal.
 * Para dar um path para o ficheiro sol. Depois de fazer a conversão guarda o ficheiro com o mesmo nome em bytecodes e guarda também
 * o mesmo ficheiro com um formato txt, na paste "intermediário" para que seja possível ler a conversão feita.
 *
 */
public class solCompiler {

    private static void writeTasm(String fName, ArrayList<Object> pool, ArrayList<Integer> byteCodes) throws FileNotFoundException {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter( fName + ".tasm");
        } catch (Exception e) {
            File tasm = new File("Inputs");
            tasm.mkdir();
            writer = new PrintWriter(fName + ".tasm");
        }
        int line = 0;
        for (int i = 0; i < byteCodes.size(); i++) {
            writer.print("L" + line + ": " + OpCode.values()[byteCodes.get(i)]);
            if (OpCode.values()[byteCodes.get(i)].getArguments() == -1 && OpCode.values()[byteCodes.get(i)] != OpCode.tconst && OpCode.values()[byteCodes.get(i)] != OpCode.fconst){
                i++;
                if(OpCode.values()[byteCodes.get(i-1)] == OpCode.jumpf || OpCode.values()[byteCodes.get(i-1)] == OpCode.jumpt || OpCode.values()[byteCodes.get(i-1)] == OpCode.jump || OpCode.values()[byteCodes.get(i-1)] == OpCode.call)
                    writer.print(" L" + byteCodes.get(i)+"\n");
                else {
                    if(OpCode.values()[byteCodes.get(i-1)] == OpCode.dconst || OpCode.values()[byteCodes.get(i-1)] == OpCode.sconst)
                        writer.println(" " + pool.get(byteCodes.get(i)));
                    else
                        writer.print(" " + byteCodes.get(i) + "\n");
                }

            }
            else
                writer.print("\n");
            line++;
        }
        writer.println();
        writer.close();
    }

    private static void writeTbc(String fName, ArrayList<Object> pool, ArrayList<Integer> byteCodes) throws IOException {
        DataOutputStream dout;
        double dPool;
        String sPool;
        try {
            dout = new DataOutputStream(new FileOutputStream(fName + ".tbc"));
        } catch (Exception e){
            File tasm = new File("Inputs");
            tasm.mkdir();
            dout = new DataOutputStream(new FileOutputStream(fName + ".tbc"));
        }
        if(!pool.isEmpty()){
            dout.writeInt(OpCode.constantPool.ordinal());
            for(int i = 0; i < pool.size(); i++){
                try{
                    dPool = (Double) pool.get(i);
                    dout.writeInt(OpCode.DOUBLE_IDENTIFIER.ordinal());
                    dout.writeDouble(dPool);
                }catch (Exception e){
                    sPool = (String) pool.get(i);
                    dout.writeInt(OpCode.STRING_IDENTIFIER.ordinal());
                    dout.writeInt(sPool.length());
                    dout.writeChars(sPool);

                }
            }
            dout.writeInt(OpCode.constantPool.ordinal());
        }
        for(int i = 0; i < byteCodes.size(); i++) {
            dout.writeInt(byteCodes.get(i));
        }
        dout.close();
    }

    public static void main(String[] args) throws Exception {

        String inputFile = null;
        String fName;
        if ( args.length>0 )
            inputFile = args[0];
        fName = inputFile.split("\\.")[0];
        InputStream is = System.in;
        try {
            if (inputFile != null) is = new FileInputStream(inputFile);
            CharStream input = CharStreams.fromStream(is);
            SolLexer lexer = new SolLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SolParser parser = new SolParser(tokens);
            ParseTree tree = parser.start();
            SolCompilerMyVisitor evalVisitor = new SolCompilerMyVisitor();
            evalVisitor.visit(tree);
            ArrayList<Integer> byteCodes = evalVisitor.byteCodes;
            ArrayList<Object> pool = evalVisitor.pool;
            System.out.println(byteCodes);
            System.out.println(evalVisitor.index);
            writeTasm(fName, pool, byteCodes);
            writeTbc(fName, pool, byteCodes);

            System.out.println("Compilação feita com sucesso!");
        }
        catch (java.io.IOException e) {
            System.out.println("O sistema não consegue encontrar o ficheiro ("  + inputFile + ")" );
        }
    }
}