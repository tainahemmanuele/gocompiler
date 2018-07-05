/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.FunctionDecl#getFunctionn <em>Functionn</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.FunctionDecl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.FunctionDecl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getFunctionDecl()
 * @model
 * @generated
 */
public interface FunctionDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Functionn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functionn</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functionn</em>' containment reference.
   * @see #setFunctionn(FunctionName)
   * @see org.xtext.example.mydsl.go.GoPackage#getFunctionDecl_Functionn()
   * @model containment="true"
   * @generated
   */
  FunctionName getFunctionn();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.FunctionDecl#getFunctionn <em>Functionn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functionn</em>' containment reference.
   * @see #getFunctionn()
   * @generated
   */
  void setFunctionn(FunctionName value);

  /**
   * Returns the value of the '<em><b>Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' containment reference.
   * @see #setSignature(Signature)
   * @see org.xtext.example.mydsl.go.GoPackage#getFunctionDecl_Signature()
   * @model containment="true"
   * @generated
   */
  Signature getSignature();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.FunctionDecl#getSignature <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' containment reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(Signature value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.go.FunctionBody}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see org.xtext.example.mydsl.go.GoPackage#getFunctionDecl_Body()
   * @model containment="true"
   * @generated
   */
  EList<FunctionBody> getBody();

} // FunctionDecl
