/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.Block#getStmtl <em>Stmtl</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject
{
  /**
   * Returns the value of the '<em><b>Stmtl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmtl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmtl</em>' containment reference.
   * @see #setStmtl(StatementList)
   * @see org.xtext.example.mydsl.go.GoPackage#getBlock_Stmtl()
   * @model containment="true"
   * @generated
   */
  StatementList getStmtl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Block#getStmtl <em>Stmtl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmtl</em>' containment reference.
   * @see #getStmtl()
   * @generated
   */
  void setStmtl(StatementList value);

} // Block
