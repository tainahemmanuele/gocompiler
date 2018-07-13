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

import org.xtext.example.mydsl.go.Conversion;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.MethodExpr;
import org.xtext.example.mydsl.go.Operand;
import org.xtext.example.mydsl.go.PrimaryExpr;
import org.xtext.example.mydsl.go.PrimaryExpr2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.PrimaryExprImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.PrimaryExprImpl#getPr <em>Pr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.PrimaryExprImpl#getCon <em>Con</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.PrimaryExprImpl#getMe <em>Me</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryExprImpl extends MinimalEObjectImpl.Container implements PrimaryExpr
{
  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected Operand op;

  /**
   * The cached value of the '{@link #getPr() <em>Pr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPr()
   * @generated
   * @ordered
   */
  protected PrimaryExpr2 pr;

  /**
   * The cached value of the '{@link #getCon() <em>Con</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCon()
   * @generated
   * @ordered
   */
  protected Conversion con;

  /**
   * The cached value of the '{@link #getMe() <em>Me</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMe()
   * @generated
   * @ordered
   */
  protected MethodExpr me;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryExprImpl()
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
    return GoPackage.Literals.PRIMARY_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operand getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp(Operand newOp, NotificationChain msgs)
  {
    Operand oldOp = op;
    op = newOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__OP, oldOp, newOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(Operand newOp)
  {
    if (newOp != op)
    {
      NotificationChain msgs = null;
      if (op != null)
        msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__OP, null, msgs);
      if (newOp != null)
        msgs = ((InternalEObject)newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__OP, null, msgs);
      msgs = basicSetOp(newOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__OP, newOp, newOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpr2 getPr()
  {
    return pr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPr(PrimaryExpr2 newPr, NotificationChain msgs)
  {
    PrimaryExpr2 oldPr = pr;
    pr = newPr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__PR, oldPr, newPr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPr(PrimaryExpr2 newPr)
  {
    if (newPr != pr)
    {
      NotificationChain msgs = null;
      if (pr != null)
        msgs = ((InternalEObject)pr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__PR, null, msgs);
      if (newPr != null)
        msgs = ((InternalEObject)newPr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__PR, null, msgs);
      msgs = basicSetPr(newPr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__PR, newPr, newPr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conversion getCon()
  {
    return con;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCon(Conversion newCon, NotificationChain msgs)
  {
    Conversion oldCon = con;
    con = newCon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__CON, oldCon, newCon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCon(Conversion newCon)
  {
    if (newCon != con)
    {
      NotificationChain msgs = null;
      if (con != null)
        msgs = ((InternalEObject)con).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__CON, null, msgs);
      if (newCon != null)
        msgs = ((InternalEObject)newCon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__CON, null, msgs);
      msgs = basicSetCon(newCon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__CON, newCon, newCon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodExpr getMe()
  {
    return me;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMe(MethodExpr newMe, NotificationChain msgs)
  {
    MethodExpr oldMe = me;
    me = newMe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__ME, oldMe, newMe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMe(MethodExpr newMe)
  {
    if (newMe != me)
    {
      NotificationChain msgs = null;
      if (me != null)
        msgs = ((InternalEObject)me).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__ME, null, msgs);
      if (newMe != null)
        msgs = ((InternalEObject)newMe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PRIMARY_EXPR__ME, null, msgs);
      msgs = basicSetMe(newMe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PRIMARY_EXPR__ME, newMe, newMe));
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
      case GoPackage.PRIMARY_EXPR__OP:
        return basicSetOp(null, msgs);
      case GoPackage.PRIMARY_EXPR__PR:
        return basicSetPr(null, msgs);
      case GoPackage.PRIMARY_EXPR__CON:
        return basicSetCon(null, msgs);
      case GoPackage.PRIMARY_EXPR__ME:
        return basicSetMe(null, msgs);
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
      case GoPackage.PRIMARY_EXPR__OP:
        return getOp();
      case GoPackage.PRIMARY_EXPR__PR:
        return getPr();
      case GoPackage.PRIMARY_EXPR__CON:
        return getCon();
      case GoPackage.PRIMARY_EXPR__ME:
        return getMe();
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
      case GoPackage.PRIMARY_EXPR__OP:
        setOp((Operand)newValue);
        return;
      case GoPackage.PRIMARY_EXPR__PR:
        setPr((PrimaryExpr2)newValue);
        return;
      case GoPackage.PRIMARY_EXPR__CON:
        setCon((Conversion)newValue);
        return;
      case GoPackage.PRIMARY_EXPR__ME:
        setMe((MethodExpr)newValue);
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
      case GoPackage.PRIMARY_EXPR__OP:
        setOp((Operand)null);
        return;
      case GoPackage.PRIMARY_EXPR__PR:
        setPr((PrimaryExpr2)null);
        return;
      case GoPackage.PRIMARY_EXPR__CON:
        setCon((Conversion)null);
        return;
      case GoPackage.PRIMARY_EXPR__ME:
        setMe((MethodExpr)null);
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
      case GoPackage.PRIMARY_EXPR__OP:
        return op != null;
      case GoPackage.PRIMARY_EXPR__PR:
        return pr != null;
      case GoPackage.PRIMARY_EXPR__CON:
        return con != null;
      case GoPackage.PRIMARY_EXPR__ME:
        return me != null;
    }
    return super.eIsSet(featureID);
  }

} //PrimaryExprImpl
