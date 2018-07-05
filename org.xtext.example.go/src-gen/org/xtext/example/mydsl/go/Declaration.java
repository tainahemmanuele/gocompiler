/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.Declaration#getConst <em>Const</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Declaration#getTye <em>Tye</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Declaration#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Const</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' containment reference.
   * @see #setConst(ConstDecl)
   * @see org.xtext.example.mydsl.go.GoPackage#getDeclaration_Const()
   * @model containment="true"
   * @generated
   */
  ConstDecl getConst();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Declaration#getConst <em>Const</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' containment reference.
   * @see #getConst()
   * @generated
   */
  void setConst(ConstDecl value);

  /**
   * Returns the value of the '<em><b>Tye</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tye</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tye</em>' containment reference.
   * @see #setTye(TypeDecl)
   * @see org.xtext.example.mydsl.go.GoPackage#getDeclaration_Tye()
   * @model containment="true"
   * @generated
   */
  TypeDecl getTye();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Declaration#getTye <em>Tye</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tye</em>' containment reference.
   * @see #getTye()
   * @generated
   */
  void setTye(TypeDecl value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(VarDecl)
   * @see org.xtext.example.mydsl.go.GoPackage#getDeclaration_Var()
   * @model containment="true"
   * @generated
   */
  VarDecl getVar();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Declaration#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(VarDecl value);

} // Declaration
