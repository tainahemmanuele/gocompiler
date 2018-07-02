/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.ExpressionList#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.ExpressionList#getExpression2 <em>Expression2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getExpressionList()
 * @model
 * @generated
 */
public interface ExpressionList extends RecvStmt
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see org.xtext.example.mydsl.go.GoPackage#getExpressionList_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.ExpressionList#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

  /**
   * Returns the value of the '<em><b>Expression2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.go.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression2</em>' containment reference list.
   * @see org.xtext.example.mydsl.go.GoPackage#getExpressionList_Expression2()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpression2();

} // ExpressionList
