/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.Literal#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Literal#getCl <em>Cl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Literal#getFl <em>Fl</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends EObject
{
  /**
   * Returns the value of the '<em><b>Basic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic</em>' containment reference.
   * @see #setBasic(BasicLit)
   * @see org.xtext.example.mydsl.go.GoPackage#getLiteral_Basic()
   * @model containment="true"
   * @generated
   */
  BasicLit getBasic();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Literal#getBasic <em>Basic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic</em>' containment reference.
   * @see #getBasic()
   * @generated
   */
  void setBasic(BasicLit value);

  /**
   * Returns the value of the '<em><b>Cl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cl</em>' containment reference.
   * @see #setCl(CompositeLit)
   * @see org.xtext.example.mydsl.go.GoPackage#getLiteral_Cl()
   * @model containment="true"
   * @generated
   */
  CompositeLit getCl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Literal#getCl <em>Cl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cl</em>' containment reference.
   * @see #getCl()
   * @generated
   */
  void setCl(CompositeLit value);

  /**
   * Returns the value of the '<em><b>Fl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fl</em>' containment reference.
   * @see #setFl(FunctionLit)
   * @see org.xtext.example.mydsl.go.GoPackage#getLiteral_Fl()
   * @model containment="true"
   * @generated
   */
  FunctionLit getFl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Literal#getFl <em>Fl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fl</em>' containment reference.
   * @see #getFl()
   * @generated
   */
  void setFl(FunctionLit value);

} // Literal
