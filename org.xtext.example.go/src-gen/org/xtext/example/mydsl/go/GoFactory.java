/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.go;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.go.GoPackage
 * @generated
 */
public interface GoFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GoFactory eINSTANCE = org.xtext.example.mydsl.go.impl.GoFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Compilation initial</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compilation initial</em>'.
   * @generated
   */
  Compilation_initial createCompilation_initial();

  /**
   * Returns a new object of class '<em>Top Level Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Level Decl</em>'.
   * @generated
   */
  TopLevelDecl createTopLevelDecl();

  /**
   * Returns a new object of class '<em>Method Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Decl</em>'.
   * @generated
   */
  MethodDecl createMethodDecl();

  /**
   * Returns a new object of class '<em>Receiver</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Receiver</em>'.
   * @generated
   */
  Receiver createReceiver();

  /**
   * Returns a new object of class '<em>Function Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Decl</em>'.
   * @generated
   */
  FunctionDecl createFunctionDecl();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Type Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Lit</em>'.
   * @generated
   */
  TypeLit createTypeLit();

  /**
   * Returns a new object of class '<em>Array Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Type</em>'.
   * @generated
   */
  ArrayType createArrayType();

  /**
   * Returns a new object of class '<em>Array Length</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Length</em>'.
   * @generated
   */
  ArrayLength createArrayLength();

  /**
   * Returns a new object of class '<em>Element Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Type</em>'.
   * @generated
   */
  ElementType createElementType();

  /**
   * Returns a new object of class '<em>Slice Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slice Type</em>'.
   * @generated
   */
  SliceType createSliceType();

  /**
   * Returns a new object of class '<em>Struct Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Type</em>'.
   * @generated
   */
  StructType createStructType();

  /**
   * Returns a new object of class '<em>Field Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Decl</em>'.
   * @generated
   */
  FieldDecl createFieldDecl();

  /**
   * Returns a new object of class '<em>Identifier List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identifier List</em>'.
   * @generated
   */
  IdentifierList createIdentifierList();

  /**
   * Returns a new object of class '<em>Pointer Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pointer Type</em>'.
   * @generated
   */
  PointerType createPointerType();

  /**
   * Returns a new object of class '<em>Base Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Type</em>'.
   * @generated
   */
  BaseType createBaseType();

  /**
   * Returns a new object of class '<em>Function Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Type</em>'.
   * @generated
   */
  FunctionType createFunctionType();

  /**
   * Returns a new object of class '<em>Signature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signature</em>'.
   * @generated
   */
  Signature createSignature();

  /**
   * Returns a new object of class '<em>Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result</em>'.
   * @generated
   */
  Result createResult();

  /**
   * Returns a new object of class '<em>Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameters</em>'.
   * @generated
   */
  Parameters createParameters();

  /**
   * Returns a new object of class '<em>Parameter List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter List</em>'.
   * @generated
   */
  ParameterList createParameterList();

  /**
   * Returns a new object of class '<em>Parameter Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Decl</em>'.
   * @generated
   */
  ParameterDecl createParameterDecl();

  /**
   * Returns a new object of class '<em>Interface Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Type</em>'.
   * @generated
   */
  InterfaceType createInterfaceType();

  /**
   * Returns a new object of class '<em>Method Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Spec</em>'.
   * @generated
   */
  MethodSpec createMethodSpec();

  /**
   * Returns a new object of class '<em>Map Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Type</em>'.
   * @generated
   */
  MapType createMapType();

  /**
   * Returns a new object of class '<em>Key Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key Type</em>'.
   * @generated
   */
  KeyType createKeyType();

  /**
   * Returns a new object of class '<em>Channel Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Channel Type</em>'.
   * @generated
   */
  ChannelType createChannelType();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Statement List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement List</em>'.
   * @generated
   */
  StatementList createStatementList();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>Labeled Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Labeled Stmt</em>'.
   * @generated
   */
  LabeledStmt createLabeledStmt();

  /**
   * Returns a new object of class '<em>Simple Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Stmt</em>'.
   * @generated
   */
  SimpleStmt createSimpleStmt();

  /**
   * Returns a new object of class '<em>Return Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Stmt</em>'.
   * @generated
   */
  ReturnStmt createReturnStmt();

  /**
   * Returns a new object of class '<em>If Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Stmt</em>'.
   * @generated
   */
  IfStmt createIfStmt();

  /**
   * Returns a new object of class '<em>Switch Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch Stmt</em>'.
   * @generated
   */
  SwitchStmt createSwitchStmt();

  /**
   * Returns a new object of class '<em>Select Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Stmt</em>'.
   * @generated
   */
  SelectStmt createSelectStmt();

  /**
   * Returns a new object of class '<em>For Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Stmt</em>'.
   * @generated
   */
  ForStmt createForStmt();

  /**
   * Returns a new object of class '<em>Defer Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Defer Stmt</em>'.
   * @generated
   */
  DeferStmt createDeferStmt();

  /**
   * Returns a new object of class '<em>Const Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Const Decl</em>'.
   * @generated
   */
  ConstDecl createConstDecl();

  /**
   * Returns a new object of class '<em>Const Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Const Spec</em>'.
   * @generated
   */
  ConstSpec createConstSpec();

  /**
   * Returns a new object of class '<em>Type Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Decl</em>'.
   * @generated
   */
  TypeDecl createTypeDecl();

  /**
   * Returns a new object of class '<em>Type Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Spec</em>'.
   * @generated
   */
  TypeSpec createTypeSpec();

  /**
   * Returns a new object of class '<em>Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Def</em>'.
   * @generated
   */
  TypeDef createTypeDef();

  /**
   * Returns a new object of class '<em>Alias Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alias Decl</em>'.
   * @generated
   */
  AliasDecl createAliasDecl();

  /**
   * Returns a new object of class '<em>Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Decl</em>'.
   * @generated
   */
  VarDecl createVarDecl();

  /**
   * Returns a new object of class '<em>Var Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Spec</em>'.
   * @generated
   */
  VarSpec createVarSpec();

  /**
   * Returns a new object of class '<em>Expression Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Stmt</em>'.
   * @generated
   */
  ExpressionStmt createExpressionStmt();

  /**
   * Returns a new object of class '<em>Send Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Send Stmt</em>'.
   * @generated
   */
  SendStmt createSendStmt();

  /**
   * Returns a new object of class '<em>Channel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Channel</em>'.
   * @generated
   */
  Channel createChannel();

  /**
   * Returns a new object of class '<em>Inc Dec Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inc Dec Stmt</em>'.
   * @generated
   */
  IncDecStmt createIncDecStmt();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Short Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Short Var Decl</em>'.
   * @generated
   */
  ShortVarDecl createShortVarDecl();

  /**
   * Returns a new object of class '<em>Expr Switch Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Switch Stmt</em>'.
   * @generated
   */
  ExprSwitchStmt createExprSwitchStmt();

  /**
   * Returns a new object of class '<em>Expr Case Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Case Clause</em>'.
   * @generated
   */
  ExprCaseClause createExprCaseClause();

  /**
   * Returns a new object of class '<em>Expr Switch Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Switch Case</em>'.
   * @generated
   */
  ExprSwitchCase createExprSwitchCase();

  /**
   * Returns a new object of class '<em>Type Switch Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Switch Stmt</em>'.
   * @generated
   */
  TypeSwitchStmt createTypeSwitchStmt();

  /**
   * Returns a new object of class '<em>Type Switch Guard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Switch Guard</em>'.
   * @generated
   */
  TypeSwitchGuard createTypeSwitchGuard();

  /**
   * Returns a new object of class '<em>Type Case Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Case Clause</em>'.
   * @generated
   */
  TypeCaseClause createTypeCaseClause();

  /**
   * Returns a new object of class '<em>Type Switch Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Switch Case</em>'.
   * @generated
   */
  TypeSwitchCase createTypeSwitchCase();

  /**
   * Returns a new object of class '<em>Type List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type List</em>'.
   * @generated
   */
  TypeList createTypeList();

  /**
   * Returns a new object of class '<em>Comm Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comm Clause</em>'.
   * @generated
   */
  CommClause createCommClause();

  /**
   * Returns a new object of class '<em>Comm Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comm Case</em>'.
   * @generated
   */
  CommCase createCommCase();

  /**
   * Returns a new object of class '<em>Recv Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recv Stmt</em>'.
   * @generated
   */
  RecvStmt createRecvStmt();

  /**
   * Returns a new object of class '<em>Recv Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recv Expr</em>'.
   * @generated
   */
  RecvExpr createRecvExpr();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>For Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Clause</em>'.
   * @generated
   */
  ForClause createForClause();

  /**
   * Returns a new object of class '<em>Range Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Clause</em>'.
   * @generated
   */
  RangeClause createRangeClause();

  /**
   * Returns a new object of class '<em>Init Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init Stmt</em>'.
   * @generated
   */
  InitStmt createInitStmt();

  /**
   * Returns a new object of class '<em>Post Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Post Stmt</em>'.
   * @generated
   */
  PostStmt createPostStmt();

  /**
   * Returns a new object of class '<em>Expression List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression List</em>'.
   * @generated
   */
  ExpressionList createExpressionList();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Expression2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression2</em>'.
   * @generated
   */
  Expression2 createExpression2();

  /**
   * Returns a new object of class '<em>Unary Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Expr</em>'.
   * @generated
   */
  UnaryExpr createUnaryExpr();

  /**
   * Returns a new object of class '<em>Primary Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Expr</em>'.
   * @generated
   */
  PrimaryExpr createPrimaryExpr();

  /**
   * Returns a new object of class '<em>Primary Expr2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Expr2</em>'.
   * @generated
   */
  PrimaryExpr2 createPrimaryExpr2();

  /**
   * Returns a new object of class '<em>Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operand</em>'.
   * @generated
   */
  Operand createOperand();

  /**
   * Returns a new object of class '<em>Conversion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conversion</em>'.
   * @generated
   */
  Conversion createConversion();

  /**
   * Returns a new object of class '<em>Method Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Expr</em>'.
   * @generated
   */
  MethodExpr createMethodExpr();

  /**
   * Returns a new object of class '<em>Index</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Index</em>'.
   * @generated
   */
  Index createIndex();

  /**
   * Returns a new object of class '<em>Slice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slice</em>'.
   * @generated
   */
  Slice createSlice();

  /**
   * Returns a new object of class '<em>Type Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Assertion</em>'.
   * @generated
   */
  TypeAssertion createTypeAssertion();

  /**
   * Returns a new object of class '<em>Arguments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arguments</em>'.
   * @generated
   */
  Arguments createArguments();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Function Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Lit</em>'.
   * @generated
   */
  FunctionLit createFunctionLit();

  /**
   * Returns a new object of class '<em>Composite Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Lit</em>'.
   * @generated
   */
  CompositeLit createCompositeLit();

  /**
   * Returns a new object of class '<em>Literal Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Type</em>'.
   * @generated
   */
  LiteralType createLiteralType();

  /**
   * Returns a new object of class '<em>Literal Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Value</em>'.
   * @generated
   */
  LiteralValue createLiteralValue();

  /**
   * Returns a new object of class '<em>Element List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element List</em>'.
   * @generated
   */
  ElementList createElementList();

  /**
   * Returns a new object of class '<em>Keyed Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Keyed Element</em>'.
   * @generated
   */
  KeyedElement createKeyedElement();

  /**
   * Returns a new object of class '<em>Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key</em>'.
   * @generated
   */
  Key createKey();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Basic Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Lit</em>'.
   * @generated
   */
  BasicLit createBasicLit();

  /**
   * Returns a new object of class '<em>Receiver Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Receiver Type</em>'.
   * @generated
   */
  ReceiverType createReceiverType();

  /**
   * Returns a new object of class '<em>Function Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Body</em>'.
   * @generated
   */
  FunctionBody createFunctionBody();

  /**
   * Returns a new object of class '<em>Operand Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operand Name</em>'.
   * @generated
   */
  OperandName createOperandName();

  /**
   * Returns a new object of class '<em>Import Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Decl</em>'.
   * @generated
   */
  ImportDecl createImportDecl();

  /**
   * Returns a new object of class '<em>Import Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Spec</em>'.
   * @generated
   */
  ImportSpec createImportSpec();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GoPackage getGoPackage();

} //GoFactory
