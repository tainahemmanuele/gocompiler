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

import org.xtext.example.mydsl.go.FieldDecl;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.StructType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.StructTypeImpl#getFielddecl <em>Fielddecl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructTypeImpl extends TypeLitImpl implements StructType
{
  /**
   * The cached value of the '{@link #getFielddecl() <em>Fielddecl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFielddecl()
   * @generated
   * @ordered
   */
  protected EList<FieldDecl> fielddecl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructTypeImpl()
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
    return GoPackage.Literals.STRUCT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldDecl> getFielddecl()
  {
    if (fielddecl == null)
    {
      fielddecl = new EObjectContainmentEList<FieldDecl>(FieldDecl.class, this, GoPackage.STRUCT_TYPE__FIELDDECL);
    }
    return fielddecl;
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
      case GoPackage.STRUCT_TYPE__FIELDDECL:
        return ((InternalEList<?>)getFielddecl()).basicRemove(otherEnd, msgs);
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
      case GoPackage.STRUCT_TYPE__FIELDDECL:
        return getFielddecl();
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
      case GoPackage.STRUCT_TYPE__FIELDDECL:
        getFielddecl().clear();
        getFielddecl().addAll((Collection<? extends FieldDecl>)newValue);
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
      case GoPackage.STRUCT_TYPE__FIELDDECL:
        getFielddecl().clear();
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
      case GoPackage.STRUCT_TYPE__FIELDDECL:
        return fielddecl != null && !fielddecl.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StructTypeImpl