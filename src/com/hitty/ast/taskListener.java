package com.hitty.ast;// Generated from .\task.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link taskParser}.
 */
public interface taskListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link taskParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(taskParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(taskParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(taskParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(taskParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(taskParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(taskParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(taskParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(taskParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#taskDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTaskDeclaration(taskParser.TaskDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#taskDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTaskDeclaration(taskParser.TaskDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#taskBody}.
	 * @param ctx the parse tree
	 */
	void enterTaskBody(taskParser.TaskBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#taskBody}.
	 * @param ctx the parse tree
	 */
	void exitTaskBody(taskParser.TaskBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#localTaskDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTaskDeclaration(taskParser.LocalTaskDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#localTaskDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTaskDeclaration(taskParser.LocalTaskDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#localVarDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterLocalVarDeclarations(taskParser.LocalVarDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#localVarDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitLocalVarDeclarations(taskParser.LocalVarDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#localVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVarDeclaration(taskParser.LocalVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#localVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVarDeclaration(taskParser.LocalVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#localVarDeclarationSingle}.
	 * @param ctx the parse tree
	 */
	void enterLocalVarDeclarationSingle(taskParser.LocalVarDeclarationSingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#localVarDeclarationSingle}.
	 * @param ctx the parse tree
	 */
	void exitLocalVarDeclarationSingle(taskParser.LocalVarDeclarationSingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#varInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVarInitializer(taskParser.VarInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#varInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVarInitializer(taskParser.VarInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(taskParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(taskParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(taskParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(taskParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#functionModifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionModifier(taskParser.FunctionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#functionModifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionModifier(taskParser.FunctionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(taskParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(taskParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#functionCallParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParameters(taskParser.FunctionCallParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#functionCallParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParameters(taskParser.FunctionCallParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(taskParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(taskParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#blockCode}.
	 * @param ctx the parse tree
	 */
	void enterBlockCode(taskParser.BlockCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#blockCode}.
	 * @param ctx the parse tree
	 */
	void exitBlockCode(taskParser.BlockCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(taskParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(taskParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(taskParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(taskParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(taskParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(taskParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(taskParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(taskParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(taskParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(taskParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(taskParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(taskParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(taskParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(taskParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(taskParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(taskParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(taskParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(taskParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(taskParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(taskParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#localVar}.
	 * @param ctx the parse tree
	 */
	void enterLocalVar(taskParser.LocalVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#localVar}.
	 * @param ctx the parse tree
	 */
	void exitLocalVar(taskParser.LocalVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(taskParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(taskParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(taskParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(taskParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(taskParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(taskParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#invokeStatement}.
	 * @param ctx the parse tree
	 */
	void enterInvokeStatement(taskParser.InvokeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#invokeStatement}.
	 * @param ctx the parse tree
	 */
	void exitInvokeStatement(taskParser.InvokeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(taskParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(taskParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(taskParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(taskParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(taskParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(taskParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#operator1}.
	 * @param ctx the parse tree
	 */
	void enterOperator1(taskParser.Operator1Context ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#operator1}.
	 * @param ctx the parse tree
	 */
	void exitOperator1(taskParser.Operator1Context ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#operator2}.
	 * @param ctx the parse tree
	 */
	void enterOperator2(taskParser.Operator2Context ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#operator2}.
	 * @param ctx the parse tree
	 */
	void exitOperator2(taskParser.Operator2Context ctx);
}