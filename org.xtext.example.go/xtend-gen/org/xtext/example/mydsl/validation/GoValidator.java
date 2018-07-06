/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.validation;

import com.google.common.base.Objects;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.example.mydsl.go.BasicLit;
import org.xtext.example.mydsl.go.ElementType;
import org.xtext.example.mydsl.go.Expression;
import org.xtext.example.mydsl.go.Expression2;
import org.xtext.example.mydsl.go.ForStmt;
import org.xtext.example.mydsl.validation.AbstractGoValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class GoValidator extends AbstractGoValidator {
  public static void main(final String[] args) {
    InputOutput.<String>println("Hello World");
  }
  
  @Check
  public void checkFor(final ForStmt fors) {
    ElementType _elemtype = fors.getCondition().getExp().getElemtype();
    boolean _notEquals = (!Objects.equal(_elemtype, boolean.class));
    if (_notEquals) {
      this.error("Semantic Error: for condition must be boolean", null);
    }
  }
  
  @Check
  public void checkExpression(final Expression e) {
    Expression2 _exp = e.getExp();
    if ((_exp instanceof Expression2)) {
      if ((Objects.equal(e.getExp().getBop(), "||") || Objects.equal(e.getExp().getBop(), "&&"))) {
      }
      String _bop = e.getExp().getBop();
      boolean _equals = Objects.equal(_bop, "+");
      if (_equals) {
        this.checkAritimeticOp(e.getExp().getExpression());
      }
    }
  }
  
  public void checkAritimeticOp(final Expression expression) {
    BasicLit bl = expression.getUp().getPr().getOp().getLiteral().getBasic();
    if ((bl != null)) {
      if ((((bl.getIntd() == null) && (bl.getFloatd() == null)) && (bl.getImagd() == null))) {
        BasicLit _basic = expression.getUp().getPr().getOp().getLiteral().getBasic();
        String _plus = ("Semantic Error: Invalid argument in arithmetic exp " + _basic);
        this.error(_plus, null);
      }
    }
  }
}
