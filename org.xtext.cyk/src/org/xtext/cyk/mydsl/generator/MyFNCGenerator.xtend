/*
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.cyk.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.cyk.mydsl.myFNC.GNFC

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyFNCGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val grammar = resource.contents.head as GNFC
		fsa.generateFile('result.txt',runCYK(grammar))
	}
	
	def runCYK(GNFC grammar){
		'''
		�get(grammar)�
		'''
	}
	
	def get(GNFC grammar){
		grammar.final.toString()
	}
	
	
}