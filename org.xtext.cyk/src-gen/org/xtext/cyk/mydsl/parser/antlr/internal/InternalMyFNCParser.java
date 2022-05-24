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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'S'", "'->'", "'|'", "'&'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'v'", "'w'", "'x'", "'y'", "'z'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "'Check'"
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
    public static final int T__65=65;
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

                if ( ((LA1_0>=40 && LA1_0<=64)) ) {
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
    // InternalMyFNC.g:147:1: ruleInitial returns [EObject current=null] : ( ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleLambda ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rigth_2_0 = null;

        EObject lv_rigth_4_0 = null;



        	enterRule();

        try {
            // InternalMyFNC.g:153:2: ( ( ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleLambda ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* ) )
            // InternalMyFNC.g:154:2: ( ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleLambda ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* )
            {
            // InternalMyFNC.g:154:2: ( ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleLambda ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* )
            // InternalMyFNC.g:155:3: ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleLambda ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )*
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
            		
            // InternalMyFNC.g:173:3: ( (lv_rigth_2_0= ruleLambda ) )
            // InternalMyFNC.g:174:4: (lv_rigth_2_0= ruleLambda )
            {
            // InternalMyFNC.g:174:4: (lv_rigth_2_0= ruleLambda )
            // InternalMyFNC.g:175:5: lv_rigth_2_0= ruleLambda
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getRigthLambdaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_rigth_2_0=ruleLambda();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					add(
            						current,
            						"rigth",
            						lv_rigth_2_0,
            						"org.xtext.cyk.mydsl.MyFNC.Lambda");
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


    // $ANTLR start "entryRuleLambda"
    // InternalMyFNC.g:223:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalMyFNC.g:223:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalMyFNC.g:224:2: iv_ruleLambda= ruleLambda EOF
            {
             newCompositeNode(grammarAccess.getLambdaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLambda=ruleLambda();

            state._fsp--;

             current =iv_ruleLambda; 
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
    // $ANTLR end "entryRuleLambda"


    // $ANTLR start "ruleLambda"
    // InternalMyFNC.g:230:1: ruleLambda returns [EObject current=null] : ( ( (lv_rigth_0_0= '&' ) ) | this_Rigth_1= ruleRigth ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token lv_rigth_0_0=null;
        EObject this_Rigth_1 = null;



        	enterRule();

        try {
            // InternalMyFNC.g:236:2: ( ( ( (lv_rigth_0_0= '&' ) ) | this_Rigth_1= ruleRigth ) )
            // InternalMyFNC.g:237:2: ( ( (lv_rigth_0_0= '&' ) ) | this_Rigth_1= ruleRigth )
            {
            // InternalMyFNC.g:237:2: ( ( (lv_rigth_0_0= '&' ) ) | this_Rigth_1= ruleRigth )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=15 && LA4_0<=64)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyFNC.g:238:3: ( (lv_rigth_0_0= '&' ) )
                    {
                    // InternalMyFNC.g:238:3: ( (lv_rigth_0_0= '&' ) )
                    // InternalMyFNC.g:239:4: (lv_rigth_0_0= '&' )
                    {
                    // InternalMyFNC.g:239:4: (lv_rigth_0_0= '&' )
                    // InternalMyFNC.g:240:5: lv_rigth_0_0= '&'
                    {
                    lv_rigth_0_0=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(lv_rigth_0_0, grammarAccess.getLambdaAccess().getRigthAmpersandKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLambdaRule());
                    					}
                    					setWithLastConsumed(current, "rigth", lv_rigth_0_0, "&");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyFNC.g:253:3: this_Rigth_1= ruleRigth
                    {

                    			newCompositeNode(grammarAccess.getLambdaAccess().getRigthParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rigth_1=ruleRigth();

                    state._fsp--;


                    			current = this_Rigth_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleProduction"
    // InternalMyFNC.g:265:1: entryRuleProduction returns [EObject current=null] : iv_ruleProduction= ruleProduction EOF ;
    public final EObject entryRuleProduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduction = null;


        try {
            // InternalMyFNC.g:265:51: (iv_ruleProduction= ruleProduction EOF )
            // InternalMyFNC.g:266:2: iv_ruleProduction= ruleProduction EOF
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
    // InternalMyFNC.g:272:1: ruleProduction returns [EObject current=null] : ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* ) ;
    public final EObject ruleProduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_rigth_2_0 = null;

        EObject lv_rigth_4_0 = null;



        	enterRule();

        try {
            // InternalMyFNC.g:278:2: ( ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* ) )
            // InternalMyFNC.g:279:2: ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* )
            {
            // InternalMyFNC.g:279:2: ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* )
            // InternalMyFNC.g:280:3: ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )*
            {
            // InternalMyFNC.g:280:3: ( (lv_left_0_0= ruleNonTerminal ) )
            // InternalMyFNC.g:281:4: (lv_left_0_0= ruleNonTerminal )
            {
            // InternalMyFNC.g:281:4: (lv_left_0_0= ruleNonTerminal )
            // InternalMyFNC.g:282:5: lv_left_0_0= ruleNonTerminal
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
            		
            // InternalMyFNC.g:303:3: ( (lv_rigth_2_0= ruleRigth ) )
            // InternalMyFNC.g:304:4: (lv_rigth_2_0= ruleRigth )
            {
            // InternalMyFNC.g:304:4: (lv_rigth_2_0= ruleRigth )
            // InternalMyFNC.g:305:5: lv_rigth_2_0= ruleRigth
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

            // InternalMyFNC.g:322:3: ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyFNC.g:323:4: (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) )
            	    {
            	    // InternalMyFNC.g:323:4: (otherlv_3= '|' )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==13) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMyFNC.g:324:5: otherlv_3= '|'
            	    	    {
            	    	    otherlv_3=(Token)match(input,13,FOLLOW_7); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    // InternalMyFNC.g:329:4: ( (lv_rigth_4_0= ruleRigth ) )
            	    // InternalMyFNC.g:330:5: (lv_rigth_4_0= ruleRigth )
            	    {
            	    // InternalMyFNC.g:330:5: (lv_rigth_4_0= ruleRigth )
            	    // InternalMyFNC.g:331:6: lv_rigth_4_0= ruleRigth
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
            	    break loop6;
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
    // InternalMyFNC.g:353:1: entryRuleRigth returns [EObject current=null] : iv_ruleRigth= ruleRigth EOF ;
    public final EObject entryRuleRigth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRigth = null;


        try {
            // InternalMyFNC.g:353:46: (iv_ruleRigth= ruleRigth EOF )
            // InternalMyFNC.g:354:2: iv_ruleRigth= ruleRigth EOF
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
    // InternalMyFNC.g:360:1: ruleRigth returns [EObject current=null] : (this_Simple_0= ruleSimple | this_Binary_1= ruleBinary ) ;
    public final EObject ruleRigth() throws RecognitionException {
        EObject current = null;

        EObject this_Simple_0 = null;

        EObject this_Binary_1 = null;



        	enterRule();

        try {
            // InternalMyFNC.g:366:2: ( (this_Simple_0= ruleSimple | this_Binary_1= ruleBinary ) )
            // InternalMyFNC.g:367:2: (this_Simple_0= ruleSimple | this_Binary_1= ruleBinary )
            {
            // InternalMyFNC.g:367:2: (this_Simple_0= ruleSimple | this_Binary_1= ruleBinary )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=15 && LA7_0<=39)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=40 && LA7_0<=64)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyFNC.g:368:3: this_Simple_0= ruleSimple
                    {

                    			newCompositeNode(grammarAccess.getRigthAccess().getSimpleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Simple_0=ruleSimple();

                    state._fsp--;


                    			current = this_Simple_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyFNC.g:377:3: this_Binary_1= ruleBinary
                    {

                    			newCompositeNode(grammarAccess.getRigthAccess().getBinaryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Binary_1=ruleBinary();

                    state._fsp--;


                    			current = this_Binary_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // InternalMyFNC.g:389:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalMyFNC.g:389:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalMyFNC.g:390:2: iv_ruleSimple= ruleSimple EOF
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
    // InternalMyFNC.g:396:1: ruleSimple returns [EObject current=null] : ( ( (lv_alpha_0_0= 'a' ) ) | ( () otherlv_2= 'b' ) | ( () otherlv_4= 'c' ) | ( () otherlv_6= 'd' ) | ( () otherlv_8= 'e' ) | ( () otherlv_10= 'f' ) | ( () otherlv_12= 'g' ) | ( () otherlv_14= 'h' ) | ( () otherlv_16= 'i' ) | ( () otherlv_18= 'j' ) | ( () otherlv_20= 'k' ) | ( () otherlv_22= 'l' ) | ( () otherlv_24= 'm' ) | ( () otherlv_26= 'n' ) | ( () otherlv_28= 'o' ) | ( () otherlv_30= 'p' ) | ( () otherlv_32= 'q' ) | ( () otherlv_34= 'r' ) | ( () otherlv_36= 's' ) | ( () otherlv_38= 't' ) | ( () otherlv_40= 'v' ) | ( () otherlv_42= 'w' ) | ( () otherlv_44= 'x' ) | ( () otherlv_46= 'y' ) | ( () otherlv_48= 'z' ) ) ;
    public final EObject ruleSimple() throws RecognitionException {
        EObject current = null;

        Token lv_alpha_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_48=null;


        	enterRule();

        try {
            // InternalMyFNC.g:402:2: ( ( ( (lv_alpha_0_0= 'a' ) ) | ( () otherlv_2= 'b' ) | ( () otherlv_4= 'c' ) | ( () otherlv_6= 'd' ) | ( () otherlv_8= 'e' ) | ( () otherlv_10= 'f' ) | ( () otherlv_12= 'g' ) | ( () otherlv_14= 'h' ) | ( () otherlv_16= 'i' ) | ( () otherlv_18= 'j' ) | ( () otherlv_20= 'k' ) | ( () otherlv_22= 'l' ) | ( () otherlv_24= 'm' ) | ( () otherlv_26= 'n' ) | ( () otherlv_28= 'o' ) | ( () otherlv_30= 'p' ) | ( () otherlv_32= 'q' ) | ( () otherlv_34= 'r' ) | ( () otherlv_36= 's' ) | ( () otherlv_38= 't' ) | ( () otherlv_40= 'v' ) | ( () otherlv_42= 'w' ) | ( () otherlv_44= 'x' ) | ( () otherlv_46= 'y' ) | ( () otherlv_48= 'z' ) ) )
            // InternalMyFNC.g:403:2: ( ( (lv_alpha_0_0= 'a' ) ) | ( () otherlv_2= 'b' ) | ( () otherlv_4= 'c' ) | ( () otherlv_6= 'd' ) | ( () otherlv_8= 'e' ) | ( () otherlv_10= 'f' ) | ( () otherlv_12= 'g' ) | ( () otherlv_14= 'h' ) | ( () otherlv_16= 'i' ) | ( () otherlv_18= 'j' ) | ( () otherlv_20= 'k' ) | ( () otherlv_22= 'l' ) | ( () otherlv_24= 'm' ) | ( () otherlv_26= 'n' ) | ( () otherlv_28= 'o' ) | ( () otherlv_30= 'p' ) | ( () otherlv_32= 'q' ) | ( () otherlv_34= 'r' ) | ( () otherlv_36= 's' ) | ( () otherlv_38= 't' ) | ( () otherlv_40= 'v' ) | ( () otherlv_42= 'w' ) | ( () otherlv_44= 'x' ) | ( () otherlv_46= 'y' ) | ( () otherlv_48= 'z' ) )
            {
            // InternalMyFNC.g:403:2: ( ( (lv_alpha_0_0= 'a' ) ) | ( () otherlv_2= 'b' ) | ( () otherlv_4= 'c' ) | ( () otherlv_6= 'd' ) | ( () otherlv_8= 'e' ) | ( () otherlv_10= 'f' ) | ( () otherlv_12= 'g' ) | ( () otherlv_14= 'h' ) | ( () otherlv_16= 'i' ) | ( () otherlv_18= 'j' ) | ( () otherlv_20= 'k' ) | ( () otherlv_22= 'l' ) | ( () otherlv_24= 'm' ) | ( () otherlv_26= 'n' ) | ( () otherlv_28= 'o' ) | ( () otherlv_30= 'p' ) | ( () otherlv_32= 'q' ) | ( () otherlv_34= 'r' ) | ( () otherlv_36= 's' ) | ( () otherlv_38= 't' ) | ( () otherlv_40= 'v' ) | ( () otherlv_42= 'w' ) | ( () otherlv_44= 'x' ) | ( () otherlv_46= 'y' ) | ( () otherlv_48= 'z' ) )
            int alt8=25;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 17:
                {
                alt8=3;
                }
                break;
            case 18:
                {
                alt8=4;
                }
                break;
            case 19:
                {
                alt8=5;
                }
                break;
            case 20:
                {
                alt8=6;
                }
                break;
            case 21:
                {
                alt8=7;
                }
                break;
            case 22:
                {
                alt8=8;
                }
                break;
            case 23:
                {
                alt8=9;
                }
                break;
            case 24:
                {
                alt8=10;
                }
                break;
            case 25:
                {
                alt8=11;
                }
                break;
            case 26:
                {
                alt8=12;
                }
                break;
            case 27:
                {
                alt8=13;
                }
                break;
            case 28:
                {
                alt8=14;
                }
                break;
            case 29:
                {
                alt8=15;
                }
                break;
            case 30:
                {
                alt8=16;
                }
                break;
            case 31:
                {
                alt8=17;
                }
                break;
            case 32:
                {
                alt8=18;
                }
                break;
            case 33:
                {
                alt8=19;
                }
                break;
            case 34:
                {
                alt8=20;
                }
                break;
            case 35:
                {
                alt8=21;
                }
                break;
            case 36:
                {
                alt8=22;
                }
                break;
            case 37:
                {
                alt8=23;
                }
                break;
            case 38:
                {
                alt8=24;
                }
                break;
            case 39:
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
                    // InternalMyFNC.g:404:3: ( (lv_alpha_0_0= 'a' ) )
                    {
                    // InternalMyFNC.g:404:3: ( (lv_alpha_0_0= 'a' ) )
                    // InternalMyFNC.g:405:4: (lv_alpha_0_0= 'a' )
                    {
                    // InternalMyFNC.g:405:4: (lv_alpha_0_0= 'a' )
                    // InternalMyFNC.g:406:5: lv_alpha_0_0= 'a'
                    {
                    lv_alpha_0_0=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_alpha_0_0, grammarAccess.getSimpleAccess().getAlphaAKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "alpha", lv_alpha_0_0, "a");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyFNC.g:419:3: ( () otherlv_2= 'b' )
                    {
                    // InternalMyFNC.g:419:3: ( () otherlv_2= 'b' )
                    // InternalMyFNC.g:420:4: () otherlv_2= 'b'
                    {
                    // InternalMyFNC.g:420:4: ()
                    // InternalMyFNC.g:421:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getSimpleAccess().getBKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFNC.g:433:3: ( () otherlv_4= 'c' )
                    {
                    // InternalMyFNC.g:433:3: ( () otherlv_4= 'c' )
                    // InternalMyFNC.g:434:4: () otherlv_4= 'c'
                    {
                    // InternalMyFNC.g:434:4: ()
                    // InternalMyFNC.g:435:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSimpleAccess().getCKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFNC.g:447:3: ( () otherlv_6= 'd' )
                    {
                    // InternalMyFNC.g:447:3: ( () otherlv_6= 'd' )
                    // InternalMyFNC.g:448:4: () otherlv_6= 'd'
                    {
                    // InternalMyFNC.g:448:4: ()
                    // InternalMyFNC.g:449:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getSimpleAccess().getDKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyFNC.g:461:3: ( () otherlv_8= 'e' )
                    {
                    // InternalMyFNC.g:461:3: ( () otherlv_8= 'e' )
                    // InternalMyFNC.g:462:4: () otherlv_8= 'e'
                    {
                    // InternalMyFNC.g:462:4: ()
                    // InternalMyFNC.g:463:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getSimpleAccess().getEKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyFNC.g:475:3: ( () otherlv_10= 'f' )
                    {
                    // InternalMyFNC.g:475:3: ( () otherlv_10= 'f' )
                    // InternalMyFNC.g:476:4: () otherlv_10= 'f'
                    {
                    // InternalMyFNC.g:476:4: ()
                    // InternalMyFNC.g:477:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getSimpleAccess().getFKeyword_5_1());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyFNC.g:489:3: ( () otherlv_12= 'g' )
                    {
                    // InternalMyFNC.g:489:3: ( () otherlv_12= 'g' )
                    // InternalMyFNC.g:490:4: () otherlv_12= 'g'
                    {
                    // InternalMyFNC.g:490:4: ()
                    // InternalMyFNC.g:491:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_12=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getSimpleAccess().getGKeyword_6_1());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyFNC.g:503:3: ( () otherlv_14= 'h' )
                    {
                    // InternalMyFNC.g:503:3: ( () otherlv_14= 'h' )
                    // InternalMyFNC.g:504:4: () otherlv_14= 'h'
                    {
                    // InternalMyFNC.g:504:4: ()
                    // InternalMyFNC.g:505:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_7_0(),
                    						current);
                    				

                    }

                    otherlv_14=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getSimpleAccess().getHKeyword_7_1());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyFNC.g:517:3: ( () otherlv_16= 'i' )
                    {
                    // InternalMyFNC.g:517:3: ( () otherlv_16= 'i' )
                    // InternalMyFNC.g:518:4: () otherlv_16= 'i'
                    {
                    // InternalMyFNC.g:518:4: ()
                    // InternalMyFNC.g:519:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_8_0(),
                    						current);
                    				

                    }

                    otherlv_16=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getSimpleAccess().getIKeyword_8_1());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyFNC.g:531:3: ( () otherlv_18= 'j' )
                    {
                    // InternalMyFNC.g:531:3: ( () otherlv_18= 'j' )
                    // InternalMyFNC.g:532:4: () otherlv_18= 'j'
                    {
                    // InternalMyFNC.g:532:4: ()
                    // InternalMyFNC.g:533:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_9_0(),
                    						current);
                    				

                    }

                    otherlv_18=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getSimpleAccess().getJKeyword_9_1());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyFNC.g:545:3: ( () otherlv_20= 'k' )
                    {
                    // InternalMyFNC.g:545:3: ( () otherlv_20= 'k' )
                    // InternalMyFNC.g:546:4: () otherlv_20= 'k'
                    {
                    // InternalMyFNC.g:546:4: ()
                    // InternalMyFNC.g:547:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_10_0(),
                    						current);
                    				

                    }

                    otherlv_20=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getSimpleAccess().getKKeyword_10_1());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalMyFNC.g:559:3: ( () otherlv_22= 'l' )
                    {
                    // InternalMyFNC.g:559:3: ( () otherlv_22= 'l' )
                    // InternalMyFNC.g:560:4: () otherlv_22= 'l'
                    {
                    // InternalMyFNC.g:560:4: ()
                    // InternalMyFNC.g:561:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_11_0(),
                    						current);
                    				

                    }

                    otherlv_22=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_22, grammarAccess.getSimpleAccess().getLKeyword_11_1());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalMyFNC.g:573:3: ( () otherlv_24= 'm' )
                    {
                    // InternalMyFNC.g:573:3: ( () otherlv_24= 'm' )
                    // InternalMyFNC.g:574:4: () otherlv_24= 'm'
                    {
                    // InternalMyFNC.g:574:4: ()
                    // InternalMyFNC.g:575:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_12_0(),
                    						current);
                    				

                    }

                    otherlv_24=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getSimpleAccess().getMKeyword_12_1());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalMyFNC.g:587:3: ( () otherlv_26= 'n' )
                    {
                    // InternalMyFNC.g:587:3: ( () otherlv_26= 'n' )
                    // InternalMyFNC.g:588:4: () otherlv_26= 'n'
                    {
                    // InternalMyFNC.g:588:4: ()
                    // InternalMyFNC.g:589:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_13_0(),
                    						current);
                    				

                    }

                    otherlv_26=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_26, grammarAccess.getSimpleAccess().getNKeyword_13_1());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalMyFNC.g:601:3: ( () otherlv_28= 'o' )
                    {
                    // InternalMyFNC.g:601:3: ( () otherlv_28= 'o' )
                    // InternalMyFNC.g:602:4: () otherlv_28= 'o'
                    {
                    // InternalMyFNC.g:602:4: ()
                    // InternalMyFNC.g:603:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_14_0(),
                    						current);
                    				

                    }

                    otherlv_28=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_28, grammarAccess.getSimpleAccess().getOKeyword_14_1());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalMyFNC.g:615:3: ( () otherlv_30= 'p' )
                    {
                    // InternalMyFNC.g:615:3: ( () otherlv_30= 'p' )
                    // InternalMyFNC.g:616:4: () otherlv_30= 'p'
                    {
                    // InternalMyFNC.g:616:4: ()
                    // InternalMyFNC.g:617:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_15_0(),
                    						current);
                    				

                    }

                    otherlv_30=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_30, grammarAccess.getSimpleAccess().getPKeyword_15_1());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalMyFNC.g:629:3: ( () otherlv_32= 'q' )
                    {
                    // InternalMyFNC.g:629:3: ( () otherlv_32= 'q' )
                    // InternalMyFNC.g:630:4: () otherlv_32= 'q'
                    {
                    // InternalMyFNC.g:630:4: ()
                    // InternalMyFNC.g:631:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_16_0(),
                    						current);
                    				

                    }

                    otherlv_32=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_32, grammarAccess.getSimpleAccess().getQKeyword_16_1());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalMyFNC.g:643:3: ( () otherlv_34= 'r' )
                    {
                    // InternalMyFNC.g:643:3: ( () otherlv_34= 'r' )
                    // InternalMyFNC.g:644:4: () otherlv_34= 'r'
                    {
                    // InternalMyFNC.g:644:4: ()
                    // InternalMyFNC.g:645:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_17_0(),
                    						current);
                    				

                    }

                    otherlv_34=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_34, grammarAccess.getSimpleAccess().getRKeyword_17_1());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalMyFNC.g:657:3: ( () otherlv_36= 's' )
                    {
                    // InternalMyFNC.g:657:3: ( () otherlv_36= 's' )
                    // InternalMyFNC.g:658:4: () otherlv_36= 's'
                    {
                    // InternalMyFNC.g:658:4: ()
                    // InternalMyFNC.g:659:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_18_0(),
                    						current);
                    				

                    }

                    otherlv_36=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_36, grammarAccess.getSimpleAccess().getSKeyword_18_1());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalMyFNC.g:671:3: ( () otherlv_38= 't' )
                    {
                    // InternalMyFNC.g:671:3: ( () otherlv_38= 't' )
                    // InternalMyFNC.g:672:4: () otherlv_38= 't'
                    {
                    // InternalMyFNC.g:672:4: ()
                    // InternalMyFNC.g:673:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_19_0(),
                    						current);
                    				

                    }

                    otherlv_38=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_38, grammarAccess.getSimpleAccess().getTKeyword_19_1());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalMyFNC.g:685:3: ( () otherlv_40= 'v' )
                    {
                    // InternalMyFNC.g:685:3: ( () otherlv_40= 'v' )
                    // InternalMyFNC.g:686:4: () otherlv_40= 'v'
                    {
                    // InternalMyFNC.g:686:4: ()
                    // InternalMyFNC.g:687:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_20_0(),
                    						current);
                    				

                    }

                    otherlv_40=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_40, grammarAccess.getSimpleAccess().getVKeyword_20_1());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalMyFNC.g:699:3: ( () otherlv_42= 'w' )
                    {
                    // InternalMyFNC.g:699:3: ( () otherlv_42= 'w' )
                    // InternalMyFNC.g:700:4: () otherlv_42= 'w'
                    {
                    // InternalMyFNC.g:700:4: ()
                    // InternalMyFNC.g:701:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_21_0(),
                    						current);
                    				

                    }

                    otherlv_42=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_42, grammarAccess.getSimpleAccess().getWKeyword_21_1());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalMyFNC.g:713:3: ( () otherlv_44= 'x' )
                    {
                    // InternalMyFNC.g:713:3: ( () otherlv_44= 'x' )
                    // InternalMyFNC.g:714:4: () otherlv_44= 'x'
                    {
                    // InternalMyFNC.g:714:4: ()
                    // InternalMyFNC.g:715:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_22_0(),
                    						current);
                    				

                    }

                    otherlv_44=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_44, grammarAccess.getSimpleAccess().getXKeyword_22_1());
                    			

                    }


                    }
                    break;
                case 24 :
                    // InternalMyFNC.g:727:3: ( () otherlv_46= 'y' )
                    {
                    // InternalMyFNC.g:727:3: ( () otherlv_46= 'y' )
                    // InternalMyFNC.g:728:4: () otherlv_46= 'y'
                    {
                    // InternalMyFNC.g:728:4: ()
                    // InternalMyFNC.g:729:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_23_0(),
                    						current);
                    				

                    }

                    otherlv_46=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_46, grammarAccess.getSimpleAccess().getYKeyword_23_1());
                    			

                    }


                    }
                    break;
                case 25 :
                    // InternalMyFNC.g:741:3: ( () otherlv_48= 'z' )
                    {
                    // InternalMyFNC.g:741:3: ( () otherlv_48= 'z' )
                    // InternalMyFNC.g:742:4: () otherlv_48= 'z'
                    {
                    // InternalMyFNC.g:742:4: ()
                    // InternalMyFNC.g:743:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSimpleAccess().getSimpleAction_24_0(),
                    						current);
                    				

                    }

                    otherlv_48=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_48, grammarAccess.getSimpleAccess().getZKeyword_24_1());
                    			

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
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleNonTerminal"
    // InternalMyFNC.g:758:1: entryRuleNonTerminal returns [EObject current=null] : iv_ruleNonTerminal= ruleNonTerminal EOF ;
    public final EObject entryRuleNonTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonTerminal = null;


        try {
            // InternalMyFNC.g:758:52: (iv_ruleNonTerminal= ruleNonTerminal EOF )
            // InternalMyFNC.g:759:2: iv_ruleNonTerminal= ruleNonTerminal EOF
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
    // InternalMyFNC.g:765:1: ruleNonTerminal returns [EObject current=null] : ( ( (lv_var_0_0= 'A' ) ) | ( () otherlv_2= 'B' ) | ( () otherlv_4= 'C' ) | ( () otherlv_6= 'D' ) | ( () otherlv_8= 'E' ) | ( () otherlv_10= 'F' ) | ( () otherlv_12= 'G' ) | ( () otherlv_14= 'H' ) | ( () otherlv_16= 'I' ) | ( () otherlv_18= 'J' ) | ( () otherlv_20= 'K' ) | ( () otherlv_22= 'L' ) | ( () otherlv_24= 'M' ) | ( () otherlv_26= 'N' ) | ( () otherlv_28= 'O' ) | ( () otherlv_30= 'P' ) | ( () otherlv_32= 'Q' ) | ( () otherlv_34= 'R' ) | ( () otherlv_36= 'T' ) | ( () otherlv_38= 'U' ) | ( () otherlv_40= 'V' ) | ( () otherlv_42= 'W' ) | ( () otherlv_44= 'X' ) | ( () otherlv_46= 'Y' ) | ( () otherlv_48= 'Z' ) ) ;
    public final EObject ruleNonTerminal() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_48=null;


        	enterRule();

        try {
            // InternalMyFNC.g:771:2: ( ( ( (lv_var_0_0= 'A' ) ) | ( () otherlv_2= 'B' ) | ( () otherlv_4= 'C' ) | ( () otherlv_6= 'D' ) | ( () otherlv_8= 'E' ) | ( () otherlv_10= 'F' ) | ( () otherlv_12= 'G' ) | ( () otherlv_14= 'H' ) | ( () otherlv_16= 'I' ) | ( () otherlv_18= 'J' ) | ( () otherlv_20= 'K' ) | ( () otherlv_22= 'L' ) | ( () otherlv_24= 'M' ) | ( () otherlv_26= 'N' ) | ( () otherlv_28= 'O' ) | ( () otherlv_30= 'P' ) | ( () otherlv_32= 'Q' ) | ( () otherlv_34= 'R' ) | ( () otherlv_36= 'T' ) | ( () otherlv_38= 'U' ) | ( () otherlv_40= 'V' ) | ( () otherlv_42= 'W' ) | ( () otherlv_44= 'X' ) | ( () otherlv_46= 'Y' ) | ( () otherlv_48= 'Z' ) ) )
            // InternalMyFNC.g:772:2: ( ( (lv_var_0_0= 'A' ) ) | ( () otherlv_2= 'B' ) | ( () otherlv_4= 'C' ) | ( () otherlv_6= 'D' ) | ( () otherlv_8= 'E' ) | ( () otherlv_10= 'F' ) | ( () otherlv_12= 'G' ) | ( () otherlv_14= 'H' ) | ( () otherlv_16= 'I' ) | ( () otherlv_18= 'J' ) | ( () otherlv_20= 'K' ) | ( () otherlv_22= 'L' ) | ( () otherlv_24= 'M' ) | ( () otherlv_26= 'N' ) | ( () otherlv_28= 'O' ) | ( () otherlv_30= 'P' ) | ( () otherlv_32= 'Q' ) | ( () otherlv_34= 'R' ) | ( () otherlv_36= 'T' ) | ( () otherlv_38= 'U' ) | ( () otherlv_40= 'V' ) | ( () otherlv_42= 'W' ) | ( () otherlv_44= 'X' ) | ( () otherlv_46= 'Y' ) | ( () otherlv_48= 'Z' ) )
            {
            // InternalMyFNC.g:772:2: ( ( (lv_var_0_0= 'A' ) ) | ( () otherlv_2= 'B' ) | ( () otherlv_4= 'C' ) | ( () otherlv_6= 'D' ) | ( () otherlv_8= 'E' ) | ( () otherlv_10= 'F' ) | ( () otherlv_12= 'G' ) | ( () otherlv_14= 'H' ) | ( () otherlv_16= 'I' ) | ( () otherlv_18= 'J' ) | ( () otherlv_20= 'K' ) | ( () otherlv_22= 'L' ) | ( () otherlv_24= 'M' ) | ( () otherlv_26= 'N' ) | ( () otherlv_28= 'O' ) | ( () otherlv_30= 'P' ) | ( () otherlv_32= 'Q' ) | ( () otherlv_34= 'R' ) | ( () otherlv_36= 'T' ) | ( () otherlv_38= 'U' ) | ( () otherlv_40= 'V' ) | ( () otherlv_42= 'W' ) | ( () otherlv_44= 'X' ) | ( () otherlv_46= 'Y' ) | ( () otherlv_48= 'Z' ) )
            int alt9=25;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt9=1;
                }
                break;
            case 41:
                {
                alt9=2;
                }
                break;
            case 42:
                {
                alt9=3;
                }
                break;
            case 43:
                {
                alt9=4;
                }
                break;
            case 44:
                {
                alt9=5;
                }
                break;
            case 45:
                {
                alt9=6;
                }
                break;
            case 46:
                {
                alt9=7;
                }
                break;
            case 47:
                {
                alt9=8;
                }
                break;
            case 48:
                {
                alt9=9;
                }
                break;
            case 49:
                {
                alt9=10;
                }
                break;
            case 50:
                {
                alt9=11;
                }
                break;
            case 51:
                {
                alt9=12;
                }
                break;
            case 52:
                {
                alt9=13;
                }
                break;
            case 53:
                {
                alt9=14;
                }
                break;
            case 54:
                {
                alt9=15;
                }
                break;
            case 55:
                {
                alt9=16;
                }
                break;
            case 56:
                {
                alt9=17;
                }
                break;
            case 57:
                {
                alt9=18;
                }
                break;
            case 58:
                {
                alt9=19;
                }
                break;
            case 59:
                {
                alt9=20;
                }
                break;
            case 60:
                {
                alt9=21;
                }
                break;
            case 61:
                {
                alt9=22;
                }
                break;
            case 62:
                {
                alt9=23;
                }
                break;
            case 63:
                {
                alt9=24;
                }
                break;
            case 64:
                {
                alt9=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyFNC.g:773:3: ( (lv_var_0_0= 'A' ) )
                    {
                    // InternalMyFNC.g:773:3: ( (lv_var_0_0= 'A' ) )
                    // InternalMyFNC.g:774:4: (lv_var_0_0= 'A' )
                    {
                    // InternalMyFNC.g:774:4: (lv_var_0_0= 'A' )
                    // InternalMyFNC.g:775:5: lv_var_0_0= 'A'
                    {
                    lv_var_0_0=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_var_0_0, grammarAccess.getNonTerminalAccess().getVarAKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNonTerminalRule());
                    					}
                    					setWithLastConsumed(current, "var", lv_var_0_0, "A");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyFNC.g:788:3: ( () otherlv_2= 'B' )
                    {
                    // InternalMyFNC.g:788:3: ( () otherlv_2= 'B' )
                    // InternalMyFNC.g:789:4: () otherlv_2= 'B'
                    {
                    // InternalMyFNC.g:789:4: ()
                    // InternalMyFNC.g:790:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getNonTerminalAccess().getBKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFNC.g:802:3: ( () otherlv_4= 'C' )
                    {
                    // InternalMyFNC.g:802:3: ( () otherlv_4= 'C' )
                    // InternalMyFNC.g:803:4: () otherlv_4= 'C'
                    {
                    // InternalMyFNC.g:803:4: ()
                    // InternalMyFNC.g:804:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getNonTerminalAccess().getCKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFNC.g:816:3: ( () otherlv_6= 'D' )
                    {
                    // InternalMyFNC.g:816:3: ( () otherlv_6= 'D' )
                    // InternalMyFNC.g:817:4: () otherlv_6= 'D'
                    {
                    // InternalMyFNC.g:817:4: ()
                    // InternalMyFNC.g:818:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getNonTerminalAccess().getDKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyFNC.g:830:3: ( () otherlv_8= 'E' )
                    {
                    // InternalMyFNC.g:830:3: ( () otherlv_8= 'E' )
                    // InternalMyFNC.g:831:4: () otherlv_8= 'E'
                    {
                    // InternalMyFNC.g:831:4: ()
                    // InternalMyFNC.g:832:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,44,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getNonTerminalAccess().getEKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyFNC.g:844:3: ( () otherlv_10= 'F' )
                    {
                    // InternalMyFNC.g:844:3: ( () otherlv_10= 'F' )
                    // InternalMyFNC.g:845:4: () otherlv_10= 'F'
                    {
                    // InternalMyFNC.g:845:4: ()
                    // InternalMyFNC.g:846:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,45,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getNonTerminalAccess().getFKeyword_5_1());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyFNC.g:858:3: ( () otherlv_12= 'G' )
                    {
                    // InternalMyFNC.g:858:3: ( () otherlv_12= 'G' )
                    // InternalMyFNC.g:859:4: () otherlv_12= 'G'
                    {
                    // InternalMyFNC.g:859:4: ()
                    // InternalMyFNC.g:860:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_12=(Token)match(input,46,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getNonTerminalAccess().getGKeyword_6_1());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyFNC.g:872:3: ( () otherlv_14= 'H' )
                    {
                    // InternalMyFNC.g:872:3: ( () otherlv_14= 'H' )
                    // InternalMyFNC.g:873:4: () otherlv_14= 'H'
                    {
                    // InternalMyFNC.g:873:4: ()
                    // InternalMyFNC.g:874:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_7_0(),
                    						current);
                    				

                    }

                    otherlv_14=(Token)match(input,47,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getNonTerminalAccess().getHKeyword_7_1());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyFNC.g:886:3: ( () otherlv_16= 'I' )
                    {
                    // InternalMyFNC.g:886:3: ( () otherlv_16= 'I' )
                    // InternalMyFNC.g:887:4: () otherlv_16= 'I'
                    {
                    // InternalMyFNC.g:887:4: ()
                    // InternalMyFNC.g:888:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_8_0(),
                    						current);
                    				

                    }

                    otherlv_16=(Token)match(input,48,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getNonTerminalAccess().getIKeyword_8_1());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyFNC.g:900:3: ( () otherlv_18= 'J' )
                    {
                    // InternalMyFNC.g:900:3: ( () otherlv_18= 'J' )
                    // InternalMyFNC.g:901:4: () otherlv_18= 'J'
                    {
                    // InternalMyFNC.g:901:4: ()
                    // InternalMyFNC.g:902:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_9_0(),
                    						current);
                    				

                    }

                    otherlv_18=(Token)match(input,49,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getNonTerminalAccess().getJKeyword_9_1());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyFNC.g:914:3: ( () otherlv_20= 'K' )
                    {
                    // InternalMyFNC.g:914:3: ( () otherlv_20= 'K' )
                    // InternalMyFNC.g:915:4: () otherlv_20= 'K'
                    {
                    // InternalMyFNC.g:915:4: ()
                    // InternalMyFNC.g:916:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_10_0(),
                    						current);
                    				

                    }

                    otherlv_20=(Token)match(input,50,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getNonTerminalAccess().getKKeyword_10_1());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalMyFNC.g:928:3: ( () otherlv_22= 'L' )
                    {
                    // InternalMyFNC.g:928:3: ( () otherlv_22= 'L' )
                    // InternalMyFNC.g:929:4: () otherlv_22= 'L'
                    {
                    // InternalMyFNC.g:929:4: ()
                    // InternalMyFNC.g:930:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_11_0(),
                    						current);
                    				

                    }

                    otherlv_22=(Token)match(input,51,FOLLOW_2); 

                    				newLeafNode(otherlv_22, grammarAccess.getNonTerminalAccess().getLKeyword_11_1());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalMyFNC.g:942:3: ( () otherlv_24= 'M' )
                    {
                    // InternalMyFNC.g:942:3: ( () otherlv_24= 'M' )
                    // InternalMyFNC.g:943:4: () otherlv_24= 'M'
                    {
                    // InternalMyFNC.g:943:4: ()
                    // InternalMyFNC.g:944:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_12_0(),
                    						current);
                    				

                    }

                    otherlv_24=(Token)match(input,52,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getNonTerminalAccess().getMKeyword_12_1());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalMyFNC.g:956:3: ( () otherlv_26= 'N' )
                    {
                    // InternalMyFNC.g:956:3: ( () otherlv_26= 'N' )
                    // InternalMyFNC.g:957:4: () otherlv_26= 'N'
                    {
                    // InternalMyFNC.g:957:4: ()
                    // InternalMyFNC.g:958:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_13_0(),
                    						current);
                    				

                    }

                    otherlv_26=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_26, grammarAccess.getNonTerminalAccess().getNKeyword_13_1());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalMyFNC.g:970:3: ( () otherlv_28= 'O' )
                    {
                    // InternalMyFNC.g:970:3: ( () otherlv_28= 'O' )
                    // InternalMyFNC.g:971:4: () otherlv_28= 'O'
                    {
                    // InternalMyFNC.g:971:4: ()
                    // InternalMyFNC.g:972:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_14_0(),
                    						current);
                    				

                    }

                    otherlv_28=(Token)match(input,54,FOLLOW_2); 

                    				newLeafNode(otherlv_28, grammarAccess.getNonTerminalAccess().getOKeyword_14_1());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalMyFNC.g:984:3: ( () otherlv_30= 'P' )
                    {
                    // InternalMyFNC.g:984:3: ( () otherlv_30= 'P' )
                    // InternalMyFNC.g:985:4: () otherlv_30= 'P'
                    {
                    // InternalMyFNC.g:985:4: ()
                    // InternalMyFNC.g:986:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_15_0(),
                    						current);
                    				

                    }

                    otherlv_30=(Token)match(input,55,FOLLOW_2); 

                    				newLeafNode(otherlv_30, grammarAccess.getNonTerminalAccess().getPKeyword_15_1());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalMyFNC.g:998:3: ( () otherlv_32= 'Q' )
                    {
                    // InternalMyFNC.g:998:3: ( () otherlv_32= 'Q' )
                    // InternalMyFNC.g:999:4: () otherlv_32= 'Q'
                    {
                    // InternalMyFNC.g:999:4: ()
                    // InternalMyFNC.g:1000:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_16_0(),
                    						current);
                    				

                    }

                    otherlv_32=(Token)match(input,56,FOLLOW_2); 

                    				newLeafNode(otherlv_32, grammarAccess.getNonTerminalAccess().getQKeyword_16_1());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalMyFNC.g:1012:3: ( () otherlv_34= 'R' )
                    {
                    // InternalMyFNC.g:1012:3: ( () otherlv_34= 'R' )
                    // InternalMyFNC.g:1013:4: () otherlv_34= 'R'
                    {
                    // InternalMyFNC.g:1013:4: ()
                    // InternalMyFNC.g:1014:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_17_0(),
                    						current);
                    				

                    }

                    otherlv_34=(Token)match(input,57,FOLLOW_2); 

                    				newLeafNode(otherlv_34, grammarAccess.getNonTerminalAccess().getRKeyword_17_1());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalMyFNC.g:1026:3: ( () otherlv_36= 'T' )
                    {
                    // InternalMyFNC.g:1026:3: ( () otherlv_36= 'T' )
                    // InternalMyFNC.g:1027:4: () otherlv_36= 'T'
                    {
                    // InternalMyFNC.g:1027:4: ()
                    // InternalMyFNC.g:1028:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_18_0(),
                    						current);
                    				

                    }

                    otherlv_36=(Token)match(input,58,FOLLOW_2); 

                    				newLeafNode(otherlv_36, grammarAccess.getNonTerminalAccess().getTKeyword_18_1());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalMyFNC.g:1040:3: ( () otherlv_38= 'U' )
                    {
                    // InternalMyFNC.g:1040:3: ( () otherlv_38= 'U' )
                    // InternalMyFNC.g:1041:4: () otherlv_38= 'U'
                    {
                    // InternalMyFNC.g:1041:4: ()
                    // InternalMyFNC.g:1042:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_19_0(),
                    						current);
                    				

                    }

                    otherlv_38=(Token)match(input,59,FOLLOW_2); 

                    				newLeafNode(otherlv_38, grammarAccess.getNonTerminalAccess().getUKeyword_19_1());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalMyFNC.g:1054:3: ( () otherlv_40= 'V' )
                    {
                    // InternalMyFNC.g:1054:3: ( () otherlv_40= 'V' )
                    // InternalMyFNC.g:1055:4: () otherlv_40= 'V'
                    {
                    // InternalMyFNC.g:1055:4: ()
                    // InternalMyFNC.g:1056:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_20_0(),
                    						current);
                    				

                    }

                    otherlv_40=(Token)match(input,60,FOLLOW_2); 

                    				newLeafNode(otherlv_40, grammarAccess.getNonTerminalAccess().getVKeyword_20_1());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalMyFNC.g:1068:3: ( () otherlv_42= 'W' )
                    {
                    // InternalMyFNC.g:1068:3: ( () otherlv_42= 'W' )
                    // InternalMyFNC.g:1069:4: () otherlv_42= 'W'
                    {
                    // InternalMyFNC.g:1069:4: ()
                    // InternalMyFNC.g:1070:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_21_0(),
                    						current);
                    				

                    }

                    otherlv_42=(Token)match(input,61,FOLLOW_2); 

                    				newLeafNode(otherlv_42, grammarAccess.getNonTerminalAccess().getWKeyword_21_1());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalMyFNC.g:1082:3: ( () otherlv_44= 'X' )
                    {
                    // InternalMyFNC.g:1082:3: ( () otherlv_44= 'X' )
                    // InternalMyFNC.g:1083:4: () otherlv_44= 'X'
                    {
                    // InternalMyFNC.g:1083:4: ()
                    // InternalMyFNC.g:1084:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_22_0(),
                    						current);
                    				

                    }

                    otherlv_44=(Token)match(input,62,FOLLOW_2); 

                    				newLeafNode(otherlv_44, grammarAccess.getNonTerminalAccess().getXKeyword_22_1());
                    			

                    }


                    }
                    break;
                case 24 :
                    // InternalMyFNC.g:1096:3: ( () otherlv_46= 'Y' )
                    {
                    // InternalMyFNC.g:1096:3: ( () otherlv_46= 'Y' )
                    // InternalMyFNC.g:1097:4: () otherlv_46= 'Y'
                    {
                    // InternalMyFNC.g:1097:4: ()
                    // InternalMyFNC.g:1098:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_23_0(),
                    						current);
                    				

                    }

                    otherlv_46=(Token)match(input,63,FOLLOW_2); 

                    				newLeafNode(otherlv_46, grammarAccess.getNonTerminalAccess().getYKeyword_23_1());
                    			

                    }


                    }
                    break;
                case 25 :
                    // InternalMyFNC.g:1110:3: ( () otherlv_48= 'Z' )
                    {
                    // InternalMyFNC.g:1110:3: ( () otherlv_48= 'Z' )
                    // InternalMyFNC.g:1111:4: () otherlv_48= 'Z'
                    {
                    // InternalMyFNC.g:1111:4: ()
                    // InternalMyFNC.g:1112:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNonTerminalAccess().getNonTerminalAction_24_0(),
                    						current);
                    				

                    }

                    otherlv_48=(Token)match(input,64,FOLLOW_2); 

                    				newLeafNode(otherlv_48, grammarAccess.getNonTerminalAccess().getZKeyword_24_1());
                    			

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
    // $ANTLR end "ruleNonTerminal"


    // $ANTLR start "entryRuleBinary"
    // InternalMyFNC.g:1127:1: entryRuleBinary returns [EObject current=null] : iv_ruleBinary= ruleBinary EOF ;
    public final EObject entryRuleBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinary = null;


        try {
            // InternalMyFNC.g:1127:47: (iv_ruleBinary= ruleBinary EOF )
            // InternalMyFNC.g:1128:2: iv_ruleBinary= ruleBinary EOF
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
    // InternalMyFNC.g:1134:1: ruleBinary returns [EObject current=null] : ( ( (lv_first_0_0= ruleNonTerminal ) ) ( (lv_second_1_0= ruleNonTerminal ) ) ) ;
    public final EObject ruleBinary() throws RecognitionException {
        EObject current = null;

        EObject lv_first_0_0 = null;

        EObject lv_second_1_0 = null;



        	enterRule();

        try {
            // InternalMyFNC.g:1140:2: ( ( ( (lv_first_0_0= ruleNonTerminal ) ) ( (lv_second_1_0= ruleNonTerminal ) ) ) )
            // InternalMyFNC.g:1141:2: ( ( (lv_first_0_0= ruleNonTerminal ) ) ( (lv_second_1_0= ruleNonTerminal ) ) )
            {
            // InternalMyFNC.g:1141:2: ( ( (lv_first_0_0= ruleNonTerminal ) ) ( (lv_second_1_0= ruleNonTerminal ) ) )
            // InternalMyFNC.g:1142:3: ( (lv_first_0_0= ruleNonTerminal ) ) ( (lv_second_1_0= ruleNonTerminal ) )
            {
            // InternalMyFNC.g:1142:3: ( (lv_first_0_0= ruleNonTerminal ) )
            // InternalMyFNC.g:1143:4: (lv_first_0_0= ruleNonTerminal )
            {
            // InternalMyFNC.g:1143:4: (lv_first_0_0= ruleNonTerminal )
            // InternalMyFNC.g:1144:5: lv_first_0_0= ruleNonTerminal
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_first_0_0=ruleNonTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryRule());
            					}
            					set(
            						current,
            						"first",
            						lv_first_0_0,
            						"org.xtext.cyk.mydsl.MyFNC.NonTerminal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyFNC.g:1161:3: ( (lv_second_1_0= ruleNonTerminal ) )
            // InternalMyFNC.g:1162:4: (lv_second_1_0= ruleNonTerminal )
            {
            // InternalMyFNC.g:1162:4: (lv_second_1_0= ruleNonTerminal )
            // InternalMyFNC.g:1163:5: lv_second_1_0= ruleNonTerminal
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_second_1_0=ruleNonTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryRule());
            					}
            					set(
            						current,
            						"second",
            						lv_second_1_0,
            						"org.xtext.cyk.mydsl.MyFNC.NonTerminal");
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
    // $ANTLR end "ruleBinary"


    // $ANTLR start "entryRuleInputString"
    // InternalMyFNC.g:1184:1: entryRuleInputString returns [EObject current=null] : iv_ruleInputString= ruleInputString EOF ;
    public final EObject entryRuleInputString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputString = null;


        try {
            // InternalMyFNC.g:1184:52: (iv_ruleInputString= ruleInputString EOF )
            // InternalMyFNC.g:1185:2: iv_ruleInputString= ruleInputString EOF
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
    // InternalMyFNC.g:1191:1: ruleInputString returns [EObject current=null] : (otherlv_0= 'Check' ( (lv_input_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInputString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_input_1_0=null;


        	enterRule();

        try {
            // InternalMyFNC.g:1197:2: ( (otherlv_0= 'Check' ( (lv_input_1_0= RULE_STRING ) ) ) )
            // InternalMyFNC.g:1198:2: (otherlv_0= 'Check' ( (lv_input_1_0= RULE_STRING ) ) )
            {
            // InternalMyFNC.g:1198:2: (otherlv_0= 'Check' ( (lv_input_1_0= RULE_STRING ) ) )
            // InternalMyFNC.g:1199:3: otherlv_0= 'Check' ( (lv_input_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getInputStringAccess().getCheckKeyword_0());
            		
            // InternalMyFNC.g:1203:3: ( (lv_input_1_0= RULE_STRING ) )
            // InternalMyFNC.g:1204:4: (lv_input_1_0= RULE_STRING )
            {
            // InternalMyFNC.g:1204:4: (lv_input_1_0= RULE_STRING )
            // InternalMyFNC.g:1205:5: lv_input_1_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFFF0000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xFFFFFFFFFFFFC000L,0x0000000000000001L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xFFFFFFFFFFFFE000L,0x0000000000000001L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xFFFFFF0000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});

}