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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.go.Compilation_initial;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.ImportDecl;
import org.xtext.example.mydsl.go.TopLevelDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation initial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.Compilation_initialImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.Compilation_initialImpl#getImportdecl <em>Importdecl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.Compilation_initialImpl#getToplevel <em>Toplevel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Compilation_initialImpl extends MinimalEObjectImpl.Container implements Compilation_initial
{
  /**
   * The default value of the '{@link #getInitial() <em>Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitial()
   * @generated
   * @ordered
   */
  protected static final String INITIAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInitial() <em>Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitial()
   * @generated
   * @ordered
   */
  protected String initial = INITIAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getImportdecl() <em>Importdecl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportdecl()
   * @generated
   * @ordered
   */
  protected EList<ImportDecl> importdecl;

  /**
   * The cached value of the '{@link #getToplevel() <em>Toplevel</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToplevel()
   * @generated
   * @ordered
   */
  protected EList<TopLevelDecl> toplevel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Compilation_initialImpl()
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
    return GoPackage.Literals.COMPILATION_INITIAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInitial()
  {
    return initial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitial(String newInitial)
  {
    String oldInitial = initial;
    initial = newInitial;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.COMPILATION_INITIAL__INITIAL, oldInitial, initial));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportDecl> getImportdecl()
  {
    if (importdecl == null)
    {
      importdecl = new EObjectContainmentEList<ImportDecl>(ImportDecl.class, this, GoPackage.COMPILATION_INITIAL__IMPORTDECL);
    }
    return importdecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TopLevelDecl> getToplevel()
  {
    if (toplevel == null)
    {
      toplevel = new EObjectContainmentEList<TopLevelDecl>(TopLevelDecl.class, this, GoPackage.COMPILATION_INITIAL__TOPLEVEL);
    }
    return toplevel;
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
      case GoPackage.COMPILATION_INITIAL__IMPORTDECL:
        return ((InternalEList<?>)getImportdecl()).basicRemove(otherEnd, msgs);
      case GoPackage.COMPILATION_INITIAL__TOPLEVEL:
        return ((InternalEList<?>)getToplevel()).basicRemove(otherEnd, msgs);
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
      case GoPackage.COMPILATION_INITIAL__INITIAL:
        return getInitial();
      case GoPackage.COMPILATION_INITIAL__IMPORTDECL:
        return getImportdecl();
      case GoPackage.COMPILATION_INITIAL__TOPLEVEL:
        return getToplevel();
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
      case GoPackage.COMPILATION_INITIAL__INITIAL:
        setInitial((String)newValue);
        return;
      case GoPackage.COMPILATION_INITIAL__IMPORTDECL:
        getImportdecl().clear();
        getImportdecl().addAll((Collection<? extends ImportDecl>)newValue);
        return;
      case GoPackage.COMPILATION_INITIAL__TOPLEVEL:
        getToplevel().clear();
        getToplevel().addAll((Collection<? extends TopLevelDecl>)newValue);
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
      case GoPackage.COMPILATION_INITIAL__INITIAL:
        setInitial(INITIAL_EDEFAULT);
        return;
      case GoPackage.COMPILATION_INITIAL__IMPORTDECL:
        getImportdecl().clear();
        return;
      case GoPackage.COMPILATION_INITIAL__TOPLEVEL:
        getToplevel().clear();
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
      case GoPackage.COMPILATION_INITIAL__INITIAL:
        return INITIAL_EDEFAULT == null ? initial != null : !INITIAL_EDEFAULT.equals(initial);
      case GoPackage.COMPILATION_INITIAL__IMPORTDECL:
        return importdecl != null && !importdecl.isEmpty();
      case GoPackage.COMPILATION_INITIAL__TOPLEVEL:
        return toplevel != null && !toplevel.isEmpty();
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
    result.append(" (initial: ");
    result.append(initial);
    result.append(')');
    return result.toString();
  }

} //Compilation_initialImpl
