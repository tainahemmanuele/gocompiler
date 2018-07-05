/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.TypeSpec#getAliasdecl <em>Aliasdecl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.TypeSpec#getTyped <em>Typed</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getTypeSpec()
 * @model
 * @generated
 */
public interface TypeSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Aliasdecl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aliasdecl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aliasdecl</em>' containment reference.
   * @see #setAliasdecl(AliasDecl)
   * @see org.xtext.example.mydsl.go.GoPackage#getTypeSpec_Aliasdecl()
   * @model containment="true"
   * @generated
   */
  AliasDecl getAliasdecl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.TypeSpec#getAliasdecl <em>Aliasdecl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aliasdecl</em>' containment reference.
   * @see #getAliasdecl()
   * @generated
   */
  void setAliasdecl(AliasDecl value);

  /**
   * Returns the value of the '<em><b>Typed</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typed</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typed</em>' containment reference.
   * @see #setTyped(TypeDef)
   * @see org.xtext.example.mydsl.go.GoPackage#getTypeSpec_Typed()
   * @model containment="true"
   * @generated
   */
  TypeDef getTyped();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.TypeSpec#getTyped <em>Typed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typed</em>' containment reference.
   * @see #getTyped()
   * @generated
   */
  void setTyped(TypeDef value);

} // TypeSpec
