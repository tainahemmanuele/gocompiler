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

import org.xtext.example.mydsl.go.Block;
import org.xtext.example.mydsl.go.Condition;
import org.xtext.example.mydsl.go.ForClause;
import org.xtext.example.mydsl.go.ForStmt;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.RangeClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ForStmtImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ForStmtImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ForStmtImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ForStmtImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForStmtImpl extends MinimalEObjectImpl.Container implements ForStmt
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected EList<Condition> condition;

  /**
   * The cached value of the '{@link #getFor() <em>For</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor()
   * @generated
   * @ordered
   */
  protected EList<ForClause> for_;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected EList<RangeClause> range;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected Block block;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForStmtImpl()
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
    return GoPackage.Literals.FOR_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getCondition()
  {
    if (condition == null)
    {
      condition = new EObjectContainmentEList<Condition>(Condition.class, this, GoPackage.FOR_STMT__CONDITION);
    }
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ForClause> getFor()
  {
    if (for_ == null)
    {
      for_ = new EObjectContainmentEList<ForClause>(ForClause.class, this, GoPackage.FOR_STMT__FOR);
    }
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RangeClause> getRange()
  {
    if (range == null)
    {
      range = new EObjectContainmentEList<RangeClause>(RangeClause.class, this, GoPackage.FOR_STMT__RANGE);
    }
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs)
  {
    Block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.FOR_STMT__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(Block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.FOR_STMT__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.FOR_STMT__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.FOR_STMT__BLOCK, newBlock, newBlock));
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
      case GoPackage.FOR_STMT__CONDITION:
        return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
      case GoPackage.FOR_STMT__FOR:
        return ((InternalEList<?>)getFor()).basicRemove(otherEnd, msgs);
      case GoPackage.FOR_STMT__RANGE:
        return ((InternalEList<?>)getRange()).basicRemove(otherEnd, msgs);
      case GoPackage.FOR_STMT__BLOCK:
        return basicSetBlock(null, msgs);
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
      case GoPackage.FOR_STMT__CONDITION:
        return getCondition();
      case GoPackage.FOR_STMT__FOR:
        return getFor();
      case GoPackage.FOR_STMT__RANGE:
        return getRange();
      case GoPackage.FOR_STMT__BLOCK:
        return getBlock();
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
      case GoPackage.FOR_STMT__CONDITION:
        getCondition().clear();
        getCondition().addAll((Collection<? extends Condition>)newValue);
        return;
      case GoPackage.FOR_STMT__FOR:
        getFor().clear();
        getFor().addAll((Collection<? extends ForClause>)newValue);
        return;
      case GoPackage.FOR_STMT__RANGE:
        getRange().clear();
        getRange().addAll((Collection<? extends RangeClause>)newValue);
        return;
      case GoPackage.FOR_STMT__BLOCK:
        setBlock((Block)newValue);
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
      case GoPackage.FOR_STMT__CONDITION:
        getCondition().clear();
        return;
      case GoPackage.FOR_STMT__FOR:
        getFor().clear();
        return;
      case GoPackage.FOR_STMT__RANGE:
        getRange().clear();
        return;
      case GoPackage.FOR_STMT__BLOCK:
        setBlock((Block)null);
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
      case GoPackage.FOR_STMT__CONDITION:
        return condition != null && !condition.isEmpty();
      case GoPackage.FOR_STMT__FOR:
        return for_ != null && !for_.isEmpty();
      case GoPackage.FOR_STMT__RANGE:
        return range != null && !range.isEmpty();
      case GoPackage.FOR_STMT__BLOCK:
        return block != null;
    }
    return super.eIsSet(featureID);
  }

} //ForStmtImpl
