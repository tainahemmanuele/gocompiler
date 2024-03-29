/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.PostStmt#getSimple <em>Simple</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getPostStmt()
 * @model
 * @generated
 */
public interface PostStmt extends EObject
{
  /**
   * Returns the value of the '<em><b>Simple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple</em>' containment reference.
   * @see #setSimple(SimpleStmt)
   * @see org.xtext.example.mydsl.go.GoPackage#getPostStmt_Simple()
   * @model containment="true"
   * @generated
   */
  SimpleStmt getSimple();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.PostStmt#getSimple <em>Simple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple</em>' containment reference.
   * @see #getSimple()
   * @generated
   */
  void setSimple(SimpleStmt value);

} // PostStmt
