/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Length</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.ArrayLength#getElemtype <em>Elemtype</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getArrayLength()
 * @model
 * @generated
 */
public interface ArrayLength extends ArrayType
{
  /**
   * Returns the value of the '<em><b>Elemtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elemtype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elemtype</em>' containment reference.
   * @see #setElemtype(ElementType)
   * @see org.xtext.example.mydsl.go.GoPackage#getArrayLength_Elemtype()
   * @model containment="true"
   * @generated
   */
  ElementType getElemtype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.ArrayLength#getElemtype <em>Elemtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elemtype</em>' containment reference.
   * @see #getElemtype()
   * @generated
   */
  void setElemtype(ElementType value);

} // ArrayLength
