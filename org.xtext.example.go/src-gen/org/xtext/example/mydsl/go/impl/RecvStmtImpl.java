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

import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.IdentifierList;
import org.xtext.example.mydsl.go.RecvExpr;
import org.xtext.example.mydsl.go.RecvStmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recv Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.RecvStmtImpl#getIdl <em>Idl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.RecvStmtImpl#getRecvexpr <em>Recvexpr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecvStmtImpl extends MinimalEObjectImpl.Container implements RecvStmt
{
  /**
   * The cached value of the '{@link #getIdl() <em>Idl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdl()
   * @generated
   * @ordered
   */
  protected IdentifierList idl;

  /**
   * The cached value of the '{@link #getRecvexpr() <em>Recvexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecvexpr()
   * @generated
   * @ordered
   */
  protected RecvExpr recvexpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecvStmtImpl()
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
    return GoPackage.Literals.RECV_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierList getIdl()
  {
    return idl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdl(IdentifierList newIdl, NotificationChain msgs)
  {
    IdentifierList oldIdl = idl;
    idl = newIdl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.RECV_STMT__IDL, oldIdl, newIdl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdl(IdentifierList newIdl)
  {
    if (newIdl != idl)
    {
      NotificationChain msgs = null;
      if (idl != null)
        msgs = ((InternalEObject)idl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.RECV_STMT__IDL, null, msgs);
      if (newIdl != null)
        msgs = ((InternalEObject)newIdl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.RECV_STMT__IDL, null, msgs);
      msgs = basicSetIdl(newIdl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RECV_STMT__IDL, newIdl, newIdl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecvExpr getRecvexpr()
  {
    return recvexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecvexpr(RecvExpr newRecvexpr, NotificationChain msgs)
  {
    RecvExpr oldRecvexpr = recvexpr;
    recvexpr = newRecvexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.RECV_STMT__RECVEXPR, oldRecvexpr, newRecvexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecvexpr(RecvExpr newRecvexpr)
  {
    if (newRecvexpr != recvexpr)
    {
      NotificationChain msgs = null;
      if (recvexpr != null)
        msgs = ((InternalEObject)recvexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.RECV_STMT__RECVEXPR, null, msgs);
      if (newRecvexpr != null)
        msgs = ((InternalEObject)newRecvexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.RECV_STMT__RECVEXPR, null, msgs);
      msgs = basicSetRecvexpr(newRecvexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RECV_STMT__RECVEXPR, newRecvexpr, newRecvexpr));
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
      case GoPackage.RECV_STMT__IDL:
        return basicSetIdl(null, msgs);
      case GoPackage.RECV_STMT__RECVEXPR:
        return basicSetRecvexpr(null, msgs);
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
      case GoPackage.RECV_STMT__IDL:
        return getIdl();
      case GoPackage.RECV_STMT__RECVEXPR:
        return getRecvexpr();
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
      case GoPackage.RECV_STMT__IDL:
        setIdl((IdentifierList)newValue);
        return;
      case GoPackage.RECV_STMT__RECVEXPR:
        setRecvexpr((RecvExpr)newValue);
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
      case GoPackage.RECV_STMT__IDL:
        setIdl((IdentifierList)null);
        return;
      case GoPackage.RECV_STMT__RECVEXPR:
        setRecvexpr((RecvExpr)null);
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
      case GoPackage.RECV_STMT__IDL:
        return idl != null;
      case GoPackage.RECV_STMT__RECVEXPR:
        return recvexpr != null;
    }
    return super.eIsSet(featureID);
  }

} //RecvStmtImpl
