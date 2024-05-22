import Sol.g4.SolBaseVisitor;
import Sol.g4.SolParser;

import java.util.*;

/**
 * Esta classe é o nosso visitor.
 */
public class SolCompilerMyVisitor extends SolBaseVisitor<Void> {
    protected int index = 0;
    protected ArrayList<Object> pool = new ArrayList<>();
    protected ArrayList<Integer> byteCodes = new ArrayList<>();
    protected HashMap<String, CustomVariable> variables = new HashMap<>();
    protected HashMap<String, CustomFunction> functions = new HashMap<>();

    protected HashMap<String, CustomFunction> missingFunctions = new HashMap<>();

    private String insidefunction = null;

    private int localVariablesIndexControl = 0;

    private ArrayList<Integer> insideBlock = new ArrayList<>();


    /**
     * Esta classe, serve para auxiliar a hashmap "variables", pois a hashmap precisa de uma string(nome),
     * e de um customValue, que possui index da variavel, o type da variavel, e se ela já foi inicializada ou não(booleano).
     */
    private static class CustomVariable{
        int index;
        String type;
        boolean initialized;
        boolean isGlobal;
        CustomVariable(int i, String s, boolean b, boolean g){
            this.index = i;
            this.type = s;
            this.initialized = b;
            this.isGlobal = g;

        }

        public int getIndex() {
            return index;
        }

        public String getType() {
            return type;
        }


        public void setInitializedTrue(){
            this.initialized = true;
        }
        public boolean getInitialized(){
            return initialized;
        }
        public boolean isGlobal() {return isGlobal;}

        @Override
        public String toString() {
            if(isGlobal) return "GLOBAL";
            else return "LOCAL";
        }
    }

    private static class CustomFunction{
        int index;
        String returnType;
        ArrayList<String> variablesTypes = new ArrayList<>();
        CustomFunction(int i, String s){
            this.index = i;
            this.returnType = s;
        }

        public int getIndex() {
            return index;
        }

        public String getType() {
            return returnType;
        }

        public void addVariable(String s){this.variablesTypes.add(s);}

        public int getVariablesSize(){return this.variablesTypes.size();}

        public String getVariableType(int i){return this.variablesTypes.get(i);}

        @Override
        public String toString() {
            return "" + this.index;
        }
    }

    private int indexBreak;
    private boolean checkBreak = false;
    private String type = "";

    /** Este método vai reescrever a variável type (caso necessário), após esta ser chamada entre duas expressões, vai permanecer
     * aquela que tiver maior valor na hierarquia entre Strings, reals, ints, seguido esta mesma ordem
     *
     * @param s tipo da primeira variável a ser comparada (o tipo da segunda expressão já está guardado no type)
     */
    private void setTypeValue(String s){
        if(s.equals("string"))type = "string";
        else if(s.equals("real") && !type.equals("string")) type = "real";
    }

    /** Este método compara dois tipos de variáveis, usando a lógica da hierarquia da função setTypeValue
     *
     * @param s1 primeiro Tipo
     * @param s2 segunda Tipo
     * @return -1 Caso O primeiro tipo seja superior ao segundo. 0 se ambos forem iguais. 1 Se o segundo for superior ao primeiro
     */
    private int compareTo(String s1, String s2){
        if(s1.equals(s2))
            return 0;
        else if(s1.equals("string")) return -1;
        else if(s2.equals("string")) return 1;
        else if(s1.equals("real") && s2.equals("int")) return -1;
        else if(s2.equals("real") && s1.equals("int")) return 1;
        else return -10;
    }

    /** Este método serve para converter (caso necessário) as expressões de modo a que ambas sejam do mesmo tipo, para os casos
     * de soma, subtração, multiplicação e divisão. A lógica por atrás deste método é uma vez mais com base na hierarquia. De destacar
     * que quando a segunda expressão é a que precisar ser convertida basta inserir o Opcode da conversão no final da ArrayList, já
     * para o caso de ser a primeira o Opcode será sempre o antepenúltimo index da ArrayList para estes casos.
     *
     * @param s String com o tipo da primeira expressão
     */
    private void convertToSameType(String s, int index){
        int comparation = compareTo(s,type);
        if(comparation == 0)
            return;
        else if(comparation == -1){
            if(s.equals("real"))
                byteCodes.add(OpCode.itod.ordinal());
            else {
                if(type.equals("int"))
                    byteCodes.add(OpCode.itos.ordinal());
                else if(type.equals("real"))
                    byteCodes.add(OpCode.dtos.ordinal());
                else
                    byteCodes.add(OpCode.btos.ordinal());
            }
        } else if(comparation == 1){
            if(type.equals("real"))
                byteCodes.add(index, OpCode.itod.ordinal());
            else {
                if(s.equals("int"))
                    byteCodes.add(index, OpCode.itos.ordinal());
                else if(s.equals("real"))
                    byteCodes.add(index, OpCode.dtos.ordinal());
                else
                    byteCodes.add(index, OpCode.btos.ordinal());
            }
        }else {
            System.out.println("ERROR:diferente types");
            System.exit(0);
        }
        this.index++;
    }
    /**
     * serve para visitar o start.
     */
    @Override
    public Void visitStart(SolParser.StartContext ctx) {
        for(SolParser.BlockContext block : ctx.block())
            visit(block);
        if(functions.containsKey("main") && functions.get("main").getVariablesSize() == 0 && functions.get("main").returnType.equals("void")){
            byteCodes.add(mainLocationByteCodes, OpCode.call.ordinal());
            byteCodes.add(mainLocationByteCodes+1,functions.get("main").index);
            byteCodes.add(mainLocationByteCodes+2,OpCode.halt.ordinal());
        }else{
            System.out.println("Error there is no main");
            System.exit(0);
        }
        return null;
    }


    /**
     * serve para visitar o caso do print,onde o print pode ter os 4 tipos
     * int,real,bool e string.
     * @param ctx the parse tree
     * @return
     */
    @Override
    public Void visitCasePrint(SolParser.CasePrintContext ctx) {
        visit(ctx.expr());
        if(type.equals("int")) byteCodes.add(OpCode.iprint.ordinal());
        else if(type.equals("real")) byteCodes.add(OpCode.dprint.ordinal());
        else if(type.equals("string")) byteCodes.add(OpCode.sprint.ordinal());
        else if(type.equals("bool")) byteCodes.add(OpCode.bprint.ordinal());
        this.index++;
        return null;
    }


    /** Este método insere o Opcode iconst na ArrayList e de seguida insere também o valor do inteiro, para além disse atribui o tipo
     * da expressão ao valor Int.
     * @param ctx the parse tree Folha
     * @return null
     */
    @Override
    public Void visitInt(SolParser.IntContext ctx) {
        type = "int";
        byteCodes.add(OpCode.iconst.ordinal());
        try {
            int add = Integer.parseInt(ctx.getText());
            byteCodes.add(add);
        }catch (Exception e){
            System.exit(0);
        }
        this.index++;
        return null;
    }

    /** Este método insere o Opcode dconst na ArrayList, verifica se o valor do double já existe na ArrayList pool (constant pool), caso
     * exista apenas atribuí à ArrayList final o index na pool. Caso contrário adicionamos à pool o valor do double no último index, e
     * passamos para a ArrayList final esse index. Caso haja algum erro Na conversão do valor para double. É apresentado no terminal
     * uma mensagem com o devido erro. Por fim atribui-se o valor do Type para double
     *
     * @param ctx the parse tree Folha
     * @return null
     */
    @Override
    public Void visitDouble(SolParser.DoubleContext ctx) {
        type = "real";
        try{
            double d = Double.parseDouble(ctx.getText());
            byteCodes.add(OpCode.dconst.ordinal());
            if(!pool.contains(d)){
                byteCodes.add(pool.size());
                pool.add(d);
            }else
                byteCodes.add(pool.indexOf(d));
        } catch (Exception e){
            System.out.println("runtime error: \"" + OpCode.valueOf(ctx.getText()) + "\" needs a real");
            System.exit(0);
        }
        this.index++;
        return null;
    }

    /** Este método insere o Opcode sconst na ArrayList, verifica se o valor do double já existe na ArrayList pool (constant pool), caso
     * exista apenas atribuí à ArrayList final o index na pool. Caso contrário adicionamos à pool o valor da string no último index, e
     * passamos para a ArrayList final esse index. Por fim atribui-se o valor do Type para string
     *
     * @param ctx the parse tree Folha
     * @return null
     */
    @Override
    public Void visitString(SolParser.StringContext ctx) {
        type = "string";
        byteCodes.add(OpCode.sconst.ordinal());
        if(pool.contains(ctx.getText()))
            byteCodes.add(pool.indexOf(ctx.getText()));
        else {
            byteCodes.add(pool.size());
            pool.add(ctx.getText());
        }
        this.index++;
        return null;
    }

    /** Este método adiciona o Opcode tconst, caso o comando seja true, ou Opcode fconst caso seja false.
     * Por fim atribui-se o valor do Type para boolean
     *
     * @param ctx the parse tree Folha
     * @return null
     */
    @Override
    public Void visitBoolean(SolParser.BooleanContext ctx) {
        type = "bool";
        if(ctx.getText().equals("true"))
            byteCodes.add(OpCode.tconst.ordinal());
        else
            byteCodes.add(OpCode.fconst.ordinal());
        this.index++;
        return null;
    }

    /** Este método visita as expressões unárias, poderá ter apenas dois comandos, sendo eles "not" para o caso dos booleanos, e "-"
     * para o casos dos ints, doubles. Inicialmente faz-se uma verificação para caso o type da expressão seja string, caso seja
     * é acionado no terminal uma mensagem de erro e código encerra. Para o caso dos booleanos adiciona-se à ArrayList o Opcode
     * not. Caso seja "-1" adiciona-se o Opcode iuminus, ou duminus consoante o type que for.
     *
     * @param ctx the parse tree Folha
     * @return null
     */
    @Override
    public Void visitUnaryExpression(SolParser.UnaryExpressionContext ctx) {
        visit(ctx.expr());
        if(type.equals("string")){
            System.out.println("ERROR: strings dont have unary expression(-/not)");
            System.exit(0);
        } else if(type.equals("bool"))
            byteCodes.add(OpCode.not.ordinal());
        else if(type.equals("real"))
            byteCodes.add(OpCode.duminus.ordinal());
        else if(type.equals("int"))
            byteCodes.add(OpCode.iuminus.ordinal());
        this.index++;
        return null;
    }

    /** Este método visita as expressões de soma e subtração. Inicialmente visita a expressão da esquerda e direita, converte
     * as expressões para o mesmo tipo caso seja necessário. Por fim analisa o operador e faz a operações consoante o tipo
     * sendo as possiblidades (após feita as conversões) Opcode iadd, isub entre dois inteiros. dadd, dsub entre dois doubles, ou
     * sadd entre duas strings. Caso tente-se subtrair duas strings, será apresentado uma mensagem de erro.
     *
     * @param ctx the parse tree Folha
     * @return null
     */
    @Override
    public Void visitAddSubExpression(SolParser.AddSubExpressionContext ctx) {
        visit(ctx.expr(0));
        String firstExpressionrType = type;
        int firstExpressionIndex = byteCodes.size();
        visit(ctx.expr(1));
        convertToSameType(firstExpressionrType, firstExpressionIndex);
        setTypeValue(firstExpressionrType);
        if(ctx.operador.getText().equals("+")){
            if(type.equals("string")){
                byteCodes.add(OpCode.sadd.ordinal());
            } else if(type.equals("real"))
                byteCodes.add(OpCode.dadd.ordinal());
            else
                byteCodes.add(OpCode.iadd.ordinal());
        }
        else if(ctx.operador.getText().equals("-")){
            if(type.equals("string")){
                System.out.println("ERROR:invalid operator (-) before STRING ");
                System.exit(0);
            } else if(type.equals("real"))
                byteCodes.add(OpCode.dsub.ordinal());
            else
                byteCodes.add(OpCode.isub.ordinal());
        }
        this.index++;
        return null;
    }

    /** Este método visita as expressões de multiplicação, divisão e resto da divisão inteira. São feitas as conversões para o mesmo
     * tipo e no fim são realizadas as operações. Caso seja uma string, ou booleano, ou uma operação o resto da divisão inteira
     * entre um, ou dois doubles será apresentado uma mensagem de erro. Caso contrário será adicionado à ArrayList o Opcode da operação.
     * imult (*), idiv(/), imod(%) entre dois inteiros, ou dmult(*), ddiv(/) entre dois doubles.
     *
     * @param ctx the parse tree Folha
     * @return null
     */
    @Override
    public Void visitMultDivModExpression(SolParser.MultDivModExpressionContext ctx) {
        visit(ctx.expr(0));
        String firstExpressionrType = type;
        int firstIndex = byteCodes.size();
        visit(ctx.expr(1));
        convertToSameType(firstExpressionrType, firstIndex);
        setTypeValue(firstExpressionrType);
        if(ctx.operador.getText().equals("*")){
            if(type.equals("string")){
                System.out.println("ERROR: invalid operator(*) between STRINGS ");
                System.exit(0);
            } else if(type.equals("real"))
                byteCodes.add(OpCode.dmult.ordinal());
            else
                byteCodes.add(OpCode.imult.ordinal());
        }
        else if(ctx.operador.getText().equals("/")){
            if(type.equals("string")){
                System.out.println("ERROR: invalid operator(/) between STRINGS ");
                System.exit(0);
            } else if(type.equals("real"))
                byteCodes.add(OpCode.ddiv.ordinal());
            else
                byteCodes.add(OpCode.idiv.ordinal());
        } else if(ctx.operador.getText().equals("%")){
            if(type.equals("string")){
                System.out.println("ERROR: invalid operator(%) between STRINGS ");
                System.exit(0);
            } else if(type.equals("real")){
                System.out.println("ERROR: invalid operator(%) between Reals ");
                System.exit(0);
            }
            else
                byteCodes.add(OpCode.imod.ordinal());
        }
        this.index++;
        return null;
    }


    /** Este método visita a expressão dentro da expressão entre parênteses.
     *
     * @param ctx the parse tree Folha
     * @return null
     */
    public Void visitParenthesesExpression(SolParser.ParenthesesExpressionContext ctx) {
        visit(ctx.expr());
        this.index++;
        return null;
    }

    /** Este método faz as conversões para as operações lógicas
     *
     * @param s String com o tipo da primeira expressão
     * @param index int com o último index da primeira expressão
     */
    private void convertToSameTypeLogicOperation(String s, int index){
        if(s.equals("bool") && type.equals("bool")) return;
        else if(s.equals("bool") || type.equals("bool")){
            System.out.println("ERROR: compare a BOOL whith  (STRING / INT / DOUBLE)");
            System.exit(0);
        }
        int comparation = compareTo(s,type);
        if(comparation == 0)
            return;
        this.index++;
        if(comparation == -1){
            if(s.equals("real"))
                byteCodes.add(OpCode.itod.ordinal());
            else {
                System.out.println("ERROR: compare STRING with another Type");
                System.exit(0);
            }
        } else if(comparation == 1){
            if(type.equals("real"))
                byteCodes.add(index, OpCode.itod.ordinal());
            else {
                System.out.println("ERROR: compare STRING with another Type");
                System.exit(0);
            }
        }else {
            System.out.println("ERROR: diferent types");
            System.exit(0);
        }
    }

    /** Este método verifica as expressões de '==' e '!='. Sendo que estas apenas são entre Strings, Booleanos. Ou para o caso entre ints com doubles.
     * Caso os tipos de comparaveis não possa ser comparado será apresentado uma mensagem com o erro apropriado e o programa encerrará.
     *
     * @param ctx the parse tree Folha
     * @return null
     */
    @Override
    public Void visitIdualExpression(SolParser.IdualExpressionContext ctx) {
        visit(ctx.expr(0));
        int firstExpressionIndex = byteCodes.size();
        String firstExpressionType = type;
        visit(ctx.expr(1));
        convertToSameTypeLogicOperation(firstExpressionType,firstExpressionIndex);  //PROBLEMA ESTA FUNC MATA-SE PARA BOOL CONTORNAR
        if(ctx.IDUALDADE().getText().equals("==")) {
            if(type.equals("int"))
                byteCodes.add(OpCode.ieq.ordinal());
            else if(type.equals("real"))
                byteCodes.add(OpCode.deq.ordinal());
            else if(type.equals("string"))
                byteCodes.add(OpCode.seq.ordinal());
            else
                byteCodes.add(OpCode.beq.ordinal());
        } else if(ctx.IDUALDADE().getText().equals("!=")) {
            if(type.equals("int"))
                byteCodes.add(OpCode.ineq.ordinal());
            else if(type.equals("real"))
                byteCodes.add(OpCode.dneq.ordinal());
            else if(type.equals("string"))
                byteCodes.add(OpCode.sneq.ordinal());
            else
                byteCodes.add(OpCode.bneq.ordinal());
        }
        type = "bool";
        this.index++;
        return null;
    }

    /** Caso uma das expressões for booleana, ou String Apresenta mensagem de erro e encerra o programa. Caso contrário
     * adiciona o Opcode consonate a operação.
     *
     * @param op String com o operados
     * @param s String com o tipo da primeira expressão
     */
    private void reels(String op, String s){
        setTypeValue(s);
        if(s.equals("bool") || type.equals("bool") || s.equals("string") || type.equals("string")){
            System.out.println("ERROR:compare Strings or bools with(<,<=,>,>=)");
            System.exit(0);
        }
        switch (op){
            case "<":
            case ">":
                if(type.equals("real"))byteCodes.add(OpCode.dlt.ordinal());
                else byteCodes.add(OpCode.ilt.ordinal());
                break;
            case "<=":
            case ">=":
                if(type.equals("real"))byteCodes.add(OpCode.dleq.ordinal());
                else byteCodes.add(OpCode.ileq.ordinal());
                break;
        }
    }


    /** Este método visita as expressões relacionais ('<', '<=', '>', '>='). Apenas pode recebe expressões de inteiros, ou doubles
     * caso contrário apresenta uma mensagem de erro no terminal e encerra o programa. Uma vez que os Opcodes contém apenas o caso
     * de '<' e '<=', quando for preciso fazer as operações '>' e '>=' é preciso converte a ordem que as expressões são dadas na
     * ArrayList, uma vez que 'a' > 'b' <==> 'b' < 'a'. Por fim verfica-se qaul é o tipo da expressão e dá-se o Opcode necessário
     * dlt, dleq para doubles, ou ilt, ileq para ints.
     *
     * @param ctx the parse tree Folha
     * @return null
     */
    @Override
    public Void visitReelExpression(SolParser.ReelExpressionContext ctx) {
        String rel = ctx.RELACIONAL().getText();
        if(rel.equals("<") || rel.equals("<=")){
            visit(ctx.expr(0));
            int firstExpressionIndex = byteCodes.size();
            String firstExpressionType = type;
            visit(ctx.expr(1));
            convertToSameTypeLogicOperation(firstExpressionType,firstExpressionIndex);
            reels(rel, firstExpressionType);
        } else {
            visit(ctx.expr(1));
            int firstExpressionIndex = byteCodes.size();
            String firstExpressionType = type;
            visit(ctx.expr(0));
            convertToSameTypeLogicOperation(firstExpressionType,firstExpressionIndex);
            reels(rel, firstExpressionType);
        }
        type = "bool";
        this.index++;
        return null;
    }


    /** Este método visita a expressão "and". Para isto verifica se as duas expressões são booleanos, caso sim adicion à ArrayList
     * o Opcode and, caso contrário dá uma mensagem de erro
     *
     * @param ctx the parse tree Folha
     * @return null
     */
    @Override
    public Void visitAndExpression(SolParser.AndExpressionContext ctx) {
        visit(ctx.expr(0));
        String firstExpressionrType = type;
        visit(ctx.expr(1));
        if(!firstExpressionrType.equals("bool") || !type.equals("bool")){
            System.out.println("ERROR: AND needs 2 bools , and 1 or 2 expression NOT BOOL");
            System.exit(0);
        }
        byteCodes.add(OpCode.and.ordinal());
        type = "bool";
        this.index++;
        return null;
    }


    /** Este método visita a expressão "or". Para isto verifica se as duas expressões são booleanos, caso sim adicion à ArrayList
     * o Opcode or, caso contrário dá uma mensagem de erro
     *
     * @param ctx the parse tree Folha
     * @return null
     */
    @Override
    public Void visitOrExpression(SolParser.OrExpressionContext ctx) {
        visit(ctx.expr(0));
        String firstExpressionrType = type;
        visit(ctx.expr(1));
        if(!firstExpressionrType.equals("bool") || !type.equals("bool")){
            System.out.println("ERROR: OR needs 2 bools , and 1 or 2 expression NOT BOOL");
            System.exit(0);
        }
        byteCodes.add(OpCode.or.ordinal());
        type = "bool";
        this.index++;
        return null;
    }

    ///////////////
    /**
     * Este método serve para visitar as variaveis e serve para incrementar o index(as linhas).
     * caso exista algum erro, nós matamos o programa e exibimos uma mensagem de erro apropriada
     * @param ctx the parse tree
     * @return
     */
    @Override
    public Void visitVariable(SolParser.VariableContext ctx) {
            if (!variables.containsKey(ctx.getText())) {
                System.out.println("ERROR: " + ctx.getText() + " NOT defined");
                System.exit(0);
            } else if (!variables.get(ctx.getText()).initialized) {
                System.out.println("ERROR: " + ctx.getText() + " Not initialized (need a value)");
                System.exit(0);
            } else {
                if(variables.get(ctx.getText()).isGlobal) //caso variavel global
                    byteCodes.add(OpCode.gload.ordinal());
                else
                    byteCodes.add(OpCode.lload.ordinal()); //caso variavel local
                byteCodes.add(variables.get(ctx.getText()).index);
                type = variables.get(ctx.getText()).type;
            }
        this.index++;
        return null;
    }

    /**
     * Este método serve de hipoteses para o que poderá existir depois do for.
     * ou seja depois do for poderá vir um while,begin,print,if,for,break e ainda uma variavel.
     * @param ctx
     */
    private void chooseNextCase(SolParser.LineContext ctx){
        if(ctx.getText().substring(0,5).contains("while"))
            visitCaseWhile((SolParser.CaseWhileContext) ctx);
        else if(ctx.getText().substring(0,5).contains("begin"))
            visitCaseBlock((SolParser.CaseBlockContext) ctx);
        else if(ctx.getText().substring(0,5).contains("print"))
            visitCasePrint((SolParser.CasePrintContext) ctx);
        else if(ctx.getText().substring(0,5).contains("if"))
            visitCaseIf((SolParser.CaseIfContext) ctx);
        else if(ctx.getText().substring(0,5).contains("for"))
            visitCaseFor((SolParser.CaseForContext) ctx);
        else if(ctx.getText().substring(0,5).contains("break"))
            visitCaseBreak((SolParser.CaseBreakContext) ctx);
        else if(ctx.getText().substring(0,6).contains("return"))
            visitCaseReturn((SolParser.CaseReturnContext) ctx);
        else
            visitCaseVariable((SolParser.CaseVariableContext) ctx);
    }
    /**
     * este método serve para visitar o empty.
     * @param ctx the parse tree
     * @return
     */
    @Override
    public Void visitCaseEmpty(SolParser.CaseEmptyContext ctx) {
        return null;
    }

    /**
     * Este método serve para adicionar uma variavel dentro da hashmap.
     * caso exista algum erro, nós matamos o programa e exibimos uma mensagem de erro apropriada.
     * @param k nome da variavel
     * @param v o tipo da variavel
     */
    private void insertUniqueVariable(String k, String v){
        if(variables.containsKey(k) && !(variables.get(k).isGlobal && insidefunction != null)){
            for(String s : variables.keySet())
                System.out.println(s + " " + variables.get(s));
            System.exit(0);
        }
        if(insidefunction != null) {
            variables.put(k, new CustomVariable(localVariablesIndexControl, v, false, false));
            this.localVariablesIndexControl++;
        }
        else
            variables.put(k,new CustomVariable(variables.size(),v, false, true));
    }

    /**
     * Este método serve para criar novas variaveis. com ajuda do método insertUniqueVariable, vamos adicionar todas as
     * variaveis na hashmap "variables". Caso a variavel seja inicializada, alteramos o estado da variavel para iniciali-
     * zada. caso exista algum erro na atribuíção de valores, nós matamos o programa e exibimos uma mensagem de erro apropriada.
     * @param ctx
     */
    private void newVariables(SolParser.CaseVariableContext ctx){
        OpCode alloc;
        OpCode store;
        if(insidefunction != null){
            alloc = OpCode.lalloc;
            store = OpCode.lstore;
        }else {
            alloc = OpCode.galloc;
            store = OpCode.gstore;
        }
        String[] params = ctx.getText().split(",");
        byteCodes.add(alloc.ordinal());
        byteCodes.add(ctx.VARNAME().size());
        this.index++;
        int indexVarValue = 0;
        for(int i = 0; i < ctx.VARNAME().size(); i++){
            insertUniqueVariable(ctx.VARNAME().get(i).getText(), ctx.VAR().getText());
            if(params[i].contains("=")) {
                visit(ctx.expr(indexVarValue));
                variables.get(ctx.VARNAME(i).getText()).setInitializedTrue();
                if(ctx.VAR().getText().equals("real") && this.type.equals("int")) {
                    byteCodes.add(OpCode.itod.ordinal());
                    this.index++;
                } else if(!ctx.VAR().getText().equals(type)){
                    System.out.println("ERROR: bad atribution of values, " + ctx.expr(indexVarValue).getText() + " NOT " + ctx.VAR().getText());
                    System.exit(0);
                }
                byteCodes.add(store.ordinal());
                byteCodes.add(variables.get(ctx.VARNAME().get(i).getText()).index);
                this.index++;
                indexVarValue++;
            }
        }
    }

    /**
     * Este método serve para dar update numa variavél.Para isso vamos percorrer todas as variaveis( caso exista algum tipo
     *  de erro, vamos matar o programa e exibir uma mensagem de erro apropriada),e vamos guardar o update no array global.
     * @param ctx
     */
    private void updateVariables(SolParser.CaseVariableContext ctx){
        if(ctx.VARNAME().size() != ctx.expr().size()){
            System.out.println("ERROR:one or more variables needs a value");
            System.exit(0);
        }
        for(int i = 0; i < ctx.VARNAME().size(); i++){
            if(!variables.containsKey(ctx.VARNAME(i).getText())){
                System.out.println("ERROR: variable " + ctx.VARNAME().get(i).getText() + " not declared");
                System.exit(0);
            }
            variables.get(ctx.VARNAME(i).getText()).setInitializedTrue();
            visit(ctx.expr(i));
            this.index++;
            if(this.type.equals("int") && variables.get(ctx.VARNAME(i).getText()).type.equals("real")) {
                byteCodes.add(OpCode.itod.ordinal());
                this.index++;
            } else if(!variables.get(ctx.VARNAME(i).getText()).type.equals(type)){
                System.out.println("ERROR: diferent types. " + ctx.expr(i).getText() + " NOT " + variables.get(ctx.VARNAME(i).getText()).type);
                System.exit(0);
            }
            if(variables.get(ctx.VARNAME().get(i).getText()).isGlobal)
                byteCodes.add(OpCode.gstore.ordinal());
            else
                byteCodes.add(OpCode.lstore.ordinal());
            byteCodes.add(variables.get(ctx.VARNAME().get(i).getText()).index);
        }
    }

    /**
     * Este método serve para visitar o caso das variaveis.Onde engloba os casos de ser uma variavel já existente
     * que precise de update(com ajuda do método updateVariables), ou os casos onde a variavel seja criada(newVariables)
     * caso exista algum tipo de erro, nós matamos o programa e será exibida uma mensagem de erro apropriada.
     * @param ctx the parse tree
     * @return
     */
    @Override
    public Void visitCaseVariable(SolParser.CaseVariableContext ctx){
        if(ctx.expr().size() > ctx.VARNAME().size()) {
            System.out.println("ERROR:one or more variables needs a value");
            System.exit(0);
        }
        if(ctx.VAR() == null)
            updateVariables(ctx);
        else
            newVariables(ctx);
        return null;
    }


    /**
     * Este método serve para visitar o if. para isso temos que guardar alguns indexs. caso a condição do if seja falsa
     * nós temos que dar jumpf para fora do if, porém caso exista um else temos que dar jump para dentro do else.
     * Caso o if a condição do if seja verdadeira e exita um else, depois do if acabar temos que dar um jump para fora
     * do else.
     * @param ctx the parse tree
     * @return
     */
    @Override
    public Void visitCaseIf(SolParser.CaseIfContext ctx) {
        visit(ctx.expr());
        if(!type.equals("bool")){
            System.out.println("ERROR: if needs a condition," + ctx.expr().getText() + " NOT BOOL");
            System.exit(0);
        }
        int ifByteCodesIndex = this.byteCodes.size();
        this.index++;
        chooseNextCase(ctx.line(0));
        if(ctx.line().size() == 2) {                    //caso de else
            int byteCodesBeforeElse = this.byteCodes.size();    //slot onde vai ser dado o jump para ignorar o else
            this.index++;                   //incrementar +1 para guardar o slot que vai ser reservado para o jump (depois do if para ignorar o else)
            int labelBeforeElse = this.index;
            chooseNextCase(ctx.line(1));  //visitar o else
            byteCodes.add(byteCodesBeforeElse,OpCode.jump.ordinal());
            byteCodes.add(byteCodesBeforeElse + 1, this.index);
            byteCodes.add(ifByteCodesIndex,OpCode.jumpf.ordinal());
            byteCodes.add(ifByteCodesIndex + 1, labelBeforeElse);
        }else{                                                         //Caso não haja else ele vai para depois do if
            byteCodes.add(ifByteCodesIndex,OpCode.jumpf.ordinal());     //Caso haja (if de cima) o pointer tem que ser antes do else (porque ele vai fazer o else)
            byteCodes.add(ifByteCodesIndex + 1, this.index);
        }
        if(checkBreak) {
            this.indexBreak += 2; //PARA COMPENSAR O JUMP DO IF
        }
        return null;
    }

    /**
     * Este método serve para visitar o caso do while.O while precisa de uma condição para funcionar, casa contrário
     * nós matamos o programa e mostramos uma mensagem de erro apropriada. Caso a condição seja falsa nós damos um jumpf
     * para fora do while. caso contrário nós entramos dentro do while.
     * @param ctx the parse tree
     * @return
     */
    @Override
    public Void visitCaseWhile(SolParser.CaseWhileContext ctx){
        int startWhileIndexLabel = this.index;  // 5  8
        visit(ctx.expr());
        int startWhileIndexBytecodes = this.byteCodes.size();
        if(!type.equals("bool")){
            System.out.println("ERROR:While need a condition: " + ctx.expr().getText() + " NOT BOOL");
            System.exit(0);
        }
        this.index++;
        chooseNextCase(ctx.line());
        byteCodes.add(OpCode.jump.ordinal());
        byteCodes.add(startWhileIndexLabel);
        this.index++;
        byteCodes.add(startWhileIndexBytecodes,OpCode.jumpf.ordinal());
        byteCodes.add(startWhileIndexBytecodes+1,index);
        if(checkBreak){
            this.indexBreak += 2;       //É NECESSÁRIO DAR 2 DE COMPENSAÇÃO (PELO JUMP INICIAL DO WHILE)
            this.byteCodes.add(this.indexBreak,OpCode.jump.ordinal());
            this.byteCodes.add(this.indexBreak+1,this.index);
            checkBreak = false;
        }
        return null;
    }

    private boolean shouldInvokePop = true;

    /**
     * Este método serve para visitar o bloco,que pode estar dentro do if, while e for.
     * @param ctx the parse tree
     * @return
     */
    @Override
    public Void visitCaseBlock(SolParser.CaseBlockContext ctx) {
        shouldInvokePop = true;
        HashMap<String, SolCompilerMyVisitor.CustomVariable> clone =
                (HashMap<String, SolCompilerMyVisitor.CustomVariable>) variables.clone(); //cria o clone de como eram as variaveis antes de entrar na funcao

        this.insideBlock.set(this.insideBlock.size()-1, this.insideBlock.get(this.insideBlock.size()-1)+1);
        for(SolParser.LineContext l : ctx.line())
            visit(l);
        int currentBlockVariables =  (variables.size() - clone.size());
        this.localVariablesIndexControl = this.localVariablesIndexControl - currentBlockVariables;
        if(currentBlockVariables > 0 && this.insideBlock.get(this.insideBlock.size()-1) > 0 && shouldInvokePop){
            byteCodes.add(OpCode.pop.ordinal());
            byteCodes.add(currentBlockVariables);
            this.index++;
        }
        this.insideBlock.set(this.insideBlock.size()-1, this.insideBlock.get(this.insideBlock.size()-1)-1);
        variables = clone;      //Volta para a HashMap original (sem as funcoes locais)
        return null;
    }


    /**
     * Este método serve para visitar o for, onde temos que dar 1 variavel(int) com um valor, depois uma expressão(
     * também int)que serve  como limitador, onde a cada iteração o valor da variavel vai ser incrementado em 1 até que
     * ele alcance o valor da expressão.
     * @param ctx the parse tree
     * @return
     */
    @Override
    public Void visitCaseFor(SolParser.CaseForContext ctx) {
        if(!variables.containsKey(ctx.VARNAME().getText())){
            System.out.println("Error: " + ctx.VARNAME().getText() + " Not declared");
            System.exit(0);
        }
        else {
            variables.get(ctx.VARNAME().getText()).setInitializedTrue();
            visit(ctx.expr(0));
            byteCodes.add(OpCode.gstore.ordinal());
            byteCodes.add(variables.get(ctx.VARNAME().getText()).index);
            this.index++;
            int jump = this.index;
            byteCodes.add(OpCode.gload.ordinal());
            byteCodes.add(variables.get(ctx.VARNAME().getText()).index);
            this.index++;
            visit(ctx.expr(1));
            byteCodes.add(OpCode.ileq.ordinal());
            int jumpfIndex = this.index;
            int jumpfBytecodes = this.byteCodes.size();
            this.index+=2;
            chooseNextCase(ctx.line());
            byteCodes.add(OpCode.gload.ordinal());
            byteCodes.add(variables.get(ctx.VARNAME().getText()).index);
            this.index++;
            byteCodes.add(OpCode.iconst.ordinal());
            byteCodes.add(1);
            this.index++;
            byteCodes.add(OpCode.iadd.ordinal());
            this.index++;
            byteCodes.add(OpCode.gstore.ordinal());
            byteCodes.add(variables.get(ctx.VARNAME().getText()).index);
            this.index++;
            byteCodes.add(OpCode.jump.ordinal());
            byteCodes.add(jump);
            this.index++;
            byteCodes.add(jumpfBytecodes,OpCode.jumpf.ordinal());
            byteCodes.add(jumpfBytecodes+1,this.index);
            if(checkBreak){
                this.indexBreak += 2;       //É NECESSÁRIO DAR 2 DE COMPENSAÇÃO (PELO JUMP INICIAL DO FOR)
                this.byteCodes.add(this.indexBreak,OpCode.jump.ordinal());
                this.byteCodes.add(this.indexBreak+1,this.index);
                checkBreak = false;

            }
        }
        return null;
    }
    /**
     * Este método serve para visitar o break.Que vai permitir sair dos ciclos for e while.
     * @param ctx the parse tree
     * @return
     */
    @Override
    public Void visitCaseBreak(SolParser.CaseBreakContext ctx) {
        this.indexBreak = this.byteCodes.size();
        this.checkBreak = true;
        this.index++;
        return null;
    }


    @Override
    public Void visitBlock(SolParser.BlockContext ctx) {
        if(ctx.function() == null)
            visit(ctx.line());
        else
            visit(ctx.function());
        return null;
    }

    private int mainLocationByteCodes = -1;
    @Override
    public Void visitFunction(SolParser.FunctionContext ctx) {
        if(mainLocationByteCodes == -1){ //primeira vez que entra na funcao
            mainLocationByteCodes = this.byteCodes.size(); //onde vai guardar nos bytecodes
            this.index+=2; //comepnsar call da main + halt
        }
        this.insideBlock.add(0);
        this.localVariablesIndexControl+=2;
        if(missingFunctions.containsKey(ctx.VARNAME(0).getText())){
            this.byteCodes.add(missingFunctions.get(ctx.VARNAME(0).getText()).getIndex(),this.index);
            for(String func : missingFunctions.keySet()){
                if(missingFunctions.get(func).index > missingFunctions.get(ctx.VARNAME(0).getText()).getIndex())
                    missingFunctions.get(func).index++;
            }
        }
        int index = 0;          //Utilizado para os casos de void
        int startIndex = this.byteCodes.size();
        if(functions.containsKey(ctx.VARNAME(0).getText())) {
            System.out.println("Error fucntion already declared");
            System.exit(0);
        }
        insidefunction = ctx.VARNAME(0).getText();
        functions.put(ctx.VARNAME(0).getText(), new CustomFunction(this.index, ctx.functionType.getText()));
        if(ctx.functionType.getText().equals("void"))
            index = 1;
        int localVariableIndex = -1;
        for(int i = ctx.VARNAME().size()-1; i > 0; i--){
            functions.get(ctx.VARNAME(0).getText()).addVariable(ctx.VAR(i-index).getText());
            variables.put(ctx.VARNAME(i).getText(), new CustomVariable(localVariableIndex, ctx.VAR(i-index).getText(),true, false));
            localVariableIndex--;
        }
        visit(ctx.line());


        if(functions.get(insidefunction).returnType.equals("void")) {
            this.index++;
            byteCodes.add(OpCode.ret.ordinal());
            byteCodes.add(functions.get(insidefunction).getVariablesSize());
        }
        insidefunction = null;
        Iterator<HashMap.Entry<String, CustomVariable>> iterator = variables.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, CustomVariable> entry = iterator.next();
            if (!entry.getValue().isGlobal) {
                iterator.remove();
            }
        }
        this.localVariablesIndexControl-=2;
        this.insideBlock.remove(this.insideBlock.size()-1);
        return null;
    }

    @Override
    public Void visitCaseReturn(SolParser.CaseReturnContext ctx) {
        if(!functions.get(insidefunction).returnType.equals("void")){
            visit(ctx.expr());
            byteCodes.add(OpCode.retval.ordinal());
            byteCodes.add(functions.get(insidefunction).getVariablesSize());
        } else{
            byteCodes.add(OpCode.ret.ordinal());
            byteCodes.add(functions.get(insidefunction).getVariablesSize());
        }
        this.index++;
        shouldInvokePop = false;
        return null;
    }

    @Override
    public Void visitFunc(SolParser.FuncContext ctx) {
        /*
            preicos fazer
                1º verificação se as variaveis da função estao corretas quantidade e tipos
                2º meter o this.type ao valor que a função retorna
                    problema a função pode não ter sido criada ainda    //vamos ignorar este problema


                NOTAS parece confuso pelo seguinte motivo
                O prof faz a logica da seguinte forma
                    int nomeFunc(int a, int b, int c)
                    sendo que o a vale -3 b -2 e c -1
                    Portanto eu le da direita para a esquerda, porque não se sabe quantas variaveis são para dar o valor ao a
                    Logo isto ficou invertido, ou seja dentro da HashMap function o primeiro slot está para o c, b, a
                    Isto faz com que a informação ande cruzada, portanto em vez de dizer que o index é i, passa a ser o size - 1 - i

         */
        if(functions.containsKey(ctx.VARNAME().getText())) {
            for (int i = 0; i < ctx.expr().size(); i++) {
                visit((ctx.expr(i)));
                 if (!this.type.equals(functions.get(ctx.VARNAME().getText()).getVariableType(functions.get(ctx.VARNAME().getText()).getVariablesSize() - i - 1)) && !(this.type.equals("int") && functions.get(ctx.VARNAME().getText()).getVariableType(functions.get(ctx.VARNAME().getText()).getVariablesSize() - i - 1).equals("real"))) {
                    System.out.println("Error wrong function " + ctx.VARNAME().getText() + "parameters");
                    System.exit(0);
                }
            }
            this.type = functions.get(ctx.VARNAME().getText()).getType();
            this.byteCodes.add(OpCode.call.ordinal());
            this.byteCodes.add(functions.get(ctx.VARNAME().getText()).index);
        } else {
            missingFunctions.put(ctx.VARNAME().getText(), new CustomFunction(this.byteCodes.size(),this.type));
            for (int i = 0; i < ctx.expr().size(); i++) {
                visit((ctx.expr(i)));
                //System.out.println("Expected: " + functions.get(ctx.VARNAME().getText()).getVariableType(functions.get(ctx.VARNAME().getText()).getVariablesSize() - i - 1));
                missingFunctions.get(ctx.VARNAME().getText()).addVariable(this.type);
            }
            byteCodes.add(OpCode.call.ordinal());
            missingFunctions.get(ctx.VARNAME().getText()).index = this.byteCodes.size();
            //byteCodes.add(99);

        }
        this.index++;
        return null;
    }


}