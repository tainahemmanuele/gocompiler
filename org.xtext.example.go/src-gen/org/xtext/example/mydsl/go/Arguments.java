/**
 * generated by Xtext 2.14.0.RC1
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arguments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.Arguments#getExpressionlist <em>Expressionlist</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Arguments#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getArguments()
 * @model
 * @generated
 */
public interface Arguments extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressionlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressionlist</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressionlist</em>' containment reference.
   * @see #setExpressionlist(ExpressionList)
   * @see org.xtext.example.mydsl.go.GoPackage#getArguments_Expressionlist()
   * @model containment="true"
   * @generated
   */
  ExpressionList getExpressionlist();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Arguments#getExpressionlist <em>Expressionlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressionlist</em>' containment reference.
   * @see #getExpressionlist()
   * @generated
   */
  void setExpressionlist(ExpressionList value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.xtext.example.mydsl.go.GoPackage#getArguments_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Arguments#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // Arguments
