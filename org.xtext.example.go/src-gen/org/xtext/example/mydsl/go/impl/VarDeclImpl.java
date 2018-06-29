/**
 * generated by Xtext 2.14.0.RC1
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

import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.VarDecl;
import org.xtext.example.mydsl.go.VarSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.VarDeclImpl#getVarspec <em>Varspec</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.VarDeclImpl#getVarspec2 <em>Varspec2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarDeclImpl extends DeclarationImpl implements VarDecl
{
  /**
   * The cached value of the '{@link #getVarspec() <em>Varspec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarspec()
   * @generated
   * @ordered
   */
  protected VarSpec varspec;

  /**
   * The cached value of the '{@link #getVarspec2() <em>Varspec2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarspec2()
   * @generated
   * @ordered
   */
  protected EList<VarSpec> varspec2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarDeclImpl()
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
    return GoPackage.Literals.VAR_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarSpec getVarspec()
  {
    return varspec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarspec(VarSpec newVarspec, NotificationChain msgs)
  {
    VarSpec oldVarspec = varspec;
    varspec = newVarspec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.VAR_DECL__VARSPEC, oldVarspec, newVarspec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarspec(VarSpec newVarspec)
  {
    if (newVarspec != varspec)
    {
      NotificationChain msgs = null;
      if (varspec != null)
        msgs = ((InternalEObject)varspec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.VAR_DECL__VARSPEC, null, msgs);
      if (newVarspec != null)
        msgs = ((InternalEObject)newVarspec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.VAR_DECL__VARSPEC, null, msgs);
      msgs = basicSetVarspec(newVarspec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.VAR_DECL__VARSPEC, newVarspec, newVarspec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VarSpec> getVarspec2()
  {
    if (varspec2 == null)
    {
      varspec2 = new EObjectContainmentEList<VarSpec>(VarSpec.class, this, GoPackage.VAR_DECL__VARSPEC2);
    }
    return varspec2;
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
      case GoPackage.VAR_DECL__VARSPEC:
        return basicSetVarspec(null, msgs);
      case GoPackage.VAR_DECL__VARSPEC2:
        return ((InternalEList<?>)getVarspec2()).basicRemove(otherEnd, msgs);
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
      case GoPackage.VAR_DECL__VARSPEC:
        return getVarspec();
      case GoPackage.VAR_DECL__VARSPEC2:
        return getVarspec2();
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
      case GoPackage.VAR_DECL__VARSPEC:
        setVarspec((VarSpec)newValue);
        return;
      case GoPackage.VAR_DECL__VARSPEC2:
        getVarspec2().clear();
        getVarspec2().addAll((Collection<? extends VarSpec>)newValue);
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
      case GoPackage.VAR_DECL__VARSPEC:
        setVarspec((VarSpec)null);
        return;
      case GoPackage.VAR_DECL__VARSPEC2:
        getVarspec2().clear();
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
      case GoPackage.VAR_DECL__VARSPEC:
        return varspec != null;
      case GoPackage.VAR_DECL__VARSPEC2:
        return varspec2 != null && !varspec2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VarDeclImpl
