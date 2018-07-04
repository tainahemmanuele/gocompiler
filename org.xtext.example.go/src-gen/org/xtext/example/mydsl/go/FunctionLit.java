/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.FunctionLit#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.FunctionLit#getFunctionbody <em>Functionbody</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getFunctionLit()
 * @model
 * @generated
 */
public interface FunctionLit extends EObject
{
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
   * @see org.xtext.example.mydsl.go.GoPackage#getFunctionLit_Signature()
   * @model containment="true"
   * @generated
   */
  Signature getSignature();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.FunctionLit#getSignature <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' containment reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(Signature value);

  /**
   * Returns the value of the '<em><b>Functionbody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functionbody</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functionbody</em>' containment reference.
   * @see #setFunctionbody(FunctionBody)
   * @see org.xtext.example.mydsl.go.GoPackage#getFunctionLit_Functionbody()
   * @model containment="true"
   * @generated
   */
  FunctionBody getFunctionbody();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.FunctionLit#getFunctionbody <em>Functionbody</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functionbody</em>' containment reference.
   * @see #getFunctionbody()
   * @generated
   */
  void setFunctionbody(FunctionBody value);

} // FunctionLit
