/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.SelectStmt#getCommclause <em>Commclause</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getSelectStmt()
 * @model
 * @generated
 */
public interface SelectStmt extends EObject
{
  /**
   * Returns the value of the '<em><b>Commclause</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.go.CommClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commclause</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commclause</em>' containment reference list.
   * @see org.xtext.example.mydsl.go.GoPackage#getSelectStmt_Commclause()
   * @model containment="true"
   * @generated
   */
  EList<CommClause> getCommclause();

} // SelectStmt
