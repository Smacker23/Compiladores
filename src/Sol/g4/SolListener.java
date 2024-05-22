// Generated from C:/Users/alexd/OneDrive/Ambiente de Trabalho/Compiladores/projeto_parte4/Sol.g4 by ANTLR 4.13.1
package Sol.g4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SolParser}.
 */
public interface SolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SolParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SolParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SolParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SolParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SolParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaseWhile}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhile(SolParser.CaseWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaseWhile}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhile(SolParser.CaseWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaseFor}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void enterCaseFor(SolParser.CaseForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaseFor}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void exitCaseFor(SolParser.CaseForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaseIf}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void enterCaseIf(SolParser.CaseIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaseIf}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void exitCaseIf(SolParser.CaseIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CasePrint}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void enterCasePrint(SolParser.CasePrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CasePrint}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void exitCasePrint(SolParser.CasePrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaseVariable}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void enterCaseVariable(SolParser.CaseVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaseVariable}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void exitCaseVariable(SolParser.CaseVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaseBreak}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void enterCaseBreak(SolParser.CaseBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaseBreak}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void exitCaseBreak(SolParser.CaseBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaseEmpty}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void enterCaseEmpty(SolParser.CaseEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaseEmpty}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void exitCaseEmpty(SolParser.CaseEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaseBlock}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(SolParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaseBlock}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(SolParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaseReturn}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void enterCaseReturn(SolParser.CaseReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaseReturn}
	 * labeled alternative in {@link SolParser#line}.
	 * @param ctx the parse tree
	 */
	void exitCaseReturn(SolParser.CaseReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDivModExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivModExpression(SolParser.MultDivModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDivModExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivModExpression(SolParser.MultDivModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SolParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SolParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Func}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunc(SolParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunc(SolParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReelExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReelExpression(SolParser.ReelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReelExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReelExpression(SolParser.ReelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(SolParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(SolParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(SolParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(SolParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(SolParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(SolParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDouble(SolParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDouble(SolParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(SolParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(SolParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesesExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpression(SolParser.ParenthesesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesesExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpression(SolParser.ParenthesesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(SolParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(SolParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdualExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdualExpression(SolParser.IdualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdualExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdualExpression(SolParser.IdualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(SolParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(SolParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(SolParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link SolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(SolParser.BooleanContext ctx);
}