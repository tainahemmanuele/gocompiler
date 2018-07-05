/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.Expression#getUp <em>Up</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Expression#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Up</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Up</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Up</em>' containment reference.
   * @see #setUp(UnaryExpr)
   * @see org.xtext.example.mydsl.go.GoPackage#getExpression_Up()
   * @model containment="true"
   * @generated
   */
  UnaryExpr getUp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Expression#getUp <em>Up</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Up</em>' containment reference.
   * @see #getUp()
   * @generated
   */
  void setUp(UnaryExpr value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression2)
   * @see org.xtext.example.mydsl.go.GoPackage#getExpression_Exp()
   * @model containment="true"
   * @generated
   */
  Expression2 getExp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Expression#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression2 value);

} // Expression
