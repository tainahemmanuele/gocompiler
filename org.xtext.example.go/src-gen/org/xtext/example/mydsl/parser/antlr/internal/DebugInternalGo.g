/*
 * generated by Xtext 2.15.0-SNAPSHOT
 */
grammar DebugInternalGo;

// Rule Model
ruleModel:
	ruleCompilation_initial
;

// Rule Compilation_initial
ruleCompilation_initial:
	(
		rulePackageClause
		ruleImportDecl
		*
		ruleTopLevelDecl
		*
	)?
;

// Rule TopLevelDecl
ruleTopLevelDecl:
	(
		ruleDeclaration
		    |
		ruleFunctionDecl
		    |
		ruleMethodDecl
	)
;

// Rule MethodDecl
ruleMethodDecl:
	'func'
	ruleReceiver
	ruleMethodName
	ruleSignature
	ruleFunctionBody
	?
;

// Rule Receiver
ruleReceiver:
	ruleParameters
;

// Rule FunctionName
ruleFunctionName:
	RULE_IDENTIFIER
;

// Rule FunctionDecl
ruleFunctionDecl:
	'func'
	ruleFunctionName
	ruleSignature
	ruleFunctionBody
	?
;

// Rule PackageClause
rulePackageClause:
	'package'
	rulePackageName
;

// Rule IMAGINARY_LIT
ruleIMAGINARY_LIT:
	(
		RULE_DECIMALS
		    |
		RULE_FLOAT_LIT
	)
	'\u00EF'
;

// Rule RUNE_LIT
ruleRUNE_LIT:
	'\''
	(
		RULE_UNICODE_VALUE
		    |
		RULE_BYTE_VALUE
	)
	'\''
;

// Rule STRING_LIT
ruleSTRING_LIT:
	(
		RULE_RAW_STRING_LIT
		    |
		RULE_INTERPRETED_STRING_LIT
	)
;

// Rule Type
ruleType:
	(
		RULE_LITERAL_TYPE
		    |
		ruleTypeLit
		    |
		'('
		ruleType
		')'
	)
;

// Rule TypeName
ruleTypeName:
	(
		RULE_IDENTIFIER
		    |
		ruleQualifiedIdent
	)
;

// Rule QualifiedIdent
ruleQualifiedIdent:
	rulePackageName
	'.'
	RULE_IDENTIFIER
;

// Rule PackageName
rulePackageName:
	RULE_IDENTIFIER
;

// Rule TypeLit
ruleTypeLit:
	(
		ruleArrayType
		    |
		ruleStructType
		    |
		ruleFunctionType
		    |
		ruleInterfaceType
		    |
		ruleSliceType
		    |
		ruleMapType
		    |
		ruleChannelType
		    |
		rulePointerType
	)
;

// Rule ArrayType
ruleArrayType:
	'['
	ruleArrayLength
	']'
	ruleElementType
;

// Rule ArrayLength
ruleArrayLength:
	ruleExpression
;

// Rule ElementType
ruleElementType:
	ruleType
;

// Rule SliceType
ruleSliceType:
	'['
	']'
	ruleElementType
;

// Rule StructType
ruleStructType:
	'struct'
	'{'
	(
		ruleFieldDecl
		';'?
	)*
	'}'
;

// Rule FieldDecl
ruleFieldDecl:
	(
		ruleIdentifierList
		ruleType
		    |
		ruleEmbeddedField
	)
	ruleTag
	?
;

// Rule IdentifierList
ruleIdentifierList:
	RULE_IDENTIFIER
	(
		','
		RULE_IDENTIFIER
	)*
;

// Rule EmbeddedField
ruleEmbeddedField:
	'*'?
	ruleTypeName
;

// Rule Tag
ruleTag:
	ruleSTRING_LIT
;

// Rule PointerType
rulePointerType:
	'*'
	ruleBaseType
;

// Rule BaseType
ruleBaseType:
	ruleType
;

// Rule FunctionType
ruleFunctionType:
	'func'
	ruleSignature
;

// Rule Signature
ruleSignature:
	ruleParameters
	ruleResult
	?
;

// Rule Result
ruleResult:
	(
		ruleParameters
		    |
		ruleType
	)
;

// Rule Parameters
ruleParameters:
	'('
	ruleParameterList
	?
	')'
;

// Rule ParameterList
ruleParameterList:
	ruleParameterDecl
	(
		','
		ruleParameterDecl
	)*
;

// Rule ParameterDecl
ruleParameterDecl:
	RULE_IDENTIFIER
	'...'?
	ruleType
	?
;

// Rule InterfaceType
ruleInterfaceType:
	'interface'
	'{'
	(
		ruleMethodSpec
		';'
	)*
	'}'
;

// Rule MethodSpec
ruleMethodSpec:
	(
		ruleMethodName
		ruleSignature
		    |
		ruleInterfaceTypeName
	)
;

// Rule MethodName
ruleMethodName:
	RULE_IDENTIFIER
;

// Rule InterfaceTypeName
ruleInterfaceTypeName:
	ruleTypeName
;

// Rule MapType
ruleMapType:
	'map'
	'['
	ruleKeyType
	']'
	ruleElementType
;

// Rule KeyType
ruleKeyType:
	ruleType
;

// Rule ChannelType
ruleChannelType:
	(
		'chan'
		'<-'?
		    |
		'<-'
		'chan'
	)
	ruleElementType
;

// Rule Block
ruleBlock:
	'{'
	ruleStatementList
	'}'
;

// Rule StatementList
ruleStatementList:
	(
		ruleStatement
		';'?
	)*
;

// Rule Statement
ruleStatement:
	(
		ruleDeclaration
		    |
		ruleLabeledStmt
		    |
		ruleSimpleStmt
		    |
		ruleGoStmt
		    |
		ruleReturnStmt
		    |
		ruleBreakStmt
		    |
		ruleContinueStmt
		    |
		ruleGotoStmt
		    |
		ruleFallthroughStmt
		    |
		ruleBlock
		    |
		ruleIfStmt
		    |
		ruleSwitchStmt
		    |
		ruleSelectStmt
		    |
		ruleForStmt
		    |
		ruleDeferStmt
	)
;

// Rule Declaration
ruleDeclaration:
	(
		ruleConstDecl
		    |
		ruleTypeDecl
		    |
		ruleVarDecl
	)
;

// Rule LabeledStmt
ruleLabeledStmt:
	ruleLabel
	':'
	ruleStatement
;

// Rule SimpleStmt
ruleSimpleStmt:
	(
		ruleIncDecStmt
		    |
		ruleAssignment
		    |
		ruleSendStmt
		    |
		ruleShortVarDecl
		    |
		ruleExpressionStmt
		    |
		ruleEmptyStmt
	)
;

// Rule GoStmt
ruleGoStmt:
	'goto'
	ruleLabel
;

// Rule ReturnStmt
ruleReturnStmt:
	'return'
	ruleExpressionList
	?
;

// Rule BreakStmt
ruleBreakStmt:
	'break'
	ruleLabel?
;

// Rule ContinueStmt
ruleContinueStmt:
	'continue'
	ruleLabel?
;

// Rule GotoStmt
ruleGotoStmt:
	'goto'
	ruleLabel
;

// Rule IfStmt
ruleIfStmt:
	'if'
	(
		ruleSimpleStmt
		';'
	)?
	ruleExpression
	ruleBlock
	(
		'else'
		(
			ruleIfStmt
			    |
			ruleBlock
		)
	)?
;

// Rule FallthroughStmt
ruleFallthroughStmt:
	'fallthrough'
;

// Rule SwitchStmt
ruleSwitchStmt:
	(
		ruleExprSwitchStmt
		    |
		ruleTypeSwitchStmt
	)
;

// Rule SelectStmt
ruleSelectStmt:
	'select'
	'{'
	ruleCommClause
	*
	'}'
;

// Rule ForStmt
ruleForStmt:
	'for'
	(
		ruleCondition
		    |
		ruleForClause
		    |
		ruleRangeClause
	)?
	ruleBlock
;

// Rule DeferStmt
ruleDeferStmt:
	'defer'
	ruleExpression
;

// Rule ConstDecl
ruleConstDecl:
	'const'
	(
		ruleConstSpec
		    |
		'('
		(
			ruleConstSpec
			';'?
		)*
		')'
	)
;

// Rule ConstSpec
ruleConstSpec:
	ruleIdentifierList
	ruleType
	?
	(
		'='
		ruleExpressionList
	)?
;

// Rule TypeDecl
ruleTypeDecl:
	'type'
	(
		ruleTypeSpec
		    |
		'('
		(
			ruleTypeSpec
			';'
		)*
		')'
	)
;

// Rule TypeSpec
ruleTypeSpec:
	(
		ruleAliasDecl
		    |
		ruleTypeDef
	)
;

// Rule TypeDef
ruleTypeDef:
	RULE_IDENTIFIER
	ruleType
;

// Rule AliasDecl
ruleAliasDecl:
	RULE_IDENTIFIER
	'='
	ruleType
;

// Rule VarDecl
ruleVarDecl:
	'var'
	(
		ruleVarSpec
		    |
		'('
		(
			ruleVarSpec
			';'?
		)*
		')'
	)
;

// Rule VarSpec
ruleVarSpec:
	ruleIdentifierList
	ruleType
	?
	(
		'='
		ruleExpressionList
	)?
;

// Rule EmptyStmt
ruleEmptyStmt:
	';'
;

// Rule ExpressionStmt
ruleExpressionStmt:
	ruleExpression
;

// Rule SendStmt
ruleSendStmt:
	ruleChannel
	'<-'
	ruleExpression
;

// Rule Channel
ruleChannel:
	ruleExpression
;

// Rule IncDecStmt
ruleIncDecStmt:
	(
		ruleExpression
		'++'
		    |
		ruleExpression
		'--'
	)
;

// Rule Assignment
ruleAssignment:
	ruleExpressionList
	(
		RULE_ASSING_OP
		    |'='
	)
	ruleExpressionList
;

// Rule ShortVarDecl
ruleShortVarDecl:
	ruleIdentifierList
	':='
	ruleExpressionList
;

// Rule ExprSwitchStmt
ruleExprSwitchStmt:
	'switch'
	(
		ruleSimpleStmt
		';'
	)?
	ruleExpression
	?
	'{'
	ruleExprCaseClause
	*
	'}'
;

// Rule ExprCaseClause
ruleExprCaseClause:
	ruleExprSwitchCase
	':'
	ruleStatementList
;

// Rule ExprSwitchCase
ruleExprSwitchCase:
	(
		'case'
		ruleExpressionList
		    |
		'default'
	)
;

// Rule TypeSwitchStmt
ruleTypeSwitchStmt:
	'switch'
	(
		ruleSimpleStmt
		';'
	)?
	ruleTypeSwitchGuard
	'{'
	ruleTypeCaseClause
	*
	'}'
;

// Rule TypeSwitchGuard
ruleTypeSwitchGuard:
	(
		RULE_IDENTIFIER
		':='
	)?
	rulePrimaryExpr
	'.'
	'('
	'type'
	')'
;

// Rule TypeCaseClause
ruleTypeCaseClause:
	ruleTypeSwitchCase
	':'
	ruleStatementList
;

// Rule TypeSwitchCase
ruleTypeSwitchCase:
	(
		'case'
		ruleTypeList
		    |
		'default'
	)
;

// Rule TypeList
ruleTypeList:
	ruleType
	(
		','
		ruleType
	)*
;

// Rule CommClause
ruleCommClause:
	ruleCommCase
	':'
	ruleStatementList
;

// Rule CommCase
ruleCommCase:
	(
		'case'
		(
			ruleSendStmt
			    |
			ruleRecvStmt
		)
		    |
		'default'
	)
;

// Rule RecvStmt
ruleRecvStmt:
	(
		ruleExpressionList
		'='
		    |
		ruleIdentifierList
		':='
	)?
	ruleRecvExpr
;

// Rule RecvExpr
ruleRecvExpr:
	ruleExpression
;

// Rule Condition
ruleCondition:
	ruleExpression
;

// Rule ForClause
ruleForClause:
	ruleInitStmt
	?
	';'
	ruleCondition
	?
	';'
	rulePostStmt
	?
;

// Rule RangeClause
ruleRangeClause:
	(
		ruleExpressionList
		'='
		    |
		ruleIdentifierList
		':='
	)?
	'range'
	ruleExpression
;

// Rule InitStmt
ruleInitStmt:
	ruleSimpleStmt
;

// Rule PostStmt
rulePostStmt:
	ruleSimpleStmt
;

// Rule Label
ruleLabel:
	RULE_IDENTIFIER
;

// Rule ExpressionList
ruleExpressionList:
	ruleExpression
	(
		','
		ruleExpression
	)*
;

// Rule Expression
ruleExpression:
	ruleUnaryExpr
	ruleExpression2
;

// Rule Expression2
ruleExpression2:
	(
		RULE_BINARY_OP
		ruleExpression
		ruleExpression2
	)?
;

// Rule UnaryExpr
ruleUnaryExpr:
	(
		rulePrimaryExpr
		    |
		RULE_UNARY_OP
		ruleUnaryExpr
	)
;

// Rule PrimaryExpr
rulePrimaryExpr:
	(
		ruleOperand
		rulePrimaryExpr2
		    |
		ruleConversion
		rulePrimaryExpr2
		    |
		ruleMethodExpr
		rulePrimaryExpr2
	)
;

// Rule PrimaryExpr2
rulePrimaryExpr2:
	(
		ruleSelector
		rulePrimaryExpr2
		    |
		ruleIndex
		rulePrimaryExpr2
		    |
		ruleSlice
		rulePrimaryExpr2
		    |
		ruleTypeAssertion
		rulePrimaryExpr2
		    |
		ruleArguments
		rulePrimaryExpr2
	)?
;

// Rule Operand
ruleOperand:
	(
		ruleLiteral
		    |
		ruleOperandName
		    |
		'('
		ruleExpression
		')'
	)
;

// Rule Conversion
ruleConversion:
	ruleType
	'('
	ruleExpression
	','?
	')'
;

// Rule MethodExpr
ruleMethodExpr:
	ruleReceiverType
	'.'
	ruleMethodName
;

// Rule Selector
ruleSelector:
	'.'
	RULE_IDENTIFIER
;

// Rule Index
ruleIndex:
	'['
	ruleExpression
	']'
;

// Rule Slice
ruleSlice:
	(
		'['
		ruleExpression
		?
		':'
		ruleExpression
		?
		']'
		    |
		'['
		ruleExpression
		?
		':'
		ruleExpression
		':'
		ruleExpression
		']'
	)
;

// Rule TypeAssertion
ruleTypeAssertion:
	'.'
	'('
	ruleType
	')'
;

// Rule Arguments
ruleArguments:
	'('
	(
		(
			ruleExpressionList
			    |
			ruleType
			(
				','
				ruleExpressionList
			)?
		)
		'...'?
		','?
	)?
	')'
;

// Rule Literal
ruleLiteral:
	(
		ruleBasicLit
		    |
		ruleCompositeLit
		    |
		ruleFunctionLit
	)
;

// Rule FunctionLit
ruleFunctionLit:
	'func'
	ruleSignature
	ruleFunctionBody
;

// Rule CompositeLit
ruleCompositeLit:
	ruleLiteralType
	ruleLiteralValue
;

// Rule LiteralType
ruleLiteralType:
	(
		ruleStructType
		    |
		ruleArrayType
		    |
		'['
		'...'
		']'
		ruleElementType
		    |
		ruleSliceType
		    |
		ruleMapType
		    |
		ruleTypeName
	)
;

// Rule LiteralValue
ruleLiteralValue:
	'{'
	(
		ruleElementList
		','?
	)?
	'}'
;

// Rule ElementList
ruleElementList:
	ruleKeyedElement
	(
		','?
		ruleKeyedElement
	)*
;

// Rule KeyedElement
ruleKeyedElement:
	(
		ruleKey
		':'
	)?
	ruleElement
;

// Rule Key
ruleKey:
	(
		ruleFieldName
		    |
		ruleExpression
		    |
		ruleLiteralValue
	)
;

// Rule FieldName
ruleFieldName:
	RULE_IDENTIFIER
;

// Rule Element
ruleElement:
	(
		ruleExpression
		    |
		ruleLiteralValue
	)
;

// Rule BasicLit
ruleBasicLit:
	(
		RULE_INT_LIT
		    |
		RULE_FLOAT_LIT
		    |
		ruleIMAGINARY_LIT
		    |
		ruleRUNE_LIT
		    |
		RULE_STRING
		    |
		RULE_BOOLEAN_LIT
	)
;

// Rule ReceiverType
ruleReceiverType:
	ruleType
;

// Rule FunctionBody
ruleFunctionBody:
	ruleBlock
;

// Rule OperandName
ruleOperandName:
	(
		RULE_IDENTIFIER
		    |
		ruleQualifiedIdent
	)
;

// Rule ImportDecl
ruleImportDecl:
	'import'
	(
		ruleImportSpec
		    |
		'('
		ruleImportSpec
		*
		')'
	)
;

// Rule ImportSpec
ruleImportSpec:
	(
		'.'
		    |
		RULE_IDENTIFIER
	)?
	ruleImportPath
;

// Rule ImportPath
ruleImportPath:
	RULE_STRING
;

fragment RULE_NEWLINE : '\n';

fragment RULE_UNICODE_CHAR : '\n';

RULE_UNICODE_LETTER : ('A-Z'|'a-z'|'\u00AA'|'\u00B5'|'\u00BA'|'\u00C0-\u00D6'|'\u00D8-\u00F6'|'\u00F8-\u021F'|'\u0222-\u0233'|'\u0250-\u02AD'|'\u02B0-\u02B8'|'\u02BB-\u02C1'|'\u02D0-\u02D1'|'\u02E0-\u02E4'|'\u02EE'|'\u037A'|'\u0386'|'\u0388-\u038A'|'\u038C'|'\u038E-\u03A1'|'\u03A3-\u03CE'|'\u03D0-\u03D7'|'\u03DA-\u03F3'|'\u0400-\u0481'|'\u048C-\u04C4'|'\u04C7-\u04C8'|'\u04CB-\u04CC'|'\u04D0-\u04F5'|'\u04F8-\u04F9'|'\u0531-\u0556'|'\u0559'|'\u0561-\u0587'|'\u05D0-\u05EA'|'\u05F0-\u05F2'|'\u0621-\u063A'|'\u0640-\u064A'|'\u0671-\u06D3'|'\u06D5'|'\u06E5-\u06E6'|'\u06FA-\u06FC'|'\u0710'|'\u0712-\u072C'|'\u0780-\u07A5'|'\u0905-\u0939'|'\u093D'|'\u0950'|'\u0958-\u0961'|'\u0985-\u098C'|'\u098F-\u0990'|'\u0993-\u09A8'|'\u09AA-\u09B0'|'\u09B2'|'\u09B6-\u09B9'|'\u09DC-\u09DD'|'\u09DF-\u09E1'|'\u09F0-\u09F1'|'\u0A05-\u0A0A'|'\u0A0F-\u0A10'|'\u0A13-\u0A28'|'\u0A2A-\u0A30'|'\u0A32-\u0A33'|'\u0A35-\u0A36'|'\u0A38-\u0A39'|'\u0A59-\u0A5C'|'\u0A5E'|'\u0A72-\u0A74'|'\u0A85-\u0A8B'|'\u0A8D'|'\u0A8F-\u0A91'|'\u0A93-\u0AA8'|'\u0AAA-\u0AB0'|'\u0AB2-\u0AB3'|'\u0AB5-\u0AB9'|'\u0ABD'|'\u0AD0'|'\u0AE0'|'\u0B05-\u0B0C'|'\u0B0F-\u0B10'|'\u0B13-\u0B28'|'\u0B2A-\u0B30'|'\u0B32-\u0B33'|'\u0B36-\u0B39'|'\u0B3D'|'\u0B5C-\u0B5D'|'\u0B5F-\u0B61'|'\u0B85-\u0B8A'|'\u0B8E-\u0B90'|'\u0B92-\u0B95'|'\u0B99-\u0B9A'|'\u0B9C'|'\u0B9E-\u0B9F'|'\u0BA3-\u0BA4'|'\u0BA8-\u0BAA'|'\u0BAE-\u0BB5'|'\u0BB7-\u0BB9'|'\u0C05-\u0C0C'|'\u0C0E-\u0C10'|'\u0C12-\u0C28'|'\u0C2A-\u0C33'|'\u0C35-\u0C39'|'\u0C60-\u0C61'|'\u0C85-\u0C8C'|'\u0C8E-\u0C90'|'\u0C92-\u0CA8'|'\u0CAA-\u0CB3'|'\u0CB5-\u0CB9'|'\u0CDE'|'\u0CE0-\u0CE1'|'\u0D05-\u0D0C'|'\u0D0E-\u0D10'|'\u0D12-\u0D28'|'\u0D2A-\u0D39'|'\u0D60-\u0D61'|'\u0D85-\u0D96'|'\u0D9A-\u0DB1'|'\u0DB3-\u0DBB'|'\u0DBD'|'\u0DC0-\u0DC6'|'\u0E01-\u0E30'|'\u0E32-\u0E33'|'\u0E40-\u0E46'|'\u0E81-\u0E82'|'\u0E84'|'\u0E87-\u0E88'|'\u0E8A'|'\u0E8D'|'\u0E94-\u0E97'|'\u0E99-\u0E9F'|'\u0EA1-\u0EA3'|'\u0EA5'|'\u0EA7'|'\u0EAA-\u0EAB'|'\u0EAD-\u0EB0'|'\u0EB2-\u0EB3'|'\u0EBD-\u0EC4'|'\u0EC6'|'\u0EDC-\u0EDD'|'\u0F00'|'\u0F40-\u0F6A'|'\u0F88-\u0F8B'|'\u1000-\u1021'|'\u1023-\u1027'|'\u1029-\u102A'|'\u1050-\u1055'|'\u10A0-\u10C5'|'\u10D0-\u10F6'|'\u1100-\u1159'|'\u115F-\u11A2'|'\u11A8-\u11F9'|'\u1200-\u1206'|'\u1208-\u1246'|'\u1248'|'\u124A-\u124D'|'\u1250-\u1256'|'\u1258'|'\u125A-\u125D'|'\u1260-\u1286'|'\u1288'|'\u128A-\u128D'|'\u1290-\u12AE'|'\u12B0'|'\u12B2-\u12B5'|'\u12B8-\u12BE'|'\u12C0'|'\u12C2-\u12C5'|'\u12C8-\u12CE'|'\u12D0-\u12D6'|'\u12D8-\u12EE'|'\u12F0-\u130E'|'\u1310'|'\u1312-\u1315'|'\u1318-\u131E'|'\u1320-\u1346'|'\u1348-\u135A'|'\u13A0-\u13B0'|'\u13B1-\u13F4'|'\u1401-\u1676'|'\u1681-\u169A'|'\u16A0-\u16EA'|'\u1780-\u17B3'|'\u1820-\u1877'|'\u1880-\u18A8'|'\u1E00-\u1E9B'|'\u1EA0-\u1EE0'|'\u1EE1-\u1EF9'|'\u1F00-\u1F15'|'\u1F18-\u1F1D'|'\u1F20-\u1F39'|'\u1F3A-\u1F45'|'\u1F48-\u1F4D'|'\u1F50-\u1F57'|'\u1F59'|'\u1F5B'|'\u1F5D'|'\u1F5F-\u1F7D'|'\u1F80-\u1FB4'|'\u1FB6-\u1FBC'|'\u1FBE'|'\u1FC2-\u1FC4'|'\u1FC6-\u1FCC'|'\u1FD0-\u1FD3'|'\u1FD6-\u1FDB'|'\u1FE0-\u1FEC'|'\u1FF2-\u1FF4'|'\u1FF6-\u1FFC'|'\u207F'|'\u2102'|'\u2107'|'\u210A-\u2113'|'\u2115'|'\u2119-\u211D'|'\u2124'|'\u2126'|'\u2128'|'\u212A-\u212D'|'\u212F-\u2131'|'\u2133-\u2139'|'\u2160-\u2183'|'\u3005-\u3007'|'\u3021-\u3029'|'\u3031-\u3035'|'\u3038-\u303A'|'\u3041-\u3094'|'\u309D-\u309E'|'\u30A1-\u30FA'|'\u30FC-\u30FE'|'\u3105-\u312C'|'\u3131-\u318E'|'\u31A0-\u31B7'|'\u3400'|'\u4DB5'|'\u4E00'|'\u9FA5'|'\uA000-\uA48C'|'\uAC00'|'\uD7A3'|'\uF900-\uFA2D'|'\uFB00-\uFB06'|'\uFB13-\uFB17'|'\uFB1D'|'\uFB1F-\uFB28'|'\uFB2A-\uFB36'|'\uFB38-\uFB3C'|'\uFB3E'|'\uFB40-\uFB41'|'\uFB43-\uFB44'|'\uFB46-\uFBB1'|'\uFBD3-\uFD3D'|'\uFD50-\uFD8F'|'\uFD92-\uFDC7'|'\uFDF0-\uFDFB'|'\uFE70-\uFE72'|'\uFE74'|'\uFE76-\uFEFC'|'\uFF21-\uFF3A'|'\uFF41-\uFF5A'|'\uFF66-\uFFBE'|'\uFFC2-\uFFC7'|'\uFFCA-\uFFCF'|'\uFFD2-\uFFD7'|'\uFFDA-\uFFDC');

RULE_LITERAL_TYPE : ('int'|'float'|'bool'|'string');

RULE_BINARY_OP : ('||'|'&&'|RULE_REL_OP|RULE_MUL_OP|RULE_ADD_OP);

fragment RULE_REL_OP : ('=='|'!='|'<'|'<='|'>'|'>=');

fragment RULE_ADD_OP : ('+'|'-'|'|'|'^');

fragment RULE_MUL_OP : (RULE_MUL|'/'|'%'|'<<'|'>>'|'&'|'&^');

fragment RULE_MUL : '*';

RULE_UNARY_OP : ('+'|'-'|'!'|'^'|RULE_MUL|'&'|'<-');

RULE_ASSING_OP : ('='|'+='|'-='|'*='|'^='|':=');

fragment RULE_DECIMAL_DIGIT : RULE_INT;

fragment RULE_OCTAL_DIGIT : ('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7');

fragment RULE_HEX_DIGIT : (('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9')|('A'|'B'|'C'|'D'|'E'|'F')|('a'|'b'|'c'|'d'|'e'|'f'));

RULE_BOOLEAN_LIT : ('true'|'false');

RULE_IDENTIFIER : RULE_ID;

RULE_FLOAT_LIT : (RULE_DECIMAL_LIT '.' RULE_DECIMAL_LIT? RULE_EXPOENT?|RULE_DECIMALS RULE_EXPOENT|'.' RULE_DECIMALS RULE_EXPOENT?);

RULE_INT_LIT : (RULE_DECIMAL_LIT|RULE_OCTAL_LIT|RULE_HEX_LIT);

fragment RULE_DECIMAL_LIT : ('1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9') RULE_DECIMAL_DIGIT*;

fragment RULE_OCTAL_LIT : '0' RULE_OCTAL_DIGIT*;

fragment RULE_HEX_LIT : '0' ('x'|'X') RULE_HEX_DIGIT RULE_HEX_DIGIT+;

RULE_DECIMALS : RULE_DECIMAL_DIGIT+;

fragment RULE_EXPOENT : ('e'|'E') ('+'|'-')? RULE_DECIMALS;

RULE_UNICODE_VALUE : (RULE_UNICODE_CHAR|RULE_LITTLE_U_VALUE|RULE_BIG_U_VALUE|RULE_ESCAPED_CHAR);

RULE_BYTE_VALUE : (RULE_OCTAL_BYTE_VALUE|RULE_HEX_BYTE_VALUE);

fragment RULE_OCTAL_BYTE_VALUE : '\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT;

fragment RULE_HEX_BYTE_VALUE : '\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT;

fragment RULE_LITTLE_U_VALUE : '\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT;

fragment RULE_BIG_U_VALUE : '\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT;

fragment RULE_ESCAPED_CHAR : '\\' ('a'|'b'|'f'|'n'|'r'|'t'|'v'|'\\'|'\''|'"');

RULE_RAW_STRING_LIT : '\'' (RULE_UNICODE_CHAR|RULE_NEWLINE)? '\'';

RULE_INTERPRETED_STRING_LIT : '"' (RULE_UNICODE_VALUE|RULE_BYTE_VALUE)? '"';

fragment RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/' {skip();};

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')? {skip();};

RULE_WS : (' '|'\t'|'\r'|'\n')+ {skip();};

RULE_ANY_OTHER : .;
