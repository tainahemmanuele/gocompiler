/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.MapType#getKeytype <em>Keytype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.MapType#getElemtype <em>Elemtype</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getMapType()
 * @model
 * @generated
 */
public interface MapType extends TypeLit
{
  /**
   * Returns the value of the '<em><b>Keytype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keytype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keytype</em>' containment reference.
   * @see #setKeytype(KeyType)
   * @see org.xtext.example.mydsl.go.GoPackage#getMapType_Keytype()
   * @model containment="true"
   * @generated
   */
  KeyType getKeytype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.MapType#getKeytype <em>Keytype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keytype</em>' containment reference.
   * @see #getKeytype()
   * @generated
   */
  void setKeytype(KeyType value);

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
   * @see org.xtext.example.mydsl.go.GoPackage#getMapType_Elemtype()
   * @model containment="true"
   * @generated
   */
  ElementType getElemtype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.MapType#getElemtype <em>Elemtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elemtype</em>' containment reference.
   * @see #getElemtype()
   * @generated
   */
  void setElemtype(ElementType value);

} // MapType