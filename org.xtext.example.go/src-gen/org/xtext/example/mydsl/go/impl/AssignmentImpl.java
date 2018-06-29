/**
 * generated by Xtext 2.14.0.RC1
 */
package org.xtext.example.mydsl.go.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.go.Assignment;
import org.xtext.example.mydsl.go.ExpressionList;
import org.xtext.example.mydsl.go.GoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.AssignmentImpl#getExpressionlist <em>Expressionlist</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.AssignmentImpl#getAsop <em>Asop</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.AssignmentImpl#getExpressionlist2 <em>Expressionlist2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends MinimalEObjectImpl.Container implements Assignment
{
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
   * The default value of the '{@link #getAsop() <em>Asop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsop()
   * @generated
   * @ordered
   */
  protected static final String ASOP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAsop() <em>Asop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsop()
   * @generated
   * @ordered
   */
  protected String asop = ASOP_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpressionlist2() <em>Expressionlist2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionlist2()
   * @generated
   * @ordered
   */
  protected ExpressionList expressionlist2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentImpl()
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
    return GoPackage.Literals.ASSIGNMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.ASSIGNMENT__EXPRESSIONLIST, oldExpressionlist, newExpressionlist);
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
        msgs = ((InternalEObject)expressionlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.ASSIGNMENT__EXPRESSIONLIST, null, msgs);
      if (newExpressionlist != null)
        msgs = ((InternalEObject)newExpressionlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.ASSIGNMENT__EXPRESSIONLIST, null, msgs);
      msgs = basicSetExpressionlist(newExpressionlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.ASSIGNMENT__EXPRESSIONLIST, newExpressionlist, newExpressionlist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAsop()
  {
    return asop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAsop(String newAsop)
  {
    String oldAsop = asop;
    asop = newAsop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.ASSIGNMENT__ASOP, oldAsop, asop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList getExpressionlist2()
  {
    return expressionlist2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionlist2(ExpressionList newExpressionlist2, NotificationChain msgs)
  {
    ExpressionList oldExpressionlist2 = expressionlist2;
    expressionlist2 = newExpressionlist2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.ASSIGNMENT__EXPRESSIONLIST2, oldExpressionlist2, newExpressionlist2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionlist2(ExpressionList newExpressionlist2)
  {
    if (newExpressionlist2 != expressionlist2)
    {
      NotificationChain msgs = null;
      if (expressionlist2 != null)
        msgs = ((InternalEObject)expressionlist2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.ASSIGNMENT__EXPRESSIONLIST2, null, msgs);
      if (newExpressionlist2 != null)
        msgs = ((InternalEObject)newExpressionlist2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.ASSIGNMENT__EXPRESSIONLIST2, null, msgs);
      msgs = basicSetExpressionlist2(newExpressionlist2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.ASSIGNMENT__EXPRESSIONLIST2, newExpressionlist2, newExpressionlist2));
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
      case GoPackage.ASSIGNMENT__EXPRESSIONLIST:
        return basicSetExpressionlist(null, msgs);
      case GoPackage.ASSIGNMENT__EXPRESSIONLIST2:
        return basicSetExpressionlist2(null, msgs);
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
      case GoPackage.ASSIGNMENT__EXPRESSIONLIST:
        return getExpressionlist();
      case GoPackage.ASSIGNMENT__ASOP:
        return getAsop();
      case GoPackage.ASSIGNMENT__EXPRESSIONLIST2:
        return getExpressionlist2();
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
      case GoPackage.ASSIGNMENT__EXPRESSIONLIST:
        setExpressionlist((ExpressionList)newValue);
        return;
      case GoPackage.ASSIGNMENT__ASOP:
        setAsop((String)newValue);
        return;
      case GoPackage.ASSIGNMENT__EXPRESSIONLIST2:
        setExpressionlist2((ExpressionList)newValue);
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
      case GoPackage.ASSIGNMENT__EXPRESSIONLIST:
        setExpressionlist((ExpressionList)null);
        return;
      case GoPackage.ASSIGNMENT__ASOP:
        setAsop(ASOP_EDEFAULT);
        return;
      case GoPackage.ASSIGNMENT__EXPRESSIONLIST2:
        setExpressionlist2((ExpressionList)null);
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
      case GoPackage.ASSIGNMENT__EXPRESSIONLIST:
        return expressionlist != null;
      case GoPackage.ASSIGNMENT__ASOP:
        return ASOP_EDEFAULT == null ? asop != null : !ASOP_EDEFAULT.equals(asop);
      case GoPackage.ASSIGNMENT__EXPRESSIONLIST2:
        return expressionlist2 != null;
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
    result.append(" (asop: ");
    result.append(asop);
    result.append(')');
    return result.toString();
  }

} //AssignmentImpl
