// Generated from D:/文档/我在FDU/ExpertSystem/src\ExpertRule.g4 by ANTLR 4.6
package science.garzon.ExpertSystem;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpertRuleParser}.
 */
public interface ExpertRuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpertRuleParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(ExpertRuleParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpertRuleParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(ExpertRuleParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpertRuleParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(ExpertRuleParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpertRuleParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(ExpertRuleParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpertRuleParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ExpertRuleParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpertRuleParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ExpertRuleParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpertRuleParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(ExpertRuleParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpertRuleParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(ExpertRuleParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpertRuleParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ExpertRuleParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpertRuleParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ExpertRuleParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpertRuleParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(ExpertRuleParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpertRuleParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(ExpertRuleParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpertRuleParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ExpertRuleParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpertRuleParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ExpertRuleParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numDeclare}
	 * labeled alternative in {@link ExpertRuleParser#varDeclare}.
	 * @param ctx the parse tree
	 */
	void enterNumDeclare(ExpertRuleParser.NumDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numDeclare}
	 * labeled alternative in {@link ExpertRuleParser#varDeclare}.
	 * @param ctx the parse tree
	 */
	void exitNumDeclare(ExpertRuleParser.NumDeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strDeclare}
	 * labeled alternative in {@link ExpertRuleParser#varDeclare}.
	 * @param ctx the parse tree
	 */
	void enterStrDeclare(ExpertRuleParser.StrDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strDeclare}
	 * labeled alternative in {@link ExpertRuleParser#varDeclare}.
	 * @param ctx the parse tree
	 */
	void exitStrDeclare(ExpertRuleParser.StrDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpertRuleParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(ExpertRuleParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpertRuleParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(ExpertRuleParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpertRuleParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignOp(ExpertRuleParser.AssignOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpertRuleParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignOp(ExpertRuleParser.AssignOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpertRuleParser#assignExp}.
	 * @param ctx the parse tree
	 */
	void enterAssignExp(ExpertRuleParser.AssignExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpertRuleParser#assignExp}.
	 * @param ctx the parse tree
	 */
	void exitAssignExp(ExpertRuleParser.AssignExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpertRuleParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(ExpertRuleParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpertRuleParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(ExpertRuleParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link ExpertRuleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(ExpertRuleParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link ExpertRuleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(ExpertRuleParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link ExpertRuleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOrExp(ExpertRuleParser.OrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link ExpertRuleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOrExp(ExpertRuleParser.OrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opExp}
	 * labeled alternative in {@link ExpertRuleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOpExp(ExpertRuleParser.OpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opExp}
	 * labeled alternative in {@link ExpertRuleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOpExp(ExpertRuleParser.OpExpContext ctx);
}