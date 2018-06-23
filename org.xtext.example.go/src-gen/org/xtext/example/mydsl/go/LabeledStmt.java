/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.LabeledStmt#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.LabeledStmt#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getLabeledStmt()
 * @model
 * @generated
 */
public interface LabeledStmt extends EObject
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.xtext.example.mydsl.go.GoPackage#getLabeledStmt_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.LabeledStmt#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(Statement)
   * @see org.xtext.example.mydsl.go.GoPackage#getLabeledStmt_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.LabeledStmt#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

} // LabeledStmt
