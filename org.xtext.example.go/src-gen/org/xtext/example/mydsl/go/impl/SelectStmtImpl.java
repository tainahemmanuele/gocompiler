/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.go.CommClause;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.SelectStmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.SelectStmtImpl#getCommclause <em>Commclause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectStmtImpl extends MinimalEObjectImpl.Container implements SelectStmt
{
  /**
   * The cached value of the '{@link #getCommclause() <em>Commclause</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommclause()
   * @generated
   * @ordered
   */
  protected EList<CommClause> commclause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectStmtImpl()
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
    return GoPackage.Literals.SELECT_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CommClause> getCommclause()
  {
    if (commclause == null)
    {
      commclause = new EObjectContainmentEList<CommClause>(CommClause.class, this, GoPackage.SELECT_STMT__COMMCLAUSE);
    }
    return commclause;
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
      case GoPackage.SELECT_STMT__COMMCLAUSE:
        return ((InternalEList<?>)getCommclause()).basicRemove(otherEnd, msgs);
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
      case GoPackage.SELECT_STMT__COMMCLAUSE:
        return getCommclause();
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
      case GoPackage.SELECT_STMT__COMMCLAUSE:
        getCommclause().clear();
        getCommclause().addAll((Collection<? extends CommClause>)newValue);
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
      case GoPackage.SELECT_STMT__COMMCLAUSE:
        getCommclause().clear();
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
      case GoPackage.SELECT_STMT__COMMCLAUSE:
        return commclause != null && !commclause.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SelectStmtImpl
