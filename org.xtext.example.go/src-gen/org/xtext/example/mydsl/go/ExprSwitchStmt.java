/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Switch Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.ExprSwitchStmt#getSimplestmt <em>Simplestmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.ExprSwitchStmt#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.ExprSwitchStmt#getExprcase <em>Exprcase</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getExprSwitchStmt()
 * @model
 * @generated
 */
public interface ExprSwitchStmt extends SwitchStmt
{
  /**
   * Returns the value of the '<em><b>Simplestmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simplestmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simplestmt</em>' containment reference.
   * @see #setSimplestmt(SimpleStmt)
   * @see org.xtext.example.mydsl.go.GoPackage#getExprSwitchStmt_Simplestmt()
   * @model containment="true"
   * @generated
   */
  SimpleStmt getSimplestmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.ExprSwitchStmt#getSimplestmt <em>Simplestmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simplestmt</em>' containment reference.
   * @see #getSimplestmt()
   * @generated
   */
  void setSimplestmt(SimpleStmt value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.example.mydsl.go.GoPackage#getExprSwitchStmt_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.ExprSwitchStmt#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Exprcase</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.go.ExprCaseClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprcase</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprcase</em>' containment reference list.
   * @see org.xtext.example.mydsl.go.GoPackage#getExprSwitchStmt_Exprcase()
   * @model containment="true"
   * @generated
   */
  EList<ExprCaseClause> getExprcase();

} // ExprSwitchStmt
