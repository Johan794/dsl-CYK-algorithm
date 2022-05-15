/*
 * generated by Xtext 2.27.0-SNAPSHOT
 */
grammar InternalMyFNC;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.cyk.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.cyk.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.cyk.mydsl.services.MyFNCGrammarAccess;

}

@parser::members {

 	private MyFNCGrammarAccess grammarAccess;

    public InternalMyFNCParser(TokenStream input, MyFNCGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GNFC";
   	}

   	@Override
   	protected MyFNCGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleGNFC
entryRuleGNFC returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGNFCRule()); }
	iv_ruleGNFC=ruleGNFC
	{ $current=$iv_ruleGNFC.current; }
	EOF;

// Rule GNFC
ruleGNFC returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getGNFCAccess().getInitInitialParserRuleCall_0_0());
				}
				lv_init_0_0=ruleInitial
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGNFCRule());
					}
					set(
						$current,
						"init",
						lv_init_0_0,
						"org.xtext.cyk.mydsl.MyFNC.Initial");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGNFCAccess().getProductionsProductionParserRuleCall_1_0());
				}
				lv_productions_1_0=ruleProduction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGNFCRule());
					}
					add(
						$current,
						"productions",
						lv_productions_1_0,
						"org.xtext.cyk.mydsl.MyFNC.Production");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGNFCAccess().getFinalInputStringParserRuleCall_2_0());
				}
				lv_final_2_0=ruleInputString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGNFCRule());
					}
					set(
						$current,
						"final",
						lv_final_2_0,
						"org.xtext.cyk.mydsl.MyFNC.InputString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInitial
entryRuleInitial returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInitialRule()); }
	iv_ruleInitial=ruleInitial
	{ $current=$iv_ruleInitial.current; }
	EOF;

// Rule Initial
ruleInitial returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_left_0_0='S'
				{
					newLeafNode(lv_left_0_0, grammarAccess.getInitialAccess().getLeftSKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInitialRule());
					}
					setWithLastConsumed($current, "left", lv_left_0_0, "S");
				}
			)
		)
		otherlv_1='->'
		{
			newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getHyphenMinusGreaterThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInitialAccess().getRigthLambdaParserRuleCall_2_0());
				}
				lv_rigth_2_0=ruleLambda
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInitialRule());
					}
					add(
						$current,
						"rigth",
						lv_rigth_2_0,
						"org.xtext.cyk.mydsl.MyFNC.Lambda");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_3='|'
				{
					newLeafNode(otherlv_3, grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0());
				}
			)+
			(
				(
					{
						newCompositeNode(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_3_1_0());
					}
					lv_rigth_4_0=ruleRigth
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInitialRule());
						}
						add(
							$current,
							"rigth",
							lv_rigth_4_0,
							"org.xtext.cyk.mydsl.MyFNC.Rigth");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleLambda
entryRuleLambda returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLambdaRule()); }
	iv_ruleLambda=ruleLambda
	{ $current=$iv_ruleLambda.current; }
	EOF;

// Rule Lambda
ruleLambda returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_rigth_0_0='_'
				{
					newLeafNode(lv_rigth_0_0, grammarAccess.getLambdaAccess().getRigth_Keyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLambdaRule());
					}
					setWithLastConsumed($current, "rigth", lv_rigth_0_0, "_");
				}
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getLambdaAccess().getRigthParserRuleCall_1());
		}
		this_Rigth_1=ruleRigth
		{
			$current = $this_Rigth_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleProduction
entryRuleProduction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProductionRule()); }
	iv_ruleProduction=ruleProduction
	{ $current=$iv_ruleProduction.current; }
	EOF;

// Rule Production
ruleProduction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_0_0());
				}
				lv_left_0_0=ruleNonTerminal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProductionRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"org.xtext.cyk.mydsl.MyFNC.NonTerminal");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='->'
		{
			newLeafNode(otherlv_1, grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_2_0());
				}
				lv_rigth_2_0=ruleRigth
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProductionRule());
					}
					add(
						$current,
						"rigth",
						lv_rigth_2_0,
						"org.xtext.cyk.mydsl.MyFNC.Rigth");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_3='|'
				{
					newLeafNode(otherlv_3, grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0());
				}
			)+
			(
				(
					{
						newCompositeNode(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_3_1_0());
					}
					lv_rigth_4_0=ruleRigth
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProductionRule());
						}
						add(
							$current,
							"rigth",
							lv_rigth_4_0,
							"org.xtext.cyk.mydsl.MyFNC.Rigth");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleRigth
entryRuleRigth returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRigthRule()); }
	iv_ruleRigth=ruleRigth
	{ $current=$iv_ruleRigth.current; }
	EOF;

// Rule Rigth
ruleRigth returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRigthAccess().getSimpleParserRuleCall_0());
		}
		this_Simple_0=ruleSimple
		{
			$current = $this_Simple_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRigthAccess().getBinaryParserRuleCall_1());
		}
		this_Binary_1=ruleBinary
		{
			$current = $this_Binary_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSimple
entryRuleSimple returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleRule()); }
	iv_ruleSimple=ruleSimple
	{ $current=$iv_ruleSimple.current; }
	EOF;

// Rule Simple
ruleSimple returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_alpha_0_0='a'
				{
					newLeafNode(lv_alpha_0_0, grammarAccess.getSimpleAccess().getAlphaAKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleRule());
					}
					setWithLastConsumed($current, "alpha", lv_alpha_0_0, "a");
				}
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_1_0(),
						$current);
				}
			)
			otherlv_2='b'
			{
				newLeafNode(otherlv_2, grammarAccess.getSimpleAccess().getBKeyword_1_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_2_0(),
						$current);
				}
			)
			otherlv_4='c'
			{
				newLeafNode(otherlv_4, grammarAccess.getSimpleAccess().getCKeyword_2_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_3_0(),
						$current);
				}
			)
			otherlv_6='d'
			{
				newLeafNode(otherlv_6, grammarAccess.getSimpleAccess().getDKeyword_3_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_4_0(),
						$current);
				}
			)
			otherlv_8='e'
			{
				newLeafNode(otherlv_8, grammarAccess.getSimpleAccess().getEKeyword_4_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_5_0(),
						$current);
				}
			)
			otherlv_10='f'
			{
				newLeafNode(otherlv_10, grammarAccess.getSimpleAccess().getFKeyword_5_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_6_0(),
						$current);
				}
			)
			otherlv_12='g'
			{
				newLeafNode(otherlv_12, grammarAccess.getSimpleAccess().getGKeyword_6_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_7_0(),
						$current);
				}
			)
			otherlv_14='h'
			{
				newLeafNode(otherlv_14, grammarAccess.getSimpleAccess().getHKeyword_7_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_8_0(),
						$current);
				}
			)
			otherlv_16='i'
			{
				newLeafNode(otherlv_16, grammarAccess.getSimpleAccess().getIKeyword_8_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_9_0(),
						$current);
				}
			)
			otherlv_18='j'
			{
				newLeafNode(otherlv_18, grammarAccess.getSimpleAccess().getJKeyword_9_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_10_0(),
						$current);
				}
			)
			otherlv_20='k'
			{
				newLeafNode(otherlv_20, grammarAccess.getSimpleAccess().getKKeyword_10_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_11_0(),
						$current);
				}
			)
			otherlv_22='l'
			{
				newLeafNode(otherlv_22, grammarAccess.getSimpleAccess().getLKeyword_11_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_12_0(),
						$current);
				}
			)
			otherlv_24='m'
			{
				newLeafNode(otherlv_24, grammarAccess.getSimpleAccess().getMKeyword_12_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_13_0(),
						$current);
				}
			)
			otherlv_26='n'
			{
				newLeafNode(otherlv_26, grammarAccess.getSimpleAccess().getNKeyword_13_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_14_0(),
						$current);
				}
			)
			otherlv_28='o'
			{
				newLeafNode(otherlv_28, grammarAccess.getSimpleAccess().getOKeyword_14_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_15_0(),
						$current);
				}
			)
			otherlv_30='p'
			{
				newLeafNode(otherlv_30, grammarAccess.getSimpleAccess().getPKeyword_15_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_16_0(),
						$current);
				}
			)
			otherlv_32='q'
			{
				newLeafNode(otherlv_32, grammarAccess.getSimpleAccess().getQKeyword_16_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_17_0(),
						$current);
				}
			)
			otherlv_34='r'
			{
				newLeafNode(otherlv_34, grammarAccess.getSimpleAccess().getRKeyword_17_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_18_0(),
						$current);
				}
			)
			otherlv_36='s'
			{
				newLeafNode(otherlv_36, grammarAccess.getSimpleAccess().getSKeyword_18_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_19_0(),
						$current);
				}
			)
			otherlv_38='t'
			{
				newLeafNode(otherlv_38, grammarAccess.getSimpleAccess().getTKeyword_19_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_20_0(),
						$current);
				}
			)
			otherlv_40='v'
			{
				newLeafNode(otherlv_40, grammarAccess.getSimpleAccess().getVKeyword_20_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_21_0(),
						$current);
				}
			)
			otherlv_42='w'
			{
				newLeafNode(otherlv_42, grammarAccess.getSimpleAccess().getWKeyword_21_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_22_0(),
						$current);
				}
			)
			otherlv_44='x'
			{
				newLeafNode(otherlv_44, grammarAccess.getSimpleAccess().getXKeyword_22_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_23_0(),
						$current);
				}
			)
			otherlv_46='y'
			{
				newLeafNode(otherlv_46, grammarAccess.getSimpleAccess().getYKeyword_23_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSimpleAccess().getSimpleAction_24_0(),
						$current);
				}
			)
			otherlv_48='z'
			{
				newLeafNode(otherlv_48, grammarAccess.getSimpleAccess().getZKeyword_24_1());
			}
		)
	)
;

// Entry rule entryRuleNonTerminal
entryRuleNonTerminal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNonTerminalRule()); }
	iv_ruleNonTerminal=ruleNonTerminal
	{ $current=$iv_ruleNonTerminal.current; }
	EOF;

// Rule NonTerminal
ruleNonTerminal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_var_0_0='A'
				{
					newLeafNode(lv_var_0_0, grammarAccess.getNonTerminalAccess().getVarAKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNonTerminalRule());
					}
					setWithLastConsumed($current, "var", lv_var_0_0, "A");
				}
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_1_0(),
						$current);
				}
			)
			otherlv_2='B'
			{
				newLeafNode(otherlv_2, grammarAccess.getNonTerminalAccess().getBKeyword_1_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_2_0(),
						$current);
				}
			)
			otherlv_4='C'
			{
				newLeafNode(otherlv_4, grammarAccess.getNonTerminalAccess().getCKeyword_2_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_3_0(),
						$current);
				}
			)
			otherlv_6='D'
			{
				newLeafNode(otherlv_6, grammarAccess.getNonTerminalAccess().getDKeyword_3_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_4_0(),
						$current);
				}
			)
			otherlv_8='E'
			{
				newLeafNode(otherlv_8, grammarAccess.getNonTerminalAccess().getEKeyword_4_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_5_0(),
						$current);
				}
			)
			otherlv_10='F'
			{
				newLeafNode(otherlv_10, grammarAccess.getNonTerminalAccess().getFKeyword_5_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_6_0(),
						$current);
				}
			)
			otherlv_12='G'
			{
				newLeafNode(otherlv_12, grammarAccess.getNonTerminalAccess().getGKeyword_6_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_7_0(),
						$current);
				}
			)
			otherlv_14='H'
			{
				newLeafNode(otherlv_14, grammarAccess.getNonTerminalAccess().getHKeyword_7_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_8_0(),
						$current);
				}
			)
			otherlv_16='I'
			{
				newLeafNode(otherlv_16, grammarAccess.getNonTerminalAccess().getIKeyword_8_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_9_0(),
						$current);
				}
			)
			otherlv_18='J'
			{
				newLeafNode(otherlv_18, grammarAccess.getNonTerminalAccess().getJKeyword_9_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_10_0(),
						$current);
				}
			)
			otherlv_20='K'
			{
				newLeafNode(otherlv_20, grammarAccess.getNonTerminalAccess().getKKeyword_10_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_11_0(),
						$current);
				}
			)
			otherlv_22='L'
			{
				newLeafNode(otherlv_22, grammarAccess.getNonTerminalAccess().getLKeyword_11_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_12_0(),
						$current);
				}
			)
			otherlv_24='M'
			{
				newLeafNode(otherlv_24, grammarAccess.getNonTerminalAccess().getMKeyword_12_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_13_0(),
						$current);
				}
			)
			otherlv_26='N'
			{
				newLeafNode(otherlv_26, grammarAccess.getNonTerminalAccess().getNKeyword_13_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_14_0(),
						$current);
				}
			)
			otherlv_28='O'
			{
				newLeafNode(otherlv_28, grammarAccess.getNonTerminalAccess().getOKeyword_14_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_15_0(),
						$current);
				}
			)
			otherlv_30='P'
			{
				newLeafNode(otherlv_30, grammarAccess.getNonTerminalAccess().getPKeyword_15_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_16_0(),
						$current);
				}
			)
			otherlv_32='Q'
			{
				newLeafNode(otherlv_32, grammarAccess.getNonTerminalAccess().getQKeyword_16_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_17_0(),
						$current);
				}
			)
			otherlv_34='R'
			{
				newLeafNode(otherlv_34, grammarAccess.getNonTerminalAccess().getRKeyword_17_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_18_0(),
						$current);
				}
			)
			otherlv_36='T'
			{
				newLeafNode(otherlv_36, grammarAccess.getNonTerminalAccess().getTKeyword_18_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_19_0(),
						$current);
				}
			)
			otherlv_38='U'
			{
				newLeafNode(otherlv_38, grammarAccess.getNonTerminalAccess().getUKeyword_19_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_20_0(),
						$current);
				}
			)
			otherlv_40='V'
			{
				newLeafNode(otherlv_40, grammarAccess.getNonTerminalAccess().getVKeyword_20_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_21_0(),
						$current);
				}
			)
			otherlv_42='W'
			{
				newLeafNode(otherlv_42, grammarAccess.getNonTerminalAccess().getWKeyword_21_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_22_0(),
						$current);
				}
			)
			otherlv_44='X'
			{
				newLeafNode(otherlv_44, grammarAccess.getNonTerminalAccess().getXKeyword_22_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_23_0(),
						$current);
				}
			)
			otherlv_46='Y'
			{
				newLeafNode(otherlv_46, grammarAccess.getNonTerminalAccess().getYKeyword_23_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNonTerminalAccess().getNonTerminalAction_24_0(),
						$current);
				}
			)
			otherlv_48='Z'
			{
				newLeafNode(otherlv_48, grammarAccess.getNonTerminalAccess().getZKeyword_24_1());
			}
		)
	)
;

// Entry rule entryRuleBinary
entryRuleBinary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBinaryRule()); }
	iv_ruleBinary=ruleBinary
	{ $current=$iv_ruleBinary.current; }
	EOF;

// Rule Binary
ruleBinary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_0_0());
				}
				lv_first_0_0=ruleNonTerminal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBinaryRule());
					}
					set(
						$current,
						"first",
						lv_first_0_0,
						"org.xtext.cyk.mydsl.MyFNC.NonTerminal");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_0());
				}
				lv_second_1_0=ruleNonTerminal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBinaryRule());
					}
					set(
						$current,
						"second",
						lv_second_1_0,
						"org.xtext.cyk.mydsl.MyFNC.NonTerminal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInputString
entryRuleInputString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputStringRule()); }
	iv_ruleInputString=ruleInputString
	{ $current=$iv_ruleInputString.current; }
	EOF;

// Rule InputString
ruleInputString returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Input'
		{
			newLeafNode(otherlv_0, grammarAccess.getInputStringAccess().getInputKeyword_0());
		}
		(
			(
				lv_input_1_0=RULE_STRING
				{
					newLeafNode(lv_input_1_0, grammarAccess.getInputStringAccess().getInputSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputStringRule());
					}
					setWithLastConsumed(
						$current,
						"input",
						lv_input_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;