/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.go.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.go.CommCase;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.RecvStmt;
import org.xtext.example.mydsl.go.SendStmt;
import org.xtext.example.mydsl.go.StatementList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comm Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.CommCaseImpl#getStatementlist2 <em>Statementlist2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.CommCaseImpl#getSendstmt <em>Sendstmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.CommCaseImpl#getRecvstmt <em>Recvstmt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommCaseImpl extends CommClauseImpl implements CommCase
{
  /**
   * The cached value of the '{@link #getStatementlist2() <em>Statementlist2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementlist2()
   * @generated
   * @ordered
   */
  protected StatementList statementlist2;

  /**
   * The cached value of the '{@link #getSendstmt() <em>Sendstmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSendstmt()
   * @generated
   * @ordered
   */
  protected SendStmt sendstmt;

  /**
   * The cached value of the '{@link #getRecvstmt() <em>Recvstmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecvstmt()
   * @generated
   * @ordered
   */
  protected RecvStmt recvstmt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommCaseImpl()
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
    return GoPackage.Literals.COMM_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementList getStatementlist2()
  {
    return statementlist2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatementlist2(StatementList newStatementlist2, NotificationChain msgs)
  {
    StatementList oldStatementlist2 = statementlist2;
    statementlist2 = newStatementlist2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.COMM_CASE__STATEMENTLIST2, oldStatementlist2, newStatementlist2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatementlist2(StatementList newStatementlist2)
  {
    if (newStatementlist2 != statementlist2)
    {
      NotificationChain msgs = null;
      if (statementlist2 != null)
        msgs = ((InternalEObject)statementlist2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMM_CASE__STATEMENTLIST2, null, msgs);
      if (newStatementlist2 != null)
        msgs = ((InternalEObject)newStatementlist2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMM_CASE__STATEMENTLIST2, null, msgs);
      msgs = basicSetStatementlist2(newStatementlist2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.COMM_CASE__STATEMENTLIST2, newStatementlist2, newStatementlist2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SendStmt getSendstmt()
  {
    return sendstmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSendstmt(SendStmt newSendstmt, NotificationChain msgs)
  {
    SendStmt oldSendstmt = sendstmt;
    sendstmt = newSendstmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.COMM_CASE__SENDSTMT, oldSendstmt, newSendstmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSendstmt(SendStmt newSendstmt)
  {
    if (newSendstmt != sendstmt)
    {
      NotificationChain msgs = null;
      if (sendstmt != null)
        msgs = ((InternalEObject)sendstmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMM_CASE__SENDSTMT, null, msgs);
      if (newSendstmt != null)
        msgs = ((InternalEObject)newSendstmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMM_CASE__SENDSTMT, null, msgs);
      msgs = basicSetSendstmt(newSendstmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.COMM_CASE__SENDSTMT, newSendstmt, newSendstmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecvStmt getRecvstmt()
  {
    return recvstmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecvstmt(RecvStmt newRecvstmt, NotificationChain msgs)
  {
    RecvStmt oldRecvstmt = recvstmt;
    recvstmt = newRecvstmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.COMM_CASE__RECVSTMT, oldRecvstmt, newRecvstmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecvstmt(RecvStmt newRecvstmt)
  {
    if (newRecvstmt != recvstmt)
    {
      NotificationChain msgs = null;
      if (recvstmt != null)
        msgs = ((InternalEObject)recvstmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMM_CASE__RECVSTMT, null, msgs);
      if (newRecvstmt != null)
        msgs = ((InternalEObject)newRecvstmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.COMM_CASE__RECVSTMT, null, msgs);
      msgs = basicSetRecvstmt(newRecvstmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.COMM_CASE__RECVSTMT, newRecvstmt, newRecvstmt));
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
      case GoPackage.COMM_CASE__STATEMENTLIST2:
        return basicSetStatementlist2(null, msgs);
      case GoPackage.COMM_CASE__SENDSTMT:
        return basicSetSendstmt(null, msgs);
      case GoPackage.COMM_CASE__RECVSTMT:
        return basicSetRecvstmt(null, msgs);
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
      case GoPackage.COMM_CASE__STATEMENTLIST2:
        return getStatementlist2();
      case GoPackage.COMM_CASE__SENDSTMT:
        return getSendstmt();
      case GoPackage.COMM_CASE__RECVSTMT:
        return getRecvstmt();
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
      case GoPackage.COMM_CASE__STATEMENTLIST2:
        setStatementlist2((StatementList)newValue);
        return;
      case GoPackage.COMM_CASE__SENDSTMT:
        setSendstmt((SendStmt)newValue);
        return;
      case GoPackage.COMM_CASE__RECVSTMT:
        setRecvstmt((RecvStmt)newValue);
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
      case GoPackage.COMM_CASE__STATEMENTLIST2:
        setStatementlist2((StatementList)null);
        return;
      case GoPackage.COMM_CASE__SENDSTMT:
        setSendstmt((SendStmt)null);
        return;
      case GoPackage.COMM_CASE__RECVSTMT:
        setRecvstmt((RecvStmt)null);
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
      case GoPackage.COMM_CASE__STATEMENTLIST2:
        return statementlist2 != null;
      case GoPackage.COMM_CASE__SENDSTMT:
        return sendstmt != null;
      case GoPackage.COMM_CASE__RECVSTMT:
        return recvstmt != null;
    }
    return super.eIsSet(featureID);
  }

} //CommCaseImpl
