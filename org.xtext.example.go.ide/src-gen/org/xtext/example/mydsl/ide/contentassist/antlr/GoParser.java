/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalGoParser;
import org.xtext.example.mydsl.services.GoGrammarAccess;

public class GoParser extends AbstractContentAssistParser {

	@Inject
	private GoGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalGoParser createParser() {
		InternalGoParser result = new InternalGoParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTopLevelDeclAccess().getAlternatives(), "rule__TopLevelDecl__Alternatives");
					put(grammarAccess.getKEYWORDSAccess().getAlternatives(), "rule__KEYWORDS__Alternatives");
					put(grammarAccess.getIDENTIFIERAccess().getAlternatives_1(), "rule__IDENTIFIER__Alternatives_1");
					put(grammarAccess.getINT_LITAccess().getAlternatives(), "rule__INT_LIT__Alternatives");
					put(grammarAccess.getFLOAT_LITAccess().getAlternatives(), "rule__FLOAT_LIT__Alternatives");
					put(grammarAccess.getIMAGINARY_LITAccess().getAlternatives_0(), "rule__IMAGINARY_LIT__Alternatives_0");
					put(grammarAccess.getRUNE_LITAccess().getAlternatives_1(), "rule__RUNE_LIT__Alternatives_1");
					put(grammarAccess.getSTRING_LITAccess().getAlternatives(), "rule__STRING_LIT__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getTypeNameAccess().getAlternatives(), "rule__TypeName__Alternatives");
					put(grammarAccess.getTypeLitAccess().getAlternatives(), "rule__TypeLit__Alternatives");
					put(grammarAccess.getFieldDeclAccess().getAlternatives_1(), "rule__FieldDecl__Alternatives_1");
					put(grammarAccess.getResultAccess().getAlternatives(), "rule__Result__Alternatives");
					put(grammarAccess.getMethodSpecAccess().getAlternatives(), "rule__MethodSpec__Alternatives");
					put(grammarAccess.getChannelTypeAccess().getAlternatives_0(), "rule__ChannelType__Alternatives_0");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
					put(grammarAccess.getSimpleStmtAccess().getAlternatives(), "rule__SimpleStmt__Alternatives");
					put(grammarAccess.getIfStmtAccess().getAlternatives_4_1(), "rule__IfStmt__Alternatives_4_1");
					put(grammarAccess.getSwitchStmtAccess().getAlternatives(), "rule__SwitchStmt__Alternatives");
					put(grammarAccess.getForStmtAccess().getAlternatives_1(), "rule__ForStmt__Alternatives_1");
					put(grammarAccess.getConstDeclAccess().getAlternatives_2(), "rule__ConstDecl__Alternatives_2");
					put(grammarAccess.getTypeDeclAccess().getAlternatives_2(), "rule__TypeDecl__Alternatives_2");
					put(grammarAccess.getTypeSpecAccess().getAlternatives(), "rule__TypeSpec__Alternatives");
					put(grammarAccess.getVarDeclAccess().getAlternatives_2(), "rule__VarDecl__Alternatives_2");
					put(grammarAccess.getVarSpecAccess().getAlternatives_1(), "rule__VarSpec__Alternatives_1");
					put(grammarAccess.getIncDecStmtAccess().getAlternatives_1(), "rule__IncDecStmt__Alternatives_1");
					put(grammarAccess.getExprSwitchCaseAccess().getAlternatives(), "rule__ExprSwitchCase__Alternatives");
					put(grammarAccess.getTypeSwitchCaseAccess().getAlternatives(), "rule__TypeSwitchCase__Alternatives");
					put(grammarAccess.getCommCaseAccess().getAlternatives(), "rule__CommCase__Alternatives");
					put(grammarAccess.getCommCaseAccess().getAlternatives_0_2(), "rule__CommCase__Alternatives_0_2");
					put(grammarAccess.getRecvStmtAccess().getAlternatives_0(), "rule__RecvStmt__Alternatives_0");
					put(grammarAccess.getRangeClauseAccess().getAlternatives_0(), "rule__RangeClause__Alternatives_0");
					put(grammarAccess.getUnaryExprAccess().getAlternatives(), "rule__UnaryExpr__Alternatives");
					put(grammarAccess.getPrimaryExprAccess().getAlternatives(), "rule__PrimaryExpr__Alternatives");
					put(grammarAccess.getPrimaryExpr2Access().getAlternatives_1(), "rule__PrimaryExpr2__Alternatives_1");
					put(grammarAccess.getOperandAccess().getAlternatives(), "rule__Operand__Alternatives");
					put(grammarAccess.getSliceAccess().getAlternatives(), "rule__Slice__Alternatives");
					put(grammarAccess.getArgumentsAccess().getAlternatives_2_0(), "rule__Arguments__Alternatives_2_0");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getLiteralTypeAccess().getAlternatives(), "rule__LiteralType__Alternatives");
					put(grammarAccess.getKeyAccess().getAlternatives(), "rule__Key__Alternatives");
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getBasicLitAccess().getAlternatives(), "rule__BasicLit__Alternatives");
					put(grammarAccess.getOperandNameAccess().getAlternatives(), "rule__OperandName__Alternatives");
					put(grammarAccess.getImportDeclAccess().getAlternatives_2(), "rule__ImportDecl__Alternatives_2");
					put(grammarAccess.getImportSpecAccess().getAlternatives_0(), "rule__ImportSpec__Alternatives_0");
					put(grammarAccess.getCompilation_initialAccess().getGroup(), "rule__Compilation_initial__Group__0");
					put(grammarAccess.getCompilation_initialAccess().getGroup_3(), "rule__Compilation_initial__Group_3__0");
					put(grammarAccess.getCompilation_initialAccess().getGroup_4(), "rule__Compilation_initial__Group_4__0");
					put(grammarAccess.getMethodDeclAccess().getGroup(), "rule__MethodDecl__Group__0");
					put(grammarAccess.getFunctionDeclAccess().getGroup(), "rule__FunctionDecl__Group__0");
					put(grammarAccess.getPackageClauseAccess().getGroup(), "rule__PackageClause__Group__0");
					put(grammarAccess.getIDENTIFIERAccess().getGroup(), "rule__IDENTIFIER__Group__0");
					put(grammarAccess.getFLOAT_LITAccess().getGroup_0(), "rule__FLOAT_LIT__Group_0__0");
					put(grammarAccess.getFLOAT_LITAccess().getGroup_1(), "rule__FLOAT_LIT__Group_1__0");
					put(grammarAccess.getFLOAT_LITAccess().getGroup_2(), "rule__FLOAT_LIT__Group_2__0");
					put(grammarAccess.getIMAGINARY_LITAccess().getGroup(), "rule__IMAGINARY_LIT__Group__0");
					put(grammarAccess.getRUNE_LITAccess().getGroup(), "rule__RUNE_LIT__Group__0");
					put(grammarAccess.getTypeAccess().getGroup_0(), "rule__Type__Group_0__0");
					put(grammarAccess.getTypeAccess().getGroup_2(), "rule__Type__Group_2__0");
					put(grammarAccess.getQualifiedIdentAccess().getGroup(), "rule__QualifiedIdent__Group__0");
					put(grammarAccess.getArrayTypeAccess().getGroup(), "rule__ArrayType__Group__0");
					put(grammarAccess.getSliceTypeAccess().getGroup(), "rule__SliceType__Group__0");
					put(grammarAccess.getStructTypeAccess().getGroup(), "rule__StructType__Group__0");
					put(grammarAccess.getStructTypeAccess().getGroup_3(), "rule__StructType__Group_3__0");
					put(grammarAccess.getFieldDeclAccess().getGroup(), "rule__FieldDecl__Group__0");
					put(grammarAccess.getFieldDeclAccess().getGroup_1_0(), "rule__FieldDecl__Group_1_0__0");
					put(grammarAccess.getIdentifierListAccess().getGroup(), "rule__IdentifierList__Group__0");
					put(grammarAccess.getIdentifierListAccess().getGroup_1(), "rule__IdentifierList__Group_1__0");
					put(grammarAccess.getEmbeddedFieldAccess().getGroup(), "rule__EmbeddedField__Group__0");
					put(grammarAccess.getPointerTypeAccess().getGroup(), "rule__PointerType__Group__0");
					put(grammarAccess.getFunctionTypeAccess().getGroup(), "rule__FunctionType__Group__0");
					put(grammarAccess.getSignatureAccess().getGroup(), "rule__Signature__Group__0");
					put(grammarAccess.getParametersAccess().getGroup(), "rule__Parameters__Group__0");
					put(grammarAccess.getParametersAccess().getGroup_2(), "rule__Parameters__Group_2__0");
					put(grammarAccess.getParameterListAccess().getGroup(), "rule__ParameterList__Group__0");
					put(grammarAccess.getParameterListAccess().getGroup_1(), "rule__ParameterList__Group_1__0");
					put(grammarAccess.getParameterDeclAccess().getGroup(), "rule__ParameterDecl__Group__0");
					put(grammarAccess.getInterfaceTypeAccess().getGroup(), "rule__InterfaceType__Group__0");
					put(grammarAccess.getInterfaceTypeAccess().getGroup_3(), "rule__InterfaceType__Group_3__0");
					put(grammarAccess.getMethodSpecAccess().getGroup_0(), "rule__MethodSpec__Group_0__0");
					put(grammarAccess.getMethodSpecAccess().getGroup_1(), "rule__MethodSpec__Group_1__0");
					put(grammarAccess.getMapTypeAccess().getGroup(), "rule__MapType__Group__0");
					put(grammarAccess.getChannelTypeAccess().getGroup(), "rule__ChannelType__Group__0");
					put(grammarAccess.getChannelTypeAccess().getGroup_0_0(), "rule__ChannelType__Group_0_0__0");
					put(grammarAccess.getChannelTypeAccess().getGroup_0_1(), "rule__ChannelType__Group_0_1__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getStatementListAccess().getGroup(), "rule__StatementList__Group__0");
					put(grammarAccess.getStatementListAccess().getGroup_1(), "rule__StatementList__Group_1__0");
					put(grammarAccess.getStatementAccess().getGroup_0(), "rule__Statement__Group_0__0");
					put(grammarAccess.getLabeledStmtAccess().getGroup(), "rule__LabeledStmt__Group__0");
					put(grammarAccess.getSimpleStmtAccess().getGroup_0(), "rule__SimpleStmt__Group_0__0");
					put(grammarAccess.getGoStmtAccess().getGroup(), "rule__GoStmt__Group__0");
					put(grammarAccess.getReturnStmtAccess().getGroup(), "rule__ReturnStmt__Group__0");
					put(grammarAccess.getBreakStmtAccess().getGroup(), "rule__BreakStmt__Group__0");
					put(grammarAccess.getContinueStmtAccess().getGroup(), "rule__ContinueStmt__Group__0");
					put(grammarAccess.getGotoStmtAccess().getGroup(), "rule__GotoStmt__Group__0");
					put(grammarAccess.getIfStmtAccess().getGroup(), "rule__IfStmt__Group__0");
					put(grammarAccess.getIfStmtAccess().getGroup_1(), "rule__IfStmt__Group_1__0");
					put(grammarAccess.getIfStmtAccess().getGroup_4(), "rule__IfStmt__Group_4__0");
					put(grammarAccess.getSelectStmtAccess().getGroup(), "rule__SelectStmt__Group__0");
					put(grammarAccess.getForStmtAccess().getGroup(), "rule__ForStmt__Group__0");
					put(grammarAccess.getDeferStmtAccess().getGroup(), "rule__DeferStmt__Group__0");
					put(grammarAccess.getConstDeclAccess().getGroup(), "rule__ConstDecl__Group__0");
					put(grammarAccess.getConstDeclAccess().getGroup_2_1(), "rule__ConstDecl__Group_2_1__0");
					put(grammarAccess.getConstDeclAccess().getGroup_2_1_1(), "rule__ConstDecl__Group_2_1_1__0");
					put(grammarAccess.getConstSpecAccess().getGroup(), "rule__ConstSpec__Group__0");
					put(grammarAccess.getConstSpecAccess().getGroup_1(), "rule__ConstSpec__Group_1__0");
					put(grammarAccess.getTypeDeclAccess().getGroup(), "rule__TypeDecl__Group__0");
					put(grammarAccess.getTypeDeclAccess().getGroup_2_1(), "rule__TypeDecl__Group_2_1__0");
					put(grammarAccess.getTypeDeclAccess().getGroup_2_1_1(), "rule__TypeDecl__Group_2_1_1__0");
					put(grammarAccess.getTypeDefAccess().getGroup(), "rule__TypeDef__Group__0");
					put(grammarAccess.getAliasDeclAccess().getGroup(), "rule__AliasDecl__Group__0");
					put(grammarAccess.getVarDeclAccess().getGroup(), "rule__VarDecl__Group__0");
					put(grammarAccess.getVarDeclAccess().getGroup_2_1(), "rule__VarDecl__Group_2_1__0");
					put(grammarAccess.getVarDeclAccess().getGroup_2_1_1(), "rule__VarDecl__Group_2_1_1__0");
					put(grammarAccess.getVarSpecAccess().getGroup(), "rule__VarSpec__Group__0");
					put(grammarAccess.getVarSpecAccess().getGroup_1_0(), "rule__VarSpec__Group_1_0__0");
					put(grammarAccess.getVarSpecAccess().getGroup_1_0_1(), "rule__VarSpec__Group_1_0_1__0");
					put(grammarAccess.getVarSpecAccess().getGroup_1_1(), "rule__VarSpec__Group_1_1__0");
					put(grammarAccess.getSendStmtAccess().getGroup(), "rule__SendStmt__Group__0");
					put(grammarAccess.getIncDecStmtAccess().getGroup(), "rule__IncDecStmt__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getShortVarDeclAccess().getGroup(), "rule__ShortVarDecl__Group__0");
					put(grammarAccess.getExprSwitchStmtAccess().getGroup(), "rule__ExprSwitchStmt__Group__0");
					put(grammarAccess.getExprSwitchStmtAccess().getGroup_2(), "rule__ExprSwitchStmt__Group_2__0");
					put(grammarAccess.getExprCaseClauseAccess().getGroup(), "rule__ExprCaseClause__Group__0");
					put(grammarAccess.getExprSwitchCaseAccess().getGroup_0(), "rule__ExprSwitchCase__Group_0__0");
					put(grammarAccess.getExprSwitchCaseAccess().getGroup_1(), "rule__ExprSwitchCase__Group_1__0");
					put(grammarAccess.getTypeSwitchStmtAccess().getGroup(), "rule__TypeSwitchStmt__Group__0");
					put(grammarAccess.getTypeSwitchStmtAccess().getGroup_1(), "rule__TypeSwitchStmt__Group_1__0");
					put(grammarAccess.getTypeSwitchGuardAccess().getGroup(), "rule__TypeSwitchGuard__Group__0");
					put(grammarAccess.getTypeSwitchGuardAccess().getGroup_0(), "rule__TypeSwitchGuard__Group_0__0");
					put(grammarAccess.getTypeCaseClauseAccess().getGroup(), "rule__TypeCaseClause__Group__0");
					put(grammarAccess.getTypeSwitchCaseAccess().getGroup_0(), "rule__TypeSwitchCase__Group_0__0");
					put(grammarAccess.getTypeSwitchCaseAccess().getGroup_1(), "rule__TypeSwitchCase__Group_1__0");
					put(grammarAccess.getTypeListAccess().getGroup(), "rule__TypeList__Group__0");
					put(grammarAccess.getTypeListAccess().getGroup_1(), "rule__TypeList__Group_1__0");
					put(grammarAccess.getCommClauseAccess().getGroup(), "rule__CommClause__Group__0");
					put(grammarAccess.getCommCaseAccess().getGroup_0(), "rule__CommCase__Group_0__0");
					put(grammarAccess.getCommCaseAccess().getGroup_1(), "rule__CommCase__Group_1__0");
					put(grammarAccess.getRecvStmtAccess().getGroup(), "rule__RecvStmt__Group__0");
					put(grammarAccess.getRecvStmtAccess().getGroup_0_0(), "rule__RecvStmt__Group_0_0__0");
					put(grammarAccess.getRecvStmtAccess().getGroup_0_1(), "rule__RecvStmt__Group_0_1__0");
					put(grammarAccess.getForClauseAccess().getGroup(), "rule__ForClause__Group__0");
					put(grammarAccess.getRangeClauseAccess().getGroup(), "rule__RangeClause__Group__0");
					put(grammarAccess.getRangeClauseAccess().getGroup_0_0(), "rule__RangeClause__Group_0_0__0");
					put(grammarAccess.getRangeClauseAccess().getGroup_0_1(), "rule__RangeClause__Group_0_1__0");
					put(grammarAccess.getExpressionListAccess().getGroup(), "rule__ExpressionList__Group__0");
					put(grammarAccess.getExpressionListAccess().getGroup_1(), "rule__ExpressionList__Group_1__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpression2Access().getGroup(), "rule__Expression2__Group__0");
					put(grammarAccess.getExpression2Access().getGroup_1(), "rule__Expression2__Group_1__0");
					put(grammarAccess.getUnaryExprAccess().getGroup_1(), "rule__UnaryExpr__Group_1__0");
					put(grammarAccess.getPrimaryExprAccess().getGroup_0(), "rule__PrimaryExpr__Group_0__0");
					put(grammarAccess.getPrimaryExprAccess().getGroup_1(), "rule__PrimaryExpr__Group_1__0");
					put(grammarAccess.getPrimaryExprAccess().getGroup_2(), "rule__PrimaryExpr__Group_2__0");
					put(grammarAccess.getPrimaryExpr2Access().getGroup(), "rule__PrimaryExpr2__Group__0");
					put(grammarAccess.getPrimaryExpr2Access().getGroup_1_0(), "rule__PrimaryExpr2__Group_1_0__0");
					put(grammarAccess.getPrimaryExpr2Access().getGroup_1_1(), "rule__PrimaryExpr2__Group_1_1__0");
					put(grammarAccess.getPrimaryExpr2Access().getGroup_1_2(), "rule__PrimaryExpr2__Group_1_2__0");
					put(grammarAccess.getPrimaryExpr2Access().getGroup_1_3(), "rule__PrimaryExpr2__Group_1_3__0");
					put(grammarAccess.getPrimaryExpr2Access().getGroup_1_4(), "rule__PrimaryExpr2__Group_1_4__0");
					put(grammarAccess.getOperandAccess().getGroup_0(), "rule__Operand__Group_0__0");
					put(grammarAccess.getOperandAccess().getGroup_2(), "rule__Operand__Group_2__0");
					put(grammarAccess.getConversionAccess().getGroup(), "rule__Conversion__Group__0");
					put(grammarAccess.getMethodExprAccess().getGroup(), "rule__MethodExpr__Group__0");
					put(grammarAccess.getSelectorAccess().getGroup(), "rule__Selector__Group__0");
					put(grammarAccess.getIndexAccess().getGroup(), "rule__Index__Group__0");
					put(grammarAccess.getSliceAccess().getGroup_0(), "rule__Slice__Group_0__0");
					put(grammarAccess.getSliceAccess().getGroup_1(), "rule__Slice__Group_1__0");
					put(grammarAccess.getTypeAssertionAccess().getGroup(), "rule__TypeAssertion__Group__0");
					put(grammarAccess.getArgumentsAccess().getGroup(), "rule__Arguments__Group__0");
					put(grammarAccess.getArgumentsAccess().getGroup_2(), "rule__Arguments__Group_2__0");
					put(grammarAccess.getArgumentsAccess().getGroup_2_0_1(), "rule__Arguments__Group_2_0_1__0");
					put(grammarAccess.getArgumentsAccess().getGroup_2_0_1_1(), "rule__Arguments__Group_2_0_1_1__0");
					put(grammarAccess.getLiteralAccess().getGroup_0(), "rule__Literal__Group_0__0");
					put(grammarAccess.getFunctionLitAccess().getGroup(), "rule__FunctionLit__Group__0");
					put(grammarAccess.getCompositeLitAccess().getGroup(), "rule__CompositeLit__Group__0");
					put(grammarAccess.getLiteralTypeAccess().getGroup_0(), "rule__LiteralType__Group_0__0");
					put(grammarAccess.getLiteralTypeAccess().getGroup_2(), "rule__LiteralType__Group_2__0");
					put(grammarAccess.getLiteralValueAccess().getGroup(), "rule__LiteralValue__Group__0");
					put(grammarAccess.getLiteralValueAccess().getGroup_2(), "rule__LiteralValue__Group_2__0");
					put(grammarAccess.getElementListAccess().getGroup(), "rule__ElementList__Group__0");
					put(grammarAccess.getElementListAccess().getGroup_1(), "rule__ElementList__Group_1__0");
					put(grammarAccess.getKeyedElementAccess().getGroup(), "rule__KeyedElement__Group__0");
					put(grammarAccess.getKeyedElementAccess().getGroup_0(), "rule__KeyedElement__Group_0__0");
					put(grammarAccess.getKeyAccess().getGroup_0(), "rule__Key__Group_0__0");
					put(grammarAccess.getImportDeclAccess().getGroup(), "rule__ImportDecl__Group__0");
					put(grammarAccess.getImportDeclAccess().getGroup_2_1(), "rule__ImportDecl__Group_2_1__0");
					put(grammarAccess.getImportDeclAccess().getGroup_2_1_1(), "rule__ImportDecl__Group_2_1_1__0");
					put(grammarAccess.getImportSpecAccess().getGroup(), "rule__ImportSpec__Group__0");
					put(grammarAccess.getModelAccess().getGreetingsAssignment(), "rule__Model__GreetingsAssignment");
					put(grammarAccess.getCompilation_initialAccess().getPackAssignment_1(), "rule__Compilation_initial__PackAssignment_1");
					put(grammarAccess.getCompilation_initialAccess().getImportdeclAssignment_3_0(), "rule__Compilation_initial__ImportdeclAssignment_3_0");
					put(grammarAccess.getCompilation_initialAccess().getToplevelAssignment_4_0(), "rule__Compilation_initial__ToplevelAssignment_4_0");
					put(grammarAccess.getMethodDeclAccess().getSignatureAssignment_3(), "rule__MethodDecl__SignatureAssignment_3");
					put(grammarAccess.getMethodDeclAccess().getBodyAssignment_4(), "rule__MethodDecl__BodyAssignment_4");
					put(grammarAccess.getFunctionDeclAccess().getSignatureAssignment_2(), "rule__FunctionDecl__SignatureAssignment_2");
					put(grammarAccess.getFunctionDeclAccess().getBodyAssignment_3(), "rule__FunctionDecl__BodyAssignment_3");
					put(grammarAccess.getPackageClauseAccess().getPackAssignment_1(), "rule__PackageClause__PackAssignment_1");
					put(grammarAccess.getArrayTypeAccess().getElemtypeAssignment_3(), "rule__ArrayType__ElemtypeAssignment_3");
					put(grammarAccess.getSliceTypeAccess().getElemtypeAssignment_2(), "rule__SliceType__ElemtypeAssignment_2");
					put(grammarAccess.getStructTypeAccess().getFielddeclAssignment_3_0(), "rule__StructType__FielddeclAssignment_3_0");
					put(grammarAccess.getFieldDeclAccess().getIndentifierLAssignment_1_0_0(), "rule__FieldDecl__IndentifierLAssignment_1_0_0");
					put(grammarAccess.getFieldDeclAccess().getTypeAssignment_1_0_1(), "rule__FieldDecl__TypeAssignment_1_0_1");
					put(grammarAccess.getPointerTypeAccess().getBasetypeAssignment_1(), "rule__PointerType__BasetypeAssignment_1");
					put(grammarAccess.getSignatureAccess().getResultAssignment_2(), "rule__Signature__ResultAssignment_2");
					put(grammarAccess.getParametersAccess().getParameterlistAssignment_2_0(), "rule__Parameters__ParameterlistAssignment_2_0");
					put(grammarAccess.getParameterListAccess().getParameterdeclAssignment_1_1(), "rule__ParameterList__ParameterdeclAssignment_1_1");
					put(grammarAccess.getParameterDeclAccess().getIndentifierLAssignment_0(), "rule__ParameterDecl__IndentifierLAssignment_0");
					put(grammarAccess.getParameterDeclAccess().getTypeAssignment_2(), "rule__ParameterDecl__TypeAssignment_2");
					put(grammarAccess.getInterfaceTypeAccess().getMethodspecAssignment_3_0(), "rule__InterfaceType__MethodspecAssignment_3_0");
					put(grammarAccess.getMapTypeAccess().getKeytypeAssignment_2(), "rule__MapType__KeytypeAssignment_2");
					put(grammarAccess.getMapTypeAccess().getElemtypeAssignment_4(), "rule__MapType__ElemtypeAssignment_4");
					put(grammarAccess.getChannelTypeAccess().getElemtypeAssignment_1(), "rule__ChannelType__ElemtypeAssignment_1");
					put(grammarAccess.getStatementListAccess().getStatmentAssignment_1_0(), "rule__StatementList__StatmentAssignment_1_0");
					put(grammarAccess.getStatementAccess().getDeclarationAssignment_0_1(), "rule__Statement__DeclarationAssignment_0_1");
					put(grammarAccess.getStatementAccess().getLabestAssignment_1(), "rule__Statement__LabestAssignment_1");
					put(grammarAccess.getStatementAccess().getSimplestAssignment_2(), "rule__Statement__SimplestAssignment_2");
					put(grammarAccess.getStatementAccess().getGotstAssignment_3(), "rule__Statement__GotstAssignment_3");
					put(grammarAccess.getStatementAccess().getBreakstAssignment_5(), "rule__Statement__BreakstAssignment_5");
					put(grammarAccess.getStatementAccess().getContinuestAssignment_6(), "rule__Statement__ContinuestAssignment_6");
					put(grammarAccess.getStatementAccess().getGotostAssignment_7(), "rule__Statement__GotostAssignment_7");
					put(grammarAccess.getStatementAccess().getFalltstAssignment_8(), "rule__Statement__FalltstAssignment_8");
					put(grammarAccess.getStatementAccess().getBlock1Assignment_9(), "rule__Statement__Block1Assignment_9");
					put(grammarAccess.getStatementAccess().getIfAssignment_10(), "rule__Statement__IfAssignment_10");
					put(grammarAccess.getStatementAccess().getSwitchAssignment_11(), "rule__Statement__SwitchAssignment_11");
					put(grammarAccess.getStatementAccess().getSelectstAssignment_12(), "rule__Statement__SelectstAssignment_12");
					put(grammarAccess.getStatementAccess().getForstAssignment_13(), "rule__Statement__ForstAssignment_13");
					put(grammarAccess.getStatementAccess().getDeferstAssignment_14(), "rule__Statement__DeferstAssignment_14");
					put(grammarAccess.getLabeledStmtAccess().getStatementAssignment_2(), "rule__LabeledStmt__StatementAssignment_2");
					put(grammarAccess.getReturnStmtAccess().getExpressionlistAssignment_2(), "rule__ReturnStmt__ExpressionlistAssignment_2");
					put(grammarAccess.getIfStmtAccess().getSimstAssignment_1_0(), "rule__IfStmt__SimstAssignment_1_0");
					put(grammarAccess.getIfStmtAccess().getExpressionAssignment_2(), "rule__IfStmt__ExpressionAssignment_2");
					put(grammarAccess.getIfStmtAccess().getBlockAssignment_3(), "rule__IfStmt__BlockAssignment_3");
					put(grammarAccess.getIfStmtAccess().getIfsAssignment_4_1_0(), "rule__IfStmt__IfsAssignment_4_1_0");
					put(grammarAccess.getIfStmtAccess().getBlock2Assignment_4_1_1(), "rule__IfStmt__Block2Assignment_4_1_1");
					put(grammarAccess.getSelectStmtAccess().getCommclauseAssignment_3(), "rule__SelectStmt__CommclauseAssignment_3");
					put(grammarAccess.getForStmtAccess().getConditionAssignment_1_0(), "rule__ForStmt__ConditionAssignment_1_0");
					put(grammarAccess.getForStmtAccess().getForAssignment_1_1(), "rule__ForStmt__ForAssignment_1_1");
					put(grammarAccess.getForStmtAccess().getRangeAssignment_1_2(), "rule__ForStmt__RangeAssignment_1_2");
					put(grammarAccess.getForStmtAccess().getBlockAssignment_2(), "rule__ForStmt__BlockAssignment_2");
					put(grammarAccess.getConstDeclAccess().getConstspecAssignment_2_0(), "rule__ConstDecl__ConstspecAssignment_2_0");
					put(grammarAccess.getConstDeclAccess().getConstspec2Assignment_2_1_1_0(), "rule__ConstDecl__Constspec2Assignment_2_1_1_0");
					put(grammarAccess.getConstSpecAccess().getExpressionlistAssignment_1_2(), "rule__ConstSpec__ExpressionlistAssignment_1_2");
					put(grammarAccess.getTypeDeclAccess().getTypespecAssignment_2_0(), "rule__TypeDecl__TypespecAssignment_2_0");
					put(grammarAccess.getTypeDeclAccess().getTypespec2Assignment_2_1_1_0(), "rule__TypeDecl__Typespec2Assignment_2_1_1_0");
					put(grammarAccess.getVarDeclAccess().getVarspecAssignment_2_0(), "rule__VarDecl__VarspecAssignment_2_0");
					put(grammarAccess.getVarDeclAccess().getVarspec2Assignment_2_1_1_0(), "rule__VarDecl__Varspec2Assignment_2_1_1_0");
					put(grammarAccess.getVarSpecAccess().getExpressionlistAssignment_1_0_1_1(), "rule__VarSpec__ExpressionlistAssignment_1_0_1_1");
					put(grammarAccess.getSendStmtAccess().getChAssignment_0(), "rule__SendStmt__ChAssignment_0");
					put(grammarAccess.getSendStmtAccess().getExpressionAssignment_2(), "rule__SendStmt__ExpressionAssignment_2");
					put(grammarAccess.getAssignmentAccess().getExpressionlistAssignment_0(), "rule__Assignment__ExpressionlistAssignment_0");
					put(grammarAccess.getAssignmentAccess().getExpressionlist2Assignment_2(), "rule__Assignment__Expressionlist2Assignment_2");
					put(grammarAccess.getExprSwitchStmtAccess().getSimplestmtAssignment_2_0(), "rule__ExprSwitchStmt__SimplestmtAssignment_2_0");
					put(grammarAccess.getExprSwitchStmtAccess().getExpressionAssignment_3(), "rule__ExprSwitchStmt__ExpressionAssignment_3");
					put(grammarAccess.getExprSwitchStmtAccess().getExprcaseAssignment_5(), "rule__ExprSwitchStmt__ExprcaseAssignment_5");
					put(grammarAccess.getExprCaseClauseAccess().getStatementlistAssignment_2(), "rule__ExprCaseClause__StatementlistAssignment_2");
					put(grammarAccess.getExprSwitchCaseAccess().getExpressionlistAssignment_0_2(), "rule__ExprSwitchCase__ExpressionlistAssignment_0_2");
					put(grammarAccess.getTypeSwitchStmtAccess().getTypesgAssignment_2(), "rule__TypeSwitchStmt__TypesgAssignment_2");
					put(grammarAccess.getTypeSwitchStmtAccess().getTypeccAssignment_4(), "rule__TypeSwitchStmt__TypeccAssignment_4");
					put(grammarAccess.getTypeCaseClauseAccess().getStatementlistAssignment_2(), "rule__TypeCaseClause__StatementlistAssignment_2");
					put(grammarAccess.getTypeSwitchCaseAccess().getTypelistAssignment_0_2(), "rule__TypeSwitchCase__TypelistAssignment_0_2");
					put(grammarAccess.getTypeListAccess().getTypeAssignment_0(), "rule__TypeList__TypeAssignment_0");
					put(grammarAccess.getTypeListAccess().getType2Assignment_1_1(), "rule__TypeList__Type2Assignment_1_1");
					put(grammarAccess.getCommClauseAccess().getStatementlist2Assignment_2(), "rule__CommClause__Statementlist2Assignment_2");
					put(grammarAccess.getCommCaseAccess().getSendstmtAssignment_0_2_0(), "rule__CommCase__SendstmtAssignment_0_2_0");
					put(grammarAccess.getCommCaseAccess().getRecvstmtAssignment_0_2_1(), "rule__CommCase__RecvstmtAssignment_0_2_1");
					put(grammarAccess.getRecvStmtAccess().getRecvexprAssignment_1(), "rule__RecvStmt__RecvexprAssignment_1");
					put(grammarAccess.getForClauseAccess().getConditionAssignment_2(), "rule__ForClause__ConditionAssignment_2");
					put(grammarAccess.getForClauseAccess().getPoststmtAssignment_4(), "rule__ForClause__PoststmtAssignment_4");
					put(grammarAccess.getRangeClauseAccess().getExpressionlistAssignment_0_0_0(), "rule__RangeClause__ExpressionlistAssignment_0_0_0");
					put(grammarAccess.getRangeClauseAccess().getExpressionAssignment_2(), "rule__RangeClause__ExpressionAssignment_2");
					put(grammarAccess.getExpressionListAccess().getExpression2Assignment_1_1(), "rule__ExpressionList__Expression2Assignment_1_1");
					put(grammarAccess.getExpressionAccess().getExpAssignment_1(), "rule__Expression__ExpAssignment_1");
					put(grammarAccess.getExpression2Access().getExpressionAssignment_1_1(), "rule__Expression2__ExpressionAssignment_1_1");
					put(grammarAccess.getExpression2Access().getExpression2Assignment_1_2(), "rule__Expression2__Expression2Assignment_1_2");
					put(grammarAccess.getPrimaryExprAccess().getPrAssignment_0_1(), "rule__PrimaryExpr__PrAssignment_0_1");
					put(grammarAccess.getPrimaryExprAccess().getPrAssignment_1_1(), "rule__PrimaryExpr__PrAssignment_1_1");
					put(grammarAccess.getPrimaryExprAccess().getPrAssignment_2_1(), "rule__PrimaryExpr__PrAssignment_2_1");
					put(grammarAccess.getPrimaryExpr2Access().getPrAssignment_1_0_1(), "rule__PrimaryExpr2__PrAssignment_1_0_1");
					put(grammarAccess.getPrimaryExpr2Access().getIndexAssignment_1_1_0(), "rule__PrimaryExpr2__IndexAssignment_1_1_0");
					put(grammarAccess.getPrimaryExpr2Access().getPrAssignment_1_1_1(), "rule__PrimaryExpr2__PrAssignment_1_1_1");
					put(grammarAccess.getPrimaryExpr2Access().getSliceAssignment_1_2_0(), "rule__PrimaryExpr2__SliceAssignment_1_2_0");
					put(grammarAccess.getPrimaryExpr2Access().getPrAssignment_1_2_1(), "rule__PrimaryExpr2__PrAssignment_1_2_1");
					put(grammarAccess.getPrimaryExpr2Access().getTypeassAssignment_1_3_0(), "rule__PrimaryExpr2__TypeassAssignment_1_3_0");
					put(grammarAccess.getPrimaryExpr2Access().getPrAssignment_1_3_1(), "rule__PrimaryExpr2__PrAssignment_1_3_1");
					put(grammarAccess.getPrimaryExpr2Access().getArgumentsAssignment_1_4_0(), "rule__PrimaryExpr2__ArgumentsAssignment_1_4_0");
					put(grammarAccess.getPrimaryExpr2Access().getPrAssignment_1_4_1(), "rule__PrimaryExpr2__PrAssignment_1_4_1");
					put(grammarAccess.getOperandAccess().getLiteralAssignment_0_1(), "rule__Operand__LiteralAssignment_0_1");
					put(grammarAccess.getOperandAccess().getOperandnAssignment_1(), "rule__Operand__OperandnAssignment_1");
					put(grammarAccess.getOperandAccess().getExpressionAssignment_2_1(), "rule__Operand__ExpressionAssignment_2_1");
					put(grammarAccess.getConversionAccess().getTypeAssignment_0(), "rule__Conversion__TypeAssignment_0");
					put(grammarAccess.getConversionAccess().getExpressionAssignment_2(), "rule__Conversion__ExpressionAssignment_2");
					put(grammarAccess.getIndexAccess().getExpressionAssignment_1(), "rule__Index__ExpressionAssignment_1");
					put(grammarAccess.getSliceAccess().getExpressionAssignment_0_2(), "rule__Slice__ExpressionAssignment_0_2");
					put(grammarAccess.getSliceAccess().getExpression2Assignment_0_4(), "rule__Slice__Expression2Assignment_0_4");
					put(grammarAccess.getSliceAccess().getExpression3Assignment_1_1(), "rule__Slice__Expression3Assignment_1_1");
					put(grammarAccess.getSliceAccess().getExpression4Assignment_1_3(), "rule__Slice__Expression4Assignment_1_3");
					put(grammarAccess.getSliceAccess().getExpression5Assignment_1_5(), "rule__Slice__Expression5Assignment_1_5");
					put(grammarAccess.getArgumentsAccess().getExpressionlistAssignment_2_0_0(), "rule__Arguments__ExpressionlistAssignment_2_0_0");
					put(grammarAccess.getArgumentsAccess().getTypeAssignment_2_0_1_0(), "rule__Arguments__TypeAssignment_2_0_1_0");
					put(grammarAccess.getArgumentsAccess().getExpressionlistAssignment_2_0_1_1_1(), "rule__Arguments__ExpressionlistAssignment_2_0_1_1_1");
					put(grammarAccess.getFunctionLitAccess().getFunctionbodyAssignment_2(), "rule__FunctionLit__FunctionbodyAssignment_2");
					put(grammarAccess.getCompositeLitAccess().getLiteraltAssignment_0(), "rule__CompositeLit__LiteraltAssignment_0");
					put(grammarAccess.getCompositeLitAccess().getLiteralvAssignment_1(), "rule__CompositeLit__LiteralvAssignment_1");
					put(grammarAccess.getLiteralTypeAccess().getStructtypeAssignment_0_1(), "rule__LiteralType__StructtypeAssignment_0_1");
					put(grammarAccess.getLiteralTypeAccess().getArraytypeAssignment_1(), "rule__LiteralType__ArraytypeAssignment_1");
					put(grammarAccess.getLiteralTypeAccess().getElementypeAssignment_2_3(), "rule__LiteralType__ElementypeAssignment_2_3");
					put(grammarAccess.getLiteralTypeAccess().getSlicetypeAssignment_3(), "rule__LiteralType__SlicetypeAssignment_3");
					put(grammarAccess.getLiteralTypeAccess().getMaptypeAssignment_4(), "rule__LiteralType__MaptypeAssignment_4");
					put(grammarAccess.getLiteralTypeAccess().getTypenameAssignment_5(), "rule__LiteralType__TypenameAssignment_5");
					put(grammarAccess.getLiteralValueAccess().getElementlistAssignment_2_0(), "rule__LiteralValue__ElementlistAssignment_2_0");
					put(grammarAccess.getElementListAccess().getKeyedelementAssignment_1_1(), "rule__ElementList__KeyedelementAssignment_1_1");
					put(grammarAccess.getKeyedElementAccess().getElementAssignment_1(), "rule__KeyedElement__ElementAssignment_1");
					put(grammarAccess.getReceiverTypeAccess().getTypeAssignment(), "rule__ReceiverType__TypeAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
