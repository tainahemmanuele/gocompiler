/**
 * generated by Xtext 2.14.0.RC1
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.RangeClause#getExpressionlist <em>Expressionlist</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.RangeClause#getIdl <em>Idl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.RangeClause#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getRangeClause()
 * @model
 * @generated
 */
public interface RangeClause extends EObject
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
   * @see org.xtext.example.mydsl.go.GoPackage#getRangeClause_Expressionlist()
   * @model containment="true"
   * @generated
   */
  ExpressionList getExpressionlist();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.RangeClause#getExpressionlist <em>Expressionlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressionlist</em>' containment reference.
   * @see #getExpressionlist()
   * @generated
   */
  void setExpressionlist(ExpressionList value);

  /**
   * Returns the value of the '<em><b>Idl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Idl</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Idl</em>' attribute.
   * @see #setIdl(String)
   * @see org.xtext.example.mydsl.go.GoPackage#getRangeClause_Idl()
   * @model
   * @generated
   */
  String getIdl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.RangeClause#getIdl <em>Idl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Idl</em>' attribute.
   * @see #getIdl()
   * @generated
   */
  void setIdl(String value);

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
   * @see org.xtext.example.mydsl.go.GoPackage#getRangeClause_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.RangeClause#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // RangeClause
