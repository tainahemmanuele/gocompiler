/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.validation;

import com.google.common.base.Objects;
import java.util.LinkedHashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.xtext.example.mydsl.go.BasicLit;
import org.xtext.example.mydsl.go.ConstDecl;
import org.xtext.example.mydsl.go.Expression;
import org.xtext.example.mydsl.go.Expression2;
import org.xtext.example.mydsl.go.ForClause;
import org.xtext.example.mydsl.go.ForStmt;
import org.xtext.example.mydsl.go.FunctionDecl;
import org.xtext.example.mydsl.go.IdentifierList;
import org.xtext.example.mydsl.go.ImportDecl;
import org.xtext.example.mydsl.go.ImportSpec;
import org.xtext.example.mydsl.go.OperandName;
import org.xtext.example.mydsl.go.ParameterDecl;
import org.xtext.example.mydsl.go.ParameterList;
import org.xtext.example.mydsl.go.Type;
import org.xtext.example.mydsl.go.VarDecl;
import org.xtext.example.mydsl.validation.AbstractGoValidator;
import org.xtext.example.mydsl.validation.util.NullObj;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class GoValidator extends AbstractGoValidator {
  private final LinkedHashMap<Object, Object> ids = CollectionLiterals.<Object, Object>newLinkedHashMap();
  
  @Check
  public Object checkFor(final ForStmt fors) {
    return null;
  }
  
  @Check
  public void checkExpression(final Expression e) {
    if (((e.getExp() != null) && (e.getExp() instanceof Expression2))) {
      String binaryOperator = e.getExp().getBop();
      if ((Objects.equal(binaryOperator, "||") || Objects.equal(e.getExp().getBop(), "&&"))) {
      }
      boolean _isArithimeticOp = this.isArithimeticOp(binaryOperator);
      if (_isArithimeticOp) {
        BasicLit basicLiteral1 = e.getUp().getPr().getOp().getLiteral().getBasic();
        BasicLit basicLiteral2 = e.getExp().getExpression().getUp().getPr().getOp().getLiteral().getBasic();
        this.checkAritimeticLits(basicLiteral1, basicLiteral2, binaryOperator);
      }
    }
  }
  
  @Check
  public void checkConstDecl(final ConstDecl cd) {
    String constId = cd.getConstspec().getId().getId();
    this.nullDeclaration(constId);
    String constType = cd.getConstspec().getTp().getTp();
    BasicLit constExp = cd.getConstspec().getExpressionlist().getExp().getUp().getPr().getOp().getLiteral().getBasic();
    if (((constType != null) && (constExp != null))) {
      boolean error = this.checkAndMakeDecl(constId, constType, constExp);
      if (((constId != constId.toUpperCase()) && (!error))) {
        this.warning("Constants usually be declared with Upper Case", null);
      }
    }
  }
  
  @Check
  public void checkVarDecl(final VarDecl vd) {
    String varId = vd.getVarspec().getId().getId();
    this.nullDeclaration(varId);
    String varType = vd.getVarspec().getTp2().getTp();
    BasicLit varExp = vd.getVarspec().getExpressionlist().getExp().getUp().getPr().getOp().getLiteral().getBasic();
    if (((varType != null) && (varExp != null))) {
      boolean error = this.checkAndMakeDecl(varId, varType, varExp);
      if (((varId.charAt(0) != varId.toLowerCase().charAt(0)) && (!error))) {
        this.warning("Variables usually starts with Lower Case", null);
      }
    }
  }
  
  @Check
  public void imporDecl(final ImportDecl id) {
    EList<ImportSpec> imports = id.getImports();
    for (final ImportSpec import_ : imports) {
      this.nullDeclaration(import_.getIp().replaceAll("\"", ""));
    }
  }
  
  @Check
  public Object forDecl(final ForClause fd) {
    Object _xblockexpression = null;
    {
      IdentifierList forID = fd.getInit().getSimple().getSvd().getIdl();
      _xblockexpression = this.nullDeclaration(forID.getId());
    }
    return _xblockexpression;
  }
  
  @Check
  public Object funcDecla(final FunctionDecl fd) {
    Object _xblockexpression = null;
    {
      String funcName = fd.getFunctionn();
      ParameterList parameters = fd.getSignature().getParameters().getParameterlist();
      LinkedHashMap<String, Object> parameterList = CollectionLiterals.<String, Object>newLinkedHashMap();
      Type _type = parameters.getParameterDecl1().getType();
      boolean _tripleNotEquals = (_type != null);
      if (_tripleNotEquals) {
        parameterList.put(
          parameters.getParameterDecl1().getId(), 
          parameters.getParameterDecl1().getType().getTp());
      } else {
        String _id = parameters.getParameterDecl1().getId();
        NullObj _nullObj = new NullObj();
        parameterList.put(_id, _nullObj);
      }
      EList<ParameterDecl> _parameterdecl = parameters.getParameterdecl();
      for (final ParameterDecl param : _parameterdecl) {
        Type _type_1 = param.getType();
        boolean _tripleNotEquals_1 = (_type_1 != null);
        if (_tripleNotEquals_1) {
          parameterList.put(
            param.getId(), 
            param.getType().getTp());
        } else {
          String _id_1 = param.getId();
          NullObj _nullObj_1 = new NullObj();
          parameterList.put(_id_1, _nullObj_1);
        }
      }
      _xblockexpression = this.ids.put(funcName, parameterList);
    }
    return _xblockexpression;
  }
  
  @Check
  public void checkOperandName(final OperandName op) {
    boolean _containsKey = this.ids.containsKey(op.getId());
    boolean _not = (!_containsKey);
    if (_not) {
      String _id = op.getId();
      String _plus = ("Semantic Error: Identifier " + _id);
      String _plus_1 = (_plus + " was never declared");
      this.error(_plus_1, null);
    }
  }
  
  /**
   * Checa se dois literais s�o compativeis em uma opera��o aritim�tica
   */
  public void checkAritimeticLits(final BasicLit basicLit1, final BasicLit basicLit2, final String binaryOp) {
    if (((basicLit1 != null) && (basicLit2 != null))) {
      if (((basicLit1.getStrd() != null) || (basicLit2.getStrd() != null))) {
        if (((basicLit1.getStrd() != null) && Objects.equal(binaryOp, "+"))) {
          String _strd = basicLit2.getStrd();
          boolean _tripleEquals = (_strd == null);
          if (_tripleEquals) {
            this.error("Semantic Error: Invalid arithmetic operation", null);
          }
        } else {
          if (((basicLit2.getStrd() != null) && Objects.equal(binaryOp, "+"))) {
            String _strd_1 = basicLit1.getStrd();
            boolean _tripleEquals_1 = (_strd_1 == null);
            if (_tripleEquals_1) {
              this.error("Semantic Error: Invalid arithmetic operation", null);
            }
          } else {
            this.error(
              (("Semantic Error: Invalid arithmetic operation, operator " + binaryOp) + " not defined on string."), null);
          }
        }
      } else {
        if ((((basicLit1.getIntd() == null) && (basicLit1.getFloatd() == null)) && (basicLit1.getImagd() == null))) {
          this.error("Semantic Error: Invalid arithmetic operation", null);
        }
      }
    }
  }
  
  /**
   * Checa se uma declara��o � valida
   */
  public boolean checkAndMakeDecl(final String id, final String constType, final BasicLit literal) {
    boolean error = false;
    boolean _equals = Objects.equal(constType, "float");
    if (_equals) {
      String _intd = literal.getIntd();
      boolean _tripleNotEquals = (_intd != null);
      if (_tripleNotEquals) {
        String _intd_1 = literal.getIntd();
        Integer _integer = new Integer(_intd_1);
        this.ids.put(id, _integer);
      } else {
        String _floatd = literal.getFloatd();
        boolean _tripleNotEquals_1 = (_floatd != null);
        if (_tripleNotEquals_1) {
          String _floatd_1 = literal.getFloatd();
          Double _double = new Double(_floatd_1);
          this.ids.put(id, _double);
        } else {
          error = true;
          this.error("Semantic Error: Invalid declaration, operator \r\n\t\t\t\t\t\tnot assigned to float.", null);
        }
      }
    } else {
      boolean _equals_1 = Objects.equal(constType, "int");
      if (_equals_1) {
        String _intd_2 = literal.getIntd();
        boolean _tripleNotEquals_2 = (_intd_2 != null);
        if (_tripleNotEquals_2) {
          String _intd_3 = literal.getIntd();
          Integer _integer_1 = new Integer(_intd_3);
          this.ids.put(id, _integer_1);
        } else {
          error = true;
          this.error("Semantic Error: Invalid declaration, operator \r\n\t\t\t\t\t\tnot assigned to int.", null);
        }
      } else {
        boolean _equals_2 = Objects.equal(constType, "string");
        if (_equals_2) {
          String _strd = literal.getStrd();
          boolean _tripleNotEquals_3 = (_strd != null);
          if (_tripleNotEquals_3) {
            String _strd_1 = literal.getStrd();
            String _string = new String(_strd_1);
            this.ids.put(id, _string);
          } else {
            error = true;
            this.error("Semantic Error: Invalid declaration, operator \r\n\t\t\t\t\t\tnot assigned to string.", null);
          }
        } else {
          boolean _equals_3 = Objects.equal(constType, "bool");
          if (_equals_3) {
            String _bool = literal.getBool();
            boolean _tripleNotEquals_4 = (_bool != null);
            if (_tripleNotEquals_4) {
              String _bool_1 = literal.getBool();
              Boolean _boolean = new Boolean(_bool_1);
              this.ids.put(id, _boolean);
            } else {
              error = true;
              this.error("Semantic Error: Invalid declaration, operator \r\n\t\t\t\t\t\tnot assigned to boolean.", null);
            }
          }
        }
      }
    }
    return error;
  }
  
  public Object nullDeclaration(final String id) {
    NullObj _nullObj = new NullObj();
    return this.ids.put(id, _nullObj);
  }
  
  protected boolean isArithimeticOp(final String binaryOperator) {
    return ((((Objects.equal(binaryOperator, "+") || Objects.equal(binaryOperator, "-")) || Objects.equal(binaryOperator, "*")) || Objects.equal(binaryOperator, "/")) || Objects.equal(binaryOperator, "%"));
  }
}
