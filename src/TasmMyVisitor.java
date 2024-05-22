import Tasm.g4.TasmBaseVisitor;
import Tasm.g4.TasmParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;

public class TasmMyVisitor extends TasmBaseVisitor<Integer> {
    protected ArrayList<Integer> byteCodes = new ArrayList<>();
    protected ArrayList<String> labelJumps = new ArrayList<>();
    protected ArrayList<Object> pool = new ArrayList<>();
    private int flag = 0;
    private int labelNumber = 0;
    private int jumpCounter = 0;
    protected HashMap<String, Integer> labels = new HashMap<>();


    private void labelVerify(){
        if(labelJumps.size() != jumpCounter){
            System.out.println("ERROR: INPUT ERRADO");
            System.exit(0);
        }
    }

    private void haltVerify(String ctx){
        if(!ctx.replaceAll("\n","").replaceAll("\r","").equals("halt")){
            System.out.println("Source file must have a 'halt' instruction");
            System.exit(0);
        }
    }

    private void labelOperation(TerminalNode ctx){
        String label;
        String[] toadd;
        if(ctx != null){
            label = ctx.getText().substring(0, ctx.getText().length()-1).replaceAll(" ","");
            toadd = label.split(",");
            for(String s : toadd) {
                if(labels.containsKey(s)){
                    System.out.println("label " + s + " is already defined");
                    System.exit(0);
                }
                labels.put(s, labelNumber);
            }
        }
        labelNumber++;
    }



    @Override
    public Integer visitIntSimpleOperatorsRemove1(TasmParser.IntSimpleOperatorsRemove1Context ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        OpCode code = OpCode.valueOf(ctx.operator.getText());
        int by =  code.ordinal();
        byteCodes.add(by);
        return by;
    }

    @Override
    public Integer visitIntSimpleOperatorsAdd1(TasmParser.IntSimpleOperatorsAdd1Context ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        int by =  OpCode.valueOf(ctx.operator.getText()).ordinal();
        byteCodes.add(by);
        try{
            byteCodes.add(Integer.parseInt(ctx.number.getText()));
        } catch (Exception e){
            System.out.println("runtime error: \"" + OpCode.valueOf(ctx.operator.getText()) + "\" precisa de um Integer");
        }
        return by;
    }

    @Override
    public Integer visitIntSimpleOperators(TasmParser.IntSimpleOperatorsContext ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        flag = 1;
        int by =  OpCode.valueOf(ctx.operator.getText()).ordinal();
        byteCodes.add(by);
        return by;
    }


    @Override
    public Integer visitIntCompare(TasmParser.IntCompareContext ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        int by =  OpCode.valueOf(ctx.operator.getText()).ordinal();
        byteCodes.add(by);
        return by;
    }

    @Override
    public Integer visitDoubleSimpleOperatorsAdd1(TasmParser.DoubleSimpleOperatorsAdd1Context ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        int by =  OpCode.valueOf(ctx.operator.getText()).ordinal();
        byteCodes.add(by);
        try{
            double d = Double.parseDouble(ctx.number.getText());
            if(!pool.contains(d)){
                byteCodes.add(pool.size());
                pool.add(d);
            }else
                byteCodes.add(pool.indexOf(d));
        } catch (Exception e){
            System.out.println("runtime error: \"" + OpCode.valueOf(ctx.operator.getText()) + "\" precisa de um Double");
            System.exit(0);
        }

        return by;
    }

    @Override
    public Integer visitDoubleSimpleOperatorsRemove1(TasmParser.DoubleSimpleOperatorsRemove1Context ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        OpCode code = OpCode.valueOf(ctx.operator.getText());
        int by =  code.ordinal();
        byteCodes.add(by);
        return by;
    }

    @Override
    public Integer visitDoubleSimpleOperators(TasmParser.DoubleSimpleOperatorsContext ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        flag = 1;
        int by =  OpCode.valueOf(ctx.operator.getText()).ordinal();
        byteCodes.add(by);
        return by;
    }
    @Override
    public Integer visitDoubleCompare(TasmParser.DoubleCompareContext ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        int by =  OpCode.valueOf(ctx.operator.getText()).ordinal();
        byteCodes.add(by);
        return by;
    }



    @Override
    public Integer visitStringSimpleOperatorsAdd1(TasmParser.StringSimpleOperatorsAdd1Context ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        int by =  OpCode.valueOf(ctx.operator.getText()).ordinal();
        byteCodes.add(by);
        if(ctx.WORD() == null || ctx.WORD().getText().charAt(0) != '"'){
            System.out.println("runtime error: \"" + OpCode.valueOf(ctx.operator.getText()) + "\" precisa de uma String");
            System.exit(0);
        }
        if(!pool.contains(ctx.WORD().getText())) {
            byteCodes.add(pool.size());
            pool.add(ctx.WORD().getText());
        }else
            byteCodes.add(pool.indexOf(ctx.WORD().getText()));
        return by;
    }

    @Override
    public Integer visitStringSimpleOperatorsRemove1(TasmParser.StringSimpleOperatorsRemove1Context ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        int by =  OpCode.valueOf(ctx.operator.getText()).ordinal();
        byteCodes.add(by);
        return by;
    }

    @Override
    public Integer visitStringCompare(TasmParser.StringCompareContext ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        int by =  OpCode.valueOf(ctx.operator.getText()).ordinal();
        byteCodes.add(by);
        return by;
    }

    @Override
    public Integer visitBooleanSimpleOperatorsAdd1(TasmParser.BooleanSimpleOperatorsAdd1Context ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        int by =  OpCode.valueOf(ctx.operator.getText()).ordinal();
        byteCodes.add(by);
        return by;
    }

    @Override
    public Integer visitBooleanSimpleOperators(TasmParser.BooleanSimpleOperatorsContext ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        int by =  OpCode.valueOf(ctx.operator.getText()).ordinal();
        byteCodes.add(by);
        return by;
    }

    @Override
    public Integer visitBooleanSimpleOperatorsRemove1(TasmParser.BooleanSimpleOperatorsRemove1Context ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        int by =  OpCode.valueOf(ctx.operator.getText()).ordinal();
        byteCodes.add(by);
        return by;
    }

    @Override
    public Integer visitGlobalOperators(TasmParser.GlobalOperatorsContext ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        int by =  OpCode.valueOf(ctx.operator.getText()).ordinal();
        byteCodes.add(by);
        try{
            byteCodes.add(Integer.parseInt(ctx.number.getText()));
        } catch (Exception e){
            System.out.println("runtime error: \"" + OpCode.valueOf(ctx.operator.getText()) + "\" precisa de um Integer");
        }

        return by;
    }

    @Override
    public Integer visitJumpOperators(TasmParser.JumpOperatorsContext ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        int by =  OpCode.valueOf(ctx.operator.getText()).ordinal();
        byteCodes.add(by);
        int add = 0;
        if(ctx.LABEL_IDENTIFIER() != null)
            add = ctx.LABEL_IDENTIFIER().getText().length();
        String label = ( ctx.operator.getText().equals("jump") ? ctx.getText().substring(4 + add) : ctx.getText().substring(5 + add));
        labelJumps.add(label.replaceAll("\n","").replaceAll("\r",""));
        jumpCounter++;
        return by;
    }

    @Override
    public Integer visitFunctionOperators(TasmParser.FunctionOperatorsContext ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        OpCode code = OpCode.valueOf(ctx.operator.getText());
        int by = code.ordinal();
        if(code == OpCode.call){
            int add = 0;
            if(ctx.LABEL_IDENTIFIER() != null)
                add = ctx.LABEL_IDENTIFIER().getText().length();
            String label = ctx.getText().substring(4+add);
            labelJumps.add(label.replaceAll("\n","").replaceAll("\r",""));
            jumpCounter++;
            byteCodes.add(by);
            return by;
        }
        byteCodes.add(by);
        int number = Integer.parseInt(ctx.number.getText());
        if(ctx.negative != null)
            number *= -1;
        byteCodes.add(number);
        return by;
    }
    @Override
    public Integer visitEndOperator(TasmParser.EndOperatorContext ctx) {
        labelOperation(ctx.LABEL_IDENTIFIER());
        haltVerify(ctx.operator.getText());
        int by =  OpCode.valueOf(ctx.operator.getText()).ordinal();
        byteCodes.add(by);
        return by;
    }


    public ArrayList<Integer> getByteCodes(){
        labelVerify();
        return this.byteCodes;
    }

    public ArrayList<Object> getPool(){
        return this.pool;
    }


}
