/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.Parameters#getParameterlist <em>Parameterlist</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getParameters()
 * @model
 * @generated
 */
public interface Parameters extends Receiver
{
  /**
   * Returns the value of the '<em><b>Parameterlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameterlist</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameterlist</em>' containment reference.
   * @see #setParameterlist(ParameterList)
   * @see org.xtext.example.mydsl.go.GoPackage#getParameters_Parameterlist()
   * @model containment="true"
   * @generated
   */
  ParameterList getParameterlist();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Parameters#getParameterlist <em>Parameterlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameterlist</em>' containment reference.
   * @see #getParameterlist()
   * @generated
   */
  void setParameterlist(ParameterList value);

} // Parameters
