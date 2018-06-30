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

import org.xtext.example.mydsl.go.Condition;
import org.xtext.example.mydsl.go.ForClause;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.PostStmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ForClauseImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ForClauseImpl#getPoststmt <em>Poststmt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForClauseImpl extends MinimalEObjectImpl.Container implements ForClause
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Condition condition;

  /**
   * The cached value of the '{@link #getPoststmt() <em>Poststmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoststmt()
   * @generated
   * @ordered
   */
  protected PostStmt poststmt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForClauseImpl()
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
    return GoPackage.Literals.FOR_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs)
  {
    Condition oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.FOR_CLAUSE__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Condition newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.FOR_CLAUSE__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.FOR_CLAUSE__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.FOR_CLAUSE__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostStmt getPoststmt()
  {
    return poststmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPoststmt(PostStmt newPoststmt, NotificationChain msgs)
  {
    PostStmt oldPoststmt = poststmt;
    poststmt = newPoststmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.FOR_CLAUSE__POSTSTMT, oldPoststmt, newPoststmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPoststmt(PostStmt newPoststmt)
  {
    if (newPoststmt != poststmt)
    {
      NotificationChain msgs = null;
      if (poststmt != null)
        msgs = ((InternalEObject)poststmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.FOR_CLAUSE__POSTSTMT, null, msgs);
      if (newPoststmt != null)
        msgs = ((InternalEObject)newPoststmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.FOR_CLAUSE__POSTSTMT, null, msgs);
      msgs = basicSetPoststmt(newPoststmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.FOR_CLAUSE__POSTSTMT, newPoststmt, newPoststmt));
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
      case GoPackage.FOR_CLAUSE__CONDITION:
        return basicSetCondition(null, msgs);
      case GoPackage.FOR_CLAUSE__POSTSTMT:
        return basicSetPoststmt(null, msgs);
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
      case GoPackage.FOR_CLAUSE__CONDITION:
        return getCondition();
      case GoPackage.FOR_CLAUSE__POSTSTMT:
        return getPoststmt();
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
      case GoPackage.FOR_CLAUSE__CONDITION:
        setCondition((Condition)newValue);
        return;
      case GoPackage.FOR_CLAUSE__POSTSTMT:
        setPoststmt((PostStmt)newValue);
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
      case GoPackage.FOR_CLAUSE__CONDITION:
        setCondition((Condition)null);
        return;
      case GoPackage.FOR_CLAUSE__POSTSTMT:
        setPoststmt((PostStmt)null);
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
      case GoPackage.FOR_CLAUSE__CONDITION:
        return condition != null;
      case GoPackage.FOR_CLAUSE__POSTSTMT:
        return poststmt != null;
    }
    return super.eIsSet(featureID);
  }

} //ForClauseImpl
