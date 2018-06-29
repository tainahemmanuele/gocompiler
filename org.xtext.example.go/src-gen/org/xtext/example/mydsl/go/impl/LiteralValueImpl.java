/**
 * generated by Xtext 2.14.0.RC1
 */
package org.xtext.example.mydsl.go.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.go.ElementList;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.LiteralValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.LiteralValueImpl#getElementlist <em>Elementlist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralValueImpl extends KeyImpl implements LiteralValue
{
  /**
   * The cached value of the '{@link #getElementlist() <em>Elementlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementlist()
   * @generated
   * @ordered
   */
  protected ElementList elementlist;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LiteralValueImpl()
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
    return GoPackage.Literals.LITERAL_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementList getElementlist()
  {
    return elementlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementlist(ElementList newElementlist, NotificationChain msgs)
  {
    ElementList oldElementlist = elementlist;
    elementlist = newElementlist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL_VALUE__ELEMENTLIST, oldElementlist, newElementlist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementlist(ElementList newElementlist)
  {
    if (newElementlist != elementlist)
    {
      NotificationChain msgs = null;
      if (elementlist != null)
        msgs = ((InternalEObject)elementlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL_VALUE__ELEMENTLIST, null, msgs);
      if (newElementlist != null)
        msgs = ((InternalEObject)newElementlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL_VALUE__ELEMENTLIST, null, msgs);
      msgs = basicSetElementlist(newElementlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL_VALUE__ELEMENTLIST, newElementlist, newElementlist));
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
      case GoPackage.LITERAL_VALUE__ELEMENTLIST:
        return basicSetElementlist(null, msgs);
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
      case GoPackage.LITERAL_VALUE__ELEMENTLIST:
        return getElementlist();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoPackage.LITERAL_VALUE__ELEMENTLIST:
        setElementlist((ElementList)newValue);
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
      case GoPackage.LITERAL_VALUE__ELEMENTLIST:
        setElementlist((ElementList)null);
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
      case GoPackage.LITERAL_VALUE__ELEMENTLIST:
        return elementlist != null;
    }
    return super.eIsSet(featureID);
  }

} //LiteralValueImpl
