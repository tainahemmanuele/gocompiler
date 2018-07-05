/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Level Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.TopLevelDecl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.TopLevelDecl#getFunctiondecl <em>Functiondecl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.TopLevelDecl#getMethoddecl <em>Methoddecl</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getTopLevelDecl()
 * @model
 * @generated
 */
public interface TopLevelDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' containment reference.
   * @see #setDeclaration(Declaration)
   * @see org.xtext.example.mydsl.go.GoPackage#getTopLevelDecl_Declaration()
   * @model containment="true"
   * @generated
   */
  Declaration getDeclaration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.TopLevelDecl#getDeclaration <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration</em>' containment reference.
   * @see #getDeclaration()
   * @generated
   */
  void setDeclaration(Declaration value);

  /**
   * Returns the value of the '<em><b>Functiondecl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functiondecl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functiondecl</em>' containment reference.
   * @see #setFunctiondecl(FunctionDecl)
   * @see org.xtext.example.mydsl.go.GoPackage#getTopLevelDecl_Functiondecl()
   * @model containment="true"
   * @generated
   */
  FunctionDecl getFunctiondecl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.TopLevelDecl#getFunctiondecl <em>Functiondecl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functiondecl</em>' containment reference.
   * @see #getFunctiondecl()
   * @generated
   */
  void setFunctiondecl(FunctionDecl value);

  /**
   * Returns the value of the '<em><b>Methoddecl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methoddecl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methoddecl</em>' containment reference.
   * @see #setMethoddecl(MethodDecl)
   * @see org.xtext.example.mydsl.go.GoPackage#getTopLevelDecl_Methoddecl()
   * @model containment="true"
   * @generated
   */
  MethodDecl getMethoddecl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.TopLevelDecl#getMethoddecl <em>Methoddecl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Methoddecl</em>' containment reference.
   * @see #getMethoddecl()
   * @generated
   */
  void setMethoddecl(MethodDecl value);

} // TopLevelDecl
