/**
 * generated by Xtext 2.14.0
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
import org.xtext.example.mydsl.go.ParameterDecl;
import org.xtext.example.mydsl.go.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ParameterDeclImpl#getParameterdecl <em>Parameterdecl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ParameterDeclImpl#getIndentifierL <em>Indentifier L</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ParameterDeclImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterDeclImpl extends ParameterListImpl implements ParameterDecl
{
  /**
   * The cached value of the '{@link #getParameterdecl() <em>Parameterdecl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterdecl()
   * @generated
   * @ordered
   */
  protected EList<ParameterDecl> parameterdecl;

  /**
   * The default value of the '{@link #getIndentifierL() <em>Indentifier L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndentifierL()
   * @generated
   * @ordered
   */
  protected static final String INDENTIFIER_L_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIndentifierL() <em>Indentifier L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndentifierL()
   * @generated
   * @ordered
   */
  protected String indentifierL = INDENTIFIER_L_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterDeclImpl()
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
    return GoPackage.Literals.PARAMETER_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterDecl> getParameterdecl()
  {
    if (parameterdecl == null)
    {
      parameterdecl = new EObjectContainmentEList<ParameterDecl>(ParameterDecl.class, this, GoPackage.PARAMETER_DECL__PARAMETERDECL);
    }
    return parameterdecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIndentifierL()
  {
    return indentifierL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndentifierL(String newIndentifierL)
  {
    String oldIndentifierL = indentifierL;
    indentifierL = newIndentifierL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PARAMETER_DECL__INDENTIFIER_L, oldIndentifierL, indentifierL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PARAMETER_DECL__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PARAMETER_DECL__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PARAMETER_DECL__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PARAMETER_DECL__TYPE, newType, newType));
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
      case GoPackage.PARAMETER_DECL__PARAMETERDECL:
        return ((InternalEList<?>)getParameterdecl()).basicRemove(otherEnd, msgs);
      case GoPackage.PARAMETER_DECL__TYPE:
        return basicSetType(null, msgs);
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
      case GoPackage.PARAMETER_DECL__PARAMETERDECL:
        return getParameterdecl();
      case GoPackage.PARAMETER_DECL__INDENTIFIER_L:
        return getIndentifierL();
      case GoPackage.PARAMETER_DECL__TYPE:
        return getType();
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
      case GoPackage.PARAMETER_DECL__PARAMETERDECL:
        getParameterdecl().clear();
        getParameterdecl().addAll((Collection<? extends ParameterDecl>)newValue);
        return;
      case GoPackage.PARAMETER_DECL__INDENTIFIER_L:
        setIndentifierL((String)newValue);
        return;
      case GoPackage.PARAMETER_DECL__TYPE:
        setType((Type)newValue);
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
      case GoPackage.PARAMETER_DECL__PARAMETERDECL:
        getParameterdecl().clear();
        return;
      case GoPackage.PARAMETER_DECL__INDENTIFIER_L:
        setIndentifierL(INDENTIFIER_L_EDEFAULT);
        return;
      case GoPackage.PARAMETER_DECL__TYPE:
        setType((Type)null);
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
      case GoPackage.PARAMETER_DECL__PARAMETERDECL:
        return parameterdecl != null && !parameterdecl.isEmpty();
      case GoPackage.PARAMETER_DECL__INDENTIFIER_L:
        return INDENTIFIER_L_EDEFAULT == null ? indentifierL != null : !INDENTIFIER_L_EDEFAULT.equals(indentifierL);
      case GoPackage.PARAMETER_DECL__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (indentifierL: ");
    result.append(indentifierL);
    result.append(')');
    return result.toString();
  }

} //ParameterDeclImpl
