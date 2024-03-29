/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.MethodSpec;
import org.xtext.example.mydsl.go.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.MethodSpecImpl#getMn <em>Mn</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.MethodSpecImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.MethodSpecImpl#getItn <em>Itn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodSpecImpl extends MinimalEObjectImpl.Container implements MethodSpec
{
  /**
   * The default value of the '{@link #getMn() <em>Mn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMn()
   * @generated
   * @ordered
   */
  protected static final String MN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMn() <em>Mn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMn()
   * @generated
   * @ordered
   */
  protected String mn = MN_EDEFAULT;

  /**
   * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignature()
   * @generated
   * @ordered
   */
  protected Signature signature;

  /**
   * The default value of the '{@link #getItn() <em>Itn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItn()
   * @generated
   * @ordered
   */
  protected static final String ITN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getItn() <em>Itn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItn()
   * @generated
   * @ordered
   */
  protected String itn = ITN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodSpecImpl()
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
    return GoPackage.Literals.METHOD_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMn()
  {
    return mn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMn(String newMn)
  {
    String oldMn = mn;
    mn = newMn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.METHOD_SPEC__MN, oldMn, mn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signature getSignature()
  {
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSignature(Signature newSignature, NotificationChain msgs)
  {
    Signature oldSignature = signature;
    signature = newSignature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.METHOD_SPEC__SIGNATURE, oldSignature, newSignature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignature(Signature newSignature)
  {
    if (newSignature != signature)
    {
      NotificationChain msgs = null;
      if (signature != null)
        msgs = ((InternalEObject)signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.METHOD_SPEC__SIGNATURE, null, msgs);
      if (newSignature != null)
        msgs = ((InternalEObject)newSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.METHOD_SPEC__SIGNATURE, null, msgs);
      msgs = basicSetSignature(newSignature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.METHOD_SPEC__SIGNATURE, newSignature, newSignature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getItn()
  {
    return itn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItn(String newItn)
  {
    String oldItn = itn;
    itn = newItn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.METHOD_SPEC__ITN, oldItn, itn));
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
      case GoPackage.METHOD_SPEC__SIGNATURE:
        return basicSetSignature(null, msgs);
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
      case GoPackage.METHOD_SPEC__MN:
        return getMn();
      case GoPackage.METHOD_SPEC__SIGNATURE:
        return getSignature();
      case GoPackage.METHOD_SPEC__ITN:
        return getItn();
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
      case GoPackage.METHOD_SPEC__MN:
        setMn((String)newValue);
        return;
      case GoPackage.METHOD_SPEC__SIGNATURE:
        setSignature((Signature)newValue);
        return;
      case GoPackage.METHOD_SPEC__ITN:
        setItn((String)newValue);
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
      case GoPackage.METHOD_SPEC__MN:
        setMn(MN_EDEFAULT);
        return;
      case GoPackage.METHOD_SPEC__SIGNATURE:
        setSignature((Signature)null);
        return;
      case GoPackage.METHOD_SPEC__ITN:
        setItn(ITN_EDEFAULT);
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
      case GoPackage.METHOD_SPEC__MN:
        return MN_EDEFAULT == null ? mn != null : !MN_EDEFAULT.equals(mn);
      case GoPackage.METHOD_SPEC__SIGNATURE:
        return signature != null;
      case GoPackage.METHOD_SPEC__ITN:
        return ITN_EDEFAULT == null ? itn != null : !ITN_EDEFAULT.equals(itn);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (mn: ");
    result.append(mn);
    result.append(", itn: ");
    result.append(itn);
    result.append(')');
    return result.toString();
  }

} //MethodSpecImpl
