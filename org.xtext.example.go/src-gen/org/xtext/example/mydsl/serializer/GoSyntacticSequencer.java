/*
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.GoGrammarAccess;

@SuppressWarnings("all")
public class GoSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GoGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Arguments_CommaKeyword_2_2_q;
	protected AbstractElementAlias match_Arguments_FullStopFullStopFullStopKeyword_2_1_q;
	protected AbstractElementAlias match_ChannelType___ChanKeyword_0_0_0_LessThanSignHyphenMinusKeyword_0_0_1_q___or___LessThanSignHyphenMinusKeyword_0_1_0_ChanKeyword_0_1_1__;
	protected AbstractElementAlias match_ConstDecl_SemicolonKeyword_2_1_1_1_q;
	protected AbstractElementAlias match_Conversion_CommaKeyword_4_q;
	protected AbstractElementAlias match_ElementList_CommaKeyword_1_0_q;
	protected AbstractElementAlias match_ExprSwitchStmt_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_ImportSpec___FullStopKeyword_0_0_or_IDENTIFIERParserRuleCall_0_1__q;
	protected AbstractElementAlias match_InterfaceType_SemicolonKeyword_3_1_q;
	protected AbstractElementAlias match_LiteralValue_CommaKeyword_2_1_q;
	protected AbstractElementAlias match_ParameterDecl_FullStopFullStopFullStopKeyword_0_2_q;
	protected AbstractElementAlias match_ParameterDecl_FullStopFullStopFullStopKeyword_1_1_q;
	protected AbstractElementAlias match_StatementList___CommaKeyword_1_1_1_or_SemicolonKeyword_1_1_0__q;
	protected AbstractElementAlias match_StructType_SemicolonKeyword_3_1_q;
	protected AbstractElementAlias match_TypeSwitchStmt_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_VarDecl_SemicolonKeyword_2_1_1_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GoGrammarAccess) access;
		match_Arguments_CommaKeyword_2_2_q = new TokenAlias(false, true, grammarAccess.getArgumentsAccess().getCommaKeyword_2_2());
		match_Arguments_FullStopFullStopFullStopKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getArgumentsAccess().getFullStopFullStopFullStopKeyword_2_1());
		match_ChannelType___ChanKeyword_0_0_0_LessThanSignHyphenMinusKeyword_0_0_1_q___or___LessThanSignHyphenMinusKeyword_0_1_0_ChanKeyword_0_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getChannelTypeAccess().getChanKeyword_0_0_0()), new TokenAlias(false, true, grammarAccess.getChannelTypeAccess().getLessThanSignHyphenMinusKeyword_0_0_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getChannelTypeAccess().getLessThanSignHyphenMinusKeyword_0_1_0()), new TokenAlias(false, false, grammarAccess.getChannelTypeAccess().getChanKeyword_0_1_1())));
		match_ConstDecl_SemicolonKeyword_2_1_1_1_q = new TokenAlias(false, true, grammarAccess.getConstDeclAccess().getSemicolonKeyword_2_1_1_1());
		match_Conversion_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getConversionAccess().getCommaKeyword_4());
		match_ElementList_CommaKeyword_1_0_q = new TokenAlias(false, true, grammarAccess.getElementListAccess().getCommaKeyword_1_0());
		match_ExprSwitchStmt_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getExprSwitchStmtAccess().getSemicolonKeyword_2_1());
		match_ImportSpec___FullStopKeyword_0_0_or_IDENTIFIERParserRuleCall_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getImportSpecAccess().getFullStopKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getImportSpecAccess().getIDENTIFIERParserRuleCall_0_1()));
		match_InterfaceType_SemicolonKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getInterfaceTypeAccess().getSemicolonKeyword_3_1());
		match_LiteralValue_CommaKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getLiteralValueAccess().getCommaKeyword_2_1());
		match_ParameterDecl_FullStopFullStopFullStopKeyword_0_2_q = new TokenAlias(false, true, grammarAccess.getParameterDeclAccess().getFullStopFullStopFullStopKeyword_0_2());
		match_ParameterDecl_FullStopFullStopFullStopKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getParameterDeclAccess().getFullStopFullStopFullStopKeyword_1_1());
		match_StatementList___CommaKeyword_1_1_1_or_SemicolonKeyword_1_1_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getStatementListAccess().getCommaKeyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getStatementListAccess().getSemicolonKeyword_1_1_0()));
		match_StructType_SemicolonKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getStructTypeAccess().getSemicolonKeyword_3_1());
		match_TypeSwitchStmt_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getTypeSwitchStmtAccess().getSemicolonKeyword_1_1());
		match_VarDecl_SemicolonKeyword_2_1_1_1_q = new TokenAlias(false, true, grammarAccess.getVarDeclAccess().getSemicolonKeyword_2_1_1_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getIDENTIFIERRule())
			return getIDENTIFIERToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * IDENTIFIER:
	 * 	ID |('-')? ID ;
	 */
	protected String getIDENTIFIERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Arguments_CommaKeyword_2_2_q.equals(syntax))
				emit_Arguments_CommaKeyword_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Arguments_FullStopFullStopFullStopKeyword_2_1_q.equals(syntax))
				emit_Arguments_FullStopFullStopFullStopKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ChannelType___ChanKeyword_0_0_0_LessThanSignHyphenMinusKeyword_0_0_1_q___or___LessThanSignHyphenMinusKeyword_0_1_0_ChanKeyword_0_1_1__.equals(syntax))
				emit_ChannelType___ChanKeyword_0_0_0_LessThanSignHyphenMinusKeyword_0_0_1_q___or___LessThanSignHyphenMinusKeyword_0_1_0_ChanKeyword_0_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ConstDecl_SemicolonKeyword_2_1_1_1_q.equals(syntax))
				emit_ConstDecl_SemicolonKeyword_2_1_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Conversion_CommaKeyword_4_q.equals(syntax))
				emit_Conversion_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ElementList_CommaKeyword_1_0_q.equals(syntax))
				emit_ElementList_CommaKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ExprSwitchStmt_SemicolonKeyword_2_1_q.equals(syntax))
				emit_ExprSwitchStmt_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ImportSpec___FullStopKeyword_0_0_or_IDENTIFIERParserRuleCall_0_1__q.equals(syntax))
				emit_ImportSpec___FullStopKeyword_0_0_or_IDENTIFIERParserRuleCall_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_InterfaceType_SemicolonKeyword_3_1_q.equals(syntax))
				emit_InterfaceType_SemicolonKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LiteralValue_CommaKeyword_2_1_q.equals(syntax))
				emit_LiteralValue_CommaKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ParameterDecl_FullStopFullStopFullStopKeyword_0_2_q.equals(syntax))
				emit_ParameterDecl_FullStopFullStopFullStopKeyword_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ParameterDecl_FullStopFullStopFullStopKeyword_1_1_q.equals(syntax))
				emit_ParameterDecl_FullStopFullStopFullStopKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_StatementList___CommaKeyword_1_1_1_or_SemicolonKeyword_1_1_0__q.equals(syntax))
				emit_StatementList___CommaKeyword_1_1_1_or_SemicolonKeyword_1_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_StructType_SemicolonKeyword_3_1_q.equals(syntax))
				emit_StructType_SemicolonKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TypeSwitchStmt_SemicolonKeyword_1_1_q.equals(syntax))
				emit_TypeSwitchStmt_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_VarDecl_SemicolonKeyword_2_1_1_1_q.equals(syntax))
				emit_VarDecl_SemicolonKeyword_2_1_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     expressionlist=ExpressionList '...'? (ambiguity) ')' (rule end)
	 *     type=Type '...'? (ambiguity) ')' (rule end)
	 */
	protected void emit_Arguments_CommaKeyword_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '...'?
	 *
	 * This ambiguous syntax occurs at:
	 *     expressionlist=ExpressionList (ambiguity) ','? ')' (rule end)
	 *     type=Type (ambiguity) ','? ')' (rule end)
	 */
	protected void emit_Arguments_FullStopFullStopFullStopKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('chan' '<-'?) | ('<-' 'chan')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) elemtype=ElementType
	 */
	protected void emit_ChannelType___ChanKeyword_0_0_0_LessThanSignHyphenMinusKeyword_0_0_1_q___or___LessThanSignHyphenMinusKeyword_0_1_0_ChanKeyword_0_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     constspec2+=ConstSpec (ambiguity) ')' (rule end)
	 *     constspec2+=ConstSpec (ambiguity) constspec2+=ConstSpec
	 */
	protected void emit_ConstDecl_SemicolonKeyword_2_1_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     expression=Expression (ambiguity) ')' (rule end)
	 */
	protected void emit_Conversion_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     element=Element (ambiguity) keyedelement+=KeyedElement
	 *     keyedelement+=KeyedElement (ambiguity) keyedelement+=KeyedElement
	 */
	protected void emit_ElementList_CommaKeyword_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     simplestmt=SimpleStmt (ambiguity) '{' '}' (rule end)
	 *     simplestmt=SimpleStmt (ambiguity) '{' exprcase+=ExprCaseClause
	 *     simplestmt=SimpleStmt (ambiguity) expression=Expression
	 */
	protected void emit_ExprSwitchStmt_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('.' | IDENTIFIER)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ip=ImportPath
	 */
	protected void emit_ImportSpec___FullStopKeyword_0_0_or_IDENTIFIERParserRuleCall_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     methodspec+=MethodSpec (ambiguity) '}' (rule end)
	 *     methodspec+=MethodSpec (ambiguity) methodspec+=MethodSpec
	 */
	protected void emit_InterfaceType_SemicolonKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     elementlist=ElementList (ambiguity) '}' ':' element=Element
	 *     elementlist=ElementList (ambiguity) '}' (rule end)
	 */
	protected void emit_LiteralValue_CommaKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '...'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) type=Type
	 *     id=IDENTIFIER (ambiguity) (rule end)
	 *     id=IDENTIFIER (ambiguity) type=Type
	 */
	protected void emit_ParameterDecl_FullStopFullStopFullStopKeyword_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '...'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) type=Type
	 *     id=IDENTIFIER (ambiguity) type=Type
	 */
	protected void emit_ParameterDecl_FullStopFullStopFullStopKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (';' | ',')?
	 *
	 * This ambiguous syntax occurs at:
	 *     statment+=Statement (ambiguity) (rule end)
	 *     statment+=Statement (ambiguity) statment+=Statement
	 */
	protected void emit_StatementList___CommaKeyword_1_1_1_or_SemicolonKeyword_1_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     fielddecl+=FieldDecl (ambiguity) '}' (rule end)
	 *     fielddecl+=FieldDecl (ambiguity) fielddecl+=FieldDecl
	 */
	protected void emit_StructType_SemicolonKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     simplestm=SimpleStmt (ambiguity) typesg=TypeSwitchGuard
	 */
	protected void emit_TypeSwitchStmt_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     varspec2+=VarSpec (ambiguity) ')' (rule end)
	 *     varspec2+=VarSpec (ambiguity) varspec2+=VarSpec
	 */
	protected void emit_VarDecl_SemicolonKeyword_2_1_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
