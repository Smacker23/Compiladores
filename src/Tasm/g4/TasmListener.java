// Generated from C:/Users/alexd/OneDrive/Ambiente de Trabalho/Compiladores/projeto_parte4/Tasm.g4 by ANTLR 4.13.1
package Tasm.g4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TasmParser}.
 */
public interface TasmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TasmParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(TasmParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(TasmParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#intOperators}.
	 * @param ctx the parse tree
	 */
	void enterIntOperators(TasmParser.IntOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#intOperators}.
	 * @param ctx the parse tree
	 */
	void exitIntOperators(TasmParser.IntOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#intCompare}.
	 * @param ctx the parse tree
	 */
	void enterIntCompare(TasmParser.IntCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#intCompare}.
	 * @param ctx the parse tree
	 */
	void exitIntCompare(TasmParser.IntCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#intSimpleOperators}.
	 * @param ctx the parse tree
	 */
	void enterIntSimpleOperators(TasmParser.IntSimpleOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#intSimpleOperators}.
	 * @param ctx the parse tree
	 */
	void exitIntSimpleOperators(TasmParser.IntSimpleOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#intSimpleOperatorsAdd1}.
	 * @param ctx the parse tree
	 */
	void enterIntSimpleOperatorsAdd1(TasmParser.IntSimpleOperatorsAdd1Context ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#intSimpleOperatorsAdd1}.
	 * @param ctx the parse tree
	 */
	void exitIntSimpleOperatorsAdd1(TasmParser.IntSimpleOperatorsAdd1Context ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#intSimpleOperatorsRemove1}.
	 * @param ctx the parse tree
	 */
	void enterIntSimpleOperatorsRemove1(TasmParser.IntSimpleOperatorsRemove1Context ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#intSimpleOperatorsRemove1}.
	 * @param ctx the parse tree
	 */
	void exitIntSimpleOperatorsRemove1(TasmParser.IntSimpleOperatorsRemove1Context ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#doubleOperators}.
	 * @param ctx the parse tree
	 */
	void enterDoubleOperators(TasmParser.DoubleOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#doubleOperators}.
	 * @param ctx the parse tree
	 */
	void exitDoubleOperators(TasmParser.DoubleOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#doubleSimpleOperators}.
	 * @param ctx the parse tree
	 */
	void enterDoubleSimpleOperators(TasmParser.DoubleSimpleOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#doubleSimpleOperators}.
	 * @param ctx the parse tree
	 */
	void exitDoubleSimpleOperators(TasmParser.DoubleSimpleOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#doubleSimpleOperatorsAdd1}.
	 * @param ctx the parse tree
	 */
	void enterDoubleSimpleOperatorsAdd1(TasmParser.DoubleSimpleOperatorsAdd1Context ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#doubleSimpleOperatorsAdd1}.
	 * @param ctx the parse tree
	 */
	void exitDoubleSimpleOperatorsAdd1(TasmParser.DoubleSimpleOperatorsAdd1Context ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#doubleSimpleOperatorsRemove1}.
	 * @param ctx the parse tree
	 */
	void enterDoubleSimpleOperatorsRemove1(TasmParser.DoubleSimpleOperatorsRemove1Context ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#doubleSimpleOperatorsRemove1}.
	 * @param ctx the parse tree
	 */
	void exitDoubleSimpleOperatorsRemove1(TasmParser.DoubleSimpleOperatorsRemove1Context ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#doubleCompare}.
	 * @param ctx the parse tree
	 */
	void enterDoubleCompare(TasmParser.DoubleCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#doubleCompare}.
	 * @param ctx the parse tree
	 */
	void exitDoubleCompare(TasmParser.DoubleCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#stringOperators}.
	 * @param ctx the parse tree
	 */
	void enterStringOperators(TasmParser.StringOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#stringOperators}.
	 * @param ctx the parse tree
	 */
	void exitStringOperators(TasmParser.StringOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#stringSimpleOperatorsAdd1}.
	 * @param ctx the parse tree
	 */
	void enterStringSimpleOperatorsAdd1(TasmParser.StringSimpleOperatorsAdd1Context ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#stringSimpleOperatorsAdd1}.
	 * @param ctx the parse tree
	 */
	void exitStringSimpleOperatorsAdd1(TasmParser.StringSimpleOperatorsAdd1Context ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#stringSimpleOperatorsRemove1}.
	 * @param ctx the parse tree
	 */
	void enterStringSimpleOperatorsRemove1(TasmParser.StringSimpleOperatorsRemove1Context ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#stringSimpleOperatorsRemove1}.
	 * @param ctx the parse tree
	 */
	void exitStringSimpleOperatorsRemove1(TasmParser.StringSimpleOperatorsRemove1Context ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#stringCompare}.
	 * @param ctx the parse tree
	 */
	void enterStringCompare(TasmParser.StringCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#stringCompare}.
	 * @param ctx the parse tree
	 */
	void exitStringCompare(TasmParser.StringCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#booleanOperators}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperators(TasmParser.BooleanOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#booleanOperators}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperators(TasmParser.BooleanOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#booleanSimpleOperators}.
	 * @param ctx the parse tree
	 */
	void enterBooleanSimpleOperators(TasmParser.BooleanSimpleOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#booleanSimpleOperators}.
	 * @param ctx the parse tree
	 */
	void exitBooleanSimpleOperators(TasmParser.BooleanSimpleOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#booleanSimpleOperatorsAdd1}.
	 * @param ctx the parse tree
	 */
	void enterBooleanSimpleOperatorsAdd1(TasmParser.BooleanSimpleOperatorsAdd1Context ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#booleanSimpleOperatorsAdd1}.
	 * @param ctx the parse tree
	 */
	void exitBooleanSimpleOperatorsAdd1(TasmParser.BooleanSimpleOperatorsAdd1Context ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#booleanSimpleOperatorsRemove1}.
	 * @param ctx the parse tree
	 */
	void enterBooleanSimpleOperatorsRemove1(TasmParser.BooleanSimpleOperatorsRemove1Context ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#booleanSimpleOperatorsRemove1}.
	 * @param ctx the parse tree
	 */
	void exitBooleanSimpleOperatorsRemove1(TasmParser.BooleanSimpleOperatorsRemove1Context ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#globalOperators}.
	 * @param ctx the parse tree
	 */
	void enterGlobalOperators(TasmParser.GlobalOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#globalOperators}.
	 * @param ctx the parse tree
	 */
	void exitGlobalOperators(TasmParser.GlobalOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#jumpOperators}.
	 * @param ctx the parse tree
	 */
	void enterJumpOperators(TasmParser.JumpOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#jumpOperators}.
	 * @param ctx the parse tree
	 */
	void exitJumpOperators(TasmParser.JumpOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#functionOperators}.
	 * @param ctx the parse tree
	 */
	void enterFunctionOperators(TasmParser.FunctionOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#functionOperators}.
	 * @param ctx the parse tree
	 */
	void exitFunctionOperators(TasmParser.FunctionOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TasmParser#endOperator}.
	 * @param ctx the parse tree
	 */
	void enterEndOperator(TasmParser.EndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TasmParser#endOperator}.
	 * @param ctx the parse tree
	 */
	void exitEndOperator(TasmParser.EndOperatorContext ctx);
}