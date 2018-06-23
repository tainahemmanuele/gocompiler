/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.SimpleStmt#getEmpty <em>Empty</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getSimpleStmt()
 * @model
 * @generated
 */
public interface SimpleStmt extends TypeSwitchStmt, InitStmt, PostStmt
{
  /**
   * Returns the value of the '<em><b>Empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty</em>' attribute.
   * @see #setEmpty(String)
   * @see org.xtext.example.mydsl.go.GoPackage#getSimpleStmt_Empty()
   * @model
   * @generated
   */
  String getEmpty();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.SimpleStmt#getEmpty <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty</em>' attribute.
   * @see #getEmpty()
   * @generated
   */
  void setEmpty(String value);

} // SimpleStmt
