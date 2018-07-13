/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.TypeDecl#getTypespec <em>Typespec</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.TypeDecl#getTypespec2 <em>Typespec2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getTypeDecl()
 * @model
 * @generated
 */
public interface TypeDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Typespec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typespec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typespec</em>' containment reference.
   * @see #setTypespec(TypeSpec)
   * @see org.xtext.example.mydsl.go.GoPackage#getTypeDecl_Typespec()
   * @model containment="true"
   * @generated
   */
  TypeSpec getTypespec();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.TypeDecl#getTypespec <em>Typespec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typespec</em>' containment reference.
   * @see #getTypespec()
   * @generated
   */
  void setTypespec(TypeSpec value);

  /**
   * Returns the value of the '<em><b>Typespec2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.go.TypeSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typespec2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typespec2</em>' containment reference list.
   * @see org.xtext.example.mydsl.go.GoPackage#getTypeDecl_Typespec2()
   * @model containment="true"
   * @generated
   */
  EList<TypeSpec> getTypespec2();

} // TypeDecl
