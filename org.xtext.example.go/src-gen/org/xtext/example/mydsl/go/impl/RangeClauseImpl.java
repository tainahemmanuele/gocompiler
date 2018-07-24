/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.go.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.go.Expression;
import org.xtext.example.mydsl.go.ExpressionList;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.IdentifierList;
import org.xtext.example.mydsl.go.RangeClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.RangeClauseImpl#getExpressionlist <em>Expressionlist</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.RangeClauseImpl#getIdl <em>Idl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.RangeClauseImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeClauseImpl extends MinimalEObjectImpl.Container implements RangeClause
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
   * The cached value of the '{@link #getIdl() <em>Idl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdl()
   * @generated
   * @ordered
   */
  protected IdentifierList idl;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RangeClauseImpl()
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
    return GoPackage.Literals.RANGE_CLAUSE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.RANGE_CLAUSE__EXPRESSIONLIST, oldExpressionlist, newExpressionlist);
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
        msgs = ((InternalEObject)expressionlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.RANGE_CLAUSE__EXPRESSIONLIST, null, msgs);
      if (newExpressionlist != null)
        msgs = ((InternalEObject)newExpressionlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.RANGE_CLAUSE__EXPRESSIONLIST, null, msgs);
      msgs = basicSetExpressionlist(newExpressionlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RANGE_CLAUSE__EXPRESSIONLIST, newExpressionlist, newExpressionlist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierList getIdl()
  {
    return idl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdl(IdentifierList newIdl, NotificationChain msgs)
  {
    IdentifierList oldIdl = idl;
    idl = newIdl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.RANGE_CLAUSE__IDL, oldIdl, newIdl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdl(IdentifierList newIdl)
  {
    if (newIdl != idl)
    {
      NotificationChain msgs = null;
      if (idl != null)
        msgs = ((InternalEObject)idl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.RANGE_CLAUSE__IDL, null, msgs);
      if (newIdl != null)
        msgs = ((InternalEObject)newIdl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.RANGE_CLAUSE__IDL, null, msgs);
      msgs = basicSetIdl(newIdl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RANGE_CLAUSE__IDL, newIdl, newIdl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.RANGE_CLAUSE__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.RANGE_CLAUSE__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.RANGE_CLAUSE__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RANGE_CLAUSE__EXPRESSION, newExpression, newExpression));
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
      case GoPackage.RANGE_CLAUSE__EXPRESSIONLIST:
        return basicSetExpressionlist(null, msgs);
      case GoPackage.RANGE_CLAUSE__IDL:
        return basicSetIdl(null, msgs);
      case GoPackage.RANGE_CLAUSE__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case GoPackage.RANGE_CLAUSE__EXPRESSIONLIST:
        return getExpressionlist();
      case GoPackage.RANGE_CLAUSE__IDL:
        return getIdl();
      case GoPackage.RANGE_CLAUSE__EXPRESSION:
        return getExpression();
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
      case GoPackage.RANGE_CLAUSE__EXPRESSIONLIST:
        setExpressionlist((ExpressionList)newValue);
        return;
      case GoPackage.RANGE_CLAUSE__IDL:
        setIdl((IdentifierList)newValue);
        return;
      case GoPackage.RANGE_CLAUSE__EXPRESSION:
        setExpression((Expression)newValue);
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
      case GoPackage.RANGE_CLAUSE__EXPRESSIONLIST:
        setExpressionlist((ExpressionList)null);
        return;
      case GoPackage.RANGE_CLAUSE__IDL:
        setIdl((IdentifierList)null);
        return;
      case GoPackage.RANGE_CLAUSE__EXPRESSION:
        setExpression((Expression)null);
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
      case GoPackage.RANGE_CLAUSE__EXPRESSIONLIST:
        return expressionlist != null;
      case GoPackage.RANGE_CLAUSE__IDL:
        return idl != null;
      case GoPackage.RANGE_CLAUSE__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //RangeClauseImpl
