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

import org.xtext.example.mydsl.go.Channel;
import org.xtext.example.mydsl.go.Condition;
import org.xtext.example.mydsl.go.DeferStmt;
import org.xtext.example.mydsl.go.Element;
import org.xtext.example.mydsl.go.ElementList;
import org.xtext.example.mydsl.go.Expression;
import org.xtext.example.mydsl.go.Expression2;
import org.xtext.example.mydsl.go.ExpressionList;
import org.xtext.example.mydsl.go.ExpressionStmt;
import org.xtext.example.mydsl.go.ForClause;
import org.xtext.example.mydsl.go.GoPackage;
import org.xtext.example.mydsl.go.IncDecStmt;
import org.xtext.example.mydsl.go.InitStmt;
import org.xtext.example.mydsl.go.Key;
import org.xtext.example.mydsl.go.KeyedElement;
import org.xtext.example.mydsl.go.PostStmt;
import org.xtext.example.mydsl.go.RecvExpr;
import org.xtext.example.mydsl.go.RecvStmt;
import org.xtext.example.mydsl.go.SimpleStmt;
import org.xtext.example.mydsl.go.SwitchStmt;
import org.xtext.example.mydsl.go.TypeCaseClause;
import org.xtext.example.mydsl.go.TypeSwitchGuard;
import org.xtext.example.mydsl.go.TypeSwitchStmt;
import org.xtext.example.mydsl.go.UnaryExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExpressionImpl#getTypesg <em>Typesg</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExpressionImpl#getTypecc <em>Typecc</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExpressionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExpressionImpl#getPoststmt <em>Poststmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExpressionImpl#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExpressionImpl#getIdl <em>Idl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExpressionImpl#getRecvexpr <em>Recvexpr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExpressionImpl#getKeyedelement <em>Keyedelement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExpressionImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExpressionImpl#getFieldn <em>Fieldn</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExpressionImpl#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExpressionImpl#getUp <em>Up</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.impl.ExpressionImpl#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends ArrayLengthImpl implements Expression
{
  /**
   * The cached value of the '{@link #getTypesg() <em>Typesg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypesg()
   * @generated
   * @ordered
   */
  protected TypeSwitchGuard typesg;

  /**
   * The cached value of the '{@link #getTypecc() <em>Typecc</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypecc()
   * @generated
   * @ordered
   */
  protected EList<TypeCaseClause> typecc;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Condition condition;

  /**
   * The cached value of the '{@link #getPoststmt() <em>Poststmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoststmt()
   * @generated
   * @ordered
   */
  protected PostStmt poststmt;

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
   * The default value of the '{@link #getIdl() <em>Idl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdl()
   * @generated
   * @ordered
   */
  protected static final String IDL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdl() <em>Idl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdl()
   * @generated
   * @ordered
   */
  protected String idl = IDL_EDEFAULT;

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
   * The cached value of the '{@link #getKeyedelement() <em>Keyedelement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyedelement()
   * @generated
   * @ordered
   */
  protected EList<KeyedElement> keyedelement;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected Element element;

  /**
   * The default value of the '{@link #getFieldn() <em>Fieldn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldn()
   * @generated
   * @ordered
   */
  protected static final String FIELDN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldn() <em>Fieldn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldn()
   * @generated
   * @ordered
   */
  protected String fieldn = FIELDN_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression2() <em>Expression2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression2()
   * @generated
   * @ordered
   */
  protected EList<Expression> expression2;

  /**
   * The cached value of the '{@link #getUp() <em>Up</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUp()
   * @generated
   * @ordered
   */
  protected UnaryExpr up;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected Expression2 exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return GoPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSwitchGuard getTypesg()
  {
    return typesg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypesg(TypeSwitchGuard newTypesg, NotificationChain msgs)
  {
    TypeSwitchGuard oldTypesg = typesg;
    typesg = newTypesg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__TYPESG, oldTypesg, newTypesg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypesg(TypeSwitchGuard newTypesg)
  {
    if (newTypesg != typesg)
    {
      NotificationChain msgs = null;
      if (typesg != null)
        msgs = ((InternalEObject)typesg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__TYPESG, null, msgs);
      if (newTypesg != null)
        msgs = ((InternalEObject)newTypesg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__TYPESG, null, msgs);
      msgs = basicSetTypesg(newTypesg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__TYPESG, newTypesg, newTypesg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeCaseClause> getTypecc()
  {
    if (typecc == null)
    {
      typecc = new EObjectContainmentEList<TypeCaseClause>(TypeCaseClause.class, this, GoPackage.EXPRESSION__TYPECC);
    }
    return typecc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs)
  {
    Condition oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Condition newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostStmt getPoststmt()
  {
    return poststmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPoststmt(PostStmt newPoststmt, NotificationChain msgs)
  {
    PostStmt oldPoststmt = poststmt;
    poststmt = newPoststmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__POSTSTMT, oldPoststmt, newPoststmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPoststmt(PostStmt newPoststmt)
  {
    if (newPoststmt != poststmt)
    {
      NotificationChain msgs = null;
      if (poststmt != null)
        msgs = ((InternalEObject)poststmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__POSTSTMT, null, msgs);
      if (newPoststmt != null)
        msgs = ((InternalEObject)newPoststmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__POSTSTMT, null, msgs);
      msgs = basicSetPoststmt(newPoststmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__POSTSTMT, newPoststmt, newPoststmt));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__EMPTY, oldEmpty, empty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdl()
  {
    return idl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdl(String newIdl)
  {
    String oldIdl = idl;
    idl = newIdl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__IDL, oldIdl, idl));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__RECVEXPR, oldRecvexpr, newRecvexpr);
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
        msgs = ((InternalEObject)recvexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__RECVEXPR, null, msgs);
      if (newRecvexpr != null)
        msgs = ((InternalEObject)newRecvexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__RECVEXPR, null, msgs);
      msgs = basicSetRecvexpr(newRecvexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__RECVEXPR, newRecvexpr, newRecvexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<KeyedElement> getKeyedelement()
  {
    if (keyedelement == null)
    {
      keyedelement = new EObjectContainmentEList<KeyedElement>(KeyedElement.class, this, GoPackage.EXPRESSION__KEYEDELEMENT);
    }
    return keyedelement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElement(Element newElement, NotificationChain msgs)
  {
    Element oldElement = element;
    element = newElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__ELEMENT, oldElement, newElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(Element newElement)
  {
    if (newElement != element)
    {
      NotificationChain msgs = null;
      if (element != null)
        msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__ELEMENT, null, msgs);
      if (newElement != null)
        msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__ELEMENT, null, msgs);
      msgs = basicSetElement(newElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__ELEMENT, newElement, newElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFieldn()
  {
    return fieldn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldn(String newFieldn)
  {
    String oldFieldn = fieldn;
    fieldn = newFieldn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__FIELDN, oldFieldn, fieldn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpression2()
  {
    if (expression2 == null)
    {
      expression2 = new EObjectContainmentEList<Expression>(Expression.class, this, GoPackage.EXPRESSION__EXPRESSION2);
    }
    return expression2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpr getUp()
  {
    return up;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUp(UnaryExpr newUp, NotificationChain msgs)
  {
    UnaryExpr oldUp = up;
    up = newUp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__UP, oldUp, newUp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUp(UnaryExpr newUp)
  {
    if (newUp != up)
    {
      NotificationChain msgs = null;
      if (up != null)
        msgs = ((InternalEObject)up).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__UP, null, msgs);
      if (newUp != null)
        msgs = ((InternalEObject)newUp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__UP, null, msgs);
      msgs = basicSetUp(newUp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__UP, newUp, newUp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression2 getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(Expression2 newExp, NotificationChain msgs)
  {
    Expression2 oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(Expression2 newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSION__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSION__EXP, newExp, newExp));
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
      case GoPackage.EXPRESSION__TYPESG:
        return basicSetTypesg(null, msgs);
      case GoPackage.EXPRESSION__TYPECC:
        return ((InternalEList<?>)getTypecc()).basicRemove(otherEnd, msgs);
      case GoPackage.EXPRESSION__CONDITION:
        return basicSetCondition(null, msgs);
      case GoPackage.EXPRESSION__POSTSTMT:
        return basicSetPoststmt(null, msgs);
      case GoPackage.EXPRESSION__RECVEXPR:
        return basicSetRecvexpr(null, msgs);
      case GoPackage.EXPRESSION__KEYEDELEMENT:
        return ((InternalEList<?>)getKeyedelement()).basicRemove(otherEnd, msgs);
      case GoPackage.EXPRESSION__ELEMENT:
        return basicSetElement(null, msgs);
      case GoPackage.EXPRESSION__EXPRESSION2:
        return ((InternalEList<?>)getExpression2()).basicRemove(otherEnd, msgs);
      case GoPackage.EXPRESSION__UP:
        return basicSetUp(null, msgs);
      case GoPackage.EXPRESSION__EXP:
        return basicSetExp(null, msgs);
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
      case GoPackage.EXPRESSION__TYPESG:
        return getTypesg();
      case GoPackage.EXPRESSION__TYPECC:
        return getTypecc();
      case GoPackage.EXPRESSION__CONDITION:
        return getCondition();
      case GoPackage.EXPRESSION__POSTSTMT:
        return getPoststmt();
      case GoPackage.EXPRESSION__EMPTY:
        return getEmpty();
      case GoPackage.EXPRESSION__IDL:
        return getIdl();
      case GoPackage.EXPRESSION__RECVEXPR:
        return getRecvexpr();
      case GoPackage.EXPRESSION__KEYEDELEMENT:
        return getKeyedelement();
      case GoPackage.EXPRESSION__ELEMENT:
        return getElement();
      case GoPackage.EXPRESSION__FIELDN:
        return getFieldn();
      case GoPackage.EXPRESSION__EXPRESSION2:
        return getExpression2();
      case GoPackage.EXPRESSION__UP:
        return getUp();
      case GoPackage.EXPRESSION__EXP:
        return getExp();
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
      case GoPackage.EXPRESSION__TYPESG:
        setTypesg((TypeSwitchGuard)newValue);
        return;
      case GoPackage.EXPRESSION__TYPECC:
        getTypecc().clear();
        getTypecc().addAll((Collection<? extends TypeCaseClause>)newValue);
        return;
      case GoPackage.EXPRESSION__CONDITION:
        setCondition((Condition)newValue);
        return;
      case GoPackage.EXPRESSION__POSTSTMT:
        setPoststmt((PostStmt)newValue);
        return;
      case GoPackage.EXPRESSION__EMPTY:
        setEmpty((String)newValue);
        return;
      case GoPackage.EXPRESSION__IDL:
        setIdl((String)newValue);
        return;
      case GoPackage.EXPRESSION__RECVEXPR:
        setRecvexpr((RecvExpr)newValue);
        return;
      case GoPackage.EXPRESSION__KEYEDELEMENT:
        getKeyedelement().clear();
        getKeyedelement().addAll((Collection<? extends KeyedElement>)newValue);
        return;
      case GoPackage.EXPRESSION__ELEMENT:
        setElement((Element)newValue);
        return;
      case GoPackage.EXPRESSION__FIELDN:
        setFieldn((String)newValue);
        return;
      case GoPackage.EXPRESSION__EXPRESSION2:
        getExpression2().clear();
        getExpression2().addAll((Collection<? extends Expression>)newValue);
        return;
      case GoPackage.EXPRESSION__UP:
        setUp((UnaryExpr)newValue);
        return;
      case GoPackage.EXPRESSION__EXP:
        setExp((Expression2)newValue);
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
      case GoPackage.EXPRESSION__TYPESG:
        setTypesg((TypeSwitchGuard)null);
        return;
      case GoPackage.EXPRESSION__TYPECC:
        getTypecc().clear();
        return;
      case GoPackage.EXPRESSION__CONDITION:
        setCondition((Condition)null);
        return;
      case GoPackage.EXPRESSION__POSTSTMT:
        setPoststmt((PostStmt)null);
        return;
      case GoPackage.EXPRESSION__EMPTY:
        setEmpty(EMPTY_EDEFAULT);
        return;
      case GoPackage.EXPRESSION__IDL:
        setIdl(IDL_EDEFAULT);
        return;
      case GoPackage.EXPRESSION__RECVEXPR:
        setRecvexpr((RecvExpr)null);
        return;
      case GoPackage.EXPRESSION__KEYEDELEMENT:
        getKeyedelement().clear();
        return;
      case GoPackage.EXPRESSION__ELEMENT:
        setElement((Element)null);
        return;
      case GoPackage.EXPRESSION__FIELDN:
        setFieldn(FIELDN_EDEFAULT);
        return;
      case GoPackage.EXPRESSION__EXPRESSION2:
        getExpression2().clear();
        return;
      case GoPackage.EXPRESSION__UP:
        setUp((UnaryExpr)null);
        return;
      case GoPackage.EXPRESSION__EXP:
        setExp((Expression2)null);
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
      case GoPackage.EXPRESSION__TYPESG:
        return typesg != null;
      case GoPackage.EXPRESSION__TYPECC:
        return typecc != null && !typecc.isEmpty();
      case GoPackage.EXPRESSION__CONDITION:
        return condition != null;
      case GoPackage.EXPRESSION__POSTSTMT:
        return poststmt != null;
      case GoPackage.EXPRESSION__EMPTY:
        return EMPTY_EDEFAULT == null ? empty != null : !EMPTY_EDEFAULT.equals(empty);
      case GoPackage.EXPRESSION__IDL:
        return IDL_EDEFAULT == null ? idl != null : !IDL_EDEFAULT.equals(idl);
      case GoPackage.EXPRESSION__RECVEXPR:
        return recvexpr != null;
      case GoPackage.EXPRESSION__KEYEDELEMENT:
        return keyedelement != null && !keyedelement.isEmpty();
      case GoPackage.EXPRESSION__ELEMENT:
        return element != null;
      case GoPackage.EXPRESSION__FIELDN:
        return FIELDN_EDEFAULT == null ? fieldn != null : !FIELDN_EDEFAULT.equals(fieldn);
      case GoPackage.EXPRESSION__EXPRESSION2:
        return expression2 != null && !expression2.isEmpty();
      case GoPackage.EXPRESSION__UP:
        return up != null;
      case GoPackage.EXPRESSION__EXP:
        return exp != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == DeferStmt.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == SwitchStmt.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == TypeSwitchStmt.class)
    {
      switch (derivedFeatureID)
      {
        case GoPackage.EXPRESSION__TYPESG: return GoPackage.TYPE_SWITCH_STMT__TYPESG;
        case GoPackage.EXPRESSION__TYPECC: return GoPackage.TYPE_SWITCH_STMT__TYPECC;
        default: return -1;
      }
    }
    if (baseClass == ForClause.class)
    {
      switch (derivedFeatureID)
      {
        case GoPackage.EXPRESSION__CONDITION: return GoPackage.FOR_CLAUSE__CONDITION;
        case GoPackage.EXPRESSION__POSTSTMT: return GoPackage.FOR_CLAUSE__POSTSTMT;
        default: return -1;
      }
    }
    if (baseClass == InitStmt.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == PostStmt.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == SimpleStmt.class)
    {
      switch (derivedFeatureID)
      {
        case GoPackage.EXPRESSION__EMPTY: return GoPackage.SIMPLE_STMT__EMPTY;
        default: return -1;
      }
    }
    if (baseClass == ExpressionStmt.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Channel.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == IncDecStmt.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == RecvExpr.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Condition.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == RecvStmt.class)
    {
      switch (derivedFeatureID)
      {
        case GoPackage.EXPRESSION__IDL: return GoPackage.RECV_STMT__IDL;
        case GoPackage.EXPRESSION__RECVEXPR: return GoPackage.RECV_STMT__RECVEXPR;
        default: return -1;
      }
    }
    if (baseClass == ExpressionList.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ElementList.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == KeyedElement.class)
    {
      switch (derivedFeatureID)
      {
        case GoPackage.EXPRESSION__KEYEDELEMENT: return GoPackage.KEYED_ELEMENT__KEYEDELEMENT;
        case GoPackage.EXPRESSION__ELEMENT: return GoPackage.KEYED_ELEMENT__ELEMENT;
        default: return -1;
      }
    }
    if (baseClass == Key.class)
    {
      switch (derivedFeatureID)
      {
        case GoPackage.EXPRESSION__FIELDN: return GoPackage.KEY__FIELDN;
        default: return -1;
      }
    }
    if (baseClass == Element.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == DeferStmt.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == SwitchStmt.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == TypeSwitchStmt.class)
    {
      switch (baseFeatureID)
      {
        case GoPackage.TYPE_SWITCH_STMT__TYPESG: return GoPackage.EXPRESSION__TYPESG;
        case GoPackage.TYPE_SWITCH_STMT__TYPECC: return GoPackage.EXPRESSION__TYPECC;
        default: return -1;
      }
    }
    if (baseClass == ForClause.class)
    {
      switch (baseFeatureID)
      {
        case GoPackage.FOR_CLAUSE__CONDITION: return GoPackage.EXPRESSION__CONDITION;
        case GoPackage.FOR_CLAUSE__POSTSTMT: return GoPackage.EXPRESSION__POSTSTMT;
        default: return -1;
      }
    }
    if (baseClass == InitStmt.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == PostStmt.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == SimpleStmt.class)
    {
      switch (baseFeatureID)
      {
        case GoPackage.SIMPLE_STMT__EMPTY: return GoPackage.EXPRESSION__EMPTY;
        default: return -1;
      }
    }
    if (baseClass == ExpressionStmt.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Channel.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == IncDecStmt.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == RecvExpr.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Condition.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == RecvStmt.class)
    {
      switch (baseFeatureID)
      {
        case GoPackage.RECV_STMT__IDL: return GoPackage.EXPRESSION__IDL;
        case GoPackage.RECV_STMT__RECVEXPR: return GoPackage.EXPRESSION__RECVEXPR;
        default: return -1;
      }
    }
    if (baseClass == ExpressionList.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ElementList.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == KeyedElement.class)
    {
      switch (baseFeatureID)
      {
        case GoPackage.KEYED_ELEMENT__KEYEDELEMENT: return GoPackage.EXPRESSION__KEYEDELEMENT;
        case GoPackage.KEYED_ELEMENT__ELEMENT: return GoPackage.EXPRESSION__ELEMENT;
        default: return -1;
      }
    }
    if (baseClass == Key.class)
    {
      switch (baseFeatureID)
      {
        case GoPackage.KEY__FIELDN: return GoPackage.EXPRESSION__FIELDN;
        default: return -1;
      }
    }
    if (baseClass == Element.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (empty: ");
    result.append(empty);
    result.append(", idl: ");
    result.append(idl);
    result.append(", fieldn: ");
    result.append(fieldn);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
