/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.Type#getTp <em>Tp</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getType()
 * @model
 * @generated
 */
public interface Type extends ElementType, BaseType, Result, KeyType, TypeAssertion
{
  /**
   * Returns the value of the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tp</em>' attribute.
   * @see #setTp(String)
   * @see org.xtext.example.mydsl.go.GoPackage#getType_Tp()
   * @model
   * @generated
   */
  String getTp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Type#getTp <em>Tp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tp</em>' attribute.
   * @see #getTp()
   * @generated
   */
  void setTp(String value);

} // Type
