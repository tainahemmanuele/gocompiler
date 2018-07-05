/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.StatementList#getStatment <em>Statment</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getStatementList()
 * @model
 * @generated
 */
public interface StatementList extends Block
{
  /**
   * Returns the value of the '<em><b>Statment</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.go.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statment</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statment</em>' containment reference list.
   * @see org.xtext.example.mydsl.go.GoPackage#getStatementList_Statment()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatment();

} // StatementList
