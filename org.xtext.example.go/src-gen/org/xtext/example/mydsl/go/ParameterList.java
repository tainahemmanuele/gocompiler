/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.ParameterList#getParameterDecl1 <em>Parameter Decl1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.ParameterList#getParameterdecl <em>Parameterdecl</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getParameterList()
 * @model
 * @generated
 */
public interface ParameterList extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Decl1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Decl1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Decl1</em>' containment reference.
   * @see #setParameterDecl1(ParameterDecl)
   * @see org.xtext.example.mydsl.go.GoPackage#getParameterList_ParameterDecl1()
   * @model containment="true"
   * @generated
   */
  ParameterDecl getParameterDecl1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.ParameterList#getParameterDecl1 <em>Parameter Decl1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Decl1</em>' containment reference.
   * @see #getParameterDecl1()
   * @generated
   */
  void setParameterDecl1(ParameterDecl value);

  /**
   * Returns the value of the '<em><b>Parameterdecl</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.go.ParameterDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameterdecl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameterdecl</em>' containment reference list.
   * @see org.xtext.example.mydsl.go.GoPackage#getParameterList_Parameterdecl()
   * @model containment="true"
   * @generated
   */
  EList<ParameterDecl> getParameterdecl();

} // ParameterList
