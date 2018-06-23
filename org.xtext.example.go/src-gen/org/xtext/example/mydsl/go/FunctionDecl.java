/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.common.util.EList;

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
public interface FunctionDecl extends TopLevelDecl
{
  /**
   * Returns the value of the '<em><b>Functionn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functionn</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functionn</em>' attribute.
   * @see #setFunctionn(String)
   * @see org.xtext.example.mydsl.go.GoPackage#getFunctionDecl_Functionn()
   * @model
   * @generated
   */
  String getFunctionn();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.FunctionDecl#getFunctionn <em>Functionn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functionn</em>' attribute.
   * @see #getFunctionn()
   * @generated
   */
  void setFunctionn(String value);

  /**
   * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.go.Signature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' containment reference list.
   * @see org.xtext.example.mydsl.go.GoPackage#getFunctionDecl_Signature()
   * @model containment="true"
   * @generated
   */
  EList<Signature> getSignature();

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
