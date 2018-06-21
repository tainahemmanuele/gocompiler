/**
 * generated by Xtext 2.13.0
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