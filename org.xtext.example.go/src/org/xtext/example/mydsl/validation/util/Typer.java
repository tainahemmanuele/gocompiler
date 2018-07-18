package org.xtext.example.mydsl.validation.util;

import org.xtext.example.mydsl.go.*;

public class Typer {
	
	public static String typeExp(Expression exp) {
		UnaryExpr uexp = exp.getUp();
		String type1 = typeUexp(uexp);
		Expression2 exp2 = exp.getExp();
		if (exp2 == null)
			return type1;
		String type2 = typeExp2(exp2);
		return largeType(type1, type2);
	}

	private static String typeExp2(Expression2 exp2) {
		String type1 = typeExp(exp2.getExpression());
		Expression2 exp = exp2.getExpression2();
		if (exp == null)
			return type1;
		String type2 = typeExp2(exp);
		return largeType(type1, type2);
	}

	private static String largeType(String type1, String type2) {
		if(type1.equals(type2))
			return type1;
		else if(type1.equals("string") || type2.equals("string"))
			return "string";
		else if((type1.equals("float") && type2.equals("int")) ||
				(type1.equals("int") && type2.equals("float")))
			return "float";
		else
			return "ERROR";
	}
	
	public static boolean typeLargerThan(String type1, String type2) {
		return type1.equals(typeLargerThan(type1, type2));
	}

	private static String typeUexp(UnaryExpr uexp) {
		if(uexp.getUe() != null) {
			return typeUexp(uexp.getUe());
		} else {
			return typePexp(uexp.getPr());
		}
	}

	private static String typePexp(PrimaryExpr pexp) {
		// Várias verificações puladas
		if(pexp.getOp().getLiteral().getBasic().getIntd() != null) {
			return "int";
		} else if(pexp.getOp().getLiteral().getBasic().getFloatd() != null) {
			return "float";
		} else if(pexp.getOp().getLiteral().getBasic().getStrd() != null) {
			return "string";
		} else if(pexp.getOp().getLiteral().getBasic().getRuned() != null) {
			return "rune";
		} else {
			return "imaginary";
		}
	}

}
