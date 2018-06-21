/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.go.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.go.FunctionBody;
import org.xtext.example.mydsl.go.FunctionDecl;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.FunctionDeclImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.FunctionDeclImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionDeclImpl extends TopLevelDeclImpl implements FunctionDecl
{
  /**
   * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignature()
   * @generated
   * @ordered
   */
  protected EList<Signature> signature;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected EList<FunctionBody> body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionDeclImpl()
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
    return GoPackage.Literals.FUNCTION_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Signature> getSignature()
  {
    if (signature == null)
    {
      signature = new EObjectContainmentEList<Signature>(Signature.class, this, GoPackage.FUNCTION_DECL__SIGNATURE);
    }
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionBody> getBody()
  {
    if (body == null)
    {
      body = new EObjectContainmentEList<FunctionBody>(FunctionBody.class, this, GoPackage.FUNCTION_DECL__BODY);
    }
    return body;
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
      case GoPackage.FUNCTION_DECL__SIGNATURE:
        return ((InternalEList<?>)getSignature()).basicRemove(otherEnd, msgs);
      case GoPackage.FUNCTION_DECL__BODY:
        return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
      case GoPackage.FUNCTION_DECL__SIGNATURE:
        return getSignature();
      case GoPackage.FUNCTION_DECL__BODY:
        return getBody();
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
      case GoPackage.FUNCTION_DECL__SIGNATURE:
        getSignature().clear();
        getSignature().addAll((Collection<? extends Signature>)newValue);
        return;
      case GoPackage.FUNCTION_DECL__BODY:
        getBody().clear();
        getBody().addAll((Collection<? extends FunctionBody>)newValue);
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
      case GoPackage.FUNCTION_DECL__SIGNATURE:
        getSignature().clear();
        return;
      case GoPackage.FUNCTION_DECL__BODY:
        getBody().clear();
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
      case GoPackage.FUNCTION_DECL__SIGNATURE:
        return signature != null && !signature.isEmpty();
      case GoPackage.FUNCTION_DECL__BODY:
        return body != null && !body.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FunctionDeclImpl
