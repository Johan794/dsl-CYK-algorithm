package org.xtext.cyk.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.cyk.mydsl.services.MyFNCGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyFNCParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'v'", "'w'", "'x'", "'y'", "'z'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "'->'", "'|'", "'Check'", "'S'"
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

    	public void setGrammarAccess(MyFNCGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGNFC"
    // InternalMyFNC.g:53:1: entryRuleGNFC : ruleGNFC EOF ;
    public final void entryRuleGNFC() throws RecognitionException {
        try {
            // InternalMyFNC.g:54:1: ( ruleGNFC EOF )
            // InternalMyFNC.g:55:1: ruleGNFC EOF
            {
             before(grammarAccess.getGNFCRule()); 
            pushFollow(FOLLOW_1);
            ruleGNFC();

            state._fsp--;

             after(grammarAccess.getGNFCRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGNFC"


    // $ANTLR start "ruleGNFC"
    // InternalMyFNC.g:62:1: ruleGNFC : ( ( rule__GNFC__Group__0 ) ) ;
    public final void ruleGNFC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:66:2: ( ( ( rule__GNFC__Group__0 ) ) )
            // InternalMyFNC.g:67:2: ( ( rule__GNFC__Group__0 ) )
            {
            // InternalMyFNC.g:67:2: ( ( rule__GNFC__Group__0 ) )
            // InternalMyFNC.g:68:3: ( rule__GNFC__Group__0 )
            {
             before(grammarAccess.getGNFCAccess().getGroup()); 
            // InternalMyFNC.g:69:3: ( rule__GNFC__Group__0 )
            // InternalMyFNC.g:69:4: rule__GNFC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GNFC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGNFCAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGNFC"


    // $ANTLR start "entryRuleInitial"
    // InternalMyFNC.g:78:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // InternalMyFNC.g:79:1: ( ruleInitial EOF )
            // InternalMyFNC.g:80:1: ruleInitial EOF
            {
             before(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getInitialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalMyFNC.g:87:1: ruleInitial : ( ( rule__Initial__Group__0 ) ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:91:2: ( ( ( rule__Initial__Group__0 ) ) )
            // InternalMyFNC.g:92:2: ( ( rule__Initial__Group__0 ) )
            {
            // InternalMyFNC.g:92:2: ( ( rule__Initial__Group__0 ) )
            // InternalMyFNC.g:93:3: ( rule__Initial__Group__0 )
            {
             before(grammarAccess.getInitialAccess().getGroup()); 
            // InternalMyFNC.g:94:3: ( rule__Initial__Group__0 )
            // InternalMyFNC.g:94:4: rule__Initial__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Initial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleProduction"
    // InternalMyFNC.g:103:1: entryRuleProduction : ruleProduction EOF ;
    public final void entryRuleProduction() throws RecognitionException {
        try {
            // InternalMyFNC.g:104:1: ( ruleProduction EOF )
            // InternalMyFNC.g:105:1: ruleProduction EOF
            {
             before(grammarAccess.getProductionRule()); 
            pushFollow(FOLLOW_1);
            ruleProduction();

            state._fsp--;

             after(grammarAccess.getProductionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProduction"


    // $ANTLR start "ruleProduction"
    // InternalMyFNC.g:112:1: ruleProduction : ( ( rule__Production__Group__0 ) ) ;
    public final void ruleProduction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:116:2: ( ( ( rule__Production__Group__0 ) ) )
            // InternalMyFNC.g:117:2: ( ( rule__Production__Group__0 ) )
            {
            // InternalMyFNC.g:117:2: ( ( rule__Production__Group__0 ) )
            // InternalMyFNC.g:118:3: ( rule__Production__Group__0 )
            {
             before(grammarAccess.getProductionAccess().getGroup()); 
            // InternalMyFNC.g:119:3: ( rule__Production__Group__0 )
            // InternalMyFNC.g:119:4: rule__Production__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Production__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProduction"


    // $ANTLR start "entryRuleRigth"
    // InternalMyFNC.g:128:1: entryRuleRigth : ruleRigth EOF ;
    public final void entryRuleRigth() throws RecognitionException {
        try {
            // InternalMyFNC.g:129:1: ( ruleRigth EOF )
            // InternalMyFNC.g:130:1: ruleRigth EOF
            {
             before(grammarAccess.getRigthRule()); 
            pushFollow(FOLLOW_1);
            ruleRigth();

            state._fsp--;

             after(grammarAccess.getRigthRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRigth"


    // $ANTLR start "ruleRigth"
    // InternalMyFNC.g:137:1: ruleRigth : ( ( rule__Rigth__Alternatives ) ) ;
    public final void ruleRigth() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:141:2: ( ( ( rule__Rigth__Alternatives ) ) )
            // InternalMyFNC.g:142:2: ( ( rule__Rigth__Alternatives ) )
            {
            // InternalMyFNC.g:142:2: ( ( rule__Rigth__Alternatives ) )
            // InternalMyFNC.g:143:3: ( rule__Rigth__Alternatives )
            {
             before(grammarAccess.getRigthAccess().getAlternatives()); 
            // InternalMyFNC.g:144:3: ( rule__Rigth__Alternatives )
            // InternalMyFNC.g:144:4: rule__Rigth__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Rigth__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRigthAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRigth"


    // $ANTLR start "entryRuleSimple"
    // InternalMyFNC.g:153:1: entryRuleSimple : ruleSimple EOF ;
    public final void entryRuleSimple() throws RecognitionException {
        try {
            // InternalMyFNC.g:154:1: ( ruleSimple EOF )
            // InternalMyFNC.g:155:1: ruleSimple EOF
            {
             before(grammarAccess.getSimpleRule()); 
            pushFollow(FOLLOW_1);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getSimpleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimple"


    // $ANTLR start "ruleSimple"
    // InternalMyFNC.g:162:1: ruleSimple : ( ( rule__Simple__Group__0 ) ) ;
    public final void ruleSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:166:2: ( ( ( rule__Simple__Group__0 ) ) )
            // InternalMyFNC.g:167:2: ( ( rule__Simple__Group__0 ) )
            {
            // InternalMyFNC.g:167:2: ( ( rule__Simple__Group__0 ) )
            // InternalMyFNC.g:168:3: ( rule__Simple__Group__0 )
            {
             before(grammarAccess.getSimpleAccess().getGroup()); 
            // InternalMyFNC.g:169:3: ( rule__Simple__Group__0 )
            // InternalMyFNC.g:169:4: rule__Simple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleNonTerminal"
    // InternalMyFNC.g:178:1: entryRuleNonTerminal : ruleNonTerminal EOF ;
    public final void entryRuleNonTerminal() throws RecognitionException {
        try {
            // InternalMyFNC.g:179:1: ( ruleNonTerminal EOF )
            // InternalMyFNC.g:180:1: ruleNonTerminal EOF
            {
             before(grammarAccess.getNonTerminalRule()); 
            pushFollow(FOLLOW_1);
            ruleNonTerminal();

            state._fsp--;

             after(grammarAccess.getNonTerminalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNonTerminal"


    // $ANTLR start "ruleNonTerminal"
    // InternalMyFNC.g:187:1: ruleNonTerminal : ( ( rule__NonTerminal__Group__0 ) ) ;
    public final void ruleNonTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:191:2: ( ( ( rule__NonTerminal__Group__0 ) ) )
            // InternalMyFNC.g:192:2: ( ( rule__NonTerminal__Group__0 ) )
            {
            // InternalMyFNC.g:192:2: ( ( rule__NonTerminal__Group__0 ) )
            // InternalMyFNC.g:193:3: ( rule__NonTerminal__Group__0 )
            {
             before(grammarAccess.getNonTerminalAccess().getGroup()); 
            // InternalMyFNC.g:194:3: ( rule__NonTerminal__Group__0 )
            // InternalMyFNC.g:194:4: rule__NonTerminal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NonTerminal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonTerminalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonTerminal"


    // $ANTLR start "entryRuleBinary"
    // InternalMyFNC.g:203:1: entryRuleBinary : ruleBinary EOF ;
    public final void entryRuleBinary() throws RecognitionException {
        try {
            // InternalMyFNC.g:204:1: ( ruleBinary EOF )
            // InternalMyFNC.g:205:1: ruleBinary EOF
            {
             before(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_1);
            ruleBinary();

            state._fsp--;

             after(grammarAccess.getBinaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinary"


    // $ANTLR start "ruleBinary"
    // InternalMyFNC.g:212:1: ruleBinary : ( ( rule__Binary__Group__0 ) ) ;
    public final void ruleBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:216:2: ( ( ( rule__Binary__Group__0 ) ) )
            // InternalMyFNC.g:217:2: ( ( rule__Binary__Group__0 ) )
            {
            // InternalMyFNC.g:217:2: ( ( rule__Binary__Group__0 ) )
            // InternalMyFNC.g:218:3: ( rule__Binary__Group__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup()); 
            // InternalMyFNC.g:219:3: ( rule__Binary__Group__0 )
            // InternalMyFNC.g:219:4: rule__Binary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinary"


    // $ANTLR start "entryRuleInputString"
    // InternalMyFNC.g:228:1: entryRuleInputString : ruleInputString EOF ;
    public final void entryRuleInputString() throws RecognitionException {
        try {
            // InternalMyFNC.g:229:1: ( ruleInputString EOF )
            // InternalMyFNC.g:230:1: ruleInputString EOF
            {
             before(grammarAccess.getInputStringRule()); 
            pushFollow(FOLLOW_1);
            ruleInputString();

            state._fsp--;

             after(grammarAccess.getInputStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputString"


    // $ANTLR start "ruleInputString"
    // InternalMyFNC.g:237:1: ruleInputString : ( ( rule__InputString__Group__0 ) ) ;
    public final void ruleInputString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:241:2: ( ( ( rule__InputString__Group__0 ) ) )
            // InternalMyFNC.g:242:2: ( ( rule__InputString__Group__0 ) )
            {
            // InternalMyFNC.g:242:2: ( ( rule__InputString__Group__0 ) )
            // InternalMyFNC.g:243:3: ( rule__InputString__Group__0 )
            {
             before(grammarAccess.getInputStringAccess().getGroup()); 
            // InternalMyFNC.g:244:3: ( rule__InputString__Group__0 )
            // InternalMyFNC.g:244:4: rule__InputString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputString"


    // $ANTLR start "rule__Rigth__Alternatives"
    // InternalMyFNC.g:252:1: rule__Rigth__Alternatives : ( ( ( rule__Rigth__SimpleAssignment_0 ) ) | ( ( rule__Rigth__BinaryAssignment_1 ) ) );
    public final void rule__Rigth__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:256:1: ( ( ( rule__Rigth__SimpleAssignment_0 ) ) | ( ( rule__Rigth__BinaryAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=35)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=36 && LA1_0<=60)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyFNC.g:257:2: ( ( rule__Rigth__SimpleAssignment_0 ) )
                    {
                    // InternalMyFNC.g:257:2: ( ( rule__Rigth__SimpleAssignment_0 ) )
                    // InternalMyFNC.g:258:3: ( rule__Rigth__SimpleAssignment_0 )
                    {
                     before(grammarAccess.getRigthAccess().getSimpleAssignment_0()); 
                    // InternalMyFNC.g:259:3: ( rule__Rigth__SimpleAssignment_0 )
                    // InternalMyFNC.g:259:4: rule__Rigth__SimpleAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rigth__SimpleAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRigthAccess().getSimpleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFNC.g:263:2: ( ( rule__Rigth__BinaryAssignment_1 ) )
                    {
                    // InternalMyFNC.g:263:2: ( ( rule__Rigth__BinaryAssignment_1 ) )
                    // InternalMyFNC.g:264:3: ( rule__Rigth__BinaryAssignment_1 )
                    {
                     before(grammarAccess.getRigthAccess().getBinaryAssignment_1()); 
                    // InternalMyFNC.g:265:3: ( rule__Rigth__BinaryAssignment_1 )
                    // InternalMyFNC.g:265:4: rule__Rigth__BinaryAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rigth__BinaryAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRigthAccess().getBinaryAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rigth__Alternatives"


    // $ANTLR start "rule__Simple__AlphaAlternatives_1_0"
    // InternalMyFNC.g:273:1: rule__Simple__AlphaAlternatives_1_0 : ( ( 'a' ) | ( 'b' ) | ( 'c' ) | ( 'd' ) | ( 'e' ) | ( 'f' ) | ( 'g' ) | ( 'h' ) | ( 'i' ) | ( 'j' ) | ( 'k' ) | ( 'l' ) | ( 'm' ) | ( 'n' ) | ( 'o' ) | ( 'p' ) | ( 'q' ) | ( 'r' ) | ( 's' ) | ( 't' ) | ( 'v' ) | ( 'w' ) | ( 'x' ) | ( 'y' ) | ( 'z' ) );
    public final void rule__Simple__AlphaAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:277:1: ( ( 'a' ) | ( 'b' ) | ( 'c' ) | ( 'd' ) | ( 'e' ) | ( 'f' ) | ( 'g' ) | ( 'h' ) | ( 'i' ) | ( 'j' ) | ( 'k' ) | ( 'l' ) | ( 'm' ) | ( 'n' ) | ( 'o' ) | ( 'p' ) | ( 'q' ) | ( 'r' ) | ( 's' ) | ( 't' ) | ( 'v' ) | ( 'w' ) | ( 'x' ) | ( 'y' ) | ( 'z' ) )
            int alt2=25;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            case 20:
                {
                alt2=10;
                }
                break;
            case 21:
                {
                alt2=11;
                }
                break;
            case 22:
                {
                alt2=12;
                }
                break;
            case 23:
                {
                alt2=13;
                }
                break;
            case 24:
                {
                alt2=14;
                }
                break;
            case 25:
                {
                alt2=15;
                }
                break;
            case 26:
                {
                alt2=16;
                }
                break;
            case 27:
                {
                alt2=17;
                }
                break;
            case 28:
                {
                alt2=18;
                }
                break;
            case 29:
                {
                alt2=19;
                }
                break;
            case 30:
                {
                alt2=20;
                }
                break;
            case 31:
                {
                alt2=21;
                }
                break;
            case 32:
                {
                alt2=22;
                }
                break;
            case 33:
                {
                alt2=23;
                }
                break;
            case 34:
                {
                alt2=24;
                }
                break;
            case 35:
                {
                alt2=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyFNC.g:278:2: ( 'a' )
                    {
                    // InternalMyFNC.g:278:2: ( 'a' )
                    // InternalMyFNC.g:279:3: 'a'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaAKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaAKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFNC.g:284:2: ( 'b' )
                    {
                    // InternalMyFNC.g:284:2: ( 'b' )
                    // InternalMyFNC.g:285:3: 'b'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaBKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaBKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFNC.g:290:2: ( 'c' )
                    {
                    // InternalMyFNC.g:290:2: ( 'c' )
                    // InternalMyFNC.g:291:3: 'c'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaCKeyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaCKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFNC.g:296:2: ( 'd' )
                    {
                    // InternalMyFNC.g:296:2: ( 'd' )
                    // InternalMyFNC.g:297:3: 'd'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaDKeyword_1_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaDKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyFNC.g:302:2: ( 'e' )
                    {
                    // InternalMyFNC.g:302:2: ( 'e' )
                    // InternalMyFNC.g:303:3: 'e'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaEKeyword_1_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaEKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyFNC.g:308:2: ( 'f' )
                    {
                    // InternalMyFNC.g:308:2: ( 'f' )
                    // InternalMyFNC.g:309:3: 'f'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaFKeyword_1_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaFKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyFNC.g:314:2: ( 'g' )
                    {
                    // InternalMyFNC.g:314:2: ( 'g' )
                    // InternalMyFNC.g:315:3: 'g'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaGKeyword_1_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaGKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyFNC.g:320:2: ( 'h' )
                    {
                    // InternalMyFNC.g:320:2: ( 'h' )
                    // InternalMyFNC.g:321:3: 'h'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaHKeyword_1_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaHKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyFNC.g:326:2: ( 'i' )
                    {
                    // InternalMyFNC.g:326:2: ( 'i' )
                    // InternalMyFNC.g:327:3: 'i'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaIKeyword_1_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaIKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyFNC.g:332:2: ( 'j' )
                    {
                    // InternalMyFNC.g:332:2: ( 'j' )
                    // InternalMyFNC.g:333:3: 'j'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaJKeyword_1_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaJKeyword_1_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyFNC.g:338:2: ( 'k' )
                    {
                    // InternalMyFNC.g:338:2: ( 'k' )
                    // InternalMyFNC.g:339:3: 'k'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaKKeyword_1_0_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaKKeyword_1_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyFNC.g:344:2: ( 'l' )
                    {
                    // InternalMyFNC.g:344:2: ( 'l' )
                    // InternalMyFNC.g:345:3: 'l'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaLKeyword_1_0_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaLKeyword_1_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyFNC.g:350:2: ( 'm' )
                    {
                    // InternalMyFNC.g:350:2: ( 'm' )
                    // InternalMyFNC.g:351:3: 'm'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaMKeyword_1_0_12()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaMKeyword_1_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyFNC.g:356:2: ( 'n' )
                    {
                    // InternalMyFNC.g:356:2: ( 'n' )
                    // InternalMyFNC.g:357:3: 'n'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaNKeyword_1_0_13()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaNKeyword_1_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMyFNC.g:362:2: ( 'o' )
                    {
                    // InternalMyFNC.g:362:2: ( 'o' )
                    // InternalMyFNC.g:363:3: 'o'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaOKeyword_1_0_14()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaOKeyword_1_0_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalMyFNC.g:368:2: ( 'p' )
                    {
                    // InternalMyFNC.g:368:2: ( 'p' )
                    // InternalMyFNC.g:369:3: 'p'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaPKeyword_1_0_15()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaPKeyword_1_0_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalMyFNC.g:374:2: ( 'q' )
                    {
                    // InternalMyFNC.g:374:2: ( 'q' )
                    // InternalMyFNC.g:375:3: 'q'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaQKeyword_1_0_16()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaQKeyword_1_0_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalMyFNC.g:380:2: ( 'r' )
                    {
                    // InternalMyFNC.g:380:2: ( 'r' )
                    // InternalMyFNC.g:381:3: 'r'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaRKeyword_1_0_17()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaRKeyword_1_0_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalMyFNC.g:386:2: ( 's' )
                    {
                    // InternalMyFNC.g:386:2: ( 's' )
                    // InternalMyFNC.g:387:3: 's'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaSKeyword_1_0_18()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaSKeyword_1_0_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalMyFNC.g:392:2: ( 't' )
                    {
                    // InternalMyFNC.g:392:2: ( 't' )
                    // InternalMyFNC.g:393:3: 't'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaTKeyword_1_0_19()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaTKeyword_1_0_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalMyFNC.g:398:2: ( 'v' )
                    {
                    // InternalMyFNC.g:398:2: ( 'v' )
                    // InternalMyFNC.g:399:3: 'v'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaVKeyword_1_0_20()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaVKeyword_1_0_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalMyFNC.g:404:2: ( 'w' )
                    {
                    // InternalMyFNC.g:404:2: ( 'w' )
                    // InternalMyFNC.g:405:3: 'w'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaWKeyword_1_0_21()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaWKeyword_1_0_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalMyFNC.g:410:2: ( 'x' )
                    {
                    // InternalMyFNC.g:410:2: ( 'x' )
                    // InternalMyFNC.g:411:3: 'x'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaXKeyword_1_0_22()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaXKeyword_1_0_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalMyFNC.g:416:2: ( 'y' )
                    {
                    // InternalMyFNC.g:416:2: ( 'y' )
                    // InternalMyFNC.g:417:3: 'y'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaYKeyword_1_0_23()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaYKeyword_1_0_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalMyFNC.g:422:2: ( 'z' )
                    {
                    // InternalMyFNC.g:422:2: ( 'z' )
                    // InternalMyFNC.g:423:3: 'z'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaZKeyword_1_0_24()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaZKeyword_1_0_24()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__AlphaAlternatives_1_0"


    // $ANTLR start "rule__NonTerminal__VarAlternatives_1_0"
    // InternalMyFNC.g:432:1: rule__NonTerminal__VarAlternatives_1_0 : ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'H' ) | ( 'I' ) | ( 'J' ) | ( 'K' ) | ( 'L' ) | ( 'M' ) | ( 'N' ) | ( 'O' ) | ( 'P' ) | ( 'Q' ) | ( 'R' ) | ( 'T' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'X' ) | ( 'Y' ) | ( 'Z' ) );
    public final void rule__NonTerminal__VarAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:436:1: ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'H' ) | ( 'I' ) | ( 'J' ) | ( 'K' ) | ( 'L' ) | ( 'M' ) | ( 'N' ) | ( 'O' ) | ( 'P' ) | ( 'Q' ) | ( 'R' ) | ( 'T' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'X' ) | ( 'Y' ) | ( 'Z' ) )
            int alt3=25;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 38:
                {
                alt3=3;
                }
                break;
            case 39:
                {
                alt3=4;
                }
                break;
            case 40:
                {
                alt3=5;
                }
                break;
            case 41:
                {
                alt3=6;
                }
                break;
            case 42:
                {
                alt3=7;
                }
                break;
            case 43:
                {
                alt3=8;
                }
                break;
            case 44:
                {
                alt3=9;
                }
                break;
            case 45:
                {
                alt3=10;
                }
                break;
            case 46:
                {
                alt3=11;
                }
                break;
            case 47:
                {
                alt3=12;
                }
                break;
            case 48:
                {
                alt3=13;
                }
                break;
            case 49:
                {
                alt3=14;
                }
                break;
            case 50:
                {
                alt3=15;
                }
                break;
            case 51:
                {
                alt3=16;
                }
                break;
            case 52:
                {
                alt3=17;
                }
                break;
            case 53:
                {
                alt3=18;
                }
                break;
            case 54:
                {
                alt3=19;
                }
                break;
            case 55:
                {
                alt3=20;
                }
                break;
            case 56:
                {
                alt3=21;
                }
                break;
            case 57:
                {
                alt3=22;
                }
                break;
            case 58:
                {
                alt3=23;
                }
                break;
            case 59:
                {
                alt3=24;
                }
                break;
            case 60:
                {
                alt3=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyFNC.g:437:2: ( 'A' )
                    {
                    // InternalMyFNC.g:437:2: ( 'A' )
                    // InternalMyFNC.g:438:3: 'A'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarAKeyword_1_0_0()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarAKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFNC.g:443:2: ( 'B' )
                    {
                    // InternalMyFNC.g:443:2: ( 'B' )
                    // InternalMyFNC.g:444:3: 'B'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarBKeyword_1_0_1()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarBKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFNC.g:449:2: ( 'C' )
                    {
                    // InternalMyFNC.g:449:2: ( 'C' )
                    // InternalMyFNC.g:450:3: 'C'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarCKeyword_1_0_2()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarCKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFNC.g:455:2: ( 'D' )
                    {
                    // InternalMyFNC.g:455:2: ( 'D' )
                    // InternalMyFNC.g:456:3: 'D'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarDKeyword_1_0_3()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarDKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyFNC.g:461:2: ( 'E' )
                    {
                    // InternalMyFNC.g:461:2: ( 'E' )
                    // InternalMyFNC.g:462:3: 'E'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarEKeyword_1_0_4()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarEKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyFNC.g:467:2: ( 'F' )
                    {
                    // InternalMyFNC.g:467:2: ( 'F' )
                    // InternalMyFNC.g:468:3: 'F'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarFKeyword_1_0_5()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarFKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyFNC.g:473:2: ( 'G' )
                    {
                    // InternalMyFNC.g:473:2: ( 'G' )
                    // InternalMyFNC.g:474:3: 'G'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarGKeyword_1_0_6()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarGKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyFNC.g:479:2: ( 'H' )
                    {
                    // InternalMyFNC.g:479:2: ( 'H' )
                    // InternalMyFNC.g:480:3: 'H'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarHKeyword_1_0_7()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarHKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyFNC.g:485:2: ( 'I' )
                    {
                    // InternalMyFNC.g:485:2: ( 'I' )
                    // InternalMyFNC.g:486:3: 'I'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarIKeyword_1_0_8()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarIKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyFNC.g:491:2: ( 'J' )
                    {
                    // InternalMyFNC.g:491:2: ( 'J' )
                    // InternalMyFNC.g:492:3: 'J'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarJKeyword_1_0_9()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarJKeyword_1_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyFNC.g:497:2: ( 'K' )
                    {
                    // InternalMyFNC.g:497:2: ( 'K' )
                    // InternalMyFNC.g:498:3: 'K'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarKKeyword_1_0_10()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarKKeyword_1_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyFNC.g:503:2: ( 'L' )
                    {
                    // InternalMyFNC.g:503:2: ( 'L' )
                    // InternalMyFNC.g:504:3: 'L'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarLKeyword_1_0_11()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarLKeyword_1_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyFNC.g:509:2: ( 'M' )
                    {
                    // InternalMyFNC.g:509:2: ( 'M' )
                    // InternalMyFNC.g:510:3: 'M'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarMKeyword_1_0_12()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarMKeyword_1_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyFNC.g:515:2: ( 'N' )
                    {
                    // InternalMyFNC.g:515:2: ( 'N' )
                    // InternalMyFNC.g:516:3: 'N'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarNKeyword_1_0_13()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarNKeyword_1_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMyFNC.g:521:2: ( 'O' )
                    {
                    // InternalMyFNC.g:521:2: ( 'O' )
                    // InternalMyFNC.g:522:3: 'O'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarOKeyword_1_0_14()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarOKeyword_1_0_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalMyFNC.g:527:2: ( 'P' )
                    {
                    // InternalMyFNC.g:527:2: ( 'P' )
                    // InternalMyFNC.g:528:3: 'P'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarPKeyword_1_0_15()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarPKeyword_1_0_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalMyFNC.g:533:2: ( 'Q' )
                    {
                    // InternalMyFNC.g:533:2: ( 'Q' )
                    // InternalMyFNC.g:534:3: 'Q'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarQKeyword_1_0_16()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarQKeyword_1_0_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalMyFNC.g:539:2: ( 'R' )
                    {
                    // InternalMyFNC.g:539:2: ( 'R' )
                    // InternalMyFNC.g:540:3: 'R'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarRKeyword_1_0_17()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarRKeyword_1_0_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalMyFNC.g:545:2: ( 'T' )
                    {
                    // InternalMyFNC.g:545:2: ( 'T' )
                    // InternalMyFNC.g:546:3: 'T'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarTKeyword_1_0_18()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarTKeyword_1_0_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalMyFNC.g:551:2: ( 'U' )
                    {
                    // InternalMyFNC.g:551:2: ( 'U' )
                    // InternalMyFNC.g:552:3: 'U'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarUKeyword_1_0_19()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarUKeyword_1_0_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalMyFNC.g:557:2: ( 'V' )
                    {
                    // InternalMyFNC.g:557:2: ( 'V' )
                    // InternalMyFNC.g:558:3: 'V'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarVKeyword_1_0_20()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarVKeyword_1_0_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalMyFNC.g:563:2: ( 'W' )
                    {
                    // InternalMyFNC.g:563:2: ( 'W' )
                    // InternalMyFNC.g:564:3: 'W'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarWKeyword_1_0_21()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarWKeyword_1_0_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalMyFNC.g:569:2: ( 'X' )
                    {
                    // InternalMyFNC.g:569:2: ( 'X' )
                    // InternalMyFNC.g:570:3: 'X'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarXKeyword_1_0_22()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarXKeyword_1_0_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalMyFNC.g:575:2: ( 'Y' )
                    {
                    // InternalMyFNC.g:575:2: ( 'Y' )
                    // InternalMyFNC.g:576:3: 'Y'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarYKeyword_1_0_23()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarYKeyword_1_0_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalMyFNC.g:581:2: ( 'Z' )
                    {
                    // InternalMyFNC.g:581:2: ( 'Z' )
                    // InternalMyFNC.g:582:3: 'Z'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarZKeyword_1_0_24()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarZKeyword_1_0_24()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonTerminal__VarAlternatives_1_0"


    // $ANTLR start "rule__GNFC__Group__0"
    // InternalMyFNC.g:591:1: rule__GNFC__Group__0 : rule__GNFC__Group__0__Impl rule__GNFC__Group__1 ;
    public final void rule__GNFC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:595:1: ( rule__GNFC__Group__0__Impl rule__GNFC__Group__1 )
            // InternalMyFNC.g:596:2: rule__GNFC__Group__0__Impl rule__GNFC__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GNFC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GNFC__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNFC__Group__0"


    // $ANTLR start "rule__GNFC__Group__0__Impl"
    // InternalMyFNC.g:603:1: rule__GNFC__Group__0__Impl : ( ( rule__GNFC__InitAssignment_0 ) ) ;
    public final void rule__GNFC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:607:1: ( ( ( rule__GNFC__InitAssignment_0 ) ) )
            // InternalMyFNC.g:608:1: ( ( rule__GNFC__InitAssignment_0 ) )
            {
            // InternalMyFNC.g:608:1: ( ( rule__GNFC__InitAssignment_0 ) )
            // InternalMyFNC.g:609:2: ( rule__GNFC__InitAssignment_0 )
            {
             before(grammarAccess.getGNFCAccess().getInitAssignment_0()); 
            // InternalMyFNC.g:610:2: ( rule__GNFC__InitAssignment_0 )
            // InternalMyFNC.g:610:3: rule__GNFC__InitAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GNFC__InitAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGNFCAccess().getInitAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNFC__Group__0__Impl"


    // $ANTLR start "rule__GNFC__Group__1"
    // InternalMyFNC.g:618:1: rule__GNFC__Group__1 : rule__GNFC__Group__1__Impl rule__GNFC__Group__2 ;
    public final void rule__GNFC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:622:1: ( rule__GNFC__Group__1__Impl rule__GNFC__Group__2 )
            // InternalMyFNC.g:623:2: rule__GNFC__Group__1__Impl rule__GNFC__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__GNFC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GNFC__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNFC__Group__1"


    // $ANTLR start "rule__GNFC__Group__1__Impl"
    // InternalMyFNC.g:630:1: rule__GNFC__Group__1__Impl : ( ( rule__GNFC__ProductionsAssignment_1 )* ) ;
    public final void rule__GNFC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:634:1: ( ( ( rule__GNFC__ProductionsAssignment_1 )* ) )
            // InternalMyFNC.g:635:1: ( ( rule__GNFC__ProductionsAssignment_1 )* )
            {
            // InternalMyFNC.g:635:1: ( ( rule__GNFC__ProductionsAssignment_1 )* )
            // InternalMyFNC.g:636:2: ( rule__GNFC__ProductionsAssignment_1 )*
            {
             before(grammarAccess.getGNFCAccess().getProductionsAssignment_1()); 
            // InternalMyFNC.g:637:2: ( rule__GNFC__ProductionsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=36 && LA4_0<=60)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyFNC.g:637:3: rule__GNFC__ProductionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__GNFC__ProductionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getGNFCAccess().getProductionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNFC__Group__1__Impl"


    // $ANTLR start "rule__GNFC__Group__2"
    // InternalMyFNC.g:645:1: rule__GNFC__Group__2 : rule__GNFC__Group__2__Impl ;
    public final void rule__GNFC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:649:1: ( rule__GNFC__Group__2__Impl )
            // InternalMyFNC.g:650:2: rule__GNFC__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GNFC__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNFC__Group__2"


    // $ANTLR start "rule__GNFC__Group__2__Impl"
    // InternalMyFNC.g:656:1: rule__GNFC__Group__2__Impl : ( ( rule__GNFC__FinalAssignment_2 ) ) ;
    public final void rule__GNFC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:660:1: ( ( ( rule__GNFC__FinalAssignment_2 ) ) )
            // InternalMyFNC.g:661:1: ( ( rule__GNFC__FinalAssignment_2 ) )
            {
            // InternalMyFNC.g:661:1: ( ( rule__GNFC__FinalAssignment_2 ) )
            // InternalMyFNC.g:662:2: ( rule__GNFC__FinalAssignment_2 )
            {
             before(grammarAccess.getGNFCAccess().getFinalAssignment_2()); 
            // InternalMyFNC.g:663:2: ( rule__GNFC__FinalAssignment_2 )
            // InternalMyFNC.g:663:3: rule__GNFC__FinalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GNFC__FinalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGNFCAccess().getFinalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNFC__Group__2__Impl"


    // $ANTLR start "rule__Initial__Group__0"
    // InternalMyFNC.g:672:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:676:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // InternalMyFNC.g:677:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Initial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__0"


    // $ANTLR start "rule__Initial__Group__0__Impl"
    // InternalMyFNC.g:684:1: rule__Initial__Group__0__Impl : ( ( rule__Initial__LeftAssignment_0 ) ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:688:1: ( ( ( rule__Initial__LeftAssignment_0 ) ) )
            // InternalMyFNC.g:689:1: ( ( rule__Initial__LeftAssignment_0 ) )
            {
            // InternalMyFNC.g:689:1: ( ( rule__Initial__LeftAssignment_0 ) )
            // InternalMyFNC.g:690:2: ( rule__Initial__LeftAssignment_0 )
            {
             before(grammarAccess.getInitialAccess().getLeftAssignment_0()); 
            // InternalMyFNC.g:691:2: ( rule__Initial__LeftAssignment_0 )
            // InternalMyFNC.g:691:3: rule__Initial__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Initial__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__0__Impl"


    // $ANTLR start "rule__Initial__Group__1"
    // InternalMyFNC.g:699:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:703:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // InternalMyFNC.g:704:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Initial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__1"


    // $ANTLR start "rule__Initial__Group__1__Impl"
    // InternalMyFNC.g:711:1: rule__Initial__Group__1__Impl : ( '->' ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:715:1: ( ( '->' ) )
            // InternalMyFNC.g:716:1: ( '->' )
            {
            // InternalMyFNC.g:716:1: ( '->' )
            // InternalMyFNC.g:717:2: '->'
            {
             before(grammarAccess.getInitialAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__1__Impl"


    // $ANTLR start "rule__Initial__Group__2"
    // InternalMyFNC.g:726:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl rule__Initial__Group__3 ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:730:1: ( rule__Initial__Group__2__Impl rule__Initial__Group__3 )
            // InternalMyFNC.g:731:2: rule__Initial__Group__2__Impl rule__Initial__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Initial__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__2"


    // $ANTLR start "rule__Initial__Group__2__Impl"
    // InternalMyFNC.g:738:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__RigthAssignment_2 ) ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:742:1: ( ( ( rule__Initial__RigthAssignment_2 ) ) )
            // InternalMyFNC.g:743:1: ( ( rule__Initial__RigthAssignment_2 ) )
            {
            // InternalMyFNC.g:743:1: ( ( rule__Initial__RigthAssignment_2 ) )
            // InternalMyFNC.g:744:2: ( rule__Initial__RigthAssignment_2 )
            {
             before(grammarAccess.getInitialAccess().getRigthAssignment_2()); 
            // InternalMyFNC.g:745:2: ( rule__Initial__RigthAssignment_2 )
            // InternalMyFNC.g:745:3: rule__Initial__RigthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Initial__RigthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getRigthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__2__Impl"


    // $ANTLR start "rule__Initial__Group__3"
    // InternalMyFNC.g:753:1: rule__Initial__Group__3 : rule__Initial__Group__3__Impl ;
    public final void rule__Initial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:757:1: ( rule__Initial__Group__3__Impl )
            // InternalMyFNC.g:758:2: rule__Initial__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Initial__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__3"


    // $ANTLR start "rule__Initial__Group__3__Impl"
    // InternalMyFNC.g:764:1: rule__Initial__Group__3__Impl : ( ( rule__Initial__Group_3__0 )* ) ;
    public final void rule__Initial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:768:1: ( ( ( rule__Initial__Group_3__0 )* ) )
            // InternalMyFNC.g:769:1: ( ( rule__Initial__Group_3__0 )* )
            {
            // InternalMyFNC.g:769:1: ( ( rule__Initial__Group_3__0 )* )
            // InternalMyFNC.g:770:2: ( rule__Initial__Group_3__0 )*
            {
             before(grammarAccess.getInitialAccess().getGroup_3()); 
            // InternalMyFNC.g:771:2: ( rule__Initial__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==62) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyFNC.g:771:3: rule__Initial__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Initial__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getInitialAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__3__Impl"


    // $ANTLR start "rule__Initial__Group_3__0"
    // InternalMyFNC.g:780:1: rule__Initial__Group_3__0 : rule__Initial__Group_3__0__Impl rule__Initial__Group_3__1 ;
    public final void rule__Initial__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:784:1: ( rule__Initial__Group_3__0__Impl rule__Initial__Group_3__1 )
            // InternalMyFNC.g:785:2: rule__Initial__Group_3__0__Impl rule__Initial__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Initial__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group_3__0"


    // $ANTLR start "rule__Initial__Group_3__0__Impl"
    // InternalMyFNC.g:792:1: rule__Initial__Group_3__0__Impl : ( ( ( '|' ) ) ( ( '|' )* ) ) ;
    public final void rule__Initial__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:796:1: ( ( ( ( '|' ) ) ( ( '|' )* ) ) )
            // InternalMyFNC.g:797:1: ( ( ( '|' ) ) ( ( '|' )* ) )
            {
            // InternalMyFNC.g:797:1: ( ( ( '|' ) ) ( ( '|' )* ) )
            // InternalMyFNC.g:798:2: ( ( '|' ) ) ( ( '|' )* )
            {
            // InternalMyFNC.g:798:2: ( ( '|' ) )
            // InternalMyFNC.g:799:3: ( '|' )
            {
             before(grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0()); 
            // InternalMyFNC.g:800:3: ( '|' )
            // InternalMyFNC.g:800:4: '|'
            {
            match(input,62,FOLLOW_8); 

            }

             after(grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0()); 

            }

            // InternalMyFNC.g:803:2: ( ( '|' )* )
            // InternalMyFNC.g:804:3: ( '|' )*
            {
             before(grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0()); 
            // InternalMyFNC.g:805:3: ( '|' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==62) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyFNC.g:805:4: '|'
            	    {
            	    match(input,62,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group_3__0__Impl"


    // $ANTLR start "rule__Initial__Group_3__1"
    // InternalMyFNC.g:814:1: rule__Initial__Group_3__1 : rule__Initial__Group_3__1__Impl ;
    public final void rule__Initial__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:818:1: ( rule__Initial__Group_3__1__Impl )
            // InternalMyFNC.g:819:2: rule__Initial__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Initial__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group_3__1"


    // $ANTLR start "rule__Initial__Group_3__1__Impl"
    // InternalMyFNC.g:825:1: rule__Initial__Group_3__1__Impl : ( ( rule__Initial__RigthAssignment_3_1 ) ) ;
    public final void rule__Initial__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:829:1: ( ( ( rule__Initial__RigthAssignment_3_1 ) ) )
            // InternalMyFNC.g:830:1: ( ( rule__Initial__RigthAssignment_3_1 ) )
            {
            // InternalMyFNC.g:830:1: ( ( rule__Initial__RigthAssignment_3_1 ) )
            // InternalMyFNC.g:831:2: ( rule__Initial__RigthAssignment_3_1 )
            {
             before(grammarAccess.getInitialAccess().getRigthAssignment_3_1()); 
            // InternalMyFNC.g:832:2: ( rule__Initial__RigthAssignment_3_1 )
            // InternalMyFNC.g:832:3: rule__Initial__RigthAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Initial__RigthAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getRigthAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group_3__1__Impl"


    // $ANTLR start "rule__Production__Group__0"
    // InternalMyFNC.g:841:1: rule__Production__Group__0 : rule__Production__Group__0__Impl rule__Production__Group__1 ;
    public final void rule__Production__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:845:1: ( rule__Production__Group__0__Impl rule__Production__Group__1 )
            // InternalMyFNC.g:846:2: rule__Production__Group__0__Impl rule__Production__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Production__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Production__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group__0"


    // $ANTLR start "rule__Production__Group__0__Impl"
    // InternalMyFNC.g:853:1: rule__Production__Group__0__Impl : ( ( rule__Production__LeftAssignment_0 ) ) ;
    public final void rule__Production__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:857:1: ( ( ( rule__Production__LeftAssignment_0 ) ) )
            // InternalMyFNC.g:858:1: ( ( rule__Production__LeftAssignment_0 ) )
            {
            // InternalMyFNC.g:858:1: ( ( rule__Production__LeftAssignment_0 ) )
            // InternalMyFNC.g:859:2: ( rule__Production__LeftAssignment_0 )
            {
             before(grammarAccess.getProductionAccess().getLeftAssignment_0()); 
            // InternalMyFNC.g:860:2: ( rule__Production__LeftAssignment_0 )
            // InternalMyFNC.g:860:3: rule__Production__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Production__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProductionAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group__0__Impl"


    // $ANTLR start "rule__Production__Group__1"
    // InternalMyFNC.g:868:1: rule__Production__Group__1 : rule__Production__Group__1__Impl rule__Production__Group__2 ;
    public final void rule__Production__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:872:1: ( rule__Production__Group__1__Impl rule__Production__Group__2 )
            // InternalMyFNC.g:873:2: rule__Production__Group__1__Impl rule__Production__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Production__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Production__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group__1"


    // $ANTLR start "rule__Production__Group__1__Impl"
    // InternalMyFNC.g:880:1: rule__Production__Group__1__Impl : ( '->' ) ;
    public final void rule__Production__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:884:1: ( ( '->' ) )
            // InternalMyFNC.g:885:1: ( '->' )
            {
            // InternalMyFNC.g:885:1: ( '->' )
            // InternalMyFNC.g:886:2: '->'
            {
             before(grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group__1__Impl"


    // $ANTLR start "rule__Production__Group__2"
    // InternalMyFNC.g:895:1: rule__Production__Group__2 : rule__Production__Group__2__Impl rule__Production__Group__3 ;
    public final void rule__Production__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:899:1: ( rule__Production__Group__2__Impl rule__Production__Group__3 )
            // InternalMyFNC.g:900:2: rule__Production__Group__2__Impl rule__Production__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Production__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Production__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group__2"


    // $ANTLR start "rule__Production__Group__2__Impl"
    // InternalMyFNC.g:907:1: rule__Production__Group__2__Impl : ( ( rule__Production__RigthAssignment_2 ) ) ;
    public final void rule__Production__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:911:1: ( ( ( rule__Production__RigthAssignment_2 ) ) )
            // InternalMyFNC.g:912:1: ( ( rule__Production__RigthAssignment_2 ) )
            {
            // InternalMyFNC.g:912:1: ( ( rule__Production__RigthAssignment_2 ) )
            // InternalMyFNC.g:913:2: ( rule__Production__RigthAssignment_2 )
            {
             before(grammarAccess.getProductionAccess().getRigthAssignment_2()); 
            // InternalMyFNC.g:914:2: ( rule__Production__RigthAssignment_2 )
            // InternalMyFNC.g:914:3: rule__Production__RigthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Production__RigthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProductionAccess().getRigthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group__2__Impl"


    // $ANTLR start "rule__Production__Group__3"
    // InternalMyFNC.g:922:1: rule__Production__Group__3 : rule__Production__Group__3__Impl ;
    public final void rule__Production__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:926:1: ( rule__Production__Group__3__Impl )
            // InternalMyFNC.g:927:2: rule__Production__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Production__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group__3"


    // $ANTLR start "rule__Production__Group__3__Impl"
    // InternalMyFNC.g:933:1: rule__Production__Group__3__Impl : ( ( rule__Production__Group_3__0 )* ) ;
    public final void rule__Production__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:937:1: ( ( ( rule__Production__Group_3__0 )* ) )
            // InternalMyFNC.g:938:1: ( ( rule__Production__Group_3__0 )* )
            {
            // InternalMyFNC.g:938:1: ( ( rule__Production__Group_3__0 )* )
            // InternalMyFNC.g:939:2: ( rule__Production__Group_3__0 )*
            {
             before(grammarAccess.getProductionAccess().getGroup_3()); 
            // InternalMyFNC.g:940:2: ( rule__Production__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==62) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyFNC.g:940:3: rule__Production__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Production__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProductionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group__3__Impl"


    // $ANTLR start "rule__Production__Group_3__0"
    // InternalMyFNC.g:949:1: rule__Production__Group_3__0 : rule__Production__Group_3__0__Impl rule__Production__Group_3__1 ;
    public final void rule__Production__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:953:1: ( rule__Production__Group_3__0__Impl rule__Production__Group_3__1 )
            // InternalMyFNC.g:954:2: rule__Production__Group_3__0__Impl rule__Production__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Production__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Production__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group_3__0"


    // $ANTLR start "rule__Production__Group_3__0__Impl"
    // InternalMyFNC.g:961:1: rule__Production__Group_3__0__Impl : ( ( ( '|' ) ) ( ( '|' )* ) ) ;
    public final void rule__Production__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:965:1: ( ( ( ( '|' ) ) ( ( '|' )* ) ) )
            // InternalMyFNC.g:966:1: ( ( ( '|' ) ) ( ( '|' )* ) )
            {
            // InternalMyFNC.g:966:1: ( ( ( '|' ) ) ( ( '|' )* ) )
            // InternalMyFNC.g:967:2: ( ( '|' ) ) ( ( '|' )* )
            {
            // InternalMyFNC.g:967:2: ( ( '|' ) )
            // InternalMyFNC.g:968:3: ( '|' )
            {
             before(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 
            // InternalMyFNC.g:969:3: ( '|' )
            // InternalMyFNC.g:969:4: '|'
            {
            match(input,62,FOLLOW_8); 

            }

             after(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 

            }

            // InternalMyFNC.g:972:2: ( ( '|' )* )
            // InternalMyFNC.g:973:3: ( '|' )*
            {
             before(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 
            // InternalMyFNC.g:974:3: ( '|' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==62) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyFNC.g:974:4: '|'
            	    {
            	    match(input,62,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group_3__0__Impl"


    // $ANTLR start "rule__Production__Group_3__1"
    // InternalMyFNC.g:983:1: rule__Production__Group_3__1 : rule__Production__Group_3__1__Impl ;
    public final void rule__Production__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:987:1: ( rule__Production__Group_3__1__Impl )
            // InternalMyFNC.g:988:2: rule__Production__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Production__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group_3__1"


    // $ANTLR start "rule__Production__Group_3__1__Impl"
    // InternalMyFNC.g:994:1: rule__Production__Group_3__1__Impl : ( ( rule__Production__RigthAssignment_3_1 ) ) ;
    public final void rule__Production__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:998:1: ( ( ( rule__Production__RigthAssignment_3_1 ) ) )
            // InternalMyFNC.g:999:1: ( ( rule__Production__RigthAssignment_3_1 ) )
            {
            // InternalMyFNC.g:999:1: ( ( rule__Production__RigthAssignment_3_1 ) )
            // InternalMyFNC.g:1000:2: ( rule__Production__RigthAssignment_3_1 )
            {
             before(grammarAccess.getProductionAccess().getRigthAssignment_3_1()); 
            // InternalMyFNC.g:1001:2: ( rule__Production__RigthAssignment_3_1 )
            // InternalMyFNC.g:1001:3: rule__Production__RigthAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Production__RigthAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProductionAccess().getRigthAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group_3__1__Impl"


    // $ANTLR start "rule__Simple__Group__0"
    // InternalMyFNC.g:1010:1: rule__Simple__Group__0 : rule__Simple__Group__0__Impl rule__Simple__Group__1 ;
    public final void rule__Simple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1014:1: ( rule__Simple__Group__0__Impl rule__Simple__Group__1 )
            // InternalMyFNC.g:1015:2: rule__Simple__Group__0__Impl rule__Simple__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Simple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__0"


    // $ANTLR start "rule__Simple__Group__0__Impl"
    // InternalMyFNC.g:1022:1: rule__Simple__Group__0__Impl : ( () ) ;
    public final void rule__Simple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1026:1: ( ( () ) )
            // InternalMyFNC.g:1027:1: ( () )
            {
            // InternalMyFNC.g:1027:1: ( () )
            // InternalMyFNC.g:1028:2: ()
            {
             before(grammarAccess.getSimpleAccess().getSimpleAction_0()); 
            // InternalMyFNC.g:1029:2: ()
            // InternalMyFNC.g:1029:3: 
            {
            }

             after(grammarAccess.getSimpleAccess().getSimpleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__0__Impl"


    // $ANTLR start "rule__Simple__Group__1"
    // InternalMyFNC.g:1037:1: rule__Simple__Group__1 : rule__Simple__Group__1__Impl ;
    public final void rule__Simple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1041:1: ( rule__Simple__Group__1__Impl )
            // InternalMyFNC.g:1042:2: rule__Simple__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__1"


    // $ANTLR start "rule__Simple__Group__1__Impl"
    // InternalMyFNC.g:1048:1: rule__Simple__Group__1__Impl : ( ( rule__Simple__AlphaAssignment_1 ) ) ;
    public final void rule__Simple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1052:1: ( ( ( rule__Simple__AlphaAssignment_1 ) ) )
            // InternalMyFNC.g:1053:1: ( ( rule__Simple__AlphaAssignment_1 ) )
            {
            // InternalMyFNC.g:1053:1: ( ( rule__Simple__AlphaAssignment_1 ) )
            // InternalMyFNC.g:1054:2: ( rule__Simple__AlphaAssignment_1 )
            {
             before(grammarAccess.getSimpleAccess().getAlphaAssignment_1()); 
            // InternalMyFNC.g:1055:2: ( rule__Simple__AlphaAssignment_1 )
            // InternalMyFNC.g:1055:3: rule__Simple__AlphaAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Simple__AlphaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getAlphaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__1__Impl"


    // $ANTLR start "rule__NonTerminal__Group__0"
    // InternalMyFNC.g:1064:1: rule__NonTerminal__Group__0 : rule__NonTerminal__Group__0__Impl rule__NonTerminal__Group__1 ;
    public final void rule__NonTerminal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1068:1: ( rule__NonTerminal__Group__0__Impl rule__NonTerminal__Group__1 )
            // InternalMyFNC.g:1069:2: rule__NonTerminal__Group__0__Impl rule__NonTerminal__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__NonTerminal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonTerminal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonTerminal__Group__0"


    // $ANTLR start "rule__NonTerminal__Group__0__Impl"
    // InternalMyFNC.g:1076:1: rule__NonTerminal__Group__0__Impl : ( () ) ;
    public final void rule__NonTerminal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1080:1: ( ( () ) )
            // InternalMyFNC.g:1081:1: ( () )
            {
            // InternalMyFNC.g:1081:1: ( () )
            // InternalMyFNC.g:1082:2: ()
            {
             before(grammarAccess.getNonTerminalAccess().getNonTerminalAction_0()); 
            // InternalMyFNC.g:1083:2: ()
            // InternalMyFNC.g:1083:3: 
            {
            }

             after(grammarAccess.getNonTerminalAccess().getNonTerminalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonTerminal__Group__0__Impl"


    // $ANTLR start "rule__NonTerminal__Group__1"
    // InternalMyFNC.g:1091:1: rule__NonTerminal__Group__1 : rule__NonTerminal__Group__1__Impl ;
    public final void rule__NonTerminal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1095:1: ( rule__NonTerminal__Group__1__Impl )
            // InternalMyFNC.g:1096:2: rule__NonTerminal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonTerminal__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonTerminal__Group__1"


    // $ANTLR start "rule__NonTerminal__Group__1__Impl"
    // InternalMyFNC.g:1102:1: rule__NonTerminal__Group__1__Impl : ( ( rule__NonTerminal__VarAssignment_1 ) ) ;
    public final void rule__NonTerminal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1106:1: ( ( ( rule__NonTerminal__VarAssignment_1 ) ) )
            // InternalMyFNC.g:1107:1: ( ( rule__NonTerminal__VarAssignment_1 ) )
            {
            // InternalMyFNC.g:1107:1: ( ( rule__NonTerminal__VarAssignment_1 ) )
            // InternalMyFNC.g:1108:2: ( rule__NonTerminal__VarAssignment_1 )
            {
             before(grammarAccess.getNonTerminalAccess().getVarAssignment_1()); 
            // InternalMyFNC.g:1109:2: ( rule__NonTerminal__VarAssignment_1 )
            // InternalMyFNC.g:1109:3: rule__NonTerminal__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NonTerminal__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNonTerminalAccess().getVarAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonTerminal__Group__1__Impl"


    // $ANTLR start "rule__Binary__Group__0"
    // InternalMyFNC.g:1118:1: rule__Binary__Group__0 : rule__Binary__Group__0__Impl rule__Binary__Group__1 ;
    public final void rule__Binary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1122:1: ( rule__Binary__Group__0__Impl rule__Binary__Group__1 )
            // InternalMyFNC.g:1123:2: rule__Binary__Group__0__Impl rule__Binary__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Binary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__0"


    // $ANTLR start "rule__Binary__Group__0__Impl"
    // InternalMyFNC.g:1130:1: rule__Binary__Group__0__Impl : ( () ) ;
    public final void rule__Binary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1134:1: ( ( () ) )
            // InternalMyFNC.g:1135:1: ( () )
            {
            // InternalMyFNC.g:1135:1: ( () )
            // InternalMyFNC.g:1136:2: ()
            {
             before(grammarAccess.getBinaryAccess().getBinaryAction_0()); 
            // InternalMyFNC.g:1137:2: ()
            // InternalMyFNC.g:1137:3: 
            {
            }

             after(grammarAccess.getBinaryAccess().getBinaryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__0__Impl"


    // $ANTLR start "rule__Binary__Group__1"
    // InternalMyFNC.g:1145:1: rule__Binary__Group__1 : rule__Binary__Group__1__Impl ;
    public final void rule__Binary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1149:1: ( rule__Binary__Group__1__Impl )
            // InternalMyFNC.g:1150:2: rule__Binary__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__1"


    // $ANTLR start "rule__Binary__Group__1__Impl"
    // InternalMyFNC.g:1156:1: rule__Binary__Group__1__Impl : ( ( rule__Binary__Group_1__0 ) ) ;
    public final void rule__Binary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1160:1: ( ( ( rule__Binary__Group_1__0 ) ) )
            // InternalMyFNC.g:1161:1: ( ( rule__Binary__Group_1__0 ) )
            {
            // InternalMyFNC.g:1161:1: ( ( rule__Binary__Group_1__0 ) )
            // InternalMyFNC.g:1162:2: ( rule__Binary__Group_1__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup_1()); 
            // InternalMyFNC.g:1163:2: ( rule__Binary__Group_1__0 )
            // InternalMyFNC.g:1163:3: rule__Binary__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__1__Impl"


    // $ANTLR start "rule__Binary__Group_1__0"
    // InternalMyFNC.g:1172:1: rule__Binary__Group_1__0 : rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1 ;
    public final void rule__Binary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1176:1: ( rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1 )
            // InternalMyFNC.g:1177:2: rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Binary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group_1__0"


    // $ANTLR start "rule__Binary__Group_1__0__Impl"
    // InternalMyFNC.g:1184:1: rule__Binary__Group_1__0__Impl : ( ( rule__Binary__FirstAssignment_1_0 ) ) ;
    public final void rule__Binary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1188:1: ( ( ( rule__Binary__FirstAssignment_1_0 ) ) )
            // InternalMyFNC.g:1189:1: ( ( rule__Binary__FirstAssignment_1_0 ) )
            {
            // InternalMyFNC.g:1189:1: ( ( rule__Binary__FirstAssignment_1_0 ) )
            // InternalMyFNC.g:1190:2: ( rule__Binary__FirstAssignment_1_0 )
            {
             before(grammarAccess.getBinaryAccess().getFirstAssignment_1_0()); 
            // InternalMyFNC.g:1191:2: ( rule__Binary__FirstAssignment_1_0 )
            // InternalMyFNC.g:1191:3: rule__Binary__FirstAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Binary__FirstAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getFirstAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group_1__0__Impl"


    // $ANTLR start "rule__Binary__Group_1__1"
    // InternalMyFNC.g:1199:1: rule__Binary__Group_1__1 : rule__Binary__Group_1__1__Impl ;
    public final void rule__Binary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1203:1: ( rule__Binary__Group_1__1__Impl )
            // InternalMyFNC.g:1204:2: rule__Binary__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group_1__1"


    // $ANTLR start "rule__Binary__Group_1__1__Impl"
    // InternalMyFNC.g:1210:1: rule__Binary__Group_1__1__Impl : ( ( rule__Binary__SecondAssignment_1_1 ) ) ;
    public final void rule__Binary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1214:1: ( ( ( rule__Binary__SecondAssignment_1_1 ) ) )
            // InternalMyFNC.g:1215:1: ( ( rule__Binary__SecondAssignment_1_1 ) )
            {
            // InternalMyFNC.g:1215:1: ( ( rule__Binary__SecondAssignment_1_1 ) )
            // InternalMyFNC.g:1216:2: ( rule__Binary__SecondAssignment_1_1 )
            {
             before(grammarAccess.getBinaryAccess().getSecondAssignment_1_1()); 
            // InternalMyFNC.g:1217:2: ( rule__Binary__SecondAssignment_1_1 )
            // InternalMyFNC.g:1217:3: rule__Binary__SecondAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Binary__SecondAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getSecondAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group_1__1__Impl"


    // $ANTLR start "rule__InputString__Group__0"
    // InternalMyFNC.g:1226:1: rule__InputString__Group__0 : rule__InputString__Group__0__Impl rule__InputString__Group__1 ;
    public final void rule__InputString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1230:1: ( rule__InputString__Group__0__Impl rule__InputString__Group__1 )
            // InternalMyFNC.g:1231:2: rule__InputString__Group__0__Impl rule__InputString__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__InputString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputString__Group__0"


    // $ANTLR start "rule__InputString__Group__0__Impl"
    // InternalMyFNC.g:1238:1: rule__InputString__Group__0__Impl : ( 'Check' ) ;
    public final void rule__InputString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1242:1: ( ( 'Check' ) )
            // InternalMyFNC.g:1243:1: ( 'Check' )
            {
            // InternalMyFNC.g:1243:1: ( 'Check' )
            // InternalMyFNC.g:1244:2: 'Check'
            {
             before(grammarAccess.getInputStringAccess().getCheckKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getInputStringAccess().getCheckKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputString__Group__0__Impl"


    // $ANTLR start "rule__InputString__Group__1"
    // InternalMyFNC.g:1253:1: rule__InputString__Group__1 : rule__InputString__Group__1__Impl ;
    public final void rule__InputString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1257:1: ( rule__InputString__Group__1__Impl )
            // InternalMyFNC.g:1258:2: rule__InputString__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputString__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputString__Group__1"


    // $ANTLR start "rule__InputString__Group__1__Impl"
    // InternalMyFNC.g:1264:1: rule__InputString__Group__1__Impl : ( ( rule__InputString__InputAssignment_1 ) ) ;
    public final void rule__InputString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1268:1: ( ( ( rule__InputString__InputAssignment_1 ) ) )
            // InternalMyFNC.g:1269:1: ( ( rule__InputString__InputAssignment_1 ) )
            {
            // InternalMyFNC.g:1269:1: ( ( rule__InputString__InputAssignment_1 ) )
            // InternalMyFNC.g:1270:2: ( rule__InputString__InputAssignment_1 )
            {
             before(grammarAccess.getInputStringAccess().getInputAssignment_1()); 
            // InternalMyFNC.g:1271:2: ( rule__InputString__InputAssignment_1 )
            // InternalMyFNC.g:1271:3: rule__InputString__InputAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InputString__InputAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputStringAccess().getInputAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputString__Group__1__Impl"


    // $ANTLR start "rule__GNFC__InitAssignment_0"
    // InternalMyFNC.g:1280:1: rule__GNFC__InitAssignment_0 : ( ruleInitial ) ;
    public final void rule__GNFC__InitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1284:1: ( ( ruleInitial ) )
            // InternalMyFNC.g:1285:2: ( ruleInitial )
            {
            // InternalMyFNC.g:1285:2: ( ruleInitial )
            // InternalMyFNC.g:1286:3: ruleInitial
            {
             before(grammarAccess.getGNFCAccess().getInitInitialParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getGNFCAccess().getInitInitialParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNFC__InitAssignment_0"


    // $ANTLR start "rule__GNFC__ProductionsAssignment_1"
    // InternalMyFNC.g:1295:1: rule__GNFC__ProductionsAssignment_1 : ( ruleProduction ) ;
    public final void rule__GNFC__ProductionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1299:1: ( ( ruleProduction ) )
            // InternalMyFNC.g:1300:2: ( ruleProduction )
            {
            // InternalMyFNC.g:1300:2: ( ruleProduction )
            // InternalMyFNC.g:1301:3: ruleProduction
            {
             before(grammarAccess.getGNFCAccess().getProductionsProductionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProduction();

            state._fsp--;

             after(grammarAccess.getGNFCAccess().getProductionsProductionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNFC__ProductionsAssignment_1"


    // $ANTLR start "rule__GNFC__FinalAssignment_2"
    // InternalMyFNC.g:1310:1: rule__GNFC__FinalAssignment_2 : ( ruleInputString ) ;
    public final void rule__GNFC__FinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1314:1: ( ( ruleInputString ) )
            // InternalMyFNC.g:1315:2: ( ruleInputString )
            {
            // InternalMyFNC.g:1315:2: ( ruleInputString )
            // InternalMyFNC.g:1316:3: ruleInputString
            {
             before(grammarAccess.getGNFCAccess().getFinalInputStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInputString();

            state._fsp--;

             after(grammarAccess.getGNFCAccess().getFinalInputStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNFC__FinalAssignment_2"


    // $ANTLR start "rule__Initial__LeftAssignment_0"
    // InternalMyFNC.g:1325:1: rule__Initial__LeftAssignment_0 : ( ( 'S' ) ) ;
    public final void rule__Initial__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1329:1: ( ( ( 'S' ) ) )
            // InternalMyFNC.g:1330:2: ( ( 'S' ) )
            {
            // InternalMyFNC.g:1330:2: ( ( 'S' ) )
            // InternalMyFNC.g:1331:3: ( 'S' )
            {
             before(grammarAccess.getInitialAccess().getLeftSKeyword_0_0()); 
            // InternalMyFNC.g:1332:3: ( 'S' )
            // InternalMyFNC.g:1333:4: 'S'
            {
             before(grammarAccess.getInitialAccess().getLeftSKeyword_0_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getLeftSKeyword_0_0()); 

            }

             after(grammarAccess.getInitialAccess().getLeftSKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__LeftAssignment_0"


    // $ANTLR start "rule__Initial__RigthAssignment_2"
    // InternalMyFNC.g:1344:1: rule__Initial__RigthAssignment_2 : ( ruleRigth ) ;
    public final void rule__Initial__RigthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1348:1: ( ( ruleRigth ) )
            // InternalMyFNC.g:1349:2: ( ruleRigth )
            {
            // InternalMyFNC.g:1349:2: ( ruleRigth )
            // InternalMyFNC.g:1350:3: ruleRigth
            {
             before(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRigth();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__RigthAssignment_2"


    // $ANTLR start "rule__Initial__RigthAssignment_3_1"
    // InternalMyFNC.g:1359:1: rule__Initial__RigthAssignment_3_1 : ( ruleRigth ) ;
    public final void rule__Initial__RigthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1363:1: ( ( ruleRigth ) )
            // InternalMyFNC.g:1364:2: ( ruleRigth )
            {
            // InternalMyFNC.g:1364:2: ( ruleRigth )
            // InternalMyFNC.g:1365:3: ruleRigth
            {
             before(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRigth();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__RigthAssignment_3_1"


    // $ANTLR start "rule__Production__LeftAssignment_0"
    // InternalMyFNC.g:1374:1: rule__Production__LeftAssignment_0 : ( ruleNonTerminal ) ;
    public final void rule__Production__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1378:1: ( ( ruleNonTerminal ) )
            // InternalMyFNC.g:1379:2: ( ruleNonTerminal )
            {
            // InternalMyFNC.g:1379:2: ( ruleNonTerminal )
            // InternalMyFNC.g:1380:3: ruleNonTerminal
            {
             before(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNonTerminal();

            state._fsp--;

             after(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__LeftAssignment_0"


    // $ANTLR start "rule__Production__RigthAssignment_2"
    // InternalMyFNC.g:1389:1: rule__Production__RigthAssignment_2 : ( ruleRigth ) ;
    public final void rule__Production__RigthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1393:1: ( ( ruleRigth ) )
            // InternalMyFNC.g:1394:2: ( ruleRigth )
            {
            // InternalMyFNC.g:1394:2: ( ruleRigth )
            // InternalMyFNC.g:1395:3: ruleRigth
            {
             before(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRigth();

            state._fsp--;

             after(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__RigthAssignment_2"


    // $ANTLR start "rule__Production__RigthAssignment_3_1"
    // InternalMyFNC.g:1404:1: rule__Production__RigthAssignment_3_1 : ( ruleRigth ) ;
    public final void rule__Production__RigthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1408:1: ( ( ruleRigth ) )
            // InternalMyFNC.g:1409:2: ( ruleRigth )
            {
            // InternalMyFNC.g:1409:2: ( ruleRigth )
            // InternalMyFNC.g:1410:3: ruleRigth
            {
             before(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRigth();

            state._fsp--;

             after(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__RigthAssignment_3_1"


    // $ANTLR start "rule__Rigth__SimpleAssignment_0"
    // InternalMyFNC.g:1419:1: rule__Rigth__SimpleAssignment_0 : ( ruleSimple ) ;
    public final void rule__Rigth__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1423:1: ( ( ruleSimple ) )
            // InternalMyFNC.g:1424:2: ( ruleSimple )
            {
            // InternalMyFNC.g:1424:2: ( ruleSimple )
            // InternalMyFNC.g:1425:3: ruleSimple
            {
             before(grammarAccess.getRigthAccess().getSimpleSimpleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getRigthAccess().getSimpleSimpleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rigth__SimpleAssignment_0"


    // $ANTLR start "rule__Rigth__BinaryAssignment_1"
    // InternalMyFNC.g:1434:1: rule__Rigth__BinaryAssignment_1 : ( ruleBinary ) ;
    public final void rule__Rigth__BinaryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1438:1: ( ( ruleBinary ) )
            // InternalMyFNC.g:1439:2: ( ruleBinary )
            {
            // InternalMyFNC.g:1439:2: ( ruleBinary )
            // InternalMyFNC.g:1440:3: ruleBinary
            {
             before(grammarAccess.getRigthAccess().getBinaryBinaryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinary();

            state._fsp--;

             after(grammarAccess.getRigthAccess().getBinaryBinaryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rigth__BinaryAssignment_1"


    // $ANTLR start "rule__Simple__AlphaAssignment_1"
    // InternalMyFNC.g:1449:1: rule__Simple__AlphaAssignment_1 : ( ( rule__Simple__AlphaAlternatives_1_0 ) ) ;
    public final void rule__Simple__AlphaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1453:1: ( ( ( rule__Simple__AlphaAlternatives_1_0 ) ) )
            // InternalMyFNC.g:1454:2: ( ( rule__Simple__AlphaAlternatives_1_0 ) )
            {
            // InternalMyFNC.g:1454:2: ( ( rule__Simple__AlphaAlternatives_1_0 ) )
            // InternalMyFNC.g:1455:3: ( rule__Simple__AlphaAlternatives_1_0 )
            {
             before(grammarAccess.getSimpleAccess().getAlphaAlternatives_1_0()); 
            // InternalMyFNC.g:1456:3: ( rule__Simple__AlphaAlternatives_1_0 )
            // InternalMyFNC.g:1456:4: rule__Simple__AlphaAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Simple__AlphaAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getAlphaAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__AlphaAssignment_1"


    // $ANTLR start "rule__NonTerminal__VarAssignment_1"
    // InternalMyFNC.g:1464:1: rule__NonTerminal__VarAssignment_1 : ( ( rule__NonTerminal__VarAlternatives_1_0 ) ) ;
    public final void rule__NonTerminal__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1468:1: ( ( ( rule__NonTerminal__VarAlternatives_1_0 ) ) )
            // InternalMyFNC.g:1469:2: ( ( rule__NonTerminal__VarAlternatives_1_0 ) )
            {
            // InternalMyFNC.g:1469:2: ( ( rule__NonTerminal__VarAlternatives_1_0 ) )
            // InternalMyFNC.g:1470:3: ( rule__NonTerminal__VarAlternatives_1_0 )
            {
             before(grammarAccess.getNonTerminalAccess().getVarAlternatives_1_0()); 
            // InternalMyFNC.g:1471:3: ( rule__NonTerminal__VarAlternatives_1_0 )
            // InternalMyFNC.g:1471:4: rule__NonTerminal__VarAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NonTerminal__VarAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNonTerminalAccess().getVarAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonTerminal__VarAssignment_1"


    // $ANTLR start "rule__Binary__FirstAssignment_1_0"
    // InternalMyFNC.g:1479:1: rule__Binary__FirstAssignment_1_0 : ( ruleNonTerminal ) ;
    public final void rule__Binary__FirstAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1483:1: ( ( ruleNonTerminal ) )
            // InternalMyFNC.g:1484:2: ( ruleNonTerminal )
            {
            // InternalMyFNC.g:1484:2: ( ruleNonTerminal )
            // InternalMyFNC.g:1485:3: ruleNonTerminal
            {
             before(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNonTerminal();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__FirstAssignment_1_0"


    // $ANTLR start "rule__Binary__SecondAssignment_1_1"
    // InternalMyFNC.g:1494:1: rule__Binary__SecondAssignment_1_1 : ( ruleNonTerminal ) ;
    public final void rule__Binary__SecondAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1498:1: ( ( ruleNonTerminal ) )
            // InternalMyFNC.g:1499:2: ( ruleNonTerminal )
            {
            // InternalMyFNC.g:1499:2: ( ruleNonTerminal )
            // InternalMyFNC.g:1500:3: ruleNonTerminal
            {
             before(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNonTerminal();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__SecondAssignment_1_1"


    // $ANTLR start "rule__InputString__InputAssignment_1"
    // InternalMyFNC.g:1509:1: rule__InputString__InputAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InputString__InputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFNC.g:1513:1: ( ( RULE_STRING ) )
            // InternalMyFNC.g:1514:2: ( RULE_STRING )
            {
            // InternalMyFNC.g:1514:2: ( RULE_STRING )
            // InternalMyFNC.g:1515:3: RULE_STRING
            {
             before(grammarAccess.getInputStringAccess().getInputSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInputStringAccess().getInputSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputString__InputAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x9FFFFFF000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x1FFFFFF000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x1FFFFFFFFFFFF800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000FFFFFF800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x1FFFFFF000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});

}