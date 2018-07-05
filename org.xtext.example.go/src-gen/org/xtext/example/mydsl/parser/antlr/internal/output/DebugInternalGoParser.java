// $ANTLR 3.5.1 C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g 2018-07-04 23:36:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class DebugInternalGoParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ADD_OP", "RULE_ANY_OTHER", 
		"RULE_BIG_U_VALUE", "RULE_BINARY_OP", "RULE_BYTE_VALUE", "RULE_DECIMALS", 
		"RULE_DECIMAL_DIGIT", "RULE_DECIMAL_LIT", "RULE_ESCAPED_CHAR", "RULE_EXPOENT", 
		"RULE_FLOAT_LIT", "RULE_HEX_BYTE_VALUE", "RULE_HEX_DIGIT", "RULE_HEX_LIT", 
		"RULE_ID", "RULE_INT", "RULE_INTERPRETED_STRING_LIT", "RULE_INT_LIT", 
		"RULE_LETTER", "RULE_LITTLE_U_VALUE", "RULE_ML_COMMENT", "RULE_MUL_OP", 
		"RULE_NEWLINE", "RULE_OCTAL_BYTE_VALUE", "RULE_OCTAL_DIGIT", "RULE_OCTAL_LIT", 
		"RULE_RAW_STRING_LIT", "RULE_REL_OP", "RULE_SL_COMMENT", "RULE_STRING", 
		"RULE_UNARY_OP", "RULE_UNICODE_CHAR", "RULE_UNICODE_DIGIT", "RULE_UNICODE_LETTER", 
		"RULE_UNICODE_VALUE", "RULE_WS", "'%'", "'&'", "'&^'", "'('", "')'", "'*'", 
		"'+'", "'++'", "','", "'-'", "'--'", "'.'", "'...'", "'/'", "':'", "':='", 
		"';'", "'<-'", "'<<'", "'='", "'>>'", "'['", "'\\''", "'\\u00EF'", "']'", 
		"'^'", "'break'", "'case'", "'chan'", "'const'", "'continue'", "'default'", 
		"'defer'", "'else'", "'fallthrough'", "'for'", "'func'", "'goto'", "'if'", 
		"'import'", "'interface'", "'map'", "'package'", "'range'", "'return'", 
		"'select'", "'struct'", "'switch'", "'type'", "'var'", "'{'", "'|'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int RULE_ADD_OP=4;
	public static final int RULE_ANY_OTHER=5;
	public static final int RULE_BIG_U_VALUE=6;
	public static final int RULE_BINARY_OP=7;
	public static final int RULE_BYTE_VALUE=8;
	public static final int RULE_DECIMALS=9;
	public static final int RULE_DECIMAL_DIGIT=10;
	public static final int RULE_DECIMAL_LIT=11;
	public static final int RULE_ESCAPED_CHAR=12;
	public static final int RULE_EXPOENT=13;
	public static final int RULE_FLOAT_LIT=14;
	public static final int RULE_HEX_BYTE_VALUE=15;
	public static final int RULE_HEX_DIGIT=16;
	public static final int RULE_HEX_LIT=17;
	public static final int RULE_ID=18;
	public static final int RULE_INT=19;
	public static final int RULE_INTERPRETED_STRING_LIT=20;
	public static final int RULE_INT_LIT=21;
	public static final int RULE_LETTER=22;
	public static final int RULE_LITTLE_U_VALUE=23;
	public static final int RULE_ML_COMMENT=24;
	public static final int RULE_MUL_OP=25;
	public static final int RULE_NEWLINE=26;
	public static final int RULE_OCTAL_BYTE_VALUE=27;
	public static final int RULE_OCTAL_DIGIT=28;
	public static final int RULE_OCTAL_LIT=29;
	public static final int RULE_RAW_STRING_LIT=30;
	public static final int RULE_REL_OP=31;
	public static final int RULE_SL_COMMENT=32;
	public static final int RULE_STRING=33;
	public static final int RULE_UNARY_OP=34;
	public static final int RULE_UNICODE_CHAR=35;
	public static final int RULE_UNICODE_DIGIT=36;
	public static final int RULE_UNICODE_LETTER=37;
	public static final int RULE_UNICODE_VALUE=38;
	public static final int RULE_WS=39;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "synpred13_DebugInternalGo", "ruleAssignment", "ruleLabel", 
		"ruleTypeSwitchStmt", "ruleConstDecl", "ruleLiteralValue", "synpred154_DebugInternalGo", 
		"ruleKeyedElement", "ruleBlock", "ruleCommCase", "ruleChannel", "ruleMapType", 
		"synpred47_DebugInternalGo", "synpred91_DebugInternalGo", "ruleSliceType", 
		"ruleContinueStmt", "synpred159_DebugInternalGo", "synpred125_DebugInternalGo", 
		"ruleFunctionLit", "ruleMethodSpec", "synpred102_DebugInternalGo", "synpred126_DebugInternalGo", 
		"ruleFieldDecl", "synpred6_DebugInternalGo", "synpred10_DebugInternalGo", 
		"ruleStatementList", "ruleTopLevelDecl", "ruleLabeledStmt", "ruleTypeSpec", 
		"rulePrimaryExpr2", "ruleLiteralType", "ruleFunctionBody", "ruleVarSpec", 
		"ruleExprCaseClause", "ruleBreakStmt", "ruleVarDecl", "ruleSlice", "ruleElementType", 
		"synpred158_DebugInternalGo", "synpred100_DebugInternalGo", "synpred80_DebugInternalGo", 
		"ruleFallthroughStmt", "synpred89_DebugInternalGo", "synpred142_DebugInternalGo", 
		"synpred113_DebugInternalGo", "synpred30_DebugInternalGo", "ruleExpression", 
		"synpred14_DebugInternalGo", "ruleBasicLit", "synpred151_DebugInternalGo", 
		"ruleForClause", "ruleASSING_OP", "synpred150_DebugInternalGo", "synpred3_DebugInternalGo", 
		"ruleElement", "synpred16_DebugInternalGo", "synpred49_DebugInternalGo", 
		"ruleStatement", "synpred62_DebugInternalGo", "synpred118_DebugInternalGo", 
		"synpred65_DebugInternalGo", "synpred140_DebugInternalGo", "ruleMethodDecl", 
		"ruleArrayType", "ruleInterfaceType", "synpred51_DebugInternalGo", "synpred133_DebugInternalGo", 
		"synpred74_DebugInternalGo", "ruleCompositeLit", "ruleModel", "ruleQualifiedIdent", 
		"ruleSwitchStmt", "synpred26_DebugInternalGo", "ruleImportSpec", "synpred8_DebugInternalGo", 
		"ruleFunctionDecl", "ruleType", "synpred25_DebugInternalGo", "synpred64_DebugInternalGo", 
		"synpred19_DebugInternalGo", "synpred108_DebugInternalGo", "synpred39_DebugInternalGo", 
		"synpred79_DebugInternalGo", "synpred31_DebugInternalGo", "ruleSimpleStmt", 
		"ruleTypeSwitchCase", "synpred144_DebugInternalGo", "synpred109_DebugInternalGo", 
		"ruleMethodExpr", "synpred81_DebugInternalGo", "ruleParameters", "synpred4_DebugInternalGo", 
		"ruleOperandName", "ruleArrayLength", "ruleArguments", "synpred120_DebugInternalGo", 
		"synpred32_DebugInternalGo", "ruleUnaryExpr", "ruleTypeDef", "synpred23_DebugInternalGo", 
		"synpred57_DebugInternalGo", "rulePostStmt", "synpred1_DebugInternalGo", 
		"synpred52_DebugInternalGo", "synpred115_DebugInternalGo", "ruleRUNE_LIT", 
		"synpred53_DebugInternalGo", "synpred17_DebugInternalGo", "synpred114_DebugInternalGo", 
		"synpred70_DebugInternalGo", "ruleForStmt", "ruleTypeList", "synpred2_DebugInternalGo", 
		"ruleInterfaceTypeName", "ruleIndex", "synpred117_DebugInternalGo", "synpred105_DebugInternalGo", 
		"synpred86_DebugInternalGo", "synpred7_DebugInternalGo", "ruleTypeSwitchGuard", 
		"synpred29_DebugInternalGo", "synpred134_DebugInternalGo", "synpred48_DebugInternalGo", 
		"synpred96_DebugInternalGo", "ruleTag", "synpred5_DebugInternalGo", "synpred155_DebugInternalGo", 
		"synpred156_DebugInternalGo", "ruleExpressionList", "synpred21_DebugInternalGo", 
		"synpred82_DebugInternalGo", "synpred90_DebugInternalGo", "rulePackageName", 
		"synpred101_DebugInternalGo", "synpred55_DebugInternalGo", "ruleImportPath", 
		"ruleExpressionStmt", "ruleConstSpec", "ruleRecvExpr", "synpred127_DebugInternalGo", 
		"synpred138_DebugInternalGo", "synpred119_DebugInternalGo", "synpred121_DebugInternalGo", 
		"synpred131_DebugInternalGo", "synpred66_DebugInternalGo", "ruleTypeCaseClause", 
		"synpred43_DebugInternalGo", "synpred45_DebugInternalGo", "ruleTypeName", 
		"synpred104_DebugInternalGo", "ruleKeyType", "synpred67_DebugInternalGo", 
		"synpred152_DebugInternalGo", "synpred110_DebugInternalGo", "synpred137_DebugInternalGo", 
		"synpred83_DebugInternalGo", "rulePrimaryExpr", "ruleTypeLit", "ruleTypeDecl", 
		"synpred58_DebugInternalGo", "synpred77_DebugInternalGo", "synpred99_DebugInternalGo", 
		"ruleSelectStmt", "synpred85_DebugInternalGo", "synpred136_DebugInternalGo", 
		"ruleRangeClause", "synpred22_DebugInternalGo", "ruleMethodName", "rulePointerType", 
		"ruleEmptyStmt", "ruleCondition", "synpred88_DebugInternalGo", "synpred143_DebugInternalGo", 
		"ruleIncDecStmt", "synpred27_DebugInternalGo", "synpred46_DebugInternalGo", 
		"ruleFunctionName", "synpred107_DebugInternalGo", "ruleTypeAssertion", 
		"ruleLiteral", "synpred68_DebugInternalGo", "ruleRecvStmt", "synpred38_DebugInternalGo", 
		"synpred76_DebugInternalGo", "synpred61_DebugInternalGo", "synpred149_DebugInternalGo", 
		"synpred9_DebugInternalGo", "synpred122_DebugInternalGo", "synpred153_DebugInternalGo", 
		"synpred139_DebugInternalGo", "ruleIDENTIFIER", "ruleExprSwitchCase", 
		"synpred63_DebugInternalGo", "synpred97_DebugInternalGo", "ruleBaseType", 
		"ruleElementList", "ruleConversion", "ruleAliasDecl", "synpred75_DebugInternalGo", 
		"synpred34_DebugInternalGo", "ruleGotoStmt", "synpred56_DebugInternalGo", 
		"synpred94_DebugInternalGo", "synpred35_DebugInternalGo", "synpred44_DebugInternalGo", 
		"synpred60_DebugInternalGo", "ruleDeclaration", "synpred132_DebugInternalGo", 
		"ruleImportDecl", "synpred15_DebugInternalGo", "synpred148_DebugInternalGo", 
		"ruleChannelType", "synpred135_DebugInternalGo", "synpred40_DebugInternalGo", 
		"ruleCommClause", "synpred12_DebugInternalGo", "synpred37_DebugInternalGo", 
		"rulePackageClause", "ruleStructType", "synpred87_DebugInternalGo", "synpred41_DebugInternalGo", 
		"synpred73_DebugInternalGo", "synpred59_DebugInternalGo", "ruleEmbeddedField", 
		"ruleParameterList", "synpred116_DebugInternalGo", "synpred157_DebugInternalGo", 
		"ruleCompilation_initial", "synpred71_DebugInternalGo", "ruleReceiverType", 
		"synpred98_DebugInternalGo", "synpred92_DebugInternalGo", "ruleKey", "ruleFunctionType", 
		"synpred50_DebugInternalGo", "ruleResult", "ruleExpression2", "synpred145_DebugInternalGo", 
		"ruleIfStmt", "synpred78_DebugInternalGo", "synpred42_DebugInternalGo", 
		"synpred123_DebugInternalGo", "ruleSignature", "ruleParameterDecl", "ruleIdentifierList", 
		"synpred72_DebugInternalGo", "synpred28_DebugInternalGo", "ruleSelector", 
		"synpred20_DebugInternalGo", "synpred93_DebugInternalGo", "synpred160_DebugInternalGo", 
		"ruleOperand", "synpred146_DebugInternalGo", "ruleDeferStmt", "ruleSTRING_LIT", 
		"ruleFieldName", "synpred11_DebugInternalGo", "synpred147_DebugInternalGo", 
		"synpred106_DebugInternalGo", "synpred54_DebugInternalGo", "ruleExprSwitchStmt", 
		"synpred112_DebugInternalGo", "synpred141_DebugInternalGo", "ruleInitStmt", 
		"synpred69_DebugInternalGo", "synpred84_DebugInternalGo", "synpred124_DebugInternalGo", 
		"synpred18_DebugInternalGo", "ruleReturnStmt", "synpred36_DebugInternalGo", 
		"synpred111_DebugInternalGo", "synpred129_DebugInternalGo", "synpred128_DebugInternalGo", 
		"ruleShortVarDecl", "ruleReceiver", "synpred130_DebugInternalGo", "synpred24_DebugInternalGo", 
		"ruleIMAGINARY_LIT", "ruleGoStmt", "synpred33_DebugInternalGo", "ruleSendStmt", 
		"synpred95_DebugInternalGo", "synpred103_DebugInternalGo"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, true, false, 
		    false, true, false, true, false, true, true, true, false, true, false, 
		    false, false, false, true, false, true, false, true, false, true, 
		    true, true, true, true, false, false, true, false, true, false, false, 
		    false, false, true, false, false, true, false, false, true, false, 
		    true, true, false, false, false, true, false, false, false, false, 
		    true, false, true, true, false, false, false, false, true, false, 
		    true, true, true, false, false, false, false, true, false, true, false, 
		    false, false, false, false, false, false, false, false, true, true, 
		    false, false, true, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public DebugInternalGoParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public DebugInternalGoParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public DebugInternalGoParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return DebugInternalGoParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g"; }



	// $ANTLR start "ruleModel"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:7:1: ruleModel : ruleCompilation_initial ;
	public final void ruleModel() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleModel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(7, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:7:10: ( ruleCompilation_initial )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:8:2: ruleCompilation_initial
			{
			dbg.location(8,2);
			pushFollow(FOLLOW_ruleCompilation_initial_in_ruleModel19);
			ruleCompilation_initial();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(9, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleModel");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleModel"



	// $ANTLR start "ruleCompilation_initial"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:12:1: ruleCompilation_initial : ( rulePackageClause ( ruleImportDecl )* ( ruleTopLevelDecl )* )? ;
	public final void ruleCompilation_initial() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleCompilation_initial");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:12:24: ( ( rulePackageClause ( ruleImportDecl )* ( ruleTopLevelDecl )* )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:13:2: ( rulePackageClause ( ruleImportDecl )* ( ruleTopLevelDecl )* )?
			{
			dbg.location(13,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:13:2: ( rulePackageClause ( ruleImportDecl )* ( ruleTopLevelDecl )* )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==82) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:14:3: rulePackageClause ( ruleImportDecl )* ( ruleTopLevelDecl )*
					{
					dbg.location(14,3);
					pushFollow(FOLLOW_rulePackageClause_in_ruleCompilation_initial33);
					rulePackageClause();
					state._fsp--;
					if (state.failed) return;dbg.location(15,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:15:3: ( ruleImportDecl )*
					try { dbg.enterSubRule(1);

					loop1:
					while (true) {
						int alt1=2;
						try { dbg.enterDecision(1, decisionCanBacktrack[1]);

						int LA1_0 = input.LA(1);
						if ( (LA1_0==79) ) {
							alt1=1;
						}

						} finally {dbg.exitDecision(1);}

						switch (alt1) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:15:3: ruleImportDecl
							{
							dbg.location(15,3);
							pushFollow(FOLLOW_ruleImportDecl_in_ruleCompilation_initial37);
							ruleImportDecl();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop1;
						}
					}
					} finally {dbg.exitSubRule(1);}
					dbg.location(17,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:17:3: ( ruleTopLevelDecl )*
					try { dbg.enterSubRule(2);

					loop2:
					while (true) {
						int alt2=2;
						try { dbg.enterDecision(2, decisionCanBacktrack[2]);

						int LA2_0 = input.LA(1);
						if ( (LA2_0==69||LA2_0==76||(LA2_0 >= 88 && LA2_0 <= 89)) ) {
							alt2=1;
						}

						} finally {dbg.exitDecision(2);}

						switch (alt2) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:17:3: ruleTopLevelDecl
							{
							dbg.location(17,3);
							pushFollow(FOLLOW_ruleTopLevelDecl_in_ruleCompilation_initial45);
							ruleTopLevelDecl();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop2;
						}
					}
					} finally {dbg.exitSubRule(2);}

					}
					break;

			}
			} finally {dbg.exitSubRule(3);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(20, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleCompilation_initial");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleCompilation_initial"



	// $ANTLR start "ruleTopLevelDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:23:1: ruleTopLevelDecl : ( ruleDeclaration | ruleFunctionDecl | ruleMethodDecl ) ;
	public final void ruleTopLevelDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTopLevelDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:23:17: ( ( ruleDeclaration | ruleFunctionDecl | ruleMethodDecl ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:24:2: ( ruleDeclaration | ruleFunctionDecl | ruleMethodDecl )
			{
			dbg.location(24,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:24:2: ( ruleDeclaration | ruleFunctionDecl | ruleMethodDecl )
			int alt4=3;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==69||(LA4_0 >= 88 && LA4_0 <= 89)) ) {
				alt4=1;
			}
			else if ( (LA4_0==76) ) {
				int LA4_2 = input.LA(2);
				if ( (LA4_2==RULE_LETTER) ) {
					alt4=2;
				}
				else if ( (LA4_2==43) ) {
					alt4=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:25:3: ruleDeclaration
					{
					dbg.location(25,3);
					pushFollow(FOLLOW_ruleDeclaration_in_ruleTopLevelDecl67);
					ruleDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:27:3: ruleFunctionDecl
					{
					dbg.location(27,3);
					pushFollow(FOLLOW_ruleFunctionDecl_in_ruleTopLevelDecl79);
					ruleFunctionDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:29:3: ruleMethodDecl
					{
					dbg.location(29,3);
					pushFollow(FOLLOW_ruleMethodDecl_in_ruleTopLevelDecl91);
					ruleMethodDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(31, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTopLevelDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTopLevelDecl"



	// $ANTLR start "ruleMethodDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:34:1: ruleMethodDecl : 'func' ruleReceiver ruleMethodName ruleSignature ( ruleFunctionBody )? ;
	public final void ruleMethodDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleMethodDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:34:15: ( 'func' ruleReceiver ruleMethodName ruleSignature ( ruleFunctionBody )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:35:2: 'func' ruleReceiver ruleMethodName ruleSignature ( ruleFunctionBody )?
			{
			dbg.location(35,2);
			match(input,76,FOLLOW_76_in_ruleMethodDecl104); if (state.failed) return;dbg.location(36,2);
			pushFollow(FOLLOW_ruleReceiver_in_ruleMethodDecl107);
			ruleReceiver();
			state._fsp--;
			if (state.failed) return;dbg.location(37,2);
			pushFollow(FOLLOW_ruleMethodName_in_ruleMethodDecl110);
			ruleMethodName();
			state._fsp--;
			if (state.failed) return;dbg.location(38,2);
			pushFollow(FOLLOW_ruleSignature_in_ruleMethodDecl113);
			ruleSignature();
			state._fsp--;
			if (state.failed) return;dbg.location(39,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:39:2: ( ruleFunctionBody )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==90) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:39:2: ruleFunctionBody
					{
					dbg.location(39,2);
					pushFollow(FOLLOW_ruleFunctionBody_in_ruleMethodDecl116);
					ruleFunctionBody();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(5);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(41, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleMethodDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleMethodDecl"



	// $ANTLR start "ruleReceiver"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:44:1: ruleReceiver : ruleParameters ;
	public final void ruleReceiver() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleReceiver");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(44, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:44:13: ( ruleParameters )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:45:2: ruleParameters
			{
			dbg.location(45,2);
			pushFollow(FOLLOW_ruleParameters_in_ruleReceiver129);
			ruleParameters();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(46, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleReceiver");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleReceiver"



	// $ANTLR start "ruleFunctionName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:49:1: ruleFunctionName : ruleIDENTIFIER ;
	public final void ruleFunctionName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFunctionName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(49, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:49:17: ( ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:50:2: ruleIDENTIFIER
			{
			dbg.location(50,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleFunctionName139);
			ruleIDENTIFIER();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(51, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFunctionName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFunctionName"



	// $ANTLR start "ruleFunctionDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:54:1: ruleFunctionDecl : 'func' ruleFunctionName ruleSignature ( ruleFunctionBody )? ;
	public final void ruleFunctionDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFunctionDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:54:17: ( 'func' ruleFunctionName ruleSignature ( ruleFunctionBody )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:55:2: 'func' ruleFunctionName ruleSignature ( ruleFunctionBody )?
			{
			dbg.location(55,2);
			match(input,76,FOLLOW_76_in_ruleFunctionDecl149); if (state.failed) return;dbg.location(56,2);
			pushFollow(FOLLOW_ruleFunctionName_in_ruleFunctionDecl152);
			ruleFunctionName();
			state._fsp--;
			if (state.failed) return;dbg.location(57,2);
			pushFollow(FOLLOW_ruleSignature_in_ruleFunctionDecl155);
			ruleSignature();
			state._fsp--;
			if (state.failed) return;dbg.location(58,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:58:2: ( ruleFunctionBody )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==90) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:58:2: ruleFunctionBody
					{
					dbg.location(58,2);
					pushFollow(FOLLOW_ruleFunctionBody_in_ruleFunctionDecl158);
					ruleFunctionBody();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(60, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFunctionDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFunctionDecl"



	// $ANTLR start "rulePackageClause"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:63:1: rulePackageClause : 'package' rulePackageName ;
	public final void rulePackageClause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulePackageClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:63:18: ( 'package' rulePackageName )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:64:2: 'package' rulePackageName
			{
			dbg.location(64,2);
			match(input,82,FOLLOW_82_in_rulePackageClause171); if (state.failed) return;dbg.location(65,2);
			pushFollow(FOLLOW_rulePackageName_in_rulePackageClause174);
			rulePackageName();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(66, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulePackageClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulePackageClause"



	// $ANTLR start "ruleASSING_OP"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:69:1: ruleASSING_OP : ( '+' | '-' | '|' | '^' | '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )? '=' ;
	public final void ruleASSING_OP() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleASSING_OP");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:69:14: ( ( '+' | '-' | '|' | '^' | '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )? '=' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:70:2: ( '+' | '-' | '|' | '^' | '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )? '='
			{
			dbg.location(70,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:70:2: ( '+' | '-' | '|' | '^' | '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= 40 && LA7_0 <= 42)||(LA7_0 >= 45 && LA7_0 <= 46)||LA7_0==49||LA7_0==53||LA7_0==58||LA7_0==60||LA7_0==65||LA7_0==91) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:
					{
					dbg.location(70,2);
					if ( (input.LA(1) >= 40 && input.LA(1) <= 42)||(input.LA(1) >= 45 && input.LA(1) <= 46)||input.LA(1)==49||input.LA(1)==53||input.LA(1)==58||input.LA(1)==60||input.LA(1)==65||input.LA(1)==91 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}
					}
					break;

			}
			} finally {dbg.exitSubRule(7);}
			dbg.location(93,2);
			match(input,59,FOLLOW_59_in_ruleASSING_OP315); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(94, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleASSING_OP");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleASSING_OP"



	// $ANTLR start "ruleIDENTIFIER"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:97:1: ruleIDENTIFIER : RULE_LETTER ( RULE_LETTER | RULE_UNICODE_DIGIT )* ;
	public final void ruleIDENTIFIER() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIDENTIFIER");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(97, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:97:15: ( RULE_LETTER ( RULE_LETTER | RULE_UNICODE_DIGIT )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:98:2: RULE_LETTER ( RULE_LETTER | RULE_UNICODE_DIGIT )*
			{
			dbg.location(98,2);
			match(input,RULE_LETTER,FOLLOW_RULE_LETTER_in_ruleIDENTIFIER325); if (state.failed) return;dbg.location(99,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:99:2: ( RULE_LETTER | RULE_UNICODE_DIGIT )*
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=2;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				int LA8_0 = input.LA(1);
				if ( (LA8_0==RULE_LETTER||LA8_0==RULE_UNICODE_DIGIT) ) {
					alt8=1;
				}

				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:
					{
					dbg.location(99,2);
					if ( input.LA(1)==RULE_LETTER||input.LA(1)==RULE_UNICODE_DIGIT ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}
			} finally {dbg.exitSubRule(8);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(104, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIDENTIFIER");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIDENTIFIER"



	// $ANTLR start "ruleIMAGINARY_LIT"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:107:1: ruleIMAGINARY_LIT : ( RULE_DECIMALS | RULE_FLOAT_LIT ) '\\u00EF' ;
	public final void ruleIMAGINARY_LIT() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIMAGINARY_LIT");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(107, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:107:18: ( ( RULE_DECIMALS | RULE_FLOAT_LIT ) '\\u00EF' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:108:2: ( RULE_DECIMALS | RULE_FLOAT_LIT ) '\\u00EF'
			{
			dbg.location(108,2);
			if ( input.LA(1)==RULE_DECIMALS||input.LA(1)==RULE_FLOAT_LIT ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}dbg.location(113,2);
			match(input,63,FOLLOW_63_in_ruleIMAGINARY_LIT380); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(114, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIMAGINARY_LIT");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIMAGINARY_LIT"



	// $ANTLR start "ruleRUNE_LIT"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:117:1: ruleRUNE_LIT : '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\'' ;
	public final void ruleRUNE_LIT() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleRUNE_LIT");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(117, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:117:13: ( '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\'' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:118:2: '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\''
			{
			dbg.location(118,2);
			match(input,62,FOLLOW_62_in_ruleRUNE_LIT390); if (state.failed) return;dbg.location(119,2);
			if ( input.LA(1)==RULE_BYTE_VALUE||input.LA(1)==RULE_UNICODE_VALUE ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}dbg.location(124,2);
			match(input,62,FOLLOW_62_in_ruleRUNE_LIT415); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(125, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleRUNE_LIT");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleRUNE_LIT"



	// $ANTLR start "ruleSTRING_LIT"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:128:1: ruleSTRING_LIT : ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT ) ;
	public final void ruleSTRING_LIT() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSTRING_LIT");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(128, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:128:15: ( ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:
			{
			dbg.location(128,15);
			if ( input.LA(1)==RULE_INTERPRETED_STRING_LIT||input.LA(1)==RULE_RAW_STRING_LIT ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(134, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSTRING_LIT");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSTRING_LIT"



	// $ANTLR start "ruleType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:137:1: ruleType : ( ruleTypeName | ruleTypeLit | '(' ruleType ')' ) ;
	public final void ruleType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(137, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:137:9: ( ( ruleTypeName | ruleTypeLit | '(' ruleType ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:138:2: ( ruleTypeName | ruleTypeLit | '(' ruleType ')' )
			{
			dbg.location(138,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:138:2: ( ruleTypeName | ruleTypeLit | '(' ruleType ')' )
			int alt9=3;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			switch ( input.LA(1) ) {
			case RULE_LETTER:
				{
				alt9=1;
				}
				break;
			case 45:
			case 57:
			case 61:
			case 68:
			case 76:
			case 80:
			case 81:
			case 86:
				{
				alt9=2;
				}
				break;
			case 43:
				{
				alt9=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:139:3: ruleTypeName
					{
					dbg.location(139,3);
					pushFollow(FOLLOW_ruleTypeName_in_ruleType458);
					ruleTypeName();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:141:3: ruleTypeLit
					{
					dbg.location(141,3);
					pushFollow(FOLLOW_ruleTypeLit_in_ruleType470);
					ruleTypeLit();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:143:3: '(' ruleType ')'
					{
					dbg.location(143,3);
					match(input,43,FOLLOW_43_in_ruleType482); if (state.failed) return;dbg.location(144,3);
					pushFollow(FOLLOW_ruleType_in_ruleType486);
					ruleType();
					state._fsp--;
					if (state.failed) return;dbg.location(145,3);
					match(input,44,FOLLOW_44_in_ruleType490); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(9);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(147, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleType"



	// $ANTLR start "ruleTypeName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:150:1: ruleTypeName : ( ruleIDENTIFIER | ruleQualifiedIdent ) ;
	public final void ruleTypeName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(150, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:150:13: ( ( ruleIDENTIFIER | ruleQualifiedIdent ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:151:2: ( ruleIDENTIFIER | ruleQualifiedIdent )
			{
			dbg.location(151,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:151:2: ( ruleIDENTIFIER | ruleQualifiedIdent )
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			try {
				isCyclicDecision = true;
				alt10 = dfa10.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:152:3: ruleIDENTIFIER
					{
					dbg.location(152,3);
					pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleTypeName507);
					ruleIDENTIFIER();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:154:3: ruleQualifiedIdent
					{
					dbg.location(154,3);
					pushFollow(FOLLOW_ruleQualifiedIdent_in_ruleTypeName519);
					ruleQualifiedIdent();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(10);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(156, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeName"



	// $ANTLR start "ruleQualifiedIdent"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:159:1: ruleQualifiedIdent : rulePackageName '.' ruleIDENTIFIER ;
	public final void ruleQualifiedIdent() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleQualifiedIdent");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(159, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:159:19: ( rulePackageName '.' ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:160:2: rulePackageName '.' ruleIDENTIFIER
			{
			dbg.location(160,2);
			pushFollow(FOLLOW_rulePackageName_in_ruleQualifiedIdent532);
			rulePackageName();
			state._fsp--;
			if (state.failed) return;dbg.location(161,2);
			match(input,51,FOLLOW_51_in_ruleQualifiedIdent535); if (state.failed) return;dbg.location(162,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleQualifiedIdent538);
			ruleIDENTIFIER();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(163, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleQualifiedIdent");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleQualifiedIdent"



	// $ANTLR start "rulePackageName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:166:1: rulePackageName : ruleIDENTIFIER ;
	public final void rulePackageName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulePackageName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(166, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:166:16: ( ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:167:2: ruleIDENTIFIER
			{
			dbg.location(167,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_rulePackageName548);
			ruleIDENTIFIER();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(168, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulePackageName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulePackageName"



	// $ANTLR start "ruleTypeLit"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:171:1: ruleTypeLit : ( ruleArrayType | ruleStructType | rulePointerType | ruleFunctionType | ruleInterfaceType | ruleSliceType | ruleMapType | ruleChannelType ) ;
	public final void ruleTypeLit() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeLit");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(171, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:171:12: ( ( ruleArrayType | ruleStructType | rulePointerType | ruleFunctionType | ruleInterfaceType | ruleSliceType | ruleMapType | ruleChannelType ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:172:2: ( ruleArrayType | ruleStructType | rulePointerType | ruleFunctionType | ruleInterfaceType | ruleSliceType | ruleMapType | ruleChannelType )
			{
			dbg.location(172,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:172:2: ( ruleArrayType | ruleStructType | rulePointerType | ruleFunctionType | ruleInterfaceType | ruleSliceType | ruleMapType | ruleChannelType )
			int alt11=8;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			switch ( input.LA(1) ) {
			case 61:
				{
				int LA11_1 = input.LA(2);
				if ( (LA11_1==64) ) {
					alt11=6;
				}
				else if ( (LA11_1==RULE_DECIMALS||LA11_1==RULE_FLOAT_LIT||(LA11_1 >= RULE_INT_LIT && LA11_1 <= RULE_LETTER)||(LA11_1 >= RULE_STRING && LA11_1 <= RULE_UNARY_OP)||LA11_1==43||LA11_1==45||LA11_1==57||(LA11_1 >= 61 && LA11_1 <= 62)||LA11_1==68||LA11_1==76||(LA11_1 >= 80 && LA11_1 <= 81)||LA11_1==86) ) {
					alt11=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 86:
				{
				alt11=2;
				}
				break;
			case 45:
				{
				alt11=3;
				}
				break;
			case 76:
				{
				alt11=4;
				}
				break;
			case 80:
				{
				alt11=5;
				}
				break;
			case 81:
				{
				alt11=7;
				}
				break;
			case 57:
			case 68:
				{
				alt11=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:173:3: ruleArrayType
					{
					dbg.location(173,3);
					pushFollow(FOLLOW_ruleArrayType_in_ruleTypeLit562);
					ruleArrayType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:175:3: ruleStructType
					{
					dbg.location(175,3);
					pushFollow(FOLLOW_ruleStructType_in_ruleTypeLit574);
					ruleStructType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:177:3: rulePointerType
					{
					dbg.location(177,3);
					pushFollow(FOLLOW_rulePointerType_in_ruleTypeLit586);
					rulePointerType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:179:3: ruleFunctionType
					{
					dbg.location(179,3);
					pushFollow(FOLLOW_ruleFunctionType_in_ruleTypeLit598);
					ruleFunctionType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:181:3: ruleInterfaceType
					{
					dbg.location(181,3);
					pushFollow(FOLLOW_ruleInterfaceType_in_ruleTypeLit610);
					ruleInterfaceType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:183:3: ruleSliceType
					{
					dbg.location(183,3);
					pushFollow(FOLLOW_ruleSliceType_in_ruleTypeLit622);
					ruleSliceType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:185:3: ruleMapType
					{
					dbg.location(185,3);
					pushFollow(FOLLOW_ruleMapType_in_ruleTypeLit634);
					ruleMapType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:187:3: ruleChannelType
					{
					dbg.location(187,3);
					pushFollow(FOLLOW_ruleChannelType_in_ruleTypeLit646);
					ruleChannelType();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(11);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(189, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeLit");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeLit"



	// $ANTLR start "ruleArrayType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:192:1: ruleArrayType : '[' ruleArrayLength ']' ruleElementType ;
	public final void ruleArrayType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleArrayType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(192, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:192:14: ( '[' ruleArrayLength ']' ruleElementType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:193:2: '[' ruleArrayLength ']' ruleElementType
			{
			dbg.location(193,2);
			match(input,61,FOLLOW_61_in_ruleArrayType659); if (state.failed) return;dbg.location(194,2);
			pushFollow(FOLLOW_ruleArrayLength_in_ruleArrayType662);
			ruleArrayLength();
			state._fsp--;
			if (state.failed) return;dbg.location(195,2);
			match(input,64,FOLLOW_64_in_ruleArrayType665); if (state.failed) return;dbg.location(196,2);
			pushFollow(FOLLOW_ruleElementType_in_ruleArrayType668);
			ruleElementType();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(197, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleArrayType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleArrayType"



	// $ANTLR start "ruleArrayLength"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:200:1: ruleArrayLength : ruleExpression ;
	public final void ruleArrayLength() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleArrayLength");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(200, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:200:16: ( ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:201:2: ruleExpression
			{
			dbg.location(201,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleArrayLength678);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(202, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleArrayLength");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleArrayLength"



	// $ANTLR start "ruleElementType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:205:1: ruleElementType : ruleType ;
	public final void ruleElementType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleElementType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(205, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:205:16: ( ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:206:2: ruleType
			{
			dbg.location(206,2);
			pushFollow(FOLLOW_ruleType_in_ruleElementType688);
			ruleType();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(207, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleElementType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleElementType"



	// $ANTLR start "ruleSliceType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:210:1: ruleSliceType : '[' ']' ruleElementType ;
	public final void ruleSliceType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSliceType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(210, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:210:14: ( '[' ']' ruleElementType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:211:2: '[' ']' ruleElementType
			{
			dbg.location(211,2);
			match(input,61,FOLLOW_61_in_ruleSliceType698); if (state.failed) return;dbg.location(212,2);
			match(input,64,FOLLOW_64_in_ruleSliceType701); if (state.failed) return;dbg.location(213,2);
			pushFollow(FOLLOW_ruleElementType_in_ruleSliceType704);
			ruleElementType();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(214, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSliceType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSliceType"



	// $ANTLR start "ruleStructType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:217:1: ruleStructType : 'struct' '{' ( ruleFieldDecl ';' )* '}' ;
	public final void ruleStructType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleStructType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(217, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:217:15: ( 'struct' '{' ( ruleFieldDecl ';' )* '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:218:2: 'struct' '{' ( ruleFieldDecl ';' )* '}'
			{
			dbg.location(218,2);
			match(input,86,FOLLOW_86_in_ruleStructType714); if (state.failed) return;dbg.location(219,2);
			match(input,90,FOLLOW_90_in_ruleStructType717); if (state.failed) return;dbg.location(220,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:220:2: ( ruleFieldDecl ';' )*
			try { dbg.enterSubRule(12);

			loop12:
			while (true) {
				int alt12=2;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				int LA12_0 = input.LA(1);
				if ( (LA12_0==RULE_LETTER||LA12_0==45) ) {
					alt12=1;
				}

				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:221:3: ruleFieldDecl ';'
					{
					dbg.location(221,3);
					pushFollow(FOLLOW_ruleFieldDecl_in_ruleStructType724);
					ruleFieldDecl();
					state._fsp--;
					if (state.failed) return;dbg.location(222,3);
					match(input,56,FOLLOW_56_in_ruleStructType728); if (state.failed) return;
					}
					break;

				default :
					break loop12;
				}
			}
			} finally {dbg.exitSubRule(12);}
			dbg.location(224,2);
			match(input,92,FOLLOW_92_in_ruleStructType735); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(225, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleStructType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleStructType"



	// $ANTLR start "ruleFieldDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:228:1: ruleFieldDecl : ( ruleIdentifierList ruleType | ruleEmbeddedField ) ( ruleTag )? ;
	public final void ruleFieldDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFieldDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(228, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:228:14: ( ( ruleIdentifierList ruleType | ruleEmbeddedField ) ( ruleTag )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:229:2: ( ruleIdentifierList ruleType | ruleEmbeddedField ) ( ruleTag )?
			{
			dbg.location(229,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:229:2: ( ruleIdentifierList ruleType | ruleEmbeddedField )
			int alt13=2;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			try {
				isCyclicDecision = true;
				alt13 = dfa13.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:230:3: ruleIdentifierList ruleType
					{
					dbg.location(230,3);
					pushFollow(FOLLOW_ruleIdentifierList_in_ruleFieldDecl749);
					ruleIdentifierList();
					state._fsp--;
					if (state.failed) return;dbg.location(231,3);
					pushFollow(FOLLOW_ruleType_in_ruleFieldDecl753);
					ruleType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:233:3: ruleEmbeddedField
					{
					dbg.location(233,3);
					pushFollow(FOLLOW_ruleEmbeddedField_in_ruleFieldDecl765);
					ruleEmbeddedField();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(13);}
			dbg.location(235,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:235:2: ( ruleTag )?
			int alt14=2;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==RULE_INTERPRETED_STRING_LIT||LA14_0==RULE_RAW_STRING_LIT) ) {
				alt14=1;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:235:2: ruleTag
					{
					dbg.location(235,2);
					pushFollow(FOLLOW_ruleTag_in_ruleFieldDecl771);
					ruleTag();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(14);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(237, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFieldDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFieldDecl"



	// $ANTLR start "ruleIdentifierList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:240:1: ruleIdentifierList : ruleIDENTIFIER ( ',' ruleIDENTIFIER )* ;
	public final void ruleIdentifierList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIdentifierList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(240, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:240:19: ( ruleIDENTIFIER ( ',' ruleIDENTIFIER )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:241:2: ruleIDENTIFIER ( ',' ruleIDENTIFIER )*
			{
			dbg.location(241,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleIdentifierList784);
			ruleIDENTIFIER();
			state._fsp--;
			if (state.failed) return;dbg.location(242,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:242:2: ( ',' ruleIDENTIFIER )*
			try { dbg.enterSubRule(15);

			loop15:
			while (true) {
				int alt15=2;
				try { dbg.enterDecision(15, decisionCanBacktrack[15]);

				int LA15_0 = input.LA(1);
				if ( (LA15_0==48) ) {
					int LA15_2 = input.LA(2);
					if ( (LA15_2==RULE_LETTER) ) {
						int LA15_3 = input.LA(3);
						if ( (synpred37_DebugInternalGo()) ) {
							alt15=1;
						}

					}

				}

				} finally {dbg.exitDecision(15);}

				switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:243:3: ',' ruleIDENTIFIER
					{
					dbg.location(243,3);
					match(input,48,FOLLOW_48_in_ruleIdentifierList791); if (state.failed) return;dbg.location(244,3);
					pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleIdentifierList795);
					ruleIDENTIFIER();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop15;
				}
			}
			} finally {dbg.exitSubRule(15);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(246, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIdentifierList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIdentifierList"



	// $ANTLR start "ruleEmbeddedField"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:249:1: ruleEmbeddedField : ( '*' )? ruleTypeName ;
	public final void ruleEmbeddedField() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleEmbeddedField");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(249, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:249:18: ( ( '*' )? ruleTypeName )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:250:2: ( '*' )? ruleTypeName
			{
			dbg.location(250,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:250:2: ( '*' )?
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==45) ) {
				alt16=1;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:250:2: '*'
					{
					dbg.location(250,2);
					match(input,45,FOLLOW_45_in_ruleEmbeddedField809); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(16);}
			dbg.location(251,2);
			pushFollow(FOLLOW_ruleTypeName_in_ruleEmbeddedField813);
			ruleTypeName();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(252, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleEmbeddedField");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleEmbeddedField"



	// $ANTLR start "ruleTag"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:255:1: ruleTag : ruleSTRING_LIT ;
	public final void ruleTag() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTag");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(255, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:255:8: ( ruleSTRING_LIT )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:256:2: ruleSTRING_LIT
			{
			dbg.location(256,2);
			pushFollow(FOLLOW_ruleSTRING_LIT_in_ruleTag823);
			ruleSTRING_LIT();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(257, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTag");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTag"



	// $ANTLR start "rulePointerType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:260:1: rulePointerType : '*' ruleBaseType ;
	public final void rulePointerType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulePointerType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(260, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:260:16: ( '*' ruleBaseType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:261:2: '*' ruleBaseType
			{
			dbg.location(261,2);
			match(input,45,FOLLOW_45_in_rulePointerType833); if (state.failed) return;dbg.location(262,2);
			pushFollow(FOLLOW_ruleBaseType_in_rulePointerType836);
			ruleBaseType();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(263, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulePointerType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulePointerType"



	// $ANTLR start "ruleBaseType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:266:1: ruleBaseType : ruleType ;
	public final void ruleBaseType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleBaseType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(266, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:266:13: ( ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:267:2: ruleType
			{
			dbg.location(267,2);
			pushFollow(FOLLOW_ruleType_in_ruleBaseType846);
			ruleType();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(268, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleBaseType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleBaseType"



	// $ANTLR start "ruleFunctionType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:271:1: ruleFunctionType : 'func' ruleSignature ;
	public final void ruleFunctionType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFunctionType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(271, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:271:17: ( 'func' ruleSignature )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:272:2: 'func' ruleSignature
			{
			dbg.location(272,2);
			match(input,76,FOLLOW_76_in_ruleFunctionType856); if (state.failed) return;dbg.location(273,2);
			pushFollow(FOLLOW_ruleSignature_in_ruleFunctionType859);
			ruleSignature();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(274, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFunctionType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFunctionType"



	// $ANTLR start "ruleSignature"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:277:1: ruleSignature : ruleParameters ( ruleResult )? ;
	public final void ruleSignature() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSignature");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(277, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:277:14: ( ruleParameters ( ruleResult )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:278:2: ruleParameters ( ruleResult )?
			{
			dbg.location(278,2);
			pushFollow(FOLLOW_ruleParameters_in_ruleSignature869);
			ruleParameters();
			state._fsp--;
			if (state.failed) return;dbg.location(279,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:279:2: ( ruleResult )?
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			switch ( input.LA(1) ) {
				case 43:
					{
					int LA17_1 = input.LA(2);
					if ( (synpred39_DebugInternalGo()) ) {
						alt17=1;
					}
					}
					break;
				case RULE_LETTER:
					{
					int LA17_2 = input.LA(2);
					if ( (synpred39_DebugInternalGo()) ) {
						alt17=1;
					}
					}
					break;
				case 61:
					{
					int LA17_3 = input.LA(2);
					if ( (synpred39_DebugInternalGo()) ) {
						alt17=1;
					}
					}
					break;
				case 86:
					{
					int LA17_4 = input.LA(2);
					if ( (synpred39_DebugInternalGo()) ) {
						alt17=1;
					}
					}
					break;
				case 45:
					{
					int LA17_5 = input.LA(2);
					if ( (synpred39_DebugInternalGo()) ) {
						alt17=1;
					}
					}
					break;
				case 76:
					{
					int LA17_6 = input.LA(2);
					if ( (synpred39_DebugInternalGo()) ) {
						alt17=1;
					}
					}
					break;
				case 80:
					{
					int LA17_7 = input.LA(2);
					if ( (synpred39_DebugInternalGo()) ) {
						alt17=1;
					}
					}
					break;
				case 81:
					{
					int LA17_8 = input.LA(2);
					if ( (synpred39_DebugInternalGo()) ) {
						alt17=1;
					}
					}
					break;
				case 68:
					{
					int LA17_9 = input.LA(2);
					if ( (synpred39_DebugInternalGo()) ) {
						alt17=1;
					}
					}
					break;
				case 57:
					{
					int LA17_10 = input.LA(2);
					if ( (synpred39_DebugInternalGo()) ) {
						alt17=1;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:279:2: ruleResult
					{
					dbg.location(279,2);
					pushFollow(FOLLOW_ruleResult_in_ruleSignature872);
					ruleResult();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(17);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(281, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSignature");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSignature"



	// $ANTLR start "ruleResult"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:284:1: ruleResult : ( ruleParameters | ruleType ) ;
	public final void ruleResult() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleResult");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(284, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:284:11: ( ( ruleParameters | ruleType ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:285:2: ( ruleParameters | ruleType )
			{
			dbg.location(285,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:285:2: ( ruleParameters | ruleType )
			int alt18=2;
			try { dbg.enterSubRule(18);
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==43) ) {
				int LA18_1 = input.LA(2);
				if ( (synpred40_DebugInternalGo()) ) {
					alt18=1;
				}
				else if ( (true) ) {
					alt18=2;
				}

			}
			else if ( (LA18_0==RULE_LETTER||LA18_0==45||LA18_0==57||LA18_0==61||LA18_0==68||LA18_0==76||(LA18_0 >= 80 && LA18_0 <= 81)||LA18_0==86) ) {
				alt18=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:286:3: ruleParameters
					{
					dbg.location(286,3);
					pushFollow(FOLLOW_ruleParameters_in_ruleResult889);
					ruleParameters();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:288:3: ruleType
					{
					dbg.location(288,3);
					pushFollow(FOLLOW_ruleType_in_ruleResult901);
					ruleType();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(18);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(290, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleResult");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleResult"



	// $ANTLR start "ruleParameters"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:293:1: ruleParameters : '(' ( ruleParameterList )? ')' ;
	public final void ruleParameters() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleParameters");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(293, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:293:15: ( '(' ( ruleParameterList )? ')' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:294:2: '(' ( ruleParameterList )? ')'
			{
			dbg.location(294,2);
			match(input,43,FOLLOW_43_in_ruleParameters914); if (state.failed) return;dbg.location(295,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:295:2: ( ruleParameterList )?
			int alt19=2;
			try { dbg.enterSubRule(19);
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==RULE_LETTER||LA19_0==43||LA19_0==45||LA19_0==48||LA19_0==52||LA19_0==57||LA19_0==61||LA19_0==68||LA19_0==76||(LA19_0 >= 80 && LA19_0 <= 81)||LA19_0==86) ) {
				alt19=1;
			}
			else if ( (LA19_0==44) ) {
				int LA19_2 = input.LA(2);
				if ( (synpred41_DebugInternalGo()) ) {
					alt19=1;
				}
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:295:2: ruleParameterList
					{
					dbg.location(295,2);
					pushFollow(FOLLOW_ruleParameterList_in_ruleParameters917);
					ruleParameterList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(19);}
			dbg.location(297,2);
			match(input,44,FOLLOW_44_in_ruleParameters923); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(298, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleParameters");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleParameters"



	// $ANTLR start "ruleParameterList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:301:1: ruleParameterList : ruleParameterDecl ( ',' ruleParameterDecl )* ;
	public final void ruleParameterList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleParameterList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(301, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:301:18: ( ruleParameterDecl ( ',' ruleParameterDecl )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:302:2: ruleParameterDecl ( ',' ruleParameterDecl )*
			{
			dbg.location(302,2);
			pushFollow(FOLLOW_ruleParameterDecl_in_ruleParameterList933);
			ruleParameterDecl();
			state._fsp--;
			if (state.failed) return;dbg.location(303,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:303:2: ( ',' ruleParameterDecl )*
			try { dbg.enterSubRule(20);

			loop20:
			while (true) {
				int alt20=2;
				try { dbg.enterDecision(20, decisionCanBacktrack[20]);

				int LA20_0 = input.LA(1);
				if ( (LA20_0==48) ) {
					alt20=1;
				}

				} finally {dbg.exitDecision(20);}

				switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:304:3: ',' ruleParameterDecl
					{
					dbg.location(304,3);
					match(input,48,FOLLOW_48_in_ruleParameterList940); if (state.failed) return;dbg.location(305,3);
					pushFollow(FOLLOW_ruleParameterDecl_in_ruleParameterList944);
					ruleParameterDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop20;
				}
			}
			} finally {dbg.exitSubRule(20);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(307, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleParameterList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleParameterList"



	// $ANTLR start "ruleParameterDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:310:1: ruleParameterDecl : ( ruleIdentifierList )? ( '...' )? ( ruleType )? ;
	public final void ruleParameterDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleParameterDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(310, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:310:18: ( ( ruleIdentifierList )? ( '...' )? ( ruleType )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:311:2: ( ruleIdentifierList )? ( '...' )? ( ruleType )?
			{
			dbg.location(311,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:311:2: ( ruleIdentifierList )?
			int alt21=2;
			try { dbg.enterSubRule(21);
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			int LA21_0 = input.LA(1);
			if ( (LA21_0==RULE_LETTER) ) {
				int LA21_1 = input.LA(2);
				if ( (synpred43_DebugInternalGo()) ) {
					alt21=1;
				}
			}
			} finally {dbg.exitDecision(21);}

			switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:311:2: ruleIdentifierList
					{
					dbg.location(311,2);
					pushFollow(FOLLOW_ruleIdentifierList_in_ruleParameterDecl958);
					ruleIdentifierList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(21);}
			dbg.location(313,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:313:2: ( '...' )?
			int alt22=2;
			try { dbg.enterSubRule(22);
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==52) ) {
				alt22=1;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:313:2: '...'
					{
					dbg.location(313,2);
					match(input,52,FOLLOW_52_in_ruleParameterDecl964); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(22);}
			dbg.location(314,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:314:2: ( ruleType )?
			int alt23=2;
			try { dbg.enterSubRule(23);
			try { dbg.enterDecision(23, decisionCanBacktrack[23]);

			int LA23_0 = input.LA(1);
			if ( (LA23_0==RULE_LETTER||LA23_0==43||LA23_0==45||LA23_0==57||LA23_0==61||LA23_0==68||LA23_0==76||(LA23_0 >= 80 && LA23_0 <= 81)||LA23_0==86) ) {
				alt23=1;
			}
			} finally {dbg.exitDecision(23);}

			switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:314:2: ruleType
					{
					dbg.location(314,2);
					pushFollow(FOLLOW_ruleType_in_ruleParameterDecl968);
					ruleType();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(23);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(316, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleParameterDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleParameterDecl"



	// $ANTLR start "ruleInterfaceType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:319:1: ruleInterfaceType : 'interface' '{' ( ruleMethodSpec ';' )* '}' ;
	public final void ruleInterfaceType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleInterfaceType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(319, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:319:18: ( 'interface' '{' ( ruleMethodSpec ';' )* '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:320:2: 'interface' '{' ( ruleMethodSpec ';' )* '}'
			{
			dbg.location(320,2);
			match(input,80,FOLLOW_80_in_ruleInterfaceType981); if (state.failed) return;dbg.location(321,2);
			match(input,90,FOLLOW_90_in_ruleInterfaceType984); if (state.failed) return;dbg.location(322,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:322:2: ( ruleMethodSpec ';' )*
			try { dbg.enterSubRule(24);

			loop24:
			while (true) {
				int alt24=2;
				try { dbg.enterDecision(24, decisionCanBacktrack[24]);

				int LA24_0 = input.LA(1);
				if ( (LA24_0==RULE_LETTER) ) {
					alt24=1;
				}

				} finally {dbg.exitDecision(24);}

				switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:323:3: ruleMethodSpec ';'
					{
					dbg.location(323,3);
					pushFollow(FOLLOW_ruleMethodSpec_in_ruleInterfaceType991);
					ruleMethodSpec();
					state._fsp--;
					if (state.failed) return;dbg.location(324,3);
					match(input,56,FOLLOW_56_in_ruleInterfaceType995); if (state.failed) return;
					}
					break;

				default :
					break loop24;
				}
			}
			} finally {dbg.exitSubRule(24);}
			dbg.location(326,2);
			match(input,92,FOLLOW_92_in_ruleInterfaceType1002); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(327, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleInterfaceType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleInterfaceType"



	// $ANTLR start "ruleMethodSpec"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:330:1: ruleMethodSpec : ( ruleMethodName ruleSignature | ruleInterfaceTypeName ) ;
	public final void ruleMethodSpec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleMethodSpec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(330, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:330:15: ( ( ruleMethodName ruleSignature | ruleInterfaceTypeName ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:331:2: ( ruleMethodName ruleSignature | ruleInterfaceTypeName )
			{
			dbg.location(331,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:331:2: ( ruleMethodName ruleSignature | ruleInterfaceTypeName )
			int alt25=2;
			try { dbg.enterSubRule(25);
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			try {
				isCyclicDecision = true;
				alt25 = dfa25.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:332:3: ruleMethodName ruleSignature
					{
					dbg.location(332,3);
					pushFollow(FOLLOW_ruleMethodName_in_ruleMethodSpec1016);
					ruleMethodName();
					state._fsp--;
					if (state.failed) return;dbg.location(333,3);
					pushFollow(FOLLOW_ruleSignature_in_ruleMethodSpec1020);
					ruleSignature();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:335:3: ruleInterfaceTypeName
					{
					dbg.location(335,3);
					pushFollow(FOLLOW_ruleInterfaceTypeName_in_ruleMethodSpec1032);
					ruleInterfaceTypeName();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(25);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(337, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleMethodSpec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleMethodSpec"



	// $ANTLR start "ruleMethodName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:340:1: ruleMethodName : ruleIDENTIFIER ;
	public final void ruleMethodName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleMethodName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(340, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:340:15: ( ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:341:2: ruleIDENTIFIER
			{
			dbg.location(341,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleMethodName1045);
			ruleIDENTIFIER();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(342, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleMethodName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleMethodName"



	// $ANTLR start "ruleInterfaceTypeName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:345:1: ruleInterfaceTypeName : ruleTypeName ;
	public final void ruleInterfaceTypeName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleInterfaceTypeName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(345, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:345:22: ( ruleTypeName )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:346:2: ruleTypeName
			{
			dbg.location(346,2);
			pushFollow(FOLLOW_ruleTypeName_in_ruleInterfaceTypeName1055);
			ruleTypeName();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(347, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleInterfaceTypeName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleInterfaceTypeName"



	// $ANTLR start "ruleMapType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:350:1: ruleMapType : 'map' '[' ruleKeyType ']' ruleElementType ;
	public final void ruleMapType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleMapType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(350, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:350:12: ( 'map' '[' ruleKeyType ']' ruleElementType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:351:2: 'map' '[' ruleKeyType ']' ruleElementType
			{
			dbg.location(351,2);
			match(input,81,FOLLOW_81_in_ruleMapType1065); if (state.failed) return;dbg.location(352,2);
			match(input,61,FOLLOW_61_in_ruleMapType1068); if (state.failed) return;dbg.location(353,2);
			pushFollow(FOLLOW_ruleKeyType_in_ruleMapType1071);
			ruleKeyType();
			state._fsp--;
			if (state.failed) return;dbg.location(354,2);
			match(input,64,FOLLOW_64_in_ruleMapType1074); if (state.failed) return;dbg.location(355,2);
			pushFollow(FOLLOW_ruleElementType_in_ruleMapType1077);
			ruleElementType();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(356, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleMapType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleMapType"



	// $ANTLR start "ruleKeyType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:359:1: ruleKeyType : ruleType ;
	public final void ruleKeyType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleKeyType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(359, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:359:12: ( ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:360:2: ruleType
			{
			dbg.location(360,2);
			pushFollow(FOLLOW_ruleType_in_ruleKeyType1087);
			ruleType();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(361, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleKeyType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleKeyType"



	// $ANTLR start "ruleChannelType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:364:1: ruleChannelType : ( 'chan' ( '<-' )? | '<-' 'chan' ) ruleElementType ;
	public final void ruleChannelType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleChannelType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(364, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:364:16: ( ( 'chan' ( '<-' )? | '<-' 'chan' ) ruleElementType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:365:2: ( 'chan' ( '<-' )? | '<-' 'chan' ) ruleElementType
			{
			dbg.location(365,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:365:2: ( 'chan' ( '<-' )? | '<-' 'chan' )
			int alt27=2;
			try { dbg.enterSubRule(27);
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			int LA27_0 = input.LA(1);
			if ( (LA27_0==68) ) {
				alt27=1;
			}
			else if ( (LA27_0==57) ) {
				alt27=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:366:3: 'chan' ( '<-' )?
					{
					dbg.location(366,3);
					match(input,68,FOLLOW_68_in_ruleChannelType1101); if (state.failed) return;dbg.location(367,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:367:3: ( '<-' )?
					int alt26=2;
					try { dbg.enterSubRule(26);
					try { dbg.enterDecision(26, decisionCanBacktrack[26]);

					int LA26_0 = input.LA(1);
					if ( (LA26_0==57) ) {
						int LA26_1 = input.LA(2);
						if ( (synpred48_DebugInternalGo()) ) {
							alt26=1;
						}
					}
					} finally {dbg.exitDecision(26);}

					switch (alt26) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:367:3: '<-'
							{
							dbg.location(367,3);
							match(input,57,FOLLOW_57_in_ruleChannelType1105); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(26);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:369:3: '<-' 'chan'
					{
					dbg.location(369,3);
					match(input,57,FOLLOW_57_in_ruleChannelType1118); if (state.failed) return;dbg.location(370,3);
					match(input,68,FOLLOW_68_in_ruleChannelType1122); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(27);}
			dbg.location(372,2);
			pushFollow(FOLLOW_ruleElementType_in_ruleChannelType1128);
			ruleElementType();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(373, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleChannelType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleChannelType"



	// $ANTLR start "ruleBlock"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:376:1: ruleBlock : '{' ruleStatementList '}' ;
	public final void ruleBlock() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(376, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:376:10: ( '{' ruleStatementList '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:377:2: '{' ruleStatementList '}'
			{
			dbg.location(377,2);
			match(input,90,FOLLOW_90_in_ruleBlock1138); if (state.failed) return;dbg.location(378,2);
			pushFollow(FOLLOW_ruleStatementList_in_ruleBlock1141);
			ruleStatementList();
			state._fsp--;
			if (state.failed) return;dbg.location(379,2);
			match(input,92,FOLLOW_92_in_ruleBlock1144); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(380, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleBlock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleBlock"



	// $ANTLR start "ruleStatementList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:383:1: ruleStatementList : ( ruleStatement ( ';' )? )* ;
	public final void ruleStatementList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleStatementList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(383, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:383:18: ( ( ruleStatement ( ';' )? )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:384:2: ( ruleStatement ( ';' )? )*
			{
			dbg.location(384,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:384:2: ( ruleStatement ( ';' )? )*
			try { dbg.enterSubRule(29);

			loop29:
			while (true) {
				int alt29=2;
				try { dbg.enterDecision(29, decisionCanBacktrack[29]);

				int LA29_0 = input.LA(1);
				if ( (LA29_0==RULE_DECIMALS||LA29_0==RULE_FLOAT_LIT||(LA29_0 >= RULE_INT_LIT && LA29_0 <= RULE_LETTER)||(LA29_0 >= RULE_STRING && LA29_0 <= RULE_UNARY_OP)||LA29_0==43||LA29_0==45||(LA29_0 >= 56 && LA29_0 <= 57)||(LA29_0 >= 61 && LA29_0 <= 62)||LA29_0==66||(LA29_0 >= 68 && LA29_0 <= 70)||LA29_0==72||(LA29_0 >= 74 && LA29_0 <= 78)||(LA29_0 >= 80 && LA29_0 <= 81)||(LA29_0 >= 84 && LA29_0 <= 90)) ) {
					alt29=1;
				}

				} finally {dbg.exitDecision(29);}

				switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:385:3: ruleStatement ( ';' )?
					{
					dbg.location(385,3);
					pushFollow(FOLLOW_ruleStatement_in_ruleStatementList1158);
					ruleStatement();
					state._fsp--;
					if (state.failed) return;dbg.location(386,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:386:3: ( ';' )?
					int alt28=2;
					try { dbg.enterSubRule(28);
					try { dbg.enterDecision(28, decisionCanBacktrack[28]);

					int LA28_0 = input.LA(1);
					if ( (LA28_0==56) ) {
						int LA28_1 = input.LA(2);
						if ( (synpred50_DebugInternalGo()) ) {
							alt28=1;
						}
					}
					} finally {dbg.exitDecision(28);}

					switch (alt28) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:386:3: ';'
							{
							dbg.location(386,3);
							match(input,56,FOLLOW_56_in_ruleStatementList1162); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(28);}

					}
					break;

				default :
					break loop29;
				}
			}
			} finally {dbg.exitSubRule(29);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(388, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleStatementList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleStatementList"



	// $ANTLR start "ruleStatement"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:391:1: ruleStatement : ( ruleDeclaration | ruleLabeledStmt | ruleSimpleStmt | ruleGoStmt | ruleReturnStmt | ruleBreakStmt | ruleContinueStmt | ruleGotoStmt | ruleFallthroughStmt | ruleBlock | ruleIfStmt | ruleSwitchStmt | ruleSelectStmt | ruleForStmt | ruleDeferStmt ) ;
	public final void ruleStatement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleStatement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(391, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:391:14: ( ( ruleDeclaration | ruleLabeledStmt | ruleSimpleStmt | ruleGoStmt | ruleReturnStmt | ruleBreakStmt | ruleContinueStmt | ruleGotoStmt | ruleFallthroughStmt | ruleBlock | ruleIfStmt | ruleSwitchStmt | ruleSelectStmt | ruleForStmt | ruleDeferStmt ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:392:2: ( ruleDeclaration | ruleLabeledStmt | ruleSimpleStmt | ruleGoStmt | ruleReturnStmt | ruleBreakStmt | ruleContinueStmt | ruleGotoStmt | ruleFallthroughStmt | ruleBlock | ruleIfStmt | ruleSwitchStmt | ruleSelectStmt | ruleForStmt | ruleDeferStmt )
			{
			dbg.location(392,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:392:2: ( ruleDeclaration | ruleLabeledStmt | ruleSimpleStmt | ruleGoStmt | ruleReturnStmt | ruleBreakStmt | ruleContinueStmt | ruleGotoStmt | ruleFallthroughStmt | ruleBlock | ruleIfStmt | ruleSwitchStmt | ruleSelectStmt | ruleForStmt | ruleDeferStmt )
			int alt30=15;
			try { dbg.enterSubRule(30);
			try { dbg.enterDecision(30, decisionCanBacktrack[30]);

			try {
				isCyclicDecision = true;
				alt30 = dfa30.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(30);}

			switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:393:3: ruleDeclaration
					{
					dbg.location(393,3);
					pushFollow(FOLLOW_ruleDeclaration_in_ruleStatement1181);
					ruleDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:395:3: ruleLabeledStmt
					{
					dbg.location(395,3);
					pushFollow(FOLLOW_ruleLabeledStmt_in_ruleStatement1193);
					ruleLabeledStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:397:3: ruleSimpleStmt
					{
					dbg.location(397,3);
					pushFollow(FOLLOW_ruleSimpleStmt_in_ruleStatement1205);
					ruleSimpleStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:399:3: ruleGoStmt
					{
					dbg.location(399,3);
					pushFollow(FOLLOW_ruleGoStmt_in_ruleStatement1217);
					ruleGoStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:401:3: ruleReturnStmt
					{
					dbg.location(401,3);
					pushFollow(FOLLOW_ruleReturnStmt_in_ruleStatement1229);
					ruleReturnStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:403:3: ruleBreakStmt
					{
					dbg.location(403,3);
					pushFollow(FOLLOW_ruleBreakStmt_in_ruleStatement1241);
					ruleBreakStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:405:3: ruleContinueStmt
					{
					dbg.location(405,3);
					pushFollow(FOLLOW_ruleContinueStmt_in_ruleStatement1253);
					ruleContinueStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:407:3: ruleGotoStmt
					{
					dbg.location(407,3);
					pushFollow(FOLLOW_ruleGotoStmt_in_ruleStatement1265);
					ruleGotoStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:409:3: ruleFallthroughStmt
					{
					dbg.location(409,3);
					pushFollow(FOLLOW_ruleFallthroughStmt_in_ruleStatement1277);
					ruleFallthroughStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:411:3: ruleBlock
					{
					dbg.location(411,3);
					pushFollow(FOLLOW_ruleBlock_in_ruleStatement1289);
					ruleBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					dbg.enterAlt(11);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:413:3: ruleIfStmt
					{
					dbg.location(413,3);
					pushFollow(FOLLOW_ruleIfStmt_in_ruleStatement1301);
					ruleIfStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					dbg.enterAlt(12);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:415:3: ruleSwitchStmt
					{
					dbg.location(415,3);
					pushFollow(FOLLOW_ruleSwitchStmt_in_ruleStatement1313);
					ruleSwitchStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					dbg.enterAlt(13);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:417:3: ruleSelectStmt
					{
					dbg.location(417,3);
					pushFollow(FOLLOW_ruleSelectStmt_in_ruleStatement1325);
					ruleSelectStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 14 :
					dbg.enterAlt(14);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:419:3: ruleForStmt
					{
					dbg.location(419,3);
					pushFollow(FOLLOW_ruleForStmt_in_ruleStatement1337);
					ruleForStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 15 :
					dbg.enterAlt(15);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:421:3: ruleDeferStmt
					{
					dbg.location(421,3);
					pushFollow(FOLLOW_ruleDeferStmt_in_ruleStatement1349);
					ruleDeferStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(30);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(423, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleStatement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleStatement"



	// $ANTLR start "ruleDeclaration"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:426:1: ruleDeclaration : ( ruleConstDecl | ruleTypeDecl | ruleVarDecl ) ;
	public final void ruleDeclaration() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleDeclaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(426, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:426:16: ( ( ruleConstDecl | ruleTypeDecl | ruleVarDecl ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:427:2: ( ruleConstDecl | ruleTypeDecl | ruleVarDecl )
			{
			dbg.location(427,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:427:2: ( ruleConstDecl | ruleTypeDecl | ruleVarDecl )
			int alt31=3;
			try { dbg.enterSubRule(31);
			try { dbg.enterDecision(31, decisionCanBacktrack[31]);

			switch ( input.LA(1) ) {
			case 69:
				{
				alt31=1;
				}
				break;
			case 88:
				{
				alt31=2;
				}
				break;
			case 89:
				{
				alt31=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(31);}

			switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:428:3: ruleConstDecl
					{
					dbg.location(428,3);
					pushFollow(FOLLOW_ruleConstDecl_in_ruleDeclaration1366);
					ruleConstDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:430:3: ruleTypeDecl
					{
					dbg.location(430,3);
					pushFollow(FOLLOW_ruleTypeDecl_in_ruleDeclaration1378);
					ruleTypeDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:432:3: ruleVarDecl
					{
					dbg.location(432,3);
					pushFollow(FOLLOW_ruleVarDecl_in_ruleDeclaration1390);
					ruleVarDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(31);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(434, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleDeclaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleDeclaration"



	// $ANTLR start "ruleLabeledStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:437:1: ruleLabeledStmt : ruleLabel ':' ruleStatement ;
	public final void ruleLabeledStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleLabeledStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(437, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:437:16: ( ruleLabel ':' ruleStatement )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:438:2: ruleLabel ':' ruleStatement
			{
			dbg.location(438,2);
			pushFollow(FOLLOW_ruleLabel_in_ruleLabeledStmt1403);
			ruleLabel();
			state._fsp--;
			if (state.failed) return;dbg.location(439,2);
			match(input,54,FOLLOW_54_in_ruleLabeledStmt1406); if (state.failed) return;dbg.location(440,2);
			pushFollow(FOLLOW_ruleStatement_in_ruleLabeledStmt1409);
			ruleStatement();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(441, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleLabeledStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleLabeledStmt"



	// $ANTLR start "ruleSimpleStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:444:1: ruleSimpleStmt : ( ruleIncDecStmt | ruleAssignment | ruleSendStmt | ruleShortVarDecl | ruleExpressionStmt | ruleEmptyStmt ) ;
	public final void ruleSimpleStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSimpleStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(444, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:444:15: ( ( ruleIncDecStmt | ruleAssignment | ruleSendStmt | ruleShortVarDecl | ruleExpressionStmt | ruleEmptyStmt ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:445:2: ( ruleIncDecStmt | ruleAssignment | ruleSendStmt | ruleShortVarDecl | ruleExpressionStmt | ruleEmptyStmt )
			{
			dbg.location(445,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:445:2: ( ruleIncDecStmt | ruleAssignment | ruleSendStmt | ruleShortVarDecl | ruleExpressionStmt | ruleEmptyStmt )
			int alt32=6;
			try { dbg.enterSubRule(32);
			try { dbg.enterDecision(32, decisionCanBacktrack[32]);

			switch ( input.LA(1) ) {
			case RULE_INT_LIT:
				{
				int LA32_1 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
					alt32=1;
				}
				else if ( (synpred69_DebugInternalGo()) ) {
					alt32=2;
				}
				else if ( (synpred70_DebugInternalGo()) ) {
					alt32=3;
				}
				else if ( (synpred72_DebugInternalGo()) ) {
					alt32=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RULE_FLOAT_LIT:
				{
				int LA32_2 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
					alt32=1;
				}
				else if ( (synpred69_DebugInternalGo()) ) {
					alt32=2;
				}
				else if ( (synpred70_DebugInternalGo()) ) {
					alt32=3;
				}
				else if ( (synpred72_DebugInternalGo()) ) {
					alt32=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RULE_DECIMALS:
				{
				int LA32_3 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
					alt32=1;
				}
				else if ( (synpred69_DebugInternalGo()) ) {
					alt32=2;
				}
				else if ( (synpred70_DebugInternalGo()) ) {
					alt32=3;
				}
				else if ( (synpred72_DebugInternalGo()) ) {
					alt32=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 3, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 62:
				{
				int LA32_4 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
					alt32=1;
				}
				else if ( (synpred69_DebugInternalGo()) ) {
					alt32=2;
				}
				else if ( (synpred70_DebugInternalGo()) ) {
					alt32=3;
				}
				else if ( (synpred72_DebugInternalGo()) ) {
					alt32=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 4, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RULE_STRING:
				{
				int LA32_5 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
					alt32=1;
				}
				else if ( (synpred69_DebugInternalGo()) ) {
					alt32=2;
				}
				else if ( (synpred70_DebugInternalGo()) ) {
					alt32=3;
				}
				else if ( (synpred72_DebugInternalGo()) ) {
					alt32=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 5, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 86:
				{
				int LA32_6 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
					alt32=1;
				}
				else if ( (synpred69_DebugInternalGo()) ) {
					alt32=2;
				}
				else if ( (synpred70_DebugInternalGo()) ) {
					alt32=3;
				}
				else if ( (synpred72_DebugInternalGo()) ) {
					alt32=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 6, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 61:
				{
				int LA32_7 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
					alt32=1;
				}
				else if ( (synpred69_DebugInternalGo()) ) {
					alt32=2;
				}
				else if ( (synpred70_DebugInternalGo()) ) {
					alt32=3;
				}
				else if ( (synpred72_DebugInternalGo()) ) {
					alt32=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 7, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 81:
				{
				int LA32_8 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
					alt32=1;
				}
				else if ( (synpred69_DebugInternalGo()) ) {
					alt32=2;
				}
				else if ( (synpred70_DebugInternalGo()) ) {
					alt32=3;
				}
				else if ( (synpred72_DebugInternalGo()) ) {
					alt32=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 8, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RULE_LETTER:
				{
				int LA32_9 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
					alt32=1;
				}
				else if ( (synpred69_DebugInternalGo()) ) {
					alt32=2;
				}
				else if ( (synpred70_DebugInternalGo()) ) {
					alt32=3;
				}
				else if ( (synpred71_DebugInternalGo()) ) {
					alt32=4;
				}
				else if ( (synpred72_DebugInternalGo()) ) {
					alt32=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 9, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 76:
				{
				int LA32_10 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
					alt32=1;
				}
				else if ( (synpred69_DebugInternalGo()) ) {
					alt32=2;
				}
				else if ( (synpred70_DebugInternalGo()) ) {
					alt32=3;
				}
				else if ( (synpred72_DebugInternalGo()) ) {
					alt32=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 10, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 43:
				{
				int LA32_11 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
					alt32=1;
				}
				else if ( (synpred69_DebugInternalGo()) ) {
					alt32=2;
				}
				else if ( (synpred70_DebugInternalGo()) ) {
					alt32=3;
				}
				else if ( (synpred72_DebugInternalGo()) ) {
					alt32=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 11, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 45:
				{
				int LA32_12 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
					alt32=1;
				}
				else if ( (synpred69_DebugInternalGo()) ) {
					alt32=2;
				}
				else if ( (synpred70_DebugInternalGo()) ) {
					alt32=3;
				}
				else if ( (synpred72_DebugInternalGo()) ) {
					alt32=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 12, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 80:
				{
				int LA32_13 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
					alt32=1;
				}
				else if ( (synpred69_DebugInternalGo()) ) {
					alt32=2;
				}
				else if ( (synpred70_DebugInternalGo()) ) {
					alt32=3;
				}
				else if ( (synpred72_DebugInternalGo()) ) {
					alt32=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 13, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 68:
				{
				int LA32_14 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
					alt32=1;
				}
				else if ( (synpred69_DebugInternalGo()) ) {
					alt32=2;
				}
				else if ( (synpred70_DebugInternalGo()) ) {
					alt32=3;
				}
				else if ( (synpred72_DebugInternalGo()) ) {
					alt32=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 14, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 57:
				{
				int LA32_15 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
					alt32=1;
				}
				else if ( (synpred69_DebugInternalGo()) ) {
					alt32=2;
				}
				else if ( (synpred70_DebugInternalGo()) ) {
					alt32=3;
				}
				else if ( (synpred72_DebugInternalGo()) ) {
					alt32=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 15, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RULE_UNARY_OP:
				{
				int LA32_16 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
					alt32=1;
				}
				else if ( (synpred69_DebugInternalGo()) ) {
					alt32=2;
				}
				else if ( (synpred70_DebugInternalGo()) ) {
					alt32=3;
				}
				else if ( (synpred72_DebugInternalGo()) ) {
					alt32=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 16, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 56:
				{
				alt32=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(32);}

			switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:446:3: ruleIncDecStmt
					{
					dbg.location(446,3);
					pushFollow(FOLLOW_ruleIncDecStmt_in_ruleSimpleStmt1423);
					ruleIncDecStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:448:3: ruleAssignment
					{
					dbg.location(448,3);
					pushFollow(FOLLOW_ruleAssignment_in_ruleSimpleStmt1435);
					ruleAssignment();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:450:3: ruleSendStmt
					{
					dbg.location(450,3);
					pushFollow(FOLLOW_ruleSendStmt_in_ruleSimpleStmt1447);
					ruleSendStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:452:3: ruleShortVarDecl
					{
					dbg.location(452,3);
					pushFollow(FOLLOW_ruleShortVarDecl_in_ruleSimpleStmt1459);
					ruleShortVarDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:454:3: ruleExpressionStmt
					{
					dbg.location(454,3);
					pushFollow(FOLLOW_ruleExpressionStmt_in_ruleSimpleStmt1471);
					ruleExpressionStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:456:3: ruleEmptyStmt
					{
					dbg.location(456,3);
					pushFollow(FOLLOW_ruleEmptyStmt_in_ruleSimpleStmt1483);
					ruleEmptyStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(32);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(458, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSimpleStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSimpleStmt"



	// $ANTLR start "ruleGoStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:461:1: ruleGoStmt : 'goto' ruleLabel ;
	public final void ruleGoStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleGoStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(461, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:461:11: ( 'goto' ruleLabel )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:462:2: 'goto' ruleLabel
			{
			dbg.location(462,2);
			match(input,77,FOLLOW_77_in_ruleGoStmt1496); if (state.failed) return;dbg.location(463,2);
			pushFollow(FOLLOW_ruleLabel_in_ruleGoStmt1499);
			ruleLabel();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(464, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleGoStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleGoStmt"



	// $ANTLR start "ruleReturnStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:467:1: ruleReturnStmt : 'return' ( ruleExpressionList )? ;
	public final void ruleReturnStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleReturnStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(467, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:467:15: ( 'return' ( ruleExpressionList )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:468:2: 'return' ( ruleExpressionList )?
			{
			dbg.location(468,2);
			match(input,84,FOLLOW_84_in_ruleReturnStmt1509); if (state.failed) return;dbg.location(469,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:469:2: ( ruleExpressionList )?
			int alt33=2;
			try { dbg.enterSubRule(33);
			try { dbg.enterDecision(33, decisionCanBacktrack[33]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA33_1 = input.LA(2);
					if ( (synpred73_DebugInternalGo()) ) {
						alt33=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA33_2 = input.LA(2);
					if ( (synpred73_DebugInternalGo()) ) {
						alt33=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA33_3 = input.LA(2);
					if ( (synpred73_DebugInternalGo()) ) {
						alt33=1;
					}
					}
					break;
				case 62:
					{
					int LA33_4 = input.LA(2);
					if ( (synpred73_DebugInternalGo()) ) {
						alt33=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA33_5 = input.LA(2);
					if ( (synpred73_DebugInternalGo()) ) {
						alt33=1;
					}
					}
					break;
				case 86:
					{
					int LA33_6 = input.LA(2);
					if ( (synpred73_DebugInternalGo()) ) {
						alt33=1;
					}
					}
					break;
				case 61:
					{
					int LA33_7 = input.LA(2);
					if ( (synpred73_DebugInternalGo()) ) {
						alt33=1;
					}
					}
					break;
				case 81:
					{
					int LA33_8 = input.LA(2);
					if ( (synpred73_DebugInternalGo()) ) {
						alt33=1;
					}
					}
					break;
				case RULE_LETTER:
					{
					int LA33_9 = input.LA(2);
					if ( (synpred73_DebugInternalGo()) ) {
						alt33=1;
					}
					}
					break;
				case 76:
					{
					int LA33_10 = input.LA(2);
					if ( (synpred73_DebugInternalGo()) ) {
						alt33=1;
					}
					}
					break;
				case 43:
					{
					int LA33_11 = input.LA(2);
					if ( (synpred73_DebugInternalGo()) ) {
						alt33=1;
					}
					}
					break;
				case 45:
					{
					int LA33_12 = input.LA(2);
					if ( (synpred73_DebugInternalGo()) ) {
						alt33=1;
					}
					}
					break;
				case 80:
					{
					int LA33_13 = input.LA(2);
					if ( (synpred73_DebugInternalGo()) ) {
						alt33=1;
					}
					}
					break;
				case 68:
					{
					int LA33_14 = input.LA(2);
					if ( (synpred73_DebugInternalGo()) ) {
						alt33=1;
					}
					}
					break;
				case 57:
					{
					int LA33_15 = input.LA(2);
					if ( (synpred73_DebugInternalGo()) ) {
						alt33=1;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA33_16 = input.LA(2);
					if ( (synpred73_DebugInternalGo()) ) {
						alt33=1;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(33);}

			switch (alt33) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:469:2: ruleExpressionList
					{
					dbg.location(469,2);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleReturnStmt1512);
					ruleExpressionList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(33);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(471, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleReturnStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleReturnStmt"



	// $ANTLR start "ruleBreakStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:474:1: ruleBreakStmt : 'break' ( ruleLabel )? ;
	public final void ruleBreakStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleBreakStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(474, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:474:14: ( 'break' ( ruleLabel )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:475:2: 'break' ( ruleLabel )?
			{
			dbg.location(475,2);
			match(input,66,FOLLOW_66_in_ruleBreakStmt1525); if (state.failed) return;dbg.location(476,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:476:2: ( ruleLabel )?
			int alt34=2;
			try { dbg.enterSubRule(34);
			try { dbg.enterDecision(34, decisionCanBacktrack[34]);

			int LA34_0 = input.LA(1);
			if ( (LA34_0==RULE_LETTER) ) {
				int LA34_1 = input.LA(2);
				if ( (synpred74_DebugInternalGo()) ) {
					alt34=1;
				}
			}
			} finally {dbg.exitDecision(34);}

			switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:476:2: ruleLabel
					{
					dbg.location(476,2);
					pushFollow(FOLLOW_ruleLabel_in_ruleBreakStmt1528);
					ruleLabel();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(34);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(477, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleBreakStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleBreakStmt"



	// $ANTLR start "ruleContinueStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:480:1: ruleContinueStmt : 'continue' ( ruleLabel )? ;
	public final void ruleContinueStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleContinueStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(480, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:480:17: ( 'continue' ( ruleLabel )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:481:2: 'continue' ( ruleLabel )?
			{
			dbg.location(481,2);
			match(input,70,FOLLOW_70_in_ruleContinueStmt1539); if (state.failed) return;dbg.location(482,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:482:2: ( ruleLabel )?
			int alt35=2;
			try { dbg.enterSubRule(35);
			try { dbg.enterDecision(35, decisionCanBacktrack[35]);

			int LA35_0 = input.LA(1);
			if ( (LA35_0==RULE_LETTER) ) {
				int LA35_1 = input.LA(2);
				if ( (synpred75_DebugInternalGo()) ) {
					alt35=1;
				}
			}
			} finally {dbg.exitDecision(35);}

			switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:482:2: ruleLabel
					{
					dbg.location(482,2);
					pushFollow(FOLLOW_ruleLabel_in_ruleContinueStmt1542);
					ruleLabel();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(35);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(483, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleContinueStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleContinueStmt"



	// $ANTLR start "ruleGotoStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:486:1: ruleGotoStmt : 'goto' ruleLabel ;
	public final void ruleGotoStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleGotoStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(486, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:486:13: ( 'goto' ruleLabel )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:487:2: 'goto' ruleLabel
			{
			dbg.location(487,2);
			match(input,77,FOLLOW_77_in_ruleGotoStmt1553); if (state.failed) return;dbg.location(488,2);
			pushFollow(FOLLOW_ruleLabel_in_ruleGotoStmt1556);
			ruleLabel();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(489, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleGotoStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleGotoStmt"



	// $ANTLR start "ruleIfStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:492:1: ruleIfStmt : 'if' ( ruleSimpleStmt ';' )? ruleExpression ruleBlock ( 'else' ( ruleIfStmt | ruleBlock ) )? ;
	public final void ruleIfStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIfStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(492, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:492:11: ( 'if' ( ruleSimpleStmt ';' )? ruleExpression ruleBlock ( 'else' ( ruleIfStmt | ruleBlock ) )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:493:2: 'if' ( ruleSimpleStmt ';' )? ruleExpression ruleBlock ( 'else' ( ruleIfStmt | ruleBlock ) )?
			{
			dbg.location(493,2);
			match(input,78,FOLLOW_78_in_ruleIfStmt1566); if (state.failed) return;dbg.location(494,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:494:2: ( ruleSimpleStmt ';' )?
			int alt36=2;
			try { dbg.enterSubRule(36);
			try { dbg.enterDecision(36, decisionCanBacktrack[36]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA36_1 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt36=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA36_2 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt36=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA36_3 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt36=1;
					}
					}
					break;
				case 62:
					{
					int LA36_4 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt36=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA36_5 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt36=1;
					}
					}
					break;
				case 86:
					{
					int LA36_6 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt36=1;
					}
					}
					break;
				case 61:
					{
					int LA36_7 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt36=1;
					}
					}
					break;
				case 81:
					{
					int LA36_8 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt36=1;
					}
					}
					break;
				case RULE_LETTER:
					{
					int LA36_9 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt36=1;
					}
					}
					break;
				case 76:
					{
					int LA36_10 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt36=1;
					}
					}
					break;
				case 43:
					{
					int LA36_11 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt36=1;
					}
					}
					break;
				case 45:
					{
					int LA36_12 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt36=1;
					}
					}
					break;
				case 80:
					{
					int LA36_13 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt36=1;
					}
					}
					break;
				case 68:
					{
					int LA36_14 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt36=1;
					}
					}
					break;
				case 57:
					{
					int LA36_15 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt36=1;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA36_16 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt36=1;
					}
					}
					break;
				case 56:
					{
					alt36=1;
					}
					break;
			}
			} finally {dbg.exitDecision(36);}

			switch (alt36) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:495:3: ruleSimpleStmt ';'
					{
					dbg.location(495,3);
					pushFollow(FOLLOW_ruleSimpleStmt_in_ruleIfStmt1573);
					ruleSimpleStmt();
					state._fsp--;
					if (state.failed) return;dbg.location(496,3);
					match(input,56,FOLLOW_56_in_ruleIfStmt1577); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(36);}
			dbg.location(498,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleIfStmt1584);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(499,2);
			pushFollow(FOLLOW_ruleBlock_in_ruleIfStmt1587);
			ruleBlock();
			state._fsp--;
			if (state.failed) return;dbg.location(500,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:500:2: ( 'else' ( ruleIfStmt | ruleBlock ) )?
			int alt38=2;
			try { dbg.enterSubRule(38);
			try { dbg.enterDecision(38, decisionCanBacktrack[38]);

			int LA38_0 = input.LA(1);
			if ( (LA38_0==73) ) {
				alt38=1;
			}
			} finally {dbg.exitDecision(38);}

			switch (alt38) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:501:3: 'else' ( ruleIfStmt | ruleBlock )
					{
					dbg.location(501,3);
					match(input,73,FOLLOW_73_in_ruleIfStmt1594); if (state.failed) return;dbg.location(502,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:502:3: ( ruleIfStmt | ruleBlock )
					int alt37=2;
					try { dbg.enterSubRule(37);
					try { dbg.enterDecision(37, decisionCanBacktrack[37]);

					int LA37_0 = input.LA(1);
					if ( (LA37_0==78) ) {
						alt37=1;
					}
					else if ( (LA37_0==90) ) {
						alt37=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 37, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(37);}

					switch (alt37) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:503:4: ruleIfStmt
							{
							dbg.location(503,4);
							pushFollow(FOLLOW_ruleIfStmt_in_ruleIfStmt1603);
							ruleIfStmt();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:505:4: ruleBlock
							{
							dbg.location(505,4);
							pushFollow(FOLLOW_ruleBlock_in_ruleIfStmt1617);
							ruleBlock();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(37);}

					}
					break;

			}
			} finally {dbg.exitSubRule(38);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(508, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIfStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIfStmt"



	// $ANTLR start "ruleFallthroughStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:511:1: ruleFallthroughStmt : 'fallthrough' ;
	public final void ruleFallthroughStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFallthroughStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(511, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:511:20: ( 'fallthrough' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:512:2: 'fallthrough'
			{
			dbg.location(512,2);
			match(input,74,FOLLOW_74_in_ruleFallthroughStmt1635); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(513, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFallthroughStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFallthroughStmt"



	// $ANTLR start "ruleSwitchStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:516:1: ruleSwitchStmt : ( ruleExprSwitchStmt | ruleTypeSwitchStmt ) ;
	public final void ruleSwitchStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSwitchStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(516, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:516:15: ( ( ruleExprSwitchStmt | ruleTypeSwitchStmt ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:517:2: ( ruleExprSwitchStmt | ruleTypeSwitchStmt )
			{
			dbg.location(517,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:517:2: ( ruleExprSwitchStmt | ruleTypeSwitchStmt )
			int alt39=2;
			try { dbg.enterSubRule(39);
			try { dbg.enterDecision(39, decisionCanBacktrack[39]);

			int LA39_0 = input.LA(1);
			if ( (LA39_0==87) ) {
				int LA39_1 = input.LA(2);
				if ( (synpred79_DebugInternalGo()) ) {
					alt39=1;
				}
				else if ( (true) ) {
					alt39=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(39);}

			switch (alt39) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:518:3: ruleExprSwitchStmt
					{
					dbg.location(518,3);
					pushFollow(FOLLOW_ruleExprSwitchStmt_in_ruleSwitchStmt1649);
					ruleExprSwitchStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:520:3: ruleTypeSwitchStmt
					{
					dbg.location(520,3);
					pushFollow(FOLLOW_ruleTypeSwitchStmt_in_ruleSwitchStmt1661);
					ruleTypeSwitchStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(39);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(522, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSwitchStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSwitchStmt"



	// $ANTLR start "ruleSelectStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:525:1: ruleSelectStmt : 'select' '{' ( ruleCommClause )* '}' ;
	public final void ruleSelectStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSelectStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(525, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:525:15: ( 'select' '{' ( ruleCommClause )* '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:526:2: 'select' '{' ( ruleCommClause )* '}'
			{
			dbg.location(526,2);
			match(input,85,FOLLOW_85_in_ruleSelectStmt1674); if (state.failed) return;dbg.location(527,2);
			match(input,90,FOLLOW_90_in_ruleSelectStmt1677); if (state.failed) return;dbg.location(528,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:528:2: ( ruleCommClause )*
			try { dbg.enterSubRule(40);

			loop40:
			while (true) {
				int alt40=2;
				try { dbg.enterDecision(40, decisionCanBacktrack[40]);

				int LA40_0 = input.LA(1);
				if ( (LA40_0==67||LA40_0==71) ) {
					alt40=1;
				}

				} finally {dbg.exitDecision(40);}

				switch (alt40) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:528:2: ruleCommClause
					{
					dbg.location(528,2);
					pushFollow(FOLLOW_ruleCommClause_in_ruleSelectStmt1680);
					ruleCommClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop40;
				}
			}
			} finally {dbg.exitSubRule(40);}
			dbg.location(530,2);
			match(input,92,FOLLOW_92_in_ruleSelectStmt1686); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(531, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSelectStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSelectStmt"



	// $ANTLR start "ruleForStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:534:1: ruleForStmt : 'for' ( ruleCondition | ruleForClause | ruleRangeClause )? ruleBlock ;
	public final void ruleForStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleForStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(534, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:534:12: ( 'for' ( ruleCondition | ruleForClause | ruleRangeClause )? ruleBlock )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:535:2: 'for' ( ruleCondition | ruleForClause | ruleRangeClause )? ruleBlock
			{
			dbg.location(535,2);
			match(input,75,FOLLOW_75_in_ruleForStmt1696); if (state.failed) return;dbg.location(536,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:536:2: ( ruleCondition | ruleForClause | ruleRangeClause )?
			int alt41=4;
			try { dbg.enterSubRule(41);
			try { dbg.enterDecision(41, decisionCanBacktrack[41]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA41_1 = input.LA(2);
					if ( (synpred81_DebugInternalGo()) ) {
						alt41=1;
					}
					else if ( (synpred82_DebugInternalGo()) ) {
						alt41=2;
					}
					else if ( (synpred83_DebugInternalGo()) ) {
						alt41=3;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA41_2 = input.LA(2);
					if ( (synpred81_DebugInternalGo()) ) {
						alt41=1;
					}
					else if ( (synpred82_DebugInternalGo()) ) {
						alt41=2;
					}
					else if ( (synpred83_DebugInternalGo()) ) {
						alt41=3;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA41_3 = input.LA(2);
					if ( (synpred81_DebugInternalGo()) ) {
						alt41=1;
					}
					else if ( (synpred82_DebugInternalGo()) ) {
						alt41=2;
					}
					else if ( (synpred83_DebugInternalGo()) ) {
						alt41=3;
					}
					}
					break;
				case 62:
					{
					int LA41_4 = input.LA(2);
					if ( (synpred81_DebugInternalGo()) ) {
						alt41=1;
					}
					else if ( (synpred82_DebugInternalGo()) ) {
						alt41=2;
					}
					else if ( (synpred83_DebugInternalGo()) ) {
						alt41=3;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA41_5 = input.LA(2);
					if ( (synpred81_DebugInternalGo()) ) {
						alt41=1;
					}
					else if ( (synpred82_DebugInternalGo()) ) {
						alt41=2;
					}
					else if ( (synpred83_DebugInternalGo()) ) {
						alt41=3;
					}
					}
					break;
				case 86:
					{
					int LA41_6 = input.LA(2);
					if ( (synpred81_DebugInternalGo()) ) {
						alt41=1;
					}
					else if ( (synpred82_DebugInternalGo()) ) {
						alt41=2;
					}
					else if ( (synpred83_DebugInternalGo()) ) {
						alt41=3;
					}
					}
					break;
				case 61:
					{
					int LA41_7 = input.LA(2);
					if ( (synpred81_DebugInternalGo()) ) {
						alt41=1;
					}
					else if ( (synpred82_DebugInternalGo()) ) {
						alt41=2;
					}
					else if ( (synpred83_DebugInternalGo()) ) {
						alt41=3;
					}
					}
					break;
				case 81:
					{
					int LA41_8 = input.LA(2);
					if ( (synpred81_DebugInternalGo()) ) {
						alt41=1;
					}
					else if ( (synpred82_DebugInternalGo()) ) {
						alt41=2;
					}
					else if ( (synpred83_DebugInternalGo()) ) {
						alt41=3;
					}
					}
					break;
				case RULE_LETTER:
					{
					int LA41_9 = input.LA(2);
					if ( (synpred81_DebugInternalGo()) ) {
						alt41=1;
					}
					else if ( (synpred82_DebugInternalGo()) ) {
						alt41=2;
					}
					else if ( (synpred83_DebugInternalGo()) ) {
						alt41=3;
					}
					}
					break;
				case 76:
					{
					int LA41_10 = input.LA(2);
					if ( (synpred81_DebugInternalGo()) ) {
						alt41=1;
					}
					else if ( (synpred82_DebugInternalGo()) ) {
						alt41=2;
					}
					else if ( (synpred83_DebugInternalGo()) ) {
						alt41=3;
					}
					}
					break;
				case 43:
					{
					int LA41_11 = input.LA(2);
					if ( (synpred81_DebugInternalGo()) ) {
						alt41=1;
					}
					else if ( (synpred82_DebugInternalGo()) ) {
						alt41=2;
					}
					else if ( (synpred83_DebugInternalGo()) ) {
						alt41=3;
					}
					}
					break;
				case 45:
					{
					int LA41_12 = input.LA(2);
					if ( (synpred81_DebugInternalGo()) ) {
						alt41=1;
					}
					else if ( (synpred82_DebugInternalGo()) ) {
						alt41=2;
					}
					else if ( (synpred83_DebugInternalGo()) ) {
						alt41=3;
					}
					}
					break;
				case 80:
					{
					int LA41_13 = input.LA(2);
					if ( (synpred81_DebugInternalGo()) ) {
						alt41=1;
					}
					else if ( (synpred82_DebugInternalGo()) ) {
						alt41=2;
					}
					else if ( (synpred83_DebugInternalGo()) ) {
						alt41=3;
					}
					}
					break;
				case 68:
					{
					int LA41_14 = input.LA(2);
					if ( (synpred81_DebugInternalGo()) ) {
						alt41=1;
					}
					else if ( (synpred82_DebugInternalGo()) ) {
						alt41=2;
					}
					else if ( (synpred83_DebugInternalGo()) ) {
						alt41=3;
					}
					}
					break;
				case 57:
					{
					int LA41_15 = input.LA(2);
					if ( (synpred81_DebugInternalGo()) ) {
						alt41=1;
					}
					else if ( (synpred82_DebugInternalGo()) ) {
						alt41=2;
					}
					else if ( (synpred83_DebugInternalGo()) ) {
						alt41=3;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA41_16 = input.LA(2);
					if ( (synpred81_DebugInternalGo()) ) {
						alt41=1;
					}
					else if ( (synpred82_DebugInternalGo()) ) {
						alt41=2;
					}
					else if ( (synpred83_DebugInternalGo()) ) {
						alt41=3;
					}
					}
					break;
				case 56:
					{
					alt41=2;
					}
					break;
				case 83:
					{
					alt41=3;
					}
					break;
			}
			} finally {dbg.exitDecision(41);}

			switch (alt41) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:537:3: ruleCondition
					{
					dbg.location(537,3);
					pushFollow(FOLLOW_ruleCondition_in_ruleForStmt1703);
					ruleCondition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:539:3: ruleForClause
					{
					dbg.location(539,3);
					pushFollow(FOLLOW_ruleForClause_in_ruleForStmt1715);
					ruleForClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:541:3: ruleRangeClause
					{
					dbg.location(541,3);
					pushFollow(FOLLOW_ruleRangeClause_in_ruleForStmt1727);
					ruleRangeClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(41);}
			dbg.location(543,2);
			pushFollow(FOLLOW_ruleBlock_in_ruleForStmt1734);
			ruleBlock();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(544, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleForStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleForStmt"



	// $ANTLR start "ruleDeferStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:547:1: ruleDeferStmt : 'defer' ruleExpression ;
	public final void ruleDeferStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleDeferStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(547, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:547:14: ( 'defer' ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:548:2: 'defer' ruleExpression
			{
			dbg.location(548,2);
			match(input,72,FOLLOW_72_in_ruleDeferStmt1744); if (state.failed) return;dbg.location(549,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleDeferStmt1747);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(550, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleDeferStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleDeferStmt"



	// $ANTLR start "ruleConstDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:553:1: ruleConstDecl : 'const' ( ruleConstSpec | '(' ( ruleConstSpec ( ';' )? )* ')' ) ;
	public final void ruleConstDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleConstDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(553, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:553:14: ( 'const' ( ruleConstSpec | '(' ( ruleConstSpec ( ';' )? )* ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:554:2: 'const' ( ruleConstSpec | '(' ( ruleConstSpec ( ';' )? )* ')' )
			{
			dbg.location(554,2);
			match(input,69,FOLLOW_69_in_ruleConstDecl1757); if (state.failed) return;dbg.location(555,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:555:2: ( ruleConstSpec | '(' ( ruleConstSpec ( ';' )? )* ')' )
			int alt44=2;
			try { dbg.enterSubRule(44);
			try { dbg.enterDecision(44, decisionCanBacktrack[44]);

			int LA44_0 = input.LA(1);
			if ( (LA44_0==RULE_LETTER) ) {
				alt44=1;
			}
			else if ( (LA44_0==43) ) {
				alt44=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(44);}

			switch (alt44) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:556:3: ruleConstSpec
					{
					dbg.location(556,3);
					pushFollow(FOLLOW_ruleConstSpec_in_ruleConstDecl1764);
					ruleConstSpec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:558:3: '(' ( ruleConstSpec ( ';' )? )* ')'
					{
					dbg.location(558,3);
					match(input,43,FOLLOW_43_in_ruleConstDecl1776); if (state.failed) return;dbg.location(559,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:559:3: ( ruleConstSpec ( ';' )? )*
					try { dbg.enterSubRule(43);

					loop43:
					while (true) {
						int alt43=2;
						try { dbg.enterDecision(43, decisionCanBacktrack[43]);

						int LA43_0 = input.LA(1);
						if ( (LA43_0==RULE_LETTER) ) {
							alt43=1;
						}

						} finally {dbg.exitDecision(43);}

						switch (alt43) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:560:4: ruleConstSpec ( ';' )?
							{
							dbg.location(560,4);
							pushFollow(FOLLOW_ruleConstSpec_in_ruleConstDecl1785);
							ruleConstSpec();
							state._fsp--;
							if (state.failed) return;dbg.location(561,4);
							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:561:4: ( ';' )?
							int alt42=2;
							try { dbg.enterSubRule(42);
							try { dbg.enterDecision(42, decisionCanBacktrack[42]);

							int LA42_0 = input.LA(1);
							if ( (LA42_0==56) ) {
								alt42=1;
							}
							} finally {dbg.exitDecision(42);}

							switch (alt42) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:561:4: ';'
									{
									dbg.location(561,4);
									match(input,56,FOLLOW_56_in_ruleConstDecl1790); if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(42);}

							}
							break;

						default :
							break loop43;
						}
					}
					} finally {dbg.exitSubRule(43);}
					dbg.location(563,3);
					match(input,44,FOLLOW_44_in_ruleConstDecl1800); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(44);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(565, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleConstDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleConstDecl"



	// $ANTLR start "ruleConstSpec"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:568:1: ruleConstSpec : ruleIdentifierList ( ( ruleType )? '=' ruleExpressionList )? ;
	public final void ruleConstSpec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleConstSpec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(568, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:568:14: ( ruleIdentifierList ( ( ruleType )? '=' ruleExpressionList )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:569:2: ruleIdentifierList ( ( ruleType )? '=' ruleExpressionList )?
			{
			dbg.location(569,2);
			pushFollow(FOLLOW_ruleIdentifierList_in_ruleConstSpec1813);
			ruleIdentifierList();
			state._fsp--;
			if (state.failed) return;dbg.location(570,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:570:2: ( ( ruleType )? '=' ruleExpressionList )?
			int alt46=2;
			try { dbg.enterSubRule(46);
			try { dbg.enterDecision(46, decisionCanBacktrack[46]);

			switch ( input.LA(1) ) {
				case RULE_LETTER:
					{
					int LA46_1 = input.LA(2);
					if ( (synpred88_DebugInternalGo()) ) {
						alt46=1;
					}
					}
					break;
				case 61:
					{
					int LA46_2 = input.LA(2);
					if ( (synpred88_DebugInternalGo()) ) {
						alt46=1;
					}
					}
					break;
				case 86:
					{
					int LA46_3 = input.LA(2);
					if ( (synpred88_DebugInternalGo()) ) {
						alt46=1;
					}
					}
					break;
				case 45:
					{
					int LA46_4 = input.LA(2);
					if ( (synpred88_DebugInternalGo()) ) {
						alt46=1;
					}
					}
					break;
				case 76:
					{
					int LA46_5 = input.LA(2);
					if ( (synpred88_DebugInternalGo()) ) {
						alt46=1;
					}
					}
					break;
				case 80:
					{
					int LA46_6 = input.LA(2);
					if ( (synpred88_DebugInternalGo()) ) {
						alt46=1;
					}
					}
					break;
				case 81:
					{
					int LA46_7 = input.LA(2);
					if ( (synpred88_DebugInternalGo()) ) {
						alt46=1;
					}
					}
					break;
				case 68:
					{
					int LA46_8 = input.LA(2);
					if ( (synpred88_DebugInternalGo()) ) {
						alt46=1;
					}
					}
					break;
				case 57:
					{
					int LA46_9 = input.LA(2);
					if ( (synpred88_DebugInternalGo()) ) {
						alt46=1;
					}
					}
					break;
				case 43:
					{
					int LA46_10 = input.LA(2);
					if ( (synpred88_DebugInternalGo()) ) {
						alt46=1;
					}
					}
					break;
				case 59:
					{
					alt46=1;
					}
					break;
			}
			} finally {dbg.exitDecision(46);}

			switch (alt46) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:571:3: ( ruleType )? '=' ruleExpressionList
					{
					dbg.location(571,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:571:3: ( ruleType )?
					int alt45=2;
					try { dbg.enterSubRule(45);
					try { dbg.enterDecision(45, decisionCanBacktrack[45]);

					int LA45_0 = input.LA(1);
					if ( (LA45_0==RULE_LETTER||LA45_0==43||LA45_0==45||LA45_0==57||LA45_0==61||LA45_0==68||LA45_0==76||(LA45_0 >= 80 && LA45_0 <= 81)||LA45_0==86) ) {
						alt45=1;
					}
					} finally {dbg.exitDecision(45);}

					switch (alt45) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:571:3: ruleType
							{
							dbg.location(571,3);
							pushFollow(FOLLOW_ruleType_in_ruleConstSpec1820);
							ruleType();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(45);}
					dbg.location(573,3);
					match(input,59,FOLLOW_59_in_ruleConstSpec1828); if (state.failed) return;dbg.location(574,3);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleConstSpec1832);
					ruleExpressionList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(46);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(576, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleConstSpec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleConstSpec"



	// $ANTLR start "ruleTypeDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:579:1: ruleTypeDecl : 'type' ( ruleTypeSpec | '(' ( ruleTypeSpec ';' )* ')' ) ;
	public final void ruleTypeDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(579, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:579:13: ( 'type' ( ruleTypeSpec | '(' ( ruleTypeSpec ';' )* ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:580:2: 'type' ( ruleTypeSpec | '(' ( ruleTypeSpec ';' )* ')' )
			{
			dbg.location(580,2);
			match(input,88,FOLLOW_88_in_ruleTypeDecl1846); if (state.failed) return;dbg.location(581,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:581:2: ( ruleTypeSpec | '(' ( ruleTypeSpec ';' )* ')' )
			int alt48=2;
			try { dbg.enterSubRule(48);
			try { dbg.enterDecision(48, decisionCanBacktrack[48]);

			int LA48_0 = input.LA(1);
			if ( (LA48_0==RULE_LETTER) ) {
				alt48=1;
			}
			else if ( (LA48_0==43) ) {
				alt48=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(48);}

			switch (alt48) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:582:3: ruleTypeSpec
					{
					dbg.location(582,3);
					pushFollow(FOLLOW_ruleTypeSpec_in_ruleTypeDecl1853);
					ruleTypeSpec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:584:3: '(' ( ruleTypeSpec ';' )* ')'
					{
					dbg.location(584,3);
					match(input,43,FOLLOW_43_in_ruleTypeDecl1865); if (state.failed) return;dbg.location(585,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:585:3: ( ruleTypeSpec ';' )*
					try { dbg.enterSubRule(47);

					loop47:
					while (true) {
						int alt47=2;
						try { dbg.enterDecision(47, decisionCanBacktrack[47]);

						int LA47_0 = input.LA(1);
						if ( (LA47_0==RULE_LETTER) ) {
							alt47=1;
						}

						} finally {dbg.exitDecision(47);}

						switch (alt47) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:586:4: ruleTypeSpec ';'
							{
							dbg.location(586,4);
							pushFollow(FOLLOW_ruleTypeSpec_in_ruleTypeDecl1874);
							ruleTypeSpec();
							state._fsp--;
							if (state.failed) return;dbg.location(587,4);
							match(input,56,FOLLOW_56_in_ruleTypeDecl1879); if (state.failed) return;
							}
							break;

						default :
							break loop47;
						}
					}
					} finally {dbg.exitSubRule(47);}
					dbg.location(589,3);
					match(input,44,FOLLOW_44_in_ruleTypeDecl1888); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(48);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(591, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeDecl"



	// $ANTLR start "ruleTypeSpec"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:594:1: ruleTypeSpec : ( ruleAliasDecl | ruleTypeDef ) ;
	public final void ruleTypeSpec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeSpec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(594, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:594:13: ( ( ruleAliasDecl | ruleTypeDef ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:595:2: ( ruleAliasDecl | ruleTypeDef )
			{
			dbg.location(595,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:595:2: ( ruleAliasDecl | ruleTypeDef )
			int alt49=2;
			try { dbg.enterSubRule(49);
			try { dbg.enterDecision(49, decisionCanBacktrack[49]);

			int LA49_0 = input.LA(1);
			if ( (LA49_0==RULE_LETTER) ) {
				int LA49_1 = input.LA(2);
				if ( (synpred91_DebugInternalGo()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(49);}

			switch (alt49) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:596:3: ruleAliasDecl
					{
					dbg.location(596,3);
					pushFollow(FOLLOW_ruleAliasDecl_in_ruleTypeSpec1905);
					ruleAliasDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:598:3: ruleTypeDef
					{
					dbg.location(598,3);
					pushFollow(FOLLOW_ruleTypeDef_in_ruleTypeSpec1917);
					ruleTypeDef();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(49);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(600, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeSpec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeSpec"



	// $ANTLR start "ruleTypeDef"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:603:1: ruleTypeDef : ruleIDENTIFIER ruleType ;
	public final void ruleTypeDef() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeDef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(603, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:603:12: ( ruleIDENTIFIER ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:604:2: ruleIDENTIFIER ruleType
			{
			dbg.location(604,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleTypeDef1930);
			ruleIDENTIFIER();
			state._fsp--;
			if (state.failed) return;dbg.location(605,2);
			pushFollow(FOLLOW_ruleType_in_ruleTypeDef1933);
			ruleType();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(606, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeDef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeDef"



	// $ANTLR start "ruleAliasDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:609:1: ruleAliasDecl : ruleIDENTIFIER '=' ruleType ;
	public final void ruleAliasDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleAliasDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(609, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:609:14: ( ruleIDENTIFIER '=' ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:610:2: ruleIDENTIFIER '=' ruleType
			{
			dbg.location(610,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleAliasDecl1943);
			ruleIDENTIFIER();
			state._fsp--;
			if (state.failed) return;dbg.location(611,2);
			match(input,59,FOLLOW_59_in_ruleAliasDecl1946); if (state.failed) return;dbg.location(612,2);
			pushFollow(FOLLOW_ruleType_in_ruleAliasDecl1949);
			ruleType();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(613, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleAliasDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleAliasDecl"



	// $ANTLR start "ruleVarDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:616:1: ruleVarDecl : 'var' ( ruleVarSpec | '(' ( ruleVarSpec ';' )* ')' ) ;
	public final void ruleVarDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleVarDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(616, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:616:12: ( 'var' ( ruleVarSpec | '(' ( ruleVarSpec ';' )* ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:617:2: 'var' ( ruleVarSpec | '(' ( ruleVarSpec ';' )* ')' )
			{
			dbg.location(617,2);
			match(input,89,FOLLOW_89_in_ruleVarDecl1959); if (state.failed) return;dbg.location(618,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:618:2: ( ruleVarSpec | '(' ( ruleVarSpec ';' )* ')' )
			int alt51=2;
			try { dbg.enterSubRule(51);
			try { dbg.enterDecision(51, decisionCanBacktrack[51]);

			int LA51_0 = input.LA(1);
			if ( (LA51_0==RULE_LETTER) ) {
				alt51=1;
			}
			else if ( (LA51_0==43) ) {
				alt51=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(51);}

			switch (alt51) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:619:3: ruleVarSpec
					{
					dbg.location(619,3);
					pushFollow(FOLLOW_ruleVarSpec_in_ruleVarDecl1966);
					ruleVarSpec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:621:3: '(' ( ruleVarSpec ';' )* ')'
					{
					dbg.location(621,3);
					match(input,43,FOLLOW_43_in_ruleVarDecl1978); if (state.failed) return;dbg.location(622,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:622:3: ( ruleVarSpec ';' )*
					try { dbg.enterSubRule(50);

					loop50:
					while (true) {
						int alt50=2;
						try { dbg.enterDecision(50, decisionCanBacktrack[50]);

						int LA50_0 = input.LA(1);
						if ( (LA50_0==RULE_LETTER) ) {
							alt50=1;
						}

						} finally {dbg.exitDecision(50);}

						switch (alt50) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:623:4: ruleVarSpec ';'
							{
							dbg.location(623,4);
							pushFollow(FOLLOW_ruleVarSpec_in_ruleVarDecl1987);
							ruleVarSpec();
							state._fsp--;
							if (state.failed) return;dbg.location(624,4);
							match(input,56,FOLLOW_56_in_ruleVarDecl1992); if (state.failed) return;
							}
							break;

						default :
							break loop50;
						}
					}
					} finally {dbg.exitSubRule(50);}
					dbg.location(626,3);
					match(input,44,FOLLOW_44_in_ruleVarDecl2001); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(51);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(628, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleVarDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleVarDecl"



	// $ANTLR start "ruleVarSpec"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:631:1: ruleVarSpec : ruleIdentifierList ( ruleType )? ( '=' ruleExpressionList )? ;
	public final void ruleVarSpec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleVarSpec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(631, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:631:12: ( ruleIdentifierList ( ruleType )? ( '=' ruleExpressionList )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:632:2: ruleIdentifierList ( ruleType )? ( '=' ruleExpressionList )?
			{
			dbg.location(632,2);
			pushFollow(FOLLOW_ruleIdentifierList_in_ruleVarSpec2014);
			ruleIdentifierList();
			state._fsp--;
			if (state.failed) return;dbg.location(633,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:633:2: ( ruleType )?
			int alt52=2;
			try { dbg.enterSubRule(52);
			try { dbg.enterDecision(52, decisionCanBacktrack[52]);

			switch ( input.LA(1) ) {
				case RULE_LETTER:
					{
					int LA52_1 = input.LA(2);
					if ( (synpred94_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 61:
					{
					int LA52_2 = input.LA(2);
					if ( (synpred94_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 86:
					{
					int LA52_3 = input.LA(2);
					if ( (synpred94_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 45:
					{
					int LA52_4 = input.LA(2);
					if ( (synpred94_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 76:
					{
					int LA52_5 = input.LA(2);
					if ( (synpred94_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 80:
					{
					int LA52_6 = input.LA(2);
					if ( (synpred94_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 81:
					{
					int LA52_7 = input.LA(2);
					if ( (synpred94_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 68:
					{
					int LA52_8 = input.LA(2);
					if ( (synpred94_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 57:
					{
					int LA52_9 = input.LA(2);
					if ( (synpred94_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 43:
					{
					int LA52_10 = input.LA(2);
					if ( (synpred94_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(52);}

			switch (alt52) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:633:2: ruleType
					{
					dbg.location(633,2);
					pushFollow(FOLLOW_ruleType_in_ruleVarSpec2017);
					ruleType();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(52);}
			dbg.location(635,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:635:2: ( '=' ruleExpressionList )?
			int alt53=2;
			try { dbg.enterSubRule(53);
			try { dbg.enterDecision(53, decisionCanBacktrack[53]);

			int LA53_0 = input.LA(1);
			if ( (LA53_0==59) ) {
				alt53=1;
			}
			} finally {dbg.exitDecision(53);}

			switch (alt53) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:636:3: '=' ruleExpressionList
					{
					dbg.location(636,3);
					match(input,59,FOLLOW_59_in_ruleVarSpec2027); if (state.failed) return;dbg.location(637,3);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleVarSpec2031);
					ruleExpressionList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(53);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(639, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleVarSpec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleVarSpec"



	// $ANTLR start "ruleEmptyStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:642:1: ruleEmptyStmt : ';' ;
	public final void ruleEmptyStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleEmptyStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(642, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:642:14: ( ';' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:643:2: ';'
			{
			dbg.location(643,2);
			match(input,56,FOLLOW_56_in_ruleEmptyStmt2045); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(644, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleEmptyStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleEmptyStmt"



	// $ANTLR start "ruleExpressionStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:647:1: ruleExpressionStmt : ruleExpression ;
	public final void ruleExpressionStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExpressionStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(647, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:647:19: ( ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:648:2: ruleExpression
			{
			dbg.location(648,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleExpressionStmt2055);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(649, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExpressionStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExpressionStmt"



	// $ANTLR start "ruleSendStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:652:1: ruleSendStmt : ruleChannel '<-' ruleExpression ;
	public final void ruleSendStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSendStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(652, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:652:13: ( ruleChannel '<-' ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:653:2: ruleChannel '<-' ruleExpression
			{
			dbg.location(653,2);
			pushFollow(FOLLOW_ruleChannel_in_ruleSendStmt2065);
			ruleChannel();
			state._fsp--;
			if (state.failed) return;dbg.location(654,2);
			match(input,57,FOLLOW_57_in_ruleSendStmt2068); if (state.failed) return;dbg.location(655,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleSendStmt2071);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(656, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSendStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSendStmt"



	// $ANTLR start "ruleChannel"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:659:1: ruleChannel : ruleExpression ;
	public final void ruleChannel() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleChannel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(659, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:659:12: ( ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:660:2: ruleExpression
			{
			dbg.location(660,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleChannel2081);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(661, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleChannel");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleChannel"



	// $ANTLR start "ruleIncDecStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:664:1: ruleIncDecStmt : ( ruleExpression '++' | ruleExpression '--' ) ;
	public final void ruleIncDecStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIncDecStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(664, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:664:15: ( ( ruleExpression '++' | ruleExpression '--' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:665:2: ( ruleExpression '++' | ruleExpression '--' )
			{
			dbg.location(665,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:665:2: ( ruleExpression '++' | ruleExpression '--' )
			int alt54=2;
			try { dbg.enterSubRule(54);
			try { dbg.enterDecision(54, decisionCanBacktrack[54]);

			switch ( input.LA(1) ) {
			case RULE_INT_LIT:
				{
				int LA54_1 = input.LA(2);
				if ( (synpred96_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case RULE_FLOAT_LIT:
				{
				int LA54_2 = input.LA(2);
				if ( (synpred96_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case RULE_DECIMALS:
				{
				int LA54_3 = input.LA(2);
				if ( (synpred96_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 62:
				{
				int LA54_4 = input.LA(2);
				if ( (synpred96_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case RULE_STRING:
				{
				int LA54_5 = input.LA(2);
				if ( (synpred96_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 86:
				{
				int LA54_6 = input.LA(2);
				if ( (synpred96_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 61:
				{
				int LA54_7 = input.LA(2);
				if ( (synpred96_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 81:
				{
				int LA54_8 = input.LA(2);
				if ( (synpred96_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case RULE_LETTER:
				{
				int LA54_9 = input.LA(2);
				if ( (synpred96_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 76:
				{
				int LA54_10 = input.LA(2);
				if ( (synpred96_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 43:
				{
				int LA54_11 = input.LA(2);
				if ( (synpred96_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 45:
				{
				int LA54_12 = input.LA(2);
				if ( (synpred96_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 80:
				{
				int LA54_13 = input.LA(2);
				if ( (synpred96_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 68:
				{
				int LA54_14 = input.LA(2);
				if ( (synpred96_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 57:
				{
				int LA54_15 = input.LA(2);
				if ( (synpred96_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case RULE_UNARY_OP:
				{
				int LA54_16 = input.LA(2);
				if ( (synpred96_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(54);}

			switch (alt54) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:666:3: ruleExpression '++'
					{
					dbg.location(666,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleIncDecStmt2095);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(667,3);
					match(input,47,FOLLOW_47_in_ruleIncDecStmt2099); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:669:3: ruleExpression '--'
					{
					dbg.location(669,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleIncDecStmt2111);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(670,3);
					match(input,50,FOLLOW_50_in_ruleIncDecStmt2115); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(54);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(672, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIncDecStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIncDecStmt"



	// $ANTLR start "ruleAssignment"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:675:1: ruleAssignment : ruleExpressionList ruleASSING_OP ruleExpressionList ;
	public final void ruleAssignment() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleAssignment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(675, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:675:15: ( ruleExpressionList ruleASSING_OP ruleExpressionList )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:676:2: ruleExpressionList ruleASSING_OP ruleExpressionList
			{
			dbg.location(676,2);
			pushFollow(FOLLOW_ruleExpressionList_in_ruleAssignment2128);
			ruleExpressionList();
			state._fsp--;
			if (state.failed) return;dbg.location(677,2);
			pushFollow(FOLLOW_ruleASSING_OP_in_ruleAssignment2131);
			ruleASSING_OP();
			state._fsp--;
			if (state.failed) return;dbg.location(678,2);
			pushFollow(FOLLOW_ruleExpressionList_in_ruleAssignment2134);
			ruleExpressionList();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(679, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleAssignment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleAssignment"



	// $ANTLR start "ruleShortVarDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:682:1: ruleShortVarDecl : ruleIdentifierList ':=' ruleExpressionList ;
	public final void ruleShortVarDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleShortVarDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(682, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:682:17: ( ruleIdentifierList ':=' ruleExpressionList )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:683:2: ruleIdentifierList ':=' ruleExpressionList
			{
			dbg.location(683,2);
			pushFollow(FOLLOW_ruleIdentifierList_in_ruleShortVarDecl2144);
			ruleIdentifierList();
			state._fsp--;
			if (state.failed) return;dbg.location(684,2);
			match(input,55,FOLLOW_55_in_ruleShortVarDecl2147); if (state.failed) return;dbg.location(685,2);
			pushFollow(FOLLOW_ruleExpressionList_in_ruleShortVarDecl2150);
			ruleExpressionList();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(686, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleShortVarDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleShortVarDecl"



	// $ANTLR start "ruleExprSwitchStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:689:1: ruleExprSwitchStmt : 'switch' ( ruleSimpleStmt ';' )? ( ruleExpression )? '{' ( ruleExprCaseClause )* '}' ;
	public final void ruleExprSwitchStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExprSwitchStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(689, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:689:19: ( 'switch' ( ruleSimpleStmt ';' )? ( ruleExpression )? '{' ( ruleExprCaseClause )* '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:690:2: 'switch' ( ruleSimpleStmt ';' )? ( ruleExpression )? '{' ( ruleExprCaseClause )* '}'
			{
			dbg.location(690,2);
			match(input,87,FOLLOW_87_in_ruleExprSwitchStmt2160); if (state.failed) return;dbg.location(691,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:691:2: ( ruleSimpleStmt ';' )?
			int alt55=2;
			try { dbg.enterSubRule(55);
			try { dbg.enterDecision(55, decisionCanBacktrack[55]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA55_1 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA55_2 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA55_3 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 62:
					{
					int LA55_4 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA55_5 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 86:
					{
					int LA55_6 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 61:
					{
					int LA55_7 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 81:
					{
					int LA55_8 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case RULE_LETTER:
					{
					int LA55_9 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 76:
					{
					int LA55_10 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 43:
					{
					int LA55_11 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 45:
					{
					int LA55_12 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 80:
					{
					int LA55_13 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 68:
					{
					int LA55_14 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 57:
					{
					int LA55_15 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA55_16 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 56:
					{
					alt55=1;
					}
					break;
			}
			} finally {dbg.exitDecision(55);}

			switch (alt55) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:692:3: ruleSimpleStmt ';'
					{
					dbg.location(692,3);
					pushFollow(FOLLOW_ruleSimpleStmt_in_ruleExprSwitchStmt2167);
					ruleSimpleStmt();
					state._fsp--;
					if (state.failed) return;dbg.location(693,3);
					match(input,56,FOLLOW_56_in_ruleExprSwitchStmt2171); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(55);}
			dbg.location(695,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:695:2: ( ruleExpression )?
			int alt56=2;
			try { dbg.enterSubRule(56);
			try { dbg.enterDecision(56, decisionCanBacktrack[56]);

			int LA56_0 = input.LA(1);
			if ( (LA56_0==RULE_DECIMALS||LA56_0==RULE_FLOAT_LIT||(LA56_0 >= RULE_INT_LIT && LA56_0 <= RULE_LETTER)||(LA56_0 >= RULE_STRING && LA56_0 <= RULE_UNARY_OP)||LA56_0==43||LA56_0==45||LA56_0==57||(LA56_0 >= 61 && LA56_0 <= 62)||LA56_0==68||LA56_0==76||(LA56_0 >= 80 && LA56_0 <= 81)||LA56_0==86) ) {
				alt56=1;
			}
			} finally {dbg.exitDecision(56);}

			switch (alt56) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:695:2: ruleExpression
					{
					dbg.location(695,2);
					pushFollow(FOLLOW_ruleExpression_in_ruleExprSwitchStmt2178);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(56);}
			dbg.location(697,2);
			match(input,90,FOLLOW_90_in_ruleExprSwitchStmt2184); if (state.failed) return;dbg.location(698,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:698:2: ( ruleExprCaseClause )*
			try { dbg.enterSubRule(57);

			loop57:
			while (true) {
				int alt57=2;
				try { dbg.enterDecision(57, decisionCanBacktrack[57]);

				int LA57_0 = input.LA(1);
				if ( (LA57_0==67||LA57_0==71) ) {
					alt57=1;
				}

				} finally {dbg.exitDecision(57);}

				switch (alt57) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:698:2: ruleExprCaseClause
					{
					dbg.location(698,2);
					pushFollow(FOLLOW_ruleExprCaseClause_in_ruleExprSwitchStmt2187);
					ruleExprCaseClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop57;
				}
			}
			} finally {dbg.exitSubRule(57);}
			dbg.location(700,2);
			match(input,92,FOLLOW_92_in_ruleExprSwitchStmt2193); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(701, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExprSwitchStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExprSwitchStmt"



	// $ANTLR start "ruleExprCaseClause"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:704:1: ruleExprCaseClause : ruleExprSwitchCase ':' ruleStatementList ;
	public final void ruleExprCaseClause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExprCaseClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(704, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:704:19: ( ruleExprSwitchCase ':' ruleStatementList )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:705:2: ruleExprSwitchCase ':' ruleStatementList
			{
			dbg.location(705,2);
			pushFollow(FOLLOW_ruleExprSwitchCase_in_ruleExprCaseClause2203);
			ruleExprSwitchCase();
			state._fsp--;
			if (state.failed) return;dbg.location(706,2);
			match(input,54,FOLLOW_54_in_ruleExprCaseClause2206); if (state.failed) return;dbg.location(707,2);
			pushFollow(FOLLOW_ruleStatementList_in_ruleExprCaseClause2209);
			ruleStatementList();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(708, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExprCaseClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExprCaseClause"



	// $ANTLR start "ruleExprSwitchCase"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:711:1: ruleExprSwitchCase : ( 'case' ruleExpressionList | 'default' ) ;
	public final void ruleExprSwitchCase() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExprSwitchCase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(711, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:711:19: ( ( 'case' ruleExpressionList | 'default' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:712:2: ( 'case' ruleExpressionList | 'default' )
			{
			dbg.location(712,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:712:2: ( 'case' ruleExpressionList | 'default' )
			int alt58=2;
			try { dbg.enterSubRule(58);
			try { dbg.enterDecision(58, decisionCanBacktrack[58]);

			int LA58_0 = input.LA(1);
			if ( (LA58_0==67) ) {
				alt58=1;
			}
			else if ( (LA58_0==71) ) {
				alt58=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(58);}

			switch (alt58) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:713:3: 'case' ruleExpressionList
					{
					dbg.location(713,3);
					match(input,67,FOLLOW_67_in_ruleExprSwitchCase2223); if (state.failed) return;dbg.location(714,3);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleExprSwitchCase2227);
					ruleExpressionList();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:716:3: 'default'
					{
					dbg.location(716,3);
					match(input,71,FOLLOW_71_in_ruleExprSwitchCase2239); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(58);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(718, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExprSwitchCase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExprSwitchCase"



	// $ANTLR start "ruleTypeSwitchStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:721:1: ruleTypeSwitchStmt : 'switch' ( ruleSimpleStmt ';' )? ruleTypeSwitchGuard '{' ( ruleTypeCaseClause )* '}' ;
	public final void ruleTypeSwitchStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeSwitchStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(721, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:721:19: ( 'switch' ( ruleSimpleStmt ';' )? ruleTypeSwitchGuard '{' ( ruleTypeCaseClause )* '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:722:2: 'switch' ( ruleSimpleStmt ';' )? ruleTypeSwitchGuard '{' ( ruleTypeCaseClause )* '}'
			{
			dbg.location(722,2);
			match(input,87,FOLLOW_87_in_ruleTypeSwitchStmt2252); if (state.failed) return;dbg.location(723,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:723:2: ( ruleSimpleStmt ';' )?
			int alt59=2;
			try { dbg.enterSubRule(59);
			try { dbg.enterDecision(59, decisionCanBacktrack[59]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA59_1 = input.LA(2);
					if ( (synpred101_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA59_2 = input.LA(2);
					if ( (synpred101_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA59_3 = input.LA(2);
					if ( (synpred101_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 62:
					{
					int LA59_4 = input.LA(2);
					if ( (synpred101_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA59_5 = input.LA(2);
					if ( (synpred101_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 86:
					{
					int LA59_6 = input.LA(2);
					if ( (synpred101_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 61:
					{
					int LA59_7 = input.LA(2);
					if ( (synpred101_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 81:
					{
					int LA59_8 = input.LA(2);
					if ( (synpred101_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case RULE_LETTER:
					{
					int LA59_9 = input.LA(2);
					if ( (synpred101_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 76:
					{
					int LA59_10 = input.LA(2);
					if ( (synpred101_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 43:
					{
					int LA59_11 = input.LA(2);
					if ( (synpred101_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 45:
					{
					int LA59_12 = input.LA(2);
					if ( (synpred101_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 80:
					{
					int LA59_13 = input.LA(2);
					if ( (synpred101_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 68:
					{
					int LA59_14 = input.LA(2);
					if ( (synpred101_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 57:
					{
					int LA59_15 = input.LA(2);
					if ( (synpred101_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case RULE_UNARY_OP:
				case 56:
					{
					alt59=1;
					}
					break;
			}
			} finally {dbg.exitDecision(59);}

			switch (alt59) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:724:3: ruleSimpleStmt ';'
					{
					dbg.location(724,3);
					pushFollow(FOLLOW_ruleSimpleStmt_in_ruleTypeSwitchStmt2259);
					ruleSimpleStmt();
					state._fsp--;
					if (state.failed) return;dbg.location(725,3);
					match(input,56,FOLLOW_56_in_ruleTypeSwitchStmt2263); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(59);}
			dbg.location(727,2);
			pushFollow(FOLLOW_ruleTypeSwitchGuard_in_ruleTypeSwitchStmt2270);
			ruleTypeSwitchGuard();
			state._fsp--;
			if (state.failed) return;dbg.location(728,2);
			match(input,90,FOLLOW_90_in_ruleTypeSwitchStmt2273); if (state.failed) return;dbg.location(729,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:729:2: ( ruleTypeCaseClause )*
			try { dbg.enterSubRule(60);

			loop60:
			while (true) {
				int alt60=2;
				try { dbg.enterDecision(60, decisionCanBacktrack[60]);

				int LA60_0 = input.LA(1);
				if ( (LA60_0==67||LA60_0==71) ) {
					alt60=1;
				}

				} finally {dbg.exitDecision(60);}

				switch (alt60) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:729:2: ruleTypeCaseClause
					{
					dbg.location(729,2);
					pushFollow(FOLLOW_ruleTypeCaseClause_in_ruleTypeSwitchStmt2276);
					ruleTypeCaseClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop60;
				}
			}
			} finally {dbg.exitSubRule(60);}
			dbg.location(731,2);
			match(input,92,FOLLOW_92_in_ruleTypeSwitchStmt2282); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(732, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeSwitchStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeSwitchStmt"



	// $ANTLR start "ruleTypeSwitchGuard"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:735:1: ruleTypeSwitchGuard : ( ruleIDENTIFIER ':=' )? rulePrimaryExpr '.' '(' 'type' ')' ;
	public final void ruleTypeSwitchGuard() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeSwitchGuard");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(735, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:735:20: ( ( ruleIDENTIFIER ':=' )? rulePrimaryExpr '.' '(' 'type' ')' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:736:2: ( ruleIDENTIFIER ':=' )? rulePrimaryExpr '.' '(' 'type' ')'
			{
			dbg.location(736,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:736:2: ( ruleIDENTIFIER ':=' )?
			int alt61=2;
			try { dbg.enterSubRule(61);
			try { dbg.enterDecision(61, decisionCanBacktrack[61]);

			try {
				isCyclicDecision = true;
				alt61 = dfa61.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(61);}

			switch (alt61) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:737:3: ruleIDENTIFIER ':='
					{
					dbg.location(737,3);
					pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleTypeSwitchGuard2296);
					ruleIDENTIFIER();
					state._fsp--;
					if (state.failed) return;dbg.location(738,3);
					match(input,55,FOLLOW_55_in_ruleTypeSwitchGuard2300); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(61);}
			dbg.location(740,2);
			pushFollow(FOLLOW_rulePrimaryExpr_in_ruleTypeSwitchGuard2307);
			rulePrimaryExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(741,2);
			match(input,51,FOLLOW_51_in_ruleTypeSwitchGuard2310); if (state.failed) return;dbg.location(742,2);
			match(input,43,FOLLOW_43_in_ruleTypeSwitchGuard2313); if (state.failed) return;dbg.location(743,2);
			match(input,88,FOLLOW_88_in_ruleTypeSwitchGuard2316); if (state.failed) return;dbg.location(744,2);
			match(input,44,FOLLOW_44_in_ruleTypeSwitchGuard2319); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(745, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeSwitchGuard");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeSwitchGuard"



	// $ANTLR start "ruleTypeCaseClause"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:748:1: ruleTypeCaseClause : ruleTypeSwitchCase ':' ruleStatementList ;
	public final void ruleTypeCaseClause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeCaseClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(748, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:748:19: ( ruleTypeSwitchCase ':' ruleStatementList )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:749:2: ruleTypeSwitchCase ':' ruleStatementList
			{
			dbg.location(749,2);
			pushFollow(FOLLOW_ruleTypeSwitchCase_in_ruleTypeCaseClause2329);
			ruleTypeSwitchCase();
			state._fsp--;
			if (state.failed) return;dbg.location(750,2);
			match(input,54,FOLLOW_54_in_ruleTypeCaseClause2332); if (state.failed) return;dbg.location(751,2);
			pushFollow(FOLLOW_ruleStatementList_in_ruleTypeCaseClause2335);
			ruleStatementList();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(752, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeCaseClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeCaseClause"



	// $ANTLR start "ruleTypeSwitchCase"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:755:1: ruleTypeSwitchCase : ( 'case' ruleTypeList | 'default' ) ;
	public final void ruleTypeSwitchCase() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeSwitchCase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(755, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:755:19: ( ( 'case' ruleTypeList | 'default' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:756:2: ( 'case' ruleTypeList | 'default' )
			{
			dbg.location(756,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:756:2: ( 'case' ruleTypeList | 'default' )
			int alt62=2;
			try { dbg.enterSubRule(62);
			try { dbg.enterDecision(62, decisionCanBacktrack[62]);

			int LA62_0 = input.LA(1);
			if ( (LA62_0==67) ) {
				alt62=1;
			}
			else if ( (LA62_0==71) ) {
				alt62=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(62);}

			switch (alt62) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:757:3: 'case' ruleTypeList
					{
					dbg.location(757,3);
					match(input,67,FOLLOW_67_in_ruleTypeSwitchCase2349); if (state.failed) return;dbg.location(758,3);
					pushFollow(FOLLOW_ruleTypeList_in_ruleTypeSwitchCase2353);
					ruleTypeList();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:760:3: 'default'
					{
					dbg.location(760,3);
					match(input,71,FOLLOW_71_in_ruleTypeSwitchCase2365); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(62);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(762, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeSwitchCase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeSwitchCase"



	// $ANTLR start "ruleTypeList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:765:1: ruleTypeList : ruleType ( ',' ruleType )* ;
	public final void ruleTypeList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(765, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:765:13: ( ruleType ( ',' ruleType )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:766:2: ruleType ( ',' ruleType )*
			{
			dbg.location(766,2);
			pushFollow(FOLLOW_ruleType_in_ruleTypeList2378);
			ruleType();
			state._fsp--;
			if (state.failed) return;dbg.location(767,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:767:2: ( ',' ruleType )*
			try { dbg.enterSubRule(63);

			loop63:
			while (true) {
				int alt63=2;
				try { dbg.enterDecision(63, decisionCanBacktrack[63]);

				int LA63_0 = input.LA(1);
				if ( (LA63_0==48) ) {
					alt63=1;
				}

				} finally {dbg.exitDecision(63);}

				switch (alt63) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:768:3: ',' ruleType
					{
					dbg.location(768,3);
					match(input,48,FOLLOW_48_in_ruleTypeList2385); if (state.failed) return;dbg.location(769,3);
					pushFollow(FOLLOW_ruleType_in_ruleTypeList2389);
					ruleType();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop63;
				}
			}
			} finally {dbg.exitSubRule(63);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(771, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeList"



	// $ANTLR start "ruleCommClause"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:774:1: ruleCommClause : ruleCommCase ':' ruleStatementList ;
	public final void ruleCommClause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleCommClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(774, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:774:15: ( ruleCommCase ':' ruleStatementList )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:775:2: ruleCommCase ':' ruleStatementList
			{
			dbg.location(775,2);
			pushFollow(FOLLOW_ruleCommCase_in_ruleCommClause2403);
			ruleCommCase();
			state._fsp--;
			if (state.failed) return;dbg.location(776,2);
			match(input,54,FOLLOW_54_in_ruleCommClause2406); if (state.failed) return;dbg.location(777,2);
			pushFollow(FOLLOW_ruleStatementList_in_ruleCommClause2409);
			ruleStatementList();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(778, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleCommClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleCommClause"



	// $ANTLR start "ruleCommCase"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:781:1: ruleCommCase : ( 'case' ( ruleSendStmt | ruleRecvStmt ) | 'default' ) ;
	public final void ruleCommCase() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleCommCase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(781, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:781:13: ( ( 'case' ( ruleSendStmt | ruleRecvStmt ) | 'default' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:782:2: ( 'case' ( ruleSendStmt | ruleRecvStmt ) | 'default' )
			{
			dbg.location(782,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:782:2: ( 'case' ( ruleSendStmt | ruleRecvStmt ) | 'default' )
			int alt65=2;
			try { dbg.enterSubRule(65);
			try { dbg.enterDecision(65, decisionCanBacktrack[65]);

			int LA65_0 = input.LA(1);
			if ( (LA65_0==67) ) {
				alt65=1;
			}
			else if ( (LA65_0==71) ) {
				alt65=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(65);}

			switch (alt65) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:783:3: 'case' ( ruleSendStmt | ruleRecvStmt )
					{
					dbg.location(783,3);
					match(input,67,FOLLOW_67_in_ruleCommCase2423); if (state.failed) return;dbg.location(784,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:784:3: ( ruleSendStmt | ruleRecvStmt )
					int alt64=2;
					try { dbg.enterSubRule(64);
					try { dbg.enterDecision(64, decisionCanBacktrack[64]);

					switch ( input.LA(1) ) {
					case RULE_INT_LIT:
						{
						int LA64_1 = input.LA(2);
						if ( (synpred106_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case RULE_FLOAT_LIT:
						{
						int LA64_2 = input.LA(2);
						if ( (synpred106_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case RULE_DECIMALS:
						{
						int LA64_3 = input.LA(2);
						if ( (synpred106_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 62:
						{
						int LA64_4 = input.LA(2);
						if ( (synpred106_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case RULE_STRING:
						{
						int LA64_5 = input.LA(2);
						if ( (synpred106_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 86:
						{
						int LA64_6 = input.LA(2);
						if ( (synpred106_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 61:
						{
						int LA64_7 = input.LA(2);
						if ( (synpred106_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 81:
						{
						int LA64_8 = input.LA(2);
						if ( (synpred106_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case RULE_LETTER:
						{
						int LA64_9 = input.LA(2);
						if ( (synpred106_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 76:
						{
						int LA64_10 = input.LA(2);
						if ( (synpred106_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 43:
						{
						int LA64_11 = input.LA(2);
						if ( (synpred106_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 45:
						{
						int LA64_12 = input.LA(2);
						if ( (synpred106_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 80:
						{
						int LA64_13 = input.LA(2);
						if ( (synpred106_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 68:
						{
						int LA64_14 = input.LA(2);
						if ( (synpred106_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 57:
						{
						int LA64_15 = input.LA(2);
						if ( (synpred106_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case RULE_UNARY_OP:
						{
						int LA64_16 = input.LA(2);
						if ( (synpred106_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 64, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(64);}

					switch (alt64) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:785:4: ruleSendStmt
							{
							dbg.location(785,4);
							pushFollow(FOLLOW_ruleSendStmt_in_ruleCommCase2432);
							ruleSendStmt();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:787:4: ruleRecvStmt
							{
							dbg.location(787,4);
							pushFollow(FOLLOW_ruleRecvStmt_in_ruleCommCase2446);
							ruleRecvStmt();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(64);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:790:3: 'default'
					{
					dbg.location(790,3);
					match(input,71,FOLLOW_71_in_ruleCommCase2462); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(65);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(792, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleCommCase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleCommCase"



	// $ANTLR start "ruleRecvStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:795:1: ruleRecvStmt : ( ruleExpressionList '=' | ruleIdentifierList ':=' )? ruleRecvExpr ;
	public final void ruleRecvStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleRecvStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(795, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:795:13: ( ( ruleExpressionList '=' | ruleIdentifierList ':=' )? ruleRecvExpr )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:796:2: ( ruleExpressionList '=' | ruleIdentifierList ':=' )? ruleRecvExpr
			{
			dbg.location(796,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:796:2: ( ruleExpressionList '=' | ruleIdentifierList ':=' )?
			int alt66=3;
			try { dbg.enterSubRule(66);
			try { dbg.enterDecision(66, decisionCanBacktrack[66]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA66_1 = input.LA(2);
					if ( (synpred108_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA66_2 = input.LA(2);
					if ( (synpred108_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA66_3 = input.LA(2);
					if ( (synpred108_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 62:
					{
					int LA66_4 = input.LA(2);
					if ( (synpred108_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA66_5 = input.LA(2);
					if ( (synpred108_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 86:
					{
					int LA66_6 = input.LA(2);
					if ( (synpred108_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 61:
					{
					int LA66_7 = input.LA(2);
					if ( (synpred108_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 81:
					{
					int LA66_8 = input.LA(2);
					if ( (synpred108_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case RULE_LETTER:
					{
					int LA66_9 = input.LA(2);
					if ( (synpred108_DebugInternalGo()) ) {
						alt66=1;
					}
					else if ( (synpred109_DebugInternalGo()) ) {
						alt66=2;
					}
					}
					break;
				case 76:
					{
					int LA66_10 = input.LA(2);
					if ( (synpred108_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 43:
					{
					int LA66_11 = input.LA(2);
					if ( (synpred108_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 45:
					{
					int LA66_12 = input.LA(2);
					if ( (synpred108_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 80:
					{
					int LA66_13 = input.LA(2);
					if ( (synpred108_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 68:
					{
					int LA66_14 = input.LA(2);
					if ( (synpred108_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 57:
					{
					int LA66_15 = input.LA(2);
					if ( (synpred108_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA66_16 = input.LA(2);
					if ( (synpred108_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(66);}

			switch (alt66) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:797:3: ruleExpressionList '='
					{
					dbg.location(797,3);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleRecvStmt2479);
					ruleExpressionList();
					state._fsp--;
					if (state.failed) return;dbg.location(798,3);
					match(input,59,FOLLOW_59_in_ruleRecvStmt2483); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:800:3: ruleIdentifierList ':='
					{
					dbg.location(800,3);
					pushFollow(FOLLOW_ruleIdentifierList_in_ruleRecvStmt2495);
					ruleIdentifierList();
					state._fsp--;
					if (state.failed) return;dbg.location(801,3);
					match(input,55,FOLLOW_55_in_ruleRecvStmt2499); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(66);}
			dbg.location(803,2);
			pushFollow(FOLLOW_ruleRecvExpr_in_ruleRecvStmt2506);
			ruleRecvExpr();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(804, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleRecvStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleRecvStmt"



	// $ANTLR start "ruleRecvExpr"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:807:1: ruleRecvExpr : ruleExpression ;
	public final void ruleRecvExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleRecvExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(807, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:807:13: ( ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:808:2: ruleExpression
			{
			dbg.location(808,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleRecvExpr2516);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(809, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleRecvExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleRecvExpr"



	// $ANTLR start "ruleCondition"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:812:1: ruleCondition : ruleExpression ;
	public final void ruleCondition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleCondition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(812, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:812:14: ( ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:813:2: ruleExpression
			{
			dbg.location(813,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleCondition2526);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(814, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleCondition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleCondition"



	// $ANTLR start "ruleForClause"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:817:1: ruleForClause : ( ruleInitStmt )? ';' ( ruleCondition )? ';' ( rulePostStmt )? ;
	public final void ruleForClause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleForClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(817, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:817:14: ( ( ruleInitStmt )? ';' ( ruleCondition )? ';' ( rulePostStmt )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:818:2: ( ruleInitStmt )? ';' ( ruleCondition )? ';' ( rulePostStmt )?
			{
			dbg.location(818,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:818:2: ( ruleInitStmt )?
			int alt67=2;
			try { dbg.enterSubRule(67);
			try { dbg.enterDecision(67, decisionCanBacktrack[67]);

			int LA67_0 = input.LA(1);
			if ( (LA67_0==RULE_DECIMALS||LA67_0==RULE_FLOAT_LIT||(LA67_0 >= RULE_INT_LIT && LA67_0 <= RULE_LETTER)||(LA67_0 >= RULE_STRING && LA67_0 <= RULE_UNARY_OP)||LA67_0==43||LA67_0==45||LA67_0==57||(LA67_0 >= 61 && LA67_0 <= 62)||LA67_0==68||LA67_0==76||(LA67_0 >= 80 && LA67_0 <= 81)||LA67_0==86) ) {
				alt67=1;
			}
			else if ( (LA67_0==56) ) {
				int LA67_17 = input.LA(2);
				if ( (synpred110_DebugInternalGo()) ) {
					alt67=1;
				}
			}
			} finally {dbg.exitDecision(67);}

			switch (alt67) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:818:2: ruleInitStmt
					{
					dbg.location(818,2);
					pushFollow(FOLLOW_ruleInitStmt_in_ruleForClause2536);
					ruleInitStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(67);}
			dbg.location(820,2);
			match(input,56,FOLLOW_56_in_ruleForClause2542); if (state.failed) return;dbg.location(821,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:821:2: ( ruleCondition )?
			int alt68=2;
			try { dbg.enterSubRule(68);
			try { dbg.enterDecision(68, decisionCanBacktrack[68]);

			int LA68_0 = input.LA(1);
			if ( (LA68_0==RULE_DECIMALS||LA68_0==RULE_FLOAT_LIT||(LA68_0 >= RULE_INT_LIT && LA68_0 <= RULE_LETTER)||(LA68_0 >= RULE_STRING && LA68_0 <= RULE_UNARY_OP)||LA68_0==43||LA68_0==45||LA68_0==57||(LA68_0 >= 61 && LA68_0 <= 62)||LA68_0==68||LA68_0==76||(LA68_0 >= 80 && LA68_0 <= 81)||LA68_0==86) ) {
				alt68=1;
			}
			} finally {dbg.exitDecision(68);}

			switch (alt68) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:821:2: ruleCondition
					{
					dbg.location(821,2);
					pushFollow(FOLLOW_ruleCondition_in_ruleForClause2545);
					ruleCondition();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(68);}
			dbg.location(823,2);
			match(input,56,FOLLOW_56_in_ruleForClause2551); if (state.failed) return;dbg.location(824,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:824:2: ( rulePostStmt )?
			int alt69=2;
			try { dbg.enterSubRule(69);
			try { dbg.enterDecision(69, decisionCanBacktrack[69]);

			int LA69_0 = input.LA(1);
			if ( (LA69_0==RULE_DECIMALS||LA69_0==RULE_FLOAT_LIT||(LA69_0 >= RULE_INT_LIT && LA69_0 <= RULE_LETTER)||(LA69_0 >= RULE_STRING && LA69_0 <= RULE_UNARY_OP)||LA69_0==43||LA69_0==45||(LA69_0 >= 56 && LA69_0 <= 57)||(LA69_0 >= 61 && LA69_0 <= 62)||LA69_0==68||LA69_0==76||(LA69_0 >= 80 && LA69_0 <= 81)||LA69_0==86) ) {
				alt69=1;
			}
			} finally {dbg.exitDecision(69);}

			switch (alt69) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:824:2: rulePostStmt
					{
					dbg.location(824,2);
					pushFollow(FOLLOW_rulePostStmt_in_ruleForClause2554);
					rulePostStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(69);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(826, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleForClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleForClause"



	// $ANTLR start "ruleRangeClause"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:829:1: ruleRangeClause : ( ruleExpressionList '=' | ruleIdentifierList ':=' )? 'range' ruleExpression ;
	public final void ruleRangeClause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleRangeClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(829, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:829:16: ( ( ruleExpressionList '=' | ruleIdentifierList ':=' )? 'range' ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:830:2: ( ruleExpressionList '=' | ruleIdentifierList ':=' )? 'range' ruleExpression
			{
			dbg.location(830,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:830:2: ( ruleExpressionList '=' | ruleIdentifierList ':=' )?
			int alt70=3;
			try { dbg.enterSubRule(70);
			try { dbg.enterDecision(70, decisionCanBacktrack[70]);

			try {
				isCyclicDecision = true;
				alt70 = dfa70.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(70);}

			switch (alt70) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:831:3: ruleExpressionList '='
					{
					dbg.location(831,3);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleRangeClause2571);
					ruleExpressionList();
					state._fsp--;
					if (state.failed) return;dbg.location(832,3);
					match(input,59,FOLLOW_59_in_ruleRangeClause2575); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:834:3: ruleIdentifierList ':='
					{
					dbg.location(834,3);
					pushFollow(FOLLOW_ruleIdentifierList_in_ruleRangeClause2587);
					ruleIdentifierList();
					state._fsp--;
					if (state.failed) return;dbg.location(835,3);
					match(input,55,FOLLOW_55_in_ruleRangeClause2591); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(70);}
			dbg.location(837,2);
			match(input,83,FOLLOW_83_in_ruleRangeClause2598); if (state.failed) return;dbg.location(838,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleRangeClause2601);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(839, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleRangeClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleRangeClause"



	// $ANTLR start "ruleInitStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:842:1: ruleInitStmt : ruleSimpleStmt ;
	public final void ruleInitStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleInitStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(842, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:842:13: ( ruleSimpleStmt )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:843:2: ruleSimpleStmt
			{
			dbg.location(843,2);
			pushFollow(FOLLOW_ruleSimpleStmt_in_ruleInitStmt2611);
			ruleSimpleStmt();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(844, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleInitStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleInitStmt"



	// $ANTLR start "rulePostStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:847:1: rulePostStmt : ruleSimpleStmt ;
	public final void rulePostStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulePostStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(847, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:847:13: ( ruleSimpleStmt )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:848:2: ruleSimpleStmt
			{
			dbg.location(848,2);
			pushFollow(FOLLOW_ruleSimpleStmt_in_rulePostStmt2621);
			ruleSimpleStmt();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(849, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulePostStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulePostStmt"



	// $ANTLR start "ruleLabel"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:852:1: ruleLabel : ruleIDENTIFIER ;
	public final void ruleLabel() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleLabel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(852, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:852:10: ( ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:853:2: ruleIDENTIFIER
			{
			dbg.location(853,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleLabel2631);
			ruleIDENTIFIER();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(854, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleLabel");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleLabel"



	// $ANTLR start "ruleExpressionList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:857:1: ruleExpressionList : ruleExpression ( ',' ruleExpression )* ;
	public final void ruleExpressionList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExpressionList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(857, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:857:19: ( ruleExpression ( ',' ruleExpression )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:858:2: ruleExpression ( ',' ruleExpression )*
			{
			dbg.location(858,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList2641);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(859,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:859:2: ( ',' ruleExpression )*
			try { dbg.enterSubRule(71);

			loop71:
			while (true) {
				int alt71=2;
				try { dbg.enterDecision(71, decisionCanBacktrack[71]);

				int LA71_0 = input.LA(1);
				if ( (LA71_0==48) ) {
					int LA71_2 = input.LA(2);
					if ( (LA71_2==RULE_DECIMALS||LA71_2==RULE_FLOAT_LIT||(LA71_2 >= RULE_INT_LIT && LA71_2 <= RULE_LETTER)||(LA71_2 >= RULE_STRING && LA71_2 <= RULE_UNARY_OP)||LA71_2==43||LA71_2==45||LA71_2==57||(LA71_2 >= 61 && LA71_2 <= 62)||LA71_2==68||LA71_2==76||(LA71_2 >= 80 && LA71_2 <= 81)||LA71_2==86) ) {
						alt71=1;
					}

				}

				} finally {dbg.exitDecision(71);}

				switch (alt71) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:860:3: ',' ruleExpression
					{
					dbg.location(860,3);
					match(input,48,FOLLOW_48_in_ruleExpressionList2648); if (state.failed) return;dbg.location(861,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList2652);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop71;
				}
			}
			} finally {dbg.exitSubRule(71);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(863, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExpressionList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExpressionList"



	// $ANTLR start "ruleExpression"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:866:1: ruleExpression : ruleUnaryExpr ruleExpression2 ;
	public final void ruleExpression() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(866, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:866:15: ( ruleUnaryExpr ruleExpression2 )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:867:2: ruleUnaryExpr ruleExpression2
			{
			dbg.location(867,2);
			pushFollow(FOLLOW_ruleUnaryExpr_in_ruleExpression2666);
			ruleUnaryExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(868,2);
			pushFollow(FOLLOW_ruleExpression2_in_ruleExpression2669);
			ruleExpression2();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(869, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExpression"



	// $ANTLR start "ruleExpression2"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:872:1: ruleExpression2 : ( RULE_BINARY_OP ruleExpression ruleExpression2 )? ;
	public final void ruleExpression2() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExpression2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(872, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:872:16: ( ( RULE_BINARY_OP ruleExpression ruleExpression2 )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:873:2: ( RULE_BINARY_OP ruleExpression ruleExpression2 )?
			{
			dbg.location(873,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:873:2: ( RULE_BINARY_OP ruleExpression ruleExpression2 )?
			int alt72=2;
			try { dbg.enterSubRule(72);
			try { dbg.enterDecision(72, decisionCanBacktrack[72]);

			int LA72_0 = input.LA(1);
			if ( (LA72_0==RULE_BINARY_OP) ) {
				int LA72_1 = input.LA(2);
				if ( (synpred116_DebugInternalGo()) ) {
					alt72=1;
				}
			}
			} finally {dbg.exitDecision(72);}

			switch (alt72) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:874:3: RULE_BINARY_OP ruleExpression ruleExpression2
					{
					dbg.location(874,3);
					match(input,RULE_BINARY_OP,FOLLOW_RULE_BINARY_OP_in_ruleExpression22683); if (state.failed) return;dbg.location(875,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleExpression22687);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(876,3);
					pushFollow(FOLLOW_ruleExpression2_in_ruleExpression22691);
					ruleExpression2();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(72);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(878, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExpression2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExpression2"



	// $ANTLR start "ruleUnaryExpr"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:881:1: ruleUnaryExpr : ( rulePrimaryExpr | RULE_UNARY_OP ruleUnaryExpr ) ;
	public final void ruleUnaryExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleUnaryExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(881, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:881:14: ( ( rulePrimaryExpr | RULE_UNARY_OP ruleUnaryExpr ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:882:2: ( rulePrimaryExpr | RULE_UNARY_OP ruleUnaryExpr )
			{
			dbg.location(882,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:882:2: ( rulePrimaryExpr | RULE_UNARY_OP ruleUnaryExpr )
			int alt73=2;
			try { dbg.enterSubRule(73);
			try { dbg.enterDecision(73, decisionCanBacktrack[73]);

			int LA73_0 = input.LA(1);
			if ( (LA73_0==RULE_DECIMALS||LA73_0==RULE_FLOAT_LIT||(LA73_0 >= RULE_INT_LIT && LA73_0 <= RULE_LETTER)||LA73_0==RULE_STRING||LA73_0==43||LA73_0==45||LA73_0==57||(LA73_0 >= 61 && LA73_0 <= 62)||LA73_0==68||LA73_0==76||(LA73_0 >= 80 && LA73_0 <= 81)||LA73_0==86) ) {
				alt73=1;
			}
			else if ( (LA73_0==RULE_UNARY_OP) ) {
				alt73=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(73);}

			switch (alt73) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:883:3: rulePrimaryExpr
					{
					dbg.location(883,3);
					pushFollow(FOLLOW_rulePrimaryExpr_in_ruleUnaryExpr2709);
					rulePrimaryExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:885:3: RULE_UNARY_OP ruleUnaryExpr
					{
					dbg.location(885,3);
					match(input,RULE_UNARY_OP,FOLLOW_RULE_UNARY_OP_in_ruleUnaryExpr2721); if (state.failed) return;dbg.location(886,3);
					pushFollow(FOLLOW_ruleUnaryExpr_in_ruleUnaryExpr2725);
					ruleUnaryExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(73);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(888, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleUnaryExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleUnaryExpr"



	// $ANTLR start "rulePrimaryExpr"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:891:1: rulePrimaryExpr : ( ruleOperand rulePrimaryExpr2 | ruleConversion rulePrimaryExpr2 | ruleMethodExpr rulePrimaryExpr2 ) ;
	public final void rulePrimaryExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulePrimaryExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(891, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:891:16: ( ( ruleOperand rulePrimaryExpr2 | ruleConversion rulePrimaryExpr2 | ruleMethodExpr rulePrimaryExpr2 ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:892:2: ( ruleOperand rulePrimaryExpr2 | ruleConversion rulePrimaryExpr2 | ruleMethodExpr rulePrimaryExpr2 )
			{
			dbg.location(892,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:892:2: ( ruleOperand rulePrimaryExpr2 | ruleConversion rulePrimaryExpr2 | ruleMethodExpr rulePrimaryExpr2 )
			int alt74=3;
			try { dbg.enterSubRule(74);
			try { dbg.enterDecision(74, decisionCanBacktrack[74]);

			switch ( input.LA(1) ) {
			case RULE_DECIMALS:
			case RULE_FLOAT_LIT:
			case RULE_INT_LIT:
			case RULE_STRING:
			case 62:
				{
				alt74=1;
				}
				break;
			case 86:
				{
				int LA74_6 = input.LA(2);
				if ( (synpred118_DebugInternalGo()) ) {
					alt74=1;
				}
				else if ( (synpred119_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case 61:
				{
				int LA74_7 = input.LA(2);
				if ( (synpred118_DebugInternalGo()) ) {
					alt74=1;
				}
				else if ( (synpred119_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case 81:
				{
				int LA74_8 = input.LA(2);
				if ( (synpred118_DebugInternalGo()) ) {
					alt74=1;
				}
				else if ( (synpred119_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case RULE_LETTER:
				{
				int LA74_9 = input.LA(2);
				if ( (synpred118_DebugInternalGo()) ) {
					alt74=1;
				}
				else if ( (synpred119_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case 76:
				{
				int LA74_10 = input.LA(2);
				if ( (synpred118_DebugInternalGo()) ) {
					alt74=1;
				}
				else if ( (synpred119_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case 43:
				{
				int LA74_11 = input.LA(2);
				if ( (synpred118_DebugInternalGo()) ) {
					alt74=1;
				}
				else if ( (synpred119_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case 45:
				{
				int LA74_12 = input.LA(2);
				if ( (synpred119_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case 80:
				{
				int LA74_13 = input.LA(2);
				if ( (synpred119_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case 68:
				{
				int LA74_14 = input.LA(2);
				if ( (synpred119_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case 57:
				{
				int LA74_15 = input.LA(2);
				if ( (synpred119_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(74);}

			switch (alt74) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:893:3: ruleOperand rulePrimaryExpr2
					{
					dbg.location(893,3);
					pushFollow(FOLLOW_ruleOperand_in_rulePrimaryExpr2742);
					ruleOperand();
					state._fsp--;
					if (state.failed) return;dbg.location(894,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2746);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:896:3: ruleConversion rulePrimaryExpr2
					{
					dbg.location(896,3);
					pushFollow(FOLLOW_ruleConversion_in_rulePrimaryExpr2758);
					ruleConversion();
					state._fsp--;
					if (state.failed) return;dbg.location(897,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2762);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:899:3: ruleMethodExpr rulePrimaryExpr2
					{
					dbg.location(899,3);
					pushFollow(FOLLOW_ruleMethodExpr_in_rulePrimaryExpr2774);
					ruleMethodExpr();
					state._fsp--;
					if (state.failed) return;dbg.location(900,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2778);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(74);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(902, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulePrimaryExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulePrimaryExpr"



	// $ANTLR start "rulePrimaryExpr2"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:905:1: rulePrimaryExpr2 : ( ruleSelector rulePrimaryExpr2 | ruleIndex rulePrimaryExpr2 | ruleSlice rulePrimaryExpr2 | ruleTypeAssertion rulePrimaryExpr2 | ruleArguments rulePrimaryExpr2 )? ;
	public final void rulePrimaryExpr2() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulePrimaryExpr2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(905, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:905:17: ( ( ruleSelector rulePrimaryExpr2 | ruleIndex rulePrimaryExpr2 | ruleSlice rulePrimaryExpr2 | ruleTypeAssertion rulePrimaryExpr2 | ruleArguments rulePrimaryExpr2 )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:906:2: ( ruleSelector rulePrimaryExpr2 | ruleIndex rulePrimaryExpr2 | ruleSlice rulePrimaryExpr2 | ruleTypeAssertion rulePrimaryExpr2 | ruleArguments rulePrimaryExpr2 )?
			{
			dbg.location(906,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:906:2: ( ruleSelector rulePrimaryExpr2 | ruleIndex rulePrimaryExpr2 | ruleSlice rulePrimaryExpr2 | ruleTypeAssertion rulePrimaryExpr2 | ruleArguments rulePrimaryExpr2 )?
			int alt75=6;
			try { dbg.enterSubRule(75);
			try { dbg.enterDecision(75, decisionCanBacktrack[75]);

			switch ( input.LA(1) ) {
				case 51:
					{
					int LA75_1 = input.LA(2);
					if ( (synpred120_DebugInternalGo()) ) {
						alt75=1;
					}
					else if ( (synpred123_DebugInternalGo()) ) {
						alt75=4;
					}
					}
					break;
				case 61:
					{
					int LA75_2 = input.LA(2);
					if ( (synpred121_DebugInternalGo()) ) {
						alt75=2;
					}
					else if ( (synpred122_DebugInternalGo()) ) {
						alt75=3;
					}
					}
					break;
				case 43:
					{
					int LA75_3 = input.LA(2);
					if ( (synpred124_DebugInternalGo()) ) {
						alt75=5;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(75);}

			switch (alt75) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:907:3: ruleSelector rulePrimaryExpr2
					{
					dbg.location(907,3);
					pushFollow(FOLLOW_ruleSelector_in_rulePrimaryExpr22795);
					ruleSelector();
					state._fsp--;
					if (state.failed) return;dbg.location(908,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22799);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:910:3: ruleIndex rulePrimaryExpr2
					{
					dbg.location(910,3);
					pushFollow(FOLLOW_ruleIndex_in_rulePrimaryExpr22811);
					ruleIndex();
					state._fsp--;
					if (state.failed) return;dbg.location(911,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22815);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:913:3: ruleSlice rulePrimaryExpr2
					{
					dbg.location(913,3);
					pushFollow(FOLLOW_ruleSlice_in_rulePrimaryExpr22827);
					ruleSlice();
					state._fsp--;
					if (state.failed) return;dbg.location(914,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22831);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:916:3: ruleTypeAssertion rulePrimaryExpr2
					{
					dbg.location(916,3);
					pushFollow(FOLLOW_ruleTypeAssertion_in_rulePrimaryExpr22843);
					ruleTypeAssertion();
					state._fsp--;
					if (state.failed) return;dbg.location(917,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22847);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:919:3: ruleArguments rulePrimaryExpr2
					{
					dbg.location(919,3);
					pushFollow(FOLLOW_ruleArguments_in_rulePrimaryExpr22859);
					ruleArguments();
					state._fsp--;
					if (state.failed) return;dbg.location(920,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22863);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(75);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(922, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulePrimaryExpr2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulePrimaryExpr2"



	// $ANTLR start "ruleOperand"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:925:1: ruleOperand : ( ruleLiteral | ruleOperandName | '(' ruleExpression ')' ) ;
	public final void ruleOperand() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleOperand");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(925, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:925:12: ( ( ruleLiteral | ruleOperandName | '(' ruleExpression ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:926:2: ( ruleLiteral | ruleOperandName | '(' ruleExpression ')' )
			{
			dbg.location(926,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:926:2: ( ruleLiteral | ruleOperandName | '(' ruleExpression ')' )
			int alt76=3;
			try { dbg.enterSubRule(76);
			try { dbg.enterDecision(76, decisionCanBacktrack[76]);

			switch ( input.LA(1) ) {
			case RULE_DECIMALS:
			case RULE_FLOAT_LIT:
			case RULE_INT_LIT:
			case RULE_STRING:
			case 61:
			case 62:
			case 76:
			case 81:
			case 86:
				{
				alt76=1;
				}
				break;
			case RULE_LETTER:
				{
				int LA76_9 = input.LA(2);
				if ( (synpred125_DebugInternalGo()) ) {
					alt76=1;
				}
				else if ( (synpred126_DebugInternalGo()) ) {
					alt76=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 76, 9, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 43:
				{
				alt76=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(76);}

			switch (alt76) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:927:3: ruleLiteral
					{
					dbg.location(927,3);
					pushFollow(FOLLOW_ruleLiteral_in_ruleOperand2881);
					ruleLiteral();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:929:3: ruleOperandName
					{
					dbg.location(929,3);
					pushFollow(FOLLOW_ruleOperandName_in_ruleOperand2893);
					ruleOperandName();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:931:3: '(' ruleExpression ')'
					{
					dbg.location(931,3);
					match(input,43,FOLLOW_43_in_ruleOperand2905); if (state.failed) return;dbg.location(932,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleOperand2909);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(933,3);
					match(input,44,FOLLOW_44_in_ruleOperand2913); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(76);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(935, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleOperand");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleOperand"



	// $ANTLR start "ruleConversion"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:938:1: ruleConversion : ruleType '(' ruleExpression ( ',' )? ')' ;
	public final void ruleConversion() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleConversion");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(938, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:938:15: ( ruleType '(' ruleExpression ( ',' )? ')' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:939:2: ruleType '(' ruleExpression ( ',' )? ')'
			{
			dbg.location(939,2);
			pushFollow(FOLLOW_ruleType_in_ruleConversion2926);
			ruleType();
			state._fsp--;
			if (state.failed) return;dbg.location(940,2);
			match(input,43,FOLLOW_43_in_ruleConversion2929); if (state.failed) return;dbg.location(941,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleConversion2932);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(942,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:942:2: ( ',' )?
			int alt77=2;
			try { dbg.enterSubRule(77);
			try { dbg.enterDecision(77, decisionCanBacktrack[77]);

			int LA77_0 = input.LA(1);
			if ( (LA77_0==48) ) {
				alt77=1;
			}
			} finally {dbg.exitDecision(77);}

			switch (alt77) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:942:2: ','
					{
					dbg.location(942,2);
					match(input,48,FOLLOW_48_in_ruleConversion2935); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(77);}
			dbg.location(943,2);
			match(input,44,FOLLOW_44_in_ruleConversion2939); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(944, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleConversion");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleConversion"



	// $ANTLR start "ruleMethodExpr"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:947:1: ruleMethodExpr : ruleReceiverType '.' ruleMethodName ;
	public final void ruleMethodExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleMethodExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(947, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:947:15: ( ruleReceiverType '.' ruleMethodName )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:948:2: ruleReceiverType '.' ruleMethodName
			{
			dbg.location(948,2);
			pushFollow(FOLLOW_ruleReceiverType_in_ruleMethodExpr2949);
			ruleReceiverType();
			state._fsp--;
			if (state.failed) return;dbg.location(949,2);
			match(input,51,FOLLOW_51_in_ruleMethodExpr2952); if (state.failed) return;dbg.location(950,2);
			pushFollow(FOLLOW_ruleMethodName_in_ruleMethodExpr2955);
			ruleMethodName();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(951, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleMethodExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleMethodExpr"



	// $ANTLR start "ruleSelector"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:954:1: ruleSelector : '.' ruleIDENTIFIER ;
	public final void ruleSelector() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSelector");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(954, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:954:13: ( '.' ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:955:2: '.' ruleIDENTIFIER
			{
			dbg.location(955,2);
			match(input,51,FOLLOW_51_in_ruleSelector2965); if (state.failed) return;dbg.location(956,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleSelector2968);
			ruleIDENTIFIER();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(957, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSelector");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSelector"



	// $ANTLR start "ruleIndex"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:960:1: ruleIndex : '[' ruleExpression ']' ;
	public final void ruleIndex() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIndex");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(960, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:960:10: ( '[' ruleExpression ']' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:961:2: '[' ruleExpression ']'
			{
			dbg.location(961,2);
			match(input,61,FOLLOW_61_in_ruleIndex2978); if (state.failed) return;dbg.location(962,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleIndex2981);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(963,2);
			match(input,64,FOLLOW_64_in_ruleIndex2984); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(964, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIndex");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIndex"



	// $ANTLR start "ruleSlice"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:967:1: ruleSlice : ( '[' ( ruleExpression )? ':' ( ruleExpression )? ']' | '[' ( ruleExpression )? ':' ruleExpression ':' ruleExpression ']' ) ;
	public final void ruleSlice() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSlice");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(967, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:967:10: ( ( '[' ( ruleExpression )? ':' ( ruleExpression )? ']' | '[' ( ruleExpression )? ':' ruleExpression ':' ruleExpression ']' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:968:2: ( '[' ( ruleExpression )? ':' ( ruleExpression )? ']' | '[' ( ruleExpression )? ':' ruleExpression ':' ruleExpression ']' )
			{
			dbg.location(968,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:968:2: ( '[' ( ruleExpression )? ':' ( ruleExpression )? ']' | '[' ( ruleExpression )? ':' ruleExpression ':' ruleExpression ']' )
			int alt81=2;
			try { dbg.enterSubRule(81);
			try { dbg.enterDecision(81, decisionCanBacktrack[81]);

			int LA81_0 = input.LA(1);
			if ( (LA81_0==61) ) {
				int LA81_1 = input.LA(2);
				if ( (synpred130_DebugInternalGo()) ) {
					alt81=1;
				}
				else if ( (true) ) {
					alt81=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(81);}

			switch (alt81) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:969:3: '[' ( ruleExpression )? ':' ( ruleExpression )? ']'
					{
					dbg.location(969,3);
					match(input,61,FOLLOW_61_in_ruleSlice2998); if (state.failed) return;dbg.location(970,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:970:3: ( ruleExpression )?
					int alt78=2;
					try { dbg.enterSubRule(78);
					try { dbg.enterDecision(78, decisionCanBacktrack[78]);

					int LA78_0 = input.LA(1);
					if ( (LA78_0==RULE_DECIMALS||LA78_0==RULE_FLOAT_LIT||(LA78_0 >= RULE_INT_LIT && LA78_0 <= RULE_LETTER)||(LA78_0 >= RULE_STRING && LA78_0 <= RULE_UNARY_OP)||LA78_0==43||LA78_0==45||LA78_0==57||(LA78_0 >= 61 && LA78_0 <= 62)||LA78_0==68||LA78_0==76||(LA78_0 >= 80 && LA78_0 <= 81)||LA78_0==86) ) {
						alt78=1;
					}
					} finally {dbg.exitDecision(78);}

					switch (alt78) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:970:3: ruleExpression
							{
							dbg.location(970,3);
							pushFollow(FOLLOW_ruleExpression_in_ruleSlice3002);
							ruleExpression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(78);}
					dbg.location(972,3);
					match(input,54,FOLLOW_54_in_ruleSlice3010); if (state.failed) return;dbg.location(973,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:973:3: ( ruleExpression )?
					int alt79=2;
					try { dbg.enterSubRule(79);
					try { dbg.enterDecision(79, decisionCanBacktrack[79]);

					int LA79_0 = input.LA(1);
					if ( (LA79_0==RULE_DECIMALS||LA79_0==RULE_FLOAT_LIT||(LA79_0 >= RULE_INT_LIT && LA79_0 <= RULE_LETTER)||(LA79_0 >= RULE_STRING && LA79_0 <= RULE_UNARY_OP)||LA79_0==43||LA79_0==45||LA79_0==57||(LA79_0 >= 61 && LA79_0 <= 62)||LA79_0==68||LA79_0==76||(LA79_0 >= 80 && LA79_0 <= 81)||LA79_0==86) ) {
						alt79=1;
					}
					} finally {dbg.exitDecision(79);}

					switch (alt79) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:973:3: ruleExpression
							{
							dbg.location(973,3);
							pushFollow(FOLLOW_ruleExpression_in_ruleSlice3014);
							ruleExpression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(79);}
					dbg.location(975,3);
					match(input,64,FOLLOW_64_in_ruleSlice3022); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:977:3: '[' ( ruleExpression )? ':' ruleExpression ':' ruleExpression ']'
					{
					dbg.location(977,3);
					match(input,61,FOLLOW_61_in_ruleSlice3034); if (state.failed) return;dbg.location(978,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:978:3: ( ruleExpression )?
					int alt80=2;
					try { dbg.enterSubRule(80);
					try { dbg.enterDecision(80, decisionCanBacktrack[80]);

					int LA80_0 = input.LA(1);
					if ( (LA80_0==RULE_DECIMALS||LA80_0==RULE_FLOAT_LIT||(LA80_0 >= RULE_INT_LIT && LA80_0 <= RULE_LETTER)||(LA80_0 >= RULE_STRING && LA80_0 <= RULE_UNARY_OP)||LA80_0==43||LA80_0==45||LA80_0==57||(LA80_0 >= 61 && LA80_0 <= 62)||LA80_0==68||LA80_0==76||(LA80_0 >= 80 && LA80_0 <= 81)||LA80_0==86) ) {
						alt80=1;
					}
					} finally {dbg.exitDecision(80);}

					switch (alt80) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:978:3: ruleExpression
							{
							dbg.location(978,3);
							pushFollow(FOLLOW_ruleExpression_in_ruleSlice3038);
							ruleExpression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(80);}
					dbg.location(980,3);
					match(input,54,FOLLOW_54_in_ruleSlice3046); if (state.failed) return;dbg.location(981,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleSlice3050);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(982,3);
					match(input,54,FOLLOW_54_in_ruleSlice3054); if (state.failed) return;dbg.location(983,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleSlice3058);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(984,3);
					match(input,64,FOLLOW_64_in_ruleSlice3062); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(81);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(986, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSlice");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSlice"



	// $ANTLR start "ruleTypeAssertion"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:989:1: ruleTypeAssertion : '.' '(' ruleType ')' ;
	public final void ruleTypeAssertion() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeAssertion");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(989, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:989:18: ( '.' '(' ruleType ')' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:990:2: '.' '(' ruleType ')'
			{
			dbg.location(990,2);
			match(input,51,FOLLOW_51_in_ruleTypeAssertion3075); if (state.failed) return;dbg.location(991,2);
			match(input,43,FOLLOW_43_in_ruleTypeAssertion3078); if (state.failed) return;dbg.location(992,2);
			pushFollow(FOLLOW_ruleType_in_ruleTypeAssertion3081);
			ruleType();
			state._fsp--;
			if (state.failed) return;dbg.location(993,2);
			match(input,44,FOLLOW_44_in_ruleTypeAssertion3084); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(994, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeAssertion");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeAssertion"



	// $ANTLR start "ruleArguments"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:997:1: ruleArguments : '(' ( ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? ) ( '...' )? ( ',' )? )? ')' ;
	public final void ruleArguments() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleArguments");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(997, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:997:14: ( '(' ( ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? ) ( '...' )? ( ',' )? )? ')' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:998:2: '(' ( ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? ) ( '...' )? ( ',' )? )? ')'
			{
			dbg.location(998,2);
			match(input,43,FOLLOW_43_in_ruleArguments3094); if (state.failed) return;dbg.location(999,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:999:2: ( ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? ) ( '...' )? ( ',' )? )?
			int alt86=2;
			try { dbg.enterSubRule(86);
			try { dbg.enterDecision(86, decisionCanBacktrack[86]);

			int LA86_0 = input.LA(1);
			if ( (LA86_0==RULE_DECIMALS||LA86_0==RULE_FLOAT_LIT||(LA86_0 >= RULE_INT_LIT && LA86_0 <= RULE_LETTER)||(LA86_0 >= RULE_STRING && LA86_0 <= RULE_UNARY_OP)||LA86_0==43||LA86_0==45||LA86_0==57||(LA86_0 >= 61 && LA86_0 <= 62)||LA86_0==68||LA86_0==76||(LA86_0 >= 80 && LA86_0 <= 81)||LA86_0==86) ) {
				alt86=1;
			}
			} finally {dbg.exitDecision(86);}

			switch (alt86) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1000:3: ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? ) ( '...' )? ( ',' )?
					{
					dbg.location(1000,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1000:3: ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? )
					int alt83=2;
					try { dbg.enterSubRule(83);
					try { dbg.enterDecision(83, decisionCanBacktrack[83]);

					switch ( input.LA(1) ) {
					case RULE_DECIMALS:
					case RULE_FLOAT_LIT:
					case RULE_INT_LIT:
					case RULE_STRING:
					case RULE_UNARY_OP:
					case 62:
						{
						alt83=1;
						}
						break;
					case 86:
						{
						int LA83_6 = input.LA(2);
						if ( (synpred132_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case 61:
						{
						int LA83_7 = input.LA(2);
						if ( (synpred132_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case 81:
						{
						int LA83_8 = input.LA(2);
						if ( (synpred132_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case RULE_LETTER:
						{
						int LA83_9 = input.LA(2);
						if ( (synpred132_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case 76:
						{
						int LA83_10 = input.LA(2);
						if ( (synpred132_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case 43:
						{
						int LA83_11 = input.LA(2);
						if ( (synpred132_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case 45:
						{
						int LA83_12 = input.LA(2);
						if ( (synpred132_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case 80:
						{
						int LA83_13 = input.LA(2);
						if ( (synpred132_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case 68:
						{
						int LA83_14 = input.LA(2);
						if ( (synpred132_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case 57:
						{
						int LA83_15 = input.LA(2);
						if ( (synpred132_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 83, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(83);}

					switch (alt83) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1001:4: ruleExpressionList
							{
							dbg.location(1001,4);
							pushFollow(FOLLOW_ruleExpressionList_in_ruleArguments3106);
							ruleExpressionList();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1003:4: ruleType ( ',' ruleExpressionList )?
							{
							dbg.location(1003,4);
							pushFollow(FOLLOW_ruleType_in_ruleArguments3120);
							ruleType();
							state._fsp--;
							if (state.failed) return;dbg.location(1004,4);
							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1004:4: ( ',' ruleExpressionList )?
							int alt82=2;
							try { dbg.enterSubRule(82);
							try { dbg.enterDecision(82, decisionCanBacktrack[82]);

							int LA82_0 = input.LA(1);
							if ( (LA82_0==48) ) {
								int LA82_1 = input.LA(2);
								if ( (LA82_1==RULE_DECIMALS||LA82_1==RULE_FLOAT_LIT||(LA82_1 >= RULE_INT_LIT && LA82_1 <= RULE_LETTER)||(LA82_1 >= RULE_STRING && LA82_1 <= RULE_UNARY_OP)||LA82_1==43||LA82_1==45||LA82_1==57||(LA82_1 >= 61 && LA82_1 <= 62)||LA82_1==68||LA82_1==76||(LA82_1 >= 80 && LA82_1 <= 81)||LA82_1==86) ) {
									alt82=1;
								}
							}
							} finally {dbg.exitDecision(82);}

							switch (alt82) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1005:5: ',' ruleExpressionList
									{
									dbg.location(1005,5);
									match(input,48,FOLLOW_48_in_ruleArguments3131); if (state.failed) return;dbg.location(1006,5);
									pushFollow(FOLLOW_ruleExpressionList_in_ruleArguments3137);
									ruleExpressionList();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(82);}

							}
							break;

					}
					} finally {dbg.exitSubRule(83);}
					dbg.location(1009,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1009:3: ( '...' )?
					int alt84=2;
					try { dbg.enterSubRule(84);
					try { dbg.enterDecision(84, decisionCanBacktrack[84]);

					int LA84_0 = input.LA(1);
					if ( (LA84_0==52) ) {
						alt84=1;
					}
					} finally {dbg.exitDecision(84);}

					switch (alt84) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1009:3: '...'
							{
							dbg.location(1009,3);
							match(input,52,FOLLOW_52_in_ruleArguments3151); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(84);}
					dbg.location(1010,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1010:3: ( ',' )?
					int alt85=2;
					try { dbg.enterSubRule(85);
					try { dbg.enterDecision(85, decisionCanBacktrack[85]);

					int LA85_0 = input.LA(1);
					if ( (LA85_0==48) ) {
						alt85=1;
					}
					} finally {dbg.exitDecision(85);}

					switch (alt85) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1010:3: ','
							{
							dbg.location(1010,3);
							match(input,48,FOLLOW_48_in_ruleArguments3156); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(85);}

					}
					break;

			}
			} finally {dbg.exitSubRule(86);}
			dbg.location(1012,2);
			match(input,44,FOLLOW_44_in_ruleArguments3164); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1013, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleArguments");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleArguments"



	// $ANTLR start "ruleLiteral"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1016:1: ruleLiteral : ( ruleBasicLit | ruleCompositeLit | ruleFunctionLit ) ;
	public final void ruleLiteral() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleLiteral");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1016, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1016:12: ( ( ruleBasicLit | ruleCompositeLit | ruleFunctionLit ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1017:2: ( ruleBasicLit | ruleCompositeLit | ruleFunctionLit )
			{
			dbg.location(1017,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1017:2: ( ruleBasicLit | ruleCompositeLit | ruleFunctionLit )
			int alt87=3;
			try { dbg.enterSubRule(87);
			try { dbg.enterDecision(87, decisionCanBacktrack[87]);

			switch ( input.LA(1) ) {
			case RULE_DECIMALS:
			case RULE_FLOAT_LIT:
			case RULE_INT_LIT:
			case RULE_STRING:
			case 62:
				{
				alt87=1;
				}
				break;
			case RULE_LETTER:
			case 61:
			case 81:
			case 86:
				{
				alt87=2;
				}
				break;
			case 76:
				{
				alt87=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(87);}

			switch (alt87) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1018:3: ruleBasicLit
					{
					dbg.location(1018,3);
					pushFollow(FOLLOW_ruleBasicLit_in_ruleLiteral3178);
					ruleBasicLit();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1020:3: ruleCompositeLit
					{
					dbg.location(1020,3);
					pushFollow(FOLLOW_ruleCompositeLit_in_ruleLiteral3190);
					ruleCompositeLit();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1022:3: ruleFunctionLit
					{
					dbg.location(1022,3);
					pushFollow(FOLLOW_ruleFunctionLit_in_ruleLiteral3202);
					ruleFunctionLit();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(87);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1024, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleLiteral");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleLiteral"



	// $ANTLR start "ruleFunctionLit"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1027:1: ruleFunctionLit : 'func' ruleSignature ruleFunctionBody ;
	public final void ruleFunctionLit() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFunctionLit");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1027, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1027:16: ( 'func' ruleSignature ruleFunctionBody )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1028:2: 'func' ruleSignature ruleFunctionBody
			{
			dbg.location(1028,2);
			match(input,76,FOLLOW_76_in_ruleFunctionLit3215); if (state.failed) return;dbg.location(1029,2);
			pushFollow(FOLLOW_ruleSignature_in_ruleFunctionLit3218);
			ruleSignature();
			state._fsp--;
			if (state.failed) return;dbg.location(1030,2);
			pushFollow(FOLLOW_ruleFunctionBody_in_ruleFunctionLit3221);
			ruleFunctionBody();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1031, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFunctionLit");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFunctionLit"



	// $ANTLR start "ruleCompositeLit"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1034:1: ruleCompositeLit : ruleLiteralType ruleLiteralValue ;
	public final void ruleCompositeLit() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleCompositeLit");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1034, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1034:17: ( ruleLiteralType ruleLiteralValue )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1035:2: ruleLiteralType ruleLiteralValue
			{
			dbg.location(1035,2);
			pushFollow(FOLLOW_ruleLiteralType_in_ruleCompositeLit3231);
			ruleLiteralType();
			state._fsp--;
			if (state.failed) return;dbg.location(1036,2);
			pushFollow(FOLLOW_ruleLiteralValue_in_ruleCompositeLit3234);
			ruleLiteralValue();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1037, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleCompositeLit");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleCompositeLit"



	// $ANTLR start "ruleLiteralType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1040:1: ruleLiteralType : ( ruleStructType | ruleArrayType | '[' '...' ']' ruleElementType | ruleSliceType | ruleMapType | ruleTypeName ) ;
	public final void ruleLiteralType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleLiteralType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1040, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1040:16: ( ( ruleStructType | ruleArrayType | '[' '...' ']' ruleElementType | ruleSliceType | ruleMapType | ruleTypeName ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1041:2: ( ruleStructType | ruleArrayType | '[' '...' ']' ruleElementType | ruleSliceType | ruleMapType | ruleTypeName )
			{
			dbg.location(1041,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1041:2: ( ruleStructType | ruleArrayType | '[' '...' ']' ruleElementType | ruleSliceType | ruleMapType | ruleTypeName )
			int alt88=6;
			try { dbg.enterSubRule(88);
			try { dbg.enterDecision(88, decisionCanBacktrack[88]);

			switch ( input.LA(1) ) {
			case 86:
				{
				alt88=1;
				}
				break;
			case 61:
				{
				switch ( input.LA(2) ) {
				case 52:
					{
					alt88=3;
					}
					break;
				case 64:
					{
					alt88=4;
					}
					break;
				case RULE_DECIMALS:
				case RULE_FLOAT_LIT:
				case RULE_INT_LIT:
				case RULE_LETTER:
				case RULE_STRING:
				case RULE_UNARY_OP:
				case 43:
				case 45:
				case 57:
				case 61:
				case 62:
				case 68:
				case 76:
				case 80:
				case 81:
				case 86:
					{
					alt88=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 88, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 81:
				{
				alt88=5;
				}
				break;
			case RULE_LETTER:
				{
				alt88=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(88);}

			switch (alt88) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1042:3: ruleStructType
					{
					dbg.location(1042,3);
					pushFollow(FOLLOW_ruleStructType_in_ruleLiteralType3248);
					ruleStructType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1044:3: ruleArrayType
					{
					dbg.location(1044,3);
					pushFollow(FOLLOW_ruleArrayType_in_ruleLiteralType3260);
					ruleArrayType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1046:3: '[' '...' ']' ruleElementType
					{
					dbg.location(1046,3);
					match(input,61,FOLLOW_61_in_ruleLiteralType3272); if (state.failed) return;dbg.location(1047,3);
					match(input,52,FOLLOW_52_in_ruleLiteralType3276); if (state.failed) return;dbg.location(1048,3);
					match(input,64,FOLLOW_64_in_ruleLiteralType3280); if (state.failed) return;dbg.location(1049,3);
					pushFollow(FOLLOW_ruleElementType_in_ruleLiteralType3284);
					ruleElementType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1051:3: ruleSliceType
					{
					dbg.location(1051,3);
					pushFollow(FOLLOW_ruleSliceType_in_ruleLiteralType3296);
					ruleSliceType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1053:3: ruleMapType
					{
					dbg.location(1053,3);
					pushFollow(FOLLOW_ruleMapType_in_ruleLiteralType3308);
					ruleMapType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1055:3: ruleTypeName
					{
					dbg.location(1055,3);
					pushFollow(FOLLOW_ruleTypeName_in_ruleLiteralType3320);
					ruleTypeName();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(88);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1057, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleLiteralType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleLiteralType"



	// $ANTLR start "ruleLiteralValue"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1060:1: ruleLiteralValue : '{' ( ruleElementList ( ',' )? )? '}' ;
	public final void ruleLiteralValue() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleLiteralValue");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1060, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1060:17: ( '{' ( ruleElementList ( ',' )? )? '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1061:2: '{' ( ruleElementList ( ',' )? )? '}'
			{
			dbg.location(1061,2);
			match(input,90,FOLLOW_90_in_ruleLiteralValue3333); if (state.failed) return;dbg.location(1062,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1062:2: ( ruleElementList ( ',' )? )?
			int alt90=2;
			try { dbg.enterSubRule(90);
			try { dbg.enterDecision(90, decisionCanBacktrack[90]);

			int LA90_0 = input.LA(1);
			if ( (LA90_0==RULE_DECIMALS||LA90_0==RULE_FLOAT_LIT||(LA90_0 >= RULE_INT_LIT && LA90_0 <= RULE_LETTER)||(LA90_0 >= RULE_STRING && LA90_0 <= RULE_UNARY_OP)||LA90_0==43||LA90_0==45||LA90_0==57||(LA90_0 >= 61 && LA90_0 <= 62)||LA90_0==68||LA90_0==76||(LA90_0 >= 80 && LA90_0 <= 81)||LA90_0==86||LA90_0==90) ) {
				alt90=1;
			}
			} finally {dbg.exitDecision(90);}

			switch (alt90) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1063:3: ruleElementList ( ',' )?
					{
					dbg.location(1063,3);
					pushFollow(FOLLOW_ruleElementList_in_ruleLiteralValue3340);
					ruleElementList();
					state._fsp--;
					if (state.failed) return;dbg.location(1064,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1064:3: ( ',' )?
					int alt89=2;
					try { dbg.enterSubRule(89);
					try { dbg.enterDecision(89, decisionCanBacktrack[89]);

					int LA89_0 = input.LA(1);
					if ( (LA89_0==48) ) {
						alt89=1;
					}
					} finally {dbg.exitDecision(89);}

					switch (alt89) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1064:3: ','
							{
							dbg.location(1064,3);
							match(input,48,FOLLOW_48_in_ruleLiteralValue3344); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(89);}

					}
					break;

			}
			} finally {dbg.exitSubRule(90);}
			dbg.location(1066,2);
			match(input,92,FOLLOW_92_in_ruleLiteralValue3352); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1067, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleLiteralValue");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleLiteralValue"



	// $ANTLR start "ruleElementList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1070:1: ruleElementList : ruleKeyedElement ( ( ',' )? ruleKeyedElement )* ;
	public final void ruleElementList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleElementList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1070, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1070:16: ( ruleKeyedElement ( ( ',' )? ruleKeyedElement )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1071:2: ruleKeyedElement ( ( ',' )? ruleKeyedElement )*
			{
			dbg.location(1071,2);
			pushFollow(FOLLOW_ruleKeyedElement_in_ruleElementList3362);
			ruleKeyedElement();
			state._fsp--;
			if (state.failed) return;dbg.location(1072,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1072:2: ( ( ',' )? ruleKeyedElement )*
			try { dbg.enterSubRule(92);

			loop92:
			while (true) {
				int alt92=2;
				try { dbg.enterDecision(92, decisionCanBacktrack[92]);

				int LA92_0 = input.LA(1);
				if ( (LA92_0==48) ) {
					int LA92_1 = input.LA(2);
					if ( (LA92_1==RULE_DECIMALS||LA92_1==RULE_FLOAT_LIT||(LA92_1 >= RULE_INT_LIT && LA92_1 <= RULE_LETTER)||(LA92_1 >= RULE_STRING && LA92_1 <= RULE_UNARY_OP)||LA92_1==43||LA92_1==45||LA92_1==57||(LA92_1 >= 61 && LA92_1 <= 62)||LA92_1==68||LA92_1==76||(LA92_1 >= 80 && LA92_1 <= 81)||LA92_1==86||LA92_1==90) ) {
						alt92=1;
					}

				}
				else if ( (LA92_0==RULE_DECIMALS||LA92_0==RULE_FLOAT_LIT||(LA92_0 >= RULE_INT_LIT && LA92_0 <= RULE_LETTER)||(LA92_0 >= RULE_STRING && LA92_0 <= RULE_UNARY_OP)||LA92_0==43||LA92_0==45||LA92_0==57||(LA92_0 >= 61 && LA92_0 <= 62)||LA92_0==68||LA92_0==76||(LA92_0 >= 80 && LA92_0 <= 81)||LA92_0==86||LA92_0==90) ) {
					alt92=1;
				}

				} finally {dbg.exitDecision(92);}

				switch (alt92) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1073:3: ( ',' )? ruleKeyedElement
					{
					dbg.location(1073,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1073:3: ( ',' )?
					int alt91=2;
					try { dbg.enterSubRule(91);
					try { dbg.enterDecision(91, decisionCanBacktrack[91]);

					int LA91_0 = input.LA(1);
					if ( (LA91_0==48) ) {
						alt91=1;
					}
					} finally {dbg.exitDecision(91);}

					switch (alt91) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1073:3: ','
							{
							dbg.location(1073,3);
							match(input,48,FOLLOW_48_in_ruleElementList3369); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(91);}
					dbg.location(1074,3);
					pushFollow(FOLLOW_ruleKeyedElement_in_ruleElementList3374);
					ruleKeyedElement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop92;
				}
			}
			} finally {dbg.exitSubRule(92);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1076, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleElementList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleElementList"



	// $ANTLR start "ruleKeyedElement"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1079:1: ruleKeyedElement : ( ruleKey ':' )? ruleElement ;
	public final void ruleKeyedElement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleKeyedElement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1079, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1079:17: ( ( ruleKey ':' )? ruleElement )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1080:2: ( ruleKey ':' )? ruleElement
			{
			dbg.location(1080,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1080:2: ( ruleKey ':' )?
			int alt93=2;
			try { dbg.enterSubRule(93);
			try { dbg.enterDecision(93, decisionCanBacktrack[93]);

			switch ( input.LA(1) ) {
				case RULE_LETTER:
					{
					int LA93_1 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case RULE_INT_LIT:
					{
					int LA93_2 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA93_3 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA93_4 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 62:
					{
					int LA93_5 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA93_6 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 86:
					{
					int LA93_7 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 61:
					{
					int LA93_8 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 81:
					{
					int LA93_9 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 76:
					{
					int LA93_10 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 43:
					{
					int LA93_11 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 45:
					{
					int LA93_12 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 80:
					{
					int LA93_13 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 68:
					{
					int LA93_14 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 57:
					{
					int LA93_15 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA93_16 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 90:
					{
					int LA93_17 = input.LA(2);
					if ( (synpred148_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(93);}

			switch (alt93) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1081:3: ruleKey ':'
					{
					dbg.location(1081,3);
					pushFollow(FOLLOW_ruleKey_in_ruleKeyedElement3392);
					ruleKey();
					state._fsp--;
					if (state.failed) return;dbg.location(1082,3);
					match(input,54,FOLLOW_54_in_ruleKeyedElement3396); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(93);}
			dbg.location(1084,2);
			pushFollow(FOLLOW_ruleElement_in_ruleKeyedElement3403);
			ruleElement();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1085, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleKeyedElement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleKeyedElement"



	// $ANTLR start "ruleKey"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1088:1: ruleKey : ( ruleFieldName | ruleExpression | ruleLiteralValue ) ;
	public final void ruleKey() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleKey");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1088, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1088:8: ( ( ruleFieldName | ruleExpression | ruleLiteralValue ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1089:2: ( ruleFieldName | ruleExpression | ruleLiteralValue )
			{
			dbg.location(1089,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1089:2: ( ruleFieldName | ruleExpression | ruleLiteralValue )
			int alt94=3;
			try { dbg.enterSubRule(94);
			try { dbg.enterDecision(94, decisionCanBacktrack[94]);

			switch ( input.LA(1) ) {
			case RULE_LETTER:
				{
				int LA94_1 = input.LA(2);
				if ( (synpred149_DebugInternalGo()) ) {
					alt94=1;
				}
				else if ( (synpred150_DebugInternalGo()) ) {
					alt94=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 94, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RULE_DECIMALS:
			case RULE_FLOAT_LIT:
			case RULE_INT_LIT:
			case RULE_STRING:
			case RULE_UNARY_OP:
			case 43:
			case 45:
			case 57:
			case 61:
			case 62:
			case 68:
			case 76:
			case 80:
			case 81:
			case 86:
				{
				alt94=2;
				}
				break;
			case 90:
				{
				alt94=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 94, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(94);}

			switch (alt94) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1090:3: ruleFieldName
					{
					dbg.location(1090,3);
					pushFollow(FOLLOW_ruleFieldName_in_ruleKey3417);
					ruleFieldName();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1092:3: ruleExpression
					{
					dbg.location(1092,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleKey3429);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1094:3: ruleLiteralValue
					{
					dbg.location(1094,3);
					pushFollow(FOLLOW_ruleLiteralValue_in_ruleKey3441);
					ruleLiteralValue();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(94);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1096, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleKey");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleKey"



	// $ANTLR start "ruleFieldName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1099:1: ruleFieldName : ruleIDENTIFIER ;
	public final void ruleFieldName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFieldName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1099, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1099:14: ( ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1100:2: ruleIDENTIFIER
			{
			dbg.location(1100,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleFieldName3454);
			ruleIDENTIFIER();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1101, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFieldName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFieldName"



	// $ANTLR start "ruleElement"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1104:1: ruleElement : ( ruleExpression | ruleLiteralValue ) ;
	public final void ruleElement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleElement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1104, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1104:12: ( ( ruleExpression | ruleLiteralValue ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1105:2: ( ruleExpression | ruleLiteralValue )
			{
			dbg.location(1105,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1105:2: ( ruleExpression | ruleLiteralValue )
			int alt95=2;
			try { dbg.enterSubRule(95);
			try { dbg.enterDecision(95, decisionCanBacktrack[95]);

			int LA95_0 = input.LA(1);
			if ( (LA95_0==RULE_DECIMALS||LA95_0==RULE_FLOAT_LIT||(LA95_0 >= RULE_INT_LIT && LA95_0 <= RULE_LETTER)||(LA95_0 >= RULE_STRING && LA95_0 <= RULE_UNARY_OP)||LA95_0==43||LA95_0==45||LA95_0==57||(LA95_0 >= 61 && LA95_0 <= 62)||LA95_0==68||LA95_0==76||(LA95_0 >= 80 && LA95_0 <= 81)||LA95_0==86) ) {
				alt95=1;
			}
			else if ( (LA95_0==90) ) {
				alt95=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(95);}

			switch (alt95) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1106:3: ruleExpression
					{
					dbg.location(1106,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleElement3468);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1108:3: ruleLiteralValue
					{
					dbg.location(1108,3);
					pushFollow(FOLLOW_ruleLiteralValue_in_ruleElement3480);
					ruleLiteralValue();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(95);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1110, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleElement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleElement"



	// $ANTLR start "ruleBasicLit"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1113:1: ruleBasicLit : ( RULE_INT_LIT | RULE_FLOAT_LIT | ruleIMAGINARY_LIT | ruleRUNE_LIT | RULE_STRING ) ;
	public final void ruleBasicLit() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleBasicLit");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1113, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1113:13: ( ( RULE_INT_LIT | RULE_FLOAT_LIT | ruleIMAGINARY_LIT | ruleRUNE_LIT | RULE_STRING ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1114:2: ( RULE_INT_LIT | RULE_FLOAT_LIT | ruleIMAGINARY_LIT | ruleRUNE_LIT | RULE_STRING )
			{
			dbg.location(1114,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1114:2: ( RULE_INT_LIT | RULE_FLOAT_LIT | ruleIMAGINARY_LIT | ruleRUNE_LIT | RULE_STRING )
			int alt96=5;
			try { dbg.enterSubRule(96);
			try { dbg.enterDecision(96, decisionCanBacktrack[96]);

			switch ( input.LA(1) ) {
			case RULE_INT_LIT:
				{
				alt96=1;
				}
				break;
			case RULE_FLOAT_LIT:
				{
				int LA96_2 = input.LA(2);
				if ( (LA96_2==63) ) {
					alt96=3;
				}
				else if ( (LA96_2==EOF||LA96_2==RULE_BINARY_OP||LA96_2==RULE_DECIMALS||LA96_2==RULE_FLOAT_LIT||(LA96_2 >= RULE_INT_LIT && LA96_2 <= RULE_LETTER)||(LA96_2 >= RULE_STRING && LA96_2 <= RULE_UNARY_OP)||(LA96_2 >= 40 && LA96_2 <= 54)||(LA96_2 >= 56 && LA96_2 <= 62)||(LA96_2 >= 64 && LA96_2 <= 72)||(LA96_2 >= 74 && LA96_2 <= 78)||(LA96_2 >= 80 && LA96_2 <= 81)||(LA96_2 >= 84 && LA96_2 <= 92)) ) {
					alt96=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RULE_DECIMALS:
				{
				alt96=3;
				}
				break;
			case 62:
				{
				alt96=4;
				}
				break;
			case RULE_STRING:
				{
				alt96=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(96);}

			switch (alt96) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1115:3: RULE_INT_LIT
					{
					dbg.location(1115,3);
					match(input,RULE_INT_LIT,FOLLOW_RULE_INT_LIT_in_ruleBasicLit3497); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1117:3: RULE_FLOAT_LIT
					{
					dbg.location(1117,3);
					match(input,RULE_FLOAT_LIT,FOLLOW_RULE_FLOAT_LIT_in_ruleBasicLit3509); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1119:3: ruleIMAGINARY_LIT
					{
					dbg.location(1119,3);
					pushFollow(FOLLOW_ruleIMAGINARY_LIT_in_ruleBasicLit3521);
					ruleIMAGINARY_LIT();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1121:3: ruleRUNE_LIT
					{
					dbg.location(1121,3);
					pushFollow(FOLLOW_ruleRUNE_LIT_in_ruleBasicLit3533);
					ruleRUNE_LIT();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1123:3: RULE_STRING
					{
					dbg.location(1123,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBasicLit3545); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(96);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1125, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleBasicLit");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleBasicLit"



	// $ANTLR start "ruleReceiverType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1128:1: ruleReceiverType : ruleType ;
	public final void ruleReceiverType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleReceiverType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1128, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1128:17: ( ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1129:2: ruleType
			{
			dbg.location(1129,2);
			pushFollow(FOLLOW_ruleType_in_ruleReceiverType3558);
			ruleType();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1130, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleReceiverType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleReceiverType"



	// $ANTLR start "ruleFunctionBody"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1133:1: ruleFunctionBody : ruleBlock ;
	public final void ruleFunctionBody() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFunctionBody");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1133, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1133:17: ( ruleBlock )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1134:2: ruleBlock
			{
			dbg.location(1134,2);
			pushFollow(FOLLOW_ruleBlock_in_ruleFunctionBody3568);
			ruleBlock();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1135, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFunctionBody");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFunctionBody"



	// $ANTLR start "ruleOperandName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1138:1: ruleOperandName : ( ruleIDENTIFIER | ruleQualifiedIdent ) ;
	public final void ruleOperandName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleOperandName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1138, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1138:16: ( ( ruleIDENTIFIER | ruleQualifiedIdent ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1139:2: ( ruleIDENTIFIER | ruleQualifiedIdent )
			{
			dbg.location(1139,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1139:2: ( ruleIDENTIFIER | ruleQualifiedIdent )
			int alt97=2;
			try { dbg.enterSubRule(97);
			try { dbg.enterDecision(97, decisionCanBacktrack[97]);

			try {
				isCyclicDecision = true;
				alt97 = dfa97.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(97);}

			switch (alt97) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1140:3: ruleIDENTIFIER
					{
					dbg.location(1140,3);
					pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleOperandName3582);
					ruleIDENTIFIER();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1142:3: ruleQualifiedIdent
					{
					dbg.location(1142,3);
					pushFollow(FOLLOW_ruleQualifiedIdent_in_ruleOperandName3594);
					ruleQualifiedIdent();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(97);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1144, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleOperandName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleOperandName"



	// $ANTLR start "ruleImportDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1147:1: ruleImportDecl : 'import' ( ruleImportSpec | '(' ( ruleImportSpec )* ')' ) ;
	public final void ruleImportDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleImportDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1147, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1147:15: ( 'import' ( ruleImportSpec | '(' ( ruleImportSpec )* ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1148:2: 'import' ( ruleImportSpec | '(' ( ruleImportSpec )* ')' )
			{
			dbg.location(1148,2);
			match(input,79,FOLLOW_79_in_ruleImportDecl3607); if (state.failed) return;dbg.location(1149,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1149:2: ( ruleImportSpec | '(' ( ruleImportSpec )* ')' )
			int alt99=2;
			try { dbg.enterSubRule(99);
			try { dbg.enterDecision(99, decisionCanBacktrack[99]);

			int LA99_0 = input.LA(1);
			if ( (LA99_0==RULE_LETTER||LA99_0==RULE_STRING||LA99_0==51) ) {
				alt99=1;
			}
			else if ( (LA99_0==43) ) {
				alt99=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(99);}

			switch (alt99) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1150:3: ruleImportSpec
					{
					dbg.location(1150,3);
					pushFollow(FOLLOW_ruleImportSpec_in_ruleImportDecl3614);
					ruleImportSpec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1152:3: '(' ( ruleImportSpec )* ')'
					{
					dbg.location(1152,3);
					match(input,43,FOLLOW_43_in_ruleImportDecl3626); if (state.failed) return;dbg.location(1153,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1153:3: ( ruleImportSpec )*
					try { dbg.enterSubRule(98);

					loop98:
					while (true) {
						int alt98=2;
						try { dbg.enterDecision(98, decisionCanBacktrack[98]);

						int LA98_0 = input.LA(1);
						if ( (LA98_0==RULE_LETTER||LA98_0==RULE_STRING||LA98_0==51) ) {
							alt98=1;
						}

						} finally {dbg.exitDecision(98);}

						switch (alt98) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1153:3: ruleImportSpec
							{
							dbg.location(1153,3);
							pushFollow(FOLLOW_ruleImportSpec_in_ruleImportDecl3630);
							ruleImportSpec();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop98;
						}
					}
					} finally {dbg.exitSubRule(98);}
					dbg.location(1155,3);
					match(input,44,FOLLOW_44_in_ruleImportDecl3638); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(99);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1157, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleImportDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleImportDecl"



	// $ANTLR start "ruleImportSpec"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1160:1: ruleImportSpec : ( '.' | ruleIDENTIFIER )? ruleImportPath ;
	public final void ruleImportSpec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleImportSpec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1160, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1160:15: ( ( '.' | ruleIDENTIFIER )? ruleImportPath )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1161:2: ( '.' | ruleIDENTIFIER )? ruleImportPath
			{
			dbg.location(1161,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1161:2: ( '.' | ruleIDENTIFIER )?
			int alt100=3;
			try { dbg.enterSubRule(100);
			try { dbg.enterDecision(100, decisionCanBacktrack[100]);

			int LA100_0 = input.LA(1);
			if ( (LA100_0==51) ) {
				alt100=1;
			}
			else if ( (LA100_0==RULE_LETTER) ) {
				alt100=2;
			}
			} finally {dbg.exitDecision(100);}

			switch (alt100) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1162:3: '.'
					{
					dbg.location(1162,3);
					match(input,51,FOLLOW_51_in_ruleImportSpec3655); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1164:3: ruleIDENTIFIER
					{
					dbg.location(1164,3);
					pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleImportSpec3667);
					ruleIDENTIFIER();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(100);}
			dbg.location(1166,2);
			pushFollow(FOLLOW_ruleImportPath_in_ruleImportSpec3674);
			ruleImportPath();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1167, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleImportSpec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleImportSpec"



	// $ANTLR start "ruleImportPath"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1170:1: ruleImportPath : RULE_STRING ;
	public final void ruleImportPath() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleImportPath");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1170, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1170:15: ( RULE_STRING )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1171:2: RULE_STRING
			{
			dbg.location(1171,2);
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImportPath3684); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1172, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleImportPath");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleImportPath"

	// $ANTLR start synpred26_DebugInternalGo
	public final void synpred26_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:152:3: ( ruleIDENTIFIER )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:152:3: ruleIDENTIFIER
		{
		dbg.location(152,3);
		pushFollow(FOLLOW_ruleIDENTIFIER_in_synpred26_DebugInternalGo507);
		ruleIDENTIFIER();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred26_DebugInternalGo

	// $ANTLR start synpred35_DebugInternalGo
	public final void synpred35_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:230:3: ( ruleIdentifierList ruleType )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:230:3: ruleIdentifierList ruleType
		{
		dbg.location(230,3);
		pushFollow(FOLLOW_ruleIdentifierList_in_synpred35_DebugInternalGo749);
		ruleIdentifierList();
		state._fsp--;
		if (state.failed) return;dbg.location(231,3);
		pushFollow(FOLLOW_ruleType_in_synpred35_DebugInternalGo753);
		ruleType();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred35_DebugInternalGo

	// $ANTLR start synpred37_DebugInternalGo
	public final void synpred37_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:243:3: ( ',' ruleIDENTIFIER )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:243:3: ',' ruleIDENTIFIER
		{
		dbg.location(243,3);
		match(input,48,FOLLOW_48_in_synpred37_DebugInternalGo791); if (state.failed) return;dbg.location(244,3);
		pushFollow(FOLLOW_ruleIDENTIFIER_in_synpred37_DebugInternalGo795);
		ruleIDENTIFIER();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred37_DebugInternalGo

	// $ANTLR start synpred39_DebugInternalGo
	public final void synpred39_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:279:2: ( ruleResult )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:279:2: ruleResult
		{
		dbg.location(279,2);
		pushFollow(FOLLOW_ruleResult_in_synpred39_DebugInternalGo872);
		ruleResult();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred39_DebugInternalGo

	// $ANTLR start synpred40_DebugInternalGo
	public final void synpred40_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:286:3: ( ruleParameters )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:286:3: ruleParameters
		{
		dbg.location(286,3);
		pushFollow(FOLLOW_ruleParameters_in_synpred40_DebugInternalGo889);
		ruleParameters();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred40_DebugInternalGo

	// $ANTLR start synpred41_DebugInternalGo
	public final void synpred41_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:295:2: ( ruleParameterList )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:295:2: ruleParameterList
		{
		dbg.location(295,2);
		pushFollow(FOLLOW_ruleParameterList_in_synpred41_DebugInternalGo917);
		ruleParameterList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred41_DebugInternalGo

	// $ANTLR start synpred43_DebugInternalGo
	public final void synpred43_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:311:2: ( ruleIdentifierList )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:311:2: ruleIdentifierList
		{
		dbg.location(311,2);
		pushFollow(FOLLOW_ruleIdentifierList_in_synpred43_DebugInternalGo958);
		ruleIdentifierList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred43_DebugInternalGo

	// $ANTLR start synpred48_DebugInternalGo
	public final void synpred48_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:367:3: ( '<-' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:367:3: '<-'
		{
		dbg.location(367,3);
		match(input,57,FOLLOW_57_in_synpred48_DebugInternalGo1105); if (state.failed) return;
		}

	}
	// $ANTLR end synpred48_DebugInternalGo

	// $ANTLR start synpred50_DebugInternalGo
	public final void synpred50_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:386:3: ( ';' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:386:3: ';'
		{
		dbg.location(386,3);
		match(input,56,FOLLOW_56_in_synpred50_DebugInternalGo1162); if (state.failed) return;
		}

	}
	// $ANTLR end synpred50_DebugInternalGo

	// $ANTLR start synpred53_DebugInternalGo
	public final void synpred53_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:395:3: ( ruleLabeledStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:395:3: ruleLabeledStmt
		{
		dbg.location(395,3);
		pushFollow(FOLLOW_ruleLabeledStmt_in_synpred53_DebugInternalGo1193);
		ruleLabeledStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred53_DebugInternalGo

	// $ANTLR start synpred54_DebugInternalGo
	public final void synpred54_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:397:3: ( ruleSimpleStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:397:3: ruleSimpleStmt
		{
		dbg.location(397,3);
		pushFollow(FOLLOW_ruleSimpleStmt_in_synpred54_DebugInternalGo1205);
		ruleSimpleStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred54_DebugInternalGo

	// $ANTLR start synpred55_DebugInternalGo
	public final void synpred55_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:399:3: ( ruleGoStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:399:3: ruleGoStmt
		{
		dbg.location(399,3);
		pushFollow(FOLLOW_ruleGoStmt_in_synpred55_DebugInternalGo1217);
		ruleGoStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred55_DebugInternalGo

	// $ANTLR start synpred59_DebugInternalGo
	public final void synpred59_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:407:3: ( ruleGotoStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:407:3: ruleGotoStmt
		{
		dbg.location(407,3);
		pushFollow(FOLLOW_ruleGotoStmt_in_synpred59_DebugInternalGo1265);
		ruleGotoStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred59_DebugInternalGo

	// $ANTLR start synpred68_DebugInternalGo
	public final void synpred68_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:446:3: ( ruleIncDecStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:446:3: ruleIncDecStmt
		{
		dbg.location(446,3);
		pushFollow(FOLLOW_ruleIncDecStmt_in_synpred68_DebugInternalGo1423);
		ruleIncDecStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred68_DebugInternalGo

	// $ANTLR start synpred69_DebugInternalGo
	public final void synpred69_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:448:3: ( ruleAssignment )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:448:3: ruleAssignment
		{
		dbg.location(448,3);
		pushFollow(FOLLOW_ruleAssignment_in_synpred69_DebugInternalGo1435);
		ruleAssignment();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred69_DebugInternalGo

	// $ANTLR start synpred70_DebugInternalGo
	public final void synpred70_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:450:3: ( ruleSendStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:450:3: ruleSendStmt
		{
		dbg.location(450,3);
		pushFollow(FOLLOW_ruleSendStmt_in_synpred70_DebugInternalGo1447);
		ruleSendStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred70_DebugInternalGo

	// $ANTLR start synpred71_DebugInternalGo
	public final void synpred71_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:452:3: ( ruleShortVarDecl )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:452:3: ruleShortVarDecl
		{
		dbg.location(452,3);
		pushFollow(FOLLOW_ruleShortVarDecl_in_synpred71_DebugInternalGo1459);
		ruleShortVarDecl();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred71_DebugInternalGo

	// $ANTLR start synpred72_DebugInternalGo
	public final void synpred72_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:454:3: ( ruleExpressionStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:454:3: ruleExpressionStmt
		{
		dbg.location(454,3);
		pushFollow(FOLLOW_ruleExpressionStmt_in_synpred72_DebugInternalGo1471);
		ruleExpressionStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred72_DebugInternalGo

	// $ANTLR start synpred73_DebugInternalGo
	public final void synpred73_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:469:2: ( ruleExpressionList )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:469:2: ruleExpressionList
		{
		dbg.location(469,2);
		pushFollow(FOLLOW_ruleExpressionList_in_synpred73_DebugInternalGo1512);
		ruleExpressionList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred73_DebugInternalGo

	// $ANTLR start synpred74_DebugInternalGo
	public final void synpred74_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:476:2: ( ruleLabel )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:476:2: ruleLabel
		{
		dbg.location(476,2);
		pushFollow(FOLLOW_ruleLabel_in_synpred74_DebugInternalGo1528);
		ruleLabel();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred74_DebugInternalGo

	// $ANTLR start synpred75_DebugInternalGo
	public final void synpred75_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:482:2: ( ruleLabel )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:482:2: ruleLabel
		{
		dbg.location(482,2);
		pushFollow(FOLLOW_ruleLabel_in_synpred75_DebugInternalGo1542);
		ruleLabel();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred75_DebugInternalGo

	// $ANTLR start synpred76_DebugInternalGo
	public final void synpred76_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:495:3: ( ruleSimpleStmt ';' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:495:3: ruleSimpleStmt ';'
		{
		dbg.location(495,3);
		pushFollow(FOLLOW_ruleSimpleStmt_in_synpred76_DebugInternalGo1573);
		ruleSimpleStmt();
		state._fsp--;
		if (state.failed) return;dbg.location(496,3);
		match(input,56,FOLLOW_56_in_synpred76_DebugInternalGo1577); if (state.failed) return;
		}

	}
	// $ANTLR end synpred76_DebugInternalGo

	// $ANTLR start synpred79_DebugInternalGo
	public final void synpred79_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:518:3: ( ruleExprSwitchStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:518:3: ruleExprSwitchStmt
		{
		dbg.location(518,3);
		pushFollow(FOLLOW_ruleExprSwitchStmt_in_synpred79_DebugInternalGo1649);
		ruleExprSwitchStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred79_DebugInternalGo

	// $ANTLR start synpred81_DebugInternalGo
	public final void synpred81_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:537:3: ( ruleCondition )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:537:3: ruleCondition
		{
		dbg.location(537,3);
		pushFollow(FOLLOW_ruleCondition_in_synpred81_DebugInternalGo1703);
		ruleCondition();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred81_DebugInternalGo

	// $ANTLR start synpred82_DebugInternalGo
	public final void synpred82_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:539:3: ( ruleForClause )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:539:3: ruleForClause
		{
		dbg.location(539,3);
		pushFollow(FOLLOW_ruleForClause_in_synpred82_DebugInternalGo1715);
		ruleForClause();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred82_DebugInternalGo

	// $ANTLR start synpred83_DebugInternalGo
	public final void synpred83_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:541:3: ( ruleRangeClause )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:541:3: ruleRangeClause
		{
		dbg.location(541,3);
		pushFollow(FOLLOW_ruleRangeClause_in_synpred83_DebugInternalGo1727);
		ruleRangeClause();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred83_DebugInternalGo

	// $ANTLR start synpred88_DebugInternalGo
	public final void synpred88_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:571:3: ( ( ruleType )? '=' ruleExpressionList )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:571:3: ( ruleType )? '=' ruleExpressionList
		{
		dbg.location(571,3);
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:571:3: ( ruleType )?
		int alt107=2;
		try { dbg.enterSubRule(107);
		try { dbg.enterDecision(107, decisionCanBacktrack[107]);

		int LA107_0 = input.LA(1);
		if ( (LA107_0==RULE_LETTER||LA107_0==43||LA107_0==45||LA107_0==57||LA107_0==61||LA107_0==68||LA107_0==76||(LA107_0 >= 80 && LA107_0 <= 81)||LA107_0==86) ) {
			alt107=1;
		}
		} finally {dbg.exitDecision(107);}

		switch (alt107) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:571:3: ruleType
				{
				dbg.location(571,3);
				pushFollow(FOLLOW_ruleType_in_synpred88_DebugInternalGo1820);
				ruleType();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(107);}
		dbg.location(573,3);
		match(input,59,FOLLOW_59_in_synpred88_DebugInternalGo1828); if (state.failed) return;dbg.location(574,3);
		pushFollow(FOLLOW_ruleExpressionList_in_synpred88_DebugInternalGo1832);
		ruleExpressionList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred88_DebugInternalGo

	// $ANTLR start synpred91_DebugInternalGo
	public final void synpred91_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:596:3: ( ruleAliasDecl )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:596:3: ruleAliasDecl
		{
		dbg.location(596,3);
		pushFollow(FOLLOW_ruleAliasDecl_in_synpred91_DebugInternalGo1905);
		ruleAliasDecl();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred91_DebugInternalGo

	// $ANTLR start synpred94_DebugInternalGo
	public final void synpred94_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:633:2: ( ruleType )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:633:2: ruleType
		{
		dbg.location(633,2);
		pushFollow(FOLLOW_ruleType_in_synpred94_DebugInternalGo2017);
		ruleType();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred94_DebugInternalGo

	// $ANTLR start synpred96_DebugInternalGo
	public final void synpred96_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:666:3: ( ruleExpression '++' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:666:3: ruleExpression '++'
		{
		dbg.location(666,3);
		pushFollow(FOLLOW_ruleExpression_in_synpred96_DebugInternalGo2095);
		ruleExpression();
		state._fsp--;
		if (state.failed) return;dbg.location(667,3);
		match(input,47,FOLLOW_47_in_synpred96_DebugInternalGo2099); if (state.failed) return;
		}

	}
	// $ANTLR end synpred96_DebugInternalGo

	// $ANTLR start synpred97_DebugInternalGo
	public final void synpred97_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:692:3: ( ruleSimpleStmt ';' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:692:3: ruleSimpleStmt ';'
		{
		dbg.location(692,3);
		pushFollow(FOLLOW_ruleSimpleStmt_in_synpred97_DebugInternalGo2167);
		ruleSimpleStmt();
		state._fsp--;
		if (state.failed) return;dbg.location(693,3);
		match(input,56,FOLLOW_56_in_synpred97_DebugInternalGo2171); if (state.failed) return;
		}

	}
	// $ANTLR end synpred97_DebugInternalGo

	// $ANTLR start synpred101_DebugInternalGo
	public final void synpred101_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:724:3: ( ruleSimpleStmt ';' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:724:3: ruleSimpleStmt ';'
		{
		dbg.location(724,3);
		pushFollow(FOLLOW_ruleSimpleStmt_in_synpred101_DebugInternalGo2259);
		ruleSimpleStmt();
		state._fsp--;
		if (state.failed) return;dbg.location(725,3);
		match(input,56,FOLLOW_56_in_synpred101_DebugInternalGo2263); if (state.failed) return;
		}

	}
	// $ANTLR end synpred101_DebugInternalGo

	// $ANTLR start synpred106_DebugInternalGo
	public final void synpred106_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:785:4: ( ruleSendStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:785:4: ruleSendStmt
		{
		dbg.location(785,4);
		pushFollow(FOLLOW_ruleSendStmt_in_synpred106_DebugInternalGo2432);
		ruleSendStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred106_DebugInternalGo

	// $ANTLR start synpred108_DebugInternalGo
	public final void synpred108_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:797:3: ( ruleExpressionList '=' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:797:3: ruleExpressionList '='
		{
		dbg.location(797,3);
		pushFollow(FOLLOW_ruleExpressionList_in_synpred108_DebugInternalGo2479);
		ruleExpressionList();
		state._fsp--;
		if (state.failed) return;dbg.location(798,3);
		match(input,59,FOLLOW_59_in_synpred108_DebugInternalGo2483); if (state.failed) return;
		}

	}
	// $ANTLR end synpred108_DebugInternalGo

	// $ANTLR start synpred109_DebugInternalGo
	public final void synpred109_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:800:3: ( ruleIdentifierList ':=' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:800:3: ruleIdentifierList ':='
		{
		dbg.location(800,3);
		pushFollow(FOLLOW_ruleIdentifierList_in_synpred109_DebugInternalGo2495);
		ruleIdentifierList();
		state._fsp--;
		if (state.failed) return;dbg.location(801,3);
		match(input,55,FOLLOW_55_in_synpred109_DebugInternalGo2499); if (state.failed) return;
		}

	}
	// $ANTLR end synpred109_DebugInternalGo

	// $ANTLR start synpred110_DebugInternalGo
	public final void synpred110_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:818:2: ( ruleInitStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:818:2: ruleInitStmt
		{
		dbg.location(818,2);
		pushFollow(FOLLOW_ruleInitStmt_in_synpred110_DebugInternalGo2536);
		ruleInitStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred110_DebugInternalGo

	// $ANTLR start synpred116_DebugInternalGo
	public final void synpred116_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:874:3: ( RULE_BINARY_OP ruleExpression ruleExpression2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:874:3: RULE_BINARY_OP ruleExpression ruleExpression2
		{
		dbg.location(874,3);
		match(input,RULE_BINARY_OP,FOLLOW_RULE_BINARY_OP_in_synpred116_DebugInternalGo2683); if (state.failed) return;dbg.location(875,3);
		pushFollow(FOLLOW_ruleExpression_in_synpred116_DebugInternalGo2687);
		ruleExpression();
		state._fsp--;
		if (state.failed) return;dbg.location(876,3);
		pushFollow(FOLLOW_ruleExpression2_in_synpred116_DebugInternalGo2691);
		ruleExpression2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred116_DebugInternalGo

	// $ANTLR start synpred118_DebugInternalGo
	public final void synpred118_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:893:3: ( ruleOperand rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:893:3: ruleOperand rulePrimaryExpr2
		{
		dbg.location(893,3);
		pushFollow(FOLLOW_ruleOperand_in_synpred118_DebugInternalGo2742);
		ruleOperand();
		state._fsp--;
		if (state.failed) return;dbg.location(894,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred118_DebugInternalGo2746);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred118_DebugInternalGo

	// $ANTLR start synpred119_DebugInternalGo
	public final void synpred119_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:896:3: ( ruleConversion rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:896:3: ruleConversion rulePrimaryExpr2
		{
		dbg.location(896,3);
		pushFollow(FOLLOW_ruleConversion_in_synpred119_DebugInternalGo2758);
		ruleConversion();
		state._fsp--;
		if (state.failed) return;dbg.location(897,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred119_DebugInternalGo2762);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred119_DebugInternalGo

	// $ANTLR start synpred120_DebugInternalGo
	public final void synpred120_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:907:3: ( ruleSelector rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:907:3: ruleSelector rulePrimaryExpr2
		{
		dbg.location(907,3);
		pushFollow(FOLLOW_ruleSelector_in_synpred120_DebugInternalGo2795);
		ruleSelector();
		state._fsp--;
		if (state.failed) return;dbg.location(908,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred120_DebugInternalGo2799);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred120_DebugInternalGo

	// $ANTLR start synpred121_DebugInternalGo
	public final void synpred121_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:910:3: ( ruleIndex rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:910:3: ruleIndex rulePrimaryExpr2
		{
		dbg.location(910,3);
		pushFollow(FOLLOW_ruleIndex_in_synpred121_DebugInternalGo2811);
		ruleIndex();
		state._fsp--;
		if (state.failed) return;dbg.location(911,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred121_DebugInternalGo2815);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred121_DebugInternalGo

	// $ANTLR start synpred122_DebugInternalGo
	public final void synpred122_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:913:3: ( ruleSlice rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:913:3: ruleSlice rulePrimaryExpr2
		{
		dbg.location(913,3);
		pushFollow(FOLLOW_ruleSlice_in_synpred122_DebugInternalGo2827);
		ruleSlice();
		state._fsp--;
		if (state.failed) return;dbg.location(914,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred122_DebugInternalGo2831);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred122_DebugInternalGo

	// $ANTLR start synpred123_DebugInternalGo
	public final void synpred123_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:916:3: ( ruleTypeAssertion rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:916:3: ruleTypeAssertion rulePrimaryExpr2
		{
		dbg.location(916,3);
		pushFollow(FOLLOW_ruleTypeAssertion_in_synpred123_DebugInternalGo2843);
		ruleTypeAssertion();
		state._fsp--;
		if (state.failed) return;dbg.location(917,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred123_DebugInternalGo2847);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred123_DebugInternalGo

	// $ANTLR start synpred124_DebugInternalGo
	public final void synpred124_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:919:3: ( ruleArguments rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:919:3: ruleArguments rulePrimaryExpr2
		{
		dbg.location(919,3);
		pushFollow(FOLLOW_ruleArguments_in_synpred124_DebugInternalGo2859);
		ruleArguments();
		state._fsp--;
		if (state.failed) return;dbg.location(920,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred124_DebugInternalGo2863);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred124_DebugInternalGo

	// $ANTLR start synpred125_DebugInternalGo
	public final void synpred125_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:927:3: ( ruleLiteral )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:927:3: ruleLiteral
		{
		dbg.location(927,3);
		pushFollow(FOLLOW_ruleLiteral_in_synpred125_DebugInternalGo2881);
		ruleLiteral();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred125_DebugInternalGo

	// $ANTLR start synpred126_DebugInternalGo
	public final void synpred126_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:929:3: ( ruleOperandName )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:929:3: ruleOperandName
		{
		dbg.location(929,3);
		pushFollow(FOLLOW_ruleOperandName_in_synpred126_DebugInternalGo2893);
		ruleOperandName();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred126_DebugInternalGo

	// $ANTLR start synpred130_DebugInternalGo
	public final void synpred130_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:969:3: ( '[' ( ruleExpression )? ':' ( ruleExpression )? ']' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:969:3: '[' ( ruleExpression )? ':' ( ruleExpression )? ']'
		{
		dbg.location(969,3);
		match(input,61,FOLLOW_61_in_synpred130_DebugInternalGo2998); if (state.failed) return;dbg.location(970,3);
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:970:3: ( ruleExpression )?
		int alt109=2;
		try { dbg.enterSubRule(109);
		try { dbg.enterDecision(109, decisionCanBacktrack[109]);

		int LA109_0 = input.LA(1);
		if ( (LA109_0==RULE_DECIMALS||LA109_0==RULE_FLOAT_LIT||(LA109_0 >= RULE_INT_LIT && LA109_0 <= RULE_LETTER)||(LA109_0 >= RULE_STRING && LA109_0 <= RULE_UNARY_OP)||LA109_0==43||LA109_0==45||LA109_0==57||(LA109_0 >= 61 && LA109_0 <= 62)||LA109_0==68||LA109_0==76||(LA109_0 >= 80 && LA109_0 <= 81)||LA109_0==86) ) {
			alt109=1;
		}
		} finally {dbg.exitDecision(109);}

		switch (alt109) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:970:3: ruleExpression
				{
				dbg.location(970,3);
				pushFollow(FOLLOW_ruleExpression_in_synpred130_DebugInternalGo3002);
				ruleExpression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(109);}
		dbg.location(972,3);
		match(input,54,FOLLOW_54_in_synpred130_DebugInternalGo3010); if (state.failed) return;dbg.location(973,3);
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:973:3: ( ruleExpression )?
		int alt110=2;
		try { dbg.enterSubRule(110);
		try { dbg.enterDecision(110, decisionCanBacktrack[110]);

		int LA110_0 = input.LA(1);
		if ( (LA110_0==RULE_DECIMALS||LA110_0==RULE_FLOAT_LIT||(LA110_0 >= RULE_INT_LIT && LA110_0 <= RULE_LETTER)||(LA110_0 >= RULE_STRING && LA110_0 <= RULE_UNARY_OP)||LA110_0==43||LA110_0==45||LA110_0==57||(LA110_0 >= 61 && LA110_0 <= 62)||LA110_0==68||LA110_0==76||(LA110_0 >= 80 && LA110_0 <= 81)||LA110_0==86) ) {
			alt110=1;
		}
		} finally {dbg.exitDecision(110);}

		switch (alt110) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:973:3: ruleExpression
				{
				dbg.location(973,3);
				pushFollow(FOLLOW_ruleExpression_in_synpred130_DebugInternalGo3014);
				ruleExpression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(110);}
		dbg.location(975,3);
		match(input,64,FOLLOW_64_in_synpred130_DebugInternalGo3022); if (state.failed) return;
		}

	}
	// $ANTLR end synpred130_DebugInternalGo

	// $ANTLR start synpred132_DebugInternalGo
	public final void synpred132_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1001:4: ( ruleExpressionList )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1001:4: ruleExpressionList
		{
		dbg.location(1001,4);
		pushFollow(FOLLOW_ruleExpressionList_in_synpred132_DebugInternalGo3106);
		ruleExpressionList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred132_DebugInternalGo

	// $ANTLR start synpred148_DebugInternalGo
	public final void synpred148_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1081:3: ( ruleKey ':' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1081:3: ruleKey ':'
		{
		dbg.location(1081,3);
		pushFollow(FOLLOW_ruleKey_in_synpred148_DebugInternalGo3392);
		ruleKey();
		state._fsp--;
		if (state.failed) return;dbg.location(1082,3);
		match(input,54,FOLLOW_54_in_synpred148_DebugInternalGo3396); if (state.failed) return;
		}

	}
	// $ANTLR end synpred148_DebugInternalGo

	// $ANTLR start synpred149_DebugInternalGo
	public final void synpred149_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1090:3: ( ruleFieldName )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1090:3: ruleFieldName
		{
		dbg.location(1090,3);
		pushFollow(FOLLOW_ruleFieldName_in_synpred149_DebugInternalGo3417);
		ruleFieldName();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred149_DebugInternalGo

	// $ANTLR start synpred150_DebugInternalGo
	public final void synpred150_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1092:3: ( ruleExpression )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1092:3: ruleExpression
		{
		dbg.location(1092,3);
		pushFollow(FOLLOW_ruleExpression_in_synpred150_DebugInternalGo3429);
		ruleExpression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred150_DebugInternalGo

	// $ANTLR start synpred156_DebugInternalGo
	public final void synpred156_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1140:3: ( ruleIDENTIFIER )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1140:3: ruleIDENTIFIER
		{
		dbg.location(1140,3);
		pushFollow(FOLLOW_ruleIDENTIFIER_in_synpred156_DebugInternalGo3582);
		ruleIDENTIFIER();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred156_DebugInternalGo

	// Delegated rules

	public final boolean synpred43_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred43_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred150_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred150_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred39_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred39_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred149_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred149_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred50_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred50_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred118_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred118_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred81_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred81_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred94_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred94_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred88_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred88_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred108_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred108_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred26_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred26_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred91_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred91_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred54_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred54_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred97_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred97_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred35_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred35_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred123_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred123_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred126_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred126_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred130_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred130_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred59_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred59_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred132_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred132_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred53_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred53_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred68_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred68_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred83_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred83_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred109_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred109_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred106_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred106_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred156_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred156_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred71_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred71_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred74_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred74_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred55_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred55_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred96_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred96_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred124_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred124_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred72_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred72_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred121_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred121_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred41_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred41_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred48_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred48_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred76_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred76_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred79_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred79_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred120_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred120_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred69_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred69_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred148_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred148_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred82_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred82_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred70_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred70_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred119_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred119_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred73_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred73_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred75_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred75_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred101_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred101_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred37_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred37_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred110_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred110_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred116_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred116_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred122_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred122_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred125_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred125_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred40_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred40_DebugInternalGo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA10 dfa10 = new DFA10(this);
	protected DFA13 dfa13 = new DFA13(this);
	protected DFA25 dfa25 = new DFA25(this);
	protected DFA30 dfa30 = new DFA30(this);
	protected DFA61 dfa61 = new DFA61(this);
	protected DFA70 dfa70 = new DFA70(this);
	protected DFA97 dfa97 = new DFA97(this);
	static final String DFA10_eotS =
		"\11\uffff";
	static final String DFA10_eofS =
		"\1\uffff\1\3\2\uffff\1\3\4\uffff";
	static final String DFA10_minS =
		"\1\26\1\11\1\0\1\uffff\1\11\1\26\1\uffff\2\0";
	static final String DFA10_maxS =
		"\1\26\1\134\1\0\1\uffff\1\134\1\26\1\uffff\2\0";
	static final String DFA10_acceptS =
		"\3\uffff\1\1\2\uffff\1\2\2\uffff";
	static final String DFA10_specialS =
		"\2\uffff\1\0\4\uffff\1\1\1\2}>";
	static final String[] DFA10_transitionS = {
			"\1\1",
			"\1\3\4\uffff\1\3\5\uffff\2\3\1\2\7\uffff\1\3\2\uffff\2\3\1\uffff\1\4"+
			"\6\uffff\3\3\2\uffff\1\3\2\uffff\1\5\1\3\1\uffff\1\3\1\uffff\2\3\1\uffff"+
			"\1\3\1\uffff\2\3\1\uffff\1\3\1\uffff\7\3\1\uffff\5\3\1\uffff\2\3\2\uffff"+
			"\7\3\1\uffff\1\3",
			"\1\uffff",
			"",
			"\1\3\4\uffff\1\3\5\uffff\2\3\1\7\7\uffff\1\3\2\uffff\2\3\1\uffff\1\4"+
			"\6\uffff\3\3\2\uffff\1\3\2\uffff\1\5\1\3\1\uffff\1\3\1\uffff\2\3\1\uffff"+
			"\1\3\1\uffff\2\3\1\uffff\1\3\1\uffff\7\3\1\uffff\5\3\1\uffff\2\3\2\uffff"+
			"\7\3\1\uffff\1\3",
			"\1\10",
			"",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "151:2: ( ruleIDENTIFIER | ruleQualifiedIdent )";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA10_2 = input.LA(1);
						 
						int index10_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred26_DebugInternalGo()) ) {s = 3;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index10_2);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA10_7 = input.LA(1);
						 
						int index10_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred26_DebugInternalGo()) ) {s = 3;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index10_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA10_8 = input.LA(1);
						 
						int index10_8 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred26_DebugInternalGo()) ) {s = 3;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index10_8);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 10, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA13_eotS =
		"\7\uffff";
	static final String DFA13_eofS =
		"\7\uffff";
	static final String DFA13_minS =
		"\1\26\1\24\1\uffff\1\0\1\uffff\1\24\1\0";
	static final String DFA13_maxS =
		"\1\55\1\126\1\uffff\1\0\1\uffff\1\126\1\0";
	static final String DFA13_acceptS =
		"\2\uffff\1\2\1\uffff\1\1\2\uffff";
	static final String DFA13_specialS =
		"\3\uffff\1\0\2\uffff\1\1}>";
	static final String[] DFA13_transitionS = {
			"\1\1\26\uffff\1\2",
			"\1\2\1\uffff\1\3\7\uffff\1\2\5\uffff\1\5\6\uffff\1\4\1\uffff\1\4\2\uffff"+
			"\1\4\2\uffff\1\2\4\uffff\1\2\1\4\3\uffff\1\4\6\uffff\1\4\7\uffff\1\4"+
			"\3\uffff\2\4\4\uffff\1\4",
			"",
			"\1\uffff",
			"",
			"\1\2\1\uffff\1\6\7\uffff\1\2\5\uffff\1\5\6\uffff\1\4\1\uffff\1\4\2\uffff"+
			"\1\4\2\uffff\1\2\4\uffff\1\2\1\4\3\uffff\1\4\6\uffff\1\4\7\uffff\1\4"+
			"\3\uffff\2\4\4\uffff\1\4",
			"\1\uffff"
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "229:2: ( ruleIdentifierList ruleType | ruleEmbeddedField )";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA13_3 = input.LA(1);
						 
						int index13_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_DebugInternalGo()) ) {s = 4;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index13_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA13_6 = input.LA(1);
						 
						int index13_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_DebugInternalGo()) ) {s = 4;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index13_6);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 13, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA25_eotS =
		"\5\uffff";
	static final String DFA25_eofS =
		"\5\uffff";
	static final String DFA25_minS =
		"\3\26\2\uffff";
	static final String DFA25_maxS =
		"\1\26\2\70\2\uffff";
	static final String DFA25_acceptS =
		"\3\uffff\1\1\1\2";
	static final String DFA25_specialS =
		"\5\uffff}>";
	static final String[] DFA25_transitionS = {
			"\1\1",
			"\1\2\15\uffff\1\2\6\uffff\1\3\7\uffff\1\4\4\uffff\1\4",
			"\1\2\15\uffff\1\2\6\uffff\1\3\7\uffff\1\4\4\uffff\1\4",
			"",
			""
	};

	static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
	static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
	static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
	static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
	static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
	static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
	static final short[][] DFA25_transition;

	static {
		int numStates = DFA25_transitionS.length;
		DFA25_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
		}
	}

	protected class DFA25 extends DFA {

		public DFA25(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 25;
			this.eot = DFA25_eot;
			this.eof = DFA25_eof;
			this.min = DFA25_min;
			this.max = DFA25_max;
			this.accept = DFA25_accept;
			this.special = DFA25_special;
			this.transition = DFA25_transition;
		}
		@Override
		public String getDescription() {
			return "331:2: ( ruleMethodName ruleSignature | ruleInterfaceTypeName )";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA30_eotS =
		"\25\uffff";
	static final String DFA30_eofS =
		"\2\uffff\1\3\16\uffff\1\3\3\uffff";
	static final String DFA30_minS =
		"\1\11\1\uffff\1\7\1\uffff\1\26\12\uffff\1\0\1\uffff\1\7\1\0\2\uffff";
	static final String DFA30_maxS =
		"\1\132\1\uffff\1\134\1\uffff\1\26\12\uffff\1\0\1\uffff\1\134\1\0\2\uffff";
	static final String DFA30_acceptS =
		"\1\uffff\1\1\1\uffff\1\3\1\uffff\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15"+
		"\1\16\1\17\1\uffff\1\2\2\uffff\1\4\1\10";
	static final String DFA30_specialS =
		"\17\uffff\1\1\2\uffff\1\0\2\uffff}>";
	static final String[] DFA30_transitionS = {
			"\1\3\4\uffff\1\3\6\uffff\1\3\1\2\12\uffff\2\3\10\uffff\1\3\1\uffff\1"+
			"\3\12\uffff\2\3\3\uffff\2\3\3\uffff\1\6\1\uffff\1\3\1\1\1\7\1\uffff\1"+
			"\16\1\uffff\1\10\1\15\1\3\1\4\1\12\1\uffff\2\3\2\uffff\1\5\1\14\1\3\1"+
			"\13\2\1\1\11",
			"",
			"\1\3\1\uffff\1\3\4\uffff\1\3\6\uffff\1\3\1\17\12\uffff\2\3\1\uffff\1"+
			"\21\3\uffff\4\3\1\uffff\7\3\1\uffff\1\3\1\20\10\3\2\uffff\10\3\1\uffff"+
			"\5\3\1\uffff\2\3\2\uffff\11\3",
			"",
			"\1\22",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"\1\3\1\uffff\1\3\4\uffff\1\3\6\uffff\1\3\1\17\12\uffff\2\3\1\uffff\1"+
			"\21\3\uffff\4\3\1\uffff\7\3\1\uffff\1\3\1\20\10\3\2\uffff\10\3\1\uffff"+
			"\5\3\1\uffff\2\3\2\uffff\11\3",
			"\1\uffff",
			"",
			""
	};

	static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
	static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
	static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
	static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
	static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
	static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
	static final short[][] DFA30_transition;

	static {
		int numStates = DFA30_transitionS.length;
		DFA30_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
		}
	}

	protected class DFA30 extends DFA {

		public DFA30(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 30;
			this.eot = DFA30_eot;
			this.eof = DFA30_eof;
			this.min = DFA30_min;
			this.max = DFA30_max;
			this.accept = DFA30_accept;
			this.special = DFA30_special;
			this.transition = DFA30_transition;
		}
		@Override
		public String getDescription() {
			return "392:2: ( ruleDeclaration | ruleLabeledStmt | ruleSimpleStmt | ruleGoStmt | ruleReturnStmt | ruleBreakStmt | ruleContinueStmt | ruleGotoStmt | ruleFallthroughStmt | ruleBlock | ruleIfStmt | ruleSwitchStmt | ruleSelectStmt | ruleForStmt | ruleDeferStmt )";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA30_18 = input.LA(1);
						 
						int index30_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred55_DebugInternalGo()) ) {s = 19;}
						else if ( (synpred59_DebugInternalGo()) ) {s = 20;}
						 
						input.seek(index30_18);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA30_15 = input.LA(1);
						 
						int index30_15 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred53_DebugInternalGo()) ) {s = 16;}
						else if ( (synpred54_DebugInternalGo()) ) {s = 3;}
						 
						input.seek(index30_15);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 30, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA61_eotS =
		"\5\uffff";
	static final String DFA61_eofS =
		"\5\uffff";
	static final String DFA61_minS =
		"\1\11\1\26\1\uffff\1\26\1\uffff";
	static final String DFA61_maxS =
		"\1\126\1\132\1\uffff\1\132\1\uffff";
	static final String DFA61_acceptS =
		"\2\uffff\1\2\1\uffff\1\1";
	static final String DFA61_specialS =
		"\5\uffff}>";
	static final String[] DFA61_transitionS = {
			"\1\2\4\uffff\1\2\6\uffff\1\2\1\1\12\uffff\1\2\11\uffff\1\2\1\uffff\1"+
			"\2\13\uffff\1\2\3\uffff\2\2\5\uffff\1\2\7\uffff\1\2\3\uffff\2\2\4\uffff"+
			"\1\2",
			"\1\3\15\uffff\1\3\6\uffff\1\2\7\uffff\1\2\3\uffff\1\4\5\uffff\1\2\34"+
			"\uffff\1\2",
			"",
			"\1\3\15\uffff\1\3\6\uffff\1\2\7\uffff\1\2\3\uffff\1\4\5\uffff\1\2\34"+
			"\uffff\1\2",
			""
	};

	static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
	static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
	static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
	static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
	static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
	static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
	static final short[][] DFA61_transition;

	static {
		int numStates = DFA61_transitionS.length;
		DFA61_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
		}
	}

	protected class DFA61 extends DFA {

		public DFA61(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 61;
			this.eot = DFA61_eot;
			this.eof = DFA61_eof;
			this.min = DFA61_min;
			this.max = DFA61_max;
			this.accept = DFA61_accept;
			this.special = DFA61_special;
			this.transition = DFA61_transition;
		}
		@Override
		public String getDescription() {
			return "736:2: ( ruleIDENTIFIER ':=' )?";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA70_eotS =
		"\11\uffff";
	static final String DFA70_eofS =
		"\11\uffff";
	static final String DFA70_minS =
		"\1\11\1\uffff\1\7\1\uffff\1\7\1\11\1\uffff\2\7";
	static final String DFA70_maxS =
		"\1\126\1\uffff\1\132\1\uffff\1\132\1\126\1\uffff\2\132";
	static final String DFA70_acceptS =
		"\1\uffff\1\1\1\uffff\1\3\2\uffff\1\2\2\uffff";
	static final String DFA70_specialS =
		"\11\uffff}>";
	static final String[] DFA70_transitionS = {
			"\1\1\4\uffff\1\1\6\uffff\1\1\1\2\12\uffff\2\1\10\uffff\1\1\1\uffff\1"+
			"\1\13\uffff\1\1\3\uffff\2\1\5\uffff\1\1\7\uffff\1\1\3\uffff\2\1\1\uffff"+
			"\1\3\2\uffff\1\1",
			"",
			"\1\1\16\uffff\1\4\15\uffff\1\4\6\uffff\1\1\4\uffff\1\5\2\uffff\1\1\3"+
			"\uffff\1\6\3\uffff\1\1\1\uffff\1\1\34\uffff\1\1",
			"",
			"\1\1\16\uffff\1\4\15\uffff\1\4\6\uffff\1\1\4\uffff\1\5\2\uffff\1\1\3"+
			"\uffff\1\6\3\uffff\1\1\1\uffff\1\1\34\uffff\1\1",
			"\1\1\4\uffff\1\1\6\uffff\1\1\1\7\12\uffff\2\1\10\uffff\1\1\1\uffff\1"+
			"\1\13\uffff\1\1\3\uffff\2\1\5\uffff\1\1\7\uffff\1\1\3\uffff\2\1\4\uffff"+
			"\1\1",
			"",
			"\1\1\16\uffff\1\10\15\uffff\1\10\6\uffff\1\1\4\uffff\1\5\2\uffff\1\1"+
			"\3\uffff\1\6\3\uffff\1\1\1\uffff\1\1\34\uffff\1\1",
			"\1\1\16\uffff\1\10\15\uffff\1\10\6\uffff\1\1\4\uffff\1\5\2\uffff\1\1"+
			"\3\uffff\1\6\3\uffff\1\1\1\uffff\1\1\34\uffff\1\1"
	};

	static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
	static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
	static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
	static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
	static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
	static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
	static final short[][] DFA70_transition;

	static {
		int numStates = DFA70_transitionS.length;
		DFA70_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
		}
	}

	protected class DFA70 extends DFA {

		public DFA70(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 70;
			this.eot = DFA70_eot;
			this.eof = DFA70_eof;
			this.min = DFA70_min;
			this.max = DFA70_max;
			this.accept = DFA70_accept;
			this.special = DFA70_special;
			this.transition = DFA70_transition;
		}
		@Override
		public String getDescription() {
			return "830:2: ( ruleExpressionList '=' | ruleIdentifierList ':=' )?";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA97_eotS =
		"\11\uffff";
	static final String DFA97_eofS =
		"\1\uffff\1\4\3\uffff\1\4\3\uffff";
	static final String DFA97_minS =
		"\1\26\1\7\1\0\1\26\1\uffff\1\7\1\uffff\2\0";
	static final String DFA97_maxS =
		"\1\26\1\134\1\0\1\53\1\uffff\1\134\1\uffff\2\0";
	static final String DFA97_acceptS =
		"\4\uffff\1\1\1\uffff\1\2\2\uffff";
	static final String DFA97_specialS =
		"\2\uffff\1\0\4\uffff\1\2\1\1}>";
	static final String[] DFA97_transitionS = {
			"\1\1",
			"\1\4\1\uffff\1\4\4\uffff\1\4\6\uffff\1\4\1\2\12\uffff\2\4\1\uffff\1"+
			"\5\3\uffff\13\4\1\3\3\4\1\uffff\7\4\1\uffff\11\4\1\uffff\5\4\1\uffff"+
			"\2\4\2\uffff\11\4",
			"\1\uffff",
			"\1\7\24\uffff\1\4",
			"",
			"\1\4\1\uffff\1\4\4\uffff\1\4\6\uffff\1\4\1\10\12\uffff\2\4\1\uffff\1"+
			"\5\3\uffff\13\4\1\3\3\4\1\uffff\7\4\1\uffff\11\4\1\uffff\5\4\1\uffff"+
			"\2\4\2\uffff\11\4",
			"",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA97_eot = DFA.unpackEncodedString(DFA97_eotS);
	static final short[] DFA97_eof = DFA.unpackEncodedString(DFA97_eofS);
	static final char[] DFA97_min = DFA.unpackEncodedStringToUnsignedChars(DFA97_minS);
	static final char[] DFA97_max = DFA.unpackEncodedStringToUnsignedChars(DFA97_maxS);
	static final short[] DFA97_accept = DFA.unpackEncodedString(DFA97_acceptS);
	static final short[] DFA97_special = DFA.unpackEncodedString(DFA97_specialS);
	static final short[][] DFA97_transition;

	static {
		int numStates = DFA97_transitionS.length;
		DFA97_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA97_transition[i] = DFA.unpackEncodedString(DFA97_transitionS[i]);
		}
	}

	protected class DFA97 extends DFA {

		public DFA97(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 97;
			this.eot = DFA97_eot;
			this.eof = DFA97_eof;
			this.min = DFA97_min;
			this.max = DFA97_max;
			this.accept = DFA97_accept;
			this.special = DFA97_special;
			this.transition = DFA97_transition;
		}
		@Override
		public String getDescription() {
			return "1139:2: ( ruleIDENTIFIER | ruleQualifiedIdent )";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA97_2 = input.LA(1);
						 
						int index97_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred156_DebugInternalGo()) ) {s = 4;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index97_2);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA97_8 = input.LA(1);
						 
						int index97_8 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred156_DebugInternalGo()) ) {s = 4;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index97_8);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA97_7 = input.LA(1);
						 
						int index97_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred156_DebugInternalGo()) ) {s = 4;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index97_7);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 97, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_ruleCompilation_initial_in_ruleModel19 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePackageClause_in_ruleCompilation_initial33 = new BitSet(new long[]{0x0000000000000002L,0x0000000003009020L});
	public static final BitSet FOLLOW_ruleImportDecl_in_ruleCompilation_initial37 = new BitSet(new long[]{0x0000000000000002L,0x0000000003009020L});
	public static final BitSet FOLLOW_ruleTopLevelDecl_in_ruleCompilation_initial45 = new BitSet(new long[]{0x0000000000000002L,0x0000000003001020L});
	public static final BitSet FOLLOW_ruleDeclaration_in_ruleTopLevelDecl67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFunctionDecl_in_ruleTopLevelDecl79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleMethodDecl_in_ruleTopLevelDecl91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_ruleMethodDecl104 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ruleReceiver_in_ruleMethodDecl107 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ruleMethodName_in_ruleMethodDecl110 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ruleSignature_in_ruleMethodDecl113 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
	public static final BitSet FOLLOW_ruleFunctionBody_in_ruleMethodDecl116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameters_in_ruleReceiver129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleFunctionName139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_ruleFunctionDecl149 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ruleFunctionName_in_ruleFunctionDecl152 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ruleSignature_in_ruleFunctionDecl155 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
	public static final BitSet FOLLOW_ruleFunctionBody_in_ruleFunctionDecl158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_rulePackageClause171 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_rulePackageName_in_rulePackageClause174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_ruleASSING_OP315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_LETTER_in_ruleIDENTIFIER325 = new BitSet(new long[]{0x0000001000400002L});
	public static final BitSet FOLLOW_set_in_ruleIMAGINARY_LIT358 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_ruleIMAGINARY_LIT380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_ruleRUNE_LIT390 = new BitSet(new long[]{0x0000004000000100L});
	public static final BitSet FOLLOW_set_in_ruleRUNE_LIT393 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_ruleRUNE_LIT415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeName_in_ruleType458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeLit_in_ruleType470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_ruleType482 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleType_in_ruleType486 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_ruleType490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleTypeName507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleQualifiedIdent_in_ruleTypeName519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePackageName_in_ruleQualifiedIdent532 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_ruleQualifiedIdent535 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleQualifiedIdent538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_rulePackageName548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleArrayType_in_ruleTypeLit562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStructType_in_ruleTypeLit574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePointerType_in_ruleTypeLit586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFunctionType_in_ruleTypeLit598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInterfaceType_in_ruleTypeLit610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSliceType_in_ruleTypeLit622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleMapType_in_ruleTypeLit634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleChannelType_in_ruleTypeLit646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_ruleArrayType659 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleArrayLength_in_ruleArrayType662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_ruleArrayType665 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleElementType_in_ruleArrayType668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLength678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleElementType688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_ruleSliceType698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_ruleSliceType701 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleElementType_in_ruleSliceType704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_ruleStructType714 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_ruleStructType717 = new BitSet(new long[]{0x0000200000400000L,0x0000000010000000L});
	public static final BitSet FOLLOW_ruleFieldDecl_in_ruleStructType724 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_ruleStructType728 = new BitSet(new long[]{0x0000200000400000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_ruleStructType735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleFieldDecl749 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleType_in_ruleFieldDecl753 = new BitSet(new long[]{0x0000000040100002L});
	public static final BitSet FOLLOW_ruleEmbeddedField_in_ruleFieldDecl765 = new BitSet(new long[]{0x0000000040100002L});
	public static final BitSet FOLLOW_ruleTag_in_ruleFieldDecl771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleIdentifierList784 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_ruleIdentifierList791 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleIdentifierList795 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_45_in_ruleEmbeddedField809 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ruleTypeName_in_ruleEmbeddedField813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSTRING_LIT_in_ruleTag823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_rulePointerType833 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleBaseType_in_rulePointerType836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleBaseType846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_ruleFunctionType856 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ruleSignature_in_ruleFunctionType859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameters_in_ruleSignature869 = new BitSet(new long[]{0x2200280000400002L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleResult_in_ruleSignature872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameters_in_ruleResult889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleResult901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_ruleParameters914 = new BitSet(new long[]{0x2211380000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleParameterList_in_ruleParameters917 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_ruleParameters923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameterDecl_in_ruleParameterList933 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_ruleParameterList940 = new BitSet(new long[]{0x2211280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleParameterDecl_in_ruleParameterList944 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleParameterDecl958 = new BitSet(new long[]{0x2210280000400002L,0x0000000000431010L});
	public static final BitSet FOLLOW_52_in_ruleParameterDecl964 = new BitSet(new long[]{0x2200280000400002L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleType_in_ruleParameterDecl968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_ruleInterfaceType981 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_ruleInterfaceType984 = new BitSet(new long[]{0x0000000000400000L,0x0000000010000000L});
	public static final BitSet FOLLOW_ruleMethodSpec_in_ruleInterfaceType991 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_ruleInterfaceType995 = new BitSet(new long[]{0x0000000000400000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_ruleInterfaceType1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleMethodName_in_ruleMethodSpec1016 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ruleSignature_in_ruleMethodSpec1020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInterfaceTypeName_in_ruleMethodSpec1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleMethodName1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeName_in_ruleInterfaceTypeName1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_ruleMapType1065 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_ruleMapType1068 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleKeyType_in_ruleMapType1071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_ruleMapType1074 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleElementType_in_ruleMapType1077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleKeyType1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_ruleChannelType1101 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_57_in_ruleChannelType1105 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_57_in_ruleChannelType1118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_ruleChannelType1122 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleElementType_in_ruleChannelType1128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_ruleBlock1138 = new BitSet(new long[]{0x6300280600604200L,0x0000000017F37D74L});
	public static final BitSet FOLLOW_ruleStatementList_in_ruleBlock1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_ruleBlock1144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStatement_in_ruleStatementList1158 = new BitSet(new long[]{0x6300280600604202L,0x0000000007F37D74L});
	public static final BitSet FOLLOW_56_in_ruleStatementList1162 = new BitSet(new long[]{0x6300280600604202L,0x0000000007F37D74L});
	public static final BitSet FOLLOW_ruleDeclaration_in_ruleStatement1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLabeledStmt_in_ruleStatement1193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_ruleStatement1205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGoStmt_in_ruleStatement1217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleReturnStmt_in_ruleStatement1229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBreakStmt_in_ruleStatement1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleContinueStmt_in_ruleStatement1253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGotoStmt_in_ruleStatement1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFallthroughStmt_in_ruleStatement1277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBlock_in_ruleStatement1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIfStmt_in_ruleStatement1301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSwitchStmt_in_ruleStatement1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSelectStmt_in_ruleStatement1325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleForStmt_in_ruleStatement1337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeferStmt_in_ruleStatement1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleConstDecl_in_ruleDeclaration1366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeDecl_in_ruleDeclaration1378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleVarDecl_in_ruleDeclaration1390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLabel_in_ruleLabeledStmt1403 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_ruleLabeledStmt1406 = new BitSet(new long[]{0x6300280600604200L,0x0000000007F37D74L});
	public static final BitSet FOLLOW_ruleStatement_in_ruleLabeledStmt1409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIncDecStmt_in_ruleSimpleStmt1423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAssignment_in_ruleSimpleStmt1435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSendStmt_in_ruleSimpleStmt1447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleShortVarDecl_in_ruleSimpleStmt1459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionStmt_in_ruleSimpleStmt1471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEmptyStmt_in_ruleSimpleStmt1483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_ruleGoStmt1496 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ruleLabel_in_ruleGoStmt1499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_ruleReturnStmt1509 = new BitSet(new long[]{0x6200280600604202L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleReturnStmt1512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_ruleBreakStmt1525 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_ruleLabel_in_ruleBreakStmt1528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_ruleContinueStmt1539 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_ruleLabel_in_ruleContinueStmt1542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_ruleGotoStmt1553 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ruleLabel_in_ruleGotoStmt1556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_ruleIfStmt1566 = new BitSet(new long[]{0x6300280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_ruleIfStmt1573 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_ruleIfStmt1577 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleIfStmt1584 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_ruleBlock_in_ruleIfStmt1587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_ruleIfStmt1594 = new BitSet(new long[]{0x0000000000000000L,0x0000000004004000L});
	public static final BitSet FOLLOW_ruleIfStmt_in_ruleIfStmt1603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBlock_in_ruleIfStmt1617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_ruleFallthroughStmt1635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExprSwitchStmt_in_ruleSwitchStmt1649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeSwitchStmt_in_ruleSwitchStmt1661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_ruleSelectStmt1674 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_ruleSelectStmt1677 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000088L});
	public static final BitSet FOLLOW_ruleCommClause_in_ruleSelectStmt1680 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000088L});
	public static final BitSet FOLLOW_92_in_ruleSelectStmt1686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_ruleForStmt1696 = new BitSet(new long[]{0x6300280600604200L,0x00000000044B1010L});
	public static final BitSet FOLLOW_ruleCondition_in_ruleForStmt1703 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_ruleForClause_in_ruleForStmt1715 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_ruleRangeClause_in_ruleForStmt1727 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_ruleBlock_in_ruleForStmt1734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_ruleDeferStmt1744 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleDeferStmt1747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_ruleConstDecl1757 = new BitSet(new long[]{0x0000080000400000L});
	public static final BitSet FOLLOW_ruleConstSpec_in_ruleConstDecl1764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_ruleConstDecl1776 = new BitSet(new long[]{0x0000100000400000L});
	public static final BitSet FOLLOW_ruleConstSpec_in_ruleConstDecl1785 = new BitSet(new long[]{0x0100100000400000L});
	public static final BitSet FOLLOW_56_in_ruleConstDecl1790 = new BitSet(new long[]{0x0000100000400000L});
	public static final BitSet FOLLOW_44_in_ruleConstDecl1800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleConstSpec1813 = new BitSet(new long[]{0x2A00280000400002L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleType_in_ruleConstSpec1820 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_ruleConstSpec1828 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleConstSpec1832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_ruleTypeDecl1846 = new BitSet(new long[]{0x0000080000400000L});
	public static final BitSet FOLLOW_ruleTypeSpec_in_ruleTypeDecl1853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_ruleTypeDecl1865 = new BitSet(new long[]{0x0000100000400000L});
	public static final BitSet FOLLOW_ruleTypeSpec_in_ruleTypeDecl1874 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_ruleTypeDecl1879 = new BitSet(new long[]{0x0000100000400000L});
	public static final BitSet FOLLOW_44_in_ruleTypeDecl1888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAliasDecl_in_ruleTypeSpec1905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeDef_in_ruleTypeSpec1917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleTypeDef1930 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleType_in_ruleTypeDef1933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleAliasDecl1943 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_ruleAliasDecl1946 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleType_in_ruleAliasDecl1949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_ruleVarDecl1959 = new BitSet(new long[]{0x0000080000400000L});
	public static final BitSet FOLLOW_ruleVarSpec_in_ruleVarDecl1966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_ruleVarDecl1978 = new BitSet(new long[]{0x0000100000400000L});
	public static final BitSet FOLLOW_ruleVarSpec_in_ruleVarDecl1987 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_ruleVarDecl1992 = new BitSet(new long[]{0x0000100000400000L});
	public static final BitSet FOLLOW_44_in_ruleVarDecl2001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleVarSpec2014 = new BitSet(new long[]{0x2A00280000400002L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleType_in_ruleVarSpec2017 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_59_in_ruleVarSpec2027 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleVarSpec2031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_ruleEmptyStmt2045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionStmt2055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleChannel_in_ruleSendStmt2065 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_ruleSendStmt2068 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSendStmt2071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleChannel2081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleIncDecStmt2095 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_ruleIncDecStmt2099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleIncDecStmt2111 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_ruleIncDecStmt2115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleAssignment2128 = new BitSet(new long[]{0x1C22670000000000L,0x0000000008000002L});
	public static final BitSet FOLLOW_ruleASSING_OP_in_ruleAssignment2131 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleAssignment2134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleShortVarDecl2144 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ruleShortVarDecl2147 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleShortVarDecl2150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_ruleExprSwitchStmt2160 = new BitSet(new long[]{0x6300280600604200L,0x0000000004431010L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_ruleExprSwitchStmt2167 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_ruleExprSwitchStmt2171 = new BitSet(new long[]{0x6200280600604200L,0x0000000004431010L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleExprSwitchStmt2178 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_ruleExprSwitchStmt2184 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000088L});
	public static final BitSet FOLLOW_ruleExprCaseClause_in_ruleExprSwitchStmt2187 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000088L});
	public static final BitSet FOLLOW_92_in_ruleExprSwitchStmt2193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExprSwitchCase_in_ruleExprCaseClause2203 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_ruleExprCaseClause2206 = new BitSet(new long[]{0x6300280600604200L,0x0000000007F37D74L});
	public static final BitSet FOLLOW_ruleStatementList_in_ruleExprCaseClause2209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_ruleExprSwitchCase2223 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleExprSwitchCase2227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_ruleExprSwitchCase2239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_ruleTypeSwitchStmt2252 = new BitSet(new long[]{0x6300280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_ruleTypeSwitchStmt2259 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_ruleTypeSwitchStmt2263 = new BitSet(new long[]{0x6200280200604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleTypeSwitchGuard_in_ruleTypeSwitchStmt2270 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_ruleTypeSwitchStmt2273 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000088L});
	public static final BitSet FOLLOW_ruleTypeCaseClause_in_ruleTypeSwitchStmt2276 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000088L});
	public static final BitSet FOLLOW_92_in_ruleTypeSwitchStmt2282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleTypeSwitchGuard2296 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ruleTypeSwitchGuard2300 = new BitSet(new long[]{0x6200280200604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_rulePrimaryExpr_in_ruleTypeSwitchGuard2307 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_ruleTypeSwitchGuard2310 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_ruleTypeSwitchGuard2313 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_ruleTypeSwitchGuard2316 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_ruleTypeSwitchGuard2319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeSwitchCase_in_ruleTypeCaseClause2329 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_ruleTypeCaseClause2332 = new BitSet(new long[]{0x6300280600604200L,0x0000000007F37D74L});
	public static final BitSet FOLLOW_ruleStatementList_in_ruleTypeCaseClause2335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_ruleTypeSwitchCase2349 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleTypeList_in_ruleTypeSwitchCase2353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_ruleTypeSwitchCase2365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleTypeList2378 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_ruleTypeList2385 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleType_in_ruleTypeList2389 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_ruleCommCase_in_ruleCommClause2403 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_ruleCommClause2406 = new BitSet(new long[]{0x6300280600604200L,0x0000000007F37D74L});
	public static final BitSet FOLLOW_ruleStatementList_in_ruleCommClause2409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_ruleCommCase2423 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleSendStmt_in_ruleCommCase2432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleRecvStmt_in_ruleCommCase2446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_ruleCommCase2462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleRecvStmt2479 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_ruleRecvStmt2483 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleRecvStmt2495 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ruleRecvStmt2499 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleRecvExpr_in_ruleRecvStmt2506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleRecvExpr2516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleCondition2526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInitStmt_in_ruleForClause2536 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_ruleForClause2542 = new BitSet(new long[]{0x6300280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleCondition_in_ruleForClause2545 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_ruleForClause2551 = new BitSet(new long[]{0x6300280600604202L,0x0000000000431010L});
	public static final BitSet FOLLOW_rulePostStmt_in_ruleForClause2554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleRangeClause2571 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_ruleRangeClause2575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleRangeClause2587 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ruleRangeClause2591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_ruleRangeClause2598 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleRangeClause2601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_ruleInitStmt2611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_rulePostStmt2621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleLabel2631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList2641 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_ruleExpressionList2648 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList2652 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_ruleUnaryExpr_in_ruleExpression2666 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ruleExpression2_in_ruleExpression2669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_BINARY_OP_in_ruleExpression22683 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleExpression22687 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ruleExpression2_in_ruleExpression22691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePrimaryExpr_in_ruleUnaryExpr2709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_UNARY_OP_in_ruleUnaryExpr2721 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleUnaryExpr_in_ruleUnaryExpr2725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOperand_in_rulePrimaryExpr2742 = new BitSet(new long[]{0x2008080000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleConversion_in_rulePrimaryExpr2758 = new BitSet(new long[]{0x2008080000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleMethodExpr_in_rulePrimaryExpr2774 = new BitSet(new long[]{0x2008080000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSelector_in_rulePrimaryExpr22795 = new BitSet(new long[]{0x2008080000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIndex_in_rulePrimaryExpr22811 = new BitSet(new long[]{0x2008080000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSlice_in_rulePrimaryExpr22827 = new BitSet(new long[]{0x2008080000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeAssertion_in_rulePrimaryExpr22843 = new BitSet(new long[]{0x2008080000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleArguments_in_rulePrimaryExpr22859 = new BitSet(new long[]{0x2008080000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLiteral_in_ruleOperand2881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOperandName_in_ruleOperand2893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_ruleOperand2905 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleOperand2909 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_ruleOperand2913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleConversion2926 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_ruleConversion2929 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleConversion2932 = new BitSet(new long[]{0x0001100000000000L});
	public static final BitSet FOLLOW_48_in_ruleConversion2935 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_ruleConversion2939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleReceiverType_in_ruleMethodExpr2949 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_ruleMethodExpr2952 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ruleMethodName_in_ruleMethodExpr2955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_ruleSelector2965 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleSelector2968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_ruleIndex2978 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleIndex2981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_ruleIndex2984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_ruleSlice2998 = new BitSet(new long[]{0x6240280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSlice3002 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_ruleSlice3010 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431011L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSlice3014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_ruleSlice3022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_ruleSlice3034 = new BitSet(new long[]{0x6240280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSlice3038 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_ruleSlice3046 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSlice3050 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_ruleSlice3054 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSlice3058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_ruleSlice3062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_ruleTypeAssertion3075 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_ruleTypeAssertion3078 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleType_in_ruleTypeAssertion3081 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_ruleTypeAssertion3084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_ruleArguments3094 = new BitSet(new long[]{0x6200380600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleArguments3106 = new BitSet(new long[]{0x0011100000000000L});
	public static final BitSet FOLLOW_ruleType_in_ruleArguments3120 = new BitSet(new long[]{0x0011100000000000L});
	public static final BitSet FOLLOW_48_in_ruleArguments3131 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleArguments3137 = new BitSet(new long[]{0x0011100000000000L});
	public static final BitSet FOLLOW_52_in_ruleArguments3151 = new BitSet(new long[]{0x0001100000000000L});
	public static final BitSet FOLLOW_48_in_ruleArguments3156 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_ruleArguments3164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBasicLit_in_ruleLiteral3178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCompositeLit_in_ruleLiteral3190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFunctionLit_in_ruleLiteral3202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_ruleFunctionLit3215 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ruleSignature_in_ruleFunctionLit3218 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_ruleFunctionBody_in_ruleFunctionLit3221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLiteralType_in_ruleCompositeLit3231 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_ruleLiteralValue_in_ruleCompositeLit3234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStructType_in_ruleLiteralType3248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleArrayType_in_ruleLiteralType3260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_ruleLiteralType3272 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_ruleLiteralType3276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_ruleLiteralType3280 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleElementType_in_ruleLiteralType3284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSliceType_in_ruleLiteralType3296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleMapType_in_ruleLiteralType3308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeName_in_ruleLiteralType3320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_ruleLiteralValue3333 = new BitSet(new long[]{0x6200280600604200L,0x0000000014431010L});
	public static final BitSet FOLLOW_ruleElementList_in_ruleLiteralValue3340 = new BitSet(new long[]{0x0001000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_48_in_ruleLiteralValue3344 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_ruleLiteralValue3352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleKeyedElement_in_ruleElementList3362 = new BitSet(new long[]{0x6201280600604202L,0x0000000004431010L});
	public static final BitSet FOLLOW_48_in_ruleElementList3369 = new BitSet(new long[]{0x6200280600604200L,0x0000000004431010L});
	public static final BitSet FOLLOW_ruleKeyedElement_in_ruleElementList3374 = new BitSet(new long[]{0x6201280600604202L,0x0000000004431010L});
	public static final BitSet FOLLOW_ruleKey_in_ruleKeyedElement3392 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_ruleKeyedElement3396 = new BitSet(new long[]{0x6200280600604200L,0x0000000004431010L});
	public static final BitSet FOLLOW_ruleElement_in_ruleKeyedElement3403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFieldName_in_ruleKey3417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleKey3429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLiteralValue_in_ruleKey3441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleFieldName3454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleElement3468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLiteralValue_in_ruleElement3480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_INT_LIT_in_ruleBasicLit3497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_FLOAT_LIT_in_ruleBasicLit3509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIMAGINARY_LIT_in_ruleBasicLit3521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleRUNE_LIT_in_ruleBasicLit3533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleBasicLit3545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleReceiverType3558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBlock_in_ruleFunctionBody3568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleOperandName3582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleQualifiedIdent_in_ruleOperandName3594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_ruleImportDecl3607 = new BitSet(new long[]{0x0008080200400000L});
	public static final BitSet FOLLOW_ruleImportSpec_in_ruleImportDecl3614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_ruleImportDecl3626 = new BitSet(new long[]{0x0008100200400000L});
	public static final BitSet FOLLOW_ruleImportSpec_in_ruleImportDecl3630 = new BitSet(new long[]{0x0008100200400000L});
	public static final BitSet FOLLOW_44_in_ruleImportDecl3638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_ruleImportSpec3655 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleImportSpec3667 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_ruleImportPath_in_ruleImportSpec3674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleImportPath3684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_synpred26_DebugInternalGo507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_synpred35_DebugInternalGo749 = new BitSet(new long[]{0x2200280000400000L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleType_in_synpred35_DebugInternalGo753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_synpred37_DebugInternalGo791 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_synpred37_DebugInternalGo795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleResult_in_synpred39_DebugInternalGo872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameters_in_synpred40_DebugInternalGo889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameterList_in_synpred41_DebugInternalGo917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_synpred43_DebugInternalGo958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_synpred48_DebugInternalGo1105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_synpred50_DebugInternalGo1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLabeledStmt_in_synpred53_DebugInternalGo1193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_synpred54_DebugInternalGo1205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGoStmt_in_synpred55_DebugInternalGo1217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGotoStmt_in_synpred59_DebugInternalGo1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIncDecStmt_in_synpred68_DebugInternalGo1423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAssignment_in_synpred69_DebugInternalGo1435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSendStmt_in_synpred70_DebugInternalGo1447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleShortVarDecl_in_synpred71_DebugInternalGo1459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionStmt_in_synpred72_DebugInternalGo1471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_synpred73_DebugInternalGo1512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLabel_in_synpred74_DebugInternalGo1528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLabel_in_synpred75_DebugInternalGo1542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_synpred76_DebugInternalGo1573 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_synpred76_DebugInternalGo1577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExprSwitchStmt_in_synpred79_DebugInternalGo1649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCondition_in_synpred81_DebugInternalGo1703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleForClause_in_synpred82_DebugInternalGo1715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleRangeClause_in_synpred83_DebugInternalGo1727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_synpred88_DebugInternalGo1820 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_synpred88_DebugInternalGo1828 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpressionList_in_synpred88_DebugInternalGo1832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAliasDecl_in_synpred91_DebugInternalGo1905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_synpred94_DebugInternalGo2017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_synpred96_DebugInternalGo2095 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred96_DebugInternalGo2099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_synpred97_DebugInternalGo2167 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_synpred97_DebugInternalGo2171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_synpred101_DebugInternalGo2259 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_synpred101_DebugInternalGo2263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSendStmt_in_synpred106_DebugInternalGo2432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_synpred108_DebugInternalGo2479 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_synpred108_DebugInternalGo2483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_synpred109_DebugInternalGo2495 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_synpred109_DebugInternalGo2499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInitStmt_in_synpred110_DebugInternalGo2536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_BINARY_OP_in_synpred116_DebugInternalGo2683 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpression_in_synpred116_DebugInternalGo2687 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ruleExpression2_in_synpred116_DebugInternalGo2691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOperand_in_synpred118_DebugInternalGo2742 = new BitSet(new long[]{0x2008080000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred118_DebugInternalGo2746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleConversion_in_synpred119_DebugInternalGo2758 = new BitSet(new long[]{0x2008080000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred119_DebugInternalGo2762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSelector_in_synpred120_DebugInternalGo2795 = new BitSet(new long[]{0x2008080000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred120_DebugInternalGo2799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIndex_in_synpred121_DebugInternalGo2811 = new BitSet(new long[]{0x2008080000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred121_DebugInternalGo2815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSlice_in_synpred122_DebugInternalGo2827 = new BitSet(new long[]{0x2008080000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred122_DebugInternalGo2831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeAssertion_in_synpred123_DebugInternalGo2843 = new BitSet(new long[]{0x2008080000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred123_DebugInternalGo2847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleArguments_in_synpred124_DebugInternalGo2859 = new BitSet(new long[]{0x2008080000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred124_DebugInternalGo2863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLiteral_in_synpred125_DebugInternalGo2881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOperandName_in_synpred126_DebugInternalGo2893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_synpred130_DebugInternalGo2998 = new BitSet(new long[]{0x6240280600604200L,0x0000000000431010L});
	public static final BitSet FOLLOW_ruleExpression_in_synpred130_DebugInternalGo3002 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_synpred130_DebugInternalGo3010 = new BitSet(new long[]{0x6200280600604200L,0x0000000000431011L});
	public static final BitSet FOLLOW_ruleExpression_in_synpred130_DebugInternalGo3014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_synpred130_DebugInternalGo3022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_synpred132_DebugInternalGo3106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleKey_in_synpred148_DebugInternalGo3392 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_synpred148_DebugInternalGo3396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFieldName_in_synpred149_DebugInternalGo3417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_synpred150_DebugInternalGo3429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_synpred156_DebugInternalGo3582 = new BitSet(new long[]{0x0000000000000002L});
}
