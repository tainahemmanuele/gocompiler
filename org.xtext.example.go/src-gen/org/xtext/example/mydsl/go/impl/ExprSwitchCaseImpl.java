/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.go.ExprSwitchCase;
import org.xtext.example.mydsl.go.ExpressionList;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.StatementList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Switch Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExprSwitchCaseImpl#getStatementlist <em>Statementlist</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExprSwitchCaseImpl#getExpressionlist <em>Expressionlist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprSwitchCaseImpl extends ExprCaseClauseImpl implements ExprSwitchCase
{
  /**
   * The cached value of the '{@link #getStatementlist() <em>Statementlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementlist()
   * @generated
   * @ordered
   */
  protected StatementList statementlist;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprSwitchCaseImpl()
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
    return GoPackage.Literals.EXPR_SWITCH_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementList getStatementlist()
  {
    return statementlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatementlist(StatementList newStatementlist, NotificationChain msgs)
  {
    StatementList oldStatementlist = statementlist;
    statementlist = newStatementlist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPR_SWITCH_CASE__STATEMENTLIST, oldStatementlist, newStatementlist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatementlist(StatementList newStatementlist)
  {
    if (newStatementlist != statementlist)
    {
      NotificationChain msgs = null;
      if (statementlist != null)
        msgs = ((InternalEObject)statementlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPR_SWITCH_CASE__STATEMENTLIST, null, msgs);
      if (newStatementlist != null)
        msgs = ((InternalEObject)newStatementlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPR_SWITCH_CASE__STATEMENTLIST, null, msgs);
      msgs = basicSetStatementlist(newStatementlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPR_SWITCH_CASE__STATEMENTLIST, newStatementlist, newStatementlist));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPR_SWITCH_CASE__EXPRESSIONLIST, oldExpressionlist, newExpressionlist);
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
        msgs = ((InternalEObject)expressionlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPR_SWITCH_CASE__EXPRESSIONLIST, null, msgs);
      if (newExpressionlist != null)
        msgs = ((InternalEObject)newExpressionlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPR_SWITCH_CASE__EXPRESSIONLIST, null, msgs);
      msgs = basicSetExpressionlist(newExpressionlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPR_SWITCH_CASE__EXPRESSIONLIST, newExpressionlist, newExpressionlist));
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
      case GoPackage.EXPR_SWITCH_CASE__STATEMENTLIST:
        return basicSetStatementlist(null, msgs);
      case GoPackage.EXPR_SWITCH_CASE__EXPRESSIONLIST:
        return basicSetExpressionlist(null, msgs);
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
      case GoPackage.EXPR_SWITCH_CASE__STATEMENTLIST:
        return getStatementlist();
      case GoPackage.EXPR_SWITCH_CASE__EXPRESSIONLIST:
        return getExpressionlist();
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
      case GoPackage.EXPR_SWITCH_CASE__STATEMENTLIST:
        setStatementlist((StatementList)newValue);
        return;
      case GoPackage.EXPR_SWITCH_CASE__EXPRESSIONLIST:
        setExpressionlist((ExpressionList)newValue);
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
      case GoPackage.EXPR_SWITCH_CASE__STATEMENTLIST:
        setStatementlist((StatementList)null);
        return;
      case GoPackage.EXPR_SWITCH_CASE__EXPRESSIONLIST:
        setExpressionlist((ExpressionList)null);
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
      case GoPackage.EXPR_SWITCH_CASE__STATEMENTLIST:
        return statementlist != null;
      case GoPackage.EXPR_SWITCH_CASE__EXPRESSIONLIST:
        return expressionlist != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprSwitchCaseImpl
