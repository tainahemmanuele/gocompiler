/**
 * generated by Xtext 2.14.0
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
 *   <li>{@link org.xtext.example.mydsl.go.Declaration#getCd <em>Cd</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Declaration#getTd <em>Td</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Declaration#getVd <em>Vd</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Cd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cd</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cd</em>' containment reference.
   * @see #setCd(ConstDecl)
   * @see org.xtext.example.mydsl.go.GoPackage#getDeclaration_Cd()
   * @model containment="true"
   * @generated
   */
  ConstDecl getCd();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Declaration#getCd <em>Cd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cd</em>' containment reference.
   * @see #getCd()
   * @generated
   */
  void setCd(ConstDecl value);

  /**
   * Returns the value of the '<em><b>Td</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Td</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Td</em>' containment reference.
   * @see #setTd(TypeDecl)
   * @see org.xtext.example.mydsl.go.GoPackage#getDeclaration_Td()
   * @model containment="true"
   * @generated
   */
  TypeDecl getTd();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Declaration#getTd <em>Td</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Td</em>' containment reference.
   * @see #getTd()
   * @generated
   */
  void setTd(TypeDecl value);

  /**
   * Returns the value of the '<em><b>Vd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vd</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vd</em>' containment reference.
   * @see #setVd(VarDecl)
   * @see org.xtext.example.mydsl.go.GoPackage#getDeclaration_Vd()
   * @model containment="true"
   * @generated
   */
  VarDecl getVd();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Declaration#getVd <em>Vd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vd</em>' containment reference.
   * @see #getVd()
   * @generated
   */
  void setVd(VarDecl value);

} // Declaration
