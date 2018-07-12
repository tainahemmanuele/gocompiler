// $ANTLR 3.5.1 C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g 2018-07-11 21:20:57

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
		"RULE_ASSING_OP", "RULE_BIG_U_VALUE", "RULE_BINARY_OP", "RULE_BYTE_VALUE", 
		"RULE_DECIMALS", "RULE_DECIMAL_DIGIT", "RULE_DECIMAL_LIT", "RULE_EQUALS", 
		"RULE_ESCAPED_CHAR", "RULE_EXPOENT", "RULE_FLOAT_LIT", "RULE_HEX_BYTE_VALUE", 
		"RULE_HEX_DIGIT", "RULE_HEX_LIT", "RULE_ID", "RULE_INT", "RULE_INTERPRETED_STRING_LIT", 
		"RULE_INT_LIT", "RULE_LITTLE_U_VALUE", "RULE_ML_COMMENT", "RULE_MUL", 
		"RULE_MUL_OP", "RULE_NEWLINE", "RULE_OCTAL_BYTE_VALUE", "RULE_OCTAL_DIGIT", 
		"RULE_OCTAL_LIT", "RULE_RAW_STRING_LIT", "RULE_REL_OP", "RULE_SL_COMMENT", 
		"RULE_STRING", "RULE_UNARY_OP", "RULE_UNICODE_CHAR", "RULE_UNICODE_LETTER", 
		"RULE_UNICODE_VALUE", "RULE_WS", "'('", "')'", "'++'", "','", "'--'", 
		"'.'", "'...'", "':'", "':='", "';'", "'<-'", "'['", "'\\''", "'\\u00EF'", 
		"']'", "'break'", "'case'", "'chan'", "'const'", "'continue'", "'default'", 
		"'defer'", "'else'", "'fallthrough'", "'for'", "'func'", "'goto'", "'if'", 
		"'import'", "'interface'", "'map'", "'package'", "'range'", "'return'", 
		"'select'", "'struct'", "'switch'", "'type'", "'var'", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int RULE_ADD_OP=4;
	public static final int RULE_ANY_OTHER=5;
	public static final int RULE_ASSING_OP=6;
	public static final int RULE_BIG_U_VALUE=7;
	public static final int RULE_BINARY_OP=8;
	public static final int RULE_BYTE_VALUE=9;
	public static final int RULE_DECIMALS=10;
	public static final int RULE_DECIMAL_DIGIT=11;
	public static final int RULE_DECIMAL_LIT=12;
	public static final int RULE_EQUALS=13;
	public static final int RULE_ESCAPED_CHAR=14;
	public static final int RULE_EXPOENT=15;
	public static final int RULE_FLOAT_LIT=16;
	public static final int RULE_HEX_BYTE_VALUE=17;
	public static final int RULE_HEX_DIGIT=18;
	public static final int RULE_HEX_LIT=19;
	public static final int RULE_ID=20;
	public static final int RULE_INT=21;
	public static final int RULE_INTERPRETED_STRING_LIT=22;
	public static final int RULE_INT_LIT=23;
	public static final int RULE_LITTLE_U_VALUE=24;
	public static final int RULE_ML_COMMENT=25;
	public static final int RULE_MUL=26;
	public static final int RULE_MUL_OP=27;
	public static final int RULE_NEWLINE=28;
	public static final int RULE_OCTAL_BYTE_VALUE=29;
	public static final int RULE_OCTAL_DIGIT=30;
	public static final int RULE_OCTAL_LIT=31;
	public static final int RULE_RAW_STRING_LIT=32;
	public static final int RULE_REL_OP=33;
	public static final int RULE_SL_COMMENT=34;
	public static final int RULE_STRING=35;
	public static final int RULE_UNARY_OP=36;
	public static final int RULE_UNICODE_CHAR=37;
	public static final int RULE_UNICODE_LETTER=38;
	public static final int RULE_UNICODE_VALUE=39;
	public static final int RULE_WS=40;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "ruleBreakStmt", "ruleUnaryExpr", "synpred124_DebugInternalGo", 
		"ruleImportDecl", "synpred52_DebugInternalGo", "ruleFunctionType", "synpred27_DebugInternalGo", 
		"ruleTypeDecl", "ruleGoStmt", "synpred11_DebugInternalGo", "ruleTag", 
		"synpred60_DebugInternalGo", "synpred72_DebugInternalGo", "ruleConstDecl", 
		"ruleRangeClause", "synpred122_DebugInternalGo", "rulePrimaryExpr", "ruleGotoStmt", 
		"rulePostStmt", "synpred68_DebugInternalGo", "synpred5_DebugInternalGo", 
		"synpred2_DebugInternalGo", "synpred76_DebugInternalGo", "ruleImportSpec", 
		"synpred40_DebugInternalGo", "ruleSimpleStmt", "ruleReturnStmt", "synpred142_DebugInternalGo", 
		"ruleRecvStmt", "synpred118_DebugInternalGo", "rulePackageClause", "synpred129_DebugInternalGo", 
		"synpred41_DebugInternalGo", "synpred98_DebugInternalGo", "synpred48_DebugInternalGo", 
		"ruleSelectStmt", "ruleArguments", "synpred20_DebugInternalGo", "ruleFunctionBody", 
		"synpred38_DebugInternalGo", "synpred63_DebugInternalGo", "synpred99_DebugInternalGo", 
		"synpred57_DebugInternalGo", "synpred23_DebugInternalGo", "ruleArrayLength", 
		"ruleParameters", "synpred139_DebugInternalGo", "ruleMethodExpr", "synpred6_DebugInternalGo", 
		"ruleFunctionDecl", "synpred92_DebugInternalGo", "ruleSwitchStmt", "synpred147_DebugInternalGo", 
		"ruleCommClause", "synpred86_DebugInternalGo", "ruleRUNE_LIT", "ruleShortVarDecl", 
		"rulePrimaryExpr2", "synpred54_DebugInternalGo", "synpred74_DebugInternalGo", 
		"ruleResult", "synpred73_DebugInternalGo", "synpred103_DebugInternalGo", 
		"ruleSlice", "ruleAssignment", "synpred58_DebugInternalGo", "synpred55_DebugInternalGo", 
		"synpred136_DebugInternalGo", "synpred1_DebugInternalGo", "synpred77_DebugInternalGo", 
		"synpred61_DebugInternalGo", "synpred69_DebugInternalGo", "ruleSignature", 
		"ruleExpression", "ruleParameterDecl", "synpred19_DebugInternalGo", "ruleType", 
		"ruleIMAGINARY_LIT", "synpred108_DebugInternalGo", "ruleTopLevelDecl", 
		"synpred70_DebugInternalGo", "synpred107_DebugInternalGo", "synpred94_DebugInternalGo", 
		"ruleConstSpec", "ruleLabeledStmt", "ruleVarDecl", "synpred51_DebugInternalGo", 
		"synpred132_DebugInternalGo", "ruleTypeSwitchStmt", "synpred149_DebugInternalGo", 
		"ruleIncDecStmt", "synpred42_DebugInternalGo", "synpred49_DebugInternalGo", 
		"synpred75_DebugInternalGo", "synpred106_DebugInternalGo", "ruleMethodSpec", 
		"synpred113_DebugInternalGo", "synpred59_DebugInternalGo", "synpred15_DebugInternalGo", 
		"ruleTypeAssertion", "synpred53_DebugInternalGo", "synpred135_DebugInternalGo", 
		"ruleMethodName", "ruleFieldDecl", "synpred16_DebugInternalGo", "ruleTypeLit", 
		"ruleInterfaceTypeName", "ruleTypeList", "ruleTypeSwitchCase", "synpred130_DebugInternalGo", 
		"synpred79_DebugInternalGo", "ruleCompilation_initial", "ruleQualifiedIdent", 
		"ruleArrayType", "synpred133_DebugInternalGo", "synpred145_DebugInternalGo", 
		"synpred115_DebugInternalGo", "synpred96_DebugInternalGo", "synpred46_DebugInternalGo", 
		"synpred29_DebugInternalGo", "synpred89_DebugInternalGo", "synpred125_DebugInternalGo", 
		"ruleForClause", "ruleKey", "synpred127_DebugInternalGo", "synpred109_DebugInternalGo", 
		"ruleEmbeddedField", "ruleDeclaration", "synpred12_DebugInternalGo", "ruleSliceType", 
		"ruleLiteral", "synpred91_DebugInternalGo", "synpred114_DebugInternalGo", 
		"rulePointerType", "ruleSendStmt", "synpred50_DebugInternalGo", "ruleTypeDef", 
		"synpred137_DebugInternalGo", "ruleTypeCaseClause", "synpred78_DebugInternalGo", 
		"ruleImportPath", "synpred88_DebugInternalGo", "synpred32_DebugInternalGo", 
		"synpred14_DebugInternalGo", "synpred18_DebugInternalGo", "synpred37_DebugInternalGo", 
		"synpred17_DebugInternalGo", "synpred30_DebugInternalGo", "synpred148_DebugInternalGo", 
		"ruleSelector", "synpred93_DebugInternalGo", "synpred80_DebugInternalGo", 
		"ruleRecvExpr", "ruleBasicLit", "ruleCondition", "synpred21_DebugInternalGo", 
		"synpred128_DebugInternalGo", "ruleLiteralValue", "ruleReceiverType", 
		"synpred140_DebugInternalGo", "rulePackageName", "ruleExprSwitchCase", 
		"synpred66_DebugInternalGo", "synpred123_DebugInternalGo", "ruleExpression2", 
		"synpred25_DebugInternalGo", "synpred36_DebugInternalGo", "ruleIfStmt", 
		"ruleKeyedElement", "ruleTypeSpec", "ruleBlock", "synpred62_DebugInternalGo", 
		"ruleExprSwitchStmt", "synpred110_DebugInternalGo", "ruleFunctionLit", 
		"ruleLiteralType", "synpred90_DebugInternalGo", "synpred143_DebugInternalGo", 
		"ruleInitStmt", "synpred24_DebugInternalGo", "ruleEmptyStmt", "ruleCommCase", 
		"synpred82_DebugInternalGo", "synpred47_DebugInternalGo", "ruleModel", 
		"synpred34_DebugInternalGo", "ruleChannelType", "synpred87_DebugInternalGo", 
		"synpred8_DebugInternalGo", "synpred144_DebugInternalGo", "ruleKeyType", 
		"ruleIndex", "ruleStructType", "synpred35_DebugInternalGo", "synpred56_DebugInternalGo", 
		"synpred112_DebugInternalGo", "synpred121_DebugInternalGo", "synpred65_DebugInternalGo", 
		"synpred100_DebugInternalGo", "synpred146_DebugInternalGo", "ruleContinueStmt", 
		"synpred3_DebugInternalGo", "synpred111_DebugInternalGo", "ruleInterfaceType", 
		"ruleCompositeLit", "synpred126_DebugInternalGo", "ruleExpressionStmt", 
		"synpred45_DebugInternalGo", "synpred71_DebugInternalGo", "ruleIdentifierList", 
		"ruleOperand", "ruleExpressionList", "ruleElement", "synpred7_DebugInternalGo", 
		"synpred64_DebugInternalGo", "ruleElementType", "synpred9_DebugInternalGo", 
		"synpred97_DebugInternalGo", "ruleBaseType", "synpred138_DebugInternalGo", 
		"synpred83_DebugInternalGo", "synpred26_DebugInternalGo", "synpred119_DebugInternalGo", 
		"ruleReceiver", "ruleFunctionName", "synpred22_DebugInternalGo", "ruleMapType", 
		"synpred104_DebugInternalGo", "synpred116_DebugInternalGo", "synpred44_DebugInternalGo", 
		"ruleOperandName", "ruleConversion", "synpred131_DebugInternalGo", "ruleForStmt", 
		"synpred4_DebugInternalGo", "synpred84_DebugInternalGo", "synpred134_DebugInternalGo", 
		"synpred95_DebugInternalGo", "synpred39_DebugInternalGo", "ruleSTRING_LIT", 
		"ruleChannel", "ruleStatement", "synpred67_DebugInternalGo", "synpred43_DebugInternalGo", 
		"synpred101_DebugInternalGo", "ruleTypeName", "synpred81_DebugInternalGo", 
		"ruleStatementList", "synpred33_DebugInternalGo", "ruleLabel", "synpred13_DebugInternalGo", 
		"synpred85_DebugInternalGo", "synpred31_DebugInternalGo", "ruleIDENTIFIER", 
		"ruleExprCaseClause", "ruleElementList", "synpred141_DebugInternalGo", 
		"ruleFieldName", "synpred28_DebugInternalGo", "synpred102_DebugInternalGo", 
		"ruleVarSpec", "ruleFallthroughStmt", "ruleMethodDecl", "synpred117_DebugInternalGo", 
		"synpred10_DebugInternalGo", "synpred120_DebugInternalGo", "synpred105_DebugInternalGo", 
		"ruleDeferStmt", "ruleAliasDecl", "ruleTypeSwitchGuard", "ruleParameterList"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, true, false, false, false, 
		    true, false, true, false, true, true, true, false, true, false, false, 
		    false, false, true, false, true, false, true, false, true, true, true, 
		    true, true, false, false, true, false, true, false, false, false, 
		    false, true, false, false, false, false, false, false, true, false, 
		    true, true, false, false, false, true, false, false, false, false, 
		    true, false, true, true, false, false, false, false, true, false, 
		    true, true, true, false, false, false, false, true, false, true, false, 
		    false, false, false, false, false, false, false, false, true, true, 
		    false, false, true, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false
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
			if ( (LA3_0==72) ) {
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
						if ( (LA1_0==69) ) {
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
						if ( (LA2_0==59||LA2_0==66||(LA2_0 >= 78 && LA2_0 <= 79)) ) {
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
			if ( (LA4_0==59||(LA4_0 >= 78 && LA4_0 <= 79)) ) {
				alt4=1;
			}
			else if ( (LA4_0==66) ) {
				int LA4_2 = input.LA(2);
				if ( (LA4_2==RULE_ID) ) {
					alt4=2;
				}
				else if ( (LA4_2==41) ) {
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
			match(input,66,FOLLOW_66_in_ruleMethodDecl104); if (state.failed) return;dbg.location(36,2);
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
			if ( (LA5_0==80) ) {
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
			match(input,66,FOLLOW_66_in_ruleFunctionDecl149); if (state.failed) return;dbg.location(56,2);
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
			if ( (LA6_0==80) ) {
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
			match(input,72,FOLLOW_72_in_rulePackageClause171); if (state.failed) return;dbg.location(65,2);
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



	// $ANTLR start "ruleIDENTIFIER"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:69:1: ruleIDENTIFIER : RULE_ID ;
	public final void ruleIDENTIFIER() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIDENTIFIER");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:69:15: ( RULE_ID )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:70:2: RULE_ID
			{
			dbg.location(70,2);
			match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDENTIFIER184); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(71, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIDENTIFIER");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIDENTIFIER"



	// $ANTLR start "ruleIMAGINARY_LIT"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:74:1: ruleIMAGINARY_LIT : ( RULE_DECIMALS | RULE_FLOAT_LIT ) '\\u00EF' ;
	public final void ruleIMAGINARY_LIT() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIMAGINARY_LIT");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:74:18: ( ( RULE_DECIMALS | RULE_FLOAT_LIT ) '\\u00EF' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:75:2: ( RULE_DECIMALS | RULE_FLOAT_LIT ) '\\u00EF'
			{
			dbg.location(75,2);
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
			}dbg.location(80,2);
			match(input,54,FOLLOW_54_in_ruleIMAGINARY_LIT216); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(81, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIMAGINARY_LIT");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIMAGINARY_LIT"



	// $ANTLR start "ruleRUNE_LIT"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:84:1: ruleRUNE_LIT : '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\'' ;
	public final void ruleRUNE_LIT() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleRUNE_LIT");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(84, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:84:13: ( '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\'' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:85:2: '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\''
			{
			dbg.location(85,2);
			match(input,53,FOLLOW_53_in_ruleRUNE_LIT226); if (state.failed) return;dbg.location(86,2);
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
			}dbg.location(91,2);
			match(input,53,FOLLOW_53_in_ruleRUNE_LIT251); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(92, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleRUNE_LIT");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleRUNE_LIT"



	// $ANTLR start "ruleSTRING_LIT"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:95:1: ruleSTRING_LIT : ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT ) ;
	public final void ruleSTRING_LIT() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSTRING_LIT");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(95, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:95:15: ( ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:
			{
			dbg.location(95,15);
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
		dbg.location(101, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSTRING_LIT");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSTRING_LIT"



	// $ANTLR start "ruleType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:104:1: ruleType : ( ruleTypeName | ruleTypeLit | '(' ruleType ')' ) ;
	public final void ruleType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(104, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:104:9: ( ( ruleTypeName | ruleTypeLit | '(' ruleType ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:105:2: ( ruleTypeName | ruleTypeLit | '(' ruleType ')' )
			{
			dbg.location(105,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:105:2: ( ruleTypeName | ruleTypeLit | '(' ruleType ')' )
			int alt7=3;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			switch ( input.LA(1) ) {
			case RULE_ID:
				{
				alt7=1;
				}
				break;
			case RULE_MUL:
			case 51:
			case 52:
			case 58:
			case 66:
			case 70:
			case 71:
			case 76:
				{
				alt7=2;
				}
				break;
			case 41:
				{
				alt7=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:106:3: ruleTypeName
					{
					dbg.location(106,3);
					pushFollow(FOLLOW_ruleTypeName_in_ruleType294);
					ruleTypeName();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:108:3: ruleTypeLit
					{
					dbg.location(108,3);
					pushFollow(FOLLOW_ruleTypeLit_in_ruleType306);
					ruleTypeLit();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:110:3: '(' ruleType ')'
					{
					dbg.location(110,3);
					match(input,41,FOLLOW_41_in_ruleType318); if (state.failed) return;dbg.location(111,3);
					pushFollow(FOLLOW_ruleType_in_ruleType322);
					ruleType();
					state._fsp--;
					if (state.failed) return;dbg.location(112,3);
					match(input,42,FOLLOW_42_in_ruleType326); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(7);}

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
			dbg.exitRule(getGrammarFileName(), "ruleType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleType"



	// $ANTLR start "ruleTypeName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:117:1: ruleTypeName : ( ruleIDENTIFIER | ruleQualifiedIdent ) ;
	public final void ruleTypeName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(117, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:117:13: ( ( ruleIDENTIFIER | ruleQualifiedIdent ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:118:2: ( ruleIDENTIFIER | ruleQualifiedIdent )
			{
			dbg.location(118,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:118:2: ( ruleIDENTIFIER | ruleQualifiedIdent )
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==RULE_ID) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==EOF||LA8_1==RULE_DECIMALS||LA8_1==RULE_EQUALS||LA8_1==RULE_FLOAT_LIT||LA8_1==RULE_ID||(LA8_1 >= RULE_INTERPRETED_STRING_LIT && LA8_1 <= RULE_INT_LIT)||LA8_1==RULE_MUL||LA8_1==RULE_RAW_STRING_LIT||(LA8_1 >= RULE_STRING && LA8_1 <= RULE_UNARY_OP)||(LA8_1 >= 41 && LA8_1 <= 42)||LA8_1==44||(LA8_1 >= 47 && LA8_1 <= 48)||(LA8_1 >= 50 && LA8_1 <= 53)||(LA8_1 >= 55 && LA8_1 <= 62)||(LA8_1 >= 64 && LA8_1 <= 68)||(LA8_1 >= 70 && LA8_1 <= 71)||(LA8_1 >= 74 && LA8_1 <= 81)) ) {
					alt8=1;
				}
				else if ( (LA8_1==46) ) {
					int LA8_3 = input.LA(3);
					if ( (LA8_3==RULE_ID) ) {
						int LA8_4 = input.LA(4);
						if ( (synpred13_DebugInternalGo()) ) {
							alt8=1;
						}
						else if ( (true) ) {
							alt8=2;
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 3, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
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
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:119:3: ruleIDENTIFIER
					{
					dbg.location(119,3);
					pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleTypeName343);
					ruleIDENTIFIER();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:121:3: ruleQualifiedIdent
					{
					dbg.location(121,3);
					pushFollow(FOLLOW_ruleQualifiedIdent_in_ruleTypeName355);
					ruleQualifiedIdent();
					state._fsp--;
					if (state.failed) return;
					}
					break;

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
		dbg.location(123, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeName"



	// $ANTLR start "ruleQualifiedIdent"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:126:1: ruleQualifiedIdent : rulePackageName '.' ruleIDENTIFIER ;
	public final void ruleQualifiedIdent() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleQualifiedIdent");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(126, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:126:19: ( rulePackageName '.' ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:127:2: rulePackageName '.' ruleIDENTIFIER
			{
			dbg.location(127,2);
			pushFollow(FOLLOW_rulePackageName_in_ruleQualifiedIdent368);
			rulePackageName();
			state._fsp--;
			if (state.failed) return;dbg.location(128,2);
			match(input,46,FOLLOW_46_in_ruleQualifiedIdent371); if (state.failed) return;dbg.location(129,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleQualifiedIdent374);
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
		dbg.location(130, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleQualifiedIdent");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleQualifiedIdent"



	// $ANTLR start "rulePackageName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:133:1: rulePackageName : ruleIDENTIFIER ;
	public final void rulePackageName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulePackageName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(133, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:133:16: ( ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:134:2: ruleIDENTIFIER
			{
			dbg.location(134,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_rulePackageName384);
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
		dbg.location(135, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulePackageName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulePackageName"



	// $ANTLR start "ruleTypeLit"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:138:1: ruleTypeLit : ( ruleArrayType | ruleStructType | ruleFunctionType | ruleInterfaceType | ruleSliceType | ruleMapType | ruleChannelType | rulePointerType ) ;
	public final void ruleTypeLit() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeLit");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(138, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:138:12: ( ( ruleArrayType | ruleStructType | ruleFunctionType | ruleInterfaceType | ruleSliceType | ruleMapType | ruleChannelType | rulePointerType ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:139:2: ( ruleArrayType | ruleStructType | ruleFunctionType | ruleInterfaceType | ruleSliceType | ruleMapType | ruleChannelType | rulePointerType )
			{
			dbg.location(139,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:139:2: ( ruleArrayType | ruleStructType | ruleFunctionType | ruleInterfaceType | ruleSliceType | ruleMapType | ruleChannelType | rulePointerType )
			int alt9=8;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			switch ( input.LA(1) ) {
			case 52:
				{
				int LA9_1 = input.LA(2);
				if ( (LA9_1==55) ) {
					alt9=5;
				}
				else if ( (LA9_1==RULE_DECIMALS||LA9_1==RULE_FLOAT_LIT||LA9_1==RULE_ID||LA9_1==RULE_INT_LIT||LA9_1==RULE_MUL||(LA9_1 >= RULE_STRING && LA9_1 <= RULE_UNARY_OP)||LA9_1==41||(LA9_1 >= 51 && LA9_1 <= 53)||LA9_1==58||LA9_1==66||(LA9_1 >= 70 && LA9_1 <= 71)||LA9_1==76) ) {
					alt9=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
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
				alt9=2;
				}
				break;
			case 66:
				{
				alt9=3;
				}
				break;
			case 70:
				{
				alt9=4;
				}
				break;
			case 71:
				{
				alt9=6;
				}
				break;
			case 51:
			case 58:
				{
				alt9=7;
				}
				break;
			case RULE_MUL:
				{
				alt9=8;
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:140:3: ruleArrayType
					{
					dbg.location(140,3);
					pushFollow(FOLLOW_ruleArrayType_in_ruleTypeLit398);
					ruleArrayType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:142:3: ruleStructType
					{
					dbg.location(142,3);
					pushFollow(FOLLOW_ruleStructType_in_ruleTypeLit410);
					ruleStructType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:144:3: ruleFunctionType
					{
					dbg.location(144,3);
					pushFollow(FOLLOW_ruleFunctionType_in_ruleTypeLit422);
					ruleFunctionType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:146:3: ruleInterfaceType
					{
					dbg.location(146,3);
					pushFollow(FOLLOW_ruleInterfaceType_in_ruleTypeLit434);
					ruleInterfaceType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:148:3: ruleSliceType
					{
					dbg.location(148,3);
					pushFollow(FOLLOW_ruleSliceType_in_ruleTypeLit446);
					ruleSliceType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:150:3: ruleMapType
					{
					dbg.location(150,3);
					pushFollow(FOLLOW_ruleMapType_in_ruleTypeLit458);
					ruleMapType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:152:3: ruleChannelType
					{
					dbg.location(152,3);
					pushFollow(FOLLOW_ruleChannelType_in_ruleTypeLit470);
					ruleChannelType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:154:3: rulePointerType
					{
					dbg.location(154,3);
					pushFollow(FOLLOW_rulePointerType_in_ruleTypeLit482);
					rulePointerType();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(156, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeLit");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeLit"



	// $ANTLR start "ruleArrayType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:159:1: ruleArrayType : '[' ruleArrayLength ']' ruleElementType ;
	public final void ruleArrayType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleArrayType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(159, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:159:14: ( '[' ruleArrayLength ']' ruleElementType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:160:2: '[' ruleArrayLength ']' ruleElementType
			{
			dbg.location(160,2);
			match(input,52,FOLLOW_52_in_ruleArrayType495); if (state.failed) return;dbg.location(161,2);
			pushFollow(FOLLOW_ruleArrayLength_in_ruleArrayType498);
			ruleArrayLength();
			state._fsp--;
			if (state.failed) return;dbg.location(162,2);
			match(input,55,FOLLOW_55_in_ruleArrayType501); if (state.failed) return;dbg.location(163,2);
			pushFollow(FOLLOW_ruleElementType_in_ruleArrayType504);
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
		dbg.location(164, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleArrayType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleArrayType"



	// $ANTLR start "ruleArrayLength"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:167:1: ruleArrayLength : ruleExpression ;
	public final void ruleArrayLength() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleArrayLength");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(167, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:167:16: ( ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:168:2: ruleExpression
			{
			dbg.location(168,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleArrayLength514);
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
		dbg.location(169, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleArrayLength");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleArrayLength"



	// $ANTLR start "ruleElementType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:172:1: ruleElementType : ruleType ;
	public final void ruleElementType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleElementType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(172, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:172:16: ( ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:173:2: ruleType
			{
			dbg.location(173,2);
			pushFollow(FOLLOW_ruleType_in_ruleElementType524);
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
		dbg.location(174, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleElementType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleElementType"



	// $ANTLR start "ruleSliceType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:177:1: ruleSliceType : '[' ']' ruleElementType ;
	public final void ruleSliceType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSliceType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(177, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:177:14: ( '[' ']' ruleElementType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:178:2: '[' ']' ruleElementType
			{
			dbg.location(178,2);
			match(input,52,FOLLOW_52_in_ruleSliceType534); if (state.failed) return;dbg.location(179,2);
			match(input,55,FOLLOW_55_in_ruleSliceType537); if (state.failed) return;dbg.location(180,2);
			pushFollow(FOLLOW_ruleElementType_in_ruleSliceType540);
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
		dbg.location(181, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSliceType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSliceType"



	// $ANTLR start "ruleStructType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:184:1: ruleStructType : 'struct' '{' ( ruleFieldDecl ( ';' )? )* '}' ;
	public final void ruleStructType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleStructType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(184, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:184:15: ( 'struct' '{' ( ruleFieldDecl ( ';' )? )* '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:185:2: 'struct' '{' ( ruleFieldDecl ( ';' )? )* '}'
			{
			dbg.location(185,2);
			match(input,76,FOLLOW_76_in_ruleStructType550); if (state.failed) return;dbg.location(186,2);
			match(input,80,FOLLOW_80_in_ruleStructType553); if (state.failed) return;dbg.location(187,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:187:2: ( ruleFieldDecl ( ';' )? )*
			try { dbg.enterSubRule(11);

			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==RULE_ID||LA11_0==RULE_MUL) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:188:3: ruleFieldDecl ( ';' )?
					{
					dbg.location(188,3);
					pushFollow(FOLLOW_ruleFieldDecl_in_ruleStructType560);
					ruleFieldDecl();
					state._fsp--;
					if (state.failed) return;dbg.location(189,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:189:3: ( ';' )?
					int alt10=2;
					try { dbg.enterSubRule(10);
					try { dbg.enterDecision(10, decisionCanBacktrack[10]);

					int LA10_0 = input.LA(1);
					if ( (LA10_0==50) ) {
						alt10=1;
					}
					} finally {dbg.exitDecision(10);}

					switch (alt10) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:189:3: ';'
							{
							dbg.location(189,3);
							match(input,50,FOLLOW_50_in_ruleStructType564); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(10);}

					}
					break;

				default :
					break loop11;
				}
			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(191,2);
			match(input,81,FOLLOW_81_in_ruleStructType572); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(192, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleStructType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleStructType"



	// $ANTLR start "ruleFieldDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:195:1: ruleFieldDecl : ( ruleIdentifierList ruleType | ruleEmbeddedField ) ( ruleTag )? ;
	public final void ruleFieldDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFieldDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(195, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:195:14: ( ( ruleIdentifierList ruleType | ruleEmbeddedField ) ( ruleTag )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:196:2: ( ruleIdentifierList ruleType | ruleEmbeddedField ) ( ruleTag )?
			{
			dbg.location(196,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:196:2: ( ruleIdentifierList ruleType | ruleEmbeddedField )
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==RULE_ID) ) {
				switch ( input.LA(2) ) {
				case 41:
				case 44:
				case 51:
				case 52:
				case 58:
				case 66:
				case 70:
				case 71:
				case 76:
					{
					alt12=1;
					}
					break;
				case RULE_ID:
					{
					int LA12_4 = input.LA(3);
					if ( (synpred23_DebugInternalGo()) ) {
						alt12=1;
					}
					else if ( (true) ) {
						alt12=2;
					}

					}
					break;
				case RULE_MUL:
					{
					int LA12_5 = input.LA(3);
					if ( (LA12_5==RULE_ID) ) {
						int LA12_6 = input.LA(4);
						if ( (synpred23_DebugInternalGo()) ) {
							alt12=1;
						}
						else if ( (true) ) {
							alt12=2;
						}

					}
					else if ( (LA12_5==RULE_MUL||LA12_5==41||(LA12_5 >= 51 && LA12_5 <= 52)||LA12_5==58||LA12_5==66||(LA12_5 >= 70 && LA12_5 <= 71)||LA12_5==76) ) {
						alt12=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 5, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case EOF:
				case RULE_INTERPRETED_STRING_LIT:
				case RULE_RAW_STRING_LIT:
				case 46:
				case 50:
				case 81:
					{
					alt12=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA12_0==RULE_MUL) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:197:3: ruleIdentifierList ruleType
					{
					dbg.location(197,3);
					pushFollow(FOLLOW_ruleIdentifierList_in_ruleFieldDecl586);
					ruleIdentifierList();
					state._fsp--;
					if (state.failed) return;dbg.location(198,3);
					pushFollow(FOLLOW_ruleType_in_ruleFieldDecl590);
					ruleType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:200:3: ruleEmbeddedField
					{
					dbg.location(200,3);
					pushFollow(FOLLOW_ruleEmbeddedField_in_ruleFieldDecl602);
					ruleEmbeddedField();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(12);}
			dbg.location(202,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:202:2: ( ruleTag )?
			int alt13=2;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( (LA13_0==RULE_INTERPRETED_STRING_LIT||LA13_0==RULE_RAW_STRING_LIT) ) {
				alt13=1;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:202:2: ruleTag
					{
					dbg.location(202,2);
					pushFollow(FOLLOW_ruleTag_in_ruleFieldDecl608);
					ruleTag();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(13);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(204, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFieldDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFieldDecl"



	// $ANTLR start "ruleIdentifierList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:207:1: ruleIdentifierList : ruleIDENTIFIER ( ',' ruleIDENTIFIER )* ;
	public final void ruleIdentifierList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIdentifierList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(207, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:207:19: ( ruleIDENTIFIER ( ',' ruleIDENTIFIER )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:208:2: ruleIDENTIFIER ( ',' ruleIDENTIFIER )*
			{
			dbg.location(208,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleIdentifierList621);
			ruleIDENTIFIER();
			state._fsp--;
			if (state.failed) return;dbg.location(209,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:209:2: ( ',' ruleIDENTIFIER )*
			try { dbg.enterSubRule(14);

			loop14:
			while (true) {
				int alt14=2;
				try { dbg.enterDecision(14, decisionCanBacktrack[14]);

				int LA14_0 = input.LA(1);
				if ( (LA14_0==44) ) {
					int LA14_2 = input.LA(2);
					if ( (LA14_2==RULE_ID) ) {
						int LA14_3 = input.LA(3);
						if ( (synpred25_DebugInternalGo()) ) {
							alt14=1;
						}

					}

				}

				} finally {dbg.exitDecision(14);}

				switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:210:3: ',' ruleIDENTIFIER
					{
					dbg.location(210,3);
					match(input,44,FOLLOW_44_in_ruleIdentifierList628); if (state.failed) return;dbg.location(211,3);
					pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleIdentifierList632);
					ruleIDENTIFIER();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop14;
				}
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
		dbg.location(213, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIdentifierList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIdentifierList"



	// $ANTLR start "ruleEmbeddedField"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:216:1: ruleEmbeddedField : ( '*' )? ruleTypeName ;
	public final void ruleEmbeddedField() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleEmbeddedField");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(216, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:216:18: ( ( '*' )? ruleTypeName )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:217:2: ( '*' )? ruleTypeName
			{
			dbg.location(217,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:217:2: ( '*' )?
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==RULE_MUL) ) {
				alt15=1;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:217:2: '*'
					{
					dbg.location(217,2);
					match(input,RULE_MUL,FOLLOW_RULE_MUL_in_ruleEmbeddedField646); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(15);}
			dbg.location(218,2);
			pushFollow(FOLLOW_ruleTypeName_in_ruleEmbeddedField650);
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
		dbg.location(219, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleEmbeddedField");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleEmbeddedField"



	// $ANTLR start "ruleTag"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:222:1: ruleTag : ruleSTRING_LIT ;
	public final void ruleTag() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTag");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(222, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:222:8: ( ruleSTRING_LIT )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:223:2: ruleSTRING_LIT
			{
			dbg.location(223,2);
			pushFollow(FOLLOW_ruleSTRING_LIT_in_ruleTag660);
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
		dbg.location(224, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTag");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTag"



	// $ANTLR start "rulePointerType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:227:1: rulePointerType : '*' ruleBaseType ;
	public final void rulePointerType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulePointerType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(227, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:227:16: ( '*' ruleBaseType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:228:2: '*' ruleBaseType
			{
			dbg.location(228,2);
			match(input,RULE_MUL,FOLLOW_RULE_MUL_in_rulePointerType670); if (state.failed) return;dbg.location(229,2);
			pushFollow(FOLLOW_ruleBaseType_in_rulePointerType673);
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
		dbg.location(230, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulePointerType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulePointerType"



	// $ANTLR start "ruleBaseType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:233:1: ruleBaseType : ruleType ;
	public final void ruleBaseType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleBaseType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(233, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:233:13: ( ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:234:2: ruleType
			{
			dbg.location(234,2);
			pushFollow(FOLLOW_ruleType_in_ruleBaseType683);
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
		dbg.location(235, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleBaseType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleBaseType"



	// $ANTLR start "ruleFunctionType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:238:1: ruleFunctionType : 'func' ruleSignature ;
	public final void ruleFunctionType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFunctionType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(238, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:238:17: ( 'func' ruleSignature )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:239:2: 'func' ruleSignature
			{
			dbg.location(239,2);
			match(input,66,FOLLOW_66_in_ruleFunctionType693); if (state.failed) return;dbg.location(240,2);
			pushFollow(FOLLOW_ruleSignature_in_ruleFunctionType696);
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
		dbg.location(241, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFunctionType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFunctionType"



	// $ANTLR start "ruleSignature"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:244:1: ruleSignature : ruleParameters ( ruleResult )? ;
	public final void ruleSignature() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSignature");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(244, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:244:14: ( ruleParameters ( ruleResult )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:245:2: ruleParameters ( ruleResult )?
			{
			dbg.location(245,2);
			pushFollow(FOLLOW_ruleParameters_in_ruleSignature706);
			ruleParameters();
			state._fsp--;
			if (state.failed) return;dbg.location(246,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:246:2: ( ruleResult )?
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			switch ( input.LA(1) ) {
				case 41:
					{
					int LA16_1 = input.LA(2);
					if ( (synpred27_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case RULE_ID:
					{
					int LA16_2 = input.LA(2);
					if ( (synpred27_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case 52:
					{
					int LA16_3 = input.LA(2);
					if ( (synpred27_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case 76:
					{
					int LA16_4 = input.LA(2);
					if ( (synpred27_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case 66:
					{
					int LA16_5 = input.LA(2);
					if ( (synpred27_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case 70:
					{
					int LA16_6 = input.LA(2);
					if ( (synpred27_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case 71:
					{
					int LA16_7 = input.LA(2);
					if ( (synpred27_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case 58:
					{
					int LA16_8 = input.LA(2);
					if ( (synpred27_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case 51:
					{
					int LA16_9 = input.LA(2);
					if ( (synpred27_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case RULE_MUL:
					{
					int LA16_10 = input.LA(2);
					if ( (synpred27_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:246:2: ruleResult
					{
					dbg.location(246,2);
					pushFollow(FOLLOW_ruleResult_in_ruleSignature709);
					ruleResult();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(16);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(248, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSignature");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSignature"



	// $ANTLR start "ruleResult"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:251:1: ruleResult : ( ruleParameters | ruleType ) ;
	public final void ruleResult() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleResult");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(251, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:251:11: ( ( ruleParameters | ruleType ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:252:2: ( ruleParameters | ruleType )
			{
			dbg.location(252,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:252:2: ( ruleParameters | ruleType )
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==41) ) {
				int LA17_1 = input.LA(2);
				if ( (synpred28_DebugInternalGo()) ) {
					alt17=1;
				}
				else if ( (true) ) {
					alt17=2;
				}

			}
			else if ( (LA17_0==RULE_ID||LA17_0==RULE_MUL||(LA17_0 >= 51 && LA17_0 <= 52)||LA17_0==58||LA17_0==66||(LA17_0 >= 70 && LA17_0 <= 71)||LA17_0==76) ) {
				alt17=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:253:3: ruleParameters
					{
					dbg.location(253,3);
					pushFollow(FOLLOW_ruleParameters_in_ruleResult726);
					ruleParameters();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:255:3: ruleType
					{
					dbg.location(255,3);
					pushFollow(FOLLOW_ruleType_in_ruleResult738);
					ruleType();
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
		dbg.location(257, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleResult");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleResult"



	// $ANTLR start "ruleParameters"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:260:1: ruleParameters : '(' ( ruleParameterList )? ')' ;
	public final void ruleParameters() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleParameters");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(260, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:260:15: ( '(' ( ruleParameterList )? ')' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:261:2: '(' ( ruleParameterList )? ')'
			{
			dbg.location(261,2);
			match(input,41,FOLLOW_41_in_ruleParameters751); if (state.failed) return;dbg.location(262,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:262:2: ( ruleParameterList )?
			int alt18=2;
			try { dbg.enterSubRule(18);
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==RULE_ID||LA18_0==RULE_MUL||LA18_0==41||LA18_0==44||LA18_0==47||(LA18_0 >= 51 && LA18_0 <= 52)||LA18_0==58||LA18_0==66||(LA18_0 >= 70 && LA18_0 <= 71)||LA18_0==76) ) {
				alt18=1;
			}
			else if ( (LA18_0==42) ) {
				int LA18_2 = input.LA(2);
				if ( (synpred29_DebugInternalGo()) ) {
					alt18=1;
				}
			}
			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:262:2: ruleParameterList
					{
					dbg.location(262,2);
					pushFollow(FOLLOW_ruleParameterList_in_ruleParameters754);
					ruleParameterList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(18);}
			dbg.location(264,2);
			match(input,42,FOLLOW_42_in_ruleParameters760); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(265, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleParameters");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleParameters"



	// $ANTLR start "ruleParameterList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:268:1: ruleParameterList : ruleParameterDecl ( ',' ruleParameterDecl )* ;
	public final void ruleParameterList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleParameterList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(268, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:268:18: ( ruleParameterDecl ( ',' ruleParameterDecl )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:269:2: ruleParameterDecl ( ',' ruleParameterDecl )*
			{
			dbg.location(269,2);
			pushFollow(FOLLOW_ruleParameterDecl_in_ruleParameterList770);
			ruleParameterDecl();
			state._fsp--;
			if (state.failed) return;dbg.location(270,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:270:2: ( ',' ruleParameterDecl )*
			try { dbg.enterSubRule(19);

			loop19:
			while (true) {
				int alt19=2;
				try { dbg.enterDecision(19, decisionCanBacktrack[19]);

				int LA19_0 = input.LA(1);
				if ( (LA19_0==44) ) {
					alt19=1;
				}

				} finally {dbg.exitDecision(19);}

				switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:271:3: ',' ruleParameterDecl
					{
					dbg.location(271,3);
					match(input,44,FOLLOW_44_in_ruleParameterList777); if (state.failed) return;dbg.location(272,3);
					pushFollow(FOLLOW_ruleParameterDecl_in_ruleParameterList781);
					ruleParameterDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop19;
				}
			}
			} finally {dbg.exitSubRule(19);}

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
			dbg.exitRule(getGrammarFileName(), "ruleParameterList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleParameterList"



	// $ANTLR start "ruleParameterDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:277:1: ruleParameterDecl : ( ruleIdentifierList )? ( '...' )? ( ruleType )? ;
	public final void ruleParameterDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleParameterDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(277, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:277:18: ( ( ruleIdentifierList )? ( '...' )? ( ruleType )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:278:2: ( ruleIdentifierList )? ( '...' )? ( ruleType )?
			{
			dbg.location(278,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:278:2: ( ruleIdentifierList )?
			int alt20=2;
			try { dbg.enterSubRule(20);
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			int LA20_0 = input.LA(1);
			if ( (LA20_0==RULE_ID) ) {
				int LA20_1 = input.LA(2);
				if ( (synpred31_DebugInternalGo()) ) {
					alt20=1;
				}
			}
			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:278:2: ruleIdentifierList
					{
					dbg.location(278,2);
					pushFollow(FOLLOW_ruleIdentifierList_in_ruleParameterDecl795);
					ruleIdentifierList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(20);}
			dbg.location(280,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:280:2: ( '...' )?
			int alt21=2;
			try { dbg.enterSubRule(21);
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			int LA21_0 = input.LA(1);
			if ( (LA21_0==47) ) {
				alt21=1;
			}
			} finally {dbg.exitDecision(21);}

			switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:280:2: '...'
					{
					dbg.location(280,2);
					match(input,47,FOLLOW_47_in_ruleParameterDecl801); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(21);}
			dbg.location(281,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:281:2: ( ruleType )?
			int alt22=2;
			try { dbg.enterSubRule(22);
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==RULE_ID||LA22_0==RULE_MUL||LA22_0==41||(LA22_0 >= 51 && LA22_0 <= 52)||LA22_0==58||LA22_0==66||(LA22_0 >= 70 && LA22_0 <= 71)||LA22_0==76) ) {
				alt22=1;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:281:2: ruleType
					{
					dbg.location(281,2);
					pushFollow(FOLLOW_ruleType_in_ruleParameterDecl805);
					ruleType();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(22);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(283, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleParameterDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleParameterDecl"



	// $ANTLR start "ruleInterfaceType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:286:1: ruleInterfaceType : 'interface' '{' ( ruleMethodSpec ';' )* '}' ;
	public final void ruleInterfaceType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleInterfaceType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(286, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:286:18: ( 'interface' '{' ( ruleMethodSpec ';' )* '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:287:2: 'interface' '{' ( ruleMethodSpec ';' )* '}'
			{
			dbg.location(287,2);
			match(input,70,FOLLOW_70_in_ruleInterfaceType818); if (state.failed) return;dbg.location(288,2);
			match(input,80,FOLLOW_80_in_ruleInterfaceType821); if (state.failed) return;dbg.location(289,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:289:2: ( ruleMethodSpec ';' )*
			try { dbg.enterSubRule(23);

			loop23:
			while (true) {
				int alt23=2;
				try { dbg.enterDecision(23, decisionCanBacktrack[23]);

				int LA23_0 = input.LA(1);
				if ( (LA23_0==RULE_ID) ) {
					alt23=1;
				}

				} finally {dbg.exitDecision(23);}

				switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:290:3: ruleMethodSpec ';'
					{
					dbg.location(290,3);
					pushFollow(FOLLOW_ruleMethodSpec_in_ruleInterfaceType828);
					ruleMethodSpec();
					state._fsp--;
					if (state.failed) return;dbg.location(291,3);
					match(input,50,FOLLOW_50_in_ruleInterfaceType832); if (state.failed) return;
					}
					break;

				default :
					break loop23;
				}
			}
			} finally {dbg.exitSubRule(23);}
			dbg.location(293,2);
			match(input,81,FOLLOW_81_in_ruleInterfaceType839); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(294, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleInterfaceType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleInterfaceType"



	// $ANTLR start "ruleMethodSpec"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:297:1: ruleMethodSpec : ( ruleMethodName ruleSignature | ruleInterfaceTypeName ) ;
	public final void ruleMethodSpec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleMethodSpec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(297, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:297:15: ( ( ruleMethodName ruleSignature | ruleInterfaceTypeName ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:298:2: ( ruleMethodName ruleSignature | ruleInterfaceTypeName )
			{
			dbg.location(298,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:298:2: ( ruleMethodName ruleSignature | ruleInterfaceTypeName )
			int alt24=2;
			try { dbg.enterSubRule(24);
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			int LA24_0 = input.LA(1);
			if ( (LA24_0==RULE_ID) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==41) ) {
					alt24=1;
				}
				else if ( (LA24_1==46||LA24_1==50) ) {
					alt24=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 1, input);
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
					new NoViableAltException("", 24, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:299:3: ruleMethodName ruleSignature
					{
					dbg.location(299,3);
					pushFollow(FOLLOW_ruleMethodName_in_ruleMethodSpec853);
					ruleMethodName();
					state._fsp--;
					if (state.failed) return;dbg.location(300,3);
					pushFollow(FOLLOW_ruleSignature_in_ruleMethodSpec857);
					ruleSignature();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:302:3: ruleInterfaceTypeName
					{
					dbg.location(302,3);
					pushFollow(FOLLOW_ruleInterfaceTypeName_in_ruleMethodSpec869);
					ruleInterfaceTypeName();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(24);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(304, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleMethodSpec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleMethodSpec"



	// $ANTLR start "ruleMethodName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:307:1: ruleMethodName : ruleIDENTIFIER ;
	public final void ruleMethodName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleMethodName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(307, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:307:15: ( ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:308:2: ruleIDENTIFIER
			{
			dbg.location(308,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleMethodName882);
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
		dbg.location(309, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleMethodName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleMethodName"



	// $ANTLR start "ruleInterfaceTypeName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:312:1: ruleInterfaceTypeName : ruleTypeName ;
	public final void ruleInterfaceTypeName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleInterfaceTypeName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(312, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:312:22: ( ruleTypeName )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:313:2: ruleTypeName
			{
			dbg.location(313,2);
			pushFollow(FOLLOW_ruleTypeName_in_ruleInterfaceTypeName892);
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
		dbg.location(314, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleInterfaceTypeName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleInterfaceTypeName"



	// $ANTLR start "ruleMapType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:317:1: ruleMapType : 'map' '[' ruleKeyType ']' ruleElementType ;
	public final void ruleMapType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleMapType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(317, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:317:12: ( 'map' '[' ruleKeyType ']' ruleElementType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:318:2: 'map' '[' ruleKeyType ']' ruleElementType
			{
			dbg.location(318,2);
			match(input,71,FOLLOW_71_in_ruleMapType902); if (state.failed) return;dbg.location(319,2);
			match(input,52,FOLLOW_52_in_ruleMapType905); if (state.failed) return;dbg.location(320,2);
			pushFollow(FOLLOW_ruleKeyType_in_ruleMapType908);
			ruleKeyType();
			state._fsp--;
			if (state.failed) return;dbg.location(321,2);
			match(input,55,FOLLOW_55_in_ruleMapType911); if (state.failed) return;dbg.location(322,2);
			pushFollow(FOLLOW_ruleElementType_in_ruleMapType914);
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
		dbg.location(323, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleMapType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleMapType"



	// $ANTLR start "ruleKeyType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:326:1: ruleKeyType : ruleType ;
	public final void ruleKeyType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleKeyType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(326, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:326:12: ( ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:327:2: ruleType
			{
			dbg.location(327,2);
			pushFollow(FOLLOW_ruleType_in_ruleKeyType924);
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
		dbg.location(328, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleKeyType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleKeyType"



	// $ANTLR start "ruleChannelType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:331:1: ruleChannelType : ( 'chan' ( '<-' )? | '<-' 'chan' ) ruleElementType ;
	public final void ruleChannelType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleChannelType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(331, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:331:16: ( ( 'chan' ( '<-' )? | '<-' 'chan' ) ruleElementType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:332:2: ( 'chan' ( '<-' )? | '<-' 'chan' ) ruleElementType
			{
			dbg.location(332,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:332:2: ( 'chan' ( '<-' )? | '<-' 'chan' )
			int alt26=2;
			try { dbg.enterSubRule(26);
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			int LA26_0 = input.LA(1);
			if ( (LA26_0==58) ) {
				alt26=1;
			}
			else if ( (LA26_0==51) ) {
				alt26=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:333:3: 'chan' ( '<-' )?
					{
					dbg.location(333,3);
					match(input,58,FOLLOW_58_in_ruleChannelType938); if (state.failed) return;dbg.location(334,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:334:3: ( '<-' )?
					int alt25=2;
					try { dbg.enterSubRule(25);
					try { dbg.enterDecision(25, decisionCanBacktrack[25]);

					int LA25_0 = input.LA(1);
					if ( (LA25_0==51) ) {
						int LA25_1 = input.LA(2);
						if ( (synpred36_DebugInternalGo()) ) {
							alt25=1;
						}
					}
					} finally {dbg.exitDecision(25);}

					switch (alt25) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:334:3: '<-'
							{
							dbg.location(334,3);
							match(input,51,FOLLOW_51_in_ruleChannelType942); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(25);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:336:3: '<-' 'chan'
					{
					dbg.location(336,3);
					match(input,51,FOLLOW_51_in_ruleChannelType955); if (state.failed) return;dbg.location(337,3);
					match(input,58,FOLLOW_58_in_ruleChannelType959); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(26);}
			dbg.location(339,2);
			pushFollow(FOLLOW_ruleElementType_in_ruleChannelType965);
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
		dbg.location(340, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleChannelType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleChannelType"



	// $ANTLR start "ruleBlock"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:343:1: ruleBlock : '{' ruleStatementList '}' ;
	public final void ruleBlock() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(343, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:343:10: ( '{' ruleStatementList '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:344:2: '{' ruleStatementList '}'
			{
			dbg.location(344,2);
			match(input,80,FOLLOW_80_in_ruleBlock975); if (state.failed) return;dbg.location(345,2);
			pushFollow(FOLLOW_ruleStatementList_in_ruleBlock978);
			ruleStatementList();
			state._fsp--;
			if (state.failed) return;dbg.location(346,2);
			match(input,81,FOLLOW_81_in_ruleBlock981); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "ruleBlock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleBlock"



	// $ANTLR start "ruleStatementList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:350:1: ruleStatementList : ( ruleStatement ( ';' )? )* ;
	public final void ruleStatementList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleStatementList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(350, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:350:18: ( ( ruleStatement ( ';' )? )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:351:2: ( ruleStatement ( ';' )? )*
			{
			dbg.location(351,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:351:2: ( ruleStatement ( ';' )? )*
			try { dbg.enterSubRule(28);

			loop28:
			while (true) {
				int alt28=2;
				try { dbg.enterDecision(28, decisionCanBacktrack[28]);

				int LA28_0 = input.LA(1);
				if ( (LA28_0==RULE_DECIMALS||LA28_0==RULE_FLOAT_LIT||LA28_0==RULE_ID||LA28_0==RULE_INT_LIT||LA28_0==RULE_MUL||(LA28_0 >= RULE_STRING && LA28_0 <= RULE_UNARY_OP)||LA28_0==41||(LA28_0 >= 50 && LA28_0 <= 53)||LA28_0==56||(LA28_0 >= 58 && LA28_0 <= 60)||LA28_0==62||(LA28_0 >= 64 && LA28_0 <= 68)||(LA28_0 >= 70 && LA28_0 <= 71)||(LA28_0 >= 74 && LA28_0 <= 80)) ) {
					alt28=1;
				}

				} finally {dbg.exitDecision(28);}

				switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:352:3: ruleStatement ( ';' )?
					{
					dbg.location(352,3);
					pushFollow(FOLLOW_ruleStatement_in_ruleStatementList995);
					ruleStatement();
					state._fsp--;
					if (state.failed) return;dbg.location(353,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:353:3: ( ';' )?
					int alt27=2;
					try { dbg.enterSubRule(27);
					try { dbg.enterDecision(27, decisionCanBacktrack[27]);

					int LA27_0 = input.LA(1);
					if ( (LA27_0==50) ) {
						int LA27_1 = input.LA(2);
						if ( (synpred38_DebugInternalGo()) ) {
							alt27=1;
						}
					}
					} finally {dbg.exitDecision(27);}

					switch (alt27) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:353:3: ';'
							{
							dbg.location(353,3);
							match(input,50,FOLLOW_50_in_ruleStatementList999); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(27);}

					}
					break;

				default :
					break loop28;
				}
			}
			} finally {dbg.exitSubRule(28);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(355, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleStatementList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleStatementList"



	// $ANTLR start "ruleStatement"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:358:1: ruleStatement : ( ruleDeclaration | ruleLabeledStmt | ruleSimpleStmt | ruleGoStmt | ruleReturnStmt | ruleBreakStmt | ruleContinueStmt | ruleGotoStmt | ruleFallthroughStmt | ruleBlock | ruleIfStmt | ruleSwitchStmt | ruleSelectStmt | ruleForStmt | ruleDeferStmt ) ;
	public final void ruleStatement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleStatement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(358, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:358:14: ( ( ruleDeclaration | ruleLabeledStmt | ruleSimpleStmt | ruleGoStmt | ruleReturnStmt | ruleBreakStmt | ruleContinueStmt | ruleGotoStmt | ruleFallthroughStmt | ruleBlock | ruleIfStmt | ruleSwitchStmt | ruleSelectStmt | ruleForStmt | ruleDeferStmt ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:359:2: ( ruleDeclaration | ruleLabeledStmt | ruleSimpleStmt | ruleGoStmt | ruleReturnStmt | ruleBreakStmt | ruleContinueStmt | ruleGotoStmt | ruleFallthroughStmt | ruleBlock | ruleIfStmt | ruleSwitchStmt | ruleSelectStmt | ruleForStmt | ruleDeferStmt )
			{
			dbg.location(359,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:359:2: ( ruleDeclaration | ruleLabeledStmt | ruleSimpleStmt | ruleGoStmt | ruleReturnStmt | ruleBreakStmt | ruleContinueStmt | ruleGotoStmt | ruleFallthroughStmt | ruleBlock | ruleIfStmt | ruleSwitchStmt | ruleSelectStmt | ruleForStmt | ruleDeferStmt )
			int alt29=15;
			try { dbg.enterSubRule(29);
			try { dbg.enterDecision(29, decisionCanBacktrack[29]);

			switch ( input.LA(1) ) {
			case 59:
			case 78:
			case 79:
				{
				alt29=1;
				}
				break;
			case RULE_ID:
				{
				int LA29_2 = input.LA(2);
				if ( (LA29_2==48) ) {
					alt29=2;
				}
				else if ( (LA29_2==EOF||LA29_2==RULE_ASSING_OP||LA29_2==RULE_BINARY_OP||LA29_2==RULE_DECIMALS||LA29_2==RULE_FLOAT_LIT||LA29_2==RULE_ID||LA29_2==RULE_INT_LIT||LA29_2==RULE_MUL||(LA29_2 >= RULE_STRING && LA29_2 <= RULE_UNARY_OP)||LA29_2==41||(LA29_2 >= 43 && LA29_2 <= 46)||(LA29_2 >= 49 && LA29_2 <= 53)||(LA29_2 >= 56 && LA29_2 <= 62)||(LA29_2 >= 64 && LA29_2 <= 68)||(LA29_2 >= 70 && LA29_2 <= 71)||(LA29_2 >= 74 && LA29_2 <= 81)) ) {
					alt29=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 2, input);
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
			case RULE_MUL:
			case RULE_STRING:
			case RULE_UNARY_OP:
			case 41:
			case 50:
			case 51:
			case 52:
			case 53:
			case 58:
			case 66:
			case 70:
			case 71:
			case 76:
				{
				alt29=3;
				}
				break;
			case 67:
				{
				int LA29_4 = input.LA(2);
				if ( (LA29_4==RULE_ID) ) {
					int LA29_16 = input.LA(3);
					if ( (synpred43_DebugInternalGo()) ) {
						alt29=4;
					}
					else if ( (synpred47_DebugInternalGo()) ) {
						alt29=8;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 29, 16, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 4, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 74:
				{
				alt29=5;
				}
				break;
			case 56:
				{
				alt29=6;
				}
				break;
			case 60:
				{
				alt29=7;
				}
				break;
			case 64:
				{
				alt29=9;
				}
				break;
			case 80:
				{
				alt29=10;
				}
				break;
			case 68:
				{
				alt29=11;
				}
				break;
			case 77:
				{
				alt29=12;
				}
				break;
			case 75:
				{
				alt29=13;
				}
				break;
			case 65:
				{
				alt29=14;
				}
				break;
			case 62:
				{
				alt29=15;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(29);}

			switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:360:3: ruleDeclaration
					{
					dbg.location(360,3);
					pushFollow(FOLLOW_ruleDeclaration_in_ruleStatement1018);
					ruleDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:362:3: ruleLabeledStmt
					{
					dbg.location(362,3);
					pushFollow(FOLLOW_ruleLabeledStmt_in_ruleStatement1030);
					ruleLabeledStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:364:3: ruleSimpleStmt
					{
					dbg.location(364,3);
					pushFollow(FOLLOW_ruleSimpleStmt_in_ruleStatement1042);
					ruleSimpleStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:366:3: ruleGoStmt
					{
					dbg.location(366,3);
					pushFollow(FOLLOW_ruleGoStmt_in_ruleStatement1054);
					ruleGoStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:368:3: ruleReturnStmt
					{
					dbg.location(368,3);
					pushFollow(FOLLOW_ruleReturnStmt_in_ruleStatement1066);
					ruleReturnStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:370:3: ruleBreakStmt
					{
					dbg.location(370,3);
					pushFollow(FOLLOW_ruleBreakStmt_in_ruleStatement1078);
					ruleBreakStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:372:3: ruleContinueStmt
					{
					dbg.location(372,3);
					pushFollow(FOLLOW_ruleContinueStmt_in_ruleStatement1090);
					ruleContinueStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:374:3: ruleGotoStmt
					{
					dbg.location(374,3);
					pushFollow(FOLLOW_ruleGotoStmt_in_ruleStatement1102);
					ruleGotoStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:376:3: ruleFallthroughStmt
					{
					dbg.location(376,3);
					pushFollow(FOLLOW_ruleFallthroughStmt_in_ruleStatement1114);
					ruleFallthroughStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:378:3: ruleBlock
					{
					dbg.location(378,3);
					pushFollow(FOLLOW_ruleBlock_in_ruleStatement1126);
					ruleBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					dbg.enterAlt(11);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:380:3: ruleIfStmt
					{
					dbg.location(380,3);
					pushFollow(FOLLOW_ruleIfStmt_in_ruleStatement1138);
					ruleIfStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					dbg.enterAlt(12);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:382:3: ruleSwitchStmt
					{
					dbg.location(382,3);
					pushFollow(FOLLOW_ruleSwitchStmt_in_ruleStatement1150);
					ruleSwitchStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					dbg.enterAlt(13);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:384:3: ruleSelectStmt
					{
					dbg.location(384,3);
					pushFollow(FOLLOW_ruleSelectStmt_in_ruleStatement1162);
					ruleSelectStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 14 :
					dbg.enterAlt(14);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:386:3: ruleForStmt
					{
					dbg.location(386,3);
					pushFollow(FOLLOW_ruleForStmt_in_ruleStatement1174);
					ruleForStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 15 :
					dbg.enterAlt(15);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:388:3: ruleDeferStmt
					{
					dbg.location(388,3);
					pushFollow(FOLLOW_ruleDeferStmt_in_ruleStatement1186);
					ruleDeferStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

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
		dbg.location(390, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleStatement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleStatement"



	// $ANTLR start "ruleDeclaration"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:393:1: ruleDeclaration : ( ruleConstDecl | ruleTypeDecl | ruleVarDecl ) ;
	public final void ruleDeclaration() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleDeclaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(393, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:393:16: ( ( ruleConstDecl | ruleTypeDecl | ruleVarDecl ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:394:2: ( ruleConstDecl | ruleTypeDecl | ruleVarDecl )
			{
			dbg.location(394,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:394:2: ( ruleConstDecl | ruleTypeDecl | ruleVarDecl )
			int alt30=3;
			try { dbg.enterSubRule(30);
			try { dbg.enterDecision(30, decisionCanBacktrack[30]);

			switch ( input.LA(1) ) {
			case 59:
				{
				alt30=1;
				}
				break;
			case 78:
				{
				alt30=2;
				}
				break;
			case 79:
				{
				alt30=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(30);}

			switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:395:3: ruleConstDecl
					{
					dbg.location(395,3);
					pushFollow(FOLLOW_ruleConstDecl_in_ruleDeclaration1203);
					ruleConstDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:397:3: ruleTypeDecl
					{
					dbg.location(397,3);
					pushFollow(FOLLOW_ruleTypeDecl_in_ruleDeclaration1215);
					ruleTypeDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:399:3: ruleVarDecl
					{
					dbg.location(399,3);
					pushFollow(FOLLOW_ruleVarDecl_in_ruleDeclaration1227);
					ruleVarDecl();
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
		dbg.location(401, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleDeclaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleDeclaration"



	// $ANTLR start "ruleLabeledStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:404:1: ruleLabeledStmt : ruleLabel ':' ruleStatement ;
	public final void ruleLabeledStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleLabeledStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(404, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:404:16: ( ruleLabel ':' ruleStatement )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:405:2: ruleLabel ':' ruleStatement
			{
			dbg.location(405,2);
			pushFollow(FOLLOW_ruleLabel_in_ruleLabeledStmt1240);
			ruleLabel();
			state._fsp--;
			if (state.failed) return;dbg.location(406,2);
			match(input,48,FOLLOW_48_in_ruleLabeledStmt1243); if (state.failed) return;dbg.location(407,2);
			pushFollow(FOLLOW_ruleStatement_in_ruleLabeledStmt1246);
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
		dbg.location(408, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleLabeledStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleLabeledStmt"



	// $ANTLR start "ruleSimpleStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:411:1: ruleSimpleStmt : ( ruleIncDecStmt | ruleAssignment | ruleSendStmt | ruleShortVarDecl | ruleExpressionStmt | ruleEmptyStmt ) ;
	public final void ruleSimpleStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSimpleStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(411, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:411:15: ( ( ruleIncDecStmt | ruleAssignment | ruleSendStmt | ruleShortVarDecl | ruleExpressionStmt | ruleEmptyStmt ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:412:2: ( ruleIncDecStmt | ruleAssignment | ruleSendStmt | ruleShortVarDecl | ruleExpressionStmt | ruleEmptyStmt )
			{
			dbg.location(412,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:412:2: ( ruleIncDecStmt | ruleAssignment | ruleSendStmt | ruleShortVarDecl | ruleExpressionStmt | ruleEmptyStmt )
			int alt31=6;
			try { dbg.enterSubRule(31);
			try { dbg.enterDecision(31, decisionCanBacktrack[31]);

			switch ( input.LA(1) ) {
			case RULE_INT_LIT:
				{
				int LA31_1 = input.LA(2);
				if ( (synpred56_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred57_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
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
				int LA31_2 = input.LA(2);
				if ( (synpred56_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred57_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 2, input);
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
				int LA31_3 = input.LA(2);
				if ( (synpred56_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred57_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 3, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 53:
				{
				int LA31_4 = input.LA(2);
				if ( (synpred56_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred57_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 4, input);
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
				int LA31_5 = input.LA(2);
				if ( (synpred56_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred57_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 5, input);
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
				int LA31_6 = input.LA(2);
				if ( (synpred56_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred57_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 6, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 52:
				{
				int LA31_7 = input.LA(2);
				if ( (synpred56_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred57_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 7, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 71:
				{
				int LA31_8 = input.LA(2);
				if ( (synpred56_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred57_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 8, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RULE_ID:
				{
				int LA31_9 = input.LA(2);
				if ( (synpred56_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred57_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=4;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 9, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 66:
				{
				int LA31_10 = input.LA(2);
				if ( (synpred56_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred57_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 10, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 41:
				{
				int LA31_11 = input.LA(2);
				if ( (synpred56_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred57_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 11, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 70:
				{
				int LA31_12 = input.LA(2);
				if ( (synpred56_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred57_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 12, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 58:
				{
				int LA31_13 = input.LA(2);
				if ( (synpred56_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred57_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 13, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 51:
				{
				int LA31_14 = input.LA(2);
				if ( (synpred56_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred57_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 14, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RULE_MUL:
				{
				int LA31_15 = input.LA(2);
				if ( (synpred56_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred57_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 15, input);
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
				int LA31_16 = input.LA(2);
				if ( (synpred56_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred57_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 16, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 50:
				{
				alt31=6;
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:413:3: ruleIncDecStmt
					{
					dbg.location(413,3);
					pushFollow(FOLLOW_ruleIncDecStmt_in_ruleSimpleStmt1260);
					ruleIncDecStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:415:3: ruleAssignment
					{
					dbg.location(415,3);
					pushFollow(FOLLOW_ruleAssignment_in_ruleSimpleStmt1272);
					ruleAssignment();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:417:3: ruleSendStmt
					{
					dbg.location(417,3);
					pushFollow(FOLLOW_ruleSendStmt_in_ruleSimpleStmt1284);
					ruleSendStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:419:3: ruleShortVarDecl
					{
					dbg.location(419,3);
					pushFollow(FOLLOW_ruleShortVarDecl_in_ruleSimpleStmt1296);
					ruleShortVarDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:421:3: ruleExpressionStmt
					{
					dbg.location(421,3);
					pushFollow(FOLLOW_ruleExpressionStmt_in_ruleSimpleStmt1308);
					ruleExpressionStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:423:3: ruleEmptyStmt
					{
					dbg.location(423,3);
					pushFollow(FOLLOW_ruleEmptyStmt_in_ruleSimpleStmt1320);
					ruleEmptyStmt();
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
		dbg.location(425, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSimpleStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSimpleStmt"



	// $ANTLR start "ruleGoStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:428:1: ruleGoStmt : 'goto' ruleLabel ;
	public final void ruleGoStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleGoStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(428, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:428:11: ( 'goto' ruleLabel )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:429:2: 'goto' ruleLabel
			{
			dbg.location(429,2);
			match(input,67,FOLLOW_67_in_ruleGoStmt1333); if (state.failed) return;dbg.location(430,2);
			pushFollow(FOLLOW_ruleLabel_in_ruleGoStmt1336);
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
		dbg.location(431, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleGoStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleGoStmt"



	// $ANTLR start "ruleReturnStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:434:1: ruleReturnStmt : 'return' ( ruleExpressionList )? ;
	public final void ruleReturnStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleReturnStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(434, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:434:15: ( 'return' ( ruleExpressionList )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:435:2: 'return' ( ruleExpressionList )?
			{
			dbg.location(435,2);
			match(input,74,FOLLOW_74_in_ruleReturnStmt1346); if (state.failed) return;dbg.location(436,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:436:2: ( ruleExpressionList )?
			int alt32=2;
			try { dbg.enterSubRule(32);
			try { dbg.enterDecision(32, decisionCanBacktrack[32]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA32_1 = input.LA(2);
					if ( (synpred61_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA32_2 = input.LA(2);
					if ( (synpred61_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA32_3 = input.LA(2);
					if ( (synpred61_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 53:
					{
					int LA32_4 = input.LA(2);
					if ( (synpred61_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA32_5 = input.LA(2);
					if ( (synpred61_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 76:
					{
					int LA32_6 = input.LA(2);
					if ( (synpred61_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 52:
					{
					int LA32_7 = input.LA(2);
					if ( (synpred61_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 71:
					{
					int LA32_8 = input.LA(2);
					if ( (synpred61_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case RULE_ID:
					{
					int LA32_9 = input.LA(2);
					if ( (synpred61_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 66:
					{
					int LA32_10 = input.LA(2);
					if ( (synpred61_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 41:
					{
					int LA32_11 = input.LA(2);
					if ( (synpred61_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 70:
					{
					int LA32_12 = input.LA(2);
					if ( (synpred61_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 58:
					{
					int LA32_13 = input.LA(2);
					if ( (synpred61_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 51:
					{
					int LA32_14 = input.LA(2);
					if ( (synpred61_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case RULE_MUL:
					{
					int LA32_15 = input.LA(2);
					if ( (synpred61_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA32_16 = input.LA(2);
					if ( (synpred61_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(32);}

			switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:436:2: ruleExpressionList
					{
					dbg.location(436,2);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleReturnStmt1349);
					ruleExpressionList();
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
		dbg.location(438, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleReturnStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleReturnStmt"



	// $ANTLR start "ruleBreakStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:441:1: ruleBreakStmt : 'break' ( ruleLabel )? ;
	public final void ruleBreakStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleBreakStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(441, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:441:14: ( 'break' ( ruleLabel )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:442:2: 'break' ( ruleLabel )?
			{
			dbg.location(442,2);
			match(input,56,FOLLOW_56_in_ruleBreakStmt1362); if (state.failed) return;dbg.location(443,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:443:2: ( ruleLabel )?
			int alt33=2;
			try { dbg.enterSubRule(33);
			try { dbg.enterDecision(33, decisionCanBacktrack[33]);

			int LA33_0 = input.LA(1);
			if ( (LA33_0==RULE_ID) ) {
				int LA33_1 = input.LA(2);
				if ( (synpred62_DebugInternalGo()) ) {
					alt33=1;
				}
			}
			} finally {dbg.exitDecision(33);}

			switch (alt33) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:443:2: ruleLabel
					{
					dbg.location(443,2);
					pushFollow(FOLLOW_ruleLabel_in_ruleBreakStmt1365);
					ruleLabel();
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
		dbg.location(444, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleBreakStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleBreakStmt"



	// $ANTLR start "ruleContinueStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:447:1: ruleContinueStmt : 'continue' ( ruleLabel )? ;
	public final void ruleContinueStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleContinueStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(447, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:447:17: ( 'continue' ( ruleLabel )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:448:2: 'continue' ( ruleLabel )?
			{
			dbg.location(448,2);
			match(input,60,FOLLOW_60_in_ruleContinueStmt1376); if (state.failed) return;dbg.location(449,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:449:2: ( ruleLabel )?
			int alt34=2;
			try { dbg.enterSubRule(34);
			try { dbg.enterDecision(34, decisionCanBacktrack[34]);

			int LA34_0 = input.LA(1);
			if ( (LA34_0==RULE_ID) ) {
				int LA34_1 = input.LA(2);
				if ( (synpred63_DebugInternalGo()) ) {
					alt34=1;
				}
			}
			} finally {dbg.exitDecision(34);}

			switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:449:2: ruleLabel
					{
					dbg.location(449,2);
					pushFollow(FOLLOW_ruleLabel_in_ruleContinueStmt1379);
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
		dbg.location(450, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleContinueStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleContinueStmt"



	// $ANTLR start "ruleGotoStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:453:1: ruleGotoStmt : 'goto' ruleLabel ;
	public final void ruleGotoStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleGotoStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(453, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:453:13: ( 'goto' ruleLabel )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:454:2: 'goto' ruleLabel
			{
			dbg.location(454,2);
			match(input,67,FOLLOW_67_in_ruleGotoStmt1390); if (state.failed) return;dbg.location(455,2);
			pushFollow(FOLLOW_ruleLabel_in_ruleGotoStmt1393);
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
		dbg.location(456, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleGotoStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleGotoStmt"



	// $ANTLR start "ruleIfStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:459:1: ruleIfStmt : 'if' ( ruleSimpleStmt ';' )? ruleExpression ruleBlock ( 'else' ( ruleIfStmt | ruleBlock ) )? ;
	public final void ruleIfStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIfStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(459, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:459:11: ( 'if' ( ruleSimpleStmt ';' )? ruleExpression ruleBlock ( 'else' ( ruleIfStmt | ruleBlock ) )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:460:2: 'if' ( ruleSimpleStmt ';' )? ruleExpression ruleBlock ( 'else' ( ruleIfStmt | ruleBlock ) )?
			{
			dbg.location(460,2);
			match(input,68,FOLLOW_68_in_ruleIfStmt1403); if (state.failed) return;dbg.location(461,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:461:2: ( ruleSimpleStmt ';' )?
			int alt35=2;
			try { dbg.enterSubRule(35);
			try { dbg.enterDecision(35, decisionCanBacktrack[35]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA35_1 = input.LA(2);
					if ( (synpred64_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA35_2 = input.LA(2);
					if ( (synpred64_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA35_3 = input.LA(2);
					if ( (synpred64_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 53:
					{
					int LA35_4 = input.LA(2);
					if ( (synpred64_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA35_5 = input.LA(2);
					if ( (synpred64_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 76:
					{
					int LA35_6 = input.LA(2);
					if ( (synpred64_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 52:
					{
					int LA35_7 = input.LA(2);
					if ( (synpred64_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 71:
					{
					int LA35_8 = input.LA(2);
					if ( (synpred64_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case RULE_ID:
					{
					int LA35_9 = input.LA(2);
					if ( (synpred64_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 66:
					{
					int LA35_10 = input.LA(2);
					if ( (synpred64_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 41:
					{
					int LA35_11 = input.LA(2);
					if ( (synpred64_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 70:
					{
					int LA35_12 = input.LA(2);
					if ( (synpred64_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 58:
					{
					int LA35_13 = input.LA(2);
					if ( (synpred64_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 51:
					{
					int LA35_14 = input.LA(2);
					if ( (synpred64_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case RULE_MUL:
					{
					int LA35_15 = input.LA(2);
					if ( (synpred64_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA35_16 = input.LA(2);
					if ( (synpred64_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 50:
					{
					alt35=1;
					}
					break;
			}
			} finally {dbg.exitDecision(35);}

			switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:462:3: ruleSimpleStmt ';'
					{
					dbg.location(462,3);
					pushFollow(FOLLOW_ruleSimpleStmt_in_ruleIfStmt1410);
					ruleSimpleStmt();
					state._fsp--;
					if (state.failed) return;dbg.location(463,3);
					match(input,50,FOLLOW_50_in_ruleIfStmt1414); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(35);}
			dbg.location(465,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleIfStmt1421);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(466,2);
			pushFollow(FOLLOW_ruleBlock_in_ruleIfStmt1424);
			ruleBlock();
			state._fsp--;
			if (state.failed) return;dbg.location(467,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:467:2: ( 'else' ( ruleIfStmt | ruleBlock ) )?
			int alt37=2;
			try { dbg.enterSubRule(37);
			try { dbg.enterDecision(37, decisionCanBacktrack[37]);

			int LA37_0 = input.LA(1);
			if ( (LA37_0==63) ) {
				alt37=1;
			}
			} finally {dbg.exitDecision(37);}

			switch (alt37) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:468:3: 'else' ( ruleIfStmt | ruleBlock )
					{
					dbg.location(468,3);
					match(input,63,FOLLOW_63_in_ruleIfStmt1431); if (state.failed) return;dbg.location(469,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:469:3: ( ruleIfStmt | ruleBlock )
					int alt36=2;
					try { dbg.enterSubRule(36);
					try { dbg.enterDecision(36, decisionCanBacktrack[36]);

					int LA36_0 = input.LA(1);
					if ( (LA36_0==68) ) {
						alt36=1;
					}
					else if ( (LA36_0==80) ) {
						alt36=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 36, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(36);}

					switch (alt36) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:470:4: ruleIfStmt
							{
							dbg.location(470,4);
							pushFollow(FOLLOW_ruleIfStmt_in_ruleIfStmt1440);
							ruleIfStmt();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:472:4: ruleBlock
							{
							dbg.location(472,4);
							pushFollow(FOLLOW_ruleBlock_in_ruleIfStmt1454);
							ruleBlock();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(36);}

					}
					break;

			}
			} finally {dbg.exitSubRule(37);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(475, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIfStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIfStmt"



	// $ANTLR start "ruleFallthroughStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:478:1: ruleFallthroughStmt : 'fallthrough' ;
	public final void ruleFallthroughStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFallthroughStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(478, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:478:20: ( 'fallthrough' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:479:2: 'fallthrough'
			{
			dbg.location(479,2);
			match(input,64,FOLLOW_64_in_ruleFallthroughStmt1472); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(480, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFallthroughStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFallthroughStmt"



	// $ANTLR start "ruleSwitchStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:483:1: ruleSwitchStmt : ( ruleExprSwitchStmt | ruleTypeSwitchStmt ) ;
	public final void ruleSwitchStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSwitchStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(483, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:483:15: ( ( ruleExprSwitchStmt | ruleTypeSwitchStmt ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:484:2: ( ruleExprSwitchStmt | ruleTypeSwitchStmt )
			{
			dbg.location(484,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:484:2: ( ruleExprSwitchStmt | ruleTypeSwitchStmt )
			int alt38=2;
			try { dbg.enterSubRule(38);
			try { dbg.enterDecision(38, decisionCanBacktrack[38]);

			int LA38_0 = input.LA(1);
			if ( (LA38_0==77) ) {
				int LA38_1 = input.LA(2);
				if ( (synpred67_DebugInternalGo()) ) {
					alt38=1;
				}
				else if ( (true) ) {
					alt38=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(38);}

			switch (alt38) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:485:3: ruleExprSwitchStmt
					{
					dbg.location(485,3);
					pushFollow(FOLLOW_ruleExprSwitchStmt_in_ruleSwitchStmt1486);
					ruleExprSwitchStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:487:3: ruleTypeSwitchStmt
					{
					dbg.location(487,3);
					pushFollow(FOLLOW_ruleTypeSwitchStmt_in_ruleSwitchStmt1498);
					ruleTypeSwitchStmt();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(489, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSwitchStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSwitchStmt"



	// $ANTLR start "ruleSelectStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:492:1: ruleSelectStmt : 'select' '{' ( ruleCommClause )* '}' ;
	public final void ruleSelectStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSelectStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(492, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:492:15: ( 'select' '{' ( ruleCommClause )* '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:493:2: 'select' '{' ( ruleCommClause )* '}'
			{
			dbg.location(493,2);
			match(input,75,FOLLOW_75_in_ruleSelectStmt1511); if (state.failed) return;dbg.location(494,2);
			match(input,80,FOLLOW_80_in_ruleSelectStmt1514); if (state.failed) return;dbg.location(495,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:495:2: ( ruleCommClause )*
			try { dbg.enterSubRule(39);

			loop39:
			while (true) {
				int alt39=2;
				try { dbg.enterDecision(39, decisionCanBacktrack[39]);

				int LA39_0 = input.LA(1);
				if ( (LA39_0==57||LA39_0==61) ) {
					alt39=1;
				}

				} finally {dbg.exitDecision(39);}

				switch (alt39) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:495:2: ruleCommClause
					{
					dbg.location(495,2);
					pushFollow(FOLLOW_ruleCommClause_in_ruleSelectStmt1517);
					ruleCommClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop39;
				}
			}
			} finally {dbg.exitSubRule(39);}
			dbg.location(497,2);
			match(input,81,FOLLOW_81_in_ruleSelectStmt1523); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(498, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSelectStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSelectStmt"



	// $ANTLR start "ruleForStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:501:1: ruleForStmt : 'for' ( ruleCondition | ruleForClause | ruleRangeClause )? ruleBlock ;
	public final void ruleForStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleForStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(501, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:501:12: ( 'for' ( ruleCondition | ruleForClause | ruleRangeClause )? ruleBlock )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:502:2: 'for' ( ruleCondition | ruleForClause | ruleRangeClause )? ruleBlock
			{
			dbg.location(502,2);
			match(input,65,FOLLOW_65_in_ruleForStmt1533); if (state.failed) return;dbg.location(503,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:503:2: ( ruleCondition | ruleForClause | ruleRangeClause )?
			int alt40=4;
			try { dbg.enterSubRule(40);
			try { dbg.enterDecision(40, decisionCanBacktrack[40]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA40_1 = input.LA(2);
					if ( (synpred69_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred70_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA40_2 = input.LA(2);
					if ( (synpred69_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred70_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA40_3 = input.LA(2);
					if ( (synpred69_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred70_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 53:
					{
					int LA40_4 = input.LA(2);
					if ( (synpred69_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred70_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA40_5 = input.LA(2);
					if ( (synpred69_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred70_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 76:
					{
					int LA40_6 = input.LA(2);
					if ( (synpred69_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred70_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 52:
					{
					int LA40_7 = input.LA(2);
					if ( (synpred69_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred70_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 71:
					{
					int LA40_8 = input.LA(2);
					if ( (synpred69_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred70_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case RULE_ID:
					{
					int LA40_9 = input.LA(2);
					if ( (synpred69_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred70_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 66:
					{
					int LA40_10 = input.LA(2);
					if ( (synpred69_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred70_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 41:
					{
					int LA40_11 = input.LA(2);
					if ( (synpred69_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred70_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 70:
					{
					int LA40_12 = input.LA(2);
					if ( (synpred69_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred70_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 58:
					{
					int LA40_13 = input.LA(2);
					if ( (synpred69_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred70_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 51:
					{
					int LA40_14 = input.LA(2);
					if ( (synpred69_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred70_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case RULE_MUL:
					{
					int LA40_15 = input.LA(2);
					if ( (synpred69_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred70_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA40_16 = input.LA(2);
					if ( (synpred69_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred70_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 50:
					{
					alt40=2;
					}
					break;
				case 73:
					{
					alt40=3;
					}
					break;
			}
			} finally {dbg.exitDecision(40);}

			switch (alt40) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:504:3: ruleCondition
					{
					dbg.location(504,3);
					pushFollow(FOLLOW_ruleCondition_in_ruleForStmt1540);
					ruleCondition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:506:3: ruleForClause
					{
					dbg.location(506,3);
					pushFollow(FOLLOW_ruleForClause_in_ruleForStmt1552);
					ruleForClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:508:3: ruleRangeClause
					{
					dbg.location(508,3);
					pushFollow(FOLLOW_ruleRangeClause_in_ruleForStmt1564);
					ruleRangeClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(40);}
			dbg.location(510,2);
			pushFollow(FOLLOW_ruleBlock_in_ruleForStmt1571);
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
		dbg.location(511, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleForStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleForStmt"



	// $ANTLR start "ruleDeferStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:514:1: ruleDeferStmt : 'defer' ruleExpression ;
	public final void ruleDeferStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleDeferStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(514, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:514:14: ( 'defer' ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:515:2: 'defer' ruleExpression
			{
			dbg.location(515,2);
			match(input,62,FOLLOW_62_in_ruleDeferStmt1581); if (state.failed) return;dbg.location(516,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleDeferStmt1584);
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
		dbg.location(517, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleDeferStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleDeferStmt"



	// $ANTLR start "ruleConstDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:520:1: ruleConstDecl : 'const' ( ruleConstSpec | '(' ( ruleConstSpec ( ';' )? )* ')' ) ;
	public final void ruleConstDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleConstDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(520, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:520:14: ( 'const' ( ruleConstSpec | '(' ( ruleConstSpec ( ';' )? )* ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:521:2: 'const' ( ruleConstSpec | '(' ( ruleConstSpec ( ';' )? )* ')' )
			{
			dbg.location(521,2);
			match(input,59,FOLLOW_59_in_ruleConstDecl1594); if (state.failed) return;dbg.location(522,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:522:2: ( ruleConstSpec | '(' ( ruleConstSpec ( ';' )? )* ')' )
			int alt43=2;
			try { dbg.enterSubRule(43);
			try { dbg.enterDecision(43, decisionCanBacktrack[43]);

			int LA43_0 = input.LA(1);
			if ( (LA43_0==RULE_ID) ) {
				alt43=1;
			}
			else if ( (LA43_0==41) ) {
				alt43=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(43);}

			switch (alt43) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:523:3: ruleConstSpec
					{
					dbg.location(523,3);
					pushFollow(FOLLOW_ruleConstSpec_in_ruleConstDecl1601);
					ruleConstSpec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:525:3: '(' ( ruleConstSpec ( ';' )? )* ')'
					{
					dbg.location(525,3);
					match(input,41,FOLLOW_41_in_ruleConstDecl1613); if (state.failed) return;dbg.location(526,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:526:3: ( ruleConstSpec ( ';' )? )*
					try { dbg.enterSubRule(42);

					loop42:
					while (true) {
						int alt42=2;
						try { dbg.enterDecision(42, decisionCanBacktrack[42]);

						int LA42_0 = input.LA(1);
						if ( (LA42_0==RULE_ID) ) {
							alt42=1;
						}

						} finally {dbg.exitDecision(42);}

						switch (alt42) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:527:4: ruleConstSpec ( ';' )?
							{
							dbg.location(527,4);
							pushFollow(FOLLOW_ruleConstSpec_in_ruleConstDecl1622);
							ruleConstSpec();
							state._fsp--;
							if (state.failed) return;dbg.location(528,4);
							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:528:4: ( ';' )?
							int alt41=2;
							try { dbg.enterSubRule(41);
							try { dbg.enterDecision(41, decisionCanBacktrack[41]);

							int LA41_0 = input.LA(1);
							if ( (LA41_0==50) ) {
								alt41=1;
							}
							} finally {dbg.exitDecision(41);}

							switch (alt41) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:528:4: ';'
									{
									dbg.location(528,4);
									match(input,50,FOLLOW_50_in_ruleConstDecl1627); if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(41);}

							}
							break;

						default :
							break loop42;
						}
					}
					} finally {dbg.exitSubRule(42);}
					dbg.location(530,3);
					match(input,42,FOLLOW_42_in_ruleConstDecl1637); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(43);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(532, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleConstDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleConstDecl"



	// $ANTLR start "ruleConstSpec"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:535:1: ruleConstSpec : ruleIdentifierList ( ( ruleType )? '=' ruleExpressionList )? ;
	public final void ruleConstSpec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleConstSpec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(535, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:535:14: ( ruleIdentifierList ( ( ruleType )? '=' ruleExpressionList )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:536:2: ruleIdentifierList ( ( ruleType )? '=' ruleExpressionList )?
			{
			dbg.location(536,2);
			pushFollow(FOLLOW_ruleIdentifierList_in_ruleConstSpec1650);
			ruleIdentifierList();
			state._fsp--;
			if (state.failed) return;dbg.location(537,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:537:2: ( ( ruleType )? '=' ruleExpressionList )?
			int alt45=2;
			try { dbg.enterSubRule(45);
			try { dbg.enterDecision(45, decisionCanBacktrack[45]);

			switch ( input.LA(1) ) {
				case RULE_ID:
					{
					int LA45_1 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 52:
					{
					int LA45_2 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 76:
					{
					int LA45_3 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 66:
					{
					int LA45_4 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 70:
					{
					int LA45_5 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 71:
					{
					int LA45_6 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 58:
					{
					int LA45_7 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 51:
					{
					int LA45_8 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case RULE_MUL:
					{
					int LA45_9 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 41:
					{
					int LA45_10 = input.LA(2);
					if ( (synpred76_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case RULE_EQUALS:
					{
					alt45=1;
					}
					break;
			}
			} finally {dbg.exitDecision(45);}

			switch (alt45) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:538:3: ( ruleType )? '=' ruleExpressionList
					{
					dbg.location(538,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:538:3: ( ruleType )?
					int alt44=2;
					try { dbg.enterSubRule(44);
					try { dbg.enterDecision(44, decisionCanBacktrack[44]);

					int LA44_0 = input.LA(1);
					if ( (LA44_0==RULE_ID||LA44_0==RULE_MUL||LA44_0==41||(LA44_0 >= 51 && LA44_0 <= 52)||LA44_0==58||LA44_0==66||(LA44_0 >= 70 && LA44_0 <= 71)||LA44_0==76) ) {
						alt44=1;
					}
					} finally {dbg.exitDecision(44);}

					switch (alt44) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:538:3: ruleType
							{
							dbg.location(538,3);
							pushFollow(FOLLOW_ruleType_in_ruleConstSpec1657);
							ruleType();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(44);}
					dbg.location(540,3);
					match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleConstSpec1665); if (state.failed) return;dbg.location(541,3);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleConstSpec1669);
					ruleExpressionList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(45);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(543, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleConstSpec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleConstSpec"



	// $ANTLR start "ruleTypeDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:546:1: ruleTypeDecl : 'type' ( ruleTypeSpec | '(' ( ruleTypeSpec ';' )* ')' ) ;
	public final void ruleTypeDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(546, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:546:13: ( 'type' ( ruleTypeSpec | '(' ( ruleTypeSpec ';' )* ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:547:2: 'type' ( ruleTypeSpec | '(' ( ruleTypeSpec ';' )* ')' )
			{
			dbg.location(547,2);
			match(input,78,FOLLOW_78_in_ruleTypeDecl1683); if (state.failed) return;dbg.location(548,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:548:2: ( ruleTypeSpec | '(' ( ruleTypeSpec ';' )* ')' )
			int alt47=2;
			try { dbg.enterSubRule(47);
			try { dbg.enterDecision(47, decisionCanBacktrack[47]);

			int LA47_0 = input.LA(1);
			if ( (LA47_0==RULE_ID) ) {
				alt47=1;
			}
			else if ( (LA47_0==41) ) {
				alt47=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(47);}

			switch (alt47) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:549:3: ruleTypeSpec
					{
					dbg.location(549,3);
					pushFollow(FOLLOW_ruleTypeSpec_in_ruleTypeDecl1690);
					ruleTypeSpec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:551:3: '(' ( ruleTypeSpec ';' )* ')'
					{
					dbg.location(551,3);
					match(input,41,FOLLOW_41_in_ruleTypeDecl1702); if (state.failed) return;dbg.location(552,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:552:3: ( ruleTypeSpec ';' )*
					try { dbg.enterSubRule(46);

					loop46:
					while (true) {
						int alt46=2;
						try { dbg.enterDecision(46, decisionCanBacktrack[46]);

						int LA46_0 = input.LA(1);
						if ( (LA46_0==RULE_ID) ) {
							alt46=1;
						}

						} finally {dbg.exitDecision(46);}

						switch (alt46) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:553:4: ruleTypeSpec ';'
							{
							dbg.location(553,4);
							pushFollow(FOLLOW_ruleTypeSpec_in_ruleTypeDecl1711);
							ruleTypeSpec();
							state._fsp--;
							if (state.failed) return;dbg.location(554,4);
							match(input,50,FOLLOW_50_in_ruleTypeDecl1716); if (state.failed) return;
							}
							break;

						default :
							break loop46;
						}
					}
					} finally {dbg.exitSubRule(46);}
					dbg.location(556,3);
					match(input,42,FOLLOW_42_in_ruleTypeDecl1725); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(47);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(558, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeDecl"



	// $ANTLR start "ruleTypeSpec"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:561:1: ruleTypeSpec : ( ruleAliasDecl | ruleTypeDef ) ;
	public final void ruleTypeSpec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeSpec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(561, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:561:13: ( ( ruleAliasDecl | ruleTypeDef ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:562:2: ( ruleAliasDecl | ruleTypeDef )
			{
			dbg.location(562,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:562:2: ( ruleAliasDecl | ruleTypeDef )
			int alt48=2;
			try { dbg.enterSubRule(48);
			try { dbg.enterDecision(48, decisionCanBacktrack[48]);

			int LA48_0 = input.LA(1);
			if ( (LA48_0==RULE_ID) ) {
				int LA48_1 = input.LA(2);
				if ( (LA48_1==RULE_EQUALS) ) {
					alt48=1;
				}
				else if ( (LA48_1==RULE_ID||LA48_1==RULE_MUL||LA48_1==41||(LA48_1 >= 51 && LA48_1 <= 52)||LA48_1==58||LA48_1==66||(LA48_1 >= 70 && LA48_1 <= 71)||LA48_1==76) ) {
					alt48=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 48, 1, input);
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
					new NoViableAltException("", 48, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(48);}

			switch (alt48) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:563:3: ruleAliasDecl
					{
					dbg.location(563,3);
					pushFollow(FOLLOW_ruleAliasDecl_in_ruleTypeSpec1742);
					ruleAliasDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:565:3: ruleTypeDef
					{
					dbg.location(565,3);
					pushFollow(FOLLOW_ruleTypeDef_in_ruleTypeSpec1754);
					ruleTypeDef();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(567, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeSpec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeSpec"



	// $ANTLR start "ruleTypeDef"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:570:1: ruleTypeDef : ruleIDENTIFIER ruleType ;
	public final void ruleTypeDef() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeDef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(570, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:570:12: ( ruleIDENTIFIER ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:571:2: ruleIDENTIFIER ruleType
			{
			dbg.location(571,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleTypeDef1767);
			ruleIDENTIFIER();
			state._fsp--;
			if (state.failed) return;dbg.location(572,2);
			pushFollow(FOLLOW_ruleType_in_ruleTypeDef1770);
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
		dbg.location(573, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeDef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeDef"



	// $ANTLR start "ruleAliasDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:576:1: ruleAliasDecl : ruleIDENTIFIER '=' ruleType ;
	public final void ruleAliasDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleAliasDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(576, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:576:14: ( ruleIDENTIFIER '=' ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:577:2: ruleIDENTIFIER '=' ruleType
			{
			dbg.location(577,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleAliasDecl1780);
			ruleIDENTIFIER();
			state._fsp--;
			if (state.failed) return;dbg.location(578,2);
			match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleAliasDecl1783); if (state.failed) return;dbg.location(579,2);
			pushFollow(FOLLOW_ruleType_in_ruleAliasDecl1786);
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
		dbg.location(580, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleAliasDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleAliasDecl"



	// $ANTLR start "ruleVarDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:583:1: ruleVarDecl : 'var' ( ruleVarSpec | '(' ( ruleVarSpec ( ';' )? )* ')' ) ;
	public final void ruleVarDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleVarDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(583, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:583:12: ( 'var' ( ruleVarSpec | '(' ( ruleVarSpec ( ';' )? )* ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:584:2: 'var' ( ruleVarSpec | '(' ( ruleVarSpec ( ';' )? )* ')' )
			{
			dbg.location(584,2);
			match(input,79,FOLLOW_79_in_ruleVarDecl1796); if (state.failed) return;dbg.location(585,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:585:2: ( ruleVarSpec | '(' ( ruleVarSpec ( ';' )? )* ')' )
			int alt51=2;
			try { dbg.enterSubRule(51);
			try { dbg.enterDecision(51, decisionCanBacktrack[51]);

			int LA51_0 = input.LA(1);
			if ( (LA51_0==RULE_ID) ) {
				alt51=1;
			}
			else if ( (LA51_0==41) ) {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:586:3: ruleVarSpec
					{
					dbg.location(586,3);
					pushFollow(FOLLOW_ruleVarSpec_in_ruleVarDecl1803);
					ruleVarSpec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:588:3: '(' ( ruleVarSpec ( ';' )? )* ')'
					{
					dbg.location(588,3);
					match(input,41,FOLLOW_41_in_ruleVarDecl1815); if (state.failed) return;dbg.location(589,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:589:3: ( ruleVarSpec ( ';' )? )*
					try { dbg.enterSubRule(50);

					loop50:
					while (true) {
						int alt50=2;
						try { dbg.enterDecision(50, decisionCanBacktrack[50]);

						int LA50_0 = input.LA(1);
						if ( (LA50_0==RULE_ID) ) {
							alt50=1;
						}

						} finally {dbg.exitDecision(50);}

						switch (alt50) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:590:4: ruleVarSpec ( ';' )?
							{
							dbg.location(590,4);
							pushFollow(FOLLOW_ruleVarSpec_in_ruleVarDecl1824);
							ruleVarSpec();
							state._fsp--;
							if (state.failed) return;dbg.location(591,4);
							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:591:4: ( ';' )?
							int alt49=2;
							try { dbg.enterSubRule(49);
							try { dbg.enterDecision(49, decisionCanBacktrack[49]);

							int LA49_0 = input.LA(1);
							if ( (LA49_0==50) ) {
								alt49=1;
							}
							} finally {dbg.exitDecision(49);}

							switch (alt49) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:591:4: ';'
									{
									dbg.location(591,4);
									match(input,50,FOLLOW_50_in_ruleVarDecl1829); if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(49);}

							}
							break;

						default :
							break loop50;
						}
					}
					} finally {dbg.exitSubRule(50);}
					dbg.location(593,3);
					match(input,42,FOLLOW_42_in_ruleVarDecl1839); if (state.failed) return;
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
		dbg.location(595, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleVarDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleVarDecl"



	// $ANTLR start "ruleVarSpec"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:598:1: ruleVarSpec : ruleIdentifierList ( ruleType )? ( '=' ruleExpressionList )? ;
	public final void ruleVarSpec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleVarSpec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(598, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:598:12: ( ruleIdentifierList ( ruleType )? ( '=' ruleExpressionList )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:599:2: ruleIdentifierList ( ruleType )? ( '=' ruleExpressionList )?
			{
			dbg.location(599,2);
			pushFollow(FOLLOW_ruleIdentifierList_in_ruleVarSpec1852);
			ruleIdentifierList();
			state._fsp--;
			if (state.failed) return;dbg.location(600,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:600:2: ( ruleType )?
			int alt52=2;
			try { dbg.enterSubRule(52);
			try { dbg.enterDecision(52, decisionCanBacktrack[52]);

			switch ( input.LA(1) ) {
				case RULE_ID:
					{
					int LA52_1 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 52:
					{
					int LA52_2 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 76:
					{
					int LA52_3 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 66:
					{
					int LA52_4 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 70:
					{
					int LA52_5 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 71:
					{
					int LA52_6 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 58:
					{
					int LA52_7 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 51:
					{
					int LA52_8 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case RULE_MUL:
					{
					int LA52_9 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
				case 41:
					{
					int LA52_10 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt52=1;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(52);}

			switch (alt52) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:600:2: ruleType
					{
					dbg.location(600,2);
					pushFollow(FOLLOW_ruleType_in_ruleVarSpec1855);
					ruleType();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(52);}
			dbg.location(602,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:602:2: ( '=' ruleExpressionList )?
			int alt53=2;
			try { dbg.enterSubRule(53);
			try { dbg.enterDecision(53, decisionCanBacktrack[53]);

			int LA53_0 = input.LA(1);
			if ( (LA53_0==RULE_EQUALS) ) {
				alt53=1;
			}
			} finally {dbg.exitDecision(53);}

			switch (alt53) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:603:3: '=' ruleExpressionList
					{
					dbg.location(603,3);
					match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleVarSpec1865); if (state.failed) return;dbg.location(604,3);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleVarSpec1869);
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
		dbg.location(606, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleVarSpec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleVarSpec"



	// $ANTLR start "ruleEmptyStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:609:1: ruleEmptyStmt : ';' ;
	public final void ruleEmptyStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleEmptyStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(609, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:609:14: ( ';' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:610:2: ';'
			{
			dbg.location(610,2);
			match(input,50,FOLLOW_50_in_ruleEmptyStmt1883); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(611, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleEmptyStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleEmptyStmt"



	// $ANTLR start "ruleExpressionStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:614:1: ruleExpressionStmt : ruleExpression ;
	public final void ruleExpressionStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExpressionStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(614, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:614:19: ( ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:615:2: ruleExpression
			{
			dbg.location(615,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleExpressionStmt1893);
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
		dbg.location(616, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExpressionStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExpressionStmt"



	// $ANTLR start "ruleSendStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:619:1: ruleSendStmt : ruleChannel '<-' ruleExpression ;
	public final void ruleSendStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSendStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(619, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:619:13: ( ruleChannel '<-' ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:620:2: ruleChannel '<-' ruleExpression
			{
			dbg.location(620,2);
			pushFollow(FOLLOW_ruleChannel_in_ruleSendStmt1903);
			ruleChannel();
			state._fsp--;
			if (state.failed) return;dbg.location(621,2);
			match(input,51,FOLLOW_51_in_ruleSendStmt1906); if (state.failed) return;dbg.location(622,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleSendStmt1909);
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
		dbg.location(623, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSendStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSendStmt"



	// $ANTLR start "ruleChannel"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:626:1: ruleChannel : ruleExpression ;
	public final void ruleChannel() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleChannel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(626, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:626:12: ( ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:627:2: ruleExpression
			{
			dbg.location(627,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleChannel1919);
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
		dbg.location(628, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleChannel");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleChannel"



	// $ANTLR start "ruleIncDecStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:631:1: ruleIncDecStmt : ( ruleExpression '++' | ruleExpression '--' ) ;
	public final void ruleIncDecStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIncDecStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(631, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:631:15: ( ( ruleExpression '++' | ruleExpression '--' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:632:2: ( ruleExpression '++' | ruleExpression '--' )
			{
			dbg.location(632,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:632:2: ( ruleExpression '++' | ruleExpression '--' )
			int alt54=2;
			try { dbg.enterSubRule(54);
			try { dbg.enterDecision(54, decisionCanBacktrack[54]);

			switch ( input.LA(1) ) {
			case RULE_INT_LIT:
				{
				int LA54_1 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
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
				if ( (synpred85_DebugInternalGo()) ) {
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
				if ( (synpred85_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 53:
				{
				int LA54_4 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
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
				if ( (synpred85_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 76:
				{
				int LA54_6 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 52:
				{
				int LA54_7 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 71:
				{
				int LA54_8 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case RULE_ID:
				{
				int LA54_9 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 66:
				{
				int LA54_10 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 41:
				{
				int LA54_11 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 70:
				{
				int LA54_12 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 58:
				{
				int LA54_13 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case 51:
				{
				int LA54_14 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

				}
				break;
			case RULE_MUL:
				{
				int LA54_15 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
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
				if ( (synpred85_DebugInternalGo()) ) {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:633:3: ruleExpression '++'
					{
					dbg.location(633,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleIncDecStmt1933);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(634,3);
					match(input,43,FOLLOW_43_in_ruleIncDecStmt1937); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:636:3: ruleExpression '--'
					{
					dbg.location(636,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleIncDecStmt1949);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(637,3);
					match(input,45,FOLLOW_45_in_ruleIncDecStmt1953); if (state.failed) return;
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
		dbg.location(639, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIncDecStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIncDecStmt"



	// $ANTLR start "ruleAssignment"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:642:1: ruleAssignment : ruleExpressionList RULE_ASSING_OP ruleExpressionList ;
	public final void ruleAssignment() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleAssignment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(642, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:642:15: ( ruleExpressionList RULE_ASSING_OP ruleExpressionList )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:643:2: ruleExpressionList RULE_ASSING_OP ruleExpressionList
			{
			dbg.location(643,2);
			pushFollow(FOLLOW_ruleExpressionList_in_ruleAssignment1966);
			ruleExpressionList();
			state._fsp--;
			if (state.failed) return;dbg.location(644,2);
			match(input,RULE_ASSING_OP,FOLLOW_RULE_ASSING_OP_in_ruleAssignment1969); if (state.failed) return;dbg.location(645,2);
			pushFollow(FOLLOW_ruleExpressionList_in_ruleAssignment1972);
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
		dbg.location(646, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleAssignment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleAssignment"



	// $ANTLR start "ruleShortVarDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:649:1: ruleShortVarDecl : ruleIdentifierList ':=' ruleExpressionList ;
	public final void ruleShortVarDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleShortVarDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(649, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:649:17: ( ruleIdentifierList ':=' ruleExpressionList )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:650:2: ruleIdentifierList ':=' ruleExpressionList
			{
			dbg.location(650,2);
			pushFollow(FOLLOW_ruleIdentifierList_in_ruleShortVarDecl1982);
			ruleIdentifierList();
			state._fsp--;
			if (state.failed) return;dbg.location(651,2);
			match(input,49,FOLLOW_49_in_ruleShortVarDecl1985); if (state.failed) return;dbg.location(652,2);
			pushFollow(FOLLOW_ruleExpressionList_in_ruleShortVarDecl1988);
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
		dbg.location(653, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleShortVarDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleShortVarDecl"



	// $ANTLR start "ruleExprSwitchStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:656:1: ruleExprSwitchStmt : 'switch' ( ruleSimpleStmt ';' )? ( ruleExpression )? '{' ( ruleExprCaseClause )* '}' ;
	public final void ruleExprSwitchStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExprSwitchStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(656, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:656:19: ( 'switch' ( ruleSimpleStmt ';' )? ( ruleExpression )? '{' ( ruleExprCaseClause )* '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:657:2: 'switch' ( ruleSimpleStmt ';' )? ( ruleExpression )? '{' ( ruleExprCaseClause )* '}'
			{
			dbg.location(657,2);
			match(input,77,FOLLOW_77_in_ruleExprSwitchStmt1998); if (state.failed) return;dbg.location(658,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:658:2: ( ruleSimpleStmt ';' )?
			int alt55=2;
			try { dbg.enterSubRule(55);
			try { dbg.enterDecision(55, decisionCanBacktrack[55]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA55_1 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA55_2 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA55_3 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 53:
					{
					int LA55_4 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA55_5 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 76:
					{
					int LA55_6 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 52:
					{
					int LA55_7 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 71:
					{
					int LA55_8 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case RULE_ID:
					{
					int LA55_9 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 66:
					{
					int LA55_10 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 41:
					{
					int LA55_11 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 70:
					{
					int LA55_12 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 58:
					{
					int LA55_13 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 51:
					{
					int LA55_14 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case RULE_MUL:
					{
					int LA55_15 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA55_16 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt55=1;
					}
					}
					break;
				case 50:
					{
					alt55=1;
					}
					break;
			}
			} finally {dbg.exitDecision(55);}

			switch (alt55) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:659:3: ruleSimpleStmt ';'
					{
					dbg.location(659,3);
					pushFollow(FOLLOW_ruleSimpleStmt_in_ruleExprSwitchStmt2005);
					ruleSimpleStmt();
					state._fsp--;
					if (state.failed) return;dbg.location(660,3);
					match(input,50,FOLLOW_50_in_ruleExprSwitchStmt2009); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(55);}
			dbg.location(662,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:662:2: ( ruleExpression )?
			int alt56=2;
			try { dbg.enterSubRule(56);
			try { dbg.enterDecision(56, decisionCanBacktrack[56]);

			int LA56_0 = input.LA(1);
			if ( (LA56_0==RULE_DECIMALS||LA56_0==RULE_FLOAT_LIT||LA56_0==RULE_ID||LA56_0==RULE_INT_LIT||LA56_0==RULE_MUL||(LA56_0 >= RULE_STRING && LA56_0 <= RULE_UNARY_OP)||LA56_0==41||(LA56_0 >= 51 && LA56_0 <= 53)||LA56_0==58||LA56_0==66||(LA56_0 >= 70 && LA56_0 <= 71)||LA56_0==76) ) {
				alt56=1;
			}
			} finally {dbg.exitDecision(56);}

			switch (alt56) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:662:2: ruleExpression
					{
					dbg.location(662,2);
					pushFollow(FOLLOW_ruleExpression_in_ruleExprSwitchStmt2016);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(56);}
			dbg.location(664,2);
			match(input,80,FOLLOW_80_in_ruleExprSwitchStmt2022); if (state.failed) return;dbg.location(665,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:665:2: ( ruleExprCaseClause )*
			try { dbg.enterSubRule(57);

			loop57:
			while (true) {
				int alt57=2;
				try { dbg.enterDecision(57, decisionCanBacktrack[57]);

				int LA57_0 = input.LA(1);
				if ( (LA57_0==57||LA57_0==61) ) {
					alt57=1;
				}

				} finally {dbg.exitDecision(57);}

				switch (alt57) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:665:2: ruleExprCaseClause
					{
					dbg.location(665,2);
					pushFollow(FOLLOW_ruleExprCaseClause_in_ruleExprSwitchStmt2025);
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
			dbg.location(667,2);
			match(input,81,FOLLOW_81_in_ruleExprSwitchStmt2031); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(668, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExprSwitchStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExprSwitchStmt"



	// $ANTLR start "ruleExprCaseClause"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:671:1: ruleExprCaseClause : ruleExprSwitchCase ':' ruleStatementList ;
	public final void ruleExprCaseClause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExprCaseClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(671, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:671:19: ( ruleExprSwitchCase ':' ruleStatementList )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:672:2: ruleExprSwitchCase ':' ruleStatementList
			{
			dbg.location(672,2);
			pushFollow(FOLLOW_ruleExprSwitchCase_in_ruleExprCaseClause2041);
			ruleExprSwitchCase();
			state._fsp--;
			if (state.failed) return;dbg.location(673,2);
			match(input,48,FOLLOW_48_in_ruleExprCaseClause2044); if (state.failed) return;dbg.location(674,2);
			pushFollow(FOLLOW_ruleStatementList_in_ruleExprCaseClause2047);
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
		dbg.location(675, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExprCaseClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExprCaseClause"



	// $ANTLR start "ruleExprSwitchCase"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:678:1: ruleExprSwitchCase : ( 'case' ruleExpressionList | 'default' ) ;
	public final void ruleExprSwitchCase() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExprSwitchCase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(678, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:678:19: ( ( 'case' ruleExpressionList | 'default' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:679:2: ( 'case' ruleExpressionList | 'default' )
			{
			dbg.location(679,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:679:2: ( 'case' ruleExpressionList | 'default' )
			int alt58=2;
			try { dbg.enterSubRule(58);
			try { dbg.enterDecision(58, decisionCanBacktrack[58]);

			int LA58_0 = input.LA(1);
			if ( (LA58_0==57) ) {
				alt58=1;
			}
			else if ( (LA58_0==61) ) {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:680:3: 'case' ruleExpressionList
					{
					dbg.location(680,3);
					match(input,57,FOLLOW_57_in_ruleExprSwitchCase2061); if (state.failed) return;dbg.location(681,3);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleExprSwitchCase2065);
					ruleExpressionList();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:683:3: 'default'
					{
					dbg.location(683,3);
					match(input,61,FOLLOW_61_in_ruleExprSwitchCase2077); if (state.failed) return;
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
		dbg.location(685, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExprSwitchCase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExprSwitchCase"



	// $ANTLR start "ruleTypeSwitchStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:688:1: ruleTypeSwitchStmt : 'switch' ( ruleSimpleStmt ';' )? ruleTypeSwitchGuard '{' ( ruleTypeCaseClause )* '}' ;
	public final void ruleTypeSwitchStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeSwitchStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(688, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:688:19: ( 'switch' ( ruleSimpleStmt ';' )? ruleTypeSwitchGuard '{' ( ruleTypeCaseClause )* '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:689:2: 'switch' ( ruleSimpleStmt ';' )? ruleTypeSwitchGuard '{' ( ruleTypeCaseClause )* '}'
			{
			dbg.location(689,2);
			match(input,77,FOLLOW_77_in_ruleTypeSwitchStmt2090); if (state.failed) return;dbg.location(690,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:690:2: ( ruleSimpleStmt ';' )?
			int alt59=2;
			try { dbg.enterSubRule(59);
			try { dbg.enterDecision(59, decisionCanBacktrack[59]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA59_1 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA59_2 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA59_3 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 53:
					{
					int LA59_4 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA59_5 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 76:
					{
					int LA59_6 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 52:
					{
					int LA59_7 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 71:
					{
					int LA59_8 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case RULE_ID:
					{
					int LA59_9 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 66:
					{
					int LA59_10 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 41:
					{
					int LA59_11 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 70:
					{
					int LA59_12 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 58:
					{
					int LA59_13 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case 51:
					{
					int LA59_14 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case RULE_MUL:
					{
					int LA59_15 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt59=1;
					}
					}
					break;
				case RULE_UNARY_OP:
				case 50:
					{
					alt59=1;
					}
					break;
			}
			} finally {dbg.exitDecision(59);}

			switch (alt59) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:691:3: ruleSimpleStmt ';'
					{
					dbg.location(691,3);
					pushFollow(FOLLOW_ruleSimpleStmt_in_ruleTypeSwitchStmt2097);
					ruleSimpleStmt();
					state._fsp--;
					if (state.failed) return;dbg.location(692,3);
					match(input,50,FOLLOW_50_in_ruleTypeSwitchStmt2101); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(59);}
			dbg.location(694,2);
			pushFollow(FOLLOW_ruleTypeSwitchGuard_in_ruleTypeSwitchStmt2108);
			ruleTypeSwitchGuard();
			state._fsp--;
			if (state.failed) return;dbg.location(695,2);
			match(input,80,FOLLOW_80_in_ruleTypeSwitchStmt2111); if (state.failed) return;dbg.location(696,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:696:2: ( ruleTypeCaseClause )*
			try { dbg.enterSubRule(60);

			loop60:
			while (true) {
				int alt60=2;
				try { dbg.enterDecision(60, decisionCanBacktrack[60]);

				int LA60_0 = input.LA(1);
				if ( (LA60_0==57||LA60_0==61) ) {
					alt60=1;
				}

				} finally {dbg.exitDecision(60);}

				switch (alt60) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:696:2: ruleTypeCaseClause
					{
					dbg.location(696,2);
					pushFollow(FOLLOW_ruleTypeCaseClause_in_ruleTypeSwitchStmt2114);
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
			dbg.location(698,2);
			match(input,81,FOLLOW_81_in_ruleTypeSwitchStmt2120); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(699, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeSwitchStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeSwitchStmt"



	// $ANTLR start "ruleTypeSwitchGuard"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:702:1: ruleTypeSwitchGuard : ( ruleIDENTIFIER ':=' )? rulePrimaryExpr '.' '(' 'type' ')' ;
	public final void ruleTypeSwitchGuard() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeSwitchGuard");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(702, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:702:20: ( ( ruleIDENTIFIER ':=' )? rulePrimaryExpr '.' '(' 'type' ')' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:703:2: ( ruleIDENTIFIER ':=' )? rulePrimaryExpr '.' '(' 'type' ')'
			{
			dbg.location(703,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:703:2: ( ruleIDENTIFIER ':=' )?
			int alt61=2;
			try { dbg.enterSubRule(61);
			try { dbg.enterDecision(61, decisionCanBacktrack[61]);

			int LA61_0 = input.LA(1);
			if ( (LA61_0==RULE_ID) ) {
				int LA61_1 = input.LA(2);
				if ( (LA61_1==49) ) {
					alt61=1;
				}
			}
			} finally {dbg.exitDecision(61);}

			switch (alt61) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:704:3: ruleIDENTIFIER ':='
					{
					dbg.location(704,3);
					pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleTypeSwitchGuard2134);
					ruleIDENTIFIER();
					state._fsp--;
					if (state.failed) return;dbg.location(705,3);
					match(input,49,FOLLOW_49_in_ruleTypeSwitchGuard2138); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(61);}
			dbg.location(707,2);
			pushFollow(FOLLOW_rulePrimaryExpr_in_ruleTypeSwitchGuard2145);
			rulePrimaryExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(708,2);
			match(input,46,FOLLOW_46_in_ruleTypeSwitchGuard2148); if (state.failed) return;dbg.location(709,2);
			match(input,41,FOLLOW_41_in_ruleTypeSwitchGuard2151); if (state.failed) return;dbg.location(710,2);
			match(input,78,FOLLOW_78_in_ruleTypeSwitchGuard2154); if (state.failed) return;dbg.location(711,2);
			match(input,42,FOLLOW_42_in_ruleTypeSwitchGuard2157); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(712, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeSwitchGuard");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeSwitchGuard"



	// $ANTLR start "ruleTypeCaseClause"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:715:1: ruleTypeCaseClause : ruleTypeSwitchCase ':' ruleStatementList ;
	public final void ruleTypeCaseClause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeCaseClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(715, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:715:19: ( ruleTypeSwitchCase ':' ruleStatementList )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:716:2: ruleTypeSwitchCase ':' ruleStatementList
			{
			dbg.location(716,2);
			pushFollow(FOLLOW_ruleTypeSwitchCase_in_ruleTypeCaseClause2167);
			ruleTypeSwitchCase();
			state._fsp--;
			if (state.failed) return;dbg.location(717,2);
			match(input,48,FOLLOW_48_in_ruleTypeCaseClause2170); if (state.failed) return;dbg.location(718,2);
			pushFollow(FOLLOW_ruleStatementList_in_ruleTypeCaseClause2173);
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
		dbg.location(719, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeCaseClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeCaseClause"



	// $ANTLR start "ruleTypeSwitchCase"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:722:1: ruleTypeSwitchCase : ( 'case' ruleTypeList | 'default' ) ;
	public final void ruleTypeSwitchCase() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeSwitchCase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(722, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:722:19: ( ( 'case' ruleTypeList | 'default' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:723:2: ( 'case' ruleTypeList | 'default' )
			{
			dbg.location(723,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:723:2: ( 'case' ruleTypeList | 'default' )
			int alt62=2;
			try { dbg.enterSubRule(62);
			try { dbg.enterDecision(62, decisionCanBacktrack[62]);

			int LA62_0 = input.LA(1);
			if ( (LA62_0==57) ) {
				alt62=1;
			}
			else if ( (LA62_0==61) ) {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:724:3: 'case' ruleTypeList
					{
					dbg.location(724,3);
					match(input,57,FOLLOW_57_in_ruleTypeSwitchCase2187); if (state.failed) return;dbg.location(725,3);
					pushFollow(FOLLOW_ruleTypeList_in_ruleTypeSwitchCase2191);
					ruleTypeList();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:727:3: 'default'
					{
					dbg.location(727,3);
					match(input,61,FOLLOW_61_in_ruleTypeSwitchCase2203); if (state.failed) return;
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
		dbg.location(729, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeSwitchCase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeSwitchCase"



	// $ANTLR start "ruleTypeList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:732:1: ruleTypeList : ruleType ( ',' ruleType )* ;
	public final void ruleTypeList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(732, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:732:13: ( ruleType ( ',' ruleType )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:733:2: ruleType ( ',' ruleType )*
			{
			dbg.location(733,2);
			pushFollow(FOLLOW_ruleType_in_ruleTypeList2216);
			ruleType();
			state._fsp--;
			if (state.failed) return;dbg.location(734,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:734:2: ( ',' ruleType )*
			try { dbg.enterSubRule(63);

			loop63:
			while (true) {
				int alt63=2;
				try { dbg.enterDecision(63, decisionCanBacktrack[63]);

				int LA63_0 = input.LA(1);
				if ( (LA63_0==44) ) {
					alt63=1;
				}

				} finally {dbg.exitDecision(63);}

				switch (alt63) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:735:3: ',' ruleType
					{
					dbg.location(735,3);
					match(input,44,FOLLOW_44_in_ruleTypeList2223); if (state.failed) return;dbg.location(736,3);
					pushFollow(FOLLOW_ruleType_in_ruleTypeList2227);
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
		dbg.location(738, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeList"



	// $ANTLR start "ruleCommClause"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:741:1: ruleCommClause : ruleCommCase ':' ruleStatementList ;
	public final void ruleCommClause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleCommClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(741, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:741:15: ( ruleCommCase ':' ruleStatementList )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:742:2: ruleCommCase ':' ruleStatementList
			{
			dbg.location(742,2);
			pushFollow(FOLLOW_ruleCommCase_in_ruleCommClause2241);
			ruleCommCase();
			state._fsp--;
			if (state.failed) return;dbg.location(743,2);
			match(input,48,FOLLOW_48_in_ruleCommClause2244); if (state.failed) return;dbg.location(744,2);
			pushFollow(FOLLOW_ruleStatementList_in_ruleCommClause2247);
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
		dbg.location(745, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleCommClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleCommClause"



	// $ANTLR start "ruleCommCase"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:748:1: ruleCommCase : ( 'case' ( ruleSendStmt | ruleRecvStmt ) | 'default' ) ;
	public final void ruleCommCase() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleCommCase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(748, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:748:13: ( ( 'case' ( ruleSendStmt | ruleRecvStmt ) | 'default' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:749:2: ( 'case' ( ruleSendStmt | ruleRecvStmt ) | 'default' )
			{
			dbg.location(749,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:749:2: ( 'case' ( ruleSendStmt | ruleRecvStmt ) | 'default' )
			int alt65=2;
			try { dbg.enterSubRule(65);
			try { dbg.enterDecision(65, decisionCanBacktrack[65]);

			int LA65_0 = input.LA(1);
			if ( (LA65_0==57) ) {
				alt65=1;
			}
			else if ( (LA65_0==61) ) {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:750:3: 'case' ( ruleSendStmt | ruleRecvStmt )
					{
					dbg.location(750,3);
					match(input,57,FOLLOW_57_in_ruleCommCase2261); if (state.failed) return;dbg.location(751,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:751:3: ( ruleSendStmt | ruleRecvStmt )
					int alt64=2;
					try { dbg.enterSubRule(64);
					try { dbg.enterDecision(64, decisionCanBacktrack[64]);

					switch ( input.LA(1) ) {
					case RULE_INT_LIT:
						{
						int LA64_1 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
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
						if ( (synpred95_DebugInternalGo()) ) {
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
						if ( (synpred95_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 53:
						{
						int LA64_4 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
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
						if ( (synpred95_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 76:
						{
						int LA64_6 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 52:
						{
						int LA64_7 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 71:
						{
						int LA64_8 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case RULE_ID:
						{
						int LA64_9 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 66:
						{
						int LA64_10 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 41:
						{
						int LA64_11 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 70:
						{
						int LA64_12 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 58:
						{
						int LA64_13 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case 51:
						{
						int LA64_14 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

						}
						break;
					case RULE_MUL:
						{
						int LA64_15 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
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
						if ( (synpred95_DebugInternalGo()) ) {
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

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:752:4: ruleSendStmt
							{
							dbg.location(752,4);
							pushFollow(FOLLOW_ruleSendStmt_in_ruleCommCase2270);
							ruleSendStmt();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:754:4: ruleRecvStmt
							{
							dbg.location(754,4);
							pushFollow(FOLLOW_ruleRecvStmt_in_ruleCommCase2284);
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:757:3: 'default'
					{
					dbg.location(757,3);
					match(input,61,FOLLOW_61_in_ruleCommCase2300); if (state.failed) return;
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
		dbg.location(759, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleCommCase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleCommCase"



	// $ANTLR start "ruleRecvStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:762:1: ruleRecvStmt : ( ruleExpressionList '=' | ruleIdentifierList ':=' )? ruleRecvExpr ;
	public final void ruleRecvStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleRecvStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(762, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:762:13: ( ( ruleExpressionList '=' | ruleIdentifierList ':=' )? ruleRecvExpr )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:763:2: ( ruleExpressionList '=' | ruleIdentifierList ':=' )? ruleRecvExpr
			{
			dbg.location(763,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:763:2: ( ruleExpressionList '=' | ruleIdentifierList ':=' )?
			int alt66=3;
			try { dbg.enterSubRule(66);
			try { dbg.enterDecision(66, decisionCanBacktrack[66]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA66_1 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA66_2 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA66_3 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 53:
					{
					int LA66_4 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA66_5 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 76:
					{
					int LA66_6 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 52:
					{
					int LA66_7 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 71:
					{
					int LA66_8 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case RULE_ID:
					{
					int LA66_9 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt66=1;
					}
					else if ( (synpred98_DebugInternalGo()) ) {
						alt66=2;
					}
					}
					break;
				case 66:
					{
					int LA66_10 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 41:
					{
					int LA66_11 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 70:
					{
					int LA66_12 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 58:
					{
					int LA66_13 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case 51:
					{
					int LA66_14 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case RULE_MUL:
					{
					int LA66_15 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA66_16 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt66=1;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(66);}

			switch (alt66) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:764:3: ruleExpressionList '='
					{
					dbg.location(764,3);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleRecvStmt2317);
					ruleExpressionList();
					state._fsp--;
					if (state.failed) return;dbg.location(765,3);
					match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleRecvStmt2321); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:767:3: ruleIdentifierList ':='
					{
					dbg.location(767,3);
					pushFollow(FOLLOW_ruleIdentifierList_in_ruleRecvStmt2333);
					ruleIdentifierList();
					state._fsp--;
					if (state.failed) return;dbg.location(768,3);
					match(input,49,FOLLOW_49_in_ruleRecvStmt2337); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(66);}
			dbg.location(770,2);
			pushFollow(FOLLOW_ruleRecvExpr_in_ruleRecvStmt2344);
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
		dbg.location(771, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleRecvStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleRecvStmt"



	// $ANTLR start "ruleRecvExpr"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:774:1: ruleRecvExpr : ruleExpression ;
	public final void ruleRecvExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleRecvExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(774, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:774:13: ( ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:775:2: ruleExpression
			{
			dbg.location(775,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleRecvExpr2354);
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
		dbg.location(776, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleRecvExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleRecvExpr"



	// $ANTLR start "ruleCondition"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:779:1: ruleCondition : ruleExpression ;
	public final void ruleCondition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleCondition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(779, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:779:14: ( ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:780:2: ruleExpression
			{
			dbg.location(780,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleCondition2364);
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
		dbg.location(781, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleCondition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleCondition"



	// $ANTLR start "ruleForClause"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:784:1: ruleForClause : ( ruleInitStmt )? ';' ( ruleCondition )? ';' ( rulePostStmt )? ;
	public final void ruleForClause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleForClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(784, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:784:14: ( ( ruleInitStmt )? ';' ( ruleCondition )? ';' ( rulePostStmt )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:785:2: ( ruleInitStmt )? ';' ( ruleCondition )? ';' ( rulePostStmt )?
			{
			dbg.location(785,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:785:2: ( ruleInitStmt )?
			int alt67=2;
			try { dbg.enterSubRule(67);
			try { dbg.enterDecision(67, decisionCanBacktrack[67]);

			int LA67_0 = input.LA(1);
			if ( (LA67_0==RULE_DECIMALS||LA67_0==RULE_FLOAT_LIT||LA67_0==RULE_ID||LA67_0==RULE_INT_LIT||LA67_0==RULE_MUL||(LA67_0 >= RULE_STRING && LA67_0 <= RULE_UNARY_OP)||LA67_0==41||(LA67_0 >= 51 && LA67_0 <= 53)||LA67_0==58||LA67_0==66||(LA67_0 >= 70 && LA67_0 <= 71)||LA67_0==76) ) {
				alt67=1;
			}
			else if ( (LA67_0==50) ) {
				int LA67_17 = input.LA(2);
				if ( (synpred99_DebugInternalGo()) ) {
					alt67=1;
				}
			}
			} finally {dbg.exitDecision(67);}

			switch (alt67) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:785:2: ruleInitStmt
					{
					dbg.location(785,2);
					pushFollow(FOLLOW_ruleInitStmt_in_ruleForClause2374);
					ruleInitStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(67);}
			dbg.location(787,2);
			match(input,50,FOLLOW_50_in_ruleForClause2380); if (state.failed) return;dbg.location(788,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:788:2: ( ruleCondition )?
			int alt68=2;
			try { dbg.enterSubRule(68);
			try { dbg.enterDecision(68, decisionCanBacktrack[68]);

			int LA68_0 = input.LA(1);
			if ( (LA68_0==RULE_DECIMALS||LA68_0==RULE_FLOAT_LIT||LA68_0==RULE_ID||LA68_0==RULE_INT_LIT||LA68_0==RULE_MUL||(LA68_0 >= RULE_STRING && LA68_0 <= RULE_UNARY_OP)||LA68_0==41||(LA68_0 >= 51 && LA68_0 <= 53)||LA68_0==58||LA68_0==66||(LA68_0 >= 70 && LA68_0 <= 71)||LA68_0==76) ) {
				alt68=1;
			}
			} finally {dbg.exitDecision(68);}

			switch (alt68) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:788:2: ruleCondition
					{
					dbg.location(788,2);
					pushFollow(FOLLOW_ruleCondition_in_ruleForClause2383);
					ruleCondition();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(68);}
			dbg.location(790,2);
			match(input,50,FOLLOW_50_in_ruleForClause2389); if (state.failed) return;dbg.location(791,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:791:2: ( rulePostStmt )?
			int alt69=2;
			try { dbg.enterSubRule(69);
			try { dbg.enterDecision(69, decisionCanBacktrack[69]);

			int LA69_0 = input.LA(1);
			if ( (LA69_0==RULE_DECIMALS||LA69_0==RULE_FLOAT_LIT||LA69_0==RULE_ID||LA69_0==RULE_INT_LIT||LA69_0==RULE_MUL||(LA69_0 >= RULE_STRING && LA69_0 <= RULE_UNARY_OP)||LA69_0==41||(LA69_0 >= 50 && LA69_0 <= 53)||LA69_0==58||LA69_0==66||(LA69_0 >= 70 && LA69_0 <= 71)||LA69_0==76) ) {
				alt69=1;
			}
			} finally {dbg.exitDecision(69);}

			switch (alt69) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:791:2: rulePostStmt
					{
					dbg.location(791,2);
					pushFollow(FOLLOW_rulePostStmt_in_ruleForClause2392);
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
		dbg.location(793, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleForClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleForClause"



	// $ANTLR start "ruleRangeClause"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:796:1: ruleRangeClause : ( ruleExpressionList '=' | ruleIdentifierList ':=' )? 'range' ruleExpression ;
	public final void ruleRangeClause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleRangeClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(796, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:796:16: ( ( ruleExpressionList '=' | ruleIdentifierList ':=' )? 'range' ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:797:2: ( ruleExpressionList '=' | ruleIdentifierList ':=' )? 'range' ruleExpression
			{
			dbg.location(797,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:797:2: ( ruleExpressionList '=' | ruleIdentifierList ':=' )?
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:798:3: ruleExpressionList '='
					{
					dbg.location(798,3);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleRangeClause2409);
					ruleExpressionList();
					state._fsp--;
					if (state.failed) return;dbg.location(799,3);
					match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleRangeClause2413); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:801:3: ruleIdentifierList ':='
					{
					dbg.location(801,3);
					pushFollow(FOLLOW_ruleIdentifierList_in_ruleRangeClause2425);
					ruleIdentifierList();
					state._fsp--;
					if (state.failed) return;dbg.location(802,3);
					match(input,49,FOLLOW_49_in_ruleRangeClause2429); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(70);}
			dbg.location(804,2);
			match(input,73,FOLLOW_73_in_ruleRangeClause2436); if (state.failed) return;dbg.location(805,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleRangeClause2439);
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
		dbg.location(806, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleRangeClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleRangeClause"



	// $ANTLR start "ruleInitStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:809:1: ruleInitStmt : ruleSimpleStmt ;
	public final void ruleInitStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleInitStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(809, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:809:13: ( ruleSimpleStmt )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:810:2: ruleSimpleStmt
			{
			dbg.location(810,2);
			pushFollow(FOLLOW_ruleSimpleStmt_in_ruleInitStmt2449);
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
		dbg.location(811, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleInitStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleInitStmt"



	// $ANTLR start "rulePostStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:814:1: rulePostStmt : ruleSimpleStmt ;
	public final void rulePostStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulePostStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(814, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:814:13: ( ruleSimpleStmt )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:815:2: ruleSimpleStmt
			{
			dbg.location(815,2);
			pushFollow(FOLLOW_ruleSimpleStmt_in_rulePostStmt2459);
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
		dbg.location(816, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulePostStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulePostStmt"



	// $ANTLR start "ruleLabel"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:819:1: ruleLabel : ruleIDENTIFIER ;
	public final void ruleLabel() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleLabel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(819, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:819:10: ( ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:820:2: ruleIDENTIFIER
			{
			dbg.location(820,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleLabel2469);
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
		dbg.location(821, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleLabel");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleLabel"



	// $ANTLR start "ruleExpressionList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:824:1: ruleExpressionList : ruleExpression ( ',' ruleExpression )* ;
	public final void ruleExpressionList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExpressionList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(824, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:824:19: ( ruleExpression ( ',' ruleExpression )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:825:2: ruleExpression ( ',' ruleExpression )*
			{
			dbg.location(825,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList2479);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(826,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:826:2: ( ',' ruleExpression )*
			try { dbg.enterSubRule(71);

			loop71:
			while (true) {
				int alt71=2;
				try { dbg.enterDecision(71, decisionCanBacktrack[71]);

				int LA71_0 = input.LA(1);
				if ( (LA71_0==44) ) {
					int LA71_2 = input.LA(2);
					if ( (LA71_2==RULE_DECIMALS||LA71_2==RULE_FLOAT_LIT||LA71_2==RULE_ID||LA71_2==RULE_INT_LIT||LA71_2==RULE_MUL||(LA71_2 >= RULE_STRING && LA71_2 <= RULE_UNARY_OP)||LA71_2==41||(LA71_2 >= 51 && LA71_2 <= 53)||LA71_2==58||LA71_2==66||(LA71_2 >= 70 && LA71_2 <= 71)||LA71_2==76) ) {
						alt71=1;
					}

				}

				} finally {dbg.exitDecision(71);}

				switch (alt71) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:827:3: ',' ruleExpression
					{
					dbg.location(827,3);
					match(input,44,FOLLOW_44_in_ruleExpressionList2486); if (state.failed) return;dbg.location(828,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList2490);
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
		dbg.location(830, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExpressionList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExpressionList"



	// $ANTLR start "ruleExpression"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:833:1: ruleExpression : ruleUnaryExpr ruleExpression2 ;
	public final void ruleExpression() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(833, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:833:15: ( ruleUnaryExpr ruleExpression2 )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:834:2: ruleUnaryExpr ruleExpression2
			{
			dbg.location(834,2);
			pushFollow(FOLLOW_ruleUnaryExpr_in_ruleExpression2504);
			ruleUnaryExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(835,2);
			pushFollow(FOLLOW_ruleExpression2_in_ruleExpression2507);
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
		dbg.location(836, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExpression"



	// $ANTLR start "ruleExpression2"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:839:1: ruleExpression2 : ( RULE_BINARY_OP ruleExpression ruleExpression2 )? ;
	public final void ruleExpression2() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExpression2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(839, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:839:16: ( ( RULE_BINARY_OP ruleExpression ruleExpression2 )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:840:2: ( RULE_BINARY_OP ruleExpression ruleExpression2 )?
			{
			dbg.location(840,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:840:2: ( RULE_BINARY_OP ruleExpression ruleExpression2 )?
			int alt72=2;
			try { dbg.enterSubRule(72);
			try { dbg.enterDecision(72, decisionCanBacktrack[72]);

			int LA72_0 = input.LA(1);
			if ( (LA72_0==RULE_BINARY_OP) ) {
				int LA72_1 = input.LA(2);
				if ( (synpred105_DebugInternalGo()) ) {
					alt72=1;
				}
			}
			} finally {dbg.exitDecision(72);}

			switch (alt72) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:841:3: RULE_BINARY_OP ruleExpression ruleExpression2
					{
					dbg.location(841,3);
					match(input,RULE_BINARY_OP,FOLLOW_RULE_BINARY_OP_in_ruleExpression22521); if (state.failed) return;dbg.location(842,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleExpression22525);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(843,3);
					pushFollow(FOLLOW_ruleExpression2_in_ruleExpression22529);
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
		dbg.location(845, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExpression2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExpression2"



	// $ANTLR start "ruleUnaryExpr"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:848:1: ruleUnaryExpr : ( rulePrimaryExpr | RULE_UNARY_OP ruleUnaryExpr ) ;
	public final void ruleUnaryExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleUnaryExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(848, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:848:14: ( ( rulePrimaryExpr | RULE_UNARY_OP ruleUnaryExpr ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:849:2: ( rulePrimaryExpr | RULE_UNARY_OP ruleUnaryExpr )
			{
			dbg.location(849,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:849:2: ( rulePrimaryExpr | RULE_UNARY_OP ruleUnaryExpr )
			int alt73=2;
			try { dbg.enterSubRule(73);
			try { dbg.enterDecision(73, decisionCanBacktrack[73]);

			int LA73_0 = input.LA(1);
			if ( (LA73_0==RULE_DECIMALS||LA73_0==RULE_FLOAT_LIT||LA73_0==RULE_ID||LA73_0==RULE_INT_LIT||LA73_0==RULE_MUL||LA73_0==RULE_STRING||LA73_0==41||(LA73_0 >= 51 && LA73_0 <= 53)||LA73_0==58||LA73_0==66||(LA73_0 >= 70 && LA73_0 <= 71)||LA73_0==76) ) {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:850:3: rulePrimaryExpr
					{
					dbg.location(850,3);
					pushFollow(FOLLOW_rulePrimaryExpr_in_ruleUnaryExpr2547);
					rulePrimaryExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:852:3: RULE_UNARY_OP ruleUnaryExpr
					{
					dbg.location(852,3);
					match(input,RULE_UNARY_OP,FOLLOW_RULE_UNARY_OP_in_ruleUnaryExpr2559); if (state.failed) return;dbg.location(853,3);
					pushFollow(FOLLOW_ruleUnaryExpr_in_ruleUnaryExpr2563);
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
		dbg.location(855, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleUnaryExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleUnaryExpr"



	// $ANTLR start "rulePrimaryExpr"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:858:1: rulePrimaryExpr : ( ruleOperand rulePrimaryExpr2 | ruleConversion rulePrimaryExpr2 | ruleMethodExpr rulePrimaryExpr2 ) ;
	public final void rulePrimaryExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulePrimaryExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(858, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:858:16: ( ( ruleOperand rulePrimaryExpr2 | ruleConversion rulePrimaryExpr2 | ruleMethodExpr rulePrimaryExpr2 ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:859:2: ( ruleOperand rulePrimaryExpr2 | ruleConversion rulePrimaryExpr2 | ruleMethodExpr rulePrimaryExpr2 )
			{
			dbg.location(859,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:859:2: ( ruleOperand rulePrimaryExpr2 | ruleConversion rulePrimaryExpr2 | ruleMethodExpr rulePrimaryExpr2 )
			int alt74=3;
			try { dbg.enterSubRule(74);
			try { dbg.enterDecision(74, decisionCanBacktrack[74]);

			switch ( input.LA(1) ) {
			case RULE_DECIMALS:
			case RULE_FLOAT_LIT:
			case RULE_INT_LIT:
			case RULE_STRING:
			case 53:
				{
				alt74=1;
				}
				break;
			case 76:
				{
				int LA74_6 = input.LA(2);
				if ( (synpred107_DebugInternalGo()) ) {
					alt74=1;
				}
				else if ( (synpred108_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case 52:
				{
				int LA74_7 = input.LA(2);
				if ( (synpred107_DebugInternalGo()) ) {
					alt74=1;
				}
				else if ( (synpred108_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case 71:
				{
				int LA74_8 = input.LA(2);
				if ( (synpred107_DebugInternalGo()) ) {
					alt74=1;
				}
				else if ( (synpred108_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case RULE_ID:
				{
				int LA74_9 = input.LA(2);
				if ( (synpred107_DebugInternalGo()) ) {
					alt74=1;
				}
				else if ( (synpred108_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case 66:
				{
				int LA74_10 = input.LA(2);
				if ( (synpred107_DebugInternalGo()) ) {
					alt74=1;
				}
				else if ( (synpred108_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case 41:
				{
				int LA74_11 = input.LA(2);
				if ( (synpred107_DebugInternalGo()) ) {
					alt74=1;
				}
				else if ( (synpred108_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case 70:
				{
				int LA74_12 = input.LA(2);
				if ( (synpred108_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case 58:
				{
				int LA74_13 = input.LA(2);
				if ( (synpred108_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case 51:
				{
				int LA74_14 = input.LA(2);
				if ( (synpred108_DebugInternalGo()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

				}
				break;
			case RULE_MUL:
				{
				int LA74_15 = input.LA(2);
				if ( (synpred108_DebugInternalGo()) ) {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:860:3: ruleOperand rulePrimaryExpr2
					{
					dbg.location(860,3);
					pushFollow(FOLLOW_ruleOperand_in_rulePrimaryExpr2580);
					ruleOperand();
					state._fsp--;
					if (state.failed) return;dbg.location(861,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2584);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:863:3: ruleConversion rulePrimaryExpr2
					{
					dbg.location(863,3);
					pushFollow(FOLLOW_ruleConversion_in_rulePrimaryExpr2596);
					ruleConversion();
					state._fsp--;
					if (state.failed) return;dbg.location(864,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2600);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:866:3: ruleMethodExpr rulePrimaryExpr2
					{
					dbg.location(866,3);
					pushFollow(FOLLOW_ruleMethodExpr_in_rulePrimaryExpr2612);
					ruleMethodExpr();
					state._fsp--;
					if (state.failed) return;dbg.location(867,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2616);
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
		dbg.location(869, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulePrimaryExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulePrimaryExpr"



	// $ANTLR start "rulePrimaryExpr2"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:872:1: rulePrimaryExpr2 : ( ruleSelector rulePrimaryExpr2 | ruleIndex rulePrimaryExpr2 | ruleSlice rulePrimaryExpr2 | ruleTypeAssertion rulePrimaryExpr2 | ruleArguments rulePrimaryExpr2 )? ;
	public final void rulePrimaryExpr2() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulePrimaryExpr2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(872, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:872:17: ( ( ruleSelector rulePrimaryExpr2 | ruleIndex rulePrimaryExpr2 | ruleSlice rulePrimaryExpr2 | ruleTypeAssertion rulePrimaryExpr2 | ruleArguments rulePrimaryExpr2 )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:873:2: ( ruleSelector rulePrimaryExpr2 | ruleIndex rulePrimaryExpr2 | ruleSlice rulePrimaryExpr2 | ruleTypeAssertion rulePrimaryExpr2 | ruleArguments rulePrimaryExpr2 )?
			{
			dbg.location(873,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:873:2: ( ruleSelector rulePrimaryExpr2 | ruleIndex rulePrimaryExpr2 | ruleSlice rulePrimaryExpr2 | ruleTypeAssertion rulePrimaryExpr2 | ruleArguments rulePrimaryExpr2 )?
			int alt75=6;
			try { dbg.enterSubRule(75);
			try { dbg.enterDecision(75, decisionCanBacktrack[75]);

			switch ( input.LA(1) ) {
				case 46:
					{
					int LA75_1 = input.LA(2);
					if ( (synpred109_DebugInternalGo()) ) {
						alt75=1;
					}
					else if ( (synpred112_DebugInternalGo()) ) {
						alt75=4;
					}
					}
					break;
				case 52:
					{
					int LA75_2 = input.LA(2);
					if ( (synpred110_DebugInternalGo()) ) {
						alt75=2;
					}
					else if ( (synpred111_DebugInternalGo()) ) {
						alt75=3;
					}
					}
					break;
				case 41:
					{
					int LA75_3 = input.LA(2);
					if ( (synpred113_DebugInternalGo()) ) {
						alt75=5;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(75);}

			switch (alt75) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:874:3: ruleSelector rulePrimaryExpr2
					{
					dbg.location(874,3);
					pushFollow(FOLLOW_ruleSelector_in_rulePrimaryExpr22633);
					ruleSelector();
					state._fsp--;
					if (state.failed) return;dbg.location(875,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22637);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:877:3: ruleIndex rulePrimaryExpr2
					{
					dbg.location(877,3);
					pushFollow(FOLLOW_ruleIndex_in_rulePrimaryExpr22649);
					ruleIndex();
					state._fsp--;
					if (state.failed) return;dbg.location(878,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22653);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:880:3: ruleSlice rulePrimaryExpr2
					{
					dbg.location(880,3);
					pushFollow(FOLLOW_ruleSlice_in_rulePrimaryExpr22665);
					ruleSlice();
					state._fsp--;
					if (state.failed) return;dbg.location(881,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22669);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:883:3: ruleTypeAssertion rulePrimaryExpr2
					{
					dbg.location(883,3);
					pushFollow(FOLLOW_ruleTypeAssertion_in_rulePrimaryExpr22681);
					ruleTypeAssertion();
					state._fsp--;
					if (state.failed) return;dbg.location(884,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22685);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:886:3: ruleArguments rulePrimaryExpr2
					{
					dbg.location(886,3);
					pushFollow(FOLLOW_ruleArguments_in_rulePrimaryExpr22697);
					ruleArguments();
					state._fsp--;
					if (state.failed) return;dbg.location(887,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22701);
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
		dbg.location(889, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulePrimaryExpr2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulePrimaryExpr2"



	// $ANTLR start "ruleOperand"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:892:1: ruleOperand : ( ruleLiteral | ruleOperandName | '(' ruleExpression ')' ) ;
	public final void ruleOperand() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleOperand");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(892, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:892:12: ( ( ruleLiteral | ruleOperandName | '(' ruleExpression ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:893:2: ( ruleLiteral | ruleOperandName | '(' ruleExpression ')' )
			{
			dbg.location(893,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:893:2: ( ruleLiteral | ruleOperandName | '(' ruleExpression ')' )
			int alt76=3;
			try { dbg.enterSubRule(76);
			try { dbg.enterDecision(76, decisionCanBacktrack[76]);

			switch ( input.LA(1) ) {
			case RULE_DECIMALS:
			case RULE_FLOAT_LIT:
			case RULE_INT_LIT:
			case RULE_STRING:
			case 52:
			case 53:
			case 66:
			case 71:
			case 76:
				{
				alt76=1;
				}
				break;
			case RULE_ID:
				{
				int LA76_9 = input.LA(2);
				if ( (synpred114_DebugInternalGo()) ) {
					alt76=1;
				}
				else if ( (synpred115_DebugInternalGo()) ) {
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
			case 41:
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:894:3: ruleLiteral
					{
					dbg.location(894,3);
					pushFollow(FOLLOW_ruleLiteral_in_ruleOperand2719);
					ruleLiteral();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:896:3: ruleOperandName
					{
					dbg.location(896,3);
					pushFollow(FOLLOW_ruleOperandName_in_ruleOperand2731);
					ruleOperandName();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:898:3: '(' ruleExpression ')'
					{
					dbg.location(898,3);
					match(input,41,FOLLOW_41_in_ruleOperand2743); if (state.failed) return;dbg.location(899,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleOperand2747);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(900,3);
					match(input,42,FOLLOW_42_in_ruleOperand2751); if (state.failed) return;
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
		dbg.location(902, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleOperand");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleOperand"



	// $ANTLR start "ruleConversion"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:905:1: ruleConversion : ruleType '(' ruleExpression ( ',' )? ')' ;
	public final void ruleConversion() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleConversion");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(905, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:905:15: ( ruleType '(' ruleExpression ( ',' )? ')' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:906:2: ruleType '(' ruleExpression ( ',' )? ')'
			{
			dbg.location(906,2);
			pushFollow(FOLLOW_ruleType_in_ruleConversion2764);
			ruleType();
			state._fsp--;
			if (state.failed) return;dbg.location(907,2);
			match(input,41,FOLLOW_41_in_ruleConversion2767); if (state.failed) return;dbg.location(908,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleConversion2770);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(909,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:909:2: ( ',' )?
			int alt77=2;
			try { dbg.enterSubRule(77);
			try { dbg.enterDecision(77, decisionCanBacktrack[77]);

			int LA77_0 = input.LA(1);
			if ( (LA77_0==44) ) {
				alt77=1;
			}
			} finally {dbg.exitDecision(77);}

			switch (alt77) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:909:2: ','
					{
					dbg.location(909,2);
					match(input,44,FOLLOW_44_in_ruleConversion2773); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(77);}
			dbg.location(910,2);
			match(input,42,FOLLOW_42_in_ruleConversion2777); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(911, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleConversion");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleConversion"



	// $ANTLR start "ruleMethodExpr"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:914:1: ruleMethodExpr : ruleReceiverType '.' ruleMethodName ;
	public final void ruleMethodExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleMethodExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(914, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:914:15: ( ruleReceiverType '.' ruleMethodName )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:915:2: ruleReceiverType '.' ruleMethodName
			{
			dbg.location(915,2);
			pushFollow(FOLLOW_ruleReceiverType_in_ruleMethodExpr2787);
			ruleReceiverType();
			state._fsp--;
			if (state.failed) return;dbg.location(916,2);
			match(input,46,FOLLOW_46_in_ruleMethodExpr2790); if (state.failed) return;dbg.location(917,2);
			pushFollow(FOLLOW_ruleMethodName_in_ruleMethodExpr2793);
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
		dbg.location(918, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleMethodExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleMethodExpr"



	// $ANTLR start "ruleSelector"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:921:1: ruleSelector : '.' ruleIDENTIFIER ;
	public final void ruleSelector() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSelector");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(921, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:921:13: ( '.' ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:922:2: '.' ruleIDENTIFIER
			{
			dbg.location(922,2);
			match(input,46,FOLLOW_46_in_ruleSelector2803); if (state.failed) return;dbg.location(923,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleSelector2806);
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
		dbg.location(924, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSelector");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSelector"



	// $ANTLR start "ruleIndex"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:927:1: ruleIndex : '[' ruleExpression ']' ;
	public final void ruleIndex() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIndex");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(927, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:927:10: ( '[' ruleExpression ']' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:928:2: '[' ruleExpression ']'
			{
			dbg.location(928,2);
			match(input,52,FOLLOW_52_in_ruleIndex2816); if (state.failed) return;dbg.location(929,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleIndex2819);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(930,2);
			match(input,55,FOLLOW_55_in_ruleIndex2822); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(931, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIndex");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIndex"



	// $ANTLR start "ruleSlice"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:934:1: ruleSlice : ( '[' ( ruleExpression )? ':' ( ruleExpression )? ']' | '[' ( ruleExpression )? ':' ruleExpression ':' ruleExpression ']' ) ;
	public final void ruleSlice() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSlice");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(934, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:934:10: ( ( '[' ( ruleExpression )? ':' ( ruleExpression )? ']' | '[' ( ruleExpression )? ':' ruleExpression ':' ruleExpression ']' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:935:2: ( '[' ( ruleExpression )? ':' ( ruleExpression )? ']' | '[' ( ruleExpression )? ':' ruleExpression ':' ruleExpression ']' )
			{
			dbg.location(935,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:935:2: ( '[' ( ruleExpression )? ':' ( ruleExpression )? ']' | '[' ( ruleExpression )? ':' ruleExpression ':' ruleExpression ']' )
			int alt81=2;
			try { dbg.enterSubRule(81);
			try { dbg.enterDecision(81, decisionCanBacktrack[81]);

			int LA81_0 = input.LA(1);
			if ( (LA81_0==52) ) {
				int LA81_1 = input.LA(2);
				if ( (synpred119_DebugInternalGo()) ) {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:936:3: '[' ( ruleExpression )? ':' ( ruleExpression )? ']'
					{
					dbg.location(936,3);
					match(input,52,FOLLOW_52_in_ruleSlice2836); if (state.failed) return;dbg.location(937,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:937:3: ( ruleExpression )?
					int alt78=2;
					try { dbg.enterSubRule(78);
					try { dbg.enterDecision(78, decisionCanBacktrack[78]);

					int LA78_0 = input.LA(1);
					if ( (LA78_0==RULE_DECIMALS||LA78_0==RULE_FLOAT_LIT||LA78_0==RULE_ID||LA78_0==RULE_INT_LIT||LA78_0==RULE_MUL||(LA78_0 >= RULE_STRING && LA78_0 <= RULE_UNARY_OP)||LA78_0==41||(LA78_0 >= 51 && LA78_0 <= 53)||LA78_0==58||LA78_0==66||(LA78_0 >= 70 && LA78_0 <= 71)||LA78_0==76) ) {
						alt78=1;
					}
					} finally {dbg.exitDecision(78);}

					switch (alt78) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:937:3: ruleExpression
							{
							dbg.location(937,3);
							pushFollow(FOLLOW_ruleExpression_in_ruleSlice2840);
							ruleExpression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(78);}
					dbg.location(939,3);
					match(input,48,FOLLOW_48_in_ruleSlice2848); if (state.failed) return;dbg.location(940,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:940:3: ( ruleExpression )?
					int alt79=2;
					try { dbg.enterSubRule(79);
					try { dbg.enterDecision(79, decisionCanBacktrack[79]);

					int LA79_0 = input.LA(1);
					if ( (LA79_0==RULE_DECIMALS||LA79_0==RULE_FLOAT_LIT||LA79_0==RULE_ID||LA79_0==RULE_INT_LIT||LA79_0==RULE_MUL||(LA79_0 >= RULE_STRING && LA79_0 <= RULE_UNARY_OP)||LA79_0==41||(LA79_0 >= 51 && LA79_0 <= 53)||LA79_0==58||LA79_0==66||(LA79_0 >= 70 && LA79_0 <= 71)||LA79_0==76) ) {
						alt79=1;
					}
					} finally {dbg.exitDecision(79);}

					switch (alt79) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:940:3: ruleExpression
							{
							dbg.location(940,3);
							pushFollow(FOLLOW_ruleExpression_in_ruleSlice2852);
							ruleExpression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(79);}
					dbg.location(942,3);
					match(input,55,FOLLOW_55_in_ruleSlice2860); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:944:3: '[' ( ruleExpression )? ':' ruleExpression ':' ruleExpression ']'
					{
					dbg.location(944,3);
					match(input,52,FOLLOW_52_in_ruleSlice2872); if (state.failed) return;dbg.location(945,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:945:3: ( ruleExpression )?
					int alt80=2;
					try { dbg.enterSubRule(80);
					try { dbg.enterDecision(80, decisionCanBacktrack[80]);

					int LA80_0 = input.LA(1);
					if ( (LA80_0==RULE_DECIMALS||LA80_0==RULE_FLOAT_LIT||LA80_0==RULE_ID||LA80_0==RULE_INT_LIT||LA80_0==RULE_MUL||(LA80_0 >= RULE_STRING && LA80_0 <= RULE_UNARY_OP)||LA80_0==41||(LA80_0 >= 51 && LA80_0 <= 53)||LA80_0==58||LA80_0==66||(LA80_0 >= 70 && LA80_0 <= 71)||LA80_0==76) ) {
						alt80=1;
					}
					} finally {dbg.exitDecision(80);}

					switch (alt80) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:945:3: ruleExpression
							{
							dbg.location(945,3);
							pushFollow(FOLLOW_ruleExpression_in_ruleSlice2876);
							ruleExpression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(80);}
					dbg.location(947,3);
					match(input,48,FOLLOW_48_in_ruleSlice2884); if (state.failed) return;dbg.location(948,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleSlice2888);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(949,3);
					match(input,48,FOLLOW_48_in_ruleSlice2892); if (state.failed) return;dbg.location(950,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleSlice2896);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(951,3);
					match(input,55,FOLLOW_55_in_ruleSlice2900); if (state.failed) return;
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
		dbg.location(953, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSlice");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSlice"



	// $ANTLR start "ruleTypeAssertion"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:956:1: ruleTypeAssertion : '.' '(' ruleType ')' ;
	public final void ruleTypeAssertion() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeAssertion");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(956, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:956:18: ( '.' '(' ruleType ')' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:957:2: '.' '(' ruleType ')'
			{
			dbg.location(957,2);
			match(input,46,FOLLOW_46_in_ruleTypeAssertion2913); if (state.failed) return;dbg.location(958,2);
			match(input,41,FOLLOW_41_in_ruleTypeAssertion2916); if (state.failed) return;dbg.location(959,2);
			pushFollow(FOLLOW_ruleType_in_ruleTypeAssertion2919);
			ruleType();
			state._fsp--;
			if (state.failed) return;dbg.location(960,2);
			match(input,42,FOLLOW_42_in_ruleTypeAssertion2922); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(961, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeAssertion");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeAssertion"



	// $ANTLR start "ruleArguments"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:964:1: ruleArguments : '(' ( ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? ) ( '...' )? ( ',' )? )? ')' ;
	public final void ruleArguments() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleArguments");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(964, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:964:14: ( '(' ( ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? ) ( '...' )? ( ',' )? )? ')' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:965:2: '(' ( ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? ) ( '...' )? ( ',' )? )? ')'
			{
			dbg.location(965,2);
			match(input,41,FOLLOW_41_in_ruleArguments2932); if (state.failed) return;dbg.location(966,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:966:2: ( ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? ) ( '...' )? ( ',' )? )?
			int alt86=2;
			try { dbg.enterSubRule(86);
			try { dbg.enterDecision(86, decisionCanBacktrack[86]);

			int LA86_0 = input.LA(1);
			if ( (LA86_0==RULE_DECIMALS||LA86_0==RULE_FLOAT_LIT||LA86_0==RULE_ID||LA86_0==RULE_INT_LIT||LA86_0==RULE_MUL||(LA86_0 >= RULE_STRING && LA86_0 <= RULE_UNARY_OP)||LA86_0==41||(LA86_0 >= 51 && LA86_0 <= 53)||LA86_0==58||LA86_0==66||(LA86_0 >= 70 && LA86_0 <= 71)||LA86_0==76) ) {
				alt86=1;
			}
			} finally {dbg.exitDecision(86);}

			switch (alt86) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:967:3: ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? ) ( '...' )? ( ',' )?
					{
					dbg.location(967,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:967:3: ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? )
					int alt83=2;
					try { dbg.enterSubRule(83);
					try { dbg.enterDecision(83, decisionCanBacktrack[83]);

					switch ( input.LA(1) ) {
					case RULE_DECIMALS:
					case RULE_FLOAT_LIT:
					case RULE_INT_LIT:
					case RULE_STRING:
					case RULE_UNARY_OP:
					case 53:
						{
						alt83=1;
						}
						break;
					case 76:
						{
						int LA83_6 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case 52:
						{
						int LA83_7 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case 71:
						{
						int LA83_8 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case RULE_ID:
						{
						int LA83_9 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case 66:
						{
						int LA83_10 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case 41:
						{
						int LA83_11 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case 70:
						{
						int LA83_12 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case 58:
						{
						int LA83_13 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case 51:
						{
						int LA83_14 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt83=1;
						}
						else if ( (true) ) {
							alt83=2;
						}

						}
						break;
					case RULE_MUL:
						{
						int LA83_15 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
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

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:968:4: ruleExpressionList
							{
							dbg.location(968,4);
							pushFollow(FOLLOW_ruleExpressionList_in_ruleArguments2944);
							ruleExpressionList();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:970:4: ruleType ( ',' ruleExpressionList )?
							{
							dbg.location(970,4);
							pushFollow(FOLLOW_ruleType_in_ruleArguments2958);
							ruleType();
							state._fsp--;
							if (state.failed) return;dbg.location(971,4);
							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:971:4: ( ',' ruleExpressionList )?
							int alt82=2;
							try { dbg.enterSubRule(82);
							try { dbg.enterDecision(82, decisionCanBacktrack[82]);

							int LA82_0 = input.LA(1);
							if ( (LA82_0==44) ) {
								int LA82_1 = input.LA(2);
								if ( (LA82_1==RULE_DECIMALS||LA82_1==RULE_FLOAT_LIT||LA82_1==RULE_ID||LA82_1==RULE_INT_LIT||LA82_1==RULE_MUL||(LA82_1 >= RULE_STRING && LA82_1 <= RULE_UNARY_OP)||LA82_1==41||(LA82_1 >= 51 && LA82_1 <= 53)||LA82_1==58||LA82_1==66||(LA82_1 >= 70 && LA82_1 <= 71)||LA82_1==76) ) {
									alt82=1;
								}
							}
							} finally {dbg.exitDecision(82);}

							switch (alt82) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:972:5: ',' ruleExpressionList
									{
									dbg.location(972,5);
									match(input,44,FOLLOW_44_in_ruleArguments2969); if (state.failed) return;dbg.location(973,5);
									pushFollow(FOLLOW_ruleExpressionList_in_ruleArguments2975);
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
					dbg.location(976,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:976:3: ( '...' )?
					int alt84=2;
					try { dbg.enterSubRule(84);
					try { dbg.enterDecision(84, decisionCanBacktrack[84]);

					int LA84_0 = input.LA(1);
					if ( (LA84_0==47) ) {
						alt84=1;
					}
					} finally {dbg.exitDecision(84);}

					switch (alt84) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:976:3: '...'
							{
							dbg.location(976,3);
							match(input,47,FOLLOW_47_in_ruleArguments2989); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(84);}
					dbg.location(977,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:977:3: ( ',' )?
					int alt85=2;
					try { dbg.enterSubRule(85);
					try { dbg.enterDecision(85, decisionCanBacktrack[85]);

					int LA85_0 = input.LA(1);
					if ( (LA85_0==44) ) {
						alt85=1;
					}
					} finally {dbg.exitDecision(85);}

					switch (alt85) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:977:3: ','
							{
							dbg.location(977,3);
							match(input,44,FOLLOW_44_in_ruleArguments2994); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(85);}

					}
					break;

			}
			} finally {dbg.exitSubRule(86);}
			dbg.location(979,2);
			match(input,42,FOLLOW_42_in_ruleArguments3002); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(980, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleArguments");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleArguments"



	// $ANTLR start "ruleLiteral"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:983:1: ruleLiteral : ( ruleBasicLit | ruleCompositeLit | ruleFunctionLit ) ;
	public final void ruleLiteral() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleLiteral");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(983, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:983:12: ( ( ruleBasicLit | ruleCompositeLit | ruleFunctionLit ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:984:2: ( ruleBasicLit | ruleCompositeLit | ruleFunctionLit )
			{
			dbg.location(984,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:984:2: ( ruleBasicLit | ruleCompositeLit | ruleFunctionLit )
			int alt87=3;
			try { dbg.enterSubRule(87);
			try { dbg.enterDecision(87, decisionCanBacktrack[87]);

			switch ( input.LA(1) ) {
			case RULE_DECIMALS:
			case RULE_FLOAT_LIT:
			case RULE_INT_LIT:
			case RULE_STRING:
			case 53:
				{
				alt87=1;
				}
				break;
			case RULE_ID:
			case 52:
			case 71:
			case 76:
				{
				alt87=2;
				}
				break;
			case 66:
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:985:3: ruleBasicLit
					{
					dbg.location(985,3);
					pushFollow(FOLLOW_ruleBasicLit_in_ruleLiteral3016);
					ruleBasicLit();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:987:3: ruleCompositeLit
					{
					dbg.location(987,3);
					pushFollow(FOLLOW_ruleCompositeLit_in_ruleLiteral3028);
					ruleCompositeLit();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:989:3: ruleFunctionLit
					{
					dbg.location(989,3);
					pushFollow(FOLLOW_ruleFunctionLit_in_ruleLiteral3040);
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
		dbg.location(991, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleLiteral");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleLiteral"



	// $ANTLR start "ruleFunctionLit"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:994:1: ruleFunctionLit : 'func' ruleSignature ruleFunctionBody ;
	public final void ruleFunctionLit() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFunctionLit");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(994, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:994:16: ( 'func' ruleSignature ruleFunctionBody )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:995:2: 'func' ruleSignature ruleFunctionBody
			{
			dbg.location(995,2);
			match(input,66,FOLLOW_66_in_ruleFunctionLit3053); if (state.failed) return;dbg.location(996,2);
			pushFollow(FOLLOW_ruleSignature_in_ruleFunctionLit3056);
			ruleSignature();
			state._fsp--;
			if (state.failed) return;dbg.location(997,2);
			pushFollow(FOLLOW_ruleFunctionBody_in_ruleFunctionLit3059);
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
		dbg.location(998, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFunctionLit");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFunctionLit"



	// $ANTLR start "ruleCompositeLit"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1001:1: ruleCompositeLit : ruleLiteralType ruleLiteralValue ;
	public final void ruleCompositeLit() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleCompositeLit");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1001, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1001:17: ( ruleLiteralType ruleLiteralValue )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1002:2: ruleLiteralType ruleLiteralValue
			{
			dbg.location(1002,2);
			pushFollow(FOLLOW_ruleLiteralType_in_ruleCompositeLit3069);
			ruleLiteralType();
			state._fsp--;
			if (state.failed) return;dbg.location(1003,2);
			pushFollow(FOLLOW_ruleLiteralValue_in_ruleCompositeLit3072);
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
		dbg.location(1004, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleCompositeLit");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleCompositeLit"



	// $ANTLR start "ruleLiteralType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1007:1: ruleLiteralType : ( ruleStructType | ruleArrayType | '[' '...' ']' ruleElementType | ruleSliceType | ruleMapType | ruleTypeName ) ;
	public final void ruleLiteralType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleLiteralType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1007, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1007:16: ( ( ruleStructType | ruleArrayType | '[' '...' ']' ruleElementType | ruleSliceType | ruleMapType | ruleTypeName ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1008:2: ( ruleStructType | ruleArrayType | '[' '...' ']' ruleElementType | ruleSliceType | ruleMapType | ruleTypeName )
			{
			dbg.location(1008,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1008:2: ( ruleStructType | ruleArrayType | '[' '...' ']' ruleElementType | ruleSliceType | ruleMapType | ruleTypeName )
			int alt88=6;
			try { dbg.enterSubRule(88);
			try { dbg.enterDecision(88, decisionCanBacktrack[88]);

			switch ( input.LA(1) ) {
			case 76:
				{
				alt88=1;
				}
				break;
			case 52:
				{
				switch ( input.LA(2) ) {
				case 47:
					{
					alt88=3;
					}
					break;
				case 55:
					{
					alt88=4;
					}
					break;
				case RULE_DECIMALS:
				case RULE_FLOAT_LIT:
				case RULE_ID:
				case RULE_INT_LIT:
				case RULE_MUL:
				case RULE_STRING:
				case RULE_UNARY_OP:
				case 41:
				case 51:
				case 52:
				case 53:
				case 58:
				case 66:
				case 70:
				case 71:
				case 76:
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
			case 71:
				{
				alt88=5;
				}
				break;
			case RULE_ID:
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1009:3: ruleStructType
					{
					dbg.location(1009,3);
					pushFollow(FOLLOW_ruleStructType_in_ruleLiteralType3086);
					ruleStructType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1011:3: ruleArrayType
					{
					dbg.location(1011,3);
					pushFollow(FOLLOW_ruleArrayType_in_ruleLiteralType3098);
					ruleArrayType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1013:3: '[' '...' ']' ruleElementType
					{
					dbg.location(1013,3);
					match(input,52,FOLLOW_52_in_ruleLiteralType3110); if (state.failed) return;dbg.location(1014,3);
					match(input,47,FOLLOW_47_in_ruleLiteralType3114); if (state.failed) return;dbg.location(1015,3);
					match(input,55,FOLLOW_55_in_ruleLiteralType3118); if (state.failed) return;dbg.location(1016,3);
					pushFollow(FOLLOW_ruleElementType_in_ruleLiteralType3122);
					ruleElementType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1018:3: ruleSliceType
					{
					dbg.location(1018,3);
					pushFollow(FOLLOW_ruleSliceType_in_ruleLiteralType3134);
					ruleSliceType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1020:3: ruleMapType
					{
					dbg.location(1020,3);
					pushFollow(FOLLOW_ruleMapType_in_ruleLiteralType3146);
					ruleMapType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1022:3: ruleTypeName
					{
					dbg.location(1022,3);
					pushFollow(FOLLOW_ruleTypeName_in_ruleLiteralType3158);
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
		dbg.location(1024, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleLiteralType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleLiteralType"



	// $ANTLR start "ruleLiteralValue"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1027:1: ruleLiteralValue : '{' ( ruleElementList ( ',' )? )? '}' ;
	public final void ruleLiteralValue() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleLiteralValue");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1027, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1027:17: ( '{' ( ruleElementList ( ',' )? )? '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1028:2: '{' ( ruleElementList ( ',' )? )? '}'
			{
			dbg.location(1028,2);
			match(input,80,FOLLOW_80_in_ruleLiteralValue3171); if (state.failed) return;dbg.location(1029,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1029:2: ( ruleElementList ( ',' )? )?
			int alt90=2;
			try { dbg.enterSubRule(90);
			try { dbg.enterDecision(90, decisionCanBacktrack[90]);

			int LA90_0 = input.LA(1);
			if ( (LA90_0==RULE_DECIMALS||LA90_0==RULE_FLOAT_LIT||LA90_0==RULE_ID||LA90_0==RULE_INT_LIT||LA90_0==RULE_MUL||(LA90_0 >= RULE_STRING && LA90_0 <= RULE_UNARY_OP)||LA90_0==41||(LA90_0 >= 51 && LA90_0 <= 53)||LA90_0==58||LA90_0==66||(LA90_0 >= 70 && LA90_0 <= 71)||LA90_0==76||LA90_0==80) ) {
				alt90=1;
			}
			} finally {dbg.exitDecision(90);}

			switch (alt90) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1030:3: ruleElementList ( ',' )?
					{
					dbg.location(1030,3);
					pushFollow(FOLLOW_ruleElementList_in_ruleLiteralValue3178);
					ruleElementList();
					state._fsp--;
					if (state.failed) return;dbg.location(1031,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1031:3: ( ',' )?
					int alt89=2;
					try { dbg.enterSubRule(89);
					try { dbg.enterDecision(89, decisionCanBacktrack[89]);

					int LA89_0 = input.LA(1);
					if ( (LA89_0==44) ) {
						alt89=1;
					}
					} finally {dbg.exitDecision(89);}

					switch (alt89) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1031:3: ','
							{
							dbg.location(1031,3);
							match(input,44,FOLLOW_44_in_ruleLiteralValue3182); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(89);}

					}
					break;

			}
			} finally {dbg.exitSubRule(90);}
			dbg.location(1033,2);
			match(input,81,FOLLOW_81_in_ruleLiteralValue3190); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1034, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleLiteralValue");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleLiteralValue"



	// $ANTLR start "ruleElementList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1037:1: ruleElementList : ruleKeyedElement ( ( ',' )? ruleKeyedElement )* ;
	public final void ruleElementList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleElementList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1037, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1037:16: ( ruleKeyedElement ( ( ',' )? ruleKeyedElement )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1038:2: ruleKeyedElement ( ( ',' )? ruleKeyedElement )*
			{
			dbg.location(1038,2);
			pushFollow(FOLLOW_ruleKeyedElement_in_ruleElementList3200);
			ruleKeyedElement();
			state._fsp--;
			if (state.failed) return;dbg.location(1039,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1039:2: ( ( ',' )? ruleKeyedElement )*
			try { dbg.enterSubRule(92);

			loop92:
			while (true) {
				int alt92=2;
				try { dbg.enterDecision(92, decisionCanBacktrack[92]);

				int LA92_0 = input.LA(1);
				if ( (LA92_0==44) ) {
					int LA92_1 = input.LA(2);
					if ( (LA92_1==RULE_DECIMALS||LA92_1==RULE_FLOAT_LIT||LA92_1==RULE_ID||LA92_1==RULE_INT_LIT||LA92_1==RULE_MUL||(LA92_1 >= RULE_STRING && LA92_1 <= RULE_UNARY_OP)||LA92_1==41||(LA92_1 >= 51 && LA92_1 <= 53)||LA92_1==58||LA92_1==66||(LA92_1 >= 70 && LA92_1 <= 71)||LA92_1==76||LA92_1==80) ) {
						alt92=1;
					}

				}
				else if ( (LA92_0==RULE_DECIMALS||LA92_0==RULE_FLOAT_LIT||LA92_0==RULE_ID||LA92_0==RULE_INT_LIT||LA92_0==RULE_MUL||(LA92_0 >= RULE_STRING && LA92_0 <= RULE_UNARY_OP)||LA92_0==41||(LA92_0 >= 51 && LA92_0 <= 53)||LA92_0==58||LA92_0==66||(LA92_0 >= 70 && LA92_0 <= 71)||LA92_0==76||LA92_0==80) ) {
					alt92=1;
				}

				} finally {dbg.exitDecision(92);}

				switch (alt92) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1040:3: ( ',' )? ruleKeyedElement
					{
					dbg.location(1040,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1040:3: ( ',' )?
					int alt91=2;
					try { dbg.enterSubRule(91);
					try { dbg.enterDecision(91, decisionCanBacktrack[91]);

					int LA91_0 = input.LA(1);
					if ( (LA91_0==44) ) {
						alt91=1;
					}
					} finally {dbg.exitDecision(91);}

					switch (alt91) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1040:3: ','
							{
							dbg.location(1040,3);
							match(input,44,FOLLOW_44_in_ruleElementList3207); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(91);}
					dbg.location(1041,3);
					pushFollow(FOLLOW_ruleKeyedElement_in_ruleElementList3212);
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
		dbg.location(1043, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleElementList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleElementList"



	// $ANTLR start "ruleKeyedElement"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1046:1: ruleKeyedElement : ( ruleKey ':' )? ruleElement ;
	public final void ruleKeyedElement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleKeyedElement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1046, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1046:17: ( ( ruleKey ':' )? ruleElement )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1047:2: ( ruleKey ':' )? ruleElement
			{
			dbg.location(1047,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1047:2: ( ruleKey ':' )?
			int alt93=2;
			try { dbg.enterSubRule(93);
			try { dbg.enterDecision(93, decisionCanBacktrack[93]);

			switch ( input.LA(1) ) {
				case RULE_ID:
					{
					int LA93_1 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case RULE_INT_LIT:
					{
					int LA93_2 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA93_3 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA93_4 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 53:
					{
					int LA93_5 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA93_6 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 76:
					{
					int LA93_7 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 52:
					{
					int LA93_8 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 71:
					{
					int LA93_9 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 66:
					{
					int LA93_10 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 41:
					{
					int LA93_11 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 70:
					{
					int LA93_12 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 58:
					{
					int LA93_13 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 51:
					{
					int LA93_14 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case RULE_MUL:
					{
					int LA93_15 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA93_16 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
				case 80:
					{
					int LA93_17 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt93=1;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(93);}

			switch (alt93) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1048:3: ruleKey ':'
					{
					dbg.location(1048,3);
					pushFollow(FOLLOW_ruleKey_in_ruleKeyedElement3230);
					ruleKey();
					state._fsp--;
					if (state.failed) return;dbg.location(1049,3);
					match(input,48,FOLLOW_48_in_ruleKeyedElement3234); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(93);}
			dbg.location(1051,2);
			pushFollow(FOLLOW_ruleElement_in_ruleKeyedElement3241);
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
		dbg.location(1052, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleKeyedElement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleKeyedElement"



	// $ANTLR start "ruleKey"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1055:1: ruleKey : ( ruleFieldName | ruleExpression | ruleLiteralValue ) ;
	public final void ruleKey() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleKey");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1055, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1055:8: ( ( ruleFieldName | ruleExpression | ruleLiteralValue ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1056:2: ( ruleFieldName | ruleExpression | ruleLiteralValue )
			{
			dbg.location(1056,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1056:2: ( ruleFieldName | ruleExpression | ruleLiteralValue )
			int alt94=3;
			try { dbg.enterSubRule(94);
			try { dbg.enterDecision(94, decisionCanBacktrack[94]);

			switch ( input.LA(1) ) {
			case RULE_ID:
				{
				int LA94_1 = input.LA(2);
				if ( (synpred138_DebugInternalGo()) ) {
					alt94=1;
				}
				else if ( (synpred139_DebugInternalGo()) ) {
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
			case RULE_MUL:
			case RULE_STRING:
			case RULE_UNARY_OP:
			case 41:
			case 51:
			case 52:
			case 53:
			case 58:
			case 66:
			case 70:
			case 71:
			case 76:
				{
				alt94=2;
				}
				break;
			case 80:
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1057:3: ruleFieldName
					{
					dbg.location(1057,3);
					pushFollow(FOLLOW_ruleFieldName_in_ruleKey3255);
					ruleFieldName();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1059:3: ruleExpression
					{
					dbg.location(1059,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleKey3267);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1061:3: ruleLiteralValue
					{
					dbg.location(1061,3);
					pushFollow(FOLLOW_ruleLiteralValue_in_ruleKey3279);
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
		dbg.location(1063, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleKey");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleKey"



	// $ANTLR start "ruleFieldName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1066:1: ruleFieldName : ruleIDENTIFIER ;
	public final void ruleFieldName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFieldName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1066, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1066:14: ( ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1067:2: ruleIDENTIFIER
			{
			dbg.location(1067,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleFieldName3292);
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
		dbg.location(1068, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFieldName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFieldName"



	// $ANTLR start "ruleElement"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1071:1: ruleElement : ( ruleExpression | ruleLiteralValue ) ;
	public final void ruleElement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleElement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1071, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1071:12: ( ( ruleExpression | ruleLiteralValue ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1072:2: ( ruleExpression | ruleLiteralValue )
			{
			dbg.location(1072,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1072:2: ( ruleExpression | ruleLiteralValue )
			int alt95=2;
			try { dbg.enterSubRule(95);
			try { dbg.enterDecision(95, decisionCanBacktrack[95]);

			int LA95_0 = input.LA(1);
			if ( (LA95_0==RULE_DECIMALS||LA95_0==RULE_FLOAT_LIT||LA95_0==RULE_ID||LA95_0==RULE_INT_LIT||LA95_0==RULE_MUL||(LA95_0 >= RULE_STRING && LA95_0 <= RULE_UNARY_OP)||LA95_0==41||(LA95_0 >= 51 && LA95_0 <= 53)||LA95_0==58||LA95_0==66||(LA95_0 >= 70 && LA95_0 <= 71)||LA95_0==76) ) {
				alt95=1;
			}
			else if ( (LA95_0==80) ) {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1073:3: ruleExpression
					{
					dbg.location(1073,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleElement3306);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1075:3: ruleLiteralValue
					{
					dbg.location(1075,3);
					pushFollow(FOLLOW_ruleLiteralValue_in_ruleElement3318);
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
		dbg.location(1077, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleElement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleElement"



	// $ANTLR start "ruleBasicLit"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1080:1: ruleBasicLit : ( RULE_INT_LIT | RULE_FLOAT_LIT | ruleIMAGINARY_LIT | ruleRUNE_LIT | RULE_STRING ) ;
	public final void ruleBasicLit() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleBasicLit");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1080, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1080:13: ( ( RULE_INT_LIT | RULE_FLOAT_LIT | ruleIMAGINARY_LIT | ruleRUNE_LIT | RULE_STRING ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1081:2: ( RULE_INT_LIT | RULE_FLOAT_LIT | ruleIMAGINARY_LIT | ruleRUNE_LIT | RULE_STRING )
			{
			dbg.location(1081,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1081:2: ( RULE_INT_LIT | RULE_FLOAT_LIT | ruleIMAGINARY_LIT | ruleRUNE_LIT | RULE_STRING )
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
				if ( (LA96_2==54) ) {
					alt96=3;
				}
				else if ( (LA96_2==EOF||LA96_2==RULE_ASSING_OP||LA96_2==RULE_BINARY_OP||LA96_2==RULE_DECIMALS||LA96_2==RULE_EQUALS||LA96_2==RULE_FLOAT_LIT||LA96_2==RULE_ID||LA96_2==RULE_INT_LIT||LA96_2==RULE_MUL||(LA96_2 >= RULE_STRING && LA96_2 <= RULE_UNARY_OP)||(LA96_2 >= 41 && LA96_2 <= 48)||(LA96_2 >= 50 && LA96_2 <= 53)||(LA96_2 >= 55 && LA96_2 <= 62)||(LA96_2 >= 64 && LA96_2 <= 68)||(LA96_2 >= 70 && LA96_2 <= 71)||(LA96_2 >= 74 && LA96_2 <= 81)) ) {
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
			case 53:
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1082:3: RULE_INT_LIT
					{
					dbg.location(1082,3);
					match(input,RULE_INT_LIT,FOLLOW_RULE_INT_LIT_in_ruleBasicLit3335); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1084:3: RULE_FLOAT_LIT
					{
					dbg.location(1084,3);
					match(input,RULE_FLOAT_LIT,FOLLOW_RULE_FLOAT_LIT_in_ruleBasicLit3347); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1086:3: ruleIMAGINARY_LIT
					{
					dbg.location(1086,3);
					pushFollow(FOLLOW_ruleIMAGINARY_LIT_in_ruleBasicLit3359);
					ruleIMAGINARY_LIT();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1088:3: ruleRUNE_LIT
					{
					dbg.location(1088,3);
					pushFollow(FOLLOW_ruleRUNE_LIT_in_ruleBasicLit3371);
					ruleRUNE_LIT();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1090:3: RULE_STRING
					{
					dbg.location(1090,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBasicLit3383); if (state.failed) return;
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
		dbg.location(1092, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleBasicLit");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleBasicLit"



	// $ANTLR start "ruleReceiverType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1095:1: ruleReceiverType : ruleType ;
	public final void ruleReceiverType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleReceiverType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1095, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1095:17: ( ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1096:2: ruleType
			{
			dbg.location(1096,2);
			pushFollow(FOLLOW_ruleType_in_ruleReceiverType3396);
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
		dbg.location(1097, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleReceiverType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleReceiverType"



	// $ANTLR start "ruleFunctionBody"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1100:1: ruleFunctionBody : ruleBlock ;
	public final void ruleFunctionBody() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFunctionBody");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1100, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1100:17: ( ruleBlock )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1101:2: ruleBlock
			{
			dbg.location(1101,2);
			pushFollow(FOLLOW_ruleBlock_in_ruleFunctionBody3406);
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
		dbg.location(1102, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFunctionBody");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFunctionBody"



	// $ANTLR start "ruleOperandName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1105:1: ruleOperandName : ( ruleIDENTIFIER | ruleQualifiedIdent ) ;
	public final void ruleOperandName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleOperandName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1105, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1105:16: ( ( ruleIDENTIFIER | ruleQualifiedIdent ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1106:2: ( ruleIDENTIFIER | ruleQualifiedIdent )
			{
			dbg.location(1106,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1106:2: ( ruleIDENTIFIER | ruleQualifiedIdent )
			int alt97=2;
			try { dbg.enterSubRule(97);
			try { dbg.enterDecision(97, decisionCanBacktrack[97]);

			int LA97_0 = input.LA(1);
			if ( (LA97_0==RULE_ID) ) {
				int LA97_1 = input.LA(2);
				if ( (LA97_1==46) ) {
					int LA97_2 = input.LA(3);
					if ( (LA97_2==41) ) {
						alt97=1;
					}
					else if ( (LA97_2==RULE_ID) ) {
						int LA97_4 = input.LA(4);
						if ( (synpred145_DebugInternalGo()) ) {
							alt97=1;
						}
						else if ( (true) ) {
							alt97=2;
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 97, 2, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA97_1==EOF||LA97_1==RULE_ASSING_OP||LA97_1==RULE_BINARY_OP||LA97_1==RULE_DECIMALS||LA97_1==RULE_EQUALS||LA97_1==RULE_FLOAT_LIT||LA97_1==RULE_ID||LA97_1==RULE_INT_LIT||LA97_1==RULE_MUL||(LA97_1 >= RULE_STRING && LA97_1 <= RULE_UNARY_OP)||(LA97_1 >= 41 && LA97_1 <= 45)||(LA97_1 >= 47 && LA97_1 <= 48)||(LA97_1 >= 50 && LA97_1 <= 53)||(LA97_1 >= 55 && LA97_1 <= 62)||(LA97_1 >= 64 && LA97_1 <= 68)||(LA97_1 >= 70 && LA97_1 <= 71)||(LA97_1 >= 74 && LA97_1 <= 81)) ) {
					alt97=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 97, 1, input);
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
					new NoViableAltException("", 97, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(97);}

			switch (alt97) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1107:3: ruleIDENTIFIER
					{
					dbg.location(1107,3);
					pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleOperandName3420);
					ruleIDENTIFIER();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1109:3: ruleQualifiedIdent
					{
					dbg.location(1109,3);
					pushFollow(FOLLOW_ruleQualifiedIdent_in_ruleOperandName3432);
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
		dbg.location(1111, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleOperandName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleOperandName"



	// $ANTLR start "ruleImportDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1114:1: ruleImportDecl : 'import' ( ruleImportSpec | '(' ( ruleImportSpec )* ')' ) ;
	public final void ruleImportDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleImportDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1114, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1114:15: ( 'import' ( ruleImportSpec | '(' ( ruleImportSpec )* ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1115:2: 'import' ( ruleImportSpec | '(' ( ruleImportSpec )* ')' )
			{
			dbg.location(1115,2);
			match(input,69,FOLLOW_69_in_ruleImportDecl3445); if (state.failed) return;dbg.location(1116,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1116:2: ( ruleImportSpec | '(' ( ruleImportSpec )* ')' )
			int alt99=2;
			try { dbg.enterSubRule(99);
			try { dbg.enterDecision(99, decisionCanBacktrack[99]);

			int LA99_0 = input.LA(1);
			if ( (LA99_0==RULE_ID||LA99_0==RULE_STRING||LA99_0==46) ) {
				alt99=1;
			}
			else if ( (LA99_0==41) ) {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1117:3: ruleImportSpec
					{
					dbg.location(1117,3);
					pushFollow(FOLLOW_ruleImportSpec_in_ruleImportDecl3452);
					ruleImportSpec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1119:3: '(' ( ruleImportSpec )* ')'
					{
					dbg.location(1119,3);
					match(input,41,FOLLOW_41_in_ruleImportDecl3464); if (state.failed) return;dbg.location(1120,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1120:3: ( ruleImportSpec )*
					try { dbg.enterSubRule(98);

					loop98:
					while (true) {
						int alt98=2;
						try { dbg.enterDecision(98, decisionCanBacktrack[98]);

						int LA98_0 = input.LA(1);
						if ( (LA98_0==RULE_ID||LA98_0==RULE_STRING||LA98_0==46) ) {
							alt98=1;
						}

						} finally {dbg.exitDecision(98);}

						switch (alt98) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1120:3: ruleImportSpec
							{
							dbg.location(1120,3);
							pushFollow(FOLLOW_ruleImportSpec_in_ruleImportDecl3468);
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
					dbg.location(1122,3);
					match(input,42,FOLLOW_42_in_ruleImportDecl3476); if (state.failed) return;
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
		dbg.location(1124, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleImportDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleImportDecl"



	// $ANTLR start "ruleImportSpec"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1127:1: ruleImportSpec : ( '.' | ruleIDENTIFIER )? ruleImportPath ;
	public final void ruleImportSpec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleImportSpec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1127, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1127:15: ( ( '.' | ruleIDENTIFIER )? ruleImportPath )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1128:2: ( '.' | ruleIDENTIFIER )? ruleImportPath
			{
			dbg.location(1128,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1128:2: ( '.' | ruleIDENTIFIER )?
			int alt100=3;
			try { dbg.enterSubRule(100);
			try { dbg.enterDecision(100, decisionCanBacktrack[100]);

			int LA100_0 = input.LA(1);
			if ( (LA100_0==46) ) {
				alt100=1;
			}
			else if ( (LA100_0==RULE_ID) ) {
				alt100=2;
			}
			} finally {dbg.exitDecision(100);}

			switch (alt100) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1129:3: '.'
					{
					dbg.location(1129,3);
					match(input,46,FOLLOW_46_in_ruleImportSpec3493); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1131:3: ruleIDENTIFIER
					{
					dbg.location(1131,3);
					pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleImportSpec3505);
					ruleIDENTIFIER();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(100);}
			dbg.location(1133,2);
			pushFollow(FOLLOW_ruleImportPath_in_ruleImportSpec3512);
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
		dbg.location(1134, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleImportSpec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleImportSpec"



	// $ANTLR start "ruleImportPath"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1137:1: ruleImportPath : RULE_STRING ;
	public final void ruleImportPath() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleImportPath");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1137, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1137:15: ( RULE_STRING )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1138:2: RULE_STRING
			{
			dbg.location(1138,2);
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImportPath3522); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1139, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleImportPath");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleImportPath"

	// $ANTLR start synpred13_DebugInternalGo
	public final void synpred13_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:119:3: ( ruleIDENTIFIER )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:119:3: ruleIDENTIFIER
		{
		dbg.location(119,3);
		pushFollow(FOLLOW_ruleIDENTIFIER_in_synpred13_DebugInternalGo343);
		ruleIDENTIFIER();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred13_DebugInternalGo

	// $ANTLR start synpred23_DebugInternalGo
	public final void synpred23_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:197:3: ( ruleIdentifierList ruleType )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:197:3: ruleIdentifierList ruleType
		{
		dbg.location(197,3);
		pushFollow(FOLLOW_ruleIdentifierList_in_synpred23_DebugInternalGo586);
		ruleIdentifierList();
		state._fsp--;
		if (state.failed) return;dbg.location(198,3);
		pushFollow(FOLLOW_ruleType_in_synpred23_DebugInternalGo590);
		ruleType();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred23_DebugInternalGo

	// $ANTLR start synpred25_DebugInternalGo
	public final void synpred25_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:210:3: ( ',' ruleIDENTIFIER )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:210:3: ',' ruleIDENTIFIER
		{
		dbg.location(210,3);
		match(input,44,FOLLOW_44_in_synpred25_DebugInternalGo628); if (state.failed) return;dbg.location(211,3);
		pushFollow(FOLLOW_ruleIDENTIFIER_in_synpred25_DebugInternalGo632);
		ruleIDENTIFIER();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred25_DebugInternalGo

	// $ANTLR start synpred27_DebugInternalGo
	public final void synpred27_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:246:2: ( ruleResult )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:246:2: ruleResult
		{
		dbg.location(246,2);
		pushFollow(FOLLOW_ruleResult_in_synpred27_DebugInternalGo709);
		ruleResult();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred27_DebugInternalGo

	// $ANTLR start synpred28_DebugInternalGo
	public final void synpred28_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:253:3: ( ruleParameters )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:253:3: ruleParameters
		{
		dbg.location(253,3);
		pushFollow(FOLLOW_ruleParameters_in_synpred28_DebugInternalGo726);
		ruleParameters();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred28_DebugInternalGo

	// $ANTLR start synpred29_DebugInternalGo
	public final void synpred29_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:262:2: ( ruleParameterList )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:262:2: ruleParameterList
		{
		dbg.location(262,2);
		pushFollow(FOLLOW_ruleParameterList_in_synpred29_DebugInternalGo754);
		ruleParameterList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred29_DebugInternalGo

	// $ANTLR start synpred31_DebugInternalGo
	public final void synpred31_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:278:2: ( ruleIdentifierList )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:278:2: ruleIdentifierList
		{
		dbg.location(278,2);
		pushFollow(FOLLOW_ruleIdentifierList_in_synpred31_DebugInternalGo795);
		ruleIdentifierList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred31_DebugInternalGo

	// $ANTLR start synpred36_DebugInternalGo
	public final void synpred36_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:334:3: ( '<-' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:334:3: '<-'
		{
		dbg.location(334,3);
		match(input,51,FOLLOW_51_in_synpred36_DebugInternalGo942); if (state.failed) return;
		}

	}
	// $ANTLR end synpred36_DebugInternalGo

	// $ANTLR start synpred38_DebugInternalGo
	public final void synpred38_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:353:3: ( ';' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:353:3: ';'
		{
		dbg.location(353,3);
		match(input,50,FOLLOW_50_in_synpred38_DebugInternalGo999); if (state.failed) return;
		}

	}
	// $ANTLR end synpred38_DebugInternalGo

	// $ANTLR start synpred43_DebugInternalGo
	public final void synpred43_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:366:3: ( ruleGoStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:366:3: ruleGoStmt
		{
		dbg.location(366,3);
		pushFollow(FOLLOW_ruleGoStmt_in_synpred43_DebugInternalGo1054);
		ruleGoStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred43_DebugInternalGo

	// $ANTLR start synpred47_DebugInternalGo
	public final void synpred47_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:374:3: ( ruleGotoStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:374:3: ruleGotoStmt
		{
		dbg.location(374,3);
		pushFollow(FOLLOW_ruleGotoStmt_in_synpred47_DebugInternalGo1102);
		ruleGotoStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred47_DebugInternalGo

	// $ANTLR start synpred56_DebugInternalGo
	public final void synpred56_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:413:3: ( ruleIncDecStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:413:3: ruleIncDecStmt
		{
		dbg.location(413,3);
		pushFollow(FOLLOW_ruleIncDecStmt_in_synpred56_DebugInternalGo1260);
		ruleIncDecStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred56_DebugInternalGo

	// $ANTLR start synpred57_DebugInternalGo
	public final void synpred57_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:415:3: ( ruleAssignment )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:415:3: ruleAssignment
		{
		dbg.location(415,3);
		pushFollow(FOLLOW_ruleAssignment_in_synpred57_DebugInternalGo1272);
		ruleAssignment();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred57_DebugInternalGo

	// $ANTLR start synpred58_DebugInternalGo
	public final void synpred58_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:417:3: ( ruleSendStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:417:3: ruleSendStmt
		{
		dbg.location(417,3);
		pushFollow(FOLLOW_ruleSendStmt_in_synpred58_DebugInternalGo1284);
		ruleSendStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred58_DebugInternalGo

	// $ANTLR start synpred59_DebugInternalGo
	public final void synpred59_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:419:3: ( ruleShortVarDecl )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:419:3: ruleShortVarDecl
		{
		dbg.location(419,3);
		pushFollow(FOLLOW_ruleShortVarDecl_in_synpred59_DebugInternalGo1296);
		ruleShortVarDecl();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred59_DebugInternalGo

	// $ANTLR start synpred60_DebugInternalGo
	public final void synpred60_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:421:3: ( ruleExpressionStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:421:3: ruleExpressionStmt
		{
		dbg.location(421,3);
		pushFollow(FOLLOW_ruleExpressionStmt_in_synpred60_DebugInternalGo1308);
		ruleExpressionStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred60_DebugInternalGo

	// $ANTLR start synpred61_DebugInternalGo
	public final void synpred61_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:436:2: ( ruleExpressionList )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:436:2: ruleExpressionList
		{
		dbg.location(436,2);
		pushFollow(FOLLOW_ruleExpressionList_in_synpred61_DebugInternalGo1349);
		ruleExpressionList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred61_DebugInternalGo

	// $ANTLR start synpred62_DebugInternalGo
	public final void synpred62_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:443:2: ( ruleLabel )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:443:2: ruleLabel
		{
		dbg.location(443,2);
		pushFollow(FOLLOW_ruleLabel_in_synpred62_DebugInternalGo1365);
		ruleLabel();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred62_DebugInternalGo

	// $ANTLR start synpred63_DebugInternalGo
	public final void synpred63_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:449:2: ( ruleLabel )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:449:2: ruleLabel
		{
		dbg.location(449,2);
		pushFollow(FOLLOW_ruleLabel_in_synpred63_DebugInternalGo1379);
		ruleLabel();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred63_DebugInternalGo

	// $ANTLR start synpred64_DebugInternalGo
	public final void synpred64_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:462:3: ( ruleSimpleStmt ';' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:462:3: ruleSimpleStmt ';'
		{
		dbg.location(462,3);
		pushFollow(FOLLOW_ruleSimpleStmt_in_synpred64_DebugInternalGo1410);
		ruleSimpleStmt();
		state._fsp--;
		if (state.failed) return;dbg.location(463,3);
		match(input,50,FOLLOW_50_in_synpred64_DebugInternalGo1414); if (state.failed) return;
		}

	}
	// $ANTLR end synpred64_DebugInternalGo

	// $ANTLR start synpred67_DebugInternalGo
	public final void synpred67_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:485:3: ( ruleExprSwitchStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:485:3: ruleExprSwitchStmt
		{
		dbg.location(485,3);
		pushFollow(FOLLOW_ruleExprSwitchStmt_in_synpred67_DebugInternalGo1486);
		ruleExprSwitchStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred67_DebugInternalGo

	// $ANTLR start synpred69_DebugInternalGo
	public final void synpred69_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:504:3: ( ruleCondition )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:504:3: ruleCondition
		{
		dbg.location(504,3);
		pushFollow(FOLLOW_ruleCondition_in_synpred69_DebugInternalGo1540);
		ruleCondition();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred69_DebugInternalGo

	// $ANTLR start synpred70_DebugInternalGo
	public final void synpred70_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:506:3: ( ruleForClause )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:506:3: ruleForClause
		{
		dbg.location(506,3);
		pushFollow(FOLLOW_ruleForClause_in_synpred70_DebugInternalGo1552);
		ruleForClause();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred70_DebugInternalGo

	// $ANTLR start synpred71_DebugInternalGo
	public final void synpred71_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:508:3: ( ruleRangeClause )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:508:3: ruleRangeClause
		{
		dbg.location(508,3);
		pushFollow(FOLLOW_ruleRangeClause_in_synpred71_DebugInternalGo1564);
		ruleRangeClause();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred71_DebugInternalGo

	// $ANTLR start synpred76_DebugInternalGo
	public final void synpred76_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:538:3: ( ( ruleType )? '=' ruleExpressionList )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:538:3: ( ruleType )? '=' ruleExpressionList
		{
		dbg.location(538,3);
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:538:3: ( ruleType )?
		int alt108=2;
		try { dbg.enterSubRule(108);
		try { dbg.enterDecision(108, decisionCanBacktrack[108]);

		int LA108_0 = input.LA(1);
		if ( (LA108_0==RULE_ID||LA108_0==RULE_MUL||LA108_0==41||(LA108_0 >= 51 && LA108_0 <= 52)||LA108_0==58||LA108_0==66||(LA108_0 >= 70 && LA108_0 <= 71)||LA108_0==76) ) {
			alt108=1;
		}
		} finally {dbg.exitDecision(108);}

		switch (alt108) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:538:3: ruleType
				{
				dbg.location(538,3);
				pushFollow(FOLLOW_ruleType_in_synpred76_DebugInternalGo1657);
				ruleType();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(108);}
		dbg.location(540,3);
		match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_synpred76_DebugInternalGo1665); if (state.failed) return;dbg.location(541,3);
		pushFollow(FOLLOW_ruleExpressionList_in_synpred76_DebugInternalGo1669);
		ruleExpressionList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred76_DebugInternalGo

	// $ANTLR start synpred83_DebugInternalGo
	public final void synpred83_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:600:2: ( ruleType )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:600:2: ruleType
		{
		dbg.location(600,2);
		pushFollow(FOLLOW_ruleType_in_synpred83_DebugInternalGo1855);
		ruleType();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred83_DebugInternalGo

	// $ANTLR start synpred85_DebugInternalGo
	public final void synpred85_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:633:3: ( ruleExpression '++' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:633:3: ruleExpression '++'
		{
		dbg.location(633,3);
		pushFollow(FOLLOW_ruleExpression_in_synpred85_DebugInternalGo1933);
		ruleExpression();
		state._fsp--;
		if (state.failed) return;dbg.location(634,3);
		match(input,43,FOLLOW_43_in_synpred85_DebugInternalGo1937); if (state.failed) return;
		}

	}
	// $ANTLR end synpred85_DebugInternalGo

	// $ANTLR start synpred86_DebugInternalGo
	public final void synpred86_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:659:3: ( ruleSimpleStmt ';' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:659:3: ruleSimpleStmt ';'
		{
		dbg.location(659,3);
		pushFollow(FOLLOW_ruleSimpleStmt_in_synpred86_DebugInternalGo2005);
		ruleSimpleStmt();
		state._fsp--;
		if (state.failed) return;dbg.location(660,3);
		match(input,50,FOLLOW_50_in_synpred86_DebugInternalGo2009); if (state.failed) return;
		}

	}
	// $ANTLR end synpred86_DebugInternalGo

	// $ANTLR start synpred90_DebugInternalGo
	public final void synpred90_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:691:3: ( ruleSimpleStmt ';' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:691:3: ruleSimpleStmt ';'
		{
		dbg.location(691,3);
		pushFollow(FOLLOW_ruleSimpleStmt_in_synpred90_DebugInternalGo2097);
		ruleSimpleStmt();
		state._fsp--;
		if (state.failed) return;dbg.location(692,3);
		match(input,50,FOLLOW_50_in_synpred90_DebugInternalGo2101); if (state.failed) return;
		}

	}
	// $ANTLR end synpred90_DebugInternalGo

	// $ANTLR start synpred95_DebugInternalGo
	public final void synpred95_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:752:4: ( ruleSendStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:752:4: ruleSendStmt
		{
		dbg.location(752,4);
		pushFollow(FOLLOW_ruleSendStmt_in_synpred95_DebugInternalGo2270);
		ruleSendStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred95_DebugInternalGo

	// $ANTLR start synpred97_DebugInternalGo
	public final void synpred97_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:764:3: ( ruleExpressionList '=' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:764:3: ruleExpressionList '='
		{
		dbg.location(764,3);
		pushFollow(FOLLOW_ruleExpressionList_in_synpred97_DebugInternalGo2317);
		ruleExpressionList();
		state._fsp--;
		if (state.failed) return;dbg.location(765,3);
		match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_synpred97_DebugInternalGo2321); if (state.failed) return;
		}

	}
	// $ANTLR end synpred97_DebugInternalGo

	// $ANTLR start synpred98_DebugInternalGo
	public final void synpred98_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:767:3: ( ruleIdentifierList ':=' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:767:3: ruleIdentifierList ':='
		{
		dbg.location(767,3);
		pushFollow(FOLLOW_ruleIdentifierList_in_synpred98_DebugInternalGo2333);
		ruleIdentifierList();
		state._fsp--;
		if (state.failed) return;dbg.location(768,3);
		match(input,49,FOLLOW_49_in_synpred98_DebugInternalGo2337); if (state.failed) return;
		}

	}
	// $ANTLR end synpred98_DebugInternalGo

	// $ANTLR start synpred99_DebugInternalGo
	public final void synpred99_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:785:2: ( ruleInitStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:785:2: ruleInitStmt
		{
		dbg.location(785,2);
		pushFollow(FOLLOW_ruleInitStmt_in_synpred99_DebugInternalGo2374);
		ruleInitStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred99_DebugInternalGo

	// $ANTLR start synpred105_DebugInternalGo
	public final void synpred105_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:841:3: ( RULE_BINARY_OP ruleExpression ruleExpression2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:841:3: RULE_BINARY_OP ruleExpression ruleExpression2
		{
		dbg.location(841,3);
		match(input,RULE_BINARY_OP,FOLLOW_RULE_BINARY_OP_in_synpred105_DebugInternalGo2521); if (state.failed) return;dbg.location(842,3);
		pushFollow(FOLLOW_ruleExpression_in_synpred105_DebugInternalGo2525);
		ruleExpression();
		state._fsp--;
		if (state.failed) return;dbg.location(843,3);
		pushFollow(FOLLOW_ruleExpression2_in_synpred105_DebugInternalGo2529);
		ruleExpression2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred105_DebugInternalGo

	// $ANTLR start synpred107_DebugInternalGo
	public final void synpred107_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:860:3: ( ruleOperand rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:860:3: ruleOperand rulePrimaryExpr2
		{
		dbg.location(860,3);
		pushFollow(FOLLOW_ruleOperand_in_synpred107_DebugInternalGo2580);
		ruleOperand();
		state._fsp--;
		if (state.failed) return;dbg.location(861,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred107_DebugInternalGo2584);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred107_DebugInternalGo

	// $ANTLR start synpred108_DebugInternalGo
	public final void synpred108_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:863:3: ( ruleConversion rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:863:3: ruleConversion rulePrimaryExpr2
		{
		dbg.location(863,3);
		pushFollow(FOLLOW_ruleConversion_in_synpred108_DebugInternalGo2596);
		ruleConversion();
		state._fsp--;
		if (state.failed) return;dbg.location(864,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred108_DebugInternalGo2600);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred108_DebugInternalGo

	// $ANTLR start synpred109_DebugInternalGo
	public final void synpred109_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:874:3: ( ruleSelector rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:874:3: ruleSelector rulePrimaryExpr2
		{
		dbg.location(874,3);
		pushFollow(FOLLOW_ruleSelector_in_synpred109_DebugInternalGo2633);
		ruleSelector();
		state._fsp--;
		if (state.failed) return;dbg.location(875,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred109_DebugInternalGo2637);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred109_DebugInternalGo

	// $ANTLR start synpred110_DebugInternalGo
	public final void synpred110_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:877:3: ( ruleIndex rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:877:3: ruleIndex rulePrimaryExpr2
		{
		dbg.location(877,3);
		pushFollow(FOLLOW_ruleIndex_in_synpred110_DebugInternalGo2649);
		ruleIndex();
		state._fsp--;
		if (state.failed) return;dbg.location(878,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred110_DebugInternalGo2653);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred110_DebugInternalGo

	// $ANTLR start synpred111_DebugInternalGo
	public final void synpred111_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:880:3: ( ruleSlice rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:880:3: ruleSlice rulePrimaryExpr2
		{
		dbg.location(880,3);
		pushFollow(FOLLOW_ruleSlice_in_synpred111_DebugInternalGo2665);
		ruleSlice();
		state._fsp--;
		if (state.failed) return;dbg.location(881,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred111_DebugInternalGo2669);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred111_DebugInternalGo

	// $ANTLR start synpred112_DebugInternalGo
	public final void synpred112_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:883:3: ( ruleTypeAssertion rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:883:3: ruleTypeAssertion rulePrimaryExpr2
		{
		dbg.location(883,3);
		pushFollow(FOLLOW_ruleTypeAssertion_in_synpred112_DebugInternalGo2681);
		ruleTypeAssertion();
		state._fsp--;
		if (state.failed) return;dbg.location(884,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred112_DebugInternalGo2685);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred112_DebugInternalGo

	// $ANTLR start synpred113_DebugInternalGo
	public final void synpred113_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:886:3: ( ruleArguments rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:886:3: ruleArguments rulePrimaryExpr2
		{
		dbg.location(886,3);
		pushFollow(FOLLOW_ruleArguments_in_synpred113_DebugInternalGo2697);
		ruleArguments();
		state._fsp--;
		if (state.failed) return;dbg.location(887,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred113_DebugInternalGo2701);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred113_DebugInternalGo

	// $ANTLR start synpred114_DebugInternalGo
	public final void synpred114_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:894:3: ( ruleLiteral )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:894:3: ruleLiteral
		{
		dbg.location(894,3);
		pushFollow(FOLLOW_ruleLiteral_in_synpred114_DebugInternalGo2719);
		ruleLiteral();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred114_DebugInternalGo

	// $ANTLR start synpred115_DebugInternalGo
	public final void synpred115_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:896:3: ( ruleOperandName )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:896:3: ruleOperandName
		{
		dbg.location(896,3);
		pushFollow(FOLLOW_ruleOperandName_in_synpred115_DebugInternalGo2731);
		ruleOperandName();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred115_DebugInternalGo

	// $ANTLR start synpred119_DebugInternalGo
	public final void synpred119_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:936:3: ( '[' ( ruleExpression )? ':' ( ruleExpression )? ']' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:936:3: '[' ( ruleExpression )? ':' ( ruleExpression )? ']'
		{
		dbg.location(936,3);
		match(input,52,FOLLOW_52_in_synpred119_DebugInternalGo2836); if (state.failed) return;dbg.location(937,3);
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:937:3: ( ruleExpression )?
		int alt111=2;
		try { dbg.enterSubRule(111);
		try { dbg.enterDecision(111, decisionCanBacktrack[111]);

		int LA111_0 = input.LA(1);
		if ( (LA111_0==RULE_DECIMALS||LA111_0==RULE_FLOAT_LIT||LA111_0==RULE_ID||LA111_0==RULE_INT_LIT||LA111_0==RULE_MUL||(LA111_0 >= RULE_STRING && LA111_0 <= RULE_UNARY_OP)||LA111_0==41||(LA111_0 >= 51 && LA111_0 <= 53)||LA111_0==58||LA111_0==66||(LA111_0 >= 70 && LA111_0 <= 71)||LA111_0==76) ) {
			alt111=1;
		}
		} finally {dbg.exitDecision(111);}

		switch (alt111) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:937:3: ruleExpression
				{
				dbg.location(937,3);
				pushFollow(FOLLOW_ruleExpression_in_synpred119_DebugInternalGo2840);
				ruleExpression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(111);}
		dbg.location(939,3);
		match(input,48,FOLLOW_48_in_synpred119_DebugInternalGo2848); if (state.failed) return;dbg.location(940,3);
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:940:3: ( ruleExpression )?
		int alt112=2;
		try { dbg.enterSubRule(112);
		try { dbg.enterDecision(112, decisionCanBacktrack[112]);

		int LA112_0 = input.LA(1);
		if ( (LA112_0==RULE_DECIMALS||LA112_0==RULE_FLOAT_LIT||LA112_0==RULE_ID||LA112_0==RULE_INT_LIT||LA112_0==RULE_MUL||(LA112_0 >= RULE_STRING && LA112_0 <= RULE_UNARY_OP)||LA112_0==41||(LA112_0 >= 51 && LA112_0 <= 53)||LA112_0==58||LA112_0==66||(LA112_0 >= 70 && LA112_0 <= 71)||LA112_0==76) ) {
			alt112=1;
		}
		} finally {dbg.exitDecision(112);}

		switch (alt112) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:940:3: ruleExpression
				{
				dbg.location(940,3);
				pushFollow(FOLLOW_ruleExpression_in_synpred119_DebugInternalGo2852);
				ruleExpression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(112);}
		dbg.location(942,3);
		match(input,55,FOLLOW_55_in_synpred119_DebugInternalGo2860); if (state.failed) return;
		}

	}
	// $ANTLR end synpred119_DebugInternalGo

	// $ANTLR start synpred121_DebugInternalGo
	public final void synpred121_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:968:4: ( ruleExpressionList )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:968:4: ruleExpressionList
		{
		dbg.location(968,4);
		pushFollow(FOLLOW_ruleExpressionList_in_synpred121_DebugInternalGo2944);
		ruleExpressionList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred121_DebugInternalGo

	// $ANTLR start synpred137_DebugInternalGo
	public final void synpred137_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1048:3: ( ruleKey ':' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1048:3: ruleKey ':'
		{
		dbg.location(1048,3);
		pushFollow(FOLLOW_ruleKey_in_synpred137_DebugInternalGo3230);
		ruleKey();
		state._fsp--;
		if (state.failed) return;dbg.location(1049,3);
		match(input,48,FOLLOW_48_in_synpred137_DebugInternalGo3234); if (state.failed) return;
		}

	}
	// $ANTLR end synpred137_DebugInternalGo

	// $ANTLR start synpred138_DebugInternalGo
	public final void synpred138_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1057:3: ( ruleFieldName )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1057:3: ruleFieldName
		{
		dbg.location(1057,3);
		pushFollow(FOLLOW_ruleFieldName_in_synpred138_DebugInternalGo3255);
		ruleFieldName();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred138_DebugInternalGo

	// $ANTLR start synpred139_DebugInternalGo
	public final void synpred139_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1059:3: ( ruleExpression )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1059:3: ruleExpression
		{
		dbg.location(1059,3);
		pushFollow(FOLLOW_ruleExpression_in_synpred139_DebugInternalGo3267);
		ruleExpression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred139_DebugInternalGo

	// $ANTLR start synpred145_DebugInternalGo
	public final void synpred145_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1107:3: ( ruleIDENTIFIER )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1107:3: ruleIDENTIFIER
		{
		dbg.location(1107,3);
		pushFollow(FOLLOW_ruleIDENTIFIER_in_synpred145_DebugInternalGo3420);
		ruleIDENTIFIER();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred145_DebugInternalGo

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
	public final boolean synpred115_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred115_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred36_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred36_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred98_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred98_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred112_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred112_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred64_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred64_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred67_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred67_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred29_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred29_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred105_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred105_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred139_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred139_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred60_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred60_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred63_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred63_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred23_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred23_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred57_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred57_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred38_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred38_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred47_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred47_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred138_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred138_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred95_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred95_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred56_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred56_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred58_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred58_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred27_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred27_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred62_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred62_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred90_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred90_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred86_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred86_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred114_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred114_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred111_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred111_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred145_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred145_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred107_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred107_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred85_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred85_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred28_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred28_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred61_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred61_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred13_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred13_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred113_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred113_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred25_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred25_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred99_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred99_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred31_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred31_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred137_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred137_DebugInternalGo_fragment(); // can never throw exception
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


	protected DFA70 dfa70 = new DFA70(this);
	static final String DFA70_eotS =
		"\7\uffff";
	static final String DFA70_eofS =
		"\7\uffff";
	static final String DFA70_minS =
		"\1\12\1\uffff\1\10\1\uffff\1\12\1\uffff\1\10";
	static final String DFA70_maxS =
		"\1\114\1\uffff\1\120\1\uffff\1\114\1\uffff\1\120";
	static final String DFA70_acceptS =
		"\1\uffff\1\1\1\uffff\1\3\1\uffff\1\2\1\uffff";
	static final String DFA70_specialS =
		"\7\uffff}>";
	static final String[] DFA70_transitionS = {
			"\1\1\5\uffff\1\1\3\uffff\1\2\2\uffff\1\1\2\uffff\1\1\10\uffff\2\1\4\uffff"+
			"\1\1\11\uffff\3\1\4\uffff\1\1\7\uffff\1\1\3\uffff\2\1\1\uffff\1\3\2\uffff"+
			"\1\1",
			"",
			"\1\1\4\uffff\1\1\33\uffff\1\1\2\uffff\1\4\1\uffff\1\1\2\uffff\1\5\2"+
			"\uffff\1\1\33\uffff\1\1",
			"",
			"\1\1\5\uffff\1\1\3\uffff\1\6\2\uffff\1\1\2\uffff\1\1\10\uffff\2\1\4"+
			"\uffff\1\1\11\uffff\3\1\4\uffff\1\1\7\uffff\1\1\3\uffff\2\1\4\uffff\1"+
			"\1",
			"",
			"\1\1\4\uffff\1\1\33\uffff\1\1\2\uffff\1\4\1\uffff\1\1\2\uffff\1\5\2"+
			"\uffff\1\1\33\uffff\1\1"
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
			return "797:2: ( ruleExpressionList '=' | ruleIdentifierList ':=' )?";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_ruleCompilation_initial_in_ruleModel19 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePackageClause_in_ruleCompilation_initial33 = new BitSet(new long[]{0x0800000000000002L,0x000000000000C024L});
	public static final BitSet FOLLOW_ruleImportDecl_in_ruleCompilation_initial37 = new BitSet(new long[]{0x0800000000000002L,0x000000000000C024L});
	public static final BitSet FOLLOW_ruleTopLevelDecl_in_ruleCompilation_initial45 = new BitSet(new long[]{0x0800000000000002L,0x000000000000C004L});
	public static final BitSet FOLLOW_ruleDeclaration_in_ruleTopLevelDecl67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFunctionDecl_in_ruleTopLevelDecl79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleMethodDecl_in_ruleTopLevelDecl91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_ruleMethodDecl104 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ruleReceiver_in_ruleMethodDecl107 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ruleMethodName_in_ruleMethodDecl110 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ruleSignature_in_ruleMethodDecl113 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
	public static final BitSet FOLLOW_ruleFunctionBody_in_ruleMethodDecl116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameters_in_ruleReceiver129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleFunctionName139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_ruleFunctionDecl149 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ruleFunctionName_in_ruleFunctionDecl152 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ruleSignature_in_ruleFunctionDecl155 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
	public static final BitSet FOLLOW_ruleFunctionBody_in_ruleFunctionDecl158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_rulePackageClause171 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_rulePackageName_in_rulePackageClause174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleIDENTIFIER184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_ruleIMAGINARY_LIT194 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_ruleIMAGINARY_LIT216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_ruleRUNE_LIT226 = new BitSet(new long[]{0x0000008000000200L});
	public static final BitSet FOLLOW_set_in_ruleRUNE_LIT229 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_ruleRUNE_LIT251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeName_in_ruleType294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeLit_in_ruleType306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleType318 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleType_in_ruleType322 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleType326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleTypeName343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleQualifiedIdent_in_ruleTypeName355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePackageName_in_ruleQualifiedIdent368 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_ruleQualifiedIdent371 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleQualifiedIdent374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_rulePackageName384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleArrayType_in_ruleTypeLit398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStructType_in_ruleTypeLit410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFunctionType_in_ruleTypeLit422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInterfaceType_in_ruleTypeLit434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSliceType_in_ruleTypeLit446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleMapType_in_ruleTypeLit458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleChannelType_in_ruleTypeLit470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePointerType_in_ruleTypeLit482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_ruleArrayType495 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleArrayLength_in_ruleArrayType498 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ruleArrayType501 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleElementType_in_ruleArrayType504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLength514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleElementType524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_ruleSliceType534 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ruleSliceType537 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleElementType_in_ruleSliceType540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_ruleStructType550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_ruleStructType553 = new BitSet(new long[]{0x0000000004100000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ruleFieldDecl_in_ruleStructType560 = new BitSet(new long[]{0x0004000004100000L,0x0000000000020000L});
	public static final BitSet FOLLOW_50_in_ruleStructType564 = new BitSet(new long[]{0x0000000004100000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_ruleStructType572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleFieldDecl586 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleType_in_ruleFieldDecl590 = new BitSet(new long[]{0x0000000100400002L});
	public static final BitSet FOLLOW_ruleEmbeddedField_in_ruleFieldDecl602 = new BitSet(new long[]{0x0000000100400002L});
	public static final BitSet FOLLOW_ruleTag_in_ruleFieldDecl608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleIdentifierList621 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_ruleIdentifierList628 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleIdentifierList632 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_RULE_MUL_in_ruleEmbeddedField646 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ruleTypeName_in_ruleEmbeddedField650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSTRING_LIT_in_ruleTag660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_MUL_in_rulePointerType670 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleBaseType_in_rulePointerType673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleBaseType683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_ruleFunctionType693 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ruleSignature_in_ruleFunctionType696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameters_in_ruleSignature706 = new BitSet(new long[]{0x0418020004100002L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleResult_in_ruleSignature709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameters_in_ruleResult726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleResult738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleParameters751 = new BitSet(new long[]{0x0418960004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleParameterList_in_ruleParameters754 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleParameters760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameterDecl_in_ruleParameterList770 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_ruleParameterList777 = new BitSet(new long[]{0x0418920004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleParameterDecl_in_ruleParameterList781 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleParameterDecl795 = new BitSet(new long[]{0x0418820004100002L,0x00000000000010C4L});
	public static final BitSet FOLLOW_47_in_ruleParameterDecl801 = new BitSet(new long[]{0x0418020004100002L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleType_in_ruleParameterDecl805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_ruleInterfaceType818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_ruleInterfaceType821 = new BitSet(new long[]{0x0000000000100000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ruleMethodSpec_in_ruleInterfaceType828 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_ruleInterfaceType832 = new BitSet(new long[]{0x0000000000100000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_ruleInterfaceType839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleMethodName_in_ruleMethodSpec853 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ruleSignature_in_ruleMethodSpec857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInterfaceTypeName_in_ruleMethodSpec869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleMethodName882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeName_in_ruleInterfaceTypeName892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_ruleMapType902 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_ruleMapType905 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleKeyType_in_ruleMapType908 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ruleMapType911 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleElementType_in_ruleMapType914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleKeyType924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_ruleChannelType938 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_51_in_ruleChannelType942 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_51_in_ruleChannelType955 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_ruleChannelType959 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleElementType_in_ruleChannelType965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_ruleBlock975 = new BitSet(new long[]{0x5D3C021804910400L,0x000000000003FCDFL});
	public static final BitSet FOLLOW_ruleStatementList_in_ruleBlock978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_ruleBlock981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStatement_in_ruleStatementList995 = new BitSet(new long[]{0x5D3C021804910402L,0x000000000001FCDFL});
	public static final BitSet FOLLOW_50_in_ruleStatementList999 = new BitSet(new long[]{0x5D3C021804910402L,0x000000000001FCDFL});
	public static final BitSet FOLLOW_ruleDeclaration_in_ruleStatement1018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLabeledStmt_in_ruleStatement1030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_ruleStatement1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGoStmt_in_ruleStatement1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleReturnStmt_in_ruleStatement1066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBreakStmt_in_ruleStatement1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleContinueStmt_in_ruleStatement1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGotoStmt_in_ruleStatement1102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFallthroughStmt_in_ruleStatement1114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBlock_in_ruleStatement1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIfStmt_in_ruleStatement1138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSwitchStmt_in_ruleStatement1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSelectStmt_in_ruleStatement1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleForStmt_in_ruleStatement1174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeferStmt_in_ruleStatement1186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleConstDecl_in_ruleDeclaration1203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeDecl_in_ruleDeclaration1215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleVarDecl_in_ruleDeclaration1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLabel_in_ruleLabeledStmt1240 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_ruleLabeledStmt1243 = new BitSet(new long[]{0x5D3C021804910400L,0x000000000001FCDFL});
	public static final BitSet FOLLOW_ruleStatement_in_ruleLabeledStmt1246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIncDecStmt_in_ruleSimpleStmt1260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAssignment_in_ruleSimpleStmt1272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSendStmt_in_ruleSimpleStmt1284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleShortVarDecl_in_ruleSimpleStmt1296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionStmt_in_ruleSimpleStmt1308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEmptyStmt_in_ruleSimpleStmt1320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_ruleGoStmt1333 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ruleLabel_in_ruleGoStmt1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_ruleReturnStmt1346 = new BitSet(new long[]{0x0438021804910402L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleReturnStmt1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_ruleBreakStmt1362 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_ruleLabel_in_ruleBreakStmt1365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_ruleContinueStmt1376 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_ruleLabel_in_ruleContinueStmt1379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_ruleGotoStmt1390 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ruleLabel_in_ruleGotoStmt1393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_ruleIfStmt1403 = new BitSet(new long[]{0x043C021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_ruleIfStmt1410 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_ruleIfStmt1414 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleIfStmt1421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ruleBlock_in_ruleIfStmt1424 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_ruleIfStmt1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
	public static final BitSet FOLLOW_ruleIfStmt_in_ruleIfStmt1440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBlock_in_ruleIfStmt1454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_ruleFallthroughStmt1472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExprSwitchStmt_in_ruleSwitchStmt1486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeSwitchStmt_in_ruleSwitchStmt1498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_ruleSelectStmt1511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_ruleSelectStmt1514 = new BitSet(new long[]{0x2200000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ruleCommClause_in_ruleSelectStmt1517 = new BitSet(new long[]{0x2200000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_ruleSelectStmt1523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_ruleForStmt1533 = new BitSet(new long[]{0x043C021804910400L,0x00000000000112C4L});
	public static final BitSet FOLLOW_ruleCondition_in_ruleForStmt1540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ruleForClause_in_ruleForStmt1552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ruleRangeClause_in_ruleForStmt1564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ruleBlock_in_ruleForStmt1571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_ruleDeferStmt1581 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleDeferStmt1584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_ruleConstDecl1594 = new BitSet(new long[]{0x0000020000100000L});
	public static final BitSet FOLLOW_ruleConstSpec_in_ruleConstDecl1601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleConstDecl1613 = new BitSet(new long[]{0x0000040000100000L});
	public static final BitSet FOLLOW_ruleConstSpec_in_ruleConstDecl1622 = new BitSet(new long[]{0x0004040000100000L});
	public static final BitSet FOLLOW_50_in_ruleConstDecl1627 = new BitSet(new long[]{0x0000040000100000L});
	public static final BitSet FOLLOW_42_in_ruleConstDecl1637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleConstSpec1650 = new BitSet(new long[]{0x0418020004102002L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleType_in_ruleConstSpec1657 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RULE_EQUALS_in_ruleConstSpec1665 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleConstSpec1669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_ruleTypeDecl1683 = new BitSet(new long[]{0x0000020000100000L});
	public static final BitSet FOLLOW_ruleTypeSpec_in_ruleTypeDecl1690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleTypeDecl1702 = new BitSet(new long[]{0x0000040000100000L});
	public static final BitSet FOLLOW_ruleTypeSpec_in_ruleTypeDecl1711 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_ruleTypeDecl1716 = new BitSet(new long[]{0x0000040000100000L});
	public static final BitSet FOLLOW_42_in_ruleTypeDecl1725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAliasDecl_in_ruleTypeSpec1742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeDef_in_ruleTypeSpec1754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleTypeDef1767 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleType_in_ruleTypeDef1770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleAliasDecl1780 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RULE_EQUALS_in_ruleAliasDecl1783 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleType_in_ruleAliasDecl1786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_ruleVarDecl1796 = new BitSet(new long[]{0x0000020000100000L});
	public static final BitSet FOLLOW_ruleVarSpec_in_ruleVarDecl1803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleVarDecl1815 = new BitSet(new long[]{0x0000040000100000L});
	public static final BitSet FOLLOW_ruleVarSpec_in_ruleVarDecl1824 = new BitSet(new long[]{0x0004040000100000L});
	public static final BitSet FOLLOW_50_in_ruleVarDecl1829 = new BitSet(new long[]{0x0000040000100000L});
	public static final BitSet FOLLOW_42_in_ruleVarDecl1839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleVarSpec1852 = new BitSet(new long[]{0x0418020004102002L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleType_in_ruleVarSpec1855 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_RULE_EQUALS_in_ruleVarSpec1865 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleVarSpec1869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_ruleEmptyStmt1883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionStmt1893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleChannel_in_ruleSendStmt1903 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_ruleSendStmt1906 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSendStmt1909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleChannel1919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleIncDecStmt1933 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_ruleIncDecStmt1937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleIncDecStmt1949 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_ruleIncDecStmt1953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleAssignment1966 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_ASSING_OP_in_ruleAssignment1969 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleAssignment1972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleShortVarDecl1982 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_ruleShortVarDecl1985 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleShortVarDecl1988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_ruleExprSwitchStmt1998 = new BitSet(new long[]{0x043C021804910400L,0x00000000000110C4L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_ruleExprSwitchStmt2005 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_ruleExprSwitchStmt2009 = new BitSet(new long[]{0x0438021804910400L,0x00000000000110C4L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleExprSwitchStmt2016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_ruleExprSwitchStmt2022 = new BitSet(new long[]{0x2200000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ruleExprCaseClause_in_ruleExprSwitchStmt2025 = new BitSet(new long[]{0x2200000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_ruleExprSwitchStmt2031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExprSwitchCase_in_ruleExprCaseClause2041 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_ruleExprCaseClause2044 = new BitSet(new long[]{0x5D3C021804910400L,0x000000000001FCDFL});
	public static final BitSet FOLLOW_ruleStatementList_in_ruleExprCaseClause2047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_ruleExprSwitchCase2061 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleExprSwitchCase2065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_ruleExprSwitchCase2077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_ruleTypeSwitchStmt2090 = new BitSet(new long[]{0x043C021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_ruleTypeSwitchStmt2097 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_ruleTypeSwitchStmt2101 = new BitSet(new long[]{0x0438020804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleTypeSwitchGuard_in_ruleTypeSwitchStmt2108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_ruleTypeSwitchStmt2111 = new BitSet(new long[]{0x2200000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ruleTypeCaseClause_in_ruleTypeSwitchStmt2114 = new BitSet(new long[]{0x2200000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_ruleTypeSwitchStmt2120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleTypeSwitchGuard2134 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_ruleTypeSwitchGuard2138 = new BitSet(new long[]{0x0438020804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_rulePrimaryExpr_in_ruleTypeSwitchGuard2145 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_ruleTypeSwitchGuard2148 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_ruleTypeSwitchGuard2151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_ruleTypeSwitchGuard2154 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleTypeSwitchGuard2157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeSwitchCase_in_ruleTypeCaseClause2167 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_ruleTypeCaseClause2170 = new BitSet(new long[]{0x5D3C021804910400L,0x000000000001FCDFL});
	public static final BitSet FOLLOW_ruleStatementList_in_ruleTypeCaseClause2173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_ruleTypeSwitchCase2187 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleTypeList_in_ruleTypeSwitchCase2191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_ruleTypeSwitchCase2203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleTypeList2216 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_ruleTypeList2223 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleType_in_ruleTypeList2227 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_ruleCommCase_in_ruleCommClause2241 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_ruleCommClause2244 = new BitSet(new long[]{0x5D3C021804910400L,0x000000000001FCDFL});
	public static final BitSet FOLLOW_ruleStatementList_in_ruleCommClause2247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_ruleCommCase2261 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleSendStmt_in_ruleCommCase2270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleRecvStmt_in_ruleCommCase2284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_ruleCommCase2300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleRecvStmt2317 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RULE_EQUALS_in_ruleRecvStmt2321 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleRecvStmt2333 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_ruleRecvStmt2337 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleRecvExpr_in_ruleRecvStmt2344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleRecvExpr2354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleCondition2364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInitStmt_in_ruleForClause2374 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_ruleForClause2380 = new BitSet(new long[]{0x043C021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleCondition_in_ruleForClause2383 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_ruleForClause2389 = new BitSet(new long[]{0x043C021804910402L,0x00000000000010C4L});
	public static final BitSet FOLLOW_rulePostStmt_in_ruleForClause2392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleRangeClause2409 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RULE_EQUALS_in_ruleRangeClause2413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleRangeClause2425 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_ruleRangeClause2429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_ruleRangeClause2436 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleRangeClause2439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_ruleInitStmt2449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_rulePostStmt2459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleLabel2469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList2479 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_ruleExpressionList2486 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList2490 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_ruleUnaryExpr_in_ruleExpression2504 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ruleExpression2_in_ruleExpression2507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_BINARY_OP_in_ruleExpression22521 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleExpression22525 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ruleExpression2_in_ruleExpression22529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePrimaryExpr_in_ruleUnaryExpr2547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_UNARY_OP_in_ruleUnaryExpr2559 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleUnaryExpr_in_ruleUnaryExpr2563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOperand_in_rulePrimaryExpr2580 = new BitSet(new long[]{0x0010420000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleConversion_in_rulePrimaryExpr2596 = new BitSet(new long[]{0x0010420000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleMethodExpr_in_rulePrimaryExpr2612 = new BitSet(new long[]{0x0010420000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSelector_in_rulePrimaryExpr22633 = new BitSet(new long[]{0x0010420000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIndex_in_rulePrimaryExpr22649 = new BitSet(new long[]{0x0010420000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSlice_in_rulePrimaryExpr22665 = new BitSet(new long[]{0x0010420000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeAssertion_in_rulePrimaryExpr22681 = new BitSet(new long[]{0x0010420000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleArguments_in_rulePrimaryExpr22697 = new BitSet(new long[]{0x0010420000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLiteral_in_ruleOperand2719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOperandName_in_ruleOperand2731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleOperand2743 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleOperand2747 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleOperand2751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleConversion2764 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_ruleConversion2767 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleConversion2770 = new BitSet(new long[]{0x0000140000000000L});
	public static final BitSet FOLLOW_44_in_ruleConversion2773 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleConversion2777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleReceiverType_in_ruleMethodExpr2787 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_ruleMethodExpr2790 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ruleMethodName_in_ruleMethodExpr2793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_ruleSelector2803 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleSelector2806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_ruleIndex2816 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleIndex2819 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ruleIndex2822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_ruleSlice2836 = new BitSet(new long[]{0x0439021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSlice2840 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_ruleSlice2848 = new BitSet(new long[]{0x04B8021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSlice2852 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ruleSlice2860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_ruleSlice2872 = new BitSet(new long[]{0x0439021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSlice2876 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_ruleSlice2884 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSlice2888 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_ruleSlice2892 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSlice2896 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ruleSlice2900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_ruleTypeAssertion2913 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_ruleTypeAssertion2916 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleType_in_ruleTypeAssertion2919 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleTypeAssertion2922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleArguments2932 = new BitSet(new long[]{0x0438061804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleArguments2944 = new BitSet(new long[]{0x0000940000000000L});
	public static final BitSet FOLLOW_ruleType_in_ruleArguments2958 = new BitSet(new long[]{0x0000940000000000L});
	public static final BitSet FOLLOW_44_in_ruleArguments2969 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleArguments2975 = new BitSet(new long[]{0x0000940000000000L});
	public static final BitSet FOLLOW_47_in_ruleArguments2989 = new BitSet(new long[]{0x0000140000000000L});
	public static final BitSet FOLLOW_44_in_ruleArguments2994 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleArguments3002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBasicLit_in_ruleLiteral3016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCompositeLit_in_ruleLiteral3028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFunctionLit_in_ruleLiteral3040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_ruleFunctionLit3053 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ruleSignature_in_ruleFunctionLit3056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ruleFunctionBody_in_ruleFunctionLit3059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLiteralType_in_ruleCompositeLit3069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ruleLiteralValue_in_ruleCompositeLit3072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStructType_in_ruleLiteralType3086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleArrayType_in_ruleLiteralType3098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_ruleLiteralType3110 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_ruleLiteralType3114 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ruleLiteralType3118 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleElementType_in_ruleLiteralType3122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSliceType_in_ruleLiteralType3134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleMapType_in_ruleLiteralType3146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeName_in_ruleLiteralType3158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_ruleLiteralValue3171 = new BitSet(new long[]{0x0438021804910400L,0x00000000000310C4L});
	public static final BitSet FOLLOW_ruleElementList_in_ruleLiteralValue3178 = new BitSet(new long[]{0x0000100000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_44_in_ruleLiteralValue3182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_ruleLiteralValue3190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleKeyedElement_in_ruleElementList3200 = new BitSet(new long[]{0x0438121804910402L,0x00000000000110C4L});
	public static final BitSet FOLLOW_44_in_ruleElementList3207 = new BitSet(new long[]{0x0438021804910400L,0x00000000000110C4L});
	public static final BitSet FOLLOW_ruleKeyedElement_in_ruleElementList3212 = new BitSet(new long[]{0x0438121804910402L,0x00000000000110C4L});
	public static final BitSet FOLLOW_ruleKey_in_ruleKeyedElement3230 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_ruleKeyedElement3234 = new BitSet(new long[]{0x0438021804910400L,0x00000000000110C4L});
	public static final BitSet FOLLOW_ruleElement_in_ruleKeyedElement3241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFieldName_in_ruleKey3255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleKey3267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLiteralValue_in_ruleKey3279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleFieldName3292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleElement3306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLiteralValue_in_ruleElement3318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_INT_LIT_in_ruleBasicLit3335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_FLOAT_LIT_in_ruleBasicLit3347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIMAGINARY_LIT_in_ruleBasicLit3359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleRUNE_LIT_in_ruleBasicLit3371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleBasicLit3383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleReceiverType3396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBlock_in_ruleFunctionBody3406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleOperandName3420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleQualifiedIdent_in_ruleOperandName3432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_ruleImportDecl3445 = new BitSet(new long[]{0x0000420800100000L});
	public static final BitSet FOLLOW_ruleImportSpec_in_ruleImportDecl3452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleImportDecl3464 = new BitSet(new long[]{0x0000440800100000L});
	public static final BitSet FOLLOW_ruleImportSpec_in_ruleImportDecl3468 = new BitSet(new long[]{0x0000440800100000L});
	public static final BitSet FOLLOW_42_in_ruleImportDecl3476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_ruleImportSpec3493 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleImportSpec3505 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ruleImportPath_in_ruleImportSpec3512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleImportPath3522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_synpred13_DebugInternalGo343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_synpred23_DebugInternalGo586 = new BitSet(new long[]{0x0418020004100000L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleType_in_synpred23_DebugInternalGo590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_synpred25_DebugInternalGo628 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_synpred25_DebugInternalGo632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleResult_in_synpred27_DebugInternalGo709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameters_in_synpred28_DebugInternalGo726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameterList_in_synpred29_DebugInternalGo754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_synpred31_DebugInternalGo795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_synpred36_DebugInternalGo942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_synpred38_DebugInternalGo999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGoStmt_in_synpred43_DebugInternalGo1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGotoStmt_in_synpred47_DebugInternalGo1102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIncDecStmt_in_synpred56_DebugInternalGo1260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAssignment_in_synpred57_DebugInternalGo1272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSendStmt_in_synpred58_DebugInternalGo1284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleShortVarDecl_in_synpred59_DebugInternalGo1296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionStmt_in_synpred60_DebugInternalGo1308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_synpred61_DebugInternalGo1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLabel_in_synpred62_DebugInternalGo1365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLabel_in_synpred63_DebugInternalGo1379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_synpred64_DebugInternalGo1410 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred64_DebugInternalGo1414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExprSwitchStmt_in_synpred67_DebugInternalGo1486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCondition_in_synpred69_DebugInternalGo1540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleForClause_in_synpred70_DebugInternalGo1552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleRangeClause_in_synpred71_DebugInternalGo1564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_synpred76_DebugInternalGo1657 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RULE_EQUALS_in_synpred76_DebugInternalGo1665 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpressionList_in_synpred76_DebugInternalGo1669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_synpred83_DebugInternalGo1855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_synpred85_DebugInternalGo1933 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_synpred85_DebugInternalGo1937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_synpred86_DebugInternalGo2005 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred86_DebugInternalGo2009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_synpred90_DebugInternalGo2097 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred90_DebugInternalGo2101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSendStmt_in_synpred95_DebugInternalGo2270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_synpred97_DebugInternalGo2317 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RULE_EQUALS_in_synpred97_DebugInternalGo2321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_synpred98_DebugInternalGo2333 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_synpred98_DebugInternalGo2337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInitStmt_in_synpred99_DebugInternalGo2374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_BINARY_OP_in_synpred105_DebugInternalGo2521 = new BitSet(new long[]{0x0438021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_synpred105_DebugInternalGo2525 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ruleExpression2_in_synpred105_DebugInternalGo2529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOperand_in_synpred107_DebugInternalGo2580 = new BitSet(new long[]{0x0010420000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred107_DebugInternalGo2584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleConversion_in_synpred108_DebugInternalGo2596 = new BitSet(new long[]{0x0010420000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred108_DebugInternalGo2600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSelector_in_synpred109_DebugInternalGo2633 = new BitSet(new long[]{0x0010420000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred109_DebugInternalGo2637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIndex_in_synpred110_DebugInternalGo2649 = new BitSet(new long[]{0x0010420000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred110_DebugInternalGo2653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSlice_in_synpred111_DebugInternalGo2665 = new BitSet(new long[]{0x0010420000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred111_DebugInternalGo2669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeAssertion_in_synpred112_DebugInternalGo2681 = new BitSet(new long[]{0x0010420000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred112_DebugInternalGo2685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleArguments_in_synpred113_DebugInternalGo2697 = new BitSet(new long[]{0x0010420000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred113_DebugInternalGo2701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLiteral_in_synpred114_DebugInternalGo2719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOperandName_in_synpred115_DebugInternalGo2731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred119_DebugInternalGo2836 = new BitSet(new long[]{0x0439021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_synpred119_DebugInternalGo2840 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_synpred119_DebugInternalGo2848 = new BitSet(new long[]{0x04B8021804910400L,0x00000000000010C4L});
	public static final BitSet FOLLOW_ruleExpression_in_synpred119_DebugInternalGo2852 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_synpred119_DebugInternalGo2860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_synpred121_DebugInternalGo2944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleKey_in_synpred137_DebugInternalGo3230 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_synpred137_DebugInternalGo3234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFieldName_in_synpred138_DebugInternalGo3255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_synpred139_DebugInternalGo3267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_synpred145_DebugInternalGo3420 = new BitSet(new long[]{0x0000000000000002L});
}
