/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.go.ConstDecl;
import org.xtext.example.mydsl.go.ConstSpec;
import org.xtext.example.mydsl.go.GoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Const Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ConstDeclImpl#getConstspec <em>Constspec</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ConstDeclImpl#getConstspec2 <em>Constspec2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstDeclImpl extends DeclarationImpl implements ConstDecl
{
  /**
   * The cached value of the '{@link #getConstspec() <em>Constspec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstspec()
   * @generated
   * @ordered
   */
  protected ConstSpec constspec;

  /**
   * The cached value of the '{@link #getConstspec2() <em>Constspec2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstspec2()
   * @generated
   * @ordered
   */
  protected EList<ConstSpec> constspec2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstDeclImpl()
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
    return GoPackage.Literals.CONST_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstSpec getConstspec()
  {
    return constspec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstspec(ConstSpec newConstspec, NotificationChain msgs)
  {
    ConstSpec oldConstspec = constspec;
    constspec = newConstspec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.CONST_DECL__CONSTSPEC, oldConstspec, newConstspec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstspec(ConstSpec newConstspec)
  {
    if (newConstspec != constspec)
    {
      NotificationChain msgs = null;
      if (constspec != null)
        msgs = ((InternalEObject)constspec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.CONST_DECL__CONSTSPEC, null, msgs);
      if (newConstspec != null)
        msgs = ((InternalEObject)newConstspec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.CONST_DECL__CONSTSPEC, null, msgs);
      msgs = basicSetConstspec(newConstspec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.CONST_DECL__CONSTSPEC, newConstspec, newConstspec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConstSpec> getConstspec2()
  {
    if (constspec2 == null)
    {
      constspec2 = new EObjectContainmentEList<ConstSpec>(ConstSpec.class, this, GoPackage.CONST_DECL__CONSTSPEC2);
    }
    return constspec2;
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
      case GoPackage.CONST_DECL__CONSTSPEC:
        return basicSetConstspec(null, msgs);
      case GoPackage.CONST_DECL__CONSTSPEC2:
        return ((InternalEList<?>)getConstspec2()).basicRemove(otherEnd, msgs);
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
      case GoPackage.CONST_DECL__CONSTSPEC:
        return getConstspec();
      case GoPackage.CONST_DECL__CONSTSPEC2:
        return getConstspec2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoPackage.CONST_DECL__CONSTSPEC:
        setConstspec((ConstSpec)newValue);
        return;
      case GoPackage.CONST_DECL__CONSTSPEC2:
        getConstspec2().clear();
        getConstspec2().addAll((Collection<? extends ConstSpec>)newValue);
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
      case GoPackage.CONST_DECL__CONSTSPEC:
        setConstspec((ConstSpec)null);
        return;
      case GoPackage.CONST_DECL__CONSTSPEC2:
        getConstspec2().clear();
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
      case GoPackage.CONST_DECL__CONSTSPEC:
        return constspec != null;
      case GoPackage.CONST_DECL__CONSTSPEC2:
        return constspec2 != null && !constspec2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConstDeclImpl
