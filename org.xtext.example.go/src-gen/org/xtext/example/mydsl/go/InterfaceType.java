/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.InterfaceType#getMethodspec <em>Methodspec</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getInterfaceType()
 * @model
 * @generated
 */
public interface InterfaceType extends TypeLit
{
  /**
   * Returns the value of the '<em><b>Methodspec</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.go.MethodSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methodspec</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methodspec</em>' containment reference list.
   * @see org.xtext.example.mydsl.go.GoPackage#getInterfaceType_Methodspec()
   * @model containment="true"
   * @generated
   */
  EList<MethodSpec> getMethodspec();

} // InterfaceType
