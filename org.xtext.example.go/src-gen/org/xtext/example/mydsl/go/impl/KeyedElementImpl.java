/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.go.Element;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.KeyedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keyed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.KeyedElementImpl#getKeyedelement <em>Keyedelement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.KeyedElementImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyedElementImpl extends ElementListImpl implements KeyedElement
{
  /**
   * The cached value of the '{@link #getKeyedelement() <em>Keyedelement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyedelement()
   * @generated
   * @ordered
   */
  protected EList<KeyedElement> keyedelement;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected Element element;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KeyedElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GoPackage.Literals.KEYED_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<KeyedElement> getKeyedelement()
  {
    if (keyedelement == null)
    {
      keyedelement = new EObjectContainmentEList<KeyedElement>(KeyedElement.class, this, GoPackage.KEYED_ELEMENT__KEYEDELEMENT);
    }
    return keyedelement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElement(Element newElement, NotificationChain msgs)
  {
    Element oldElement = element;
    element = newElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.KEYED_ELEMENT__ELEMENT, oldElement, newElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(Element newElement)
  {
    if (newElement != element)
    {
      NotificationChain msgs = null;
      if (element != null)
        msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.KEYED_ELEMENT__ELEMENT, null, msgs);
      if (newElement != null)
        msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.KEYED_ELEMENT__ELEMENT, null, msgs);
      msgs = basicSetElement(newElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.KEYED_ELEMENT__ELEMENT, newElement, newElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GoPackage.KEYED_ELEMENT__KEYEDELEMENT:
        return ((InternalEList<?>)getKeyedelement()).basicRemove(otherEnd, msgs);
      case GoPackage.KEYED_ELEMENT__ELEMENT:
        return basicSetElement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GoPackage.KEYED_ELEMENT__KEYEDELEMENT:
        return getKeyedelement();
      case GoPackage.KEYED_ELEMENT__ELEMENT:
        return getElement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoPackage.KEYED_ELEMENT__KEYEDELEMENT:
        getKeyedelement().clear();
        getKeyedelement().addAll((Collection<? extends KeyedElement>)newValue);
        return;
      case GoPackage.KEYED_ELEMENT__ELEMENT:
        setElement((Element)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GoPackage.KEYED_ELEMENT__KEYEDELEMENT:
        getKeyedelement().clear();
        return;
      case GoPackage.KEYED_ELEMENT__ELEMENT:
        setElement((Element)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GoPackage.KEYED_ELEMENT__KEYEDELEMENT:
        return keyedelement != null && !keyedelement.isEmpty();
      case GoPackage.KEYED_ELEMENT__ELEMENT:
        return element != null;
    }
    return super.eIsSet(featureID);
  }

} //KeyedElementImpl
