/**
 * generated by Xtext 2.14.0.RC1
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.Literal#getBasic <em>Basic</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends EObject
{
  /**
   * Returns the value of the '<em><b>Basic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic</em>' attribute.
   * @see #setBasic(String)
   * @see org.xtext.example.mydsl.go.GoPackage#getLiteral_Basic()
   * @model
   * @generated
   */
  String getBasic();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Literal#getBasic <em>Basic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic</em>' attribute.
   * @see #getBasic()
   * @generated
   */
  void setBasic(String value);

} // Literal
