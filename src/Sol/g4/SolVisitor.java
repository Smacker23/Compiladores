// Generated from C:/Users/alexd/OneDrive/Ambiente de Trabalho/Compiladores/projeto_parte4/Sol.g4 by ANTLR 4.13.1
package Sol.g4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SolParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SolParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SolParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SolParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseWhile}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhile(SolParser.CaseWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseFor}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseFor(SolParser.CaseForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseIf}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseIf(SolParser.CaseIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CasePrint}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasePrint(SolParser.CasePrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseVariable}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseVariable(SolParser.CaseVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseBreak}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBreak(SolParser.CaseBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseEmpty}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseEmpty(SolParser.CaseEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseBlock}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(SolParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseReturn}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseReturn(SolParser.CaseReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDivModExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivModExpression(SolParser.MultDivModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SolParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(SolParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReelExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReelExpression(SolParser.ReelExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(SolParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(SolParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(SolParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(SolParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(SolParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesesExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpression(SolParser.ParenthesesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(SolParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdualExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdualExpression(SolParser.IdualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(SolParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(SolParser.BooleanContext ctx);
}