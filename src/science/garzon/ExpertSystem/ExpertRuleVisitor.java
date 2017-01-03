// Generated from D:/文档/我在FDU/ExpertSystem/src\ExpertRule.g4 by ANTLR 4.6
package science.garzon.ExpertSystem;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpertRuleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpertRuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpertRuleParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(ExpertRuleParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpertRuleParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(ExpertRuleParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpertRuleParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ExpertRuleParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpertRuleParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(ExpertRuleParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpertRuleParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ExpertRuleParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpertRuleParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(ExpertRuleParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpertRuleParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ExpertRuleParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numDeclare}
	 * labeled alternative in {@link ExpertRuleParser#varDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumDeclare(ExpertRuleParser.NumDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strDeclare}
	 * labeled alternative in {@link ExpertRuleParser#varDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrDeclare(ExpertRuleParser.StrDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpertRuleParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(ExpertRuleParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpertRuleParser#assignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOp(ExpertRuleParser.AssignOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpertRuleParser#assignExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExp(ExpertRuleParser.AssignExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpertRuleParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(ExpertRuleParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link ExpertRuleParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(ExpertRuleParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link ExpertRuleParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(ExpertRuleParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExp}
	 * labeled alternative in {@link ExpertRuleParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExp(ExpertRuleParser.OpExpContext ctx);
}