/**
 * generated by Xtext 2.14.0.RC1
 */
package org.xtext.example.mydsl.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.CompositeLit#getLiteralt <em>Literalt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.CompositeLit#getLiteralv <em>Literalv</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getCompositeLit()
 * @model
 * @generated
 */
public interface CompositeLit extends Literal
{
  /**
   * Returns the value of the '<em><b>Literalt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literalt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literalt</em>' containment reference.
   * @see #setLiteralt(LiteralType)
   * @see org.xtext.example.mydsl.go.GoPackage#getCompositeLit_Literalt()
   * @model containment="true"
   * @generated
   */
  LiteralType getLiteralt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.CompositeLit#getLiteralt <em>Literalt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literalt</em>' containment reference.
   * @see #getLiteralt()
   * @generated
   */
  void setLiteralt(LiteralType value);

  /**
   * Returns the value of the '<em><b>Literalv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literalv</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literalv</em>' containment reference.
   * @see #setLiteralv(LiteralValue)
   * @see org.xtext.example.mydsl.go.GoPackage#getCompositeLit_Literalv()
   * @model containment="true"
   * @generated
   */
  LiteralValue getLiteralv();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.CompositeLit#getLiteralv <em>Literalv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literalv</em>' containment reference.
   * @see #getLiteralv()
   * @generated
   */
  void setLiteralv(LiteralValue value);

} // CompositeLit
