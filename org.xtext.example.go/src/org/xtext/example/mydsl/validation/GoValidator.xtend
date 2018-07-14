/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.go.BasicLit
import org.xtext.example.mydsl.go.ConstDecl
import org.xtext.example.mydsl.go.Expression
import org.xtext.example.mydsl.go.Expression2
import org.xtext.example.mydsl.go.ForStmt
import org.xtext.example.mydsl.go.OperandName
import org.xtext.example.mydsl.go.VarDecl
import org.xtext.example.mydsl.validation.util.NullObj
import org.xtext.example.mydsl.go.ImportDecl
import org.xtext.example.mydsl.go.ForClause

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class GoValidator extends AbstractGoValidator {
	
	val ids = newLinkedHashMap()

	@Check
	def checkFor(ForStmt fors) {
		//TODO: Check for statements
	}
	
	@Check
	def checkExpression(Expression e) {
		
		if(e.exp !== null && e.exp instanceof Expression2) {
			
			var binaryOperator = e.exp.bop;
			
			if(binaryOperator == "||" || e.exp.bop == "&&") {
				//checkBooleanExp(e.exp.expression)
			}
			
			if(isArithimeticOp(binaryOperator)) {
				var basicLiteral1 = e.up.pr.op.literal.basic
				var basicLiteral2 = e.exp.expression.up.pr.op.literal.basic		
				checkAritimeticLits(basicLiteral1, basicLiteral2, binaryOperator);
			}
		}
	}
	
	@Check
	def checkConstDecl(ConstDecl cd) {
		
		var constId   = cd.constspec.id.id;
		nullDeclaration(constId);
		
		var constType = cd.constspec.tp.tp;
		var constExp  = cd.constspec.expressionlist.exp.up.pr.op.literal.basic;
				
				
		if(constType !== null && constExp !== null) {
			var error = checkAndMakeDecl(constId, constType, constExp);
			if(constId !== constId.toUpperCase() && !error) {
				warning ("Constants usually be declared with Upper Case", null);
			}
		}
	}
	
	@Check
	def checkVarDecl(VarDecl vd) {
		
		var varId   = vd.varspec.id.id;	
		nullDeclaration(varId);
		
		var varType = vd.varspec.tp2.tp;
		var varExp  = vd.varspec.expressionlist.exp.up.pr.op.literal.basic;
		
		
		if (varType !== null && varExp !== null) {		
			var error = checkAndMakeDecl(varId, varType, varExp);
			if(varId.charAt(0) !== varId.toLowerCase().charAt(0) && !error) {
				warning ("Variables usually starts with Lower Case", null);
			}
		}
	}
	
	@Check
	def imporDecl(ImportDecl id) {
		var imports = id.imports
		for(import:imports) {
			nullDeclaration(import.ip.replaceAll("\"", ""))
		}
	}
	
	@Check
	def forDecl(ForClause fd) {
		
		var forID = fd.init.simple.svd.idl
		nullDeclaration(forID.id)
		
	}
	
	@Check
	def checkOperandName(OperandName op) {
		
		if(!ids.containsKey(op.id)) {
			error("Semantic Error: Identifier " + op.id + " was never declared" , null)
		}
		
	}
	
	
	/*
	 * Checa se dois literais s�o compativeis em uma opera��o aritim�tica 
	 */
	def checkAritimeticLits(BasicLit basicLit1, BasicLit basicLit2, String binaryOp) {
		if(basicLit1 !== null && basicLit2 !== null) {
			if(basicLit1.strd !== null || basicLit2.strd !== null) {
				if(basicLit1.strd !== null && binaryOp == "+") {
					if(basicLit2.strd === null) {
						error("Semantic Error: Invalid arithmetic operation", null)
					}
				}
				else if(basicLit2.strd !== null && binaryOp == "+") {
					if(basicLit1.strd === null) {
						error("Semantic Error: Invalid arithmetic operation", null)
					}
				}else {
					error("Semantic Error: Invalid arithmetic operation, operator "
							+ binaryOp + " not defined on string.", null
						)
				}
			}else if(basicLit1.intd === null && basicLit1.floatd  === null && basicLit1.imagd === null) {
				error("Semantic Error: Invalid arithmetic operation" , null)
			}
		}
	}
	
	/*
	 * Checa se uma declara��o � valida
	 */
	def checkAndMakeDecl(String id, String constType, BasicLit literal) {
		
		var error = false;
				
		if(constType == "float") {
			if(literal.intd !== null) {
				ids.put(id, new Integer(literal.intd));
			}
			else if(literal.floatd !== null) {
				ids.put(id, new Double(literal.floatd));
			}
			else {
				error = true;
				error("Semantic Error: Invalid declaration, operator 
						not assigned to float.", null);
			}
		} 
		else if(constType == "int") {
			if(literal.intd !== null) {
				ids.put(id, new Integer(literal.intd));
			}
			else {
				error = true;
				error("Semantic Error: Invalid declaration, operator 
						not assigned to int.", null);
			}
		}
		else if(constType == "string") {
			if(literal.strd !== null) {
				ids.put(id, new String(literal.strd));
			}
			else {
				error = true;
				error("Semantic Error: Invalid declaration, operator 
						not assigned to string.", null);
			}
		}
		else if(constType == "bool") {
			if(literal.bool !== null) {
				ids.put(id, new Boolean(literal.bool));
			}
			else {
				error = true;
				error("Semantic Error: Invalid declaration, operator 
						not assigned to boolean.", null);
			}
		}
		
		return error;
	}
	
	def nullDeclaration(String id) {
		ids.put(id, new NullObj());
	}


	protected def boolean isArithimeticOp(String binaryOperator) {
		return (binaryOperator == "+" || binaryOperator == "-" || binaryOperator == "*"
			|| binaryOperator == "/" || binaryOperator == "%")
	}
	
	
}
