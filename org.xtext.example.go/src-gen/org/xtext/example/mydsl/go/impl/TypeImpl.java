/**
 * generated by Xtext 2.15.0-SNAPSHOT
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
import org.xtext.example.mydsl.go.TypeName;

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
   * The cached value of the '{@link #getTp() <em>Tp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTp()
   * @generated
   * @ordered
   */
  protected TypeName tp;

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
  public TypeName getTp()
  {
    return tp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTp(TypeName newTp, NotificationChain msgs)
  {
    TypeName oldTp = tp;
    tp = newTp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TYPE__TP, oldTp, newTp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTp(TypeName newTp)
  {
    if (newTp != tp)
    {
      NotificationChain msgs = null;
      if (tp != null)
        msgs = ((InternalEObject)tp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE__TP, null, msgs);
      if (newTp != null)
        msgs = ((InternalEObject)newTp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE__TP, null, msgs);
      msgs = basicSetTp(newTp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TYPE__TP, newTp, newTp));
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
      case GoPackage.TYPE__TP:
        return basicSetTp(null, msgs);
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
        setTp((TypeName)newValue);
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
        setTp((TypeName)null);
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
        return tp != null;
      case GoPackage.TYPE__TP2:
        return tp2 != null;
      case GoPackage.TYPE__TP3:
        return tp3 != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeImpl
