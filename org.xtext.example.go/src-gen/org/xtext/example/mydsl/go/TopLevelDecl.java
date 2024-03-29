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
 *   <li>{@link org.xtext.example.mydsl.go.TopLevelDecl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.TopLevelDecl#getFd <em>Fd</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.TopLevelDecl#getMt <em>Mt</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getTopLevelDecl()
 * @model
 * @generated
 */
public interface TopLevelDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Dl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dl</em>' containment reference.
   * @see #setDl(Declaration)
   * @see org.xtext.example.mydsl.go.GoPackage#getTopLevelDecl_Dl()
   * @model containment="true"
   * @generated
   */
  Declaration getDl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.TopLevelDecl#getDl <em>Dl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dl</em>' containment reference.
   * @see #getDl()
   * @generated
   */
  void setDl(Declaration value);

  /**
   * Returns the value of the '<em><b>Fd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fd</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fd</em>' containment reference.
   * @see #setFd(FunctionDecl)
   * @see org.xtext.example.mydsl.go.GoPackage#getTopLevelDecl_Fd()
   * @model containment="true"
   * @generated
   */
  FunctionDecl getFd();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.TopLevelDecl#getFd <em>Fd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fd</em>' containment reference.
   * @see #getFd()
   * @generated
   */
  void setFd(FunctionDecl value);

  /**
   * Returns the value of the '<em><b>Mt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mt</em>' containment reference.
   * @see #setMt(MethodDecl)
   * @see org.xtext.example.mydsl.go.GoPackage#getTopLevelDecl_Mt()
   * @model containment="true"
   * @generated
   */
  MethodDecl getMt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.TopLevelDecl#getMt <em>Mt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mt</em>' containment reference.
   * @see #getMt()
   * @generated
   */
  void setMt(MethodDecl value);

} // TopLevelDecl
