/*
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.cyk.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.cyk.mydsl.parser.antlr.internal.InternalMyFNCParser;
import org.xtext.cyk.mydsl.services.MyFNCGrammarAccess;

public class MyFNCParser extends AbstractAntlrParser {

	@Inject
	private MyFNCGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyFNCParser createParser(XtextTokenStream stream) {
		return new InternalMyFNCParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GNFC";
	}

	public MyFNCGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyFNCGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
