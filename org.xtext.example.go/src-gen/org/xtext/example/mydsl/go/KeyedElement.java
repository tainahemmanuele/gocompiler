/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.KeyedElement#getKeyedelement <em>Keyedelement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.KeyedElement#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getKeyedElement()
 * @model
 * @generated
 */
public interface KeyedElement extends ElementList
{
  /**
   * Returns the value of the '<em><b>Keyedelement</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.go.KeyedElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keyedelement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keyedelement</em>' containment reference list.
   * @see org.xtext.example.mydsl.go.GoPackage#getKeyedElement_Keyedelement()
   * @model containment="true"
   * @generated
   */
  EList<KeyedElement> getKeyedelement();

  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(Element)
   * @see org.xtext.example.mydsl.go.GoPackage#getKeyedElement_Element()
   * @model containment="true"
   * @generated
   */
  Element getElement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.KeyedElement#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Element value);

} // KeyedElement
