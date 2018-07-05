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
	protected AbstractElementAlias match_LiteralValue_CommaKeyword_2_1_q;
	protected AbstractElementAlias match_ParameterDecl_FullStopFullStopFullStopKeyword_2_q;
	protected AbstractElementAlias match_StatementList_SemicolonKeyword_1_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GoGrammarAccess) access;
		match_Arguments_CommaKeyword_2_2_q = new TokenAlias(false, true, grammarAccess.getArgumentsAccess().getCommaKeyword_2_2());
		match_Arguments_FullStopFullStopFullStopKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getArgumentsAccess().getFullStopFullStopFullStopKeyword_2_1());
		match_ChannelType___ChanKeyword_0_0_0_LessThanSignHyphenMinusKeyword_0_0_1_q___or___LessThanSignHyphenMinusKeyword_0_1_0_ChanKeyword_0_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getChannelTypeAccess().getChanKeyword_0_0_0()), new TokenAlias(false, true, grammarAccess.getChannelTypeAccess().getLessThanSignHyphenMinusKeyword_0_0_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getChannelTypeAccess().getLessThanSignHyphenMinusKeyword_0_1_0()), new TokenAlias(false, false, grammarAccess.getChannelTypeAccess().getChanKeyword_0_1_1())));
		match_ConstDecl_SemicolonKeyword_2_1_1_1_q = new TokenAlias(false, true, grammarAccess.getConstDeclAccess().getSemicolonKeyword_2_1_1_1());
		match_Conversion_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getConversionAccess().getCommaKeyword_4());
		match_ElementList_CommaKeyword_1_0_q = new TokenAlias(false, true, grammarAccess.getElementListAccess().getCommaKeyword_1_0());
		match_LiteralValue_CommaKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getLiteralValueAccess().getCommaKeyword_2_1());
		match_ParameterDecl_FullStopFullStopFullStopKeyword_2_q = new TokenAlias(false, true, grammarAccess.getParameterDeclAccess().getFullStopFullStopFullStopKeyword_2());
		match_StatementList_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getStatementListAccess().getSemicolonKeyword_1_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
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
			else if (match_LiteralValue_CommaKeyword_2_1_q.equals(syntax))
				emit_LiteralValue_CommaKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ParameterDecl_FullStopFullStopFullStopKeyword_2_q.equals(syntax))
				emit_ParameterDecl_FullStopFullStopFullStopKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_StatementList_SemicolonKeyword_1_1_q.equals(syntax))
				emit_StatementList_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
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
	 *     identifierL=IdentifierList (ambiguity) (rule end)
	 *     identifierL=IdentifierList (ambiguity) type=Type
	 */
	protected void emit_ParameterDecl_FullStopFullStopFullStopKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     statment+=Statement (ambiguity) (rule end)
	 *     statment+=Statement (ambiguity) statment+=Statement
	 */
	protected void emit_StatementList_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
