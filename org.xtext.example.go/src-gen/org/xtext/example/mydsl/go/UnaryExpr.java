/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.UnaryExpr#getPr <em>Pr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.UnaryExpr#getUp <em>Up</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.UnaryExpr#getUe <em>Ue</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getUnaryExpr()
 * @model
 * @generated
 */
public interface UnaryExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Pr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pr</em>' containment reference.
   * @see #setPr(PrimaryExpr)
   * @see org.xtext.example.mydsl.go.GoPackage#getUnaryExpr_Pr()
   * @model containment="true"
   * @generated
   */
  PrimaryExpr getPr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.UnaryExpr#getPr <em>Pr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pr</em>' containment reference.
   * @see #getPr()
   * @generated
   */
  void setPr(PrimaryExpr value);

  /**
   * Returns the value of the '<em><b>Up</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Up</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Up</em>' attribute.
   * @see #setUp(String)
   * @see org.xtext.example.mydsl.go.GoPackage#getUnaryExpr_Up()
   * @model
   * @generated
   */
  String getUp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.UnaryExpr#getUp <em>Up</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Up</em>' attribute.
   * @see #getUp()
   * @generated
   */
  void setUp(String value);

  /**
   * Returns the value of the '<em><b>Ue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ue</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ue</em>' containment reference.
   * @see #setUe(UnaryExpr)
   * @see org.xtext.example.mydsl.go.GoPackage#getUnaryExpr_Ue()
   * @model containment="true"
   * @generated
   */
  UnaryExpr getUe();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.UnaryExpr#getUe <em>Ue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ue</em>' containment reference.
   * @see #getUe()
   * @generated
   */
  void setUe(UnaryExpr value);

} // UnaryExpr
