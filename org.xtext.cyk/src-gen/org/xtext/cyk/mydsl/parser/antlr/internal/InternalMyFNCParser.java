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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyFNCParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'S'", "'->'", "'|'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'v'", "'w'", "'x'", "'y'", "'z'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "'Check'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyFNCParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyFNCParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyFNCParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyFNC.g"; }



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




    // $ANTLR start "entryRuleGNFC"
    // InternalMyFNC.g:64:1: entryRuleGNFC returns [EObject current=null] : iv_ruleGNFC= ruleGNFC EOF ;
    public final EObject entryRuleGNFC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNFC = null;


        try {
            // InternalMyFNC.g:64:45: (iv_ruleGNFC= ruleGNFC EOF )
            // InternalMyFNC.g:65:2: iv_ruleGNFC= ruleGNFC EOF
            {
             newCompositeNode(grammarAccess.getGNFCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGNFC=ruleGNFC();

            state._fsp--;

             current =iv_ruleGNFC; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGNFC"


    // $ANTLR start "ruleGNFC"
    // InternalMyFNC.g:71:1: ruleGNFC returns [EObject current=null] : ( ( (lv_init_0_0= ruleInitial ) ) ( (lv_productions_1_0= ruleProduction ) )* ( (lv_final_2_0= ruleInputString ) ) ) ;
    public final EObject ruleGNFC() throws RecognitionException {
        EObject current = null;

        EObject lv_init_0_0 = null;

        EObject lv_productions_1_0 = null;

        EObject lv_final_2_0 = null;



        	enterRule();

        try {
            // InternalMyFNC.g:77:2: ( ( ( (lv_init_0_0= ruleInitial ) ) ( (lv_productions_1_0= ruleProduction ) )* ( (lv_final_2_0= ruleInputString ) ) ) )
            // InternalMyFNC.g:78:2: ( ( (lv_init_0_0= ruleInitial ) ) ( (lv_productions_1_0= ruleProduction ) )* ( (lv_final_2_0= ruleInputString ) ) )
            {
            // InternalMyFNC.g:78:2: ( ( (lv_init_0_0= ruleInitial ) ) ( (lv_productions_1_0= ruleProduction ) )* ( (lv_final_2_0= ruleInputString ) ) )
            // InternalMyFNC.g:79:3: ( (lv_init_0_0= ruleInitial ) ) ( (lv_productions_1_0= ruleProduction ) )* ( (lv_final_2_0= ruleInputString ) )
            {
            // InternalMyFNC.g:79:3: ( (lv_init_0_0= ruleInitial ) )
            // InternalMyFNC.g:80:4: (lv_init_0_0= ruleInitial )
            {
            // InternalMyFNC.g:80:4: (lv_init_0_0= ruleInitial )
            // InternalMyFNC.g:81:5: lv_init_0_0= ruleInitial
            {

            					newCompositeNode(grammarAccess.getGNFCAccess().getInitInitialParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_init_0_0=ruleInitial();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGNFCRule());
            					}
            					set(
            						current,
            						"init",
            						lv_init_0_0,
            						"org.xtext.cyk.mydsl.MyFNC.Initial");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyFNC.g:98:3: ( (lv_productions_1_0= ruleProduction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=39 && LA1_0<=63)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyFNC.g:99:4: (lv_productions_1_0= ruleProduction )
            	    {
            	    // InternalMyFNC.g:99:4: (lv_productions_1_0= ruleProduction )
            	    // InternalMyFNC.g:100:5: lv_productions_1_0= ruleProduction
            	    {

            	    					newCompositeNode(grammarAccess.getGNFCAccess().getProductionsProductionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_productions_1_0=ruleProduction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGNFCRule());
            	    					}
            	    					add(
            	    						current,
            	    						"productions",
            	    						lv_productions_1_0,
            	    						"org.xtext.cyk.mydsl.MyFNC.Production");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyFNC.g:117:3: ( (lv_final_2_0= ruleInputString ) )
            // InternalMyFNC.g:118:4: (lv_final_2_0= ruleInputString )
            {
            // InternalMyFNC.g:118:4: (lv_final_2_0= ruleInputString )
            // InternalMyFNC.g:119:5: lv_final_2_0= ruleInputString
            {

            					newCompositeNode(grammarAccess.getGNFCAccess().getFinalInputStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_final_2_0=ruleInputString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGNFCRule());
            					}
            					set(
            						current,
            						"final",
            						lv_final_2_0,
            						"org.xtext.cyk.mydsl.MyFNC.InputString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGNFC"


    // $ANTLR start "entryRuleInitial"
    // InternalMyFNC.g:140:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalMyFNC.g:140:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalMyFNC.g:141:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalMyFNC.g:147:1: ruleInitial returns [EObject current=null] : ( ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rigth_2_0 = null;

        EObject lv_rigth_4_0 = null;



        	enterRule();

        try {
            // InternalMyFNC.g:153:2: ( ( ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* ) )
            // InternalMyFNC.g:154:2: ( ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* )
            {
            // InternalMyFNC.g:154:2: ( ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* )
            // InternalMyFNC.g:155:3: ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )*
            {
            // InternalMyFNC.g:155:3: ( (lv_left_0_0= 'S' ) )
            // InternalMyFNC.g:156:4: (lv_left_0_0= 'S' )
            {
            // InternalMyFNC.g:156:4: (lv_left_0_0= 'S' )
            // InternalMyFNC.g:157:5: lv_left_0_0= 'S'
            {
            lv_left_0_0=(Token)match(input,11,FOLLOW_4); 

            					newLeafNode(lv_left_0_0, grammarAccess.getInitialAccess().getLeftSKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialRule());
            					}
            					setWithLastConsumed(current, "left", lv_left_0_0, "S");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMyFNC.g:173:3: ( (lv_rigth_2_0= ruleRigth ) )
            // InternalMyFNC.g:174:4: (lv_rigth_2_0= ruleRigth )
            {
            // InternalMyFNC.g:174:4: (lv_rigth_2_0= ruleRigth )
            // InternalMyFNC.g:175:5: lv_rigth_2_0= ruleRigth
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_rigth_2_0=ruleRigth();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					add(
            						current,
            						"rigth",
            						lv_rigth_2_0,
            						"org.xtext.cyk.mydsl.MyFNC.Rigth");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyFNC.g:192:3: ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyFNC.g:193:4: (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) )
            	    {
            	    // InternalMyFNC.g:193:4: (otherlv_3= '|' )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==13) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMyFNC.g:194:5: otherlv_3= '|'
            	    	    {
            	    	    otherlv_3=(Token)match(input,13,FOLLOW_7); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	    // InternalMyFNC.g:199:4: ( (lv_rigth_4_0= ruleRigth ) )
            	    // InternalMyFNC.g:200:5: (lv_rigth_4_0= ruleRigth )
            	    {
            	    // InternalMyFNC.g:200:5: (lv_rigth_4_0= ruleRigth )
            	    // InternalMyFNC.g:201:6: lv_rigth_4_0= ruleRigth
            	    {

            	    						newCompositeNode(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_rigth_4_0=ruleRigth();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInitialRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rigth",
            	    							lv_rigth_4_0,
            	    							"org.xtext.cyk.mydsl.MyFNC.Rigth");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleProduction"
    // InternalMyFNC.g:223:1: entryRuleProduction returns [EObject current=null] : iv_ruleProduction= ruleProduction EOF ;
    public final EObject entryRuleProduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduction = null;


        try {
            // InternalMyFNC.g:223:51: (iv_ruleProduction= ruleProduction EOF )
            // InternalMyFNC.g:224:2: iv_ruleProduction= ruleProduction EOF
            {
             newCompositeNode(grammarAccess.getProductionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProduction=ruleProduction();

            state._fsp--;

             current =iv_ruleProduction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProduction"


    // $ANTLR start "ruleProduction"
    // InternalMyFNC.g:230:1: ruleProduction returns [EObject current=null] : ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* ) ;
    public final EObject ruleProduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_rigth_2_0 = null;

        EObject lv_rigth_4_0 = null;



        	enterRule();

        try {
            // InternalMyFNC.g:236:2: ( ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* ) )
            // InternalMyFNC.g:237:2: ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* )
            {
            // InternalMyFNC.g:237:2: ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* )
            // InternalMyFNC.g:238:3: ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )*
            {
            // InternalMyFNC.g:238:3: ( (lv_left_0_0= ruleNonTerminal ) )
            // InternalMyFNC.g:239:4: (lv_left_0_0= ruleNonTerminal )
            {
            // InternalMyFNC.g:239:4: (lv_left_0_0= ruleNonTerminal )
            // InternalMyFNC.g:240:5: lv_left_0_0= ruleNonTerminal
            {

            					newCompositeNode(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_left_0_0=ruleNonTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.cyk.mydsl.MyFNC.NonTerminal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMyFNC.g:261:3: ( (lv_rigth_2_0= ruleRigth ) )
            // InternalMyFNC.g:262:4: (lv_rigth_2_0= ruleRigth )
            {
            // InternalMyFNC.g:262:4: (lv_rigth_2_0= ruleRigth )
            // InternalMyFNC.g:263:5: lv_rigth_2_0= ruleRigth
            {

            					newCompositeNode(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_rigth_2_0=ruleRigth();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductionRule());
            					}
            					add(
            						current,
            						"rigth",
            						lv_rigth_2_0,
            						"org.xtext.cyk.mydsl.MyFNC.Rigth");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyFNC.g:280:3: ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyFNC.g:281:4: (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) )
            	    {
            	    // InternalMyFNC.g:281:4: (otherlv_3= '|' )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==13) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalMyFNC.g:282:5: otherlv_3= '|'
            	    	    {
            	    	    otherlv_3=(Token)match(input,13,FOLLOW_7); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);

            	    // InternalMyFNC.g:287:4: ( (lv_rigth_4_0= ruleRigth ) )
            	    // InternalMyFNC.g:288:5: (lv_rigth_4_0= ruleRigth )
            	    {
            	    // InternalMyFNC.g:288:5: (lv_rigth_4_0= ruleRigth )
            	    // InternalMyFNC.g:289:6: lv_rigth_4_0= ruleRigth
            	    {

            	    						newCompositeNode(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_rigth_4_0=ruleRigth();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProductionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rigth",
            	    							lv_rigth_4_0,
            	    							"org.xtext.cyk.mydsl.MyFNC.Rigth");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProduction"


    // $ANTLR start "entryRuleRigth"
    // InternalMyFNC.g:311:1: entryRuleRigth returns [EObject current=null] : iv_ruleRigth= ruleRigth EOF ;
    public final EObject entryRuleRigth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRigth = null;


        try {
            // InternalMyFNC.g:311:46: (iv_ruleRigth= ruleRigth EOF )
            // InternalMyFNC.g:312:2: iv_ruleRigth= ruleRigth EOF
            {
             newCompositeNode(grammarAccess.getRigthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRigth=ruleRigth();

            state._fsp--;

             current =iv_ruleRigth; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRigth"


    // $ANTLR start "ruleRigth"
    // InternalMyFNC.g:318:1: ruleRigth returns [EObject current=null] : ( ( (lv_simple_0_0= ruleSimple ) ) | ( (lv_binary_1_0= ruleBinary ) ) ) ;
    public final EObject ruleRigth() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_binary_1_0 = null;



        	enterRule();

        try {
            // InternalMyFNC.g:324:2: ( ( ( (lv_simple_0_0= ruleSimple ) ) | ( (lv_binary_1_0= ruleBinary ) ) ) )
            // InternalMyFNC.g:325:2: ( ( (lv_simple_0_0= ruleSimple ) ) | ( (lv_binary_1_0= ruleBinary ) ) )
            {
            // InternalMyFNC.g:325:2: ( ( (lv_simple_0_0= ruleSimple ) ) | ( (lv_binary_1_0= ruleBinary ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=14 && LA6_0<=38)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=39 && LA6_0<=63)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyFNC.g:326:3: ( (lv_simple_0_0= ruleSimple ) )
                    {
                    // InternalMyFNC.g:326:3: ( (lv_simple_0_0= ruleSimple ) )
                    // InternalMyFNC.g:327:4: (lv_simple_0_0= ruleSimple )
                    {
                    // InternalMyFNC.g:327:4: (lv_simple_0_0= ruleSimple )
                    // InternalMyFNC.g:328:5: lv_simple_0_0= ruleSimple
                    {

                    					newCompositeNode(grammarAccess.getRigthAccess().getSimpleSimpleParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simple_0_0=ruleSimple();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRigthRule());
                    					}
                    					set(
                    						current,
                    						"simple",
                    						lv_simple_0_0,
                    						"org.xtext.cyk.mydsl.MyFNC.Simple");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyFNC.g:346:3: ( (lv_binary_1_0= ruleBinary ) )
                    {
                    // InternalMyFNC.g:346:3: ( (lv_binary_1_0= ruleBinary ) )
                    // InternalMyFNC.g:347:4: (lv_binary_1_0= ruleBinary )
                    {
                    // InternalMyFNC.g:347:4: (lv_binary_1_0= ruleBinary )
                    // InternalMyFNC.g:348:5: lv_binary_1_0= ruleBinary
                    {

                    					newCompositeNode(grammarAccess.getRigthAccess().getBinaryBinaryParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_binary_1_0=ruleBinary();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRigthRule());
                    					}
                    					set(
                    						current,
                    						"binary",
                    						lv_binary_1_0,
                    						"org.xtext.cyk.mydsl.MyFNC.Binary");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRigth"


    // $ANTLR start "entryRuleSimple"
    // InternalMyFNC.g:369:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalMyFNC.g:369:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalMyFNC.g:370:2: iv_ruleSimple= ruleSimple EOF
            {
             newCompositeNode(grammarAccess.getSimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimple=ruleSimple();

            state._fsp--;

             current =iv_ruleSimple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimple"


    // $ANTLR start "ruleSimple"
    // InternalMyFNC.g:376:1: ruleSimple returns [EObject current=null] : ( () ( ( (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' ) ) ) ) ;
    public final EObject ruleSimple() throws RecognitionException {
        EObject current = null;

        Token lv_alpha_1_1=null;
        Token lv_alpha_1_2=null;
        Token lv_alpha_1_3=null;
        Token lv_alpha_1_4=null;
        Token lv_alpha_1_5=null;
        Token lv_alpha_1_6=null;
        Token lv_alpha_1_7=null;
        Token lv_alpha_1_8=null;
        Token lv_alpha_1_9=null;
        Token lv_alpha_1_10=null;
        Token lv_alpha_1_11=null;
        Token lv_alpha_1_12=null;
        Token lv_alpha_1_13=null;
        Token lv_alpha_1_14=null;
        Token lv_alpha_1_15=null;
        Token lv_alpha_1_16=null;
        Token lv_alpha_1_17=null;
        Token lv_alpha_1_18=null;
        Token lv_alpha_1_19=null;
        Token lv_alpha_1_20=null;
        Token lv_alpha_1_21=null;
        Token lv_alpha_1_22=null;
        Token lv_alpha_1_23=null;
        Token lv_alpha_1_24=null;
        Token lv_alpha_1_25=null;


        	enterRule();

        try {
            // InternalMyFNC.g:382:2: ( ( () ( ( (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' ) ) ) ) )
            // InternalMyFNC.g:383:2: ( () ( ( (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' ) ) ) )
            {
            // InternalMyFNC.g:383:2: ( () ( ( (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' ) ) ) )
            // InternalMyFNC.g:384:3: () ( ( (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' ) ) )
            {
            // InternalMyFNC.g:384:3: ()
            // InternalMyFNC.g:385:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleAccess().getSimpleAction_0(),
            					current);
            			

            }

            // InternalMyFNC.g:391:3: ( ( (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' ) ) )
            // InternalMyFNC.g:392:4: ( (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' ) )
            {
            // InternalMyFNC.g:392:4: ( (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' ) )
            // InternalMyFNC.g:393:5: (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' )
            {
            // InternalMyFNC.g:393:5: (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' )
            int alt7=25;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            case 18:
                {
                alt7=5;
                }
                break;
            case 19:
                {
                alt7=6;
                }
                break;
            case 20:
                {
                alt7=7;
                }
                break;
            case 21:
                {
                alt7=8;
                }
                break;
            case 22:
                {
                alt7=9;
                }
                break;
            case 23:
                {
                alt7=10;
                }
                break;
            case 24:
                {
                alt7=11;
                }
                break;
            case 25:
                {
                alt7=12;
                }
                break;
            case 26:
                {
                alt7=13;
                }
                break;
            case 27:
                {
                alt7=14;
                }
                break;
            case 28:
                {
                alt7=15;
                }
                break;
            case 29:
                {
                alt7=16;
                }
                break;
            case 30:
                {
                alt7=17;
                }
                break;
            case 31:
                {
                alt7=18;
                }
                break;
            case 32:
                {
                alt7=19;
                }
                break;
            case 33:
                {
                alt7=20;
                }
                break;
            case 34:
                {
                alt7=21;
                }
                break;
            case 35:
                {
                alt7=22;
                }
                break;
            case 36:
                {
                alt7=23;
                }
                break;
            case 37:
                {
                alt7=24;
                }
                break;
            case 38:
                {
                alt7=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyFNC.g:394:6: lv_alpha_1_1= 'a'
                    {
                    lv_alpha_1_1=(Token)match(input,14,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_1, grammarAccess.getSimpleAccess().getAlphaAKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyFNC.g:405:6: lv_alpha_1_2= 'b'
                    {
                    lv_alpha_1_2=(Token)match(input,15,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_2, grammarAccess.getSimpleAccess().getAlphaBKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMyFNC.g:416:6: lv_alpha_1_3= 'c'
                    {
                    lv_alpha_1_3=(Token)match(input,16,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_3, grammarAccess.getSimpleAccess().getAlphaCKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalMyFNC.g:427:6: lv_alpha_1_4= 'd'
                    {
                    lv_alpha_1_4=(Token)match(input,17,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_4, grammarAccess.getSimpleAccess().getAlphaDKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalMyFNC.g:438:6: lv_alpha_1_5= 'e'
                    {
                    lv_alpha_1_5=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_5, grammarAccess.getSimpleAccess().getAlphaEKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalMyFNC.g:449:6: lv_alpha_1_6= 'f'
                    {
                    lv_alpha_1_6=(Token)match(input,19,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_6, grammarAccess.getSimpleAccess().getAlphaFKeyword_1_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalMyFNC.g:460:6: lv_alpha_1_7= 'g'
                    {
                    lv_alpha_1_7=(Token)match(input,20,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_7, grammarAccess.getSimpleAccess().getAlphaGKeyword_1_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalMyFNC.g:471:6: lv_alpha_1_8= 'h'
                    {
                    lv_alpha_1_8=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_8, grammarAccess.getSimpleAccess().getAlphaHKeyword_1_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalMyFNC.g:482:6: lv_alpha_1_9= 'i'
                    {
                    lv_alpha_1_9=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_9, grammarAccess.getSimpleAccess().getAlphaIKeyword_1_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalMyFNC.g:493:6: lv_alpha_1_10= 'j'
                    {
                    lv_alpha_1_10=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_10, grammarAccess.getSimpleAccess().getAlphaJKeyword_1_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalMyFNC.g:504:6: lv_alpha_1_11= 'k'
                    {
                    lv_alpha_1_11=(Token)match(input,24,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_11, grammarAccess.getSimpleAccess().getAlphaKKeyword_1_0_10());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_11, null);
                    					

                    }
                    break;
                case 12 :
                    // InternalMyFNC.g:515:6: lv_alpha_1_12= 'l'
                    {
                    lv_alpha_1_12=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_12, grammarAccess.getSimpleAccess().getAlphaLKeyword_1_0_11());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_12, null);
                    					

                    }
                    break;
                case 13 :
                    // InternalMyFNC.g:526:6: lv_alpha_1_13= 'm'
                    {
                    lv_alpha_1_13=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_13, grammarAccess.getSimpleAccess().getAlphaMKeyword_1_0_12());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_13, null);
                    					

                    }
                    break;
                case 14 :
                    // InternalMyFNC.g:537:6: lv_alpha_1_14= 'n'
                    {
                    lv_alpha_1_14=(Token)match(input,27,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_14, grammarAccess.getSimpleAccess().getAlphaNKeyword_1_0_13());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_14, null);
                    					

                    }
                    break;
                case 15 :
                    // InternalMyFNC.g:548:6: lv_alpha_1_15= 'o'
                    {
                    lv_alpha_1_15=(Token)match(input,28,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_15, grammarAccess.getSimpleAccess().getAlphaOKeyword_1_0_14());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_15, null);
                    					

                    }
                    break;
                case 16 :
                    // InternalMyFNC.g:559:6: lv_alpha_1_16= 'p'
                    {
                    lv_alpha_1_16=(Token)match(input,29,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_16, grammarAccess.getSimpleAccess().getAlphaPKeyword_1_0_15());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_16, null);
                    					

                    }
                    break;
                case 17 :
                    // InternalMyFNC.g:570:6: lv_alpha_1_17= 'q'
                    {
                    lv_alpha_1_17=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_17, grammarAccess.getSimpleAccess().getAlphaQKeyword_1_0_16());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_17, null);
                    					

                    }
                    break;
                case 18 :
                    // InternalMyFNC.g:581:6: lv_alpha_1_18= 'r'
                    {
                    lv_alpha_1_18=(Token)match(input,31,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_18, grammarAccess.getSimpleAccess().getAlphaRKeyword_1_0_17());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_18, null);
                    					

                    }
                    break;
                case 19 :
                    // InternalMyFNC.g:592:6: lv_alpha_1_19= 's'
                    {
                    lv_alpha_1_19=(Token)match(input,32,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_19, grammarAccess.getSimpleAccess().getAlphaSKeyword_1_0_18());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_19, null);
                    					

                    }
                    break;
                case 20 :
                    // InternalMyFNC.g:603:6: lv_alpha_1_20= 't'
                    {
                    lv_alpha_1_20=(Token)match(input,33,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_20, grammarAccess.getSimpleAccess().getAlphaTKeyword_1_0_19());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_20, null);
                    					

                    }
                    break;
                case 21 :
                    // InternalMyFNC.g:614:6: lv_alpha_1_21= 'v'
                    {
                    lv_alpha_1_21=(Token)match(input,34,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_21, grammarAccess.getSimpleAccess().getAlphaVKeyword_1_0_20());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_21, null);
                    					

                    }
                    break;
                case 22 :
                    // InternalMyFNC.g:625:6: lv_alpha_1_22= 'w'
                    {
                    lv_alpha_1_22=(Token)match(input,35,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_22, grammarAccess.getSimpleAccess().getAlphaWKeyword_1_0_21());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_22, null);
                    					

                    }
                    break;
                case 23 :
                    // InternalMyFNC.g:636:6: lv_alpha_1_23= 'x'
                    {
                    lv_alpha_1_23=(Token)match(input,36,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_23, grammarAccess.getSimpleAccess().getAlphaXKeyword_1_0_22());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_23, null);
                    					

                    }
                    break;
                case 24 :
                    // InternalMyFNC.g:647:6: lv_alpha_1_24= 'y'
                    {
                    lv_alpha_1_24=(Token)match(input,37,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_24, grammarAccess.getSimpleAccess().getAlphaYKeyword_1_0_23());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_24, null);
                    					

                    }
                    break;
                case 25 :
                    // InternalMyFNC.g:658:6: lv_alpha_1_25= 'z'
                    {
                    lv_alpha_1_25=(Token)match(input,38,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_25, grammarAccess.getSimpleAccess().getAlphaZKeyword_1_0_24());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_25, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleNonTerminal"
    // InternalMyFNC.g:675:1: entryRuleNonTerminal returns [EObject current=null] : iv_ruleNonTerminal= ruleNonTerminal EOF ;
    public final EObject entryRuleNonTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonTerminal = null;


        try {
            // InternalMyFNC.g:675:52: (iv_ruleNonTerminal= ruleNonTerminal EOF )
            // InternalMyFNC.g:676:2: iv_ruleNonTerminal= ruleNonTerminal EOF
            {
             newCompositeNode(grammarAccess.getNonTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonTerminal=ruleNonTerminal();

            state._fsp--;

             current =iv_ruleNonTerminal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonTerminal"


    // $ANTLR start "ruleNonTerminal"
    // InternalMyFNC.g:682:1: ruleNonTerminal returns [EObject current=null] : ( () ( ( (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' ) ) ) ) ;
    public final EObject ruleNonTerminal() throws RecognitionException {
        EObject current = null;

        Token lv_var_1_1=null;
        Token lv_var_1_2=null;
        Token lv_var_1_3=null;
        Token lv_var_1_4=null;
        Token lv_var_1_5=null;
        Token lv_var_1_6=null;
        Token lv_var_1_7=null;
        Token lv_var_1_8=null;
        Token lv_var_1_9=null;
        Token lv_var_1_10=null;
        Token lv_var_1_11=null;
        Token lv_var_1_12=null;
        Token lv_var_1_13=null;
        Token lv_var_1_14=null;
        Token lv_var_1_15=null;
        Token lv_var_1_16=null;
        Token lv_var_1_17=null;
        Token lv_var_1_18=null;
        Token lv_var_1_19=null;
        Token lv_var_1_20=null;
        Token lv_var_1_21=null;
        Token lv_var_1_22=null;
        Token lv_var_1_23=null;
        Token lv_var_1_24=null;
        Token lv_var_1_25=null;


        	enterRule();

        try {
            // InternalMyFNC.g:688:2: ( ( () ( ( (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' ) ) ) ) )
            // InternalMyFNC.g:689:2: ( () ( ( (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' ) ) ) )
            {
            // InternalMyFNC.g:689:2: ( () ( ( (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' ) ) ) )
            // InternalMyFNC.g:690:3: () ( ( (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' ) ) )
            {
            // InternalMyFNC.g:690:3: ()
            // InternalMyFNC.g:691:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNonTerminalAccess().getNonTerminalAction_0(),
            					current);
            			

            }

            // InternalMyFNC.g:697:3: ( ( (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' ) ) )
            // InternalMyFNC.g:698:4: ( (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' ) )
            {
            // InternalMyFNC.g:698:4: ( (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' ) )
            // InternalMyFNC.g:699:5: (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' )
            {
            // InternalMyFNC.g:699:5: (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' )
            int alt8=25;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt8=1;
                }
                break;
            case 40:
                {
                alt8=2;
                }
                break;
            case 41:
                {
                alt8=3;
                }
                break;
            case 42:
                {
                alt8=4;
                }
                break;
            case 43:
                {
                alt8=5;
                }
                break;
            case 44:
                {
                alt8=6;
                }
                break;
            case 45:
                {
                alt8=7;
                }
                break;
            case 46:
                {
                alt8=8;
                }
                break;
            case 47:
                {
                alt8=9;
                }
                break;
            case 48:
                {
                alt8=10;
                }
                break;
            case 49:
                {
                alt8=11;
                }
                break;
            case 50:
                {
                alt8=12;
                }
                break;
            case 51:
                {
                alt8=13;
                }
                break;
            case 52:
                {
                alt8=14;
                }
                break;
            case 53:
                {
                alt8=15;
                }
                break;
            case 54:
                {
                alt8=16;
                }
                break;
            case 55:
                {
                alt8=17;
                }
                break;
            case 56:
                {
                alt8=18;
                }
                break;
            case 57:
                {
                alt8=19;
                }
                break;
            case 58:
                {
                alt8=20;
                }
                break;
            case 59:
                {
                alt8=21;
                }
                break;
            case 60:
                {
                alt8=22;
                }
                break;
            case 61:
                {
                alt8=23;
                }
                break;
            case 62:
                {
                alt8=24;
                }
                break;
            case 63:
                {
                alt8=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyFNC.g:700:6: lv_var_1_1= 'A'
                    {
                    lv_var_1_1=(Token)match(input,39,FOLLOW_2); 

                    						newLeafNode(lv_var_1_1, grammarAccess.getNonTerminalAccess().getVarAKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyFNC.g:711:6: lv_var_1_2= 'B'
                    {
                    lv_var_1_2=(Token)match(input,40,FOLLOW_2); 

                    						newLeafNode(lv_var_1_2, grammarAccess.getNonTerminalAccess().getVarBKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMyFNC.g:722:6: lv_var_1_3= 'C'
                    {
                    lv_var_1_3=(Token)match(input,41,FOLLOW_2); 

                    						newLeafNode(lv_var_1_3, grammarAccess.getNonTerminalAccess().getVarCKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalMyFNC.g:733:6: lv_var_1_4= 'D'
                    {
                    lv_var_1_4=(Token)match(input,42,FOLLOW_2); 

                    						newLeafNode(lv_var_1_4, grammarAccess.getNonTerminalAccess().getVarDKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalMyFNC.g:744:6: lv_var_1_5= 'E'
                    {
                    lv_var_1_5=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_var_1_5, grammarAccess.getNonTerminalAccess().getVarEKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalMyFNC.g:755:6: lv_var_1_6= 'F'
                    {
                    lv_var_1_6=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_var_1_6, grammarAccess.getNonTerminalAccess().getVarFKeyword_1_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalMyFNC.g:766:6: lv_var_1_7= 'G'
                    {
                    lv_var_1_7=(Token)match(input,45,FOLLOW_2); 

                    						newLeafNode(lv_var_1_7, grammarAccess.getNonTerminalAccess().getVarGKeyword_1_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalMyFNC.g:777:6: lv_var_1_8= 'H'
                    {
                    lv_var_1_8=(Token)match(input,46,FOLLOW_2); 

                    						newLeafNode(lv_var_1_8, grammarAccess.getNonTerminalAccess().getVarHKeyword_1_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalMyFNC.g:788:6: lv_var_1_9= 'I'
                    {
                    lv_var_1_9=(Token)match(input,47,FOLLOW_2); 

                    						newLeafNode(lv_var_1_9, grammarAccess.getNonTerminalAccess().getVarIKeyword_1_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalMyFNC.g:799:6: lv_var_1_10= 'J'
                    {
                    lv_var_1_10=(Token)match(input,48,FOLLOW_2); 

                    						newLeafNode(lv_var_1_10, grammarAccess.getNonTerminalAccess().getVarJKeyword_1_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalMyFNC.g:810:6: lv_var_1_11= 'K'
                    {
                    lv_var_1_11=(Token)match(input,49,FOLLOW_2); 

                    						newLeafNode(lv_var_1_11, grammarAccess.getNonTerminalAccess().getVarKKeyword_1_0_10());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_11, null);
                    					

                    }
                    break;
                case 12 :
                    // InternalMyFNC.g:821:6: lv_var_1_12= 'L'
                    {
                    lv_var_1_12=(Token)match(input,50,FOLLOW_2); 

                    						newLeafNode(lv_var_1_12, grammarAccess.getNonTerminalAccess().getVarLKeyword_1_0_11());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_12, null);
                    					

                    }
                    break;
                case 13 :
                    // InternalMyFNC.g:832:6: lv_var_1_13= 'M'
                    {
                    lv_var_1_13=(Token)match(input,51,FOLLOW_2); 

                    						newLeafNode(lv_var_1_13, grammarAccess.getNonTerminalAccess().getVarMKeyword_1_0_12());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_13, null);
                    					

                    }
                    break;
                case 14 :
                    // InternalMyFNC.g:843:6: lv_var_1_14= 'N'
                    {
                    lv_var_1_14=(Token)match(input,52,FOLLOW_2); 

                    						newLeafNode(lv_var_1_14, grammarAccess.getNonTerminalAccess().getVarNKeyword_1_0_13());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_14, null);
                    					

                    }
                    break;
                case 15 :
                    // InternalMyFNC.g:854:6: lv_var_1_15= 'O'
                    {
                    lv_var_1_15=(Token)match(input,53,FOLLOW_2); 

                    						newLeafNode(lv_var_1_15, grammarAccess.getNonTerminalAccess().getVarOKeyword_1_0_14());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_15, null);
                    					

                    }
                    break;
                case 16 :
                    // InternalMyFNC.g:865:6: lv_var_1_16= 'P'
                    {
                    lv_var_1_16=(Token)match(input,54,FOLLOW_2); 

                    						newLeafNode(lv_var_1_16, grammarAccess.getNonTerminalAccess().getVarPKeyword_1_0_15());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_16, null);
                    					

                    }
                    break;
                case 17 :
                    // InternalMyFNC.g:876:6: lv_var_1_17= 'Q'
                    {
                    lv_var_1_17=(Token)match(input,55,FOLLOW_2); 

                    						newLeafNode(lv_var_1_17, grammarAccess.getNonTerminalAccess().getVarQKeyword_1_0_16());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_17, null);
                    					

                    }
                    break;
                case 18 :
                    // InternalMyFNC.g:887:6: lv_var_1_18= 'R'
                    {
                    lv_var_1_18=(Token)match(input,56,FOLLOW_2); 

                    						newLeafNode(lv_var_1_18, grammarAccess.getNonTerminalAccess().getVarRKeyword_1_0_17());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_18, null);
                    					

                    }
                    break;
                case 19 :
                    // InternalMyFNC.g:898:6: lv_var_1_19= 'T'
                    {
                    lv_var_1_19=(Token)match(input,57,FOLLOW_2); 

                    						newLeafNode(lv_var_1_19, grammarAccess.getNonTerminalAccess().getVarTKeyword_1_0_18());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_19, null);
                    					

                    }
                    break;
                case 20 :
                    // InternalMyFNC.g:909:6: lv_var_1_20= 'U'
                    {
                    lv_var_1_20=(Token)match(input,58,FOLLOW_2); 

                    						newLeafNode(lv_var_1_20, grammarAccess.getNonTerminalAccess().getVarUKeyword_1_0_19());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_20, null);
                    					

                    }
                    break;
                case 21 :
                    // InternalMyFNC.g:920:6: lv_var_1_21= 'V'
                    {
                    lv_var_1_21=(Token)match(input,59,FOLLOW_2); 

                    						newLeafNode(lv_var_1_21, grammarAccess.getNonTerminalAccess().getVarVKeyword_1_0_20());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_21, null);
                    					

                    }
                    break;
                case 22 :
                    // InternalMyFNC.g:931:6: lv_var_1_22= 'W'
                    {
                    lv_var_1_22=(Token)match(input,60,FOLLOW_2); 

                    						newLeafNode(lv_var_1_22, grammarAccess.getNonTerminalAccess().getVarWKeyword_1_0_21());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_22, null);
                    					

                    }
                    break;
                case 23 :
                    // InternalMyFNC.g:942:6: lv_var_1_23= 'X'
                    {
                    lv_var_1_23=(Token)match(input,61,FOLLOW_2); 

                    						newLeafNode(lv_var_1_23, grammarAccess.getNonTerminalAccess().getVarXKeyword_1_0_22());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_23, null);
                    					

                    }
                    break;
                case 24 :
                    // InternalMyFNC.g:953:6: lv_var_1_24= 'Y'
                    {
                    lv_var_1_24=(Token)match(input,62,FOLLOW_2); 

                    						newLeafNode(lv_var_1_24, grammarAccess.getNonTerminalAccess().getVarYKeyword_1_0_23());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_24, null);
                    					

                    }
                    break;
                case 25 :
                    // InternalMyFNC.g:964:6: lv_var_1_25= 'Z'
                    {
                    lv_var_1_25=(Token)match(input,63,FOLLOW_2); 

                    						newLeafNode(lv_var_1_25, grammarAccess.getNonTerminalAccess().getVarZKeyword_1_0_24());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_25, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonTerminal"


    // $ANTLR start "entryRuleBinary"
    // InternalMyFNC.g:981:1: entryRuleBinary returns [EObject current=null] : iv_ruleBinary= ruleBinary EOF ;
    public final EObject entryRuleBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinary = null;


        try {
            // InternalMyFNC.g:981:47: (iv_ruleBinary= ruleBinary EOF )
            // InternalMyFNC.g:982:2: iv_ruleBinary= ruleBinary EOF
            {
             newCompositeNode(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinary=ruleBinary();

            state._fsp--;

             current =iv_ruleBinary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinary"


    // $ANTLR start "ruleBinary"
    // InternalMyFNC.g:988:1: ruleBinary returns [EObject current=null] : ( () ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) ) ) ;
    public final EObject ruleBinary() throws RecognitionException {
        EObject current = null;

        EObject lv_first_1_0 = null;

        EObject lv_second_2_0 = null;



        	enterRule();

        try {
            // InternalMyFNC.g:994:2: ( ( () ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) ) ) )
            // InternalMyFNC.g:995:2: ( () ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) ) )
            {
            // InternalMyFNC.g:995:2: ( () ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) ) )
            // InternalMyFNC.g:996:3: () ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) )
            {
            // InternalMyFNC.g:996:3: ()
            // InternalMyFNC.g:997:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBinaryAccess().getBinaryAction_0(),
            					current);
            			

            }

            // InternalMyFNC.g:1003:3: ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) )
            // InternalMyFNC.g:1004:4: ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) )
            {
            // InternalMyFNC.g:1004:4: ( (lv_first_1_0= ruleNonTerminal ) )
            // InternalMyFNC.g:1005:5: (lv_first_1_0= ruleNonTerminal )
            {
            // InternalMyFNC.g:1005:5: (lv_first_1_0= ruleNonTerminal )
            // InternalMyFNC.g:1006:6: lv_first_1_0= ruleNonTerminal
            {

            						newCompositeNode(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_8);
            lv_first_1_0=ruleNonTerminal();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBinaryRule());
            						}
            						set(
            							current,
            							"first",
            							lv_first_1_0,
            							"org.xtext.cyk.mydsl.MyFNC.NonTerminal");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMyFNC.g:1023:4: ( (lv_second_2_0= ruleNonTerminal ) )
            // InternalMyFNC.g:1024:5: (lv_second_2_0= ruleNonTerminal )
            {
            // InternalMyFNC.g:1024:5: (lv_second_2_0= ruleNonTerminal )
            // InternalMyFNC.g:1025:6: lv_second_2_0= ruleNonTerminal
            {

            						newCompositeNode(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_second_2_0=ruleNonTerminal();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBinaryRule());
            						}
            						set(
            							current,
            							"second",
            							lv_second_2_0,
            							"org.xtext.cyk.mydsl.MyFNC.NonTerminal");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinary"


    // $ANTLR start "entryRuleInputString"
    // InternalMyFNC.g:1047:1: entryRuleInputString returns [EObject current=null] : iv_ruleInputString= ruleInputString EOF ;
    public final EObject entryRuleInputString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputString = null;


        try {
            // InternalMyFNC.g:1047:52: (iv_ruleInputString= ruleInputString EOF )
            // InternalMyFNC.g:1048:2: iv_ruleInputString= ruleInputString EOF
            {
             newCompositeNode(grammarAccess.getInputStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputString=ruleInputString();

            state._fsp--;

             current =iv_ruleInputString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputString"


    // $ANTLR start "ruleInputString"
    // InternalMyFNC.g:1054:1: ruleInputString returns [EObject current=null] : (otherlv_0= 'Check' ( (lv_input_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInputString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_input_1_0=null;


        	enterRule();

        try {
            // InternalMyFNC.g:1060:2: ( (otherlv_0= 'Check' ( (lv_input_1_0= RULE_STRING ) ) ) )
            // InternalMyFNC.g:1061:2: (otherlv_0= 'Check' ( (lv_input_1_0= RULE_STRING ) ) )
            {
            // InternalMyFNC.g:1061:2: (otherlv_0= 'Check' ( (lv_input_1_0= RULE_STRING ) ) )
            // InternalMyFNC.g:1062:3: otherlv_0= 'Check' ( (lv_input_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getInputStringAccess().getCheckKeyword_0());
            		
            // InternalMyFNC.g:1066:3: ( (lv_input_1_0= RULE_STRING ) )
            // InternalMyFNC.g:1067:4: (lv_input_1_0= RULE_STRING )
            {
            // InternalMyFNC.g:1067:4: (lv_input_1_0= RULE_STRING )
            // InternalMyFNC.g:1068:5: lv_input_1_0= RULE_STRING
            {
            lv_input_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_input_1_0, grammarAccess.getInputStringAccess().getInputSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"input",
            						lv_input_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFFF8000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xFFFFFFFFFFFFC000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xFFFFFFFFFFFFE000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xFFFFFF8000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});

}