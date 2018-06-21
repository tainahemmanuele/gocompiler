/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.PointerType#getBasetype <em>Basetype</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getPointerType()
 * @model
 * @generated
 */
public interface PointerType extends TypeLit
{
  /**
   * Returns the value of the '<em><b>Basetype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basetype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basetype</em>' containment reference.
   * @see #setBasetype(BaseType)
   * @see org.xtext.example.mydsl.go.GoPackage#getPointerType_Basetype()
   * @model containment="true"
   * @generated
   */
  BaseType getBasetype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.PointerType#getBasetype <em>Basetype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basetype</em>' containment reference.
   * @see #getBasetype()
   * @generated
   */
  void setBasetype(BaseType value);

} // PointerType
