// Generated from C:/Users/alexd/OneDrive/Ambiente de Trabalho/Compiladores/projeto_parte4/Tasm.g4 by ANTLR 4.13.1
package Tasm.g4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TasmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TasmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TasmParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(TasmParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#intOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntOperators(TasmParser.IntOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#intCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntCompare(TasmParser.IntCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#intSimpleOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntSimpleOperators(TasmParser.IntSimpleOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#intSimpleOperatorsAdd1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntSimpleOperatorsAdd1(TasmParser.IntSimpleOperatorsAdd1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#intSimpleOperatorsRemove1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntSimpleOperatorsRemove1(TasmParser.IntSimpleOperatorsRemove1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#doubleOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleOperators(TasmParser.DoubleOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#doubleSimpleOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleSimpleOperators(TasmParser.DoubleSimpleOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#doubleSimpleOperatorsAdd1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleSimpleOperatorsAdd1(TasmParser.DoubleSimpleOperatorsAdd1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#doubleSimpleOperatorsRemove1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleSimpleOperatorsRemove1(TasmParser.DoubleSimpleOperatorsRemove1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#doubleCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleCompare(TasmParser.DoubleCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#stringOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringOperators(TasmParser.StringOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#stringSimpleOperatorsAdd1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringSimpleOperatorsAdd1(TasmParser.StringSimpleOperatorsAdd1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#stringSimpleOperatorsRemove1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringSimpleOperatorsRemove1(TasmParser.StringSimpleOperatorsRemove1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#stringCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringCompare(TasmParser.StringCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#booleanOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOperators(TasmParser.BooleanOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#booleanSimpleOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanSimpleOperators(TasmParser.BooleanSimpleOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#booleanSimpleOperatorsAdd1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanSimpleOperatorsAdd1(TasmParser.BooleanSimpleOperatorsAdd1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#booleanSimpleOperatorsRemove1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanSimpleOperatorsRemove1(TasmParser.BooleanSimpleOperatorsRemove1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#globalOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalOperators(TasmParser.GlobalOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#jumpOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpOperators(TasmParser.JumpOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#functionOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionOperators(TasmParser.FunctionOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TasmParser#endOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOperator(TasmParser.EndOperatorContext ctx);
}