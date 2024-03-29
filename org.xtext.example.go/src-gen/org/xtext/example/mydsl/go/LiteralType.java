/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.LiteralType#getStructtype <em>Structtype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.LiteralType#getArraytype <em>Arraytype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.LiteralType#getElementype <em>Elementype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.LiteralType#getSlicetype <em>Slicetype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.LiteralType#getMaptype <em>Maptype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.LiteralType#getTypename <em>Typename</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getLiteralType()
 * @model
 * @generated
 */
public interface LiteralType extends EObject
{
  /**
   * Returns the value of the '<em><b>Structtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structtype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structtype</em>' containment reference.
   * @see #setStructtype(StructType)
   * @see org.xtext.example.mydsl.go.GoPackage#getLiteralType_Structtype()
   * @model containment="true"
   * @generated
   */
  StructType getStructtype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.LiteralType#getStructtype <em>Structtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structtype</em>' containment reference.
   * @see #getStructtype()
   * @generated
   */
  void setStructtype(StructType value);

  /**
   * Returns the value of the '<em><b>Arraytype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arraytype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arraytype</em>' containment reference.
   * @see #setArraytype(ArrayType)
   * @see org.xtext.example.mydsl.go.GoPackage#getLiteralType_Arraytype()
   * @model containment="true"
   * @generated
   */
  ArrayType getArraytype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.LiteralType#getArraytype <em>Arraytype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arraytype</em>' containment reference.
   * @see #getArraytype()
   * @generated
   */
  void setArraytype(ArrayType value);

  /**
   * Returns the value of the '<em><b>Elementype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elementype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elementype</em>' containment reference.
   * @see #setElementype(ElementType)
   * @see org.xtext.example.mydsl.go.GoPackage#getLiteralType_Elementype()
   * @model containment="true"
   * @generated
   */
  ElementType getElementype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.LiteralType#getElementype <em>Elementype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elementype</em>' containment reference.
   * @see #getElementype()
   * @generated
   */
  void setElementype(ElementType value);

  /**
   * Returns the value of the '<em><b>Slicetype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Slicetype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slicetype</em>' containment reference.
   * @see #setSlicetype(SliceType)
   * @see org.xtext.example.mydsl.go.GoPackage#getLiteralType_Slicetype()
   * @model containment="true"
   * @generated
   */
  SliceType getSlicetype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.LiteralType#getSlicetype <em>Slicetype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Slicetype</em>' containment reference.
   * @see #getSlicetype()
   * @generated
   */
  void setSlicetype(SliceType value);

  /**
   * Returns the value of the '<em><b>Maptype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maptype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maptype</em>' containment reference.
   * @see #setMaptype(MapType)
   * @see org.xtext.example.mydsl.go.GoPackage#getLiteralType_Maptype()
   * @model containment="true"
   * @generated
   */
  MapType getMaptype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.LiteralType#getMaptype <em>Maptype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maptype</em>' containment reference.
   * @see #getMaptype()
   * @generated
   */
  void setMaptype(MapType value);

  /**
   * Returns the value of the '<em><b>Typename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typename</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typename</em>' attribute.
   * @see #setTypename(String)
   * @see org.xtext.example.mydsl.go.GoPackage#getLiteralType_Typename()
   * @model
   * @generated
   */
  String getTypename();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.LiteralType#getTypename <em>Typename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typename</em>' attribute.
   * @see #getTypename()
   * @generated
   */
  void setTypename(String value);

} // LiteralType
