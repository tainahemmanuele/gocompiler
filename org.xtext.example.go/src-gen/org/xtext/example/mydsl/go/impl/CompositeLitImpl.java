/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.go.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.go.CompositeLit;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.LiteralType;
import org.xtext.example.mydsl.go.LiteralValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Lit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.CompositeLitImpl#getLiteralt <em>Literalt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.CompositeLitImpl#getLiteralv <em>Literalv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeLitImpl extends LiteralImpl implements CompositeLit
{
  /**
   * The cached value of the '{@link #getLiteralt() <em>Literalt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteralt()
   * @generated
   * @ordered
   */
  protected LiteralType literalt;

  /**
   * The cached value of the '{@link #getLiteralv() <em>Literalv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteralv()
   * @generated
   * @ordered
   */
  protected LiteralValue literalv;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositeLitImpl()
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
    return GoPackage.Literals.COMPOSITE_LIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralType getLiteralt()
  {
    return literalt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiteralt(LiteralType newLiteralt, NotificationChain msgs)
  {
    LiteralType oldLiteralt = literalt;
    literalt = newLiteralt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.COMPOSITE_LIT__LITERALT, oldLiteralt, newLiteralt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteralt(LiteralType newLiteralt)
  {
    if (newLiteralt != literalt)
    {
      NotificationChain msgs = null;
      if (literalt != null)
        msgs = ((InternalEObject)literalt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMPOSITE_LIT__LITERALT, null, msgs);
      if (newLiteralt != null)
        msgs = ((InternalEObject)newLiteralt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMPOSITE_LIT__LITERALT, null, msgs);
      msgs = basicSetLiteralt(newLiteralt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.COMPOSITE_LIT__LITERALT, newLiteralt, newLiteralt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralValue getLiteralv()
  {
    return literalv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiteralv(LiteralValue newLiteralv, NotificationChain msgs)
  {
    LiteralValue oldLiteralv = literalv;
    literalv = newLiteralv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.COMPOSITE_LIT__LITERALV, oldLiteralv, newLiteralv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteralv(LiteralValue newLiteralv)
  {
    if (newLiteralv != literalv)
    {
      NotificationChain msgs = null;
      if (literalv != null)
        msgs = ((InternalEObject)literalv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMPOSITE_LIT__LITERALV, null, msgs);
      if (newLiteralv != null)
        msgs = ((InternalEObject)newLiteralv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMPOSITE_LIT__LITERALV, null, msgs);
      msgs = basicSetLiteralv(newLiteralv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.COMPOSITE_LIT__LITERALV, newLiteralv, newLiteralv));
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
      case GoPackage.COMPOSITE_LIT__LITERALT:
        return basicSetLiteralt(null, msgs);
      case GoPackage.COMPOSITE_LIT__LITERALV:
        return basicSetLiteralv(null, msgs);
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
      case GoPackage.COMPOSITE_LIT__LITERALT:
        return getLiteralt();
      case GoPackage.COMPOSITE_LIT__LITERALV:
        return getLiteralv();
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
      case GoPackage.COMPOSITE_LIT__LITERALT:
        setLiteralt((LiteralType)newValue);
        return;
      case GoPackage.COMPOSITE_LIT__LITERALV:
        setLiteralv((LiteralValue)newValue);
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
      case GoPackage.COMPOSITE_LIT__LITERALT:
        setLiteralt((LiteralType)null);
        return;
      case GoPackage.COMPOSITE_LIT__LITERALV:
        setLiteralv((LiteralValue)null);
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
      case GoPackage.COMPOSITE_LIT__LITERALT:
        return literalt != null;
      case GoPackage.COMPOSITE_LIT__LITERALV:
        return literalv != null;
    }
    return super.eIsSet(featureID);
  }

} //CompositeLitImpl