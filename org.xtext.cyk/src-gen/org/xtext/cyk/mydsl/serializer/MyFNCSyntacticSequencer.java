/*
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.cyk.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.cyk.mydsl.services.MyFNCGrammarAccess;

@SuppressWarnings("all")
public class MyFNCSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyFNCGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Initial_VerticalLineKeyword_3_0_p;
	protected AbstractElementAlias match_NonTerminal_BKeyword_1_1_or_CKeyword_2_1_or_DKeyword_3_1_or_EKeyword_4_1_or_FKeyword_5_1_or_GKeyword_6_1_or_HKeyword_7_1_or_IKeyword_8_1_or_JKeyword_9_1_or_KKeyword_10_1_or_LKeyword_11_1_or_MKeyword_12_1_or_NKeyword_13_1_or_OKeyword_14_1_or_PKeyword_15_1_or_QKeyword_16_1_or_RKeyword_17_1_or_TKeyword_18_1_or_UKeyword_19_1_or_VKeyword_20_1_or_WKeyword_21_1_or_XKeyword_22_1_or_YKeyword_23_1_or_ZKeyword_24_1;
	protected AbstractElementAlias match_Production_VerticalLineKeyword_3_0_p;
	protected AbstractElementAlias match_Simple_BKeyword_1_1_or_CKeyword_2_1_or_DKeyword_3_1_or_EKeyword_4_1_or_FKeyword_5_1_or_GKeyword_6_1_or_HKeyword_7_1_or_IKeyword_8_1_or_JKeyword_9_1_or_KKeyword_10_1_or_LKeyword_11_1_or_MKeyword_12_1_or_NKeyword_13_1_or_OKeyword_14_1_or_PKeyword_15_1_or_QKeyword_16_1_or_RKeyword_17_1_or_SKeyword_18_1_or_TKeyword_19_1_or_VKeyword_20_1_or_WKeyword_21_1_or_XKeyword_22_1_or_YKeyword_23_1_or_ZKeyword_24_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyFNCGrammarAccess) access;
		match_Initial_VerticalLineKeyword_3_0_p = new TokenAlias(true, false, grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0());
		match_NonTerminal_BKeyword_1_1_or_CKeyword_2_1_or_DKeyword_3_1_or_EKeyword_4_1_or_FKeyword_5_1_or_GKeyword_6_1_or_HKeyword_7_1_or_IKeyword_8_1_or_JKeyword_9_1_or_KKeyword_10_1_or_LKeyword_11_1_or_MKeyword_12_1_or_NKeyword_13_1_or_OKeyword_14_1_or_PKeyword_15_1_or_QKeyword_16_1_or_RKeyword_17_1_or_TKeyword_18_1_or_UKeyword_19_1_or_VKeyword_20_1_or_WKeyword_21_1_or_XKeyword_22_1_or_YKeyword_23_1_or_ZKeyword_24_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getBKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getCKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getDKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getEKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getFKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getGKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getHKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getIKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getJKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getKKeyword_10_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getLKeyword_11_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getMKeyword_12_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getNKeyword_13_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getOKeyword_14_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getPKeyword_15_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getQKeyword_16_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getRKeyword_17_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getTKeyword_18_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getUKeyword_19_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getVKeyword_20_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getWKeyword_21_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getXKeyword_22_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getYKeyword_23_1()), new TokenAlias(false, false, grammarAccess.getNonTerminalAccess().getZKeyword_24_1()));
		match_Production_VerticalLineKeyword_3_0_p = new TokenAlias(true, false, grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0());
		match_Simple_BKeyword_1_1_or_CKeyword_2_1_or_DKeyword_3_1_or_EKeyword_4_1_or_FKeyword_5_1_or_GKeyword_6_1_or_HKeyword_7_1_or_IKeyword_8_1_or_JKeyword_9_1_or_KKeyword_10_1_or_LKeyword_11_1_or_MKeyword_12_1_or_NKeyword_13_1_or_OKeyword_14_1_or_PKeyword_15_1_or_QKeyword_16_1_or_RKeyword_17_1_or_SKeyword_18_1_or_TKeyword_19_1_or_VKeyword_20_1_or_WKeyword_21_1_or_XKeyword_22_1_or_YKeyword_23_1_or_ZKeyword_24_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSimpleAccess().getBKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getCKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getDKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getEKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getFKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getGKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getHKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getIKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getJKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getKKeyword_10_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getLKeyword_11_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getMKeyword_12_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getNKeyword_13_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getOKeyword_14_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getPKeyword_15_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getQKeyword_16_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getRKeyword_17_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getSKeyword_18_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getTKeyword_19_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getVKeyword_20_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getWKeyword_21_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getXKeyword_22_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getYKeyword_23_1()), new TokenAlias(false, false, grammarAccess.getSimpleAccess().getZKeyword_24_1()));
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
			if (match_Initial_VerticalLineKeyword_3_0_p.equals(syntax))
				emit_Initial_VerticalLineKeyword_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NonTerminal_BKeyword_1_1_or_CKeyword_2_1_or_DKeyword_3_1_or_EKeyword_4_1_or_FKeyword_5_1_or_GKeyword_6_1_or_HKeyword_7_1_or_IKeyword_8_1_or_JKeyword_9_1_or_KKeyword_10_1_or_LKeyword_11_1_or_MKeyword_12_1_or_NKeyword_13_1_or_OKeyword_14_1_or_PKeyword_15_1_or_QKeyword_16_1_or_RKeyword_17_1_or_TKeyword_18_1_or_UKeyword_19_1_or_VKeyword_20_1_or_WKeyword_21_1_or_XKeyword_22_1_or_YKeyword_23_1_or_ZKeyword_24_1.equals(syntax))
				emit_NonTerminal_BKeyword_1_1_or_CKeyword_2_1_or_DKeyword_3_1_or_EKeyword_4_1_or_FKeyword_5_1_or_GKeyword_6_1_or_HKeyword_7_1_or_IKeyword_8_1_or_JKeyword_9_1_or_KKeyword_10_1_or_LKeyword_11_1_or_MKeyword_12_1_or_NKeyword_13_1_or_OKeyword_14_1_or_PKeyword_15_1_or_QKeyword_16_1_or_RKeyword_17_1_or_TKeyword_18_1_or_UKeyword_19_1_or_VKeyword_20_1_or_WKeyword_21_1_or_XKeyword_22_1_or_YKeyword_23_1_or_ZKeyword_24_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Production_VerticalLineKeyword_3_0_p.equals(syntax))
				emit_Production_VerticalLineKeyword_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Simple_BKeyword_1_1_or_CKeyword_2_1_or_DKeyword_3_1_or_EKeyword_4_1_or_FKeyword_5_1_or_GKeyword_6_1_or_HKeyword_7_1_or_IKeyword_8_1_or_JKeyword_9_1_or_KKeyword_10_1_or_LKeyword_11_1_or_MKeyword_12_1_or_NKeyword_13_1_or_OKeyword_14_1_or_PKeyword_15_1_or_QKeyword_16_1_or_RKeyword_17_1_or_SKeyword_18_1_or_TKeyword_19_1_or_VKeyword_20_1_or_WKeyword_21_1_or_XKeyword_22_1_or_YKeyword_23_1_or_ZKeyword_24_1.equals(syntax))
				emit_Simple_BKeyword_1_1_or_CKeyword_2_1_or_DKeyword_3_1_or_EKeyword_4_1_or_FKeyword_5_1_or_GKeyword_6_1_or_HKeyword_7_1_or_IKeyword_8_1_or_JKeyword_9_1_or_KKeyword_10_1_or_LKeyword_11_1_or_MKeyword_12_1_or_NKeyword_13_1_or_OKeyword_14_1_or_PKeyword_15_1_or_QKeyword_16_1_or_RKeyword_17_1_or_SKeyword_18_1_or_TKeyword_19_1_or_VKeyword_20_1_or_WKeyword_21_1_or_XKeyword_22_1_or_YKeyword_23_1_or_ZKeyword_24_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '|'+
	 *
	 * This ambiguous syntax occurs at:
	 *     rigth+=Lambda (ambiguity) rigth+=Rigth
	 *     rigth+=Rigth (ambiguity) rigth+=Rigth
	 
	 * </pre>
	 */
	protected void emit_Initial_VerticalLineKeyword_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         'B' | 
	  *         'C' | 
	  *         'D' | 
	  *         'E' | 
	  *         'F' | 
	  *         'G' | 
	  *         'H' | 
	  *         'I' | 
	  *         'J' | 
	  *         'K' | 
	  *         'L' | 
	  *         'M' | 
	  *         'N' | 
	  *         'O' | 
	  *         'P' | 
	  *         'Q' | 
	  *         'R' | 
	  *         'T' | 
	  *         'U' | 
	  *         'V' | 
	  *         'W' | 
	  *         'X' | 
	  *         'Y' | 
	  *         'Z'
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_NonTerminal_BKeyword_1_1_or_CKeyword_2_1_or_DKeyword_3_1_or_EKeyword_4_1_or_FKeyword_5_1_or_GKeyword_6_1_or_HKeyword_7_1_or_IKeyword_8_1_or_JKeyword_9_1_or_KKeyword_10_1_or_LKeyword_11_1_or_MKeyword_12_1_or_NKeyword_13_1_or_OKeyword_14_1_or_PKeyword_15_1_or_QKeyword_16_1_or_RKeyword_17_1_or_TKeyword_18_1_or_UKeyword_19_1_or_VKeyword_20_1_or_WKeyword_21_1_or_XKeyword_22_1_or_YKeyword_23_1_or_ZKeyword_24_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '|'+
	 *
	 * This ambiguous syntax occurs at:
	 *     rigth+=Rigth (ambiguity) rigth+=Rigth
	 
	 * </pre>
	 */
	protected void emit_Production_VerticalLineKeyword_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         'b' | 
	  *         'c' | 
	  *         'd' | 
	  *         'e' | 
	  *         'f' | 
	  *         'g' | 
	  *         'h' | 
	  *         'i' | 
	  *         'j' | 
	  *         'k' | 
	  *         'l' | 
	  *         'm' | 
	  *         'n' | 
	  *         'o' | 
	  *         'p' | 
	  *         'q' | 
	  *         'r' | 
	  *         's' | 
	  *         't' | 
	  *         'v' | 
	  *         'w' | 
	  *         'x' | 
	  *         'y' | 
	  *         'z'
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_Simple_BKeyword_1_1_or_CKeyword_2_1_or_DKeyword_3_1_or_EKeyword_4_1_or_FKeyword_5_1_or_GKeyword_6_1_or_HKeyword_7_1_or_IKeyword_8_1_or_JKeyword_9_1_or_KKeyword_10_1_or_LKeyword_11_1_or_MKeyword_12_1_or_NKeyword_13_1_or_OKeyword_14_1_or_PKeyword_15_1_or_QKeyword_16_1_or_RKeyword_17_1_or_SKeyword_18_1_or_TKeyword_19_1_or_VKeyword_20_1_or_WKeyword_21_1_or_XKeyword_22_1_or_YKeyword_23_1_or_ZKeyword_24_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}