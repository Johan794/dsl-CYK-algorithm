/*
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.cyk.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.cyk.mydsl.ide.contentassist.antlr.internal.InternalMyFNCParser;
import org.xtext.cyk.mydsl.services.MyFNCGrammarAccess;

public class MyFNCParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyFNCGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyFNCGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getLambdaAccess().getAlternatives(), "rule__Lambda__Alternatives");
			builder.put(grammarAccess.getRigthAccess().getAlternatives(), "rule__Rigth__Alternatives");
			builder.put(grammarAccess.getSimpleAccess().getAlternatives(), "rule__Simple__Alternatives");
			builder.put(grammarAccess.getNonTerminalAccess().getAlternatives(), "rule__NonTerminal__Alternatives");
			builder.put(grammarAccess.getGNFCAccess().getGroup(), "rule__GNFC__Group__0");
			builder.put(grammarAccess.getInitialAccess().getGroup(), "rule__Initial__Group__0");
			builder.put(grammarAccess.getInitialAccess().getGroup_3(), "rule__Initial__Group_3__0");
			builder.put(grammarAccess.getProductionAccess().getGroup(), "rule__Production__Group__0");
			builder.put(grammarAccess.getProductionAccess().getGroup_3(), "rule__Production__Group_3__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_1(), "rule__Simple__Group_1__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_2(), "rule__Simple__Group_2__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_3(), "rule__Simple__Group_3__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_4(), "rule__Simple__Group_4__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_5(), "rule__Simple__Group_5__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_6(), "rule__Simple__Group_6__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_7(), "rule__Simple__Group_7__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_8(), "rule__Simple__Group_8__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_9(), "rule__Simple__Group_9__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_10(), "rule__Simple__Group_10__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_11(), "rule__Simple__Group_11__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_12(), "rule__Simple__Group_12__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_13(), "rule__Simple__Group_13__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_14(), "rule__Simple__Group_14__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_15(), "rule__Simple__Group_15__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_16(), "rule__Simple__Group_16__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_17(), "rule__Simple__Group_17__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_18(), "rule__Simple__Group_18__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_19(), "rule__Simple__Group_19__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_20(), "rule__Simple__Group_20__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_21(), "rule__Simple__Group_21__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_22(), "rule__Simple__Group_22__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_23(), "rule__Simple__Group_23__0");
			builder.put(grammarAccess.getSimpleAccess().getGroup_24(), "rule__Simple__Group_24__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_1(), "rule__NonTerminal__Group_1__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_2(), "rule__NonTerminal__Group_2__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_3(), "rule__NonTerminal__Group_3__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_4(), "rule__NonTerminal__Group_4__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_5(), "rule__NonTerminal__Group_5__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_6(), "rule__NonTerminal__Group_6__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_7(), "rule__NonTerminal__Group_7__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_8(), "rule__NonTerminal__Group_8__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_9(), "rule__NonTerminal__Group_9__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_10(), "rule__NonTerminal__Group_10__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_11(), "rule__NonTerminal__Group_11__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_12(), "rule__NonTerminal__Group_12__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_13(), "rule__NonTerminal__Group_13__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_14(), "rule__NonTerminal__Group_14__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_15(), "rule__NonTerminal__Group_15__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_16(), "rule__NonTerminal__Group_16__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_17(), "rule__NonTerminal__Group_17__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_18(), "rule__NonTerminal__Group_18__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_19(), "rule__NonTerminal__Group_19__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_20(), "rule__NonTerminal__Group_20__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_21(), "rule__NonTerminal__Group_21__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_22(), "rule__NonTerminal__Group_22__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_23(), "rule__NonTerminal__Group_23__0");
			builder.put(grammarAccess.getNonTerminalAccess().getGroup_24(), "rule__NonTerminal__Group_24__0");
			builder.put(grammarAccess.getBinaryAccess().getGroup(), "rule__Binary__Group__0");
			builder.put(grammarAccess.getInputStringAccess().getGroup(), "rule__InputString__Group__0");
			builder.put(grammarAccess.getGNFCAccess().getInitAssignment_0(), "rule__GNFC__InitAssignment_0");
			builder.put(grammarAccess.getGNFCAccess().getProductionsAssignment_1(), "rule__GNFC__ProductionsAssignment_1");
			builder.put(grammarAccess.getGNFCAccess().getFinalAssignment_2(), "rule__GNFC__FinalAssignment_2");
			builder.put(grammarAccess.getInitialAccess().getLeftAssignment_0(), "rule__Initial__LeftAssignment_0");
			builder.put(grammarAccess.getInitialAccess().getRigthAssignment_2(), "rule__Initial__RigthAssignment_2");
			builder.put(grammarAccess.getInitialAccess().getRigthAssignment_3_1(), "rule__Initial__RigthAssignment_3_1");
			builder.put(grammarAccess.getLambdaAccess().getRigthAssignment_0(), "rule__Lambda__RigthAssignment_0");
			builder.put(grammarAccess.getProductionAccess().getLeftAssignment_0(), "rule__Production__LeftAssignment_0");
			builder.put(grammarAccess.getProductionAccess().getRigthAssignment_2(), "rule__Production__RigthAssignment_2");
			builder.put(grammarAccess.getProductionAccess().getRigthAssignment_3_1(), "rule__Production__RigthAssignment_3_1");
			builder.put(grammarAccess.getSimpleAccess().getAlphaAssignment_0(), "rule__Simple__AlphaAssignment_0");
			builder.put(grammarAccess.getNonTerminalAccess().getVarAssignment_0(), "rule__NonTerminal__VarAssignment_0");
			builder.put(grammarAccess.getBinaryAccess().getFirstAssignment_0(), "rule__Binary__FirstAssignment_0");
			builder.put(grammarAccess.getBinaryAccess().getSecondAssignment_1(), "rule__Binary__SecondAssignment_1");
			builder.put(grammarAccess.getInputStringAccess().getInputAssignment_1(), "rule__InputString__InputAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyFNCGrammarAccess grammarAccess;

	@Override
	protected InternalMyFNCParser createParser() {
		InternalMyFNCParser result = new InternalMyFNCParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyFNCGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyFNCGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}