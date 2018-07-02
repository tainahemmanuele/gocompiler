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

import org.xtext.example.mydsl.go.ExpressionList;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.Type;
import org.xtext.example.mydsl.go.VarSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.VarSpecImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.VarSpecImpl#getTp2 <em>Tp2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.VarSpecImpl#getExpressionlist <em>Expressionlist</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.VarSpecImpl#getEprlist <em>Eprlist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarSpecImpl extends MinimalEObjectImpl.Container implements VarSpec
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getTp2() <em>Tp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTp2()
   * @generated
   * @ordered
   */
  protected Type tp2;

  /**
   * The cached value of the '{@link #getExpressionlist() <em>Expressionlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionlist()
   * @generated
   * @ordered
   */
  protected ExpressionList expressionlist;

  /**
   * The cached value of the '{@link #getEprlist() <em>Eprlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEprlist()
   * @generated
   * @ordered
   */
  protected ExpressionList eprlist;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarSpecImpl()
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
    return GoPackage.Literals.VAR_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.VAR_SPEC__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getTp2()
  {
    return tp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTp2(Type newTp2, NotificationChain msgs)
  {
    Type oldTp2 = tp2;
    tp2 = newTp2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.VAR_SPEC__TP2, oldTp2, newTp2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTp2(Type newTp2)
  {
    if (newTp2 != tp2)
    {
      NotificationChain msgs = null;
      if (tp2 != null)
        msgs = ((InternalEObject)tp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.VAR_SPEC__TP2, null, msgs);
      if (newTp2 != null)
        msgs = ((InternalEObject)newTp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.VAR_SPEC__TP2, null, msgs);
      msgs = basicSetTp2(newTp2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.VAR_SPEC__TP2, newTp2, newTp2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList getExpressionlist()
  {
    return expressionlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionlist(ExpressionList newExpressionlist, NotificationChain msgs)
  {
    ExpressionList oldExpressionlist = expressionlist;
    expressionlist = newExpressionlist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.VAR_SPEC__EXPRESSIONLIST, oldExpressionlist, newExpressionlist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionlist(ExpressionList newExpressionlist)
  {
    if (newExpressionlist != expressionlist)
    {
      NotificationChain msgs = null;
      if (expressionlist != null)
        msgs = ((InternalEObject)expressionlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.VAR_SPEC__EXPRESSIONLIST, null, msgs);
      if (newExpressionlist != null)
        msgs = ((InternalEObject)newExpressionlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.VAR_SPEC__EXPRESSIONLIST, null, msgs);
      msgs = basicSetExpressionlist(newExpressionlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.VAR_SPEC__EXPRESSIONLIST, newExpressionlist, newExpressionlist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList getEprlist()
  {
    return eprlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEprlist(ExpressionList newEprlist, NotificationChain msgs)
  {
    ExpressionList oldEprlist = eprlist;
    eprlist = newEprlist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.VAR_SPEC__EPRLIST, oldEprlist, newEprlist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEprlist(ExpressionList newEprlist)
  {
    if (newEprlist != eprlist)
    {
      NotificationChain msgs = null;
      if (eprlist != null)
        msgs = ((InternalEObject)eprlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.VAR_SPEC__EPRLIST, null, msgs);
      if (newEprlist != null)
        msgs = ((InternalEObject)newEprlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.VAR_SPEC__EPRLIST, null, msgs);
      msgs = basicSetEprlist(newEprlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.VAR_SPEC__EPRLIST, newEprlist, newEprlist));
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
      case GoPackage.VAR_SPEC__TP2:
        return basicSetTp2(null, msgs);
      case GoPackage.VAR_SPEC__EXPRESSIONLIST:
        return basicSetExpressionlist(null, msgs);
      case GoPackage.VAR_SPEC__EPRLIST:
        return basicSetEprlist(null, msgs);
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
      case GoPackage.VAR_SPEC__ID:
        return getId();
      case GoPackage.VAR_SPEC__TP2:
        return getTp2();
      case GoPackage.VAR_SPEC__EXPRESSIONLIST:
        return getExpressionlist();
      case GoPackage.VAR_SPEC__EPRLIST:
        return getEprlist();
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
      case GoPackage.VAR_SPEC__ID:
        setId((String)newValue);
        return;
      case GoPackage.VAR_SPEC__TP2:
        setTp2((Type)newValue);
        return;
      case GoPackage.VAR_SPEC__EXPRESSIONLIST:
        setExpressionlist((ExpressionList)newValue);
        return;
      case GoPackage.VAR_SPEC__EPRLIST:
        setEprlist((ExpressionList)newValue);
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
      case GoPackage.VAR_SPEC__ID:
        setId(ID_EDEFAULT);
        return;
      case GoPackage.VAR_SPEC__TP2:
        setTp2((Type)null);
        return;
      case GoPackage.VAR_SPEC__EXPRESSIONLIST:
        setExpressionlist((ExpressionList)null);
        return;
      case GoPackage.VAR_SPEC__EPRLIST:
        setEprlist((ExpressionList)null);
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
      case GoPackage.VAR_SPEC__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case GoPackage.VAR_SPEC__TP2:
        return tp2 != null;
      case GoPackage.VAR_SPEC__EXPRESSIONLIST:
        return expressionlist != null;
      case GoPackage.VAR_SPEC__EPRLIST:
        return eprlist != null;
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
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //VarSpecImpl
