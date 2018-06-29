/**
 * generated by Xtext 2.14.0.RC1
 */
package org.xtext.example.mydsl.go.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.Type;
import org.xtext.example.mydsl.go.TypeLit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.TypeImpl#getTp <em>Tp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.TypeImpl#getTp2 <em>Tp2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.TypeImpl#getTp3 <em>Tp3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends ElementTypeImpl implements Type
{
  /**
   * The default value of the '{@link #getTp() <em>Tp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTp()
   * @generated
   * @ordered
   */
  protected static final String TP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTp() <em>Tp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTp()
   * @generated
   * @ordered
   */
  protected String tp = TP_EDEFAULT;

  /**
   * The cached value of the '{@link #getTp2() <em>Tp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTp2()
   * @generated
   * @ordered
   */
  protected TypeLit tp2;

  /**
   * The cached value of the '{@link #getTp3() <em>Tp3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTp3()
   * @generated
   * @ordered
   */
  protected Type tp3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return GoPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTp()
  {
    return tp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTp(String newTp)
  {
    String oldTp = tp;
    tp = newTp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TYPE__TP, oldTp, tp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeLit getTp2()
  {
    return tp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTp2(TypeLit newTp2, NotificationChain msgs)
  {
    TypeLit oldTp2 = tp2;
    tp2 = newTp2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TYPE__TP2, oldTp2, newTp2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTp2(TypeLit newTp2)
  {
    if (newTp2 != tp2)
    {
      NotificationChain msgs = null;
      if (tp2 != null)
        msgs = ((InternalEObject)tp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE__TP2, null, msgs);
      if (newTp2 != null)
        msgs = ((InternalEObject)newTp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE__TP2, null, msgs);
      msgs = basicSetTp2(newTp2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TYPE__TP2, newTp2, newTp2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getTp3()
  {
    return tp3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTp3(Type newTp3, NotificationChain msgs)
  {
    Type oldTp3 = tp3;
    tp3 = newTp3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TYPE__TP3, oldTp3, newTp3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTp3(Type newTp3)
  {
    if (newTp3 != tp3)
    {
      NotificationChain msgs = null;
      if (tp3 != null)
        msgs = ((InternalEObject)tp3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE__TP3, null, msgs);
      if (newTp3 != null)
        msgs = ((InternalEObject)newTp3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE__TP3, null, msgs);
      msgs = basicSetTp3(newTp3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TYPE__TP3, newTp3, newTp3));
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
      case GoPackage.TYPE__TP2:
        return basicSetTp2(null, msgs);
      case GoPackage.TYPE__TP3:
        return basicSetTp3(null, msgs);
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
      case GoPackage.TYPE__TP:
        return getTp();
      case GoPackage.TYPE__TP2:
        return getTp2();
      case GoPackage.TYPE__TP3:
        return getTp3();
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
      case GoPackage.TYPE__TP:
        setTp((String)newValue);
        return;
      case GoPackage.TYPE__TP2:
        setTp2((TypeLit)newValue);
        return;
      case GoPackage.TYPE__TP3:
        setTp3((Type)newValue);
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
      case GoPackage.TYPE__TP:
        setTp(TP_EDEFAULT);
        return;
      case GoPackage.TYPE__TP2:
        setTp2((TypeLit)null);
        return;
      case GoPackage.TYPE__TP3:
        setTp3((Type)null);
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
      case GoPackage.TYPE__TP:
        return TP_EDEFAULT == null ? tp != null : !TP_EDEFAULT.equals(tp);
      case GoPackage.TYPE__TP2:
        return tp2 != null;
      case GoPackage.TYPE__TP3:
        return tp3 != null;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (tp: ");
    result.append(tp);
    result.append(')');
    return result.toString();
  }

} //TypeImpl
