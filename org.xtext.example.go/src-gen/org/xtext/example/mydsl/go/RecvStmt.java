/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recv Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.RecvStmt#getIdl <em>Idl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.RecvStmt#getRecvexpr <em>Recvexpr</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getRecvStmt()
 * @model
 * @generated
 */
public interface RecvStmt extends EObject
{
  /**
   * Returns the value of the '<em><b>Idl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Idl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Idl</em>' containment reference.
   * @see #setIdl(IdentifierList)
   * @see org.xtext.example.mydsl.go.GoPackage#getRecvStmt_Idl()
   * @model containment="true"
   * @generated
   */
  IdentifierList getIdl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.RecvStmt#getIdl <em>Idl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Idl</em>' containment reference.
   * @see #getIdl()
   * @generated
   */
  void setIdl(IdentifierList value);

  /**
   * Returns the value of the '<em><b>Recvexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recvexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recvexpr</em>' containment reference.
   * @see #setRecvexpr(RecvExpr)
   * @see org.xtext.example.mydsl.go.GoPackage#getRecvStmt_Recvexpr()
   * @model containment="true"
   * @generated
   */
  RecvExpr getRecvexpr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.RecvStmt#getRecvexpr <em>Recvexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recvexpr</em>' containment reference.
   * @see #getRecvexpr()
   * @generated
   */
  void setRecvexpr(RecvExpr value);

} // RecvStmt
