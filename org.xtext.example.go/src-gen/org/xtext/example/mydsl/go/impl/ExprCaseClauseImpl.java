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

import org.xtext.example.mydsl.go.ExprCaseClause;
import org.xtext.example.mydsl.go.ExprSwitchCase;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.StatementList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Case Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExprCaseClauseImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExprCaseClauseImpl#getStatementlist <em>Statementlist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprCaseClauseImpl extends MinimalEObjectImpl.Container implements ExprCaseClause
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected ExprSwitchCase expr;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprCaseClauseImpl()
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
    return GoPackage.Literals.EXPR_CASE_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSwitchCase getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(ExprSwitchCase newExpr, NotificationChain msgs)
  {
    ExprSwitchCase oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPR_CASE_CLAUSE__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(ExprSwitchCase newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPR_CASE_CLAUSE__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPR_CASE_CLAUSE__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPR_CASE_CLAUSE__EXPR, newExpr, newExpr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPR_CASE_CLAUSE__STATEMENTLIST, oldStatementlist, newStatementlist);
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
        msgs = ((InternalEObject)statementlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPR_CASE_CLAUSE__STATEMENTLIST, null, msgs);
      if (newStatementlist != null)
        msgs = ((InternalEObject)newStatementlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPR_CASE_CLAUSE__STATEMENTLIST, null, msgs);
      msgs = basicSetStatementlist(newStatementlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPR_CASE_CLAUSE__STATEMENTLIST, newStatementlist, newStatementlist));
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
      case GoPackage.EXPR_CASE_CLAUSE__EXPR:
        return basicSetExpr(null, msgs);
      case GoPackage.EXPR_CASE_CLAUSE__STATEMENTLIST:
        return basicSetStatementlist(null, msgs);
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
      case GoPackage.EXPR_CASE_CLAUSE__EXPR:
        return getExpr();
      case GoPackage.EXPR_CASE_CLAUSE__STATEMENTLIST:
        return getStatementlist();
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
      case GoPackage.EXPR_CASE_CLAUSE__EXPR:
        setExpr((ExprSwitchCase)newValue);
        return;
      case GoPackage.EXPR_CASE_CLAUSE__STATEMENTLIST:
        setStatementlist((StatementList)newValue);
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
      case GoPackage.EXPR_CASE_CLAUSE__EXPR:
        setExpr((ExprSwitchCase)null);
        return;
      case GoPackage.EXPR_CASE_CLAUSE__STATEMENTLIST:
        setStatementlist((StatementList)null);
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
      case GoPackage.EXPR_CASE_CLAUSE__EXPR:
        return expr != null;
      case GoPackage.EXPR_CASE_CLAUSE__STATEMENTLIST:
        return statementlist != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprCaseClauseImpl
