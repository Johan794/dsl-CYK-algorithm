/**
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.cyk.mydsl.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.cyk.mydsl.myFNC.GNFC;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyFNCGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final GNFC grammar = ((GNFC) _head);
    fsa.generateFile("result.txt", this.runCYK(grammar));
  }

  public CharSequence runCYK(final GNFC grammar) {
    StringConcatenation _builder = new StringConcatenation();
    String _get = this.get(grammar);
    _builder.append(_get);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public String get(final GNFC grammar) {
    return grammar.getFinal().toString();
  }
}