/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.ImportDecl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.ImportDecl#getImports2 <em>Imports2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getImportDecl()
 * @model
 * @generated
 */
public interface ImportDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.go.ImportSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.xtext.example.mydsl.go.GoPackage#getImportDecl_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportSpec> getImports();

  /**
   * Returns the value of the '<em><b>Imports2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.go.ImportSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports2</em>' containment reference list.
   * @see org.xtext.example.mydsl.go.GoPackage#getImportDecl_Imports2()
   * @model containment="true"
   * @generated
   */
  EList<ImportSpec> getImports2();

} // ImportDecl
