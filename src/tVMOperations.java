import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 */
public class tVMOperations {
    protected static int[] argInt = new int[2];
    protected static double[] argDouble = new double[2];
    protected static String[] argString = new String[2];
    protected static boolean[] argBoolean = new boolean[2];
    protected static int argGlobal;
    protected static String readNumber;
    private static int line = 0;
    private static int fp = 0;

    protected static String getOutPutMode(Scanner in){
        String type = "";
        while (!(type.toLowerCase().equals("yes") | type.toLowerCase().equals("no") | type.toLowerCase().equals("n") | type.toLowerCase().equals("y"))){
            System.out.print("Modo Trace [Y/N]: ");
            type = in.nextLine();
        }
        return  (type.equals("y") || type.equals("yes") ? "Trace" : "Normal");
    }

    protected static String getMode(String[] args){
        String mode = "";
        if ( args.length>1 ) mode = args[1].toLowerCase().equals("trace") ? "Trace" : "Normal";
        else mode = "normal";
        return mode;
    }

    protected static DataInputStream getDin(String inputFile){
        DataInputStream din;
        try {
            return din = new DataInputStream(new FileInputStream(inputFile));
        } catch (Exception e){
            System.out.println("O sistema não consegue encontrar o ficheiro ("  + inputFile + ")" );
            din = null;
            System.exit(0);
        }
        return null;
    }

    protected static String getInputFile(String[] args){
        String inputFile = "";
        if ( args.length>0 ) inputFile = args[0];
        else {
            System.out.println("O sistema não consegue encontrar o ficheiro ("  + inputFile + ")" );
        }
        return inputFile;
    }

    protected static PrintWriter createFile(String type, String fname) throws FileNotFoundException {
        PrintWriter write;
        try {
            write = new PrintWriter(fname + ".txt");
        } catch (Exception e){
            File tasm = new File(fname);
            tasm.mkdir();
            write = new PrintWriter(fname + ".txt");
        }
        write.println("Modo " + type + "\n");
        return write;
    }

    protected static void reportFileConstantPool(PrintWriter writer, ArrayList<String> objects){
        writer.println("Constant Pool");
        int line = 0;
        double current;
        for(String obj : objects){
            writer.println("\t"  + line + ": " + obj);
            line++;
        }
        writer.println();
    }

    protected static void reportStartOperation(PrintWriter writer){
        writer.println("Disassembled instructions");
    }

    protected static void reportFile(PrintWriter writer, String mode, Stack<Object> stack, Object[] global, OpCode code,  String lineInfo, int line){
        if(mode.equals("Trace"))
            reportFileTraceMode(writer, stack, global, code, lineInfo, line);
        else
            reportFileNormalMode(writer);
    }

    protected static void reportFileTraceMode(PrintWriter writer, Stack<Object> stack, Object[] global, OpCode code, String lineInfo, int ip){
        String globalString = "[";
        for(Object obj : global) {
            if(obj instanceof String)
                globalString += (String) obj;
            else
                globalString += obj;
            globalString += ", ";
        }
        if(global.length >= 1)
            globalString = globalString.substring(0, globalString.length() - 2);
        globalString  += "]";
        writer.println("\t\t\t\t\t\t\t\t\t\t\t\tGlobals: " + globalString);
        writer.println("\t\t\t\t\t\t\t\t\t\t\t\tStack: " + stack);
        String command = line + ": " + code + " " + lineInfo;
        int tabs = 12 - (int) Math.ceil(command.length() / 4) - 1;
        writer.print("\t" + command);
        for(int i = 0; i < tabs; i++)
            writer.print("\t");
        writer.print("IP: " + ip + " FP: " + fp +  "\n");;
        line++;
    }
//12 tabs 4 espacos por tab
    protected static void reportFileNormalMode(PrintWriter writer){

    }


    protected static ArrayList<String> loadPool(DataInputStream in) throws IOException {
        OpCode code = null;
        ArrayList<String> cp = new ArrayList<>();
        String word = "";
        int byteCode, size;
        while (true){
            byteCode = in.readInt();
            code = OpCode.values()[byteCode];

            if(code.equals(OpCode.constantPool))
                break;
            if(code.equals(OpCode.DOUBLE_IDENTIFIER)){
                cp.add(String.valueOf(in.readDouble()));
            }
            if(code.equals(OpCode.STRING_IDENTIFIER)){
                size = in.readInt();
                for(int i = 0; i < size; i++)
                    word += in.readChar();
                cp.add(word);
                word = "";
            }
        }
        return cp;
    }

    protected static Object objectToAddStack(OpCode code, PrintWriter writer){
        if(code.getOp().equals("print")) {
            if(code.getType().equals("string")) {
                String print = (String) getStackObjectValue(code.getType());
                System.out.println(print.substring(1,print.length()-1));
                writer.println("\t" + print.substring(1,print.length()-1));
            }else {
                System.out.println(getStackObjectValue(code.getType()));
                writer.println("\t" + getStackObjectValue(code.getType()));
            }
            return null;
        }
        switch (code.getType()){
            case "int":
                return code.getOperation(argInt);
            case "double":
                return code.getOperation(argDouble);
            case "string":
                return code.getOperation(argString);
            case "boolean":
                return code.getOperation(argBoolean);
        }
        return null;
    }

    protected static Object[] insertObjectToStack(Stack<Object> stack, Object[] global, OpCode code, Object obj){
        if(obj != null)
            stack.push(obj);
        else if(code.getType().equals("global"))
            global = code.getOperation(stack, global, argGlobal);
        return global;
    }

    protected static Object getStackObjectValue(String type){
        return switch (type) {
            case "int" -> (argInt[0]);
            case "double" -> (argDouble[0]);
            case "string" -> (argString[0]);
            case "boolean" -> (argBoolean[0]);
            default -> "";
        };
    }


    protected static OpCode readCommand(DataInputStream din) throws IOException {
        try {
            int byteCode = din.readInt();
            return OpCode.values()[byteCode];
        } catch (Exception e){
            return null;
        }

    }



    protected static ArrayList<String> loadOperations(DataInputStream din) throws IOException {
        ArrayList<String> operations = new ArrayList<>();
        String newOperation = "";
        OpCode code;
        while ((code =  readCommand(din)) != null){
            newOperation = String.valueOf(code);
            if(code.getArguments() == -1 && !code.getType().equals("boolean"))
                newOperation += " " + din.readInt();
            operations.add(newOperation);
        }
        return operations;
    }

    protected static int readLine(String input, Stack<Object> stack, Object[] global, ArrayList<String> cp, PrintWriter writer, String mode, int line) throws IOException {
        String[] in = input.split(" ");
        OpCode code = OpCode.valueOf(in[0]);
        readNumber = "";
        int counter = code.getArguments();
        String type = code.getType();
        boolean flagReadDin = false;
        if(counter == -1){
            flagReadDin = true;
            counter = 1;
        } else
            reportFile(writer, mode, stack, global, code, "", line);
        for(int i = 0; i < counter; i++){
            if(stack.size() == 0 && !flagReadDin){
                System.out.println("runtime error: Tentativa de pop, quando stack não têm elementos.");
                writer.println("runtime error: Tentativa de pop, quando stack não têm elementos.");
                System.exit(0);
            }
            switch (type){
                case "int":
                    if(!flagReadDin)
                        argInt[i] = toInt(stack.pop(), code.toString(), writer);
                    else
                        argInt[i] = Integer.parseInt(in[1]);
                    break;
                case "double":
                    if(!flagReadDin)
                        argDouble[i] = toDouble(stack.pop(), code.toString(), writer);
                    else
                        argDouble[i] = Double.parseDouble(cp.get(Integer.parseInt(in[1])));
                    break;
                case "string":
                    if(!flagReadDin)
                        argString[i] = toStr(stack.pop(), code.toString(), writer);
                    else
                        argString[i] = cp.get(Integer.parseInt(in[1]));
                    break;
                case "boolean":
                    if(!flagReadDin)
                        argBoolean[i] = toBool(stack.pop(), code.toString(), writer);
                    else
                        argBoolean[i] = code.values()[code.ordinal()].equals(OpCode.tconst);
                    break;
                case "global":
                    argGlobal = Integer.parseInt(in[1]);
                    break;
                case "jump":
                    line = code.getOperation(stack, line, Integer.parseInt(in[1])-1);
                    break;
            }
        }
        if(flagReadDin) {
            if(in.length > 1)
                readNumber = in[1];
            reportFile(writer, mode, stack, global, code, readNumber, line);
        }
        int untilFP;
        switch (type){
            case "call":
                int previousFP = fp;
                fp = stack.size();
                stack.add(previousFP);
                stack.add(line+1);
                line = Integer.parseInt(in[1])-1;


                break;
            case "lalloc":
                for(int k = 0; k < Integer.parseInt(in[1]); k++)
                    stack.add("NIL");

                break;
            case "lstore":
                stack.set(fp + Integer.parseInt(in[1]), stack.pop());
                break;
            case "lload":
                stack.add(stack.get(fp+ Integer.parseInt(in[1])));
                break;
            case "pop":
                for(int i = 0; i < Integer.parseInt(in[1]); i++){
                    stack.pop();
                }
                break;
            case "ret":
                untilFP = (stack.size() - fp) - 2;
                for(int i = 0; i < untilFP; i++){
                    stack.pop();
                }
                line = (int) stack.pop() - 1; //preciso subtrair 1 para compensar o for
                fp = (int) stack.pop(); //tirar o pop
                for(int i = 0; i < Integer.parseInt(in[1]); i++){
                    stack.pop();
                }
                break;
            case "retval":
                Object saveObject = stack.pop();
                untilFP = (stack.size() - fp) - 2;
                for(int i = 0; i < untilFP; i++){
                    stack.pop();
                }
                line = (int) stack.pop() - 1; //preciso subtrair 1 para compensar o for
                fp = (int) stack.pop(); //tirar o pop
                for(int i = 0; i < Integer.parseInt(in[1]); i++){
                    stack.pop();
                }
                stack.push(saveObject);
                break;
        }
        readNumber = "";
        return line;
    }

    protected static int toInt(Object obj, String exception, PrintWriter writer){
        try{
            int i = (Integer) obj;
            readNumber = String.valueOf(i);
            return i;
        }catch (Exception e){
            writer.println("runtime error: Tentativa de \"" + exception + "\" de um Integer quando não é um Integer.");
            writer.close();
            System.out.println("runtime error: Tentativa de \"" + exception + "\" de um Integer quando não é um Integer.");
            System.exit(0);
        }
        return 0;
    }

    protected static double toDouble(Object obj, String exception, PrintWriter writer){
        try{
            double number = (Double) obj;
            readNumber = String.valueOf(number);
            return number;
        }catch (Exception e){
            writer.println("runtime error: Tentativa de \"" + exception + "\" de um Double quando não é um Double.");
            writer.close();
            System.out.println("runtime error: Tentativa de \"" + exception + "\" de um Double quando não é um Double.");
            System.exit(0);
        }
        return 0;
    }

    protected static String toStr(Object obj, String exception, PrintWriter writer){
        try{
            String str = (String) obj;
            readNumber = String.valueOf(str);
            return str;
        }catch (Exception e){
            writer.println("runtime error: Tentativa de \"" + exception + "\" de um String quando não é um String.");
            writer.close();
            System.out.println("runtime error: Tentativa de \"" + exception + "\" de um String quando não é um String.");
            System.exit(0);
        }
        return null;
    }

    protected static boolean toBool(Object obj, String exception, PrintWriter writer){
        try{
            boolean bool = (boolean) obj;
            readNumber = String.valueOf(bool);
            return bool;
        }catch (Exception e){
            writer.println("runtime error: Tentativa de \"" + exception + "\" de um Boolean quando não é um Boolean.");
            writer.close();
            System.out.println("runtime error: Tentativa de \"" + exception + "\" de um Boolean quando não é um Boolean.");
            System.exit(0);
        }
        return false;
    }



    protected static String loadByteCodes(String filename){
        String result = "";
        try {
            DataInputStream din = new DataInputStream(new FileInputStream(filename));
            while (din.available() > 0){
                System.out.println(":D");
                System.out.println("BYTE: " + din.readInt());
                System.out.println(result);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
