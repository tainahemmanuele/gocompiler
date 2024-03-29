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

import org.xtext.example.mydsl.go.Assignment;
import org.xtext.example.mydsl.go.ExpressionStmt;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.IncDecStmt;
import org.xtext.example.mydsl.go.SendStmt;
import org.xtext.example.mydsl.go.ShortVarDecl;
import org.xtext.example.mydsl.go.SimpleStmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.SimpleStmtImpl#getInc <em>Inc</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.SimpleStmtImpl#getAss <em>Ass</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.SimpleStmtImpl#getSs <em>Ss</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.SimpleStmtImpl#getSvd <em>Svd</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.SimpleStmtImpl#getEs <em>Es</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.SimpleStmtImpl#getEmpty <em>Empty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleStmtImpl extends MinimalEObjectImpl.Container implements SimpleStmt
{
  /**
   * The cached value of the '{@link #getInc() <em>Inc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInc()
   * @generated
   * @ordered
   */
  protected IncDecStmt inc;

  /**
   * The cached value of the '{@link #getAss() <em>Ass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAss()
   * @generated
   * @ordered
   */
  protected Assignment ass;

  /**
   * The cached value of the '{@link #getSs() <em>Ss</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSs()
   * @generated
   * @ordered
   */
  protected SendStmt ss;

  /**
   * The cached value of the '{@link #getSvd() <em>Svd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSvd()
   * @generated
   * @ordered
   */
  protected ShortVarDecl svd;

  /**
   * The cached value of the '{@link #getEs() <em>Es</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEs()
   * @generated
   * @ordered
   */
  protected ExpressionStmt es;

  /**
   * The default value of the '{@link #getEmpty() <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmpty()
   * @generated
   * @ordered
   */
  protected static final String EMPTY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEmpty() <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmpty()
   * @generated
   * @ordered
   */
  protected String empty = EMPTY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleStmtImpl()
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
    return GoPackage.Literals.SIMPLE_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncDecStmt getInc()
  {
    return inc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInc(IncDecStmt newInc, NotificationChain msgs)
  {
    IncDecStmt oldInc = inc;
    inc = newInc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.SIMPLE_STMT__INC, oldInc, newInc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInc(IncDecStmt newInc)
  {
    if (newInc != inc)
    {
      NotificationChain msgs = null;
      if (inc != null)
        msgs = ((InternalEObject)inc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.SIMPLE_STMT__INC, null, msgs);
      if (newInc != null)
        msgs = ((InternalEObject)newInc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.SIMPLE_STMT__INC, null, msgs);
      msgs = basicSetInc(newInc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.SIMPLE_STMT__INC, newInc, newInc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment getAss()
  {
    return ass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAss(Assignment newAss, NotificationChain msgs)
  {
    Assignment oldAss = ass;
    ass = newAss;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.SIMPLE_STMT__ASS, oldAss, newAss);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAss(Assignment newAss)
  {
    if (newAss != ass)
    {
      NotificationChain msgs = null;
      if (ass != null)
        msgs = ((InternalEObject)ass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.SIMPLE_STMT__ASS, null, msgs);
      if (newAss != null)
        msgs = ((InternalEObject)newAss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.SIMPLE_STMT__ASS, null, msgs);
      msgs = basicSetAss(newAss, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.SIMPLE_STMT__ASS, newAss, newAss));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SendStmt getSs()
  {
    return ss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSs(SendStmt newSs, NotificationChain msgs)
  {
    SendStmt oldSs = ss;
    ss = newSs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.SIMPLE_STMT__SS, oldSs, newSs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSs(SendStmt newSs)
  {
    if (newSs != ss)
    {
      NotificationChain msgs = null;
      if (ss != null)
        msgs = ((InternalEObject)ss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.SIMPLE_STMT__SS, null, msgs);
      if (newSs != null)
        msgs = ((InternalEObject)newSs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.SIMPLE_STMT__SS, null, msgs);
      msgs = basicSetSs(newSs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.SIMPLE_STMT__SS, newSs, newSs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShortVarDecl getSvd()
  {
    return svd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSvd(ShortVarDecl newSvd, NotificationChain msgs)
  {
    ShortVarDecl oldSvd = svd;
    svd = newSvd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.SIMPLE_STMT__SVD, oldSvd, newSvd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSvd(ShortVarDecl newSvd)
  {
    if (newSvd != svd)
    {
      NotificationChain msgs = null;
      if (svd != null)
        msgs = ((InternalEObject)svd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.SIMPLE_STMT__SVD, null, msgs);
      if (newSvd != null)
        msgs = ((InternalEObject)newSvd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.SIMPLE_STMT__SVD, null, msgs);
      msgs = basicSetSvd(newSvd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.SIMPLE_STMT__SVD, newSvd, newSvd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionStmt getEs()
  {
    return es;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEs(ExpressionStmt newEs, NotificationChain msgs)
  {
    ExpressionStmt oldEs = es;
    es = newEs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.SIMPLE_STMT__ES, oldEs, newEs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEs(ExpressionStmt newEs)
  {
    if (newEs != es)
    {
      NotificationChain msgs = null;
      if (es != null)
        msgs = ((InternalEObject)es).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.SIMPLE_STMT__ES, null, msgs);
      if (newEs != null)
        msgs = ((InternalEObject)newEs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.SIMPLE_STMT__ES, null, msgs);
      msgs = basicSetEs(newEs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.SIMPLE_STMT__ES, newEs, newEs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEmpty()
  {
    return empty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmpty(String newEmpty)
  {
    String oldEmpty = empty;
    empty = newEmpty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.SIMPLE_STMT__EMPTY, oldEmpty, empty));
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
      case GoPackage.SIMPLE_STMT__INC:
        return basicSetInc(null, msgs);
      case GoPackage.SIMPLE_STMT__ASS:
        return basicSetAss(null, msgs);
      case GoPackage.SIMPLE_STMT__SS:
        return basicSetSs(null, msgs);
      case GoPackage.SIMPLE_STMT__SVD:
        return basicSetSvd(null, msgs);
      case GoPackage.SIMPLE_STMT__ES:
        return basicSetEs(null, msgs);
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
      case GoPackage.SIMPLE_STMT__INC:
        return getInc();
      case GoPackage.SIMPLE_STMT__ASS:
        return getAss();
      case GoPackage.SIMPLE_STMT__SS:
        return getSs();
      case GoPackage.SIMPLE_STMT__SVD:
        return getSvd();
      case GoPackage.SIMPLE_STMT__ES:
        return getEs();
      case GoPackage.SIMPLE_STMT__EMPTY:
        return getEmpty();
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
      case GoPackage.SIMPLE_STMT__INC:
        setInc((IncDecStmt)newValue);
        return;
      case GoPackage.SIMPLE_STMT__ASS:
        setAss((Assignment)newValue);
        return;
      case GoPackage.SIMPLE_STMT__SS:
        setSs((SendStmt)newValue);
        return;
      case GoPackage.SIMPLE_STMT__SVD:
        setSvd((ShortVarDecl)newValue);
        return;
      case GoPackage.SIMPLE_STMT__ES:
        setEs((ExpressionStmt)newValue);
        return;
      case GoPackage.SIMPLE_STMT__EMPTY:
        setEmpty((String)newValue);
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
      case GoPackage.SIMPLE_STMT__INC:
        setInc((IncDecStmt)null);
        return;
      case GoPackage.SIMPLE_STMT__ASS:
        setAss((Assignment)null);
        return;
      case GoPackage.SIMPLE_STMT__SS:
        setSs((SendStmt)null);
        return;
      case GoPackage.SIMPLE_STMT__SVD:
        setSvd((ShortVarDecl)null);
        return;
      case GoPackage.SIMPLE_STMT__ES:
        setEs((ExpressionStmt)null);
        return;
      case GoPackage.SIMPLE_STMT__EMPTY:
        setEmpty(EMPTY_EDEFAULT);
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
      case GoPackage.SIMPLE_STMT__INC:
        return inc != null;
      case GoPackage.SIMPLE_STMT__ASS:
        return ass != null;
      case GoPackage.SIMPLE_STMT__SS:
        return ss != null;
      case GoPackage.SIMPLE_STMT__SVD:
        return svd != null;
      case GoPackage.SIMPLE_STMT__ES:
        return es != null;
      case GoPackage.SIMPLE_STMT__EMPTY:
        return EMPTY_EDEFAULT == null ? empty != null : !EMPTY_EDEFAULT.equals(empty);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (empty: ");
    result.append(empty);
    result.append(')');
    return result.toString();
  }

} //SimpleStmtImpl
