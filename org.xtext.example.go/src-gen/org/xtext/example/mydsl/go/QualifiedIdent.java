/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Ident</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.QualifiedIdent#getPn <em>Pn</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getQualifiedIdent()
 * @model
 * @generated
 */
public interface QualifiedIdent extends OperandName
{
  /**
   * Returns the value of the '<em><b>Pn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pn</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pn</em>' containment reference.
   * @see #setPn(PackageName)
   * @see org.xtext.example.mydsl.go.GoPackage#getQualifiedIdent_Pn()
   * @model containment="true"
   * @generated
   */
  PackageName getPn();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.QualifiedIdent#getPn <em>Pn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pn</em>' containment reference.
   * @see #getPn()
   * @generated
   */
  void setPn(PackageName value);

} // QualifiedIdent
