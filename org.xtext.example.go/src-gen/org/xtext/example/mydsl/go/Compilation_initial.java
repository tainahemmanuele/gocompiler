/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation initial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.Compilation_initial#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Compilation_initial#getImportdecl <em>Importdecl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Compilation_initial#getToplevel <em>Toplevel</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getCompilation_initial()
 * @model
 * @generated
 */
public interface Compilation_initial extends EObject
{
  /**
   * Returns the value of the '<em><b>Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial</em>' attribute.
   * @see #setInitial(String)
   * @see org.xtext.example.mydsl.go.GoPackage#getCompilation_initial_Initial()
   * @model
   * @generated
   */
  String getInitial();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Compilation_initial#getInitial <em>Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial</em>' attribute.
   * @see #getInitial()
   * @generated
   */
  void setInitial(String value);

  /**
   * Returns the value of the '<em><b>Importdecl</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.go.ImportDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Importdecl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Importdecl</em>' containment reference list.
   * @see org.xtext.example.mydsl.go.GoPackage#getCompilation_initial_Importdecl()
   * @model containment="true"
   * @generated
   */
  EList<ImportDecl> getImportdecl();

  /**
   * Returns the value of the '<em><b>Toplevel</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.go.TopLevelDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Toplevel</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Toplevel</em>' containment reference list.
   * @see org.xtext.example.mydsl.go.GoPackage#getCompilation_initial_Toplevel()
   * @model containment="true"
   * @generated
   */
  EList<TopLevelDecl> getToplevel();

} // Compilation_initial
