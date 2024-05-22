import java.util.Stack;

public enum OpCode {            //operaçao argumentos
    iconst(" ", -1, "int"),
    iprint( "print", 1, "int"),
    iuminus( "-1", 1, "int"),
    iadd("+", 2, "int"),
    isub("-", 2, "int"),
    imult("*", 2, "int"),
    idiv( "/", 2, "int"),
    imod( "%", 2, "int"),
    ieq( "==", 2, "int"),
    ineq( "!=", 2, "int"),
    ilt( "<", 2, "int"),
    ileq( "<=", 2, "int"),
    itod( "I_D", 1, "int"),
    itos( "I_S", 1, "int"),
    dconst( " ", -1, "double"),
    dprint( "print", 1, "double"),
    duminus( "-1", 1, "double"),
    dadd( "+", 2, "double"),
    dsub( "-", 2, "double"),
    dmult( "*", 2, "double"),
    ddiv( "/", 2, "double"),
    deq( "==", 2, "double"),
    dneq( "!=", 2, "double"),
    dlt( "<", 2, "double"),
    dleq( "<=", 2, "double"),
    dtos( "I_S", 1, "double"),
    sconst( " ", -1, "string"),
    sprint( "print", 1, "string"),
    sadd( "+", 2, "string"),
    seq( "==", 2, "string"),
    sneq( "!=", 2, "string"),
    tconst( " ", -1, "boolean"),
    fconst( " ", -1, "boolean"),
    bprint( "print", 1, "boolean"),
    beq( "==", 2, "boolean"),
    bneq( "!=", 2, "boolean"),
    and( "&&", 2, "boolean"),
    or( "||", 2, "boolean"),
    not( "!", 1, "boolean"),
    btos( "B_S", 1, "boolean"),
    halt( " ", 0, "end"),
    constantPool( " ", 0, "end"),
    DOUBLE_IDENTIFIER( " ", 0, "end"),
    STRING_IDENTIFIER( " ", 0, "end"),
    galloc( "size", -1, "global"),
    gload( "load", -1, "global"),
    gstore( "store", -1, "global"),
    jump( " ", -1, "jump"),
    jumpt( " ", -1, "jump"),
    jumpf( " ", -1, "jump"),
    lalloc( " ", -1, "lalloc"),
    lload( " ", -1, "lload"),
    lstore( " ", -1, "lstore"),
    pop( " ", -1, "pop"),
    call( " ", -1, "call"),
    retval( " ", -1, "retval"),
    ret( " ", -1, "ret"),
    ;

    private final String op;
    private final int arguments;
    private final String type;

    OpCode(String op, int arguments, String type) {
        this.op = op;
        this.arguments = arguments;
        this.type = type;
    }

    public String getOp() {
        return op;
    }

    public int getArguments() {
        return arguments;
    }

    public String getType() {
        return type;
    }



    public Object getOperation(int[] args) {
        switch (this.op) {
            case " ":
                return args[0];
            case "-1":
                return -args[0];
            case "+":
                return args[0] + args[1];
            case "-":
                return args[1] - args[0];
            case "*":
                return args[0] * args[1];
            case "/":
                return args[1] / args[0];
            case "%":
                return args[1] % args[0];
            case "==":
                return args[1] == args[0];
            case "!=":
                return args[1] != args[0];
            case "<":
                return args[1] < args[0];
            case "<=":
                return args[1] <= args[0];
            case "I_D":
                return (double) args[0];
            case "I_S":
                return '"' + String.valueOf(args[0]) + '"';
            default:
                return null;
        }
    }

    public Object getOperation(double[] args) {
        switch (this.op) {
            case " ":
                return args[0];
            case "-1":
                return -args[0];
            case "+":
                return args[0] + args[1];
            case "-":
                return args[1] - args[0];
            case "*":
                return args[0] * args[1];
            case "/":
                return args[1] / args[0];
            case "==":
                return args[1] == args[0];
            case "!=":
                return args[1] != args[0];
            case "<":
                return args[1] < args[0];
            case "<=":
                return args[1] <= args[0];
            case "I_S":
                return '"' + String.valueOf(args[0]) + '"';
            default:
                return null;
        }
    }

    public Object getOperation(String[] args) {
        switch (this.op) {
            case " ":
                return args[0];
            case "+":
                return args[1].substring(0, args[1].length() - 1) + args[0].substring(1);
            case "==":
                return args[0].equals(args[1]);
            case "!=":
                return !args[0].equals(args[1]);
            default:
                return null;
        }
    }

    public Object[] getOperation(Stack<Object> stack, Object[] global, int number) {
        switch (this.op) {
            case "size":
                Object[] clone = global;
                global = new Object[clone.length + number];
                System.arraycopy(clone, 0, global, 0, clone.length);
                for (int i = 0; i < global.length; i++) {
                    if (global[i] == null)
                        global[i] = "NIL";
                }
                break;
            case "load":
                stack.push(global[number]);
                //global[number] = "NIL";
                break;
            case "store":
                global[number] = stack.pop();
                break;
        }
        return global;
    }

    public Object getOperation(boolean[] args) {
        switch (this.op) {
            case " ":
                return args[0];
            case "==":
                return args[0] == args[1];
            case "!=":
                return args[0] != args[1];
            case "&&":
                return args[0] && args[1];
            case "||":
                return args[0] || args[1];
            case "!":
                return !args[0];
            case "B_S":
                return '"' + String.valueOf(args[0]) + '"';
            default:
                return null;

        }
    }

    public int getOperation(Stack<Object> stack, int i, int newI) {
        switch (this) {
            case jump -> { return newI;
            }
            case jumpf -> {
                try{
                    boolean f = (boolean) stack.pop();
                    if(!f)
                        return newI;
                    else
                        return i;
                } catch (Exception e) {
                    System.out.println("OUTPUT ERRADO");
                    System.exit(0);
                }
            }
            case jumpt -> {
                try{
                    boolean t = (boolean) stack.pop();
                    if(t)
                        return newI;
                    else
                        return i;
                } catch (Exception e) {
                    System.out.println("OUTPUT ERRADO");
                    System.exit(0);
                }
            }
        }
        return i;
    }

}
