/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.Assignment#getExpressionlist <em>Expressionlist</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Assignment#getAsop <em>Asop</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Assignment#getExpressionlist2 <em>Expressionlist2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends EObject
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
   * @see org.xtext.example.mydsl.go.GoPackage#getAssignment_Expressionlist()
   * @model containment="true"
   * @generated
   */
  ExpressionList getExpressionlist();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Assignment#getExpressionlist <em>Expressionlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressionlist</em>' containment reference.
   * @see #getExpressionlist()
   * @generated
   */
  void setExpressionlist(ExpressionList value);

  /**
   * Returns the value of the '<em><b>Asop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asop</em>' attribute.
   * @see #setAsop(String)
   * @see org.xtext.example.mydsl.go.GoPackage#getAssignment_Asop()
   * @model
   * @generated
   */
  String getAsop();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Assignment#getAsop <em>Asop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asop</em>' attribute.
   * @see #getAsop()
   * @generated
   */
  void setAsop(String value);

  /**
   * Returns the value of the '<em><b>Expressionlist2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressionlist2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressionlist2</em>' containment reference.
   * @see #setExpressionlist2(ExpressionList)
   * @see org.xtext.example.mydsl.go.GoPackage#getAssignment_Expressionlist2()
   * @model containment="true"
   * @generated
   */
  ExpressionList getExpressionlist2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Assignment#getExpressionlist2 <em>Expressionlist2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressionlist2</em>' containment reference.
   * @see #getExpressionlist2()
   * @generated
   */
  void setExpressionlist2(ExpressionList value);

} // Assignment
