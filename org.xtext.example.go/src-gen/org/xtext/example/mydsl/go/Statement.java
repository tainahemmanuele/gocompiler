/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.go.Statement#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Statement#getLabest <em>Labest</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Statement#getSimplest <em>Simplest</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Statement#getGotst <em>Gotst</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Statement#getBreakst <em>Breakst</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Statement#getContinuest <em>Continuest</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Statement#getGotost <em>Gotost</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Statement#getFalltst <em>Falltst</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Statement#getBlock1 <em>Block1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Statement#getIf <em>If</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Statement#getSwitch <em>Switch</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Statement#getSelectst <em>Selectst</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Statement#getForst <em>Forst</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.go.Statement#getDeferst <em>Deferst</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.go.GoPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' containment reference.
   * @see #setDeclaration(Declaration)
   * @see org.xtext.example.mydsl.go.GoPackage#getStatement_Declaration()
   * @model containment="true"
   * @generated
   */
  Declaration getDeclaration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Statement#getDeclaration <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration</em>' containment reference.
   * @see #getDeclaration()
   * @generated
   */
  void setDeclaration(Declaration value);

  /**
   * Returns the value of the '<em><b>Labest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Labest</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Labest</em>' containment reference.
   * @see #setLabest(LabeledStmt)
   * @see org.xtext.example.mydsl.go.GoPackage#getStatement_Labest()
   * @model containment="true"
   * @generated
   */
  LabeledStmt getLabest();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Statement#getLabest <em>Labest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Labest</em>' containment reference.
   * @see #getLabest()
   * @generated
   */
  void setLabest(LabeledStmt value);

  /**
   * Returns the value of the '<em><b>Simplest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simplest</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simplest</em>' containment reference.
   * @see #setSimplest(SimpleStmt)
   * @see org.xtext.example.mydsl.go.GoPackage#getStatement_Simplest()
   * @model containment="true"
   * @generated
   */
  SimpleStmt getSimplest();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Statement#getSimplest <em>Simplest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simplest</em>' containment reference.
   * @see #getSimplest()
   * @generated
   */
  void setSimplest(SimpleStmt value);

  /**
   * Returns the value of the '<em><b>Gotst</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gotst</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gotst</em>' attribute.
   * @see #setGotst(String)
   * @see org.xtext.example.mydsl.go.GoPackage#getStatement_Gotst()
   * @model
   * @generated
   */
  String getGotst();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Statement#getGotst <em>Gotst</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gotst</em>' attribute.
   * @see #getGotst()
   * @generated
   */
  void setGotst(String value);

  /**
   * Returns the value of the '<em><b>Breakst</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Breakst</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Breakst</em>' attribute.
   * @see #setBreakst(String)
   * @see org.xtext.example.mydsl.go.GoPackage#getStatement_Breakst()
   * @model
   * @generated
   */
  String getBreakst();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Statement#getBreakst <em>Breakst</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Breakst</em>' attribute.
   * @see #getBreakst()
   * @generated
   */
  void setBreakst(String value);

  /**
   * Returns the value of the '<em><b>Continuest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Continuest</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Continuest</em>' attribute.
   * @see #setContinuest(String)
   * @see org.xtext.example.mydsl.go.GoPackage#getStatement_Continuest()
   * @model
   * @generated
   */
  String getContinuest();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Statement#getContinuest <em>Continuest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Continuest</em>' attribute.
   * @see #getContinuest()
   * @generated
   */
  void setContinuest(String value);

  /**
   * Returns the value of the '<em><b>Gotost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gotost</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gotost</em>' attribute.
   * @see #setGotost(String)
   * @see org.xtext.example.mydsl.go.GoPackage#getStatement_Gotost()
   * @model
   * @generated
   */
  String getGotost();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Statement#getGotost <em>Gotost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gotost</em>' attribute.
   * @see #getGotost()
   * @generated
   */
  void setGotost(String value);

  /**
   * Returns the value of the '<em><b>Falltst</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Falltst</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Falltst</em>' attribute.
   * @see #setFalltst(String)
   * @see org.xtext.example.mydsl.go.GoPackage#getStatement_Falltst()
   * @model
   * @generated
   */
  String getFalltst();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Statement#getFalltst <em>Falltst</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Falltst</em>' attribute.
   * @see #getFalltst()
   * @generated
   */
  void setFalltst(String value);

  /**
   * Returns the value of the '<em><b>Block1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block1</em>' containment reference.
   * @see #setBlock1(Block)
   * @see org.xtext.example.mydsl.go.GoPackage#getStatement_Block1()
   * @model containment="true"
   * @generated
   */
  Block getBlock1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Statement#getBlock1 <em>Block1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block1</em>' containment reference.
   * @see #getBlock1()
   * @generated
   */
  void setBlock1(Block value);

  /**
   * Returns the value of the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If</em>' containment reference.
   * @see #setIf(IfStmt)
   * @see org.xtext.example.mydsl.go.GoPackage#getStatement_If()
   * @model containment="true"
   * @generated
   */
  IfStmt getIf();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Statement#getIf <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If</em>' containment reference.
   * @see #getIf()
   * @generated
   */
  void setIf(IfStmt value);

  /**
   * Returns the value of the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch</em>' containment reference.
   * @see #setSwitch(SwitchStmt)
   * @see org.xtext.example.mydsl.go.GoPackage#getStatement_Switch()
   * @model containment="true"
   * @generated
   */
  SwitchStmt getSwitch();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Statement#getSwitch <em>Switch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch</em>' containment reference.
   * @see #getSwitch()
   * @generated
   */
  void setSwitch(SwitchStmt value);

  /**
   * Returns the value of the '<em><b>Selectst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selectst</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selectst</em>' containment reference.
   * @see #setSelectst(SelectStmt)
   * @see org.xtext.example.mydsl.go.GoPackage#getStatement_Selectst()
   * @model containment="true"
   * @generated
   */
  SelectStmt getSelectst();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Statement#getSelectst <em>Selectst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selectst</em>' containment reference.
   * @see #getSelectst()
   * @generated
   */
  void setSelectst(SelectStmt value);

  /**
   * Returns the value of the '<em><b>Forst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forst</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forst</em>' containment reference.
   * @see #setForst(ForStmt)
   * @see org.xtext.example.mydsl.go.GoPackage#getStatement_Forst()
   * @model containment="true"
   * @generated
   */
  ForStmt getForst();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Statement#getForst <em>Forst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forst</em>' containment reference.
   * @see #getForst()
   * @generated
   */
  void setForst(ForStmt value);

  /**
   * Returns the value of the '<em><b>Deferst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deferst</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deferst</em>' containment reference.
   * @see #setDeferst(DeferStmt)
   * @see org.xtext.example.mydsl.go.GoPackage#getStatement_Deferst()
   * @model containment="true"
   * @generated
   */
  DeferStmt getDeferst();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.go.Statement#getDeferst <em>Deferst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deferst</em>' containment reference.
   * @see #getDeferst()
   * @generated
   */
  void setDeferst(DeferStmt value);

} // Statement
