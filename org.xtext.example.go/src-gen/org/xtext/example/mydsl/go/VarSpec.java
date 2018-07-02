/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.VarSpec#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.VarSpec#getTp2 <em>Tp2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.VarSpec#getExpressionlist <em>Expressionlist</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getVarSpec()
 * @model
 * @generated
 */
public interface VarSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.xtext.example.mydsl.go.GoPackage#getVarSpec_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.VarSpec#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Tp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tp2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tp2</em>' containment reference.
   * @see #setTp2(Type)
   * @see org.xtext.example.mydsl.go.GoPackage#getVarSpec_Tp2()
   * @model containment="true"
   * @generated
   */
  Type getTp2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.VarSpec#getTp2 <em>Tp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tp2</em>' containment reference.
   * @see #getTp2()
   * @generated
   */
  void setTp2(Type value);

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
   * @see org.xtext.example.mydsl.go.GoPackage#getVarSpec_Expressionlist()
   * @model containment="true"
   * @generated
   */
  ExpressionList getExpressionlist();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.VarSpec#getExpressionlist <em>Expressionlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressionlist</em>' containment reference.
   * @see #getExpressionlist()
   * @generated
   */
  void setExpressionlist(ExpressionList value);

} // VarSpec
