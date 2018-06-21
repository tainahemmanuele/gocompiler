/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.go.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.go.BaseType;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.PointerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.PointerTypeImpl#getBasetype <em>Basetype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointerTypeImpl extends TypeLitImpl implements PointerType
{
  /**
   * The cached value of the '{@link #getBasetype() <em>Basetype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasetype()
   * @generated
   * @ordered
   */
  protected BaseType basetype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PointerTypeImpl()
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
    return GoPackage.Literals.POINTER_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseType getBasetype()
  {
    return basetype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasetype(BaseType newBasetype, NotificationChain msgs)
  {
    BaseType oldBasetype = basetype;
    basetype = newBasetype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.POINTER_TYPE__BASETYPE, oldBasetype, newBasetype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasetype(BaseType newBasetype)
  {
    if (newBasetype != basetype)
    {
      NotificationChain msgs = null;
      if (basetype != null)
        msgs = ((InternalEObject)basetype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.POINTER_TYPE__BASETYPE, null, msgs);
      if (newBasetype != null)
        msgs = ((InternalEObject)newBasetype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.POINTER_TYPE__BASETYPE, null, msgs);
      msgs = basicSetBasetype(newBasetype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.POINTER_TYPE__BASETYPE, newBasetype, newBasetype));
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
      case GoPackage.POINTER_TYPE__BASETYPE:
        return basicSetBasetype(null, msgs);
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
      case GoPackage.POINTER_TYPE__BASETYPE:
        return getBasetype();
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
      case GoPackage.POINTER_TYPE__BASETYPE:
        setBasetype((BaseType)newValue);
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
      case GoPackage.POINTER_TYPE__BASETYPE:
        setBasetype((BaseType)null);
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
      case GoPackage.POINTER_TYPE__BASETYPE:
        return basetype != null;
    }
    return super.eIsSet(featureID);
  }

} //PointerTypeImpl