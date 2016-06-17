/*
 * generated by Xtext
 */
package org.eclipse.xtext.testlanguages.indent.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.testlanguages.indent.services.IndentationAwareTestLanguageGrammarAccess;

public class IndentationAwareTestLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private IndentationAwareTestLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens();
	}
	
	@Override
	protected org.eclipse.xtext.testlanguages.indent.parser.antlr.internal.InternalIndentationAwareTestLanguageParser createParser(XtextTokenStream stream) {
		return new org.eclipse.xtext.testlanguages.indent.parser.antlr.internal.InternalIndentationAwareTestLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "NodeList";
	}
	
	public IndentationAwareTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(IndentationAwareTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}