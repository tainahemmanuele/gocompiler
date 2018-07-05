// $ANTLR 3.5.1 C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g 2018-07-03 21:36:06

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
		"RULE_DECIMALS", "RULE_DECIMAL_DIGIT", "RULE_DECIMAL_LIT", "RULE_ESCAPED_CHAR", 
		"RULE_EXPOENT", "RULE_FLOAT_LIT", "RULE_HEX_BYTE_VALUE", "RULE_HEX_DIGIT", 
		"RULE_HEX_LIT", "RULE_ID", "RULE_INT", "RULE_INTERPRETED_STRING_LIT", 
		"RULE_INT_LIT", "RULE_LETTER", "RULE_LITTLE_U_VALUE", "RULE_ML_COMMENT", 
		"RULE_MUL_OP", "RULE_NEWLINE", "RULE_OCTAL_BYTE_VALUE", "RULE_OCTAL_DIGIT", 
		"RULE_OCTAL_LIT", "RULE_RAW_STRING_LIT", "RULE_REL_OP", "RULE_SL_COMMENT", 
		"RULE_STRING", "RULE_UNARY_OP", "RULE_UNICODE_CHAR", "RULE_UNICODE_DIGIT", 
		"RULE_UNICODE_LETTER", "RULE_UNICODE_VALUE", "RULE_WS", "'('", "')'", 
		"'*'", "'++'", "','", "'--'", "'.'", "'...'", "':'", "':='", "';'", "'<-'", 
		"'='", "'['", "'\\''", "'\\u00EF'", "']'", "'break'", "'case'", "'chan'", 
		"'const'", "'continue'", "'default'", "'defer'", "'else'", "'fallthrough'", 
		"'for'", "'func'", "'goto'", "'if'", "'import'", "'interface'", "'map'", 
		"'package'", "'range'", "'return'", "'select'", "'struct'", "'switch'", 
		"'type'", "'var'", "'{'", "'}'"
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
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int RULE_ADD_OP=4;
	public static final int RULE_ANY_OTHER=5;
	public static final int RULE_ASSING_OP=6;
	public static final int RULE_BIG_U_VALUE=7;
	public static final int RULE_BINARY_OP=8;
	public static final int RULE_BYTE_VALUE=9;
	public static final int RULE_DECIMALS=10;
	public static final int RULE_DECIMAL_DIGIT=11;
	public static final int RULE_DECIMAL_LIT=12;
	public static final int RULE_ESCAPED_CHAR=13;
	public static final int RULE_EXPOENT=14;
	public static final int RULE_FLOAT_LIT=15;
	public static final int RULE_HEX_BYTE_VALUE=16;
	public static final int RULE_HEX_DIGIT=17;
	public static final int RULE_HEX_LIT=18;
	public static final int RULE_ID=19;
	public static final int RULE_INT=20;
	public static final int RULE_INTERPRETED_STRING_LIT=21;
	public static final int RULE_INT_LIT=22;
	public static final int RULE_LETTER=23;
	public static final int RULE_LITTLE_U_VALUE=24;
	public static final int RULE_ML_COMMENT=25;
	public static final int RULE_MUL_OP=26;
	public static final int RULE_NEWLINE=27;
	public static final int RULE_OCTAL_BYTE_VALUE=28;
	public static final int RULE_OCTAL_DIGIT=29;
	public static final int RULE_OCTAL_LIT=30;
	public static final int RULE_RAW_STRING_LIT=31;
	public static final int RULE_REL_OP=32;
	public static final int RULE_SL_COMMENT=33;
	public static final int RULE_STRING=34;
	public static final int RULE_UNARY_OP=35;
	public static final int RULE_UNICODE_CHAR=36;
	public static final int RULE_UNICODE_DIGIT=37;
	public static final int RULE_UNICODE_LETTER=38;
	public static final int RULE_UNICODE_VALUE=39;
	public static final int RULE_WS=40;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "ruleMapType", "synpred47_DebugInternalGo", "synpred91_DebugInternalGo", 
		"synpred61_DebugInternalGo", "synpred13_DebugInternalGo", "synpred20_DebugInternalGo", 
		"synpred85_DebugInternalGo", "ruleMethodDecl", "synpred44_DebugInternalGo", 
		"synpred51_DebugInternalGo", "synpred1_DebugInternalGo", "ruleParameterList", 
		"synpred48_DebugInternalGo", "ruleCommClause", "synpred78_DebugInternalGo", 
		"ruleSelectStmt", "rulePostStmt", "ruleModel", "synpred8_DebugInternalGo", 
		"synpred110_DebugInternalGo", "synpred43_DebugInternalGo", "ruleDeclaration", 
		"synpred31_DebugInternalGo", "ruleExpression", "synpred28_DebugInternalGo", 
		"synpred33_DebugInternalGo", "synpred134_DebugInternalGo", "synpred142_DebugInternalGo", 
		"ruleExprCaseClause", "ruleImportPath", "ruleTypeAssertion", "ruleImportDecl", 
		"synpred59_DebugInternalGo", "ruleTypeDef", "synpred15_DebugInternalGo", 
		"ruleImportSpec", "synpred104_DebugInternalGo", "ruleCompilation_initial", 
		"ruleEmptyStmt", "synpred79_DebugInternalGo", "synpred5_DebugInternalGo", 
		"ruleLabel", "synpred137_DebugInternalGo", "ruleOperand", "synpred3_DebugInternalGo", 
		"ruleShortVarDecl", "synpred24_DebugInternalGo", "synpred80_DebugInternalGo", 
		"synpred106_DebugInternalGo", "ruleTypeSwitchGuard", "ruleRUNE_LIT", "rulePointerType", 
		"ruleTypeCaseClause", "synpred132_DebugInternalGo", "synpred87_DebugInternalGo", 
		"ruleContinueStmt", "ruleUnaryExpr", "ruleChannelType", "synpred4_DebugInternalGo", 
		"ruleArrayLength", "ruleKeyType", "ruleExprSwitchStmt", "ruleCommCase", 
		"synpred71_DebugInternalGo", "synpred119_DebugInternalGo", "ruleGoStmt", 
		"ruleSwitchStmt", "synpred11_DebugInternalGo", "synpred116_DebugInternalGo", 
		"ruleBasicLit", "ruleBaseType", "synpred34_DebugInternalGo", "synpred57_DebugInternalGo", 
		"ruleFallthroughStmt", "synpred124_DebugInternalGo", "ruleFieldDecl", 
		"synpred23_DebugInternalGo", "ruleTypeName", "ruleLiteralType", "ruleConversion", 
		"synpred143_DebugInternalGo", "synpred17_DebugInternalGo", "synpred98_DebugInternalGo", 
		"ruleExpression2", "synpred74_DebugInternalGo", "synpred135_DebugInternalGo", 
		"ruleDeferStmt", "ruleOperandName", "synpred131_DebugInternalGo", "synpred97_DebugInternalGo", 
		"ruleStatementList", "synpred27_DebugInternalGo", "synpred53_DebugInternalGo", 
		"synpred40_DebugInternalGo", "ruleReceiverType", "synpred42_DebugInternalGo", 
		"ruleTypeDecl", "ruleSelector", "synpred25_DebugInternalGo", "ruleEmbeddedField", 
		"ruleSlice", "synpred45_DebugInternalGo", "synpred102_DebugInternalGo", 
		"ruleIdentifierList", "ruleVarDecl", "synpred46_DebugInternalGo", "ruleReceiver", 
		"synpred18_DebugInternalGo", "ruleIMAGINARY_LIT", "synpred9_DebugInternalGo", 
		"synpred12_DebugInternalGo", "synpred55_DebugInternalGo", "ruleCondition", 
		"ruleLiteral", "synpred93_DebugInternalGo", "ruleReturnStmt", "ruleTypeSwitchCase", 
		"ruleExpressionStmt", "synpred49_DebugInternalGo", "synpred37_DebugInternalGo", 
		"synpred121_DebugInternalGo", "synpred35_DebugInternalGo", "ruleAliasDecl", 
		"synpred2_DebugInternalGo", "synpred26_DebugInternalGo", "ruleFunctionDecl", 
		"synpred84_DebugInternalGo", "ruleSTRING_LIT", "ruleInterfaceType", "rulePrimaryExpr2", 
		"synpred22_DebugInternalGo", "synpred149_DebugInternalGo", "ruleTopLevelDecl", 
		"ruleBlock", "synpred82_DebugInternalGo", "synpred83_DebugInternalGo", 
		"synpred92_DebugInternalGo", "synpred120_DebugInternalGo", "ruleTypeList", 
		"ruleVarSpec", "synpred65_DebugInternalGo", "synpred129_DebugInternalGo", 
		"ruleIncDecStmt", "synpred136_DebugInternalGo", "ruleAssignment", "synpred96_DebugInternalGo", 
		"synpred39_DebugInternalGo", "ruleIndex", "ruleSignature", "synpred109_DebugInternalGo", 
		"ruleParameters", "ruleLabeledStmt", "ruleElementList", "synpred30_DebugInternalGo", 
		"ruleRecvExpr", "synpred107_DebugInternalGo", "synpred111_DebugInternalGo", 
		"ruleSimpleStmt", "ruleKey", "synpred36_DebugInternalGo", "synpred108_DebugInternalGo", 
		"synpred66_DebugInternalGo", "synpred105_DebugInternalGo", "synpred126_DebugInternalGo", 
		"synpred50_DebugInternalGo", "ruleArguments", "ruleCompositeLit", "ruleConstSpec", 
		"synpred69_DebugInternalGo", "synpred112_DebugInternalGo", "ruleTypeSwitchStmt", 
		"synpred141_DebugInternalGo", "synpred60_DebugInternalGo", "ruleKeyedElement", 
		"ruleFunctionName", "synpred29_DebugInternalGo", "synpred113_DebugInternalGo", 
		"ruleForClause", "synpred95_DebugInternalGo", "synpred72_DebugInternalGo", 
		"synpred64_DebugInternalGo", "ruleTag", "synpred115_DebugInternalGo", 
		"synpred10_DebugInternalGo", "synpred56_DebugInternalGo", "ruleFunctionType", 
		"synpred125_DebugInternalGo", "ruleElement", "synpred90_DebugInternalGo", 
		"synpred19_DebugInternalGo", "ruleInitStmt", "synpred147_DebugInternalGo", 
		"synpred32_DebugInternalGo", "ruleFunctionBody", "ruleIfStmt", "ruleFunctionLit", 
		"synpred86_DebugInternalGo", "synpred73_DebugInternalGo", "synpred148_DebugInternalGo", 
		"synpred138_DebugInternalGo", "synpred75_DebugInternalGo", "ruleElementType", 
		"ruleGotoStmt", "synpred117_DebugInternalGo", "synpred123_DebugInternalGo", 
		"synpred94_DebugInternalGo", "rulePackageName", "ruleStructType", "rulePrimaryExpr", 
		"synpred67_DebugInternalGo", "ruleLiteralValue", "synpred16_DebugInternalGo", 
		"synpred38_DebugInternalGo", "ruleExprSwitchCase", "synpred144_DebugInternalGo", 
		"synpred146_DebugInternalGo", "synpred118_DebugInternalGo", "synpred103_DebugInternalGo", 
		"synpred58_DebugInternalGo", "ruleFieldName", "ruleType", "synpred76_DebugInternalGo", 
		"synpred21_DebugInternalGo", "synpred62_DebugInternalGo", "synpred130_DebugInternalGo", 
		"synpred89_DebugInternalGo", "synpred41_DebugInternalGo", "synpred99_DebugInternalGo", 
		"synpred101_DebugInternalGo", "ruleForStmt", "ruleParameterDecl", "ruleQualifiedIdent", 
		"ruleArrayType", "ruleBreakStmt", "ruleSliceType", "ruleMethodSpec", "ruleTypeSpec", 
		"ruleInterfaceTypeName", "ruleSendStmt", "synpred70_DebugInternalGo", 
		"synpred54_DebugInternalGo", "synpred127_DebugInternalGo", "ruleChannel", 
		"ruleTypeLit", "synpred122_DebugInternalGo", "synpred133_DebugInternalGo", 
		"synpred140_DebugInternalGo", "synpred6_DebugInternalGo", "synpred63_DebugInternalGo", 
		"ruleIDENTIFIER", "ruleStatement", "synpred145_DebugInternalGo", "ruleMethodName", 
		"synpred81_DebugInternalGo", "ruleResult", "synpred7_DebugInternalGo", 
		"synpred52_DebugInternalGo", "synpred139_DebugInternalGo", "rulePackageClause", 
		"synpred14_DebugInternalGo", "ruleExpressionList", "synpred128_DebugInternalGo", 
		"synpred100_DebugInternalGo", "synpred88_DebugInternalGo", "ruleMethodExpr", 
		"synpred68_DebugInternalGo", "ruleConstDecl", "synpred77_DebugInternalGo", 
		"synpred114_DebugInternalGo", "ruleRecvStmt", "ruleRangeClause"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, true, false, false, 
		    true, false, true, false, true, true, true, false, true, false, false, 
		    false, false, true, false, true, false, true, false, true, true, true, 
		    true, true, false, false, true, false, true, false, false, false, 
		    false, true, false, false, false, false, false, true, false, true, 
		    true, false, false, false, true, false, false, false, false, true, 
		    false, true, true, false, false, false, false, true, false, true, 
		    true, true, false, false, false, false, true, false, true, false, 
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
			if ( (LA3_0==74) ) {
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
						if ( (LA1_0==71) ) {
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
						if ( (LA2_0==61||LA2_0==68||(LA2_0 >= 80 && LA2_0 <= 81)) ) {
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
			if ( (LA4_0==61||(LA4_0 >= 80 && LA4_0 <= 81)) ) {
				alt4=1;
			}
			else if ( (LA4_0==68) ) {
				int LA4_2 = input.LA(2);
				if ( (LA4_2==RULE_LETTER) ) {
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
			match(input,68,FOLLOW_68_in_ruleMethodDecl104); if (state.failed) return;dbg.location(36,2);
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
			if ( (LA5_0==82) ) {
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
			match(input,68,FOLLOW_68_in_ruleFunctionDecl149); if (state.failed) return;dbg.location(56,2);
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
			if ( (LA6_0==82) ) {
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
			match(input,74,FOLLOW_74_in_rulePackageClause171); if (state.failed) return;dbg.location(65,2);
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
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:69:1: ruleIDENTIFIER : RULE_LETTER ( RULE_LETTER | RULE_UNICODE_DIGIT )* ;
	public final void ruleIDENTIFIER() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIDENTIFIER");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:69:15: ( RULE_LETTER ( RULE_LETTER | RULE_UNICODE_DIGIT )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:70:2: RULE_LETTER ( RULE_LETTER | RULE_UNICODE_DIGIT )*
			{
			dbg.location(70,2);
			match(input,RULE_LETTER,FOLLOW_RULE_LETTER_in_ruleIDENTIFIER184); if (state.failed) return;dbg.location(71,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:71:2: ( RULE_LETTER | RULE_UNICODE_DIGIT )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==RULE_LETTER||LA7_0==RULE_UNICODE_DIGIT) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:
					{
					dbg.location(71,2);
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
					break loop7;
				}
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
		dbg.location(76, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIDENTIFIER");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIDENTIFIER"



	// $ANTLR start "ruleIMAGINARY_LIT"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:79:1: ruleIMAGINARY_LIT : ( RULE_DECIMALS | RULE_FLOAT_LIT ) '\\u00EF' ;
	public final void ruleIMAGINARY_LIT() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIMAGINARY_LIT");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(79, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:79:18: ( ( RULE_DECIMALS | RULE_FLOAT_LIT ) '\\u00EF' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:80:2: ( RULE_DECIMALS | RULE_FLOAT_LIT ) '\\u00EF'
			{
			dbg.location(80,2);
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
			}dbg.location(85,2);
			match(input,56,FOLLOW_56_in_ruleIMAGINARY_LIT239); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(86, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIMAGINARY_LIT");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIMAGINARY_LIT"



	// $ANTLR start "ruleRUNE_LIT"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:89:1: ruleRUNE_LIT : '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\'' ;
	public final void ruleRUNE_LIT() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleRUNE_LIT");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(89, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:89:13: ( '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\'' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:90:2: '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\''
			{
			dbg.location(90,2);
			match(input,55,FOLLOW_55_in_ruleRUNE_LIT249); if (state.failed) return;dbg.location(91,2);
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
			}dbg.location(96,2);
			match(input,55,FOLLOW_55_in_ruleRUNE_LIT274); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(97, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleRUNE_LIT");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleRUNE_LIT"



	// $ANTLR start "ruleSTRING_LIT"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:100:1: ruleSTRING_LIT : ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT ) ;
	public final void ruleSTRING_LIT() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSTRING_LIT");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(100, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:100:15: ( ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:
			{
			dbg.location(100,15);
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
		dbg.location(106, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSTRING_LIT");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSTRING_LIT"



	// $ANTLR start "ruleType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:109:1: ruleType : ( ruleTypeName | ruleTypeLit | '(' ruleType ')' ) ;
	public final void ruleType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(109, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:109:9: ( ( ruleTypeName | ruleTypeLit | '(' ruleType ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:110:2: ( ruleTypeName | ruleTypeLit | '(' ruleType ')' )
			{
			dbg.location(110,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:110:2: ( ruleTypeName | ruleTypeLit | '(' ruleType ')' )
			int alt8=3;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			switch ( input.LA(1) ) {
			case RULE_LETTER:
				{
				alt8=1;
				}
				break;
			case 43:
			case 52:
			case 54:
			case 60:
			case 68:
			case 72:
			case 73:
			case 78:
				{
				alt8=2;
				}
				break;
			case 41:
				{
				alt8=3;
				}
				break;
			default:
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:111:3: ruleTypeName
					{
					dbg.location(111,3);
					pushFollow(FOLLOW_ruleTypeName_in_ruleType317);
					ruleTypeName();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:113:3: ruleTypeLit
					{
					dbg.location(113,3);
					pushFollow(FOLLOW_ruleTypeLit_in_ruleType329);
					ruleTypeLit();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:115:3: '(' ruleType ')'
					{
					dbg.location(115,3);
					match(input,41,FOLLOW_41_in_ruleType341); if (state.failed) return;dbg.location(116,3);
					pushFollow(FOLLOW_ruleType_in_ruleType345);
					ruleType();
					state._fsp--;
					if (state.failed) return;dbg.location(117,3);
					match(input,42,FOLLOW_42_in_ruleType349); if (state.failed) return;
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
		dbg.location(119, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleType"



	// $ANTLR start "ruleTypeName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:122:1: ruleTypeName : ( ruleIDENTIFIER | ruleQualifiedIdent ) ;
	public final void ruleTypeName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(122, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:122:13: ( ( ruleIDENTIFIER | ruleQualifiedIdent ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:123:2: ( ruleIDENTIFIER | ruleQualifiedIdent )
			{
			dbg.location(123,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:123:2: ( ruleIDENTIFIER | ruleQualifiedIdent )
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			try {
				isCyclicDecision = true;
				alt9 = dfa9.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:124:3: ruleIDENTIFIER
					{
					dbg.location(124,3);
					pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleTypeName366);
					ruleIDENTIFIER();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:126:3: ruleQualifiedIdent
					{
					dbg.location(126,3);
					pushFollow(FOLLOW_ruleQualifiedIdent_in_ruleTypeName378);
					ruleQualifiedIdent();
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
		dbg.location(128, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeName"



	// $ANTLR start "ruleQualifiedIdent"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:131:1: ruleQualifiedIdent : rulePackageName '.' ruleIDENTIFIER ;
	public final void ruleQualifiedIdent() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleQualifiedIdent");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(131, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:131:19: ( rulePackageName '.' ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:132:2: rulePackageName '.' ruleIDENTIFIER
			{
			dbg.location(132,2);
			pushFollow(FOLLOW_rulePackageName_in_ruleQualifiedIdent391);
			rulePackageName();
			state._fsp--;
			if (state.failed) return;dbg.location(133,2);
			match(input,47,FOLLOW_47_in_ruleQualifiedIdent394); if (state.failed) return;dbg.location(134,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleQualifiedIdent397);
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
			dbg.exitRule(getGrammarFileName(), "ruleQualifiedIdent");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleQualifiedIdent"



	// $ANTLR start "rulePackageName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:138:1: rulePackageName : ruleIDENTIFIER ;
	public final void rulePackageName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulePackageName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(138, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:138:16: ( ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:139:2: ruleIDENTIFIER
			{
			dbg.location(139,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_rulePackageName407);
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
		dbg.location(140, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulePackageName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulePackageName"



	// $ANTLR start "ruleTypeLit"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:143:1: ruleTypeLit : ( ruleArrayType | ruleStructType | rulePointerType | ruleFunctionType | ruleInterfaceType | ruleSliceType | ruleMapType | ruleChannelType ) ;
	public final void ruleTypeLit() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeLit");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(143, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:143:12: ( ( ruleArrayType | ruleStructType | rulePointerType | ruleFunctionType | ruleInterfaceType | ruleSliceType | ruleMapType | ruleChannelType ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:144:2: ( ruleArrayType | ruleStructType | rulePointerType | ruleFunctionType | ruleInterfaceType | ruleSliceType | ruleMapType | ruleChannelType )
			{
			dbg.location(144,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:144:2: ( ruleArrayType | ruleStructType | rulePointerType | ruleFunctionType | ruleInterfaceType | ruleSliceType | ruleMapType | ruleChannelType )
			int alt10=8;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			switch ( input.LA(1) ) {
			case 54:
				{
				int LA10_1 = input.LA(2);
				if ( (LA10_1==57) ) {
					alt10=6;
				}
				else if ( (LA10_1==RULE_DECIMALS||LA10_1==RULE_FLOAT_LIT||(LA10_1 >= RULE_INT_LIT && LA10_1 <= RULE_LETTER)||(LA10_1 >= RULE_STRING && LA10_1 <= RULE_UNARY_OP)||LA10_1==41||LA10_1==43||LA10_1==52||(LA10_1 >= 54 && LA10_1 <= 55)||LA10_1==60||LA10_1==68||(LA10_1 >= 72 && LA10_1 <= 73)||LA10_1==78) ) {
					alt10=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 78:
				{
				alt10=2;
				}
				break;
			case 43:
				{
				alt10=3;
				}
				break;
			case 68:
				{
				alt10=4;
				}
				break;
			case 72:
				{
				alt10=5;
				}
				break;
			case 73:
				{
				alt10=7;
				}
				break;
			case 52:
			case 60:
				{
				alt10=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:145:3: ruleArrayType
					{
					dbg.location(145,3);
					pushFollow(FOLLOW_ruleArrayType_in_ruleTypeLit421);
					ruleArrayType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:147:3: ruleStructType
					{
					dbg.location(147,3);
					pushFollow(FOLLOW_ruleStructType_in_ruleTypeLit433);
					ruleStructType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:149:3: rulePointerType
					{
					dbg.location(149,3);
					pushFollow(FOLLOW_rulePointerType_in_ruleTypeLit445);
					rulePointerType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:151:3: ruleFunctionType
					{
					dbg.location(151,3);
					pushFollow(FOLLOW_ruleFunctionType_in_ruleTypeLit457);
					ruleFunctionType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:153:3: ruleInterfaceType
					{
					dbg.location(153,3);
					pushFollow(FOLLOW_ruleInterfaceType_in_ruleTypeLit469);
					ruleInterfaceType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:155:3: ruleSliceType
					{
					dbg.location(155,3);
					pushFollow(FOLLOW_ruleSliceType_in_ruleTypeLit481);
					ruleSliceType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:157:3: ruleMapType
					{
					dbg.location(157,3);
					pushFollow(FOLLOW_ruleMapType_in_ruleTypeLit493);
					ruleMapType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:159:3: ruleChannelType
					{
					dbg.location(159,3);
					pushFollow(FOLLOW_ruleChannelType_in_ruleTypeLit505);
					ruleChannelType();
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
		dbg.location(161, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeLit");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeLit"



	// $ANTLR start "ruleArrayType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:164:1: ruleArrayType : '[' ruleArrayLength ']' ruleElementType ;
	public final void ruleArrayType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleArrayType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(164, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:164:14: ( '[' ruleArrayLength ']' ruleElementType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:165:2: '[' ruleArrayLength ']' ruleElementType
			{
			dbg.location(165,2);
			match(input,54,FOLLOW_54_in_ruleArrayType518); if (state.failed) return;dbg.location(166,2);
			pushFollow(FOLLOW_ruleArrayLength_in_ruleArrayType521);
			ruleArrayLength();
			state._fsp--;
			if (state.failed) return;dbg.location(167,2);
			match(input,57,FOLLOW_57_in_ruleArrayType524); if (state.failed) return;dbg.location(168,2);
			pushFollow(FOLLOW_ruleElementType_in_ruleArrayType527);
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
		dbg.location(169, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleArrayType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleArrayType"



	// $ANTLR start "ruleArrayLength"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:172:1: ruleArrayLength : ruleExpression ;
	public final void ruleArrayLength() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleArrayLength");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(172, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:172:16: ( ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:173:2: ruleExpression
			{
			dbg.location(173,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleArrayLength537);
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
		dbg.location(174, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleArrayLength");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleArrayLength"



	// $ANTLR start "ruleElementType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:177:1: ruleElementType : ruleType ;
	public final void ruleElementType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleElementType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(177, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:177:16: ( ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:178:2: ruleType
			{
			dbg.location(178,2);
			pushFollow(FOLLOW_ruleType_in_ruleElementType547);
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
		dbg.location(179, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleElementType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleElementType"



	// $ANTLR start "ruleSliceType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:182:1: ruleSliceType : '[' ']' ruleElementType ;
	public final void ruleSliceType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSliceType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(182, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:182:14: ( '[' ']' ruleElementType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:183:2: '[' ']' ruleElementType
			{
			dbg.location(183,2);
			match(input,54,FOLLOW_54_in_ruleSliceType557); if (state.failed) return;dbg.location(184,2);
			match(input,57,FOLLOW_57_in_ruleSliceType560); if (state.failed) return;dbg.location(185,2);
			pushFollow(FOLLOW_ruleElementType_in_ruleSliceType563);
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
		dbg.location(186, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSliceType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSliceType"



	// $ANTLR start "ruleStructType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:189:1: ruleStructType : 'struct' '{' ( ruleFieldDecl ';' )* '}' ;
	public final void ruleStructType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleStructType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(189, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:189:15: ( 'struct' '{' ( ruleFieldDecl ';' )* '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:190:2: 'struct' '{' ( ruleFieldDecl ';' )* '}'
			{
			dbg.location(190,2);
			match(input,78,FOLLOW_78_in_ruleStructType573); if (state.failed) return;dbg.location(191,2);
			match(input,82,FOLLOW_82_in_ruleStructType576); if (state.failed) return;dbg.location(192,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:192:2: ( ruleFieldDecl ';' )*
			try { dbg.enterSubRule(11);

			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==RULE_LETTER||LA11_0==43) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:193:3: ruleFieldDecl ';'
					{
					dbg.location(193,3);
					pushFollow(FOLLOW_ruleFieldDecl_in_ruleStructType583);
					ruleFieldDecl();
					state._fsp--;
					if (state.failed) return;dbg.location(194,3);
					match(input,51,FOLLOW_51_in_ruleStructType587); if (state.failed) return;
					}
					break;

				default :
					break loop11;
				}
			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(196,2);
			match(input,83,FOLLOW_83_in_ruleStructType594); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "ruleStructType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleStructType"



	// $ANTLR start "ruleFieldDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:200:1: ruleFieldDecl : ( ruleIdentifierList ruleType | ruleEmbeddedField ) ( ruleTag )? ;
	public final void ruleFieldDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFieldDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(200, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:200:14: ( ( ruleIdentifierList ruleType | ruleEmbeddedField ) ( ruleTag )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:201:2: ( ruleIdentifierList ruleType | ruleEmbeddedField ) ( ruleTag )?
			{
			dbg.location(201,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:201:2: ( ruleIdentifierList ruleType | ruleEmbeddedField )
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			try {
				isCyclicDecision = true;
				alt12 = dfa12.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:202:3: ruleIdentifierList ruleType
					{
					dbg.location(202,3);
					pushFollow(FOLLOW_ruleIdentifierList_in_ruleFieldDecl608);
					ruleIdentifierList();
					state._fsp--;
					if (state.failed) return;dbg.location(203,3);
					pushFollow(FOLLOW_ruleType_in_ruleFieldDecl612);
					ruleType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:205:3: ruleEmbeddedField
					{
					dbg.location(205,3);
					pushFollow(FOLLOW_ruleEmbeddedField_in_ruleFieldDecl624);
					ruleEmbeddedField();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(12);}
			dbg.location(207,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:207:2: ( ruleTag )?
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:207:2: ruleTag
					{
					dbg.location(207,2);
					pushFollow(FOLLOW_ruleTag_in_ruleFieldDecl630);
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
		dbg.location(209, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFieldDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFieldDecl"



	// $ANTLR start "ruleIdentifierList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:212:1: ruleIdentifierList : ruleIDENTIFIER ( ',' ruleIDENTIFIER )* ;
	public final void ruleIdentifierList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIdentifierList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(212, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:212:19: ( ruleIDENTIFIER ( ',' ruleIDENTIFIER )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:213:2: ruleIDENTIFIER ( ',' ruleIDENTIFIER )*
			{
			dbg.location(213,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleIdentifierList643);
			ruleIDENTIFIER();
			state._fsp--;
			if (state.failed) return;dbg.location(214,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:214:2: ( ',' ruleIDENTIFIER )*
			try { dbg.enterSubRule(14);

			loop14:
			while (true) {
				int alt14=2;
				try { dbg.enterDecision(14, decisionCanBacktrack[14]);

				int LA14_0 = input.LA(1);
				if ( (LA14_0==45) ) {
					int LA14_2 = input.LA(2);
					if ( (LA14_2==RULE_LETTER) ) {
						int LA14_3 = input.LA(3);
						if ( (synpred26_DebugInternalGo()) ) {
							alt14=1;
						}

					}

				}

				} finally {dbg.exitDecision(14);}

				switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:215:3: ',' ruleIDENTIFIER
					{
					dbg.location(215,3);
					match(input,45,FOLLOW_45_in_ruleIdentifierList650); if (state.failed) return;dbg.location(216,3);
					pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleIdentifierList654);
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
		dbg.location(218, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIdentifierList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIdentifierList"



	// $ANTLR start "ruleEmbeddedField"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:221:1: ruleEmbeddedField : ( '*' )? ruleTypeName ;
	public final void ruleEmbeddedField() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleEmbeddedField");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(221, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:221:18: ( ( '*' )? ruleTypeName )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:222:2: ( '*' )? ruleTypeName
			{
			dbg.location(222,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:222:2: ( '*' )?
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==43) ) {
				alt15=1;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:222:2: '*'
					{
					dbg.location(222,2);
					match(input,43,FOLLOW_43_in_ruleEmbeddedField668); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(15);}
			dbg.location(223,2);
			pushFollow(FOLLOW_ruleTypeName_in_ruleEmbeddedField672);
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
		dbg.location(224, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleEmbeddedField");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleEmbeddedField"



	// $ANTLR start "ruleTag"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:227:1: ruleTag : ruleSTRING_LIT ;
	public final void ruleTag() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTag");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(227, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:227:8: ( ruleSTRING_LIT )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:228:2: ruleSTRING_LIT
			{
			dbg.location(228,2);
			pushFollow(FOLLOW_ruleSTRING_LIT_in_ruleTag682);
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
		dbg.location(229, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTag");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTag"



	// $ANTLR start "rulePointerType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:232:1: rulePointerType : '*' ruleBaseType ;
	public final void rulePointerType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulePointerType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(232, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:232:16: ( '*' ruleBaseType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:233:2: '*' ruleBaseType
			{
			dbg.location(233,2);
			match(input,43,FOLLOW_43_in_rulePointerType692); if (state.failed) return;dbg.location(234,2);
			pushFollow(FOLLOW_ruleBaseType_in_rulePointerType695);
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
		dbg.location(235, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulePointerType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulePointerType"



	// $ANTLR start "ruleBaseType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:238:1: ruleBaseType : ruleType ;
	public final void ruleBaseType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleBaseType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(238, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:238:13: ( ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:239:2: ruleType
			{
			dbg.location(239,2);
			pushFollow(FOLLOW_ruleType_in_ruleBaseType705);
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
		dbg.location(240, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleBaseType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleBaseType"



	// $ANTLR start "ruleFunctionType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:243:1: ruleFunctionType : 'func' ruleSignature ;
	public final void ruleFunctionType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFunctionType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(243, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:243:17: ( 'func' ruleSignature )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:244:2: 'func' ruleSignature
			{
			dbg.location(244,2);
			match(input,68,FOLLOW_68_in_ruleFunctionType715); if (state.failed) return;dbg.location(245,2);
			pushFollow(FOLLOW_ruleSignature_in_ruleFunctionType718);
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
		dbg.location(246, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFunctionType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFunctionType"



	// $ANTLR start "ruleSignature"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:249:1: ruleSignature : ruleParameters ( ruleResult )? ;
	public final void ruleSignature() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSignature");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(249, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:249:14: ( ruleParameters ( ruleResult )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:250:2: ruleParameters ( ruleResult )?
			{
			dbg.location(250,2);
			pushFollow(FOLLOW_ruleParameters_in_ruleSignature728);
			ruleParameters();
			state._fsp--;
			if (state.failed) return;dbg.location(251,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:251:2: ( ruleResult )?
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			switch ( input.LA(1) ) {
				case 41:
					{
					int LA16_1 = input.LA(2);
					if ( (synpred28_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case RULE_LETTER:
					{
					int LA16_2 = input.LA(2);
					if ( (synpred28_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case 54:
					{
					int LA16_3 = input.LA(2);
					if ( (synpred28_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case 78:
					{
					int LA16_4 = input.LA(2);
					if ( (synpred28_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case 43:
					{
					int LA16_5 = input.LA(2);
					if ( (synpred28_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case 68:
					{
					int LA16_6 = input.LA(2);
					if ( (synpred28_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case 72:
					{
					int LA16_7 = input.LA(2);
					if ( (synpred28_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case 73:
					{
					int LA16_8 = input.LA(2);
					if ( (synpred28_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case 60:
					{
					int LA16_9 = input.LA(2);
					if ( (synpred28_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
				case 52:
					{
					int LA16_10 = input.LA(2);
					if ( (synpred28_DebugInternalGo()) ) {
						alt16=1;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:251:2: ruleResult
					{
					dbg.location(251,2);
					pushFollow(FOLLOW_ruleResult_in_ruleSignature731);
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
		dbg.location(253, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSignature");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSignature"



	// $ANTLR start "ruleResult"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:256:1: ruleResult : ( ruleParameters | ruleType ) ;
	public final void ruleResult() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleResult");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(256, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:256:11: ( ( ruleParameters | ruleType ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:257:2: ( ruleParameters | ruleType )
			{
			dbg.location(257,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:257:2: ( ruleParameters | ruleType )
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==41) ) {
				int LA17_1 = input.LA(2);
				if ( (synpred29_DebugInternalGo()) ) {
					alt17=1;
				}
				else if ( (true) ) {
					alt17=2;
				}

			}
			else if ( (LA17_0==RULE_LETTER||LA17_0==43||LA17_0==52||LA17_0==54||LA17_0==60||LA17_0==68||(LA17_0 >= 72 && LA17_0 <= 73)||LA17_0==78) ) {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:258:3: ruleParameters
					{
					dbg.location(258,3);
					pushFollow(FOLLOW_ruleParameters_in_ruleResult748);
					ruleParameters();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:260:3: ruleType
					{
					dbg.location(260,3);
					pushFollow(FOLLOW_ruleType_in_ruleResult760);
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
		dbg.location(262, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleResult");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleResult"



	// $ANTLR start "ruleParameters"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:265:1: ruleParameters : '(' ( ruleParameterList )? ')' ;
	public final void ruleParameters() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleParameters");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(265, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:265:15: ( '(' ( ruleParameterList )? ')' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:266:2: '(' ( ruleParameterList )? ')'
			{
			dbg.location(266,2);
			match(input,41,FOLLOW_41_in_ruleParameters773); if (state.failed) return;dbg.location(267,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:267:2: ( ruleParameterList )?
			int alt18=2;
			try { dbg.enterSubRule(18);
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==RULE_LETTER||LA18_0==41||LA18_0==43||LA18_0==45||LA18_0==48||LA18_0==52||LA18_0==54||LA18_0==60||LA18_0==68||(LA18_0 >= 72 && LA18_0 <= 73)||LA18_0==78) ) {
				alt18=1;
			}
			else if ( (LA18_0==42) ) {
				int LA18_2 = input.LA(2);
				if ( (synpred30_DebugInternalGo()) ) {
					alt18=1;
				}
			}
			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:267:2: ruleParameterList
					{
					dbg.location(267,2);
					pushFollow(FOLLOW_ruleParameterList_in_ruleParameters776);
					ruleParameterList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(18);}
			dbg.location(269,2);
			match(input,42,FOLLOW_42_in_ruleParameters782); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(270, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleParameters");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleParameters"



	// $ANTLR start "ruleParameterList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:273:1: ruleParameterList : ruleParameterDecl ( ',' ruleParameterDecl )* ;
	public final void ruleParameterList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleParameterList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(273, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:273:18: ( ruleParameterDecl ( ',' ruleParameterDecl )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:274:2: ruleParameterDecl ( ',' ruleParameterDecl )*
			{
			dbg.location(274,2);
			pushFollow(FOLLOW_ruleParameterDecl_in_ruleParameterList792);
			ruleParameterDecl();
			state._fsp--;
			if (state.failed) return;dbg.location(275,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:275:2: ( ',' ruleParameterDecl )*
			try { dbg.enterSubRule(19);

			loop19:
			while (true) {
				int alt19=2;
				try { dbg.enterDecision(19, decisionCanBacktrack[19]);

				int LA19_0 = input.LA(1);
				if ( (LA19_0==45) ) {
					alt19=1;
				}

				} finally {dbg.exitDecision(19);}

				switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:276:3: ',' ruleParameterDecl
					{
					dbg.location(276,3);
					match(input,45,FOLLOW_45_in_ruleParameterList799); if (state.failed) return;dbg.location(277,3);
					pushFollow(FOLLOW_ruleParameterDecl_in_ruleParameterList803);
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
		dbg.location(279, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleParameterList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleParameterList"



	// $ANTLR start "ruleParameterDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:282:1: ruleParameterDecl : ( ruleIdentifierList )? ( '...' )? ( ruleType )? ;
	public final void ruleParameterDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleParameterDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(282, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:282:18: ( ( ruleIdentifierList )? ( '...' )? ( ruleType )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:283:2: ( ruleIdentifierList )? ( '...' )? ( ruleType )?
			{
			dbg.location(283,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:283:2: ( ruleIdentifierList )?
			int alt20=2;
			try { dbg.enterSubRule(20);
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			int LA20_0 = input.LA(1);
			if ( (LA20_0==RULE_LETTER) ) {
				int LA20_1 = input.LA(2);
				if ( (synpred32_DebugInternalGo()) ) {
					alt20=1;
				}
			}
			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:283:2: ruleIdentifierList
					{
					dbg.location(283,2);
					pushFollow(FOLLOW_ruleIdentifierList_in_ruleParameterDecl817);
					ruleIdentifierList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(20);}
			dbg.location(285,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:285:2: ( '...' )?
			int alt21=2;
			try { dbg.enterSubRule(21);
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			int LA21_0 = input.LA(1);
			if ( (LA21_0==48) ) {
				alt21=1;
			}
			} finally {dbg.exitDecision(21);}

			switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:285:2: '...'
					{
					dbg.location(285,2);
					match(input,48,FOLLOW_48_in_ruleParameterDecl823); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(21);}
			dbg.location(286,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:286:2: ( ruleType )?
			int alt22=2;
			try { dbg.enterSubRule(22);
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==RULE_LETTER||LA22_0==41||LA22_0==43||LA22_0==52||LA22_0==54||LA22_0==60||LA22_0==68||(LA22_0 >= 72 && LA22_0 <= 73)||LA22_0==78) ) {
				alt22=1;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:286:2: ruleType
					{
					dbg.location(286,2);
					pushFollow(FOLLOW_ruleType_in_ruleParameterDecl827);
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
		dbg.location(288, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleParameterDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleParameterDecl"



	// $ANTLR start "ruleInterfaceType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:291:1: ruleInterfaceType : 'interface' '{' ( ruleMethodSpec ';' )* '}' ;
	public final void ruleInterfaceType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleInterfaceType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(291, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:291:18: ( 'interface' '{' ( ruleMethodSpec ';' )* '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:292:2: 'interface' '{' ( ruleMethodSpec ';' )* '}'
			{
			dbg.location(292,2);
			match(input,72,FOLLOW_72_in_ruleInterfaceType840); if (state.failed) return;dbg.location(293,2);
			match(input,82,FOLLOW_82_in_ruleInterfaceType843); if (state.failed) return;dbg.location(294,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:294:2: ( ruleMethodSpec ';' )*
			try { dbg.enterSubRule(23);

			loop23:
			while (true) {
				int alt23=2;
				try { dbg.enterDecision(23, decisionCanBacktrack[23]);

				int LA23_0 = input.LA(1);
				if ( (LA23_0==RULE_LETTER) ) {
					alt23=1;
				}

				} finally {dbg.exitDecision(23);}

				switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:295:3: ruleMethodSpec ';'
					{
					dbg.location(295,3);
					pushFollow(FOLLOW_ruleMethodSpec_in_ruleInterfaceType850);
					ruleMethodSpec();
					state._fsp--;
					if (state.failed) return;dbg.location(296,3);
					match(input,51,FOLLOW_51_in_ruleInterfaceType854); if (state.failed) return;
					}
					break;

				default :
					break loop23;
				}
			}
			} finally {dbg.exitSubRule(23);}
			dbg.location(298,2);
			match(input,83,FOLLOW_83_in_ruleInterfaceType861); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(299, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleInterfaceType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleInterfaceType"



	// $ANTLR start "ruleMethodSpec"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:302:1: ruleMethodSpec : ( ruleMethodName ruleSignature | ruleInterfaceTypeName ) ;
	public final void ruleMethodSpec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleMethodSpec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(302, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:302:15: ( ( ruleMethodName ruleSignature | ruleInterfaceTypeName ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:303:2: ( ruleMethodName ruleSignature | ruleInterfaceTypeName )
			{
			dbg.location(303,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:303:2: ( ruleMethodName ruleSignature | ruleInterfaceTypeName )
			int alt24=2;
			try { dbg.enterSubRule(24);
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			try {
				isCyclicDecision = true;
				alt24 = dfa24.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:304:3: ruleMethodName ruleSignature
					{
					dbg.location(304,3);
					pushFollow(FOLLOW_ruleMethodName_in_ruleMethodSpec875);
					ruleMethodName();
					state._fsp--;
					if (state.failed) return;dbg.location(305,3);
					pushFollow(FOLLOW_ruleSignature_in_ruleMethodSpec879);
					ruleSignature();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:307:3: ruleInterfaceTypeName
					{
					dbg.location(307,3);
					pushFollow(FOLLOW_ruleInterfaceTypeName_in_ruleMethodSpec891);
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
		dbg.location(309, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleMethodSpec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleMethodSpec"



	// $ANTLR start "ruleMethodName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:312:1: ruleMethodName : ruleIDENTIFIER ;
	public final void ruleMethodName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleMethodName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(312, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:312:15: ( ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:313:2: ruleIDENTIFIER
			{
			dbg.location(313,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleMethodName904);
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
		dbg.location(314, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleMethodName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleMethodName"



	// $ANTLR start "ruleInterfaceTypeName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:317:1: ruleInterfaceTypeName : ruleTypeName ;
	public final void ruleInterfaceTypeName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleInterfaceTypeName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(317, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:317:22: ( ruleTypeName )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:318:2: ruleTypeName
			{
			dbg.location(318,2);
			pushFollow(FOLLOW_ruleTypeName_in_ruleInterfaceTypeName914);
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
		dbg.location(319, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleInterfaceTypeName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleInterfaceTypeName"



	// $ANTLR start "ruleMapType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:322:1: ruleMapType : 'map' '[' ruleKeyType ']' ruleElementType ;
	public final void ruleMapType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleMapType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(322, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:322:12: ( 'map' '[' ruleKeyType ']' ruleElementType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:323:2: 'map' '[' ruleKeyType ']' ruleElementType
			{
			dbg.location(323,2);
			match(input,73,FOLLOW_73_in_ruleMapType924); if (state.failed) return;dbg.location(324,2);
			match(input,54,FOLLOW_54_in_ruleMapType927); if (state.failed) return;dbg.location(325,2);
			pushFollow(FOLLOW_ruleKeyType_in_ruleMapType930);
			ruleKeyType();
			state._fsp--;
			if (state.failed) return;dbg.location(326,2);
			match(input,57,FOLLOW_57_in_ruleMapType933); if (state.failed) return;dbg.location(327,2);
			pushFollow(FOLLOW_ruleElementType_in_ruleMapType936);
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
		dbg.location(328, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleMapType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleMapType"



	// $ANTLR start "ruleKeyType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:331:1: ruleKeyType : ruleType ;
	public final void ruleKeyType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleKeyType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(331, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:331:12: ( ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:332:2: ruleType
			{
			dbg.location(332,2);
			pushFollow(FOLLOW_ruleType_in_ruleKeyType946);
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
		dbg.location(333, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleKeyType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleKeyType"



	// $ANTLR start "ruleChannelType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:336:1: ruleChannelType : ( 'chan' ( '<-' )? | '<-' 'chan' ) ruleElementType ;
	public final void ruleChannelType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleChannelType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(336, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:336:16: ( ( 'chan' ( '<-' )? | '<-' 'chan' ) ruleElementType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:337:2: ( 'chan' ( '<-' )? | '<-' 'chan' ) ruleElementType
			{
			dbg.location(337,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:337:2: ( 'chan' ( '<-' )? | '<-' 'chan' )
			int alt26=2;
			try { dbg.enterSubRule(26);
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			int LA26_0 = input.LA(1);
			if ( (LA26_0==60) ) {
				alt26=1;
			}
			else if ( (LA26_0==52) ) {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:338:3: 'chan' ( '<-' )?
					{
					dbg.location(338,3);
					match(input,60,FOLLOW_60_in_ruleChannelType960); if (state.failed) return;dbg.location(339,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:339:3: ( '<-' )?
					int alt25=2;
					try { dbg.enterSubRule(25);
					try { dbg.enterDecision(25, decisionCanBacktrack[25]);

					int LA25_0 = input.LA(1);
					if ( (LA25_0==52) ) {
						int LA25_1 = input.LA(2);
						if ( (synpred37_DebugInternalGo()) ) {
							alt25=1;
						}
					}
					} finally {dbg.exitDecision(25);}

					switch (alt25) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:339:3: '<-'
							{
							dbg.location(339,3);
							match(input,52,FOLLOW_52_in_ruleChannelType964); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(25);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:341:3: '<-' 'chan'
					{
					dbg.location(341,3);
					match(input,52,FOLLOW_52_in_ruleChannelType977); if (state.failed) return;dbg.location(342,3);
					match(input,60,FOLLOW_60_in_ruleChannelType981); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(26);}
			dbg.location(344,2);
			pushFollow(FOLLOW_ruleElementType_in_ruleChannelType987);
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
		dbg.location(345, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleChannelType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleChannelType"



	// $ANTLR start "ruleBlock"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:348:1: ruleBlock : '{' ruleStatementList '}' ;
	public final void ruleBlock() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(348, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:348:10: ( '{' ruleStatementList '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:349:2: '{' ruleStatementList '}'
			{
			dbg.location(349,2);
			match(input,82,FOLLOW_82_in_ruleBlock997); if (state.failed) return;dbg.location(350,2);
			pushFollow(FOLLOW_ruleStatementList_in_ruleBlock1000);
			ruleStatementList();
			state._fsp--;
			if (state.failed) return;dbg.location(351,2);
			match(input,83,FOLLOW_83_in_ruleBlock1003); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(352, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleBlock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleBlock"



	// $ANTLR start "ruleStatementList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:355:1: ruleStatementList : ( ruleStatement ( ';' )? )* ;
	public final void ruleStatementList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleStatementList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(355, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:355:18: ( ( ruleStatement ( ';' )? )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:356:2: ( ruleStatement ( ';' )? )*
			{
			dbg.location(356,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:356:2: ( ruleStatement ( ';' )? )*
			try { dbg.enterSubRule(28);

			loop28:
			while (true) {
				int alt28=2;
				try { dbg.enterDecision(28, decisionCanBacktrack[28]);

				int LA28_0 = input.LA(1);
				if ( (LA28_0==RULE_DECIMALS||LA28_0==RULE_FLOAT_LIT||(LA28_0 >= RULE_INT_LIT && LA28_0 <= RULE_LETTER)||(LA28_0 >= RULE_STRING && LA28_0 <= RULE_UNARY_OP)||LA28_0==41||LA28_0==43||(LA28_0 >= 51 && LA28_0 <= 52)||(LA28_0 >= 54 && LA28_0 <= 55)||LA28_0==58||(LA28_0 >= 60 && LA28_0 <= 62)||LA28_0==64||(LA28_0 >= 66 && LA28_0 <= 70)||(LA28_0 >= 72 && LA28_0 <= 73)||(LA28_0 >= 76 && LA28_0 <= 82)) ) {
					alt28=1;
				}

				} finally {dbg.exitDecision(28);}

				switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:357:3: ruleStatement ( ';' )?
					{
					dbg.location(357,3);
					pushFollow(FOLLOW_ruleStatement_in_ruleStatementList1017);
					ruleStatement();
					state._fsp--;
					if (state.failed) return;dbg.location(358,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:358:3: ( ';' )?
					int alt27=2;
					try { dbg.enterSubRule(27);
					try { dbg.enterDecision(27, decisionCanBacktrack[27]);

					int LA27_0 = input.LA(1);
					if ( (LA27_0==51) ) {
						int LA27_1 = input.LA(2);
						if ( (synpred39_DebugInternalGo()) ) {
							alt27=1;
						}
					}
					} finally {dbg.exitDecision(27);}

					switch (alt27) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:358:3: ';'
							{
							dbg.location(358,3);
							match(input,51,FOLLOW_51_in_ruleStatementList1021); if (state.failed) return;
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
		dbg.location(360, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleStatementList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleStatementList"



	// $ANTLR start "ruleStatement"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:363:1: ruleStatement : ( ruleDeclaration | ruleLabeledStmt | ruleSimpleStmt | ruleGoStmt | ruleReturnStmt | ruleBreakStmt | ruleContinueStmt | ruleGotoStmt | ruleFallthroughStmt | ruleBlock | ruleIfStmt | ruleSwitchStmt | ruleSelectStmt | ruleForStmt | ruleDeferStmt ) ;
	public final void ruleStatement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleStatement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(363, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:363:14: ( ( ruleDeclaration | ruleLabeledStmt | ruleSimpleStmt | ruleGoStmt | ruleReturnStmt | ruleBreakStmt | ruleContinueStmt | ruleGotoStmt | ruleFallthroughStmt | ruleBlock | ruleIfStmt | ruleSwitchStmt | ruleSelectStmt | ruleForStmt | ruleDeferStmt ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:364:2: ( ruleDeclaration | ruleLabeledStmt | ruleSimpleStmt | ruleGoStmt | ruleReturnStmt | ruleBreakStmt | ruleContinueStmt | ruleGotoStmt | ruleFallthroughStmt | ruleBlock | ruleIfStmt | ruleSwitchStmt | ruleSelectStmt | ruleForStmt | ruleDeferStmt )
			{
			dbg.location(364,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:364:2: ( ruleDeclaration | ruleLabeledStmt | ruleSimpleStmt | ruleGoStmt | ruleReturnStmt | ruleBreakStmt | ruleContinueStmt | ruleGotoStmt | ruleFallthroughStmt | ruleBlock | ruleIfStmt | ruleSwitchStmt | ruleSelectStmt | ruleForStmt | ruleDeferStmt )
			int alt29=15;
			try { dbg.enterSubRule(29);
			try { dbg.enterDecision(29, decisionCanBacktrack[29]);

			try {
				isCyclicDecision = true;
				alt29 = dfa29.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(29);}

			switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:365:3: ruleDeclaration
					{
					dbg.location(365,3);
					pushFollow(FOLLOW_ruleDeclaration_in_ruleStatement1040);
					ruleDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:367:3: ruleLabeledStmt
					{
					dbg.location(367,3);
					pushFollow(FOLLOW_ruleLabeledStmt_in_ruleStatement1052);
					ruleLabeledStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:369:3: ruleSimpleStmt
					{
					dbg.location(369,3);
					pushFollow(FOLLOW_ruleSimpleStmt_in_ruleStatement1064);
					ruleSimpleStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:371:3: ruleGoStmt
					{
					dbg.location(371,3);
					pushFollow(FOLLOW_ruleGoStmt_in_ruleStatement1076);
					ruleGoStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:373:3: ruleReturnStmt
					{
					dbg.location(373,3);
					pushFollow(FOLLOW_ruleReturnStmt_in_ruleStatement1088);
					ruleReturnStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:375:3: ruleBreakStmt
					{
					dbg.location(375,3);
					pushFollow(FOLLOW_ruleBreakStmt_in_ruleStatement1100);
					ruleBreakStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:377:3: ruleContinueStmt
					{
					dbg.location(377,3);
					pushFollow(FOLLOW_ruleContinueStmt_in_ruleStatement1112);
					ruleContinueStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:379:3: ruleGotoStmt
					{
					dbg.location(379,3);
					pushFollow(FOLLOW_ruleGotoStmt_in_ruleStatement1124);
					ruleGotoStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:381:3: ruleFallthroughStmt
					{
					dbg.location(381,3);
					pushFollow(FOLLOW_ruleFallthroughStmt_in_ruleStatement1136);
					ruleFallthroughStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:383:3: ruleBlock
					{
					dbg.location(383,3);
					pushFollow(FOLLOW_ruleBlock_in_ruleStatement1148);
					ruleBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					dbg.enterAlt(11);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:385:3: ruleIfStmt
					{
					dbg.location(385,3);
					pushFollow(FOLLOW_ruleIfStmt_in_ruleStatement1160);
					ruleIfStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					dbg.enterAlt(12);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:387:3: ruleSwitchStmt
					{
					dbg.location(387,3);
					pushFollow(FOLLOW_ruleSwitchStmt_in_ruleStatement1172);
					ruleSwitchStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					dbg.enterAlt(13);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:389:3: ruleSelectStmt
					{
					dbg.location(389,3);
					pushFollow(FOLLOW_ruleSelectStmt_in_ruleStatement1184);
					ruleSelectStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 14 :
					dbg.enterAlt(14);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:391:3: ruleForStmt
					{
					dbg.location(391,3);
					pushFollow(FOLLOW_ruleForStmt_in_ruleStatement1196);
					ruleForStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 15 :
					dbg.enterAlt(15);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:393:3: ruleDeferStmt
					{
					dbg.location(393,3);
					pushFollow(FOLLOW_ruleDeferStmt_in_ruleStatement1208);
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
		dbg.location(395, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleStatement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleStatement"



	// $ANTLR start "ruleDeclaration"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:398:1: ruleDeclaration : ( ruleConstDecl | ruleTypeDecl | ruleVarDecl ) ;
	public final void ruleDeclaration() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleDeclaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(398, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:398:16: ( ( ruleConstDecl | ruleTypeDecl | ruleVarDecl ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:399:2: ( ruleConstDecl | ruleTypeDecl | ruleVarDecl )
			{
			dbg.location(399,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:399:2: ( ruleConstDecl | ruleTypeDecl | ruleVarDecl )
			int alt30=3;
			try { dbg.enterSubRule(30);
			try { dbg.enterDecision(30, decisionCanBacktrack[30]);

			switch ( input.LA(1) ) {
			case 61:
				{
				alt30=1;
				}
				break;
			case 80:
				{
				alt30=2;
				}
				break;
			case 81:
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:400:3: ruleConstDecl
					{
					dbg.location(400,3);
					pushFollow(FOLLOW_ruleConstDecl_in_ruleDeclaration1225);
					ruleConstDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:402:3: ruleTypeDecl
					{
					dbg.location(402,3);
					pushFollow(FOLLOW_ruleTypeDecl_in_ruleDeclaration1237);
					ruleTypeDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:404:3: ruleVarDecl
					{
					dbg.location(404,3);
					pushFollow(FOLLOW_ruleVarDecl_in_ruleDeclaration1249);
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
		dbg.location(406, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleDeclaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleDeclaration"



	// $ANTLR start "ruleLabeledStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:409:1: ruleLabeledStmt : ruleLabel ':' ruleStatement ;
	public final void ruleLabeledStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleLabeledStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(409, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:409:16: ( ruleLabel ':' ruleStatement )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:410:2: ruleLabel ':' ruleStatement
			{
			dbg.location(410,2);
			pushFollow(FOLLOW_ruleLabel_in_ruleLabeledStmt1262);
			ruleLabel();
			state._fsp--;
			if (state.failed) return;dbg.location(411,2);
			match(input,49,FOLLOW_49_in_ruleLabeledStmt1265); if (state.failed) return;dbg.location(412,2);
			pushFollow(FOLLOW_ruleStatement_in_ruleLabeledStmt1268);
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
		dbg.location(413, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleLabeledStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleLabeledStmt"



	// $ANTLR start "ruleSimpleStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:416:1: ruleSimpleStmt : ( ruleIncDecStmt | ruleAssignment | ruleSendStmt | ruleShortVarDecl | ruleExpressionStmt | ruleEmptyStmt ) ;
	public final void ruleSimpleStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSimpleStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(416, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:416:15: ( ( ruleIncDecStmt | ruleAssignment | ruleSendStmt | ruleShortVarDecl | ruleExpressionStmt | ruleEmptyStmt ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:417:2: ( ruleIncDecStmt | ruleAssignment | ruleSendStmt | ruleShortVarDecl | ruleExpressionStmt | ruleEmptyStmt )
			{
			dbg.location(417,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:417:2: ( ruleIncDecStmt | ruleAssignment | ruleSendStmt | ruleShortVarDecl | ruleExpressionStmt | ruleEmptyStmt )
			int alt31=6;
			try { dbg.enterSubRule(31);
			try { dbg.enterDecision(31, decisionCanBacktrack[31]);

			switch ( input.LA(1) ) {
			case RULE_INT_LIT:
				{
				int LA31_1 = input.LA(2);
				if ( (synpred57_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred61_DebugInternalGo()) ) {
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
				if ( (synpred57_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred61_DebugInternalGo()) ) {
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
				if ( (synpred57_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred61_DebugInternalGo()) ) {
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
			case 55:
				{
				int LA31_4 = input.LA(2);
				if ( (synpred57_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred61_DebugInternalGo()) ) {
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
				if ( (synpred57_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred61_DebugInternalGo()) ) {
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
			case 78:
				{
				int LA31_6 = input.LA(2);
				if ( (synpred57_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred61_DebugInternalGo()) ) {
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
			case 54:
				{
				int LA31_7 = input.LA(2);
				if ( (synpred57_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred61_DebugInternalGo()) ) {
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
			case 73:
				{
				int LA31_8 = input.LA(2);
				if ( (synpred57_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred61_DebugInternalGo()) ) {
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
			case RULE_LETTER:
				{
				int LA31_9 = input.LA(2);
				if ( (synpred57_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred60_DebugInternalGo()) ) {
					alt31=4;
				}
				else if ( (synpred61_DebugInternalGo()) ) {
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
			case 68:
				{
				int LA31_10 = input.LA(2);
				if ( (synpred57_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred61_DebugInternalGo()) ) {
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
				if ( (synpred57_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred61_DebugInternalGo()) ) {
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
			case 43:
				{
				int LA31_12 = input.LA(2);
				if ( (synpred57_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred61_DebugInternalGo()) ) {
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
			case 72:
				{
				int LA31_13 = input.LA(2);
				if ( (synpred57_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred61_DebugInternalGo()) ) {
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
			case 60:
				{
				int LA31_14 = input.LA(2);
				if ( (synpred57_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred61_DebugInternalGo()) ) {
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
			case 52:
				{
				int LA31_15 = input.LA(2);
				if ( (synpred57_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred61_DebugInternalGo()) ) {
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
				if ( (synpred57_DebugInternalGo()) ) {
					alt31=1;
				}
				else if ( (synpred58_DebugInternalGo()) ) {
					alt31=2;
				}
				else if ( (synpred59_DebugInternalGo()) ) {
					alt31=3;
				}
				else if ( (synpred61_DebugInternalGo()) ) {
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
			case 51:
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:418:3: ruleIncDecStmt
					{
					dbg.location(418,3);
					pushFollow(FOLLOW_ruleIncDecStmt_in_ruleSimpleStmt1282);
					ruleIncDecStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:420:3: ruleAssignment
					{
					dbg.location(420,3);
					pushFollow(FOLLOW_ruleAssignment_in_ruleSimpleStmt1294);
					ruleAssignment();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:422:3: ruleSendStmt
					{
					dbg.location(422,3);
					pushFollow(FOLLOW_ruleSendStmt_in_ruleSimpleStmt1306);
					ruleSendStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:424:3: ruleShortVarDecl
					{
					dbg.location(424,3);
					pushFollow(FOLLOW_ruleShortVarDecl_in_ruleSimpleStmt1318);
					ruleShortVarDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:426:3: ruleExpressionStmt
					{
					dbg.location(426,3);
					pushFollow(FOLLOW_ruleExpressionStmt_in_ruleSimpleStmt1330);
					ruleExpressionStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:428:3: ruleEmptyStmt
					{
					dbg.location(428,3);
					pushFollow(FOLLOW_ruleEmptyStmt_in_ruleSimpleStmt1342);
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
		dbg.location(430, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSimpleStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSimpleStmt"



	// $ANTLR start "ruleGoStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:433:1: ruleGoStmt : 'goto' ruleLabel ;
	public final void ruleGoStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleGoStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(433, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:433:11: ( 'goto' ruleLabel )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:434:2: 'goto' ruleLabel
			{
			dbg.location(434,2);
			match(input,69,FOLLOW_69_in_ruleGoStmt1355); if (state.failed) return;dbg.location(435,2);
			pushFollow(FOLLOW_ruleLabel_in_ruleGoStmt1358);
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
		dbg.location(436, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleGoStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleGoStmt"



	// $ANTLR start "ruleReturnStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:439:1: ruleReturnStmt : 'return' ( ruleExpressionList )? ;
	public final void ruleReturnStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleReturnStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(439, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:439:15: ( 'return' ( ruleExpressionList )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:440:2: 'return' ( ruleExpressionList )?
			{
			dbg.location(440,2);
			match(input,76,FOLLOW_76_in_ruleReturnStmt1368); if (state.failed) return;dbg.location(441,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:441:2: ( ruleExpressionList )?
			int alt32=2;
			try { dbg.enterSubRule(32);
			try { dbg.enterDecision(32, decisionCanBacktrack[32]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA32_1 = input.LA(2);
					if ( (synpred62_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA32_2 = input.LA(2);
					if ( (synpred62_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA32_3 = input.LA(2);
					if ( (synpred62_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 55:
					{
					int LA32_4 = input.LA(2);
					if ( (synpred62_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA32_5 = input.LA(2);
					if ( (synpred62_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 78:
					{
					int LA32_6 = input.LA(2);
					if ( (synpred62_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 54:
					{
					int LA32_7 = input.LA(2);
					if ( (synpred62_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 73:
					{
					int LA32_8 = input.LA(2);
					if ( (synpred62_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case RULE_LETTER:
					{
					int LA32_9 = input.LA(2);
					if ( (synpred62_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 68:
					{
					int LA32_10 = input.LA(2);
					if ( (synpred62_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 41:
					{
					int LA32_11 = input.LA(2);
					if ( (synpred62_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 43:
					{
					int LA32_12 = input.LA(2);
					if ( (synpred62_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 72:
					{
					int LA32_13 = input.LA(2);
					if ( (synpred62_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 60:
					{
					int LA32_14 = input.LA(2);
					if ( (synpred62_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case 52:
					{
					int LA32_15 = input.LA(2);
					if ( (synpred62_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA32_16 = input.LA(2);
					if ( (synpred62_DebugInternalGo()) ) {
						alt32=1;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(32);}

			switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:441:2: ruleExpressionList
					{
					dbg.location(441,2);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleReturnStmt1371);
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
		dbg.location(443, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleReturnStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleReturnStmt"



	// $ANTLR start "ruleBreakStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:446:1: ruleBreakStmt : 'break' ( ruleLabel )? ;
	public final void ruleBreakStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleBreakStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(446, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:446:14: ( 'break' ( ruleLabel )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:447:2: 'break' ( ruleLabel )?
			{
			dbg.location(447,2);
			match(input,58,FOLLOW_58_in_ruleBreakStmt1384); if (state.failed) return;dbg.location(448,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:448:2: ( ruleLabel )?
			int alt33=2;
			try { dbg.enterSubRule(33);
			try { dbg.enterDecision(33, decisionCanBacktrack[33]);

			int LA33_0 = input.LA(1);
			if ( (LA33_0==RULE_LETTER) ) {
				int LA33_1 = input.LA(2);
				if ( (synpred63_DebugInternalGo()) ) {
					alt33=1;
				}
			}
			} finally {dbg.exitDecision(33);}

			switch (alt33) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:448:2: ruleLabel
					{
					dbg.location(448,2);
					pushFollow(FOLLOW_ruleLabel_in_ruleBreakStmt1387);
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
		dbg.location(449, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleBreakStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleBreakStmt"



	// $ANTLR start "ruleContinueStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:452:1: ruleContinueStmt : 'continue' ( ruleLabel )? ;
	public final void ruleContinueStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleContinueStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(452, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:452:17: ( 'continue' ( ruleLabel )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:453:2: 'continue' ( ruleLabel )?
			{
			dbg.location(453,2);
			match(input,62,FOLLOW_62_in_ruleContinueStmt1398); if (state.failed) return;dbg.location(454,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:454:2: ( ruleLabel )?
			int alt34=2;
			try { dbg.enterSubRule(34);
			try { dbg.enterDecision(34, decisionCanBacktrack[34]);

			int LA34_0 = input.LA(1);
			if ( (LA34_0==RULE_LETTER) ) {
				int LA34_1 = input.LA(2);
				if ( (synpred64_DebugInternalGo()) ) {
					alt34=1;
				}
			}
			} finally {dbg.exitDecision(34);}

			switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:454:2: ruleLabel
					{
					dbg.location(454,2);
					pushFollow(FOLLOW_ruleLabel_in_ruleContinueStmt1401);
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
		dbg.location(455, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleContinueStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleContinueStmt"



	// $ANTLR start "ruleGotoStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:458:1: ruleGotoStmt : 'goto' ruleLabel ;
	public final void ruleGotoStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleGotoStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(458, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:458:13: ( 'goto' ruleLabel )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:459:2: 'goto' ruleLabel
			{
			dbg.location(459,2);
			match(input,69,FOLLOW_69_in_ruleGotoStmt1412); if (state.failed) return;dbg.location(460,2);
			pushFollow(FOLLOW_ruleLabel_in_ruleGotoStmt1415);
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
		dbg.location(461, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleGotoStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleGotoStmt"



	// $ANTLR start "ruleIfStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:464:1: ruleIfStmt : 'if' ( ruleSimpleStmt ';' )? ruleExpression ruleBlock ( 'else' ( ruleIfStmt | ruleBlock ) )? ;
	public final void ruleIfStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIfStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(464, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:464:11: ( 'if' ( ruleSimpleStmt ';' )? ruleExpression ruleBlock ( 'else' ( ruleIfStmt | ruleBlock ) )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:465:2: 'if' ( ruleSimpleStmt ';' )? ruleExpression ruleBlock ( 'else' ( ruleIfStmt | ruleBlock ) )?
			{
			dbg.location(465,2);
			match(input,70,FOLLOW_70_in_ruleIfStmt1425); if (state.failed) return;dbg.location(466,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:466:2: ( ruleSimpleStmt ';' )?
			int alt35=2;
			try { dbg.enterSubRule(35);
			try { dbg.enterDecision(35, decisionCanBacktrack[35]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA35_1 = input.LA(2);
					if ( (synpred65_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA35_2 = input.LA(2);
					if ( (synpred65_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA35_3 = input.LA(2);
					if ( (synpred65_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 55:
					{
					int LA35_4 = input.LA(2);
					if ( (synpred65_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA35_5 = input.LA(2);
					if ( (synpred65_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 78:
					{
					int LA35_6 = input.LA(2);
					if ( (synpred65_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 54:
					{
					int LA35_7 = input.LA(2);
					if ( (synpred65_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 73:
					{
					int LA35_8 = input.LA(2);
					if ( (synpred65_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case RULE_LETTER:
					{
					int LA35_9 = input.LA(2);
					if ( (synpred65_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 68:
					{
					int LA35_10 = input.LA(2);
					if ( (synpred65_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 41:
					{
					int LA35_11 = input.LA(2);
					if ( (synpred65_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 43:
					{
					int LA35_12 = input.LA(2);
					if ( (synpred65_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 72:
					{
					int LA35_13 = input.LA(2);
					if ( (synpred65_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 60:
					{
					int LA35_14 = input.LA(2);
					if ( (synpred65_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 52:
					{
					int LA35_15 = input.LA(2);
					if ( (synpred65_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA35_16 = input.LA(2);
					if ( (synpred65_DebugInternalGo()) ) {
						alt35=1;
					}
					}
					break;
				case 51:
					{
					alt35=1;
					}
					break;
			}
			} finally {dbg.exitDecision(35);}

			switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:467:3: ruleSimpleStmt ';'
					{
					dbg.location(467,3);
					pushFollow(FOLLOW_ruleSimpleStmt_in_ruleIfStmt1432);
					ruleSimpleStmt();
					state._fsp--;
					if (state.failed) return;dbg.location(468,3);
					match(input,51,FOLLOW_51_in_ruleIfStmt1436); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(35);}
			dbg.location(470,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleIfStmt1443);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(471,2);
			pushFollow(FOLLOW_ruleBlock_in_ruleIfStmt1446);
			ruleBlock();
			state._fsp--;
			if (state.failed) return;dbg.location(472,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:472:2: ( 'else' ( ruleIfStmt | ruleBlock ) )?
			int alt37=2;
			try { dbg.enterSubRule(37);
			try { dbg.enterDecision(37, decisionCanBacktrack[37]);

			int LA37_0 = input.LA(1);
			if ( (LA37_0==65) ) {
				alt37=1;
			}
			} finally {dbg.exitDecision(37);}

			switch (alt37) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:473:3: 'else' ( ruleIfStmt | ruleBlock )
					{
					dbg.location(473,3);
					match(input,65,FOLLOW_65_in_ruleIfStmt1453); if (state.failed) return;dbg.location(474,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:474:3: ( ruleIfStmt | ruleBlock )
					int alt36=2;
					try { dbg.enterSubRule(36);
					try { dbg.enterDecision(36, decisionCanBacktrack[36]);

					int LA36_0 = input.LA(1);
					if ( (LA36_0==70) ) {
						alt36=1;
					}
					else if ( (LA36_0==82) ) {
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

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:475:4: ruleIfStmt
							{
							dbg.location(475,4);
							pushFollow(FOLLOW_ruleIfStmt_in_ruleIfStmt1462);
							ruleIfStmt();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:477:4: ruleBlock
							{
							dbg.location(477,4);
							pushFollow(FOLLOW_ruleBlock_in_ruleIfStmt1476);
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
		dbg.location(480, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIfStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIfStmt"



	// $ANTLR start "ruleFallthroughStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:483:1: ruleFallthroughStmt : 'fallthrough' ;
	public final void ruleFallthroughStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFallthroughStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(483, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:483:20: ( 'fallthrough' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:484:2: 'fallthrough'
			{
			dbg.location(484,2);
			match(input,66,FOLLOW_66_in_ruleFallthroughStmt1494); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(485, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFallthroughStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFallthroughStmt"



	// $ANTLR start "ruleSwitchStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:488:1: ruleSwitchStmt : ( ruleExprSwitchStmt | ruleTypeSwitchStmt ) ;
	public final void ruleSwitchStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSwitchStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(488, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:488:15: ( ( ruleExprSwitchStmt | ruleTypeSwitchStmt ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:489:2: ( ruleExprSwitchStmt | ruleTypeSwitchStmt )
			{
			dbg.location(489,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:489:2: ( ruleExprSwitchStmt | ruleTypeSwitchStmt )
			int alt38=2;
			try { dbg.enterSubRule(38);
			try { dbg.enterDecision(38, decisionCanBacktrack[38]);

			int LA38_0 = input.LA(1);
			if ( (LA38_0==79) ) {
				int LA38_1 = input.LA(2);
				if ( (synpred68_DebugInternalGo()) ) {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:490:3: ruleExprSwitchStmt
					{
					dbg.location(490,3);
					pushFollow(FOLLOW_ruleExprSwitchStmt_in_ruleSwitchStmt1508);
					ruleExprSwitchStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:492:3: ruleTypeSwitchStmt
					{
					dbg.location(492,3);
					pushFollow(FOLLOW_ruleTypeSwitchStmt_in_ruleSwitchStmt1520);
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
		dbg.location(494, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSwitchStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSwitchStmt"



	// $ANTLR start "ruleSelectStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:497:1: ruleSelectStmt : 'select' '{' ( ruleCommClause )* '}' ;
	public final void ruleSelectStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSelectStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(497, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:497:15: ( 'select' '{' ( ruleCommClause )* '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:498:2: 'select' '{' ( ruleCommClause )* '}'
			{
			dbg.location(498,2);
			match(input,77,FOLLOW_77_in_ruleSelectStmt1533); if (state.failed) return;dbg.location(499,2);
			match(input,82,FOLLOW_82_in_ruleSelectStmt1536); if (state.failed) return;dbg.location(500,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:500:2: ( ruleCommClause )*
			try { dbg.enterSubRule(39);

			loop39:
			while (true) {
				int alt39=2;
				try { dbg.enterDecision(39, decisionCanBacktrack[39]);

				int LA39_0 = input.LA(1);
				if ( (LA39_0==59||LA39_0==63) ) {
					alt39=1;
				}

				} finally {dbg.exitDecision(39);}

				switch (alt39) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:500:2: ruleCommClause
					{
					dbg.location(500,2);
					pushFollow(FOLLOW_ruleCommClause_in_ruleSelectStmt1539);
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
			dbg.location(502,2);
			match(input,83,FOLLOW_83_in_ruleSelectStmt1545); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(503, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSelectStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSelectStmt"



	// $ANTLR start "ruleForStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:506:1: ruleForStmt : 'for' ( ruleCondition | ruleForClause | ruleRangeClause )? ruleBlock ;
	public final void ruleForStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleForStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(506, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:506:12: ( 'for' ( ruleCondition | ruleForClause | ruleRangeClause )? ruleBlock )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:507:2: 'for' ( ruleCondition | ruleForClause | ruleRangeClause )? ruleBlock
			{
			dbg.location(507,2);
			match(input,67,FOLLOW_67_in_ruleForStmt1555); if (state.failed) return;dbg.location(508,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:508:2: ( ruleCondition | ruleForClause | ruleRangeClause )?
			int alt40=4;
			try { dbg.enterSubRule(40);
			try { dbg.enterDecision(40, decisionCanBacktrack[40]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA40_1 = input.LA(2);
					if ( (synpred70_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred72_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA40_2 = input.LA(2);
					if ( (synpred70_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred72_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA40_3 = input.LA(2);
					if ( (synpred70_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred72_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 55:
					{
					int LA40_4 = input.LA(2);
					if ( (synpred70_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred72_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA40_5 = input.LA(2);
					if ( (synpred70_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred72_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 78:
					{
					int LA40_6 = input.LA(2);
					if ( (synpred70_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred72_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 54:
					{
					int LA40_7 = input.LA(2);
					if ( (synpred70_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred72_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 73:
					{
					int LA40_8 = input.LA(2);
					if ( (synpred70_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred72_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case RULE_LETTER:
					{
					int LA40_9 = input.LA(2);
					if ( (synpred70_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred72_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 68:
					{
					int LA40_10 = input.LA(2);
					if ( (synpred70_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred72_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 41:
					{
					int LA40_11 = input.LA(2);
					if ( (synpred70_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred72_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 43:
					{
					int LA40_12 = input.LA(2);
					if ( (synpred70_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred72_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 72:
					{
					int LA40_13 = input.LA(2);
					if ( (synpred70_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred72_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 60:
					{
					int LA40_14 = input.LA(2);
					if ( (synpred70_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred72_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 52:
					{
					int LA40_15 = input.LA(2);
					if ( (synpred70_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred72_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA40_16 = input.LA(2);
					if ( (synpred70_DebugInternalGo()) ) {
						alt40=1;
					}
					else if ( (synpred71_DebugInternalGo()) ) {
						alt40=2;
					}
					else if ( (synpred72_DebugInternalGo()) ) {
						alt40=3;
					}
					}
					break;
				case 51:
					{
					alt40=2;
					}
					break;
				case 75:
					{
					alt40=3;
					}
					break;
			}
			} finally {dbg.exitDecision(40);}

			switch (alt40) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:509:3: ruleCondition
					{
					dbg.location(509,3);
					pushFollow(FOLLOW_ruleCondition_in_ruleForStmt1562);
					ruleCondition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:511:3: ruleForClause
					{
					dbg.location(511,3);
					pushFollow(FOLLOW_ruleForClause_in_ruleForStmt1574);
					ruleForClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:513:3: ruleRangeClause
					{
					dbg.location(513,3);
					pushFollow(FOLLOW_ruleRangeClause_in_ruleForStmt1586);
					ruleRangeClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(40);}
			dbg.location(515,2);
			pushFollow(FOLLOW_ruleBlock_in_ruleForStmt1593);
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
		dbg.location(516, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleForStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleForStmt"



	// $ANTLR start "ruleDeferStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:519:1: ruleDeferStmt : 'defer' ruleExpression ;
	public final void ruleDeferStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleDeferStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(519, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:519:14: ( 'defer' ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:520:2: 'defer' ruleExpression
			{
			dbg.location(520,2);
			match(input,64,FOLLOW_64_in_ruleDeferStmt1603); if (state.failed) return;dbg.location(521,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleDeferStmt1606);
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
		dbg.location(522, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleDeferStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleDeferStmt"



	// $ANTLR start "ruleConstDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:525:1: ruleConstDecl : 'const' ( ruleConstSpec | '(' ( ruleConstSpec ( ';' )? )* ')' ) ;
	public final void ruleConstDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleConstDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(525, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:525:14: ( 'const' ( ruleConstSpec | '(' ( ruleConstSpec ( ';' )? )* ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:526:2: 'const' ( ruleConstSpec | '(' ( ruleConstSpec ( ';' )? )* ')' )
			{
			dbg.location(526,2);
			match(input,61,FOLLOW_61_in_ruleConstDecl1616); if (state.failed) return;dbg.location(527,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:527:2: ( ruleConstSpec | '(' ( ruleConstSpec ( ';' )? )* ')' )
			int alt43=2;
			try { dbg.enterSubRule(43);
			try { dbg.enterDecision(43, decisionCanBacktrack[43]);

			int LA43_0 = input.LA(1);
			if ( (LA43_0==RULE_LETTER) ) {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:528:3: ruleConstSpec
					{
					dbg.location(528,3);
					pushFollow(FOLLOW_ruleConstSpec_in_ruleConstDecl1623);
					ruleConstSpec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:530:3: '(' ( ruleConstSpec ( ';' )? )* ')'
					{
					dbg.location(530,3);
					match(input,41,FOLLOW_41_in_ruleConstDecl1635); if (state.failed) return;dbg.location(531,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:531:3: ( ruleConstSpec ( ';' )? )*
					try { dbg.enterSubRule(42);

					loop42:
					while (true) {
						int alt42=2;
						try { dbg.enterDecision(42, decisionCanBacktrack[42]);

						int LA42_0 = input.LA(1);
						if ( (LA42_0==RULE_LETTER) ) {
							alt42=1;
						}

						} finally {dbg.exitDecision(42);}

						switch (alt42) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:532:4: ruleConstSpec ( ';' )?
							{
							dbg.location(532,4);
							pushFollow(FOLLOW_ruleConstSpec_in_ruleConstDecl1644);
							ruleConstSpec();
							state._fsp--;
							if (state.failed) return;dbg.location(533,4);
							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:533:4: ( ';' )?
							int alt41=2;
							try { dbg.enterSubRule(41);
							try { dbg.enterDecision(41, decisionCanBacktrack[41]);

							int LA41_0 = input.LA(1);
							if ( (LA41_0==51) ) {
								alt41=1;
							}
							} finally {dbg.exitDecision(41);}

							switch (alt41) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:533:4: ';'
									{
									dbg.location(533,4);
									match(input,51,FOLLOW_51_in_ruleConstDecl1649); if (state.failed) return;
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
					dbg.location(535,3);
					match(input,42,FOLLOW_42_in_ruleConstDecl1659); if (state.failed) return;
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
		dbg.location(537, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleConstDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleConstDecl"



	// $ANTLR start "ruleConstSpec"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:540:1: ruleConstSpec : ruleIdentifierList ( ( ruleType )? '=' ruleExpressionList )? ;
	public final void ruleConstSpec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleConstSpec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(540, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:540:14: ( ruleIdentifierList ( ( ruleType )? '=' ruleExpressionList )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:541:2: ruleIdentifierList ( ( ruleType )? '=' ruleExpressionList )?
			{
			dbg.location(541,2);
			pushFollow(FOLLOW_ruleIdentifierList_in_ruleConstSpec1672);
			ruleIdentifierList();
			state._fsp--;
			if (state.failed) return;dbg.location(542,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:542:2: ( ( ruleType )? '=' ruleExpressionList )?
			int alt45=2;
			try { dbg.enterSubRule(45);
			try { dbg.enterDecision(45, decisionCanBacktrack[45]);

			switch ( input.LA(1) ) {
				case RULE_LETTER:
					{
					int LA45_1 = input.LA(2);
					if ( (synpred77_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 54:
					{
					int LA45_2 = input.LA(2);
					if ( (synpred77_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 78:
					{
					int LA45_3 = input.LA(2);
					if ( (synpred77_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 43:
					{
					int LA45_4 = input.LA(2);
					if ( (synpred77_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 68:
					{
					int LA45_5 = input.LA(2);
					if ( (synpred77_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 72:
					{
					int LA45_6 = input.LA(2);
					if ( (synpred77_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 73:
					{
					int LA45_7 = input.LA(2);
					if ( (synpred77_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 60:
					{
					int LA45_8 = input.LA(2);
					if ( (synpred77_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 52:
					{
					int LA45_9 = input.LA(2);
					if ( (synpred77_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 41:
					{
					int LA45_10 = input.LA(2);
					if ( (synpred77_DebugInternalGo()) ) {
						alt45=1;
					}
					}
					break;
				case 53:
					{
					alt45=1;
					}
					break;
			}
			} finally {dbg.exitDecision(45);}

			switch (alt45) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:543:3: ( ruleType )? '=' ruleExpressionList
					{
					dbg.location(543,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:543:3: ( ruleType )?
					int alt44=2;
					try { dbg.enterSubRule(44);
					try { dbg.enterDecision(44, decisionCanBacktrack[44]);

					int LA44_0 = input.LA(1);
					if ( (LA44_0==RULE_LETTER||LA44_0==41||LA44_0==43||LA44_0==52||LA44_0==54||LA44_0==60||LA44_0==68||(LA44_0 >= 72 && LA44_0 <= 73)||LA44_0==78) ) {
						alt44=1;
					}
					} finally {dbg.exitDecision(44);}

					switch (alt44) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:543:3: ruleType
							{
							dbg.location(543,3);
							pushFollow(FOLLOW_ruleType_in_ruleConstSpec1679);
							ruleType();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(44);}
					dbg.location(545,3);
					match(input,53,FOLLOW_53_in_ruleConstSpec1687); if (state.failed) return;dbg.location(546,3);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleConstSpec1691);
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
		dbg.location(548, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleConstSpec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleConstSpec"



	// $ANTLR start "ruleTypeDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:551:1: ruleTypeDecl : 'type' ( ruleTypeSpec | '(' ( ruleTypeSpec ';' )* ')' ) ;
	public final void ruleTypeDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(551, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:551:13: ( 'type' ( ruleTypeSpec | '(' ( ruleTypeSpec ';' )* ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:552:2: 'type' ( ruleTypeSpec | '(' ( ruleTypeSpec ';' )* ')' )
			{
			dbg.location(552,2);
			match(input,80,FOLLOW_80_in_ruleTypeDecl1705); if (state.failed) return;dbg.location(553,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:553:2: ( ruleTypeSpec | '(' ( ruleTypeSpec ';' )* ')' )
			int alt47=2;
			try { dbg.enterSubRule(47);
			try { dbg.enterDecision(47, decisionCanBacktrack[47]);

			int LA47_0 = input.LA(1);
			if ( (LA47_0==RULE_LETTER) ) {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:554:3: ruleTypeSpec
					{
					dbg.location(554,3);
					pushFollow(FOLLOW_ruleTypeSpec_in_ruleTypeDecl1712);
					ruleTypeSpec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:556:3: '(' ( ruleTypeSpec ';' )* ')'
					{
					dbg.location(556,3);
					match(input,41,FOLLOW_41_in_ruleTypeDecl1724); if (state.failed) return;dbg.location(557,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:557:3: ( ruleTypeSpec ';' )*
					try { dbg.enterSubRule(46);

					loop46:
					while (true) {
						int alt46=2;
						try { dbg.enterDecision(46, decisionCanBacktrack[46]);

						int LA46_0 = input.LA(1);
						if ( (LA46_0==RULE_LETTER) ) {
							alt46=1;
						}

						} finally {dbg.exitDecision(46);}

						switch (alt46) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:558:4: ruleTypeSpec ';'
							{
							dbg.location(558,4);
							pushFollow(FOLLOW_ruleTypeSpec_in_ruleTypeDecl1733);
							ruleTypeSpec();
							state._fsp--;
							if (state.failed) return;dbg.location(559,4);
							match(input,51,FOLLOW_51_in_ruleTypeDecl1738); if (state.failed) return;
							}
							break;

						default :
							break loop46;
						}
					}
					} finally {dbg.exitSubRule(46);}
					dbg.location(561,3);
					match(input,42,FOLLOW_42_in_ruleTypeDecl1747); if (state.failed) return;
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
		dbg.location(563, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeDecl"



	// $ANTLR start "ruleTypeSpec"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:566:1: ruleTypeSpec : ( ruleAliasDecl | ruleTypeDef ) ;
	public final void ruleTypeSpec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeSpec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(566, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:566:13: ( ( ruleAliasDecl | ruleTypeDef ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:567:2: ( ruleAliasDecl | ruleTypeDef )
			{
			dbg.location(567,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:567:2: ( ruleAliasDecl | ruleTypeDef )
			int alt48=2;
			try { dbg.enterSubRule(48);
			try { dbg.enterDecision(48, decisionCanBacktrack[48]);

			try {
				isCyclicDecision = true;
				alt48 = dfa48.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(48);}

			switch (alt48) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:568:3: ruleAliasDecl
					{
					dbg.location(568,3);
					pushFollow(FOLLOW_ruleAliasDecl_in_ruleTypeSpec1764);
					ruleAliasDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:570:3: ruleTypeDef
					{
					dbg.location(570,3);
					pushFollow(FOLLOW_ruleTypeDef_in_ruleTypeSpec1776);
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
		dbg.location(572, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeSpec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeSpec"



	// $ANTLR start "ruleTypeDef"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:575:1: ruleTypeDef : ruleIDENTIFIER ruleType ;
	public final void ruleTypeDef() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeDef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(575, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:575:12: ( ruleIDENTIFIER ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:576:2: ruleIDENTIFIER ruleType
			{
			dbg.location(576,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleTypeDef1789);
			ruleIDENTIFIER();
			state._fsp--;
			if (state.failed) return;dbg.location(577,2);
			pushFollow(FOLLOW_ruleType_in_ruleTypeDef1792);
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
		dbg.location(578, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeDef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeDef"



	// $ANTLR start "ruleAliasDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:581:1: ruleAliasDecl : ruleIDENTIFIER '=' ruleType ;
	public final void ruleAliasDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleAliasDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(581, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:581:14: ( ruleIDENTIFIER '=' ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:582:2: ruleIDENTIFIER '=' ruleType
			{
			dbg.location(582,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleAliasDecl1802);
			ruleIDENTIFIER();
			state._fsp--;
			if (state.failed) return;dbg.location(583,2);
			match(input,53,FOLLOW_53_in_ruleAliasDecl1805); if (state.failed) return;dbg.location(584,2);
			pushFollow(FOLLOW_ruleType_in_ruleAliasDecl1808);
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
		dbg.location(585, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleAliasDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleAliasDecl"



	// $ANTLR start "ruleVarDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:588:1: ruleVarDecl : 'var' ( ruleVarSpec | '(' ( ruleVarSpec ';' )* ')' ) ;
	public final void ruleVarDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleVarDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(588, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:588:12: ( 'var' ( ruleVarSpec | '(' ( ruleVarSpec ';' )* ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:589:2: 'var' ( ruleVarSpec | '(' ( ruleVarSpec ';' )* ')' )
			{
			dbg.location(589,2);
			match(input,81,FOLLOW_81_in_ruleVarDecl1818); if (state.failed) return;dbg.location(590,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:590:2: ( ruleVarSpec | '(' ( ruleVarSpec ';' )* ')' )
			int alt50=2;
			try { dbg.enterSubRule(50);
			try { dbg.enterDecision(50, decisionCanBacktrack[50]);

			int LA50_0 = input.LA(1);
			if ( (LA50_0==RULE_LETTER) ) {
				alt50=1;
			}
			else if ( (LA50_0==41) ) {
				alt50=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(50);}

			switch (alt50) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:591:3: ruleVarSpec
					{
					dbg.location(591,3);
					pushFollow(FOLLOW_ruleVarSpec_in_ruleVarDecl1825);
					ruleVarSpec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:593:3: '(' ( ruleVarSpec ';' )* ')'
					{
					dbg.location(593,3);
					match(input,41,FOLLOW_41_in_ruleVarDecl1837); if (state.failed) return;dbg.location(594,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:594:3: ( ruleVarSpec ';' )*
					try { dbg.enterSubRule(49);

					loop49:
					while (true) {
						int alt49=2;
						try { dbg.enterDecision(49, decisionCanBacktrack[49]);

						int LA49_0 = input.LA(1);
						if ( (LA49_0==RULE_LETTER) ) {
							alt49=1;
						}

						} finally {dbg.exitDecision(49);}

						switch (alt49) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:595:4: ruleVarSpec ';'
							{
							dbg.location(595,4);
							pushFollow(FOLLOW_ruleVarSpec_in_ruleVarDecl1846);
							ruleVarSpec();
							state._fsp--;
							if (state.failed) return;dbg.location(596,4);
							match(input,51,FOLLOW_51_in_ruleVarDecl1851); if (state.failed) return;
							}
							break;

						default :
							break loop49;
						}
					}
					} finally {dbg.exitSubRule(49);}
					dbg.location(598,3);
					match(input,42,FOLLOW_42_in_ruleVarDecl1860); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(50);}

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
			dbg.exitRule(getGrammarFileName(), "ruleVarDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleVarDecl"



	// $ANTLR start "ruleVarSpec"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:603:1: ruleVarSpec : ruleIdentifierList ( ruleType )? ( '=' ruleExpressionList )? ;
	public final void ruleVarSpec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleVarSpec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(603, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:603:12: ( ruleIdentifierList ( ruleType )? ( '=' ruleExpressionList )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:604:2: ruleIdentifierList ( ruleType )? ( '=' ruleExpressionList )?
			{
			dbg.location(604,2);
			pushFollow(FOLLOW_ruleIdentifierList_in_ruleVarSpec1873);
			ruleIdentifierList();
			state._fsp--;
			if (state.failed) return;dbg.location(605,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:605:2: ( ruleType )?
			int alt51=2;
			try { dbg.enterSubRule(51);
			try { dbg.enterDecision(51, decisionCanBacktrack[51]);

			switch ( input.LA(1) ) {
				case RULE_LETTER:
					{
					int LA51_1 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt51=1;
					}
					}
					break;
				case 54:
					{
					int LA51_2 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt51=1;
					}
					}
					break;
				case 78:
					{
					int LA51_3 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt51=1;
					}
					}
					break;
				case 43:
					{
					int LA51_4 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt51=1;
					}
					}
					break;
				case 68:
					{
					int LA51_5 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt51=1;
					}
					}
					break;
				case 72:
					{
					int LA51_6 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt51=1;
					}
					}
					break;
				case 73:
					{
					int LA51_7 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt51=1;
					}
					}
					break;
				case 60:
					{
					int LA51_8 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt51=1;
					}
					}
					break;
				case 52:
					{
					int LA51_9 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt51=1;
					}
					}
					break;
				case 41:
					{
					int LA51_10 = input.LA(2);
					if ( (synpred83_DebugInternalGo()) ) {
						alt51=1;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(51);}

			switch (alt51) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:605:2: ruleType
					{
					dbg.location(605,2);
					pushFollow(FOLLOW_ruleType_in_ruleVarSpec1876);
					ruleType();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(51);}
			dbg.location(607,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:607:2: ( '=' ruleExpressionList )?
			int alt52=2;
			try { dbg.enterSubRule(52);
			try { dbg.enterDecision(52, decisionCanBacktrack[52]);

			int LA52_0 = input.LA(1);
			if ( (LA52_0==53) ) {
				alt52=1;
			}
			} finally {dbg.exitDecision(52);}

			switch (alt52) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:608:3: '=' ruleExpressionList
					{
					dbg.location(608,3);
					match(input,53,FOLLOW_53_in_ruleVarSpec1886); if (state.failed) return;dbg.location(609,3);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleVarSpec1890);
					ruleExpressionList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(52);}

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
			dbg.exitRule(getGrammarFileName(), "ruleVarSpec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleVarSpec"



	// $ANTLR start "ruleEmptyStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:614:1: ruleEmptyStmt : ';' ;
	public final void ruleEmptyStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleEmptyStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(614, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:614:14: ( ';' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:615:2: ';'
			{
			dbg.location(615,2);
			match(input,51,FOLLOW_51_in_ruleEmptyStmt1904); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "ruleEmptyStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleEmptyStmt"



	// $ANTLR start "ruleExpressionStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:619:1: ruleExpressionStmt : ruleExpression ;
	public final void ruleExpressionStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExpressionStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(619, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:619:19: ( ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:620:2: ruleExpression
			{
			dbg.location(620,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleExpressionStmt1914);
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
		dbg.location(621, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExpressionStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExpressionStmt"



	// $ANTLR start "ruleSendStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:624:1: ruleSendStmt : ruleChannel '<-' ruleExpression ;
	public final void ruleSendStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSendStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(624, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:624:13: ( ruleChannel '<-' ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:625:2: ruleChannel '<-' ruleExpression
			{
			dbg.location(625,2);
			pushFollow(FOLLOW_ruleChannel_in_ruleSendStmt1924);
			ruleChannel();
			state._fsp--;
			if (state.failed) return;dbg.location(626,2);
			match(input,52,FOLLOW_52_in_ruleSendStmt1927); if (state.failed) return;dbg.location(627,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleSendStmt1930);
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
			dbg.exitRule(getGrammarFileName(), "ruleSendStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSendStmt"



	// $ANTLR start "ruleChannel"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:631:1: ruleChannel : ruleExpression ;
	public final void ruleChannel() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleChannel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(631, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:631:12: ( ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:632:2: ruleExpression
			{
			dbg.location(632,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleChannel1940);
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
		dbg.location(633, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleChannel");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleChannel"



	// $ANTLR start "ruleIncDecStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:636:1: ruleIncDecStmt : ( ruleExpression '++' | ruleExpression '--' ) ;
	public final void ruleIncDecStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIncDecStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(636, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:636:15: ( ( ruleExpression '++' | ruleExpression '--' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:637:2: ( ruleExpression '++' | ruleExpression '--' )
			{
			dbg.location(637,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:637:2: ( ruleExpression '++' | ruleExpression '--' )
			int alt53=2;
			try { dbg.enterSubRule(53);
			try { dbg.enterDecision(53, decisionCanBacktrack[53]);

			switch ( input.LA(1) ) {
			case RULE_INT_LIT:
				{
				int LA53_1 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt53=1;
				}
				else if ( (true) ) {
					alt53=2;
				}

				}
				break;
			case RULE_FLOAT_LIT:
				{
				int LA53_2 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt53=1;
				}
				else if ( (true) ) {
					alt53=2;
				}

				}
				break;
			case RULE_DECIMALS:
				{
				int LA53_3 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt53=1;
				}
				else if ( (true) ) {
					alt53=2;
				}

				}
				break;
			case 55:
				{
				int LA53_4 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt53=1;
				}
				else if ( (true) ) {
					alt53=2;
				}

				}
				break;
			case RULE_STRING:
				{
				int LA53_5 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt53=1;
				}
				else if ( (true) ) {
					alt53=2;
				}

				}
				break;
			case 78:
				{
				int LA53_6 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt53=1;
				}
				else if ( (true) ) {
					alt53=2;
				}

				}
				break;
			case 54:
				{
				int LA53_7 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt53=1;
				}
				else if ( (true) ) {
					alt53=2;
				}

				}
				break;
			case 73:
				{
				int LA53_8 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt53=1;
				}
				else if ( (true) ) {
					alt53=2;
				}

				}
				break;
			case RULE_LETTER:
				{
				int LA53_9 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt53=1;
				}
				else if ( (true) ) {
					alt53=2;
				}

				}
				break;
			case 68:
				{
				int LA53_10 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt53=1;
				}
				else if ( (true) ) {
					alt53=2;
				}

				}
				break;
			case 41:
				{
				int LA53_11 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt53=1;
				}
				else if ( (true) ) {
					alt53=2;
				}

				}
				break;
			case 43:
				{
				int LA53_12 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt53=1;
				}
				else if ( (true) ) {
					alt53=2;
				}

				}
				break;
			case 72:
				{
				int LA53_13 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt53=1;
				}
				else if ( (true) ) {
					alt53=2;
				}

				}
				break;
			case 60:
				{
				int LA53_14 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt53=1;
				}
				else if ( (true) ) {
					alt53=2;
				}

				}
				break;
			case 52:
				{
				int LA53_15 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt53=1;
				}
				else if ( (true) ) {
					alt53=2;
				}

				}
				break;
			case RULE_UNARY_OP:
				{
				int LA53_16 = input.LA(2);
				if ( (synpred85_DebugInternalGo()) ) {
					alt53=1;
				}
				else if ( (true) ) {
					alt53=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(53);}

			switch (alt53) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:638:3: ruleExpression '++'
					{
					dbg.location(638,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleIncDecStmt1954);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(639,3);
					match(input,44,FOLLOW_44_in_ruleIncDecStmt1958); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:641:3: ruleExpression '--'
					{
					dbg.location(641,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleIncDecStmt1970);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(642,3);
					match(input,46,FOLLOW_46_in_ruleIncDecStmt1974); if (state.failed) return;
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
		dbg.location(644, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIncDecStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIncDecStmt"



	// $ANTLR start "ruleAssignment"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:647:1: ruleAssignment : ruleExpressionList RULE_ASSING_OP ruleExpressionList ;
	public final void ruleAssignment() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleAssignment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(647, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:647:15: ( ruleExpressionList RULE_ASSING_OP ruleExpressionList )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:648:2: ruleExpressionList RULE_ASSING_OP ruleExpressionList
			{
			dbg.location(648,2);
			pushFollow(FOLLOW_ruleExpressionList_in_ruleAssignment1987);
			ruleExpressionList();
			state._fsp--;
			if (state.failed) return;dbg.location(649,2);
			match(input,RULE_ASSING_OP,FOLLOW_RULE_ASSING_OP_in_ruleAssignment1990); if (state.failed) return;dbg.location(650,2);
			pushFollow(FOLLOW_ruleExpressionList_in_ruleAssignment1993);
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
		dbg.location(651, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleAssignment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleAssignment"



	// $ANTLR start "ruleShortVarDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:654:1: ruleShortVarDecl : ruleIdentifierList ':=' ruleExpressionList ;
	public final void ruleShortVarDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleShortVarDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(654, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:654:17: ( ruleIdentifierList ':=' ruleExpressionList )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:655:2: ruleIdentifierList ':=' ruleExpressionList
			{
			dbg.location(655,2);
			pushFollow(FOLLOW_ruleIdentifierList_in_ruleShortVarDecl2003);
			ruleIdentifierList();
			state._fsp--;
			if (state.failed) return;dbg.location(656,2);
			match(input,50,FOLLOW_50_in_ruleShortVarDecl2006); if (state.failed) return;dbg.location(657,2);
			pushFollow(FOLLOW_ruleExpressionList_in_ruleShortVarDecl2009);
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
		dbg.location(658, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleShortVarDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleShortVarDecl"



	// $ANTLR start "ruleExprSwitchStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:661:1: ruleExprSwitchStmt : 'switch' ( ruleSimpleStmt ';' )? ( ruleExpression )? '{' ( ruleExprCaseClause )* '}' ;
	public final void ruleExprSwitchStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExprSwitchStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(661, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:661:19: ( 'switch' ( ruleSimpleStmt ';' )? ( ruleExpression )? '{' ( ruleExprCaseClause )* '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:662:2: 'switch' ( ruleSimpleStmt ';' )? ( ruleExpression )? '{' ( ruleExprCaseClause )* '}'
			{
			dbg.location(662,2);
			match(input,79,FOLLOW_79_in_ruleExprSwitchStmt2019); if (state.failed) return;dbg.location(663,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:663:2: ( ruleSimpleStmt ';' )?
			int alt54=2;
			try { dbg.enterSubRule(54);
			try { dbg.enterDecision(54, decisionCanBacktrack[54]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA54_1 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt54=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA54_2 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt54=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA54_3 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt54=1;
					}
					}
					break;
				case 55:
					{
					int LA54_4 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt54=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA54_5 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt54=1;
					}
					}
					break;
				case 78:
					{
					int LA54_6 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt54=1;
					}
					}
					break;
				case 54:
					{
					int LA54_7 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt54=1;
					}
					}
					break;
				case 73:
					{
					int LA54_8 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt54=1;
					}
					}
					break;
				case RULE_LETTER:
					{
					int LA54_9 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt54=1;
					}
					}
					break;
				case 68:
					{
					int LA54_10 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt54=1;
					}
					}
					break;
				case 41:
					{
					int LA54_11 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt54=1;
					}
					}
					break;
				case 43:
					{
					int LA54_12 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt54=1;
					}
					}
					break;
				case 72:
					{
					int LA54_13 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt54=1;
					}
					}
					break;
				case 60:
					{
					int LA54_14 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt54=1;
					}
					}
					break;
				case 52:
					{
					int LA54_15 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt54=1;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA54_16 = input.LA(2);
					if ( (synpred86_DebugInternalGo()) ) {
						alt54=1;
					}
					}
					break;
				case 51:
					{
					alt54=1;
					}
					break;
			}
			} finally {dbg.exitDecision(54);}

			switch (alt54) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:664:3: ruleSimpleStmt ';'
					{
					dbg.location(664,3);
					pushFollow(FOLLOW_ruleSimpleStmt_in_ruleExprSwitchStmt2026);
					ruleSimpleStmt();
					state._fsp--;
					if (state.failed) return;dbg.location(665,3);
					match(input,51,FOLLOW_51_in_ruleExprSwitchStmt2030); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(54);}
			dbg.location(667,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:667:2: ( ruleExpression )?
			int alt55=2;
			try { dbg.enterSubRule(55);
			try { dbg.enterDecision(55, decisionCanBacktrack[55]);

			int LA55_0 = input.LA(1);
			if ( (LA55_0==RULE_DECIMALS||LA55_0==RULE_FLOAT_LIT||(LA55_0 >= RULE_INT_LIT && LA55_0 <= RULE_LETTER)||(LA55_0 >= RULE_STRING && LA55_0 <= RULE_UNARY_OP)||LA55_0==41||LA55_0==43||LA55_0==52||(LA55_0 >= 54 && LA55_0 <= 55)||LA55_0==60||LA55_0==68||(LA55_0 >= 72 && LA55_0 <= 73)||LA55_0==78) ) {
				alt55=1;
			}
			} finally {dbg.exitDecision(55);}

			switch (alt55) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:667:2: ruleExpression
					{
					dbg.location(667,2);
					pushFollow(FOLLOW_ruleExpression_in_ruleExprSwitchStmt2037);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(55);}
			dbg.location(669,2);
			match(input,82,FOLLOW_82_in_ruleExprSwitchStmt2043); if (state.failed) return;dbg.location(670,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:670:2: ( ruleExprCaseClause )*
			try { dbg.enterSubRule(56);

			loop56:
			while (true) {
				int alt56=2;
				try { dbg.enterDecision(56, decisionCanBacktrack[56]);

				int LA56_0 = input.LA(1);
				if ( (LA56_0==59||LA56_0==63) ) {
					alt56=1;
				}

				} finally {dbg.exitDecision(56);}

				switch (alt56) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:670:2: ruleExprCaseClause
					{
					dbg.location(670,2);
					pushFollow(FOLLOW_ruleExprCaseClause_in_ruleExprSwitchStmt2046);
					ruleExprCaseClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop56;
				}
			}
			} finally {dbg.exitSubRule(56);}
			dbg.location(672,2);
			match(input,83,FOLLOW_83_in_ruleExprSwitchStmt2052); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(673, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExprSwitchStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExprSwitchStmt"



	// $ANTLR start "ruleExprCaseClause"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:676:1: ruleExprCaseClause : ruleExprSwitchCase ':' ruleStatementList ;
	public final void ruleExprCaseClause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExprCaseClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(676, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:676:19: ( ruleExprSwitchCase ':' ruleStatementList )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:677:2: ruleExprSwitchCase ':' ruleStatementList
			{
			dbg.location(677,2);
			pushFollow(FOLLOW_ruleExprSwitchCase_in_ruleExprCaseClause2062);
			ruleExprSwitchCase();
			state._fsp--;
			if (state.failed) return;dbg.location(678,2);
			match(input,49,FOLLOW_49_in_ruleExprCaseClause2065); if (state.failed) return;dbg.location(679,2);
			pushFollow(FOLLOW_ruleStatementList_in_ruleExprCaseClause2068);
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
		dbg.location(680, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExprCaseClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExprCaseClause"



	// $ANTLR start "ruleExprSwitchCase"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:683:1: ruleExprSwitchCase : ( 'case' ruleExpressionList | 'default' ) ;
	public final void ruleExprSwitchCase() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExprSwitchCase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(683, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:683:19: ( ( 'case' ruleExpressionList | 'default' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:684:2: ( 'case' ruleExpressionList | 'default' )
			{
			dbg.location(684,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:684:2: ( 'case' ruleExpressionList | 'default' )
			int alt57=2;
			try { dbg.enterSubRule(57);
			try { dbg.enterDecision(57, decisionCanBacktrack[57]);

			int LA57_0 = input.LA(1);
			if ( (LA57_0==59) ) {
				alt57=1;
			}
			else if ( (LA57_0==63) ) {
				alt57=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(57);}

			switch (alt57) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:685:3: 'case' ruleExpressionList
					{
					dbg.location(685,3);
					match(input,59,FOLLOW_59_in_ruleExprSwitchCase2082); if (state.failed) return;dbg.location(686,3);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleExprSwitchCase2086);
					ruleExpressionList();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:688:3: 'default'
					{
					dbg.location(688,3);
					match(input,63,FOLLOW_63_in_ruleExprSwitchCase2098); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(57);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(690, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExprSwitchCase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExprSwitchCase"



	// $ANTLR start "ruleTypeSwitchStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:693:1: ruleTypeSwitchStmt : 'switch' ( ruleSimpleStmt ';' )? ruleTypeSwitchGuard '{' ( ruleTypeCaseClause )* '}' ;
	public final void ruleTypeSwitchStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeSwitchStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(693, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:693:19: ( 'switch' ( ruleSimpleStmt ';' )? ruleTypeSwitchGuard '{' ( ruleTypeCaseClause )* '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:694:2: 'switch' ( ruleSimpleStmt ';' )? ruleTypeSwitchGuard '{' ( ruleTypeCaseClause )* '}'
			{
			dbg.location(694,2);
			match(input,79,FOLLOW_79_in_ruleTypeSwitchStmt2111); if (state.failed) return;dbg.location(695,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:695:2: ( ruleSimpleStmt ';' )?
			int alt58=2;
			try { dbg.enterSubRule(58);
			try { dbg.enterDecision(58, decisionCanBacktrack[58]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA58_1 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt58=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA58_2 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt58=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA58_3 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt58=1;
					}
					}
					break;
				case 55:
					{
					int LA58_4 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt58=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA58_5 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt58=1;
					}
					}
					break;
				case 78:
					{
					int LA58_6 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt58=1;
					}
					}
					break;
				case 54:
					{
					int LA58_7 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt58=1;
					}
					}
					break;
				case 73:
					{
					int LA58_8 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt58=1;
					}
					}
					break;
				case RULE_LETTER:
					{
					int LA58_9 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt58=1;
					}
					}
					break;
				case 68:
					{
					int LA58_10 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt58=1;
					}
					}
					break;
				case 41:
					{
					int LA58_11 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt58=1;
					}
					}
					break;
				case 43:
					{
					int LA58_12 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt58=1;
					}
					}
					break;
				case 72:
					{
					int LA58_13 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt58=1;
					}
					}
					break;
				case 60:
					{
					int LA58_14 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt58=1;
					}
					}
					break;
				case 52:
					{
					int LA58_15 = input.LA(2);
					if ( (synpred90_DebugInternalGo()) ) {
						alt58=1;
					}
					}
					break;
				case RULE_UNARY_OP:
				case 51:
					{
					alt58=1;
					}
					break;
			}
			} finally {dbg.exitDecision(58);}

			switch (alt58) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:696:3: ruleSimpleStmt ';'
					{
					dbg.location(696,3);
					pushFollow(FOLLOW_ruleSimpleStmt_in_ruleTypeSwitchStmt2118);
					ruleSimpleStmt();
					state._fsp--;
					if (state.failed) return;dbg.location(697,3);
					match(input,51,FOLLOW_51_in_ruleTypeSwitchStmt2122); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(58);}
			dbg.location(699,2);
			pushFollow(FOLLOW_ruleTypeSwitchGuard_in_ruleTypeSwitchStmt2129);
			ruleTypeSwitchGuard();
			state._fsp--;
			if (state.failed) return;dbg.location(700,2);
			match(input,82,FOLLOW_82_in_ruleTypeSwitchStmt2132); if (state.failed) return;dbg.location(701,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:701:2: ( ruleTypeCaseClause )*
			try { dbg.enterSubRule(59);

			loop59:
			while (true) {
				int alt59=2;
				try { dbg.enterDecision(59, decisionCanBacktrack[59]);

				int LA59_0 = input.LA(1);
				if ( (LA59_0==59||LA59_0==63) ) {
					alt59=1;
				}

				} finally {dbg.exitDecision(59);}

				switch (alt59) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:701:2: ruleTypeCaseClause
					{
					dbg.location(701,2);
					pushFollow(FOLLOW_ruleTypeCaseClause_in_ruleTypeSwitchStmt2135);
					ruleTypeCaseClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop59;
				}
			}
			} finally {dbg.exitSubRule(59);}
			dbg.location(703,2);
			match(input,83,FOLLOW_83_in_ruleTypeSwitchStmt2141); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(704, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeSwitchStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeSwitchStmt"



	// $ANTLR start "ruleTypeSwitchGuard"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:707:1: ruleTypeSwitchGuard : ( ruleIDENTIFIER ':=' )? rulePrimaryExpr '.' '(' 'type' ')' ;
	public final void ruleTypeSwitchGuard() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeSwitchGuard");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(707, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:707:20: ( ( ruleIDENTIFIER ':=' )? rulePrimaryExpr '.' '(' 'type' ')' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:708:2: ( ruleIDENTIFIER ':=' )? rulePrimaryExpr '.' '(' 'type' ')'
			{
			dbg.location(708,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:708:2: ( ruleIDENTIFIER ':=' )?
			int alt60=2;
			try { dbg.enterSubRule(60);
			try { dbg.enterDecision(60, decisionCanBacktrack[60]);

			try {
				isCyclicDecision = true;
				alt60 = dfa60.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(60);}

			switch (alt60) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:709:3: ruleIDENTIFIER ':='
					{
					dbg.location(709,3);
					pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleTypeSwitchGuard2155);
					ruleIDENTIFIER();
					state._fsp--;
					if (state.failed) return;dbg.location(710,3);
					match(input,50,FOLLOW_50_in_ruleTypeSwitchGuard2159); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(60);}
			dbg.location(712,2);
			pushFollow(FOLLOW_rulePrimaryExpr_in_ruleTypeSwitchGuard2166);
			rulePrimaryExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(713,2);
			match(input,47,FOLLOW_47_in_ruleTypeSwitchGuard2169); if (state.failed) return;dbg.location(714,2);
			match(input,41,FOLLOW_41_in_ruleTypeSwitchGuard2172); if (state.failed) return;dbg.location(715,2);
			match(input,80,FOLLOW_80_in_ruleTypeSwitchGuard2175); if (state.failed) return;dbg.location(716,2);
			match(input,42,FOLLOW_42_in_ruleTypeSwitchGuard2178); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(717, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeSwitchGuard");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeSwitchGuard"



	// $ANTLR start "ruleTypeCaseClause"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:720:1: ruleTypeCaseClause : ruleTypeSwitchCase ':' ruleStatementList ;
	public final void ruleTypeCaseClause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeCaseClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(720, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:720:19: ( ruleTypeSwitchCase ':' ruleStatementList )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:721:2: ruleTypeSwitchCase ':' ruleStatementList
			{
			dbg.location(721,2);
			pushFollow(FOLLOW_ruleTypeSwitchCase_in_ruleTypeCaseClause2188);
			ruleTypeSwitchCase();
			state._fsp--;
			if (state.failed) return;dbg.location(722,2);
			match(input,49,FOLLOW_49_in_ruleTypeCaseClause2191); if (state.failed) return;dbg.location(723,2);
			pushFollow(FOLLOW_ruleStatementList_in_ruleTypeCaseClause2194);
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
		dbg.location(724, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeCaseClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeCaseClause"



	// $ANTLR start "ruleTypeSwitchCase"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:727:1: ruleTypeSwitchCase : ( 'case' ruleTypeList | 'default' ) ;
	public final void ruleTypeSwitchCase() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeSwitchCase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(727, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:727:19: ( ( 'case' ruleTypeList | 'default' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:728:2: ( 'case' ruleTypeList | 'default' )
			{
			dbg.location(728,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:728:2: ( 'case' ruleTypeList | 'default' )
			int alt61=2;
			try { dbg.enterSubRule(61);
			try { dbg.enterDecision(61, decisionCanBacktrack[61]);

			int LA61_0 = input.LA(1);
			if ( (LA61_0==59) ) {
				alt61=1;
			}
			else if ( (LA61_0==63) ) {
				alt61=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(61);}

			switch (alt61) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:729:3: 'case' ruleTypeList
					{
					dbg.location(729,3);
					match(input,59,FOLLOW_59_in_ruleTypeSwitchCase2208); if (state.failed) return;dbg.location(730,3);
					pushFollow(FOLLOW_ruleTypeList_in_ruleTypeSwitchCase2212);
					ruleTypeList();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:732:3: 'default'
					{
					dbg.location(732,3);
					match(input,63,FOLLOW_63_in_ruleTypeSwitchCase2224); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(61);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(734, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeSwitchCase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeSwitchCase"



	// $ANTLR start "ruleTypeList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:737:1: ruleTypeList : ruleType ( ',' ruleType )* ;
	public final void ruleTypeList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(737, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:737:13: ( ruleType ( ',' ruleType )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:738:2: ruleType ( ',' ruleType )*
			{
			dbg.location(738,2);
			pushFollow(FOLLOW_ruleType_in_ruleTypeList2237);
			ruleType();
			state._fsp--;
			if (state.failed) return;dbg.location(739,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:739:2: ( ',' ruleType )*
			try { dbg.enterSubRule(62);

			loop62:
			while (true) {
				int alt62=2;
				try { dbg.enterDecision(62, decisionCanBacktrack[62]);

				int LA62_0 = input.LA(1);
				if ( (LA62_0==45) ) {
					alt62=1;
				}

				} finally {dbg.exitDecision(62);}

				switch (alt62) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:740:3: ',' ruleType
					{
					dbg.location(740,3);
					match(input,45,FOLLOW_45_in_ruleTypeList2244); if (state.failed) return;dbg.location(741,3);
					pushFollow(FOLLOW_ruleType_in_ruleTypeList2248);
					ruleType();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop62;
				}
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
		dbg.location(743, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeList"



	// $ANTLR start "ruleCommClause"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:746:1: ruleCommClause : ruleCommCase ':' ruleStatementList ;
	public final void ruleCommClause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleCommClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(746, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:746:15: ( ruleCommCase ':' ruleStatementList )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:747:2: ruleCommCase ':' ruleStatementList
			{
			dbg.location(747,2);
			pushFollow(FOLLOW_ruleCommCase_in_ruleCommClause2262);
			ruleCommCase();
			state._fsp--;
			if (state.failed) return;dbg.location(748,2);
			match(input,49,FOLLOW_49_in_ruleCommClause2265); if (state.failed) return;dbg.location(749,2);
			pushFollow(FOLLOW_ruleStatementList_in_ruleCommClause2268);
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
		dbg.location(750, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleCommClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleCommClause"



	// $ANTLR start "ruleCommCase"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:753:1: ruleCommCase : ( 'case' ( ruleSendStmt | ruleRecvStmt ) | 'default' ) ;
	public final void ruleCommCase() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleCommCase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(753, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:753:13: ( ( 'case' ( ruleSendStmt | ruleRecvStmt ) | 'default' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:754:2: ( 'case' ( ruleSendStmt | ruleRecvStmt ) | 'default' )
			{
			dbg.location(754,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:754:2: ( 'case' ( ruleSendStmt | ruleRecvStmt ) | 'default' )
			int alt64=2;
			try { dbg.enterSubRule(64);
			try { dbg.enterDecision(64, decisionCanBacktrack[64]);

			int LA64_0 = input.LA(1);
			if ( (LA64_0==59) ) {
				alt64=1;
			}
			else if ( (LA64_0==63) ) {
				alt64=2;
			}

			else {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:755:3: 'case' ( ruleSendStmt | ruleRecvStmt )
					{
					dbg.location(755,3);
					match(input,59,FOLLOW_59_in_ruleCommCase2282); if (state.failed) return;dbg.location(756,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:756:3: ( ruleSendStmt | ruleRecvStmt )
					int alt63=2;
					try { dbg.enterSubRule(63);
					try { dbg.enterDecision(63, decisionCanBacktrack[63]);

					switch ( input.LA(1) ) {
					case RULE_INT_LIT:
						{
						int LA63_1 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt63=1;
						}
						else if ( (true) ) {
							alt63=2;
						}

						}
						break;
					case RULE_FLOAT_LIT:
						{
						int LA63_2 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt63=1;
						}
						else if ( (true) ) {
							alt63=2;
						}

						}
						break;
					case RULE_DECIMALS:
						{
						int LA63_3 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt63=1;
						}
						else if ( (true) ) {
							alt63=2;
						}

						}
						break;
					case 55:
						{
						int LA63_4 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt63=1;
						}
						else if ( (true) ) {
							alt63=2;
						}

						}
						break;
					case RULE_STRING:
						{
						int LA63_5 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt63=1;
						}
						else if ( (true) ) {
							alt63=2;
						}

						}
						break;
					case 78:
						{
						int LA63_6 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt63=1;
						}
						else if ( (true) ) {
							alt63=2;
						}

						}
						break;
					case 54:
						{
						int LA63_7 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt63=1;
						}
						else if ( (true) ) {
							alt63=2;
						}

						}
						break;
					case 73:
						{
						int LA63_8 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt63=1;
						}
						else if ( (true) ) {
							alt63=2;
						}

						}
						break;
					case RULE_LETTER:
						{
						int LA63_9 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt63=1;
						}
						else if ( (true) ) {
							alt63=2;
						}

						}
						break;
					case 68:
						{
						int LA63_10 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt63=1;
						}
						else if ( (true) ) {
							alt63=2;
						}

						}
						break;
					case 41:
						{
						int LA63_11 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt63=1;
						}
						else if ( (true) ) {
							alt63=2;
						}

						}
						break;
					case 43:
						{
						int LA63_12 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt63=1;
						}
						else if ( (true) ) {
							alt63=2;
						}

						}
						break;
					case 72:
						{
						int LA63_13 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt63=1;
						}
						else if ( (true) ) {
							alt63=2;
						}

						}
						break;
					case 60:
						{
						int LA63_14 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt63=1;
						}
						else if ( (true) ) {
							alt63=2;
						}

						}
						break;
					case 52:
						{
						int LA63_15 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt63=1;
						}
						else if ( (true) ) {
							alt63=2;
						}

						}
						break;
					case RULE_UNARY_OP:
						{
						int LA63_16 = input.LA(2);
						if ( (synpred95_DebugInternalGo()) ) {
							alt63=1;
						}
						else if ( (true) ) {
							alt63=2;
						}

						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 63, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(63);}

					switch (alt63) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:757:4: ruleSendStmt
							{
							dbg.location(757,4);
							pushFollow(FOLLOW_ruleSendStmt_in_ruleCommCase2291);
							ruleSendStmt();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:759:4: ruleRecvStmt
							{
							dbg.location(759,4);
							pushFollow(FOLLOW_ruleRecvStmt_in_ruleCommCase2305);
							ruleRecvStmt();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(63);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:762:3: 'default'
					{
					dbg.location(762,3);
					match(input,63,FOLLOW_63_in_ruleCommCase2321); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(64);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(764, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleCommCase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleCommCase"



	// $ANTLR start "ruleRecvStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:767:1: ruleRecvStmt : ( ruleExpressionList '=' | ruleIdentifierList ':=' )? ruleRecvExpr ;
	public final void ruleRecvStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleRecvStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(767, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:767:13: ( ( ruleExpressionList '=' | ruleIdentifierList ':=' )? ruleRecvExpr )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:768:2: ( ruleExpressionList '=' | ruleIdentifierList ':=' )? ruleRecvExpr
			{
			dbg.location(768,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:768:2: ( ruleExpressionList '=' | ruleIdentifierList ':=' )?
			int alt65=3;
			try { dbg.enterSubRule(65);
			try { dbg.enterDecision(65, decisionCanBacktrack[65]);

			switch ( input.LA(1) ) {
				case RULE_INT_LIT:
					{
					int LA65_1 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt65=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA65_2 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt65=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA65_3 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt65=1;
					}
					}
					break;
				case 55:
					{
					int LA65_4 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt65=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA65_5 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt65=1;
					}
					}
					break;
				case 78:
					{
					int LA65_6 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt65=1;
					}
					}
					break;
				case 54:
					{
					int LA65_7 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt65=1;
					}
					}
					break;
				case 73:
					{
					int LA65_8 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt65=1;
					}
					}
					break;
				case RULE_LETTER:
					{
					int LA65_9 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt65=1;
					}
					else if ( (synpred98_DebugInternalGo()) ) {
						alt65=2;
					}
					}
					break;
				case 68:
					{
					int LA65_10 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt65=1;
					}
					}
					break;
				case 41:
					{
					int LA65_11 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt65=1;
					}
					}
					break;
				case 43:
					{
					int LA65_12 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt65=1;
					}
					}
					break;
				case 72:
					{
					int LA65_13 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt65=1;
					}
					}
					break;
				case 60:
					{
					int LA65_14 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt65=1;
					}
					}
					break;
				case 52:
					{
					int LA65_15 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt65=1;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA65_16 = input.LA(2);
					if ( (synpred97_DebugInternalGo()) ) {
						alt65=1;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(65);}

			switch (alt65) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:769:3: ruleExpressionList '='
					{
					dbg.location(769,3);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleRecvStmt2338);
					ruleExpressionList();
					state._fsp--;
					if (state.failed) return;dbg.location(770,3);
					match(input,53,FOLLOW_53_in_ruleRecvStmt2342); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:772:3: ruleIdentifierList ':='
					{
					dbg.location(772,3);
					pushFollow(FOLLOW_ruleIdentifierList_in_ruleRecvStmt2354);
					ruleIdentifierList();
					state._fsp--;
					if (state.failed) return;dbg.location(773,3);
					match(input,50,FOLLOW_50_in_ruleRecvStmt2358); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(65);}
			dbg.location(775,2);
			pushFollow(FOLLOW_ruleRecvExpr_in_ruleRecvStmt2365);
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
		dbg.location(776, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleRecvStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleRecvStmt"



	// $ANTLR start "ruleRecvExpr"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:779:1: ruleRecvExpr : ruleExpression ;
	public final void ruleRecvExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleRecvExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(779, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:779:13: ( ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:780:2: ruleExpression
			{
			dbg.location(780,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleRecvExpr2375);
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
			dbg.exitRule(getGrammarFileName(), "ruleRecvExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleRecvExpr"



	// $ANTLR start "ruleCondition"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:784:1: ruleCondition : ruleExpression ;
	public final void ruleCondition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleCondition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(784, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:784:14: ( ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:785:2: ruleExpression
			{
			dbg.location(785,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleCondition2385);
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
		dbg.location(786, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleCondition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleCondition"



	// $ANTLR start "ruleForClause"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:789:1: ruleForClause : ( ruleInitStmt )? ';' ( ruleCondition )? ';' ( rulePostStmt )? ;
	public final void ruleForClause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleForClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(789, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:789:14: ( ( ruleInitStmt )? ';' ( ruleCondition )? ';' ( rulePostStmt )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:790:2: ( ruleInitStmt )? ';' ( ruleCondition )? ';' ( rulePostStmt )?
			{
			dbg.location(790,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:790:2: ( ruleInitStmt )?
			int alt66=2;
			try { dbg.enterSubRule(66);
			try { dbg.enterDecision(66, decisionCanBacktrack[66]);

			int LA66_0 = input.LA(1);
			if ( (LA66_0==RULE_DECIMALS||LA66_0==RULE_FLOAT_LIT||(LA66_0 >= RULE_INT_LIT && LA66_0 <= RULE_LETTER)||(LA66_0 >= RULE_STRING && LA66_0 <= RULE_UNARY_OP)||LA66_0==41||LA66_0==43||LA66_0==52||(LA66_0 >= 54 && LA66_0 <= 55)||LA66_0==60||LA66_0==68||(LA66_0 >= 72 && LA66_0 <= 73)||LA66_0==78) ) {
				alt66=1;
			}
			else if ( (LA66_0==51) ) {
				int LA66_17 = input.LA(2);
				if ( (synpred99_DebugInternalGo()) ) {
					alt66=1;
				}
			}
			} finally {dbg.exitDecision(66);}

			switch (alt66) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:790:2: ruleInitStmt
					{
					dbg.location(790,2);
					pushFollow(FOLLOW_ruleInitStmt_in_ruleForClause2395);
					ruleInitStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(66);}
			dbg.location(792,2);
			match(input,51,FOLLOW_51_in_ruleForClause2401); if (state.failed) return;dbg.location(793,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:793:2: ( ruleCondition )?
			int alt67=2;
			try { dbg.enterSubRule(67);
			try { dbg.enterDecision(67, decisionCanBacktrack[67]);

			int LA67_0 = input.LA(1);
			if ( (LA67_0==RULE_DECIMALS||LA67_0==RULE_FLOAT_LIT||(LA67_0 >= RULE_INT_LIT && LA67_0 <= RULE_LETTER)||(LA67_0 >= RULE_STRING && LA67_0 <= RULE_UNARY_OP)||LA67_0==41||LA67_0==43||LA67_0==52||(LA67_0 >= 54 && LA67_0 <= 55)||LA67_0==60||LA67_0==68||(LA67_0 >= 72 && LA67_0 <= 73)||LA67_0==78) ) {
				alt67=1;
			}
			} finally {dbg.exitDecision(67);}

			switch (alt67) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:793:2: ruleCondition
					{
					dbg.location(793,2);
					pushFollow(FOLLOW_ruleCondition_in_ruleForClause2404);
					ruleCondition();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(67);}
			dbg.location(795,2);
			match(input,51,FOLLOW_51_in_ruleForClause2410); if (state.failed) return;dbg.location(796,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:796:2: ( rulePostStmt )?
			int alt68=2;
			try { dbg.enterSubRule(68);
			try { dbg.enterDecision(68, decisionCanBacktrack[68]);

			int LA68_0 = input.LA(1);
			if ( (LA68_0==RULE_DECIMALS||LA68_0==RULE_FLOAT_LIT||(LA68_0 >= RULE_INT_LIT && LA68_0 <= RULE_LETTER)||(LA68_0 >= RULE_STRING && LA68_0 <= RULE_UNARY_OP)||LA68_0==41||LA68_0==43||(LA68_0 >= 51 && LA68_0 <= 52)||(LA68_0 >= 54 && LA68_0 <= 55)||LA68_0==60||LA68_0==68||(LA68_0 >= 72 && LA68_0 <= 73)||LA68_0==78) ) {
				alt68=1;
			}
			} finally {dbg.exitDecision(68);}

			switch (alt68) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:796:2: rulePostStmt
					{
					dbg.location(796,2);
					pushFollow(FOLLOW_rulePostStmt_in_ruleForClause2413);
					rulePostStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(68);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(798, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleForClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleForClause"



	// $ANTLR start "ruleRangeClause"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:801:1: ruleRangeClause : ( ruleExpressionList '=' | ruleIdentifierList ':=' )? 'range' ruleExpression ;
	public final void ruleRangeClause() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleRangeClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(801, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:801:16: ( ( ruleExpressionList '=' | ruleIdentifierList ':=' )? 'range' ruleExpression )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:802:2: ( ruleExpressionList '=' | ruleIdentifierList ':=' )? 'range' ruleExpression
			{
			dbg.location(802,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:802:2: ( ruleExpressionList '=' | ruleIdentifierList ':=' )?
			int alt69=3;
			try { dbg.enterSubRule(69);
			try { dbg.enterDecision(69, decisionCanBacktrack[69]);

			try {
				isCyclicDecision = true;
				alt69 = dfa69.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(69);}

			switch (alt69) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:803:3: ruleExpressionList '='
					{
					dbg.location(803,3);
					pushFollow(FOLLOW_ruleExpressionList_in_ruleRangeClause2430);
					ruleExpressionList();
					state._fsp--;
					if (state.failed) return;dbg.location(804,3);
					match(input,53,FOLLOW_53_in_ruleRangeClause2434); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:806:3: ruleIdentifierList ':='
					{
					dbg.location(806,3);
					pushFollow(FOLLOW_ruleIdentifierList_in_ruleRangeClause2446);
					ruleIdentifierList();
					state._fsp--;
					if (state.failed) return;dbg.location(807,3);
					match(input,50,FOLLOW_50_in_ruleRangeClause2450); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(69);}
			dbg.location(809,2);
			match(input,75,FOLLOW_75_in_ruleRangeClause2457); if (state.failed) return;dbg.location(810,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleRangeClause2460);
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
		dbg.location(811, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleRangeClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleRangeClause"



	// $ANTLR start "ruleInitStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:814:1: ruleInitStmt : ruleSimpleStmt ;
	public final void ruleInitStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleInitStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(814, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:814:13: ( ruleSimpleStmt )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:815:2: ruleSimpleStmt
			{
			dbg.location(815,2);
			pushFollow(FOLLOW_ruleSimpleStmt_in_ruleInitStmt2470);
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
			dbg.exitRule(getGrammarFileName(), "ruleInitStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleInitStmt"



	// $ANTLR start "rulePostStmt"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:819:1: rulePostStmt : ruleSimpleStmt ;
	public final void rulePostStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulePostStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(819, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:819:13: ( ruleSimpleStmt )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:820:2: ruleSimpleStmt
			{
			dbg.location(820,2);
			pushFollow(FOLLOW_ruleSimpleStmt_in_rulePostStmt2480);
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
		dbg.location(821, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulePostStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulePostStmt"



	// $ANTLR start "ruleLabel"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:824:1: ruleLabel : ruleIDENTIFIER ;
	public final void ruleLabel() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleLabel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(824, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:824:10: ( ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:825:2: ruleIDENTIFIER
			{
			dbg.location(825,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleLabel2490);
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
		dbg.location(826, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleLabel");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleLabel"



	// $ANTLR start "ruleExpressionList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:829:1: ruleExpressionList : ruleExpression ( ',' ruleExpression )* ;
	public final void ruleExpressionList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExpressionList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(829, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:829:19: ( ruleExpression ( ',' ruleExpression )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:830:2: ruleExpression ( ',' ruleExpression )*
			{
			dbg.location(830,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList2500);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(831,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:831:2: ( ',' ruleExpression )*
			try { dbg.enterSubRule(70);

			loop70:
			while (true) {
				int alt70=2;
				try { dbg.enterDecision(70, decisionCanBacktrack[70]);

				int LA70_0 = input.LA(1);
				if ( (LA70_0==45) ) {
					int LA70_2 = input.LA(2);
					if ( (LA70_2==RULE_DECIMALS||LA70_2==RULE_FLOAT_LIT||(LA70_2 >= RULE_INT_LIT && LA70_2 <= RULE_LETTER)||(LA70_2 >= RULE_STRING && LA70_2 <= RULE_UNARY_OP)||LA70_2==41||LA70_2==43||LA70_2==52||(LA70_2 >= 54 && LA70_2 <= 55)||LA70_2==60||LA70_2==68||(LA70_2 >= 72 && LA70_2 <= 73)||LA70_2==78) ) {
						alt70=1;
					}

				}

				} finally {dbg.exitDecision(70);}

				switch (alt70) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:832:3: ',' ruleExpression
					{
					dbg.location(832,3);
					match(input,45,FOLLOW_45_in_ruleExpressionList2507); if (state.failed) return;dbg.location(833,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList2511);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop70;
				}
			}
			} finally {dbg.exitSubRule(70);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(835, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExpressionList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExpressionList"



	// $ANTLR start "ruleExpression"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:838:1: ruleExpression : ruleUnaryExpr ruleExpression2 ;
	public final void ruleExpression() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(838, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:838:15: ( ruleUnaryExpr ruleExpression2 )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:839:2: ruleUnaryExpr ruleExpression2
			{
			dbg.location(839,2);
			pushFollow(FOLLOW_ruleUnaryExpr_in_ruleExpression2525);
			ruleUnaryExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(840,2);
			pushFollow(FOLLOW_ruleExpression2_in_ruleExpression2528);
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
		dbg.location(841, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExpression"



	// $ANTLR start "ruleExpression2"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:844:1: ruleExpression2 : ( RULE_BINARY_OP ruleExpression ruleExpression2 )? ;
	public final void ruleExpression2() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleExpression2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(844, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:844:16: ( ( RULE_BINARY_OP ruleExpression ruleExpression2 )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:845:2: ( RULE_BINARY_OP ruleExpression ruleExpression2 )?
			{
			dbg.location(845,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:845:2: ( RULE_BINARY_OP ruleExpression ruleExpression2 )?
			int alt71=2;
			try { dbg.enterSubRule(71);
			try { dbg.enterDecision(71, decisionCanBacktrack[71]);

			int LA71_0 = input.LA(1);
			if ( (LA71_0==RULE_BINARY_OP) ) {
				int LA71_1 = input.LA(2);
				if ( (synpred105_DebugInternalGo()) ) {
					alt71=1;
				}
			}
			} finally {dbg.exitDecision(71);}

			switch (alt71) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:846:3: RULE_BINARY_OP ruleExpression ruleExpression2
					{
					dbg.location(846,3);
					match(input,RULE_BINARY_OP,FOLLOW_RULE_BINARY_OP_in_ruleExpression22542); if (state.failed) return;dbg.location(847,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleExpression22546);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(848,3);
					pushFollow(FOLLOW_ruleExpression2_in_ruleExpression22550);
					ruleExpression2();
					state._fsp--;
					if (state.failed) return;
					}
					break;

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
		dbg.location(850, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleExpression2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleExpression2"



	// $ANTLR start "ruleUnaryExpr"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:853:1: ruleUnaryExpr : ( rulePrimaryExpr | RULE_UNARY_OP ruleUnaryExpr ) ;
	public final void ruleUnaryExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleUnaryExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(853, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:853:14: ( ( rulePrimaryExpr | RULE_UNARY_OP ruleUnaryExpr ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:854:2: ( rulePrimaryExpr | RULE_UNARY_OP ruleUnaryExpr )
			{
			dbg.location(854,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:854:2: ( rulePrimaryExpr | RULE_UNARY_OP ruleUnaryExpr )
			int alt72=2;
			try { dbg.enterSubRule(72);
			try { dbg.enterDecision(72, decisionCanBacktrack[72]);

			int LA72_0 = input.LA(1);
			if ( (LA72_0==RULE_DECIMALS||LA72_0==RULE_FLOAT_LIT||(LA72_0 >= RULE_INT_LIT && LA72_0 <= RULE_LETTER)||LA72_0==RULE_STRING||LA72_0==41||LA72_0==43||LA72_0==52||(LA72_0 >= 54 && LA72_0 <= 55)||LA72_0==60||LA72_0==68||(LA72_0 >= 72 && LA72_0 <= 73)||LA72_0==78) ) {
				alt72=1;
			}
			else if ( (LA72_0==RULE_UNARY_OP) ) {
				alt72=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(72);}

			switch (alt72) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:855:3: rulePrimaryExpr
					{
					dbg.location(855,3);
					pushFollow(FOLLOW_rulePrimaryExpr_in_ruleUnaryExpr2568);
					rulePrimaryExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:857:3: RULE_UNARY_OP ruleUnaryExpr
					{
					dbg.location(857,3);
					match(input,RULE_UNARY_OP,FOLLOW_RULE_UNARY_OP_in_ruleUnaryExpr2580); if (state.failed) return;dbg.location(858,3);
					pushFollow(FOLLOW_ruleUnaryExpr_in_ruleUnaryExpr2584);
					ruleUnaryExpr();
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
		dbg.location(860, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleUnaryExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleUnaryExpr"



	// $ANTLR start "rulePrimaryExpr"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:863:1: rulePrimaryExpr : ( ruleOperand rulePrimaryExpr2 | ruleConversion rulePrimaryExpr2 | ruleMethodExpr rulePrimaryExpr2 ) ;
	public final void rulePrimaryExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulePrimaryExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(863, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:863:16: ( ( ruleOperand rulePrimaryExpr2 | ruleConversion rulePrimaryExpr2 | ruleMethodExpr rulePrimaryExpr2 ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:864:2: ( ruleOperand rulePrimaryExpr2 | ruleConversion rulePrimaryExpr2 | ruleMethodExpr rulePrimaryExpr2 )
			{
			dbg.location(864,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:864:2: ( ruleOperand rulePrimaryExpr2 | ruleConversion rulePrimaryExpr2 | ruleMethodExpr rulePrimaryExpr2 )
			int alt73=3;
			try { dbg.enterSubRule(73);
			try { dbg.enterDecision(73, decisionCanBacktrack[73]);

			switch ( input.LA(1) ) {
			case RULE_DECIMALS:
			case RULE_FLOAT_LIT:
			case RULE_INT_LIT:
			case RULE_STRING:
			case 55:
				{
				alt73=1;
				}
				break;
			case 78:
				{
				int LA73_6 = input.LA(2);
				if ( (synpred107_DebugInternalGo()) ) {
					alt73=1;
				}
				else if ( (synpred108_DebugInternalGo()) ) {
					alt73=2;
				}
				else if ( (true) ) {
					alt73=3;
				}

				}
				break;
			case 54:
				{
				int LA73_7 = input.LA(2);
				if ( (synpred107_DebugInternalGo()) ) {
					alt73=1;
				}
				else if ( (synpred108_DebugInternalGo()) ) {
					alt73=2;
				}
				else if ( (true) ) {
					alt73=3;
				}

				}
				break;
			case 73:
				{
				int LA73_8 = input.LA(2);
				if ( (synpred107_DebugInternalGo()) ) {
					alt73=1;
				}
				else if ( (synpred108_DebugInternalGo()) ) {
					alt73=2;
				}
				else if ( (true) ) {
					alt73=3;
				}

				}
				break;
			case RULE_LETTER:
				{
				int LA73_9 = input.LA(2);
				if ( (synpred107_DebugInternalGo()) ) {
					alt73=1;
				}
				else if ( (synpred108_DebugInternalGo()) ) {
					alt73=2;
				}
				else if ( (true) ) {
					alt73=3;
				}

				}
				break;
			case 68:
				{
				int LA73_10 = input.LA(2);
				if ( (synpred107_DebugInternalGo()) ) {
					alt73=1;
				}
				else if ( (synpred108_DebugInternalGo()) ) {
					alt73=2;
				}
				else if ( (true) ) {
					alt73=3;
				}

				}
				break;
			case 41:
				{
				int LA73_11 = input.LA(2);
				if ( (synpred107_DebugInternalGo()) ) {
					alt73=1;
				}
				else if ( (synpred108_DebugInternalGo()) ) {
					alt73=2;
				}
				else if ( (true) ) {
					alt73=3;
				}

				}
				break;
			case 43:
				{
				int LA73_12 = input.LA(2);
				if ( (synpred108_DebugInternalGo()) ) {
					alt73=2;
				}
				else if ( (true) ) {
					alt73=3;
				}

				}
				break;
			case 72:
				{
				int LA73_13 = input.LA(2);
				if ( (synpred108_DebugInternalGo()) ) {
					alt73=2;
				}
				else if ( (true) ) {
					alt73=3;
				}

				}
				break;
			case 60:
				{
				int LA73_14 = input.LA(2);
				if ( (synpred108_DebugInternalGo()) ) {
					alt73=2;
				}
				else if ( (true) ) {
					alt73=3;
				}

				}
				break;
			case 52:
				{
				int LA73_15 = input.LA(2);
				if ( (synpred108_DebugInternalGo()) ) {
					alt73=2;
				}
				else if ( (true) ) {
					alt73=3;
				}

				}
				break;
			default:
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:865:3: ruleOperand rulePrimaryExpr2
					{
					dbg.location(865,3);
					pushFollow(FOLLOW_ruleOperand_in_rulePrimaryExpr2601);
					ruleOperand();
					state._fsp--;
					if (state.failed) return;dbg.location(866,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2605);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:868:3: ruleConversion rulePrimaryExpr2
					{
					dbg.location(868,3);
					pushFollow(FOLLOW_ruleConversion_in_rulePrimaryExpr2617);
					ruleConversion();
					state._fsp--;
					if (state.failed) return;dbg.location(869,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2621);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:871:3: ruleMethodExpr rulePrimaryExpr2
					{
					dbg.location(871,3);
					pushFollow(FOLLOW_ruleMethodExpr_in_rulePrimaryExpr2633);
					ruleMethodExpr();
					state._fsp--;
					if (state.failed) return;dbg.location(872,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2637);
					rulePrimaryExpr2();
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
		dbg.location(874, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulePrimaryExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulePrimaryExpr"



	// $ANTLR start "rulePrimaryExpr2"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:877:1: rulePrimaryExpr2 : ( ruleSelector rulePrimaryExpr2 | ruleIndex rulePrimaryExpr2 | ruleSlice rulePrimaryExpr2 | ruleTypeAssertion rulePrimaryExpr2 | ruleArguments rulePrimaryExpr2 )? ;
	public final void rulePrimaryExpr2() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulePrimaryExpr2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(877, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:877:17: ( ( ruleSelector rulePrimaryExpr2 | ruleIndex rulePrimaryExpr2 | ruleSlice rulePrimaryExpr2 | ruleTypeAssertion rulePrimaryExpr2 | ruleArguments rulePrimaryExpr2 )? )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:878:2: ( ruleSelector rulePrimaryExpr2 | ruleIndex rulePrimaryExpr2 | ruleSlice rulePrimaryExpr2 | ruleTypeAssertion rulePrimaryExpr2 | ruleArguments rulePrimaryExpr2 )?
			{
			dbg.location(878,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:878:2: ( ruleSelector rulePrimaryExpr2 | ruleIndex rulePrimaryExpr2 | ruleSlice rulePrimaryExpr2 | ruleTypeAssertion rulePrimaryExpr2 | ruleArguments rulePrimaryExpr2 )?
			int alt74=6;
			try { dbg.enterSubRule(74);
			try { dbg.enterDecision(74, decisionCanBacktrack[74]);

			switch ( input.LA(1) ) {
				case 47:
					{
					int LA74_1 = input.LA(2);
					if ( (synpred109_DebugInternalGo()) ) {
						alt74=1;
					}
					else if ( (synpred112_DebugInternalGo()) ) {
						alt74=4;
					}
					}
					break;
				case 54:
					{
					int LA74_2 = input.LA(2);
					if ( (synpred110_DebugInternalGo()) ) {
						alt74=2;
					}
					else if ( (synpred111_DebugInternalGo()) ) {
						alt74=3;
					}
					}
					break;
				case 41:
					{
					int LA74_3 = input.LA(2);
					if ( (synpred113_DebugInternalGo()) ) {
						alt74=5;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(74);}

			switch (alt74) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:879:3: ruleSelector rulePrimaryExpr2
					{
					dbg.location(879,3);
					pushFollow(FOLLOW_ruleSelector_in_rulePrimaryExpr22654);
					ruleSelector();
					state._fsp--;
					if (state.failed) return;dbg.location(880,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22658);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:882:3: ruleIndex rulePrimaryExpr2
					{
					dbg.location(882,3);
					pushFollow(FOLLOW_ruleIndex_in_rulePrimaryExpr22670);
					ruleIndex();
					state._fsp--;
					if (state.failed) return;dbg.location(883,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22674);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:885:3: ruleSlice rulePrimaryExpr2
					{
					dbg.location(885,3);
					pushFollow(FOLLOW_ruleSlice_in_rulePrimaryExpr22686);
					ruleSlice();
					state._fsp--;
					if (state.failed) return;dbg.location(886,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22690);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:888:3: ruleTypeAssertion rulePrimaryExpr2
					{
					dbg.location(888,3);
					pushFollow(FOLLOW_ruleTypeAssertion_in_rulePrimaryExpr22702);
					ruleTypeAssertion();
					state._fsp--;
					if (state.failed) return;dbg.location(889,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22706);
					rulePrimaryExpr2();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:891:3: ruleArguments rulePrimaryExpr2
					{
					dbg.location(891,3);
					pushFollow(FOLLOW_ruleArguments_in_rulePrimaryExpr22718);
					ruleArguments();
					state._fsp--;
					if (state.failed) return;dbg.location(892,3);
					pushFollow(FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22722);
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
		dbg.location(894, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulePrimaryExpr2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulePrimaryExpr2"



	// $ANTLR start "ruleOperand"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:897:1: ruleOperand : ( ruleLiteral | ruleOperandName | '(' ruleExpression ')' ) ;
	public final void ruleOperand() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleOperand");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(897, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:897:12: ( ( ruleLiteral | ruleOperandName | '(' ruleExpression ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:898:2: ( ruleLiteral | ruleOperandName | '(' ruleExpression ')' )
			{
			dbg.location(898,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:898:2: ( ruleLiteral | ruleOperandName | '(' ruleExpression ')' )
			int alt75=3;
			try { dbg.enterSubRule(75);
			try { dbg.enterDecision(75, decisionCanBacktrack[75]);

			switch ( input.LA(1) ) {
			case RULE_DECIMALS:
			case RULE_FLOAT_LIT:
			case RULE_INT_LIT:
			case RULE_STRING:
			case 54:
			case 55:
			case 68:
			case 73:
			case 78:
				{
				alt75=1;
				}
				break;
			case RULE_LETTER:
				{
				int LA75_9 = input.LA(2);
				if ( (synpred114_DebugInternalGo()) ) {
					alt75=1;
				}
				else if ( (synpred115_DebugInternalGo()) ) {
					alt75=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 9, input);
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
				alt75=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(75);}

			switch (alt75) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:899:3: ruleLiteral
					{
					dbg.location(899,3);
					pushFollow(FOLLOW_ruleLiteral_in_ruleOperand2740);
					ruleLiteral();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:901:3: ruleOperandName
					{
					dbg.location(901,3);
					pushFollow(FOLLOW_ruleOperandName_in_ruleOperand2752);
					ruleOperandName();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:903:3: '(' ruleExpression ')'
					{
					dbg.location(903,3);
					match(input,41,FOLLOW_41_in_ruleOperand2764); if (state.failed) return;dbg.location(904,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleOperand2768);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(905,3);
					match(input,42,FOLLOW_42_in_ruleOperand2772); if (state.failed) return;
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
		dbg.location(907, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleOperand");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleOperand"



	// $ANTLR start "ruleConversion"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:910:1: ruleConversion : ruleType '(' ruleExpression ( ',' )? ')' ;
	public final void ruleConversion() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleConversion");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(910, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:910:15: ( ruleType '(' ruleExpression ( ',' )? ')' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:911:2: ruleType '(' ruleExpression ( ',' )? ')'
			{
			dbg.location(911,2);
			pushFollow(FOLLOW_ruleType_in_ruleConversion2785);
			ruleType();
			state._fsp--;
			if (state.failed) return;dbg.location(912,2);
			match(input,41,FOLLOW_41_in_ruleConversion2788); if (state.failed) return;dbg.location(913,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleConversion2791);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(914,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:914:2: ( ',' )?
			int alt76=2;
			try { dbg.enterSubRule(76);
			try { dbg.enterDecision(76, decisionCanBacktrack[76]);

			int LA76_0 = input.LA(1);
			if ( (LA76_0==45) ) {
				alt76=1;
			}
			} finally {dbg.exitDecision(76);}

			switch (alt76) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:914:2: ','
					{
					dbg.location(914,2);
					match(input,45,FOLLOW_45_in_ruleConversion2794); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(76);}
			dbg.location(915,2);
			match(input,42,FOLLOW_42_in_ruleConversion2798); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(916, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleConversion");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleConversion"



	// $ANTLR start "ruleMethodExpr"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:919:1: ruleMethodExpr : ruleReceiverType '.' ruleMethodName ;
	public final void ruleMethodExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleMethodExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(919, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:919:15: ( ruleReceiverType '.' ruleMethodName )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:920:2: ruleReceiverType '.' ruleMethodName
			{
			dbg.location(920,2);
			pushFollow(FOLLOW_ruleReceiverType_in_ruleMethodExpr2808);
			ruleReceiverType();
			state._fsp--;
			if (state.failed) return;dbg.location(921,2);
			match(input,47,FOLLOW_47_in_ruleMethodExpr2811); if (state.failed) return;dbg.location(922,2);
			pushFollow(FOLLOW_ruleMethodName_in_ruleMethodExpr2814);
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
		dbg.location(923, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleMethodExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleMethodExpr"



	// $ANTLR start "ruleSelector"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:926:1: ruleSelector : '.' ruleIDENTIFIER ;
	public final void ruleSelector() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSelector");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(926, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:926:13: ( '.' ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:927:2: '.' ruleIDENTIFIER
			{
			dbg.location(927,2);
			match(input,47,FOLLOW_47_in_ruleSelector2824); if (state.failed) return;dbg.location(928,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleSelector2827);
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
		dbg.location(929, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSelector");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSelector"



	// $ANTLR start "ruleIndex"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:932:1: ruleIndex : '[' ruleExpression ']' ;
	public final void ruleIndex() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleIndex");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(932, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:932:10: ( '[' ruleExpression ']' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:933:2: '[' ruleExpression ']'
			{
			dbg.location(933,2);
			match(input,54,FOLLOW_54_in_ruleIndex2837); if (state.failed) return;dbg.location(934,2);
			pushFollow(FOLLOW_ruleExpression_in_ruleIndex2840);
			ruleExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(935,2);
			match(input,57,FOLLOW_57_in_ruleIndex2843); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(936, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleIndex");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleIndex"



	// $ANTLR start "ruleSlice"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:939:1: ruleSlice : ( '[' ( ruleExpression )? ':' ( ruleExpression )? ']' | '[' ( ruleExpression )? ':' ruleExpression ':' ruleExpression ']' ) ;
	public final void ruleSlice() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSlice");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(939, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:939:10: ( ( '[' ( ruleExpression )? ':' ( ruleExpression )? ']' | '[' ( ruleExpression )? ':' ruleExpression ':' ruleExpression ']' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:940:2: ( '[' ( ruleExpression )? ':' ( ruleExpression )? ']' | '[' ( ruleExpression )? ':' ruleExpression ':' ruleExpression ']' )
			{
			dbg.location(940,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:940:2: ( '[' ( ruleExpression )? ':' ( ruleExpression )? ']' | '[' ( ruleExpression )? ':' ruleExpression ':' ruleExpression ']' )
			int alt80=2;
			try { dbg.enterSubRule(80);
			try { dbg.enterDecision(80, decisionCanBacktrack[80]);

			int LA80_0 = input.LA(1);
			if ( (LA80_0==54) ) {
				int LA80_1 = input.LA(2);
				if ( (synpred119_DebugInternalGo()) ) {
					alt80=1;
				}
				else if ( (true) ) {
					alt80=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(80);}

			switch (alt80) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:941:3: '[' ( ruleExpression )? ':' ( ruleExpression )? ']'
					{
					dbg.location(941,3);
					match(input,54,FOLLOW_54_in_ruleSlice2857); if (state.failed) return;dbg.location(942,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:942:3: ( ruleExpression )?
					int alt77=2;
					try { dbg.enterSubRule(77);
					try { dbg.enterDecision(77, decisionCanBacktrack[77]);

					int LA77_0 = input.LA(1);
					if ( (LA77_0==RULE_DECIMALS||LA77_0==RULE_FLOAT_LIT||(LA77_0 >= RULE_INT_LIT && LA77_0 <= RULE_LETTER)||(LA77_0 >= RULE_STRING && LA77_0 <= RULE_UNARY_OP)||LA77_0==41||LA77_0==43||LA77_0==52||(LA77_0 >= 54 && LA77_0 <= 55)||LA77_0==60||LA77_0==68||(LA77_0 >= 72 && LA77_0 <= 73)||LA77_0==78) ) {
						alt77=1;
					}
					} finally {dbg.exitDecision(77);}

					switch (alt77) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:942:3: ruleExpression
							{
							dbg.location(942,3);
							pushFollow(FOLLOW_ruleExpression_in_ruleSlice2861);
							ruleExpression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(77);}
					dbg.location(944,3);
					match(input,49,FOLLOW_49_in_ruleSlice2869); if (state.failed) return;dbg.location(945,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:945:3: ( ruleExpression )?
					int alt78=2;
					try { dbg.enterSubRule(78);
					try { dbg.enterDecision(78, decisionCanBacktrack[78]);

					int LA78_0 = input.LA(1);
					if ( (LA78_0==RULE_DECIMALS||LA78_0==RULE_FLOAT_LIT||(LA78_0 >= RULE_INT_LIT && LA78_0 <= RULE_LETTER)||(LA78_0 >= RULE_STRING && LA78_0 <= RULE_UNARY_OP)||LA78_0==41||LA78_0==43||LA78_0==52||(LA78_0 >= 54 && LA78_0 <= 55)||LA78_0==60||LA78_0==68||(LA78_0 >= 72 && LA78_0 <= 73)||LA78_0==78) ) {
						alt78=1;
					}
					} finally {dbg.exitDecision(78);}

					switch (alt78) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:945:3: ruleExpression
							{
							dbg.location(945,3);
							pushFollow(FOLLOW_ruleExpression_in_ruleSlice2873);
							ruleExpression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(78);}
					dbg.location(947,3);
					match(input,57,FOLLOW_57_in_ruleSlice2881); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:949:3: '[' ( ruleExpression )? ':' ruleExpression ':' ruleExpression ']'
					{
					dbg.location(949,3);
					match(input,54,FOLLOW_54_in_ruleSlice2893); if (state.failed) return;dbg.location(950,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:950:3: ( ruleExpression )?
					int alt79=2;
					try { dbg.enterSubRule(79);
					try { dbg.enterDecision(79, decisionCanBacktrack[79]);

					int LA79_0 = input.LA(1);
					if ( (LA79_0==RULE_DECIMALS||LA79_0==RULE_FLOAT_LIT||(LA79_0 >= RULE_INT_LIT && LA79_0 <= RULE_LETTER)||(LA79_0 >= RULE_STRING && LA79_0 <= RULE_UNARY_OP)||LA79_0==41||LA79_0==43||LA79_0==52||(LA79_0 >= 54 && LA79_0 <= 55)||LA79_0==60||LA79_0==68||(LA79_0 >= 72 && LA79_0 <= 73)||LA79_0==78) ) {
						alt79=1;
					}
					} finally {dbg.exitDecision(79);}

					switch (alt79) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:950:3: ruleExpression
							{
							dbg.location(950,3);
							pushFollow(FOLLOW_ruleExpression_in_ruleSlice2897);
							ruleExpression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(79);}
					dbg.location(952,3);
					match(input,49,FOLLOW_49_in_ruleSlice2905); if (state.failed) return;dbg.location(953,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleSlice2909);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(954,3);
					match(input,49,FOLLOW_49_in_ruleSlice2913); if (state.failed) return;dbg.location(955,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleSlice2917);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(956,3);
					match(input,57,FOLLOW_57_in_ruleSlice2921); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(80);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(958, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSlice");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSlice"



	// $ANTLR start "ruleTypeAssertion"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:961:1: ruleTypeAssertion : '.' '(' ruleType ')' ;
	public final void ruleTypeAssertion() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTypeAssertion");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(961, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:961:18: ( '.' '(' ruleType ')' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:962:2: '.' '(' ruleType ')'
			{
			dbg.location(962,2);
			match(input,47,FOLLOW_47_in_ruleTypeAssertion2934); if (state.failed) return;dbg.location(963,2);
			match(input,41,FOLLOW_41_in_ruleTypeAssertion2937); if (state.failed) return;dbg.location(964,2);
			pushFollow(FOLLOW_ruleType_in_ruleTypeAssertion2940);
			ruleType();
			state._fsp--;
			if (state.failed) return;dbg.location(965,2);
			match(input,42,FOLLOW_42_in_ruleTypeAssertion2943); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(966, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTypeAssertion");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTypeAssertion"



	// $ANTLR start "ruleArguments"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:969:1: ruleArguments : '(' ( ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? ) ( '...' )? ( ',' )? )? ')' ;
	public final void ruleArguments() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleArguments");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(969, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:969:14: ( '(' ( ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? ) ( '...' )? ( ',' )? )? ')' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:970:2: '(' ( ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? ) ( '...' )? ( ',' )? )? ')'
			{
			dbg.location(970,2);
			match(input,41,FOLLOW_41_in_ruleArguments2953); if (state.failed) return;dbg.location(971,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:971:2: ( ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? ) ( '...' )? ( ',' )? )?
			int alt85=2;
			try { dbg.enterSubRule(85);
			try { dbg.enterDecision(85, decisionCanBacktrack[85]);

			int LA85_0 = input.LA(1);
			if ( (LA85_0==RULE_DECIMALS||LA85_0==RULE_FLOAT_LIT||(LA85_0 >= RULE_INT_LIT && LA85_0 <= RULE_LETTER)||(LA85_0 >= RULE_STRING && LA85_0 <= RULE_UNARY_OP)||LA85_0==41||LA85_0==43||LA85_0==52||(LA85_0 >= 54 && LA85_0 <= 55)||LA85_0==60||LA85_0==68||(LA85_0 >= 72 && LA85_0 <= 73)||LA85_0==78) ) {
				alt85=1;
			}
			} finally {dbg.exitDecision(85);}

			switch (alt85) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:972:3: ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? ) ( '...' )? ( ',' )?
					{
					dbg.location(972,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:972:3: ( ruleExpressionList | ruleType ( ',' ruleExpressionList )? )
					int alt82=2;
					try { dbg.enterSubRule(82);
					try { dbg.enterDecision(82, decisionCanBacktrack[82]);

					switch ( input.LA(1) ) {
					case RULE_DECIMALS:
					case RULE_FLOAT_LIT:
					case RULE_INT_LIT:
					case RULE_STRING:
					case RULE_UNARY_OP:
					case 55:
						{
						alt82=1;
						}
						break;
					case 78:
						{
						int LA82_6 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt82=1;
						}
						else if ( (true) ) {
							alt82=2;
						}

						}
						break;
					case 54:
						{
						int LA82_7 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt82=1;
						}
						else if ( (true) ) {
							alt82=2;
						}

						}
						break;
					case 73:
						{
						int LA82_8 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt82=1;
						}
						else if ( (true) ) {
							alt82=2;
						}

						}
						break;
					case RULE_LETTER:
						{
						int LA82_9 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt82=1;
						}
						else if ( (true) ) {
							alt82=2;
						}

						}
						break;
					case 68:
						{
						int LA82_10 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt82=1;
						}
						else if ( (true) ) {
							alt82=2;
						}

						}
						break;
					case 41:
						{
						int LA82_11 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt82=1;
						}
						else if ( (true) ) {
							alt82=2;
						}

						}
						break;
					case 43:
						{
						int LA82_12 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt82=1;
						}
						else if ( (true) ) {
							alt82=2;
						}

						}
						break;
					case 72:
						{
						int LA82_13 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt82=1;
						}
						else if ( (true) ) {
							alt82=2;
						}

						}
						break;
					case 60:
						{
						int LA82_14 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt82=1;
						}
						else if ( (true) ) {
							alt82=2;
						}

						}
						break;
					case 52:
						{
						int LA82_15 = input.LA(2);
						if ( (synpred121_DebugInternalGo()) ) {
							alt82=1;
						}
						else if ( (true) ) {
							alt82=2;
						}

						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 82, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(82);}

					switch (alt82) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:973:4: ruleExpressionList
							{
							dbg.location(973,4);
							pushFollow(FOLLOW_ruleExpressionList_in_ruleArguments2965);
							ruleExpressionList();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:975:4: ruleType ( ',' ruleExpressionList )?
							{
							dbg.location(975,4);
							pushFollow(FOLLOW_ruleType_in_ruleArguments2979);
							ruleType();
							state._fsp--;
							if (state.failed) return;dbg.location(976,4);
							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:976:4: ( ',' ruleExpressionList )?
							int alt81=2;
							try { dbg.enterSubRule(81);
							try { dbg.enterDecision(81, decisionCanBacktrack[81]);

							int LA81_0 = input.LA(1);
							if ( (LA81_0==45) ) {
								int LA81_1 = input.LA(2);
								if ( (LA81_1==RULE_DECIMALS||LA81_1==RULE_FLOAT_LIT||(LA81_1 >= RULE_INT_LIT && LA81_1 <= RULE_LETTER)||(LA81_1 >= RULE_STRING && LA81_1 <= RULE_UNARY_OP)||LA81_1==41||LA81_1==43||LA81_1==52||(LA81_1 >= 54 && LA81_1 <= 55)||LA81_1==60||LA81_1==68||(LA81_1 >= 72 && LA81_1 <= 73)||LA81_1==78) ) {
									alt81=1;
								}
							}
							} finally {dbg.exitDecision(81);}

							switch (alt81) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:977:5: ',' ruleExpressionList
									{
									dbg.location(977,5);
									match(input,45,FOLLOW_45_in_ruleArguments2990); if (state.failed) return;dbg.location(978,5);
									pushFollow(FOLLOW_ruleExpressionList_in_ruleArguments2996);
									ruleExpressionList();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(81);}

							}
							break;

					}
					} finally {dbg.exitSubRule(82);}
					dbg.location(981,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:981:3: ( '...' )?
					int alt83=2;
					try { dbg.enterSubRule(83);
					try { dbg.enterDecision(83, decisionCanBacktrack[83]);

					int LA83_0 = input.LA(1);
					if ( (LA83_0==48) ) {
						alt83=1;
					}
					} finally {dbg.exitDecision(83);}

					switch (alt83) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:981:3: '...'
							{
							dbg.location(981,3);
							match(input,48,FOLLOW_48_in_ruleArguments3010); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(83);}
					dbg.location(982,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:982:3: ( ',' )?
					int alt84=2;
					try { dbg.enterSubRule(84);
					try { dbg.enterDecision(84, decisionCanBacktrack[84]);

					int LA84_0 = input.LA(1);
					if ( (LA84_0==45) ) {
						alt84=1;
					}
					} finally {dbg.exitDecision(84);}

					switch (alt84) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:982:3: ','
							{
							dbg.location(982,3);
							match(input,45,FOLLOW_45_in_ruleArguments3015); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(84);}

					}
					break;

			}
			} finally {dbg.exitSubRule(85);}
			dbg.location(984,2);
			match(input,42,FOLLOW_42_in_ruleArguments3023); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(985, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleArguments");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleArguments"



	// $ANTLR start "ruleLiteral"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:988:1: ruleLiteral : ( ruleBasicLit | ruleCompositeLit | ruleFunctionLit ) ;
	public final void ruleLiteral() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleLiteral");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(988, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:988:12: ( ( ruleBasicLit | ruleCompositeLit | ruleFunctionLit ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:989:2: ( ruleBasicLit | ruleCompositeLit | ruleFunctionLit )
			{
			dbg.location(989,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:989:2: ( ruleBasicLit | ruleCompositeLit | ruleFunctionLit )
			int alt86=3;
			try { dbg.enterSubRule(86);
			try { dbg.enterDecision(86, decisionCanBacktrack[86]);

			switch ( input.LA(1) ) {
			case RULE_DECIMALS:
			case RULE_FLOAT_LIT:
			case RULE_INT_LIT:
			case RULE_STRING:
			case 55:
				{
				alt86=1;
				}
				break;
			case RULE_LETTER:
			case 54:
			case 73:
			case 78:
				{
				alt86=2;
				}
				break;
			case 68:
				{
				alt86=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(86);}

			switch (alt86) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:990:3: ruleBasicLit
					{
					dbg.location(990,3);
					pushFollow(FOLLOW_ruleBasicLit_in_ruleLiteral3037);
					ruleBasicLit();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:992:3: ruleCompositeLit
					{
					dbg.location(992,3);
					pushFollow(FOLLOW_ruleCompositeLit_in_ruleLiteral3049);
					ruleCompositeLit();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:994:3: ruleFunctionLit
					{
					dbg.location(994,3);
					pushFollow(FOLLOW_ruleFunctionLit_in_ruleLiteral3061);
					ruleFunctionLit();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(86);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(996, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleLiteral");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleLiteral"



	// $ANTLR start "ruleFunctionLit"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:999:1: ruleFunctionLit : 'func' ruleSignature ruleFunctionBody ;
	public final void ruleFunctionLit() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFunctionLit");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(999, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:999:16: ( 'func' ruleSignature ruleFunctionBody )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1000:2: 'func' ruleSignature ruleFunctionBody
			{
			dbg.location(1000,2);
			match(input,68,FOLLOW_68_in_ruleFunctionLit3074); if (state.failed) return;dbg.location(1001,2);
			pushFollow(FOLLOW_ruleSignature_in_ruleFunctionLit3077);
			ruleSignature();
			state._fsp--;
			if (state.failed) return;dbg.location(1002,2);
			pushFollow(FOLLOW_ruleFunctionBody_in_ruleFunctionLit3080);
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
		dbg.location(1003, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFunctionLit");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFunctionLit"



	// $ANTLR start "ruleCompositeLit"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1006:1: ruleCompositeLit : ruleLiteralType ruleLiteralValue ;
	public final void ruleCompositeLit() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleCompositeLit");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1006, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1006:17: ( ruleLiteralType ruleLiteralValue )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1007:2: ruleLiteralType ruleLiteralValue
			{
			dbg.location(1007,2);
			pushFollow(FOLLOW_ruleLiteralType_in_ruleCompositeLit3090);
			ruleLiteralType();
			state._fsp--;
			if (state.failed) return;dbg.location(1008,2);
			pushFollow(FOLLOW_ruleLiteralValue_in_ruleCompositeLit3093);
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
		dbg.location(1009, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleCompositeLit");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleCompositeLit"



	// $ANTLR start "ruleLiteralType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1012:1: ruleLiteralType : ( ruleStructType | ruleArrayType | '[' '...' ']' ruleElementType | ruleSliceType | ruleMapType | ruleTypeName ) ;
	public final void ruleLiteralType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleLiteralType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1012, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1012:16: ( ( ruleStructType | ruleArrayType | '[' '...' ']' ruleElementType | ruleSliceType | ruleMapType | ruleTypeName ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1013:2: ( ruleStructType | ruleArrayType | '[' '...' ']' ruleElementType | ruleSliceType | ruleMapType | ruleTypeName )
			{
			dbg.location(1013,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1013:2: ( ruleStructType | ruleArrayType | '[' '...' ']' ruleElementType | ruleSliceType | ruleMapType | ruleTypeName )
			int alt87=6;
			try { dbg.enterSubRule(87);
			try { dbg.enterDecision(87, decisionCanBacktrack[87]);

			switch ( input.LA(1) ) {
			case 78:
				{
				alt87=1;
				}
				break;
			case 54:
				{
				switch ( input.LA(2) ) {
				case 48:
					{
					alt87=3;
					}
					break;
				case 57:
					{
					alt87=4;
					}
					break;
				case RULE_DECIMALS:
				case RULE_FLOAT_LIT:
				case RULE_INT_LIT:
				case RULE_LETTER:
				case RULE_STRING:
				case RULE_UNARY_OP:
				case 41:
				case 43:
				case 52:
				case 54:
				case 55:
				case 60:
				case 68:
				case 72:
				case 73:
				case 78:
					{
					alt87=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 87, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 73:
				{
				alt87=5;
				}
				break;
			case RULE_LETTER:
				{
				alt87=6;
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1014:3: ruleStructType
					{
					dbg.location(1014,3);
					pushFollow(FOLLOW_ruleStructType_in_ruleLiteralType3107);
					ruleStructType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1016:3: ruleArrayType
					{
					dbg.location(1016,3);
					pushFollow(FOLLOW_ruleArrayType_in_ruleLiteralType3119);
					ruleArrayType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1018:3: '[' '...' ']' ruleElementType
					{
					dbg.location(1018,3);
					match(input,54,FOLLOW_54_in_ruleLiteralType3131); if (state.failed) return;dbg.location(1019,3);
					match(input,48,FOLLOW_48_in_ruleLiteralType3135); if (state.failed) return;dbg.location(1020,3);
					match(input,57,FOLLOW_57_in_ruleLiteralType3139); if (state.failed) return;dbg.location(1021,3);
					pushFollow(FOLLOW_ruleElementType_in_ruleLiteralType3143);
					ruleElementType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1023:3: ruleSliceType
					{
					dbg.location(1023,3);
					pushFollow(FOLLOW_ruleSliceType_in_ruleLiteralType3155);
					ruleSliceType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1025:3: ruleMapType
					{
					dbg.location(1025,3);
					pushFollow(FOLLOW_ruleMapType_in_ruleLiteralType3167);
					ruleMapType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1027:3: ruleTypeName
					{
					dbg.location(1027,3);
					pushFollow(FOLLOW_ruleTypeName_in_ruleLiteralType3179);
					ruleTypeName();
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
		dbg.location(1029, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleLiteralType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleLiteralType"



	// $ANTLR start "ruleLiteralValue"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1032:1: ruleLiteralValue : '{' ( ruleElementList ( ',' )? )? '}' ;
	public final void ruleLiteralValue() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleLiteralValue");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1032, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1032:17: ( '{' ( ruleElementList ( ',' )? )? '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1033:2: '{' ( ruleElementList ( ',' )? )? '}'
			{
			dbg.location(1033,2);
			match(input,82,FOLLOW_82_in_ruleLiteralValue3192); if (state.failed) return;dbg.location(1034,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1034:2: ( ruleElementList ( ',' )? )?
			int alt89=2;
			try { dbg.enterSubRule(89);
			try { dbg.enterDecision(89, decisionCanBacktrack[89]);

			int LA89_0 = input.LA(1);
			if ( (LA89_0==RULE_DECIMALS||LA89_0==RULE_FLOAT_LIT||(LA89_0 >= RULE_INT_LIT && LA89_0 <= RULE_LETTER)||(LA89_0 >= RULE_STRING && LA89_0 <= RULE_UNARY_OP)||LA89_0==41||LA89_0==43||LA89_0==52||(LA89_0 >= 54 && LA89_0 <= 55)||LA89_0==60||LA89_0==68||(LA89_0 >= 72 && LA89_0 <= 73)||LA89_0==78||LA89_0==82) ) {
				alt89=1;
			}
			} finally {dbg.exitDecision(89);}

			switch (alt89) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1035:3: ruleElementList ( ',' )?
					{
					dbg.location(1035,3);
					pushFollow(FOLLOW_ruleElementList_in_ruleLiteralValue3199);
					ruleElementList();
					state._fsp--;
					if (state.failed) return;dbg.location(1036,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1036:3: ( ',' )?
					int alt88=2;
					try { dbg.enterSubRule(88);
					try { dbg.enterDecision(88, decisionCanBacktrack[88]);

					int LA88_0 = input.LA(1);
					if ( (LA88_0==45) ) {
						alt88=1;
					}
					} finally {dbg.exitDecision(88);}

					switch (alt88) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1036:3: ','
							{
							dbg.location(1036,3);
							match(input,45,FOLLOW_45_in_ruleLiteralValue3203); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(88);}

					}
					break;

			}
			} finally {dbg.exitSubRule(89);}
			dbg.location(1038,2);
			match(input,83,FOLLOW_83_in_ruleLiteralValue3211); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1039, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleLiteralValue");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleLiteralValue"



	// $ANTLR start "ruleElementList"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1042:1: ruleElementList : ruleKeyedElement ( ( ',' )? ruleKeyedElement )* ;
	public final void ruleElementList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleElementList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1042, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1042:16: ( ruleKeyedElement ( ( ',' )? ruleKeyedElement )* )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1043:2: ruleKeyedElement ( ( ',' )? ruleKeyedElement )*
			{
			dbg.location(1043,2);
			pushFollow(FOLLOW_ruleKeyedElement_in_ruleElementList3221);
			ruleKeyedElement();
			state._fsp--;
			if (state.failed) return;dbg.location(1044,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1044:2: ( ( ',' )? ruleKeyedElement )*
			try { dbg.enterSubRule(91);

			loop91:
			while (true) {
				int alt91=2;
				try { dbg.enterDecision(91, decisionCanBacktrack[91]);

				int LA91_0 = input.LA(1);
				if ( (LA91_0==45) ) {
					int LA91_1 = input.LA(2);
					if ( (LA91_1==RULE_DECIMALS||LA91_1==RULE_FLOAT_LIT||(LA91_1 >= RULE_INT_LIT && LA91_1 <= RULE_LETTER)||(LA91_1 >= RULE_STRING && LA91_1 <= RULE_UNARY_OP)||LA91_1==41||LA91_1==43||LA91_1==52||(LA91_1 >= 54 && LA91_1 <= 55)||LA91_1==60||LA91_1==68||(LA91_1 >= 72 && LA91_1 <= 73)||LA91_1==78||LA91_1==82) ) {
						alt91=1;
					}

				}
				else if ( (LA91_0==RULE_DECIMALS||LA91_0==RULE_FLOAT_LIT||(LA91_0 >= RULE_INT_LIT && LA91_0 <= RULE_LETTER)||(LA91_0 >= RULE_STRING && LA91_0 <= RULE_UNARY_OP)||LA91_0==41||LA91_0==43||LA91_0==52||(LA91_0 >= 54 && LA91_0 <= 55)||LA91_0==60||LA91_0==68||(LA91_0 >= 72 && LA91_0 <= 73)||LA91_0==78||LA91_0==82) ) {
					alt91=1;
				}

				} finally {dbg.exitDecision(91);}

				switch (alt91) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1045:3: ( ',' )? ruleKeyedElement
					{
					dbg.location(1045,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1045:3: ( ',' )?
					int alt90=2;
					try { dbg.enterSubRule(90);
					try { dbg.enterDecision(90, decisionCanBacktrack[90]);

					int LA90_0 = input.LA(1);
					if ( (LA90_0==45) ) {
						alt90=1;
					}
					} finally {dbg.exitDecision(90);}

					switch (alt90) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1045:3: ','
							{
							dbg.location(1045,3);
							match(input,45,FOLLOW_45_in_ruleElementList3228); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(90);}
					dbg.location(1046,3);
					pushFollow(FOLLOW_ruleKeyedElement_in_ruleElementList3233);
					ruleKeyedElement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop91;
				}
			}
			} finally {dbg.exitSubRule(91);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1048, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleElementList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleElementList"



	// $ANTLR start "ruleKeyedElement"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1051:1: ruleKeyedElement : ( ruleKey ':' )? ruleElement ;
	public final void ruleKeyedElement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleKeyedElement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1051, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1051:17: ( ( ruleKey ':' )? ruleElement )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1052:2: ( ruleKey ':' )? ruleElement
			{
			dbg.location(1052,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1052:2: ( ruleKey ':' )?
			int alt92=2;
			try { dbg.enterSubRule(92);
			try { dbg.enterDecision(92, decisionCanBacktrack[92]);

			switch ( input.LA(1) ) {
				case RULE_LETTER:
					{
					int LA92_1 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
				case RULE_INT_LIT:
					{
					int LA92_2 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
				case RULE_FLOAT_LIT:
					{
					int LA92_3 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
				case RULE_DECIMALS:
					{
					int LA92_4 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
				case 55:
					{
					int LA92_5 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
				case RULE_STRING:
					{
					int LA92_6 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
				case 78:
					{
					int LA92_7 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
				case 54:
					{
					int LA92_8 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
				case 73:
					{
					int LA92_9 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
				case 68:
					{
					int LA92_10 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
				case 41:
					{
					int LA92_11 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
				case 43:
					{
					int LA92_12 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
				case 72:
					{
					int LA92_13 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
				case 60:
					{
					int LA92_14 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
				case 52:
					{
					int LA92_15 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
				case RULE_UNARY_OP:
					{
					int LA92_16 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
				case 82:
					{
					int LA92_17 = input.LA(2);
					if ( (synpred137_DebugInternalGo()) ) {
						alt92=1;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(92);}

			switch (alt92) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1053:3: ruleKey ':'
					{
					dbg.location(1053,3);
					pushFollow(FOLLOW_ruleKey_in_ruleKeyedElement3251);
					ruleKey();
					state._fsp--;
					if (state.failed) return;dbg.location(1054,3);
					match(input,49,FOLLOW_49_in_ruleKeyedElement3255); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(92);}
			dbg.location(1056,2);
			pushFollow(FOLLOW_ruleElement_in_ruleKeyedElement3262);
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
		dbg.location(1057, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleKeyedElement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleKeyedElement"



	// $ANTLR start "ruleKey"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1060:1: ruleKey : ( ruleFieldName | ruleExpression | ruleLiteralValue ) ;
	public final void ruleKey() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleKey");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1060, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1060:8: ( ( ruleFieldName | ruleExpression | ruleLiteralValue ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1061:2: ( ruleFieldName | ruleExpression | ruleLiteralValue )
			{
			dbg.location(1061,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1061:2: ( ruleFieldName | ruleExpression | ruleLiteralValue )
			int alt93=3;
			try { dbg.enterSubRule(93);
			try { dbg.enterDecision(93, decisionCanBacktrack[93]);

			switch ( input.LA(1) ) {
			case RULE_LETTER:
				{
				int LA93_1 = input.LA(2);
				if ( (synpred138_DebugInternalGo()) ) {
					alt93=1;
				}
				else if ( (synpred139_DebugInternalGo()) ) {
					alt93=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 93, 1, input);
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
			case 41:
			case 43:
			case 52:
			case 54:
			case 55:
			case 60:
			case 68:
			case 72:
			case 73:
			case 78:
				{
				alt93=2;
				}
				break;
			case 82:
				{
				alt93=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 93, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(93);}

			switch (alt93) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1062:3: ruleFieldName
					{
					dbg.location(1062,3);
					pushFollow(FOLLOW_ruleFieldName_in_ruleKey3276);
					ruleFieldName();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1064:3: ruleExpression
					{
					dbg.location(1064,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleKey3288);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1066:3: ruleLiteralValue
					{
					dbg.location(1066,3);
					pushFollow(FOLLOW_ruleLiteralValue_in_ruleKey3300);
					ruleLiteralValue();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(93);}

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
			dbg.exitRule(getGrammarFileName(), "ruleKey");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleKey"



	// $ANTLR start "ruleFieldName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1071:1: ruleFieldName : ruleIDENTIFIER ;
	public final void ruleFieldName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFieldName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1071, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1071:14: ( ruleIDENTIFIER )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1072:2: ruleIDENTIFIER
			{
			dbg.location(1072,2);
			pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleFieldName3313);
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
		dbg.location(1073, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFieldName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFieldName"



	// $ANTLR start "ruleElement"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1076:1: ruleElement : ( ruleExpression | ruleLiteralValue ) ;
	public final void ruleElement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleElement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1076, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1076:12: ( ( ruleExpression | ruleLiteralValue ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1077:2: ( ruleExpression | ruleLiteralValue )
			{
			dbg.location(1077,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1077:2: ( ruleExpression | ruleLiteralValue )
			int alt94=2;
			try { dbg.enterSubRule(94);
			try { dbg.enterDecision(94, decisionCanBacktrack[94]);

			int LA94_0 = input.LA(1);
			if ( (LA94_0==RULE_DECIMALS||LA94_0==RULE_FLOAT_LIT||(LA94_0 >= RULE_INT_LIT && LA94_0 <= RULE_LETTER)||(LA94_0 >= RULE_STRING && LA94_0 <= RULE_UNARY_OP)||LA94_0==41||LA94_0==43||LA94_0==52||(LA94_0 >= 54 && LA94_0 <= 55)||LA94_0==60||LA94_0==68||(LA94_0 >= 72 && LA94_0 <= 73)||LA94_0==78) ) {
				alt94=1;
			}
			else if ( (LA94_0==82) ) {
				alt94=2;
			}

			else {
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1078:3: ruleExpression
					{
					dbg.location(1078,3);
					pushFollow(FOLLOW_ruleExpression_in_ruleElement3327);
					ruleExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1080:3: ruleLiteralValue
					{
					dbg.location(1080,3);
					pushFollow(FOLLOW_ruleLiteralValue_in_ruleElement3339);
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
		dbg.location(1082, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleElement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleElement"



	// $ANTLR start "ruleBasicLit"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1085:1: ruleBasicLit : ( RULE_INT_LIT | RULE_FLOAT_LIT | ruleIMAGINARY_LIT | ruleRUNE_LIT | RULE_STRING ) ;
	public final void ruleBasicLit() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleBasicLit");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1085, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1085:13: ( ( RULE_INT_LIT | RULE_FLOAT_LIT | ruleIMAGINARY_LIT | ruleRUNE_LIT | RULE_STRING ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1086:2: ( RULE_INT_LIT | RULE_FLOAT_LIT | ruleIMAGINARY_LIT | ruleRUNE_LIT | RULE_STRING )
			{
			dbg.location(1086,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1086:2: ( RULE_INT_LIT | RULE_FLOAT_LIT | ruleIMAGINARY_LIT | ruleRUNE_LIT | RULE_STRING )
			int alt95=5;
			try { dbg.enterSubRule(95);
			try { dbg.enterDecision(95, decisionCanBacktrack[95]);

			switch ( input.LA(1) ) {
			case RULE_INT_LIT:
				{
				alt95=1;
				}
				break;
			case RULE_FLOAT_LIT:
				{
				int LA95_2 = input.LA(2);
				if ( (LA95_2==56) ) {
					alt95=3;
				}
				else if ( (LA95_2==EOF||LA95_2==RULE_ASSING_OP||LA95_2==RULE_BINARY_OP||LA95_2==RULE_DECIMALS||LA95_2==RULE_FLOAT_LIT||(LA95_2 >= RULE_INT_LIT && LA95_2 <= RULE_LETTER)||(LA95_2 >= RULE_STRING && LA95_2 <= RULE_UNARY_OP)||(LA95_2 >= 41 && LA95_2 <= 49)||(LA95_2 >= 51 && LA95_2 <= 55)||(LA95_2 >= 57 && LA95_2 <= 64)||(LA95_2 >= 66 && LA95_2 <= 70)||(LA95_2 >= 72 && LA95_2 <= 73)||(LA95_2 >= 76 && LA95_2 <= 83)) ) {
					alt95=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 95, 2, input);
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
				alt95=3;
				}
				break;
			case 55:
				{
				alt95=4;
				}
				break;
			case RULE_STRING:
				{
				alt95=5;
				}
				break;
			default:
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

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1087:3: RULE_INT_LIT
					{
					dbg.location(1087,3);
					match(input,RULE_INT_LIT,FOLLOW_RULE_INT_LIT_in_ruleBasicLit3356); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1089:3: RULE_FLOAT_LIT
					{
					dbg.location(1089,3);
					match(input,RULE_FLOAT_LIT,FOLLOW_RULE_FLOAT_LIT_in_ruleBasicLit3368); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1091:3: ruleIMAGINARY_LIT
					{
					dbg.location(1091,3);
					pushFollow(FOLLOW_ruleIMAGINARY_LIT_in_ruleBasicLit3380);
					ruleIMAGINARY_LIT();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1093:3: ruleRUNE_LIT
					{
					dbg.location(1093,3);
					pushFollow(FOLLOW_ruleRUNE_LIT_in_ruleBasicLit3392);
					ruleRUNE_LIT();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1095:3: RULE_STRING
					{
					dbg.location(1095,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBasicLit3404); if (state.failed) return;
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
		dbg.location(1097, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleBasicLit");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleBasicLit"



	// $ANTLR start "ruleReceiverType"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1100:1: ruleReceiverType : ruleType ;
	public final void ruleReceiverType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleReceiverType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1100, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1100:17: ( ruleType )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1101:2: ruleType
			{
			dbg.location(1101,2);
			pushFollow(FOLLOW_ruleType_in_ruleReceiverType3417);
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
		dbg.location(1102, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleReceiverType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleReceiverType"



	// $ANTLR start "ruleFunctionBody"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1105:1: ruleFunctionBody : ruleBlock ;
	public final void ruleFunctionBody() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleFunctionBody");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1105, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1105:17: ( ruleBlock )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1106:2: ruleBlock
			{
			dbg.location(1106,2);
			pushFollow(FOLLOW_ruleBlock_in_ruleFunctionBody3427);
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
		dbg.location(1107, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleFunctionBody");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleFunctionBody"



	// $ANTLR start "ruleOperandName"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1110:1: ruleOperandName : ( ruleIDENTIFIER | ruleQualifiedIdent ) ;
	public final void ruleOperandName() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleOperandName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1110, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1110:16: ( ( ruleIDENTIFIER | ruleQualifiedIdent ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1111:2: ( ruleIDENTIFIER | ruleQualifiedIdent )
			{
			dbg.location(1111,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1111:2: ( ruleIDENTIFIER | ruleQualifiedIdent )
			int alt96=2;
			try { dbg.enterSubRule(96);
			try { dbg.enterDecision(96, decisionCanBacktrack[96]);

			try {
				isCyclicDecision = true;
				alt96 = dfa96.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(96);}

			switch (alt96) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1112:3: ruleIDENTIFIER
					{
					dbg.location(1112,3);
					pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleOperandName3441);
					ruleIDENTIFIER();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1114:3: ruleQualifiedIdent
					{
					dbg.location(1114,3);
					pushFollow(FOLLOW_ruleQualifiedIdent_in_ruleOperandName3453);
					ruleQualifiedIdent();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(1116, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleOperandName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleOperandName"



	// $ANTLR start "ruleImportDecl"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1119:1: ruleImportDecl : 'import' ( ruleImportSpec | '(' ( ruleImportSpec )* ')' ) ;
	public final void ruleImportDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleImportDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1119, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1119:15: ( 'import' ( ruleImportSpec | '(' ( ruleImportSpec )* ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1120:2: 'import' ( ruleImportSpec | '(' ( ruleImportSpec )* ')' )
			{
			dbg.location(1120,2);
			match(input,71,FOLLOW_71_in_ruleImportDecl3466); if (state.failed) return;dbg.location(1121,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1121:2: ( ruleImportSpec | '(' ( ruleImportSpec )* ')' )
			int alt98=2;
			try { dbg.enterSubRule(98);
			try { dbg.enterDecision(98, decisionCanBacktrack[98]);

			int LA98_0 = input.LA(1);
			if ( (LA98_0==RULE_LETTER||LA98_0==RULE_STRING||LA98_0==47) ) {
				alt98=1;
			}
			else if ( (LA98_0==41) ) {
				alt98=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(98);}

			switch (alt98) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1122:3: ruleImportSpec
					{
					dbg.location(1122,3);
					pushFollow(FOLLOW_ruleImportSpec_in_ruleImportDecl3473);
					ruleImportSpec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1124:3: '(' ( ruleImportSpec )* ')'
					{
					dbg.location(1124,3);
					match(input,41,FOLLOW_41_in_ruleImportDecl3485); if (state.failed) return;dbg.location(1125,3);
					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1125:3: ( ruleImportSpec )*
					try { dbg.enterSubRule(97);

					loop97:
					while (true) {
						int alt97=2;
						try { dbg.enterDecision(97, decisionCanBacktrack[97]);

						int LA97_0 = input.LA(1);
						if ( (LA97_0==RULE_LETTER||LA97_0==RULE_STRING||LA97_0==47) ) {
							alt97=1;
						}

						} finally {dbg.exitDecision(97);}

						switch (alt97) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1125:3: ruleImportSpec
							{
							dbg.location(1125,3);
							pushFollow(FOLLOW_ruleImportSpec_in_ruleImportDecl3489);
							ruleImportSpec();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop97;
						}
					}
					} finally {dbg.exitSubRule(97);}
					dbg.location(1127,3);
					match(input,42,FOLLOW_42_in_ruleImportDecl3497); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(98);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(1129, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleImportDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleImportDecl"



	// $ANTLR start "ruleImportSpec"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1132:1: ruleImportSpec : ( '.' | ruleIDENTIFIER )? ruleImportPath ;
	public final void ruleImportSpec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleImportSpec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1132, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1132:15: ( ( '.' | ruleIDENTIFIER )? ruleImportPath )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1133:2: ( '.' | ruleIDENTIFIER )? ruleImportPath
			{
			dbg.location(1133,2);
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1133:2: ( '.' | ruleIDENTIFIER )?
			int alt99=3;
			try { dbg.enterSubRule(99);
			try { dbg.enterDecision(99, decisionCanBacktrack[99]);

			int LA99_0 = input.LA(1);
			if ( (LA99_0==47) ) {
				alt99=1;
			}
			else if ( (LA99_0==RULE_LETTER) ) {
				alt99=2;
			}
			} finally {dbg.exitDecision(99);}

			switch (alt99) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1134:3: '.'
					{
					dbg.location(1134,3);
					match(input,47,FOLLOW_47_in_ruleImportSpec3514); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1136:3: ruleIDENTIFIER
					{
					dbg.location(1136,3);
					pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleImportSpec3526);
					ruleIDENTIFIER();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(99);}
			dbg.location(1138,2);
			pushFollow(FOLLOW_ruleImportPath_in_ruleImportSpec3533);
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
		dbg.location(1139, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleImportSpec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleImportSpec"



	// $ANTLR start "ruleImportPath"
	// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1142:1: ruleImportPath : RULE_STRING ;
	public final void ruleImportPath() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleImportPath");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1142, 0);

		try {
			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1142:15: ( RULE_STRING )
			dbg.enterAlt(1);

			// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1143:2: RULE_STRING
			{
			dbg.location(1143,2);
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImportPath3543); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "ruleImportPath");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleImportPath"

	// $ANTLR start synpred15_DebugInternalGo
	public final void synpred15_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:124:3: ( ruleIDENTIFIER )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:124:3: ruleIDENTIFIER
		{
		dbg.location(124,3);
		pushFollow(FOLLOW_ruleIDENTIFIER_in_synpred15_DebugInternalGo366);
		ruleIDENTIFIER();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred15_DebugInternalGo

	// $ANTLR start synpred24_DebugInternalGo
	public final void synpred24_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:202:3: ( ruleIdentifierList ruleType )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:202:3: ruleIdentifierList ruleType
		{
		dbg.location(202,3);
		pushFollow(FOLLOW_ruleIdentifierList_in_synpred24_DebugInternalGo608);
		ruleIdentifierList();
		state._fsp--;
		if (state.failed) return;dbg.location(203,3);
		pushFollow(FOLLOW_ruleType_in_synpred24_DebugInternalGo612);
		ruleType();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred24_DebugInternalGo

	// $ANTLR start synpred26_DebugInternalGo
	public final void synpred26_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:215:3: ( ',' ruleIDENTIFIER )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:215:3: ',' ruleIDENTIFIER
		{
		dbg.location(215,3);
		match(input,45,FOLLOW_45_in_synpred26_DebugInternalGo650); if (state.failed) return;dbg.location(216,3);
		pushFollow(FOLLOW_ruleIDENTIFIER_in_synpred26_DebugInternalGo654);
		ruleIDENTIFIER();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred26_DebugInternalGo

	// $ANTLR start synpred28_DebugInternalGo
	public final void synpred28_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:251:2: ( ruleResult )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:251:2: ruleResult
		{
		dbg.location(251,2);
		pushFollow(FOLLOW_ruleResult_in_synpred28_DebugInternalGo731);
		ruleResult();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred28_DebugInternalGo

	// $ANTLR start synpred29_DebugInternalGo
	public final void synpred29_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:258:3: ( ruleParameters )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:258:3: ruleParameters
		{
		dbg.location(258,3);
		pushFollow(FOLLOW_ruleParameters_in_synpred29_DebugInternalGo748);
		ruleParameters();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred29_DebugInternalGo

	// $ANTLR start synpred30_DebugInternalGo
	public final void synpred30_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:267:2: ( ruleParameterList )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:267:2: ruleParameterList
		{
		dbg.location(267,2);
		pushFollow(FOLLOW_ruleParameterList_in_synpred30_DebugInternalGo776);
		ruleParameterList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred30_DebugInternalGo

	// $ANTLR start synpred32_DebugInternalGo
	public final void synpred32_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:283:2: ( ruleIdentifierList )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:283:2: ruleIdentifierList
		{
		dbg.location(283,2);
		pushFollow(FOLLOW_ruleIdentifierList_in_synpred32_DebugInternalGo817);
		ruleIdentifierList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred32_DebugInternalGo

	// $ANTLR start synpred37_DebugInternalGo
	public final void synpred37_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:339:3: ( '<-' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:339:3: '<-'
		{
		dbg.location(339,3);
		match(input,52,FOLLOW_52_in_synpred37_DebugInternalGo964); if (state.failed) return;
		}

	}
	// $ANTLR end synpred37_DebugInternalGo

	// $ANTLR start synpred39_DebugInternalGo
	public final void synpred39_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:358:3: ( ';' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:358:3: ';'
		{
		dbg.location(358,3);
		match(input,51,FOLLOW_51_in_synpred39_DebugInternalGo1021); if (state.failed) return;
		}

	}
	// $ANTLR end synpred39_DebugInternalGo

	// $ANTLR start synpred42_DebugInternalGo
	public final void synpred42_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:367:3: ( ruleLabeledStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:367:3: ruleLabeledStmt
		{
		dbg.location(367,3);
		pushFollow(FOLLOW_ruleLabeledStmt_in_synpred42_DebugInternalGo1052);
		ruleLabeledStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred42_DebugInternalGo

	// $ANTLR start synpred43_DebugInternalGo
	public final void synpred43_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:369:3: ( ruleSimpleStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:369:3: ruleSimpleStmt
		{
		dbg.location(369,3);
		pushFollow(FOLLOW_ruleSimpleStmt_in_synpred43_DebugInternalGo1064);
		ruleSimpleStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred43_DebugInternalGo

	// $ANTLR start synpred44_DebugInternalGo
	public final void synpred44_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:371:3: ( ruleGoStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:371:3: ruleGoStmt
		{
		dbg.location(371,3);
		pushFollow(FOLLOW_ruleGoStmt_in_synpred44_DebugInternalGo1076);
		ruleGoStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred44_DebugInternalGo

	// $ANTLR start synpred48_DebugInternalGo
	public final void synpred48_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:379:3: ( ruleGotoStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:379:3: ruleGotoStmt
		{
		dbg.location(379,3);
		pushFollow(FOLLOW_ruleGotoStmt_in_synpred48_DebugInternalGo1124);
		ruleGotoStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred48_DebugInternalGo

	// $ANTLR start synpred57_DebugInternalGo
	public final void synpred57_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:418:3: ( ruleIncDecStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:418:3: ruleIncDecStmt
		{
		dbg.location(418,3);
		pushFollow(FOLLOW_ruleIncDecStmt_in_synpred57_DebugInternalGo1282);
		ruleIncDecStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred57_DebugInternalGo

	// $ANTLR start synpred58_DebugInternalGo
	public final void synpred58_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:420:3: ( ruleAssignment )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:420:3: ruleAssignment
		{
		dbg.location(420,3);
		pushFollow(FOLLOW_ruleAssignment_in_synpred58_DebugInternalGo1294);
		ruleAssignment();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred58_DebugInternalGo

	// $ANTLR start synpred59_DebugInternalGo
	public final void synpred59_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:422:3: ( ruleSendStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:422:3: ruleSendStmt
		{
		dbg.location(422,3);
		pushFollow(FOLLOW_ruleSendStmt_in_synpred59_DebugInternalGo1306);
		ruleSendStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred59_DebugInternalGo

	// $ANTLR start synpred60_DebugInternalGo
	public final void synpred60_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:424:3: ( ruleShortVarDecl )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:424:3: ruleShortVarDecl
		{
		dbg.location(424,3);
		pushFollow(FOLLOW_ruleShortVarDecl_in_synpred60_DebugInternalGo1318);
		ruleShortVarDecl();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred60_DebugInternalGo

	// $ANTLR start synpred61_DebugInternalGo
	public final void synpred61_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:426:3: ( ruleExpressionStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:426:3: ruleExpressionStmt
		{
		dbg.location(426,3);
		pushFollow(FOLLOW_ruleExpressionStmt_in_synpred61_DebugInternalGo1330);
		ruleExpressionStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred61_DebugInternalGo

	// $ANTLR start synpred62_DebugInternalGo
	public final void synpred62_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:441:2: ( ruleExpressionList )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:441:2: ruleExpressionList
		{
		dbg.location(441,2);
		pushFollow(FOLLOW_ruleExpressionList_in_synpred62_DebugInternalGo1371);
		ruleExpressionList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred62_DebugInternalGo

	// $ANTLR start synpred63_DebugInternalGo
	public final void synpred63_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:448:2: ( ruleLabel )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:448:2: ruleLabel
		{
		dbg.location(448,2);
		pushFollow(FOLLOW_ruleLabel_in_synpred63_DebugInternalGo1387);
		ruleLabel();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred63_DebugInternalGo

	// $ANTLR start synpred64_DebugInternalGo
	public final void synpred64_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:454:2: ( ruleLabel )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:454:2: ruleLabel
		{
		dbg.location(454,2);
		pushFollow(FOLLOW_ruleLabel_in_synpred64_DebugInternalGo1401);
		ruleLabel();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred64_DebugInternalGo

	// $ANTLR start synpred65_DebugInternalGo
	public final void synpred65_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:467:3: ( ruleSimpleStmt ';' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:467:3: ruleSimpleStmt ';'
		{
		dbg.location(467,3);
		pushFollow(FOLLOW_ruleSimpleStmt_in_synpred65_DebugInternalGo1432);
		ruleSimpleStmt();
		state._fsp--;
		if (state.failed) return;dbg.location(468,3);
		match(input,51,FOLLOW_51_in_synpred65_DebugInternalGo1436); if (state.failed) return;
		}

	}
	// $ANTLR end synpred65_DebugInternalGo

	// $ANTLR start synpred68_DebugInternalGo
	public final void synpred68_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:490:3: ( ruleExprSwitchStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:490:3: ruleExprSwitchStmt
		{
		dbg.location(490,3);
		pushFollow(FOLLOW_ruleExprSwitchStmt_in_synpred68_DebugInternalGo1508);
		ruleExprSwitchStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred68_DebugInternalGo

	// $ANTLR start synpred70_DebugInternalGo
	public final void synpred70_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:509:3: ( ruleCondition )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:509:3: ruleCondition
		{
		dbg.location(509,3);
		pushFollow(FOLLOW_ruleCondition_in_synpred70_DebugInternalGo1562);
		ruleCondition();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred70_DebugInternalGo

	// $ANTLR start synpred71_DebugInternalGo
	public final void synpred71_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:511:3: ( ruleForClause )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:511:3: ruleForClause
		{
		dbg.location(511,3);
		pushFollow(FOLLOW_ruleForClause_in_synpred71_DebugInternalGo1574);
		ruleForClause();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred71_DebugInternalGo

	// $ANTLR start synpred72_DebugInternalGo
	public final void synpred72_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:513:3: ( ruleRangeClause )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:513:3: ruleRangeClause
		{
		dbg.location(513,3);
		pushFollow(FOLLOW_ruleRangeClause_in_synpred72_DebugInternalGo1586);
		ruleRangeClause();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred72_DebugInternalGo

	// $ANTLR start synpred77_DebugInternalGo
	public final void synpred77_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:543:3: ( ( ruleType )? '=' ruleExpressionList )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:543:3: ( ruleType )? '=' ruleExpressionList
		{
		dbg.location(543,3);
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:543:3: ( ruleType )?
		int alt106=2;
		try { dbg.enterSubRule(106);
		try { dbg.enterDecision(106, decisionCanBacktrack[106]);

		int LA106_0 = input.LA(1);
		if ( (LA106_0==RULE_LETTER||LA106_0==41||LA106_0==43||LA106_0==52||LA106_0==54||LA106_0==60||LA106_0==68||(LA106_0 >= 72 && LA106_0 <= 73)||LA106_0==78) ) {
			alt106=1;
		}
		} finally {dbg.exitDecision(106);}

		switch (alt106) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:543:3: ruleType
				{
				dbg.location(543,3);
				pushFollow(FOLLOW_ruleType_in_synpred77_DebugInternalGo1679);
				ruleType();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(106);}
		dbg.location(545,3);
		match(input,53,FOLLOW_53_in_synpred77_DebugInternalGo1687); if (state.failed) return;dbg.location(546,3);
		pushFollow(FOLLOW_ruleExpressionList_in_synpred77_DebugInternalGo1691);
		ruleExpressionList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred77_DebugInternalGo

	// $ANTLR start synpred83_DebugInternalGo
	public final void synpred83_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:605:2: ( ruleType )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:605:2: ruleType
		{
		dbg.location(605,2);
		pushFollow(FOLLOW_ruleType_in_synpred83_DebugInternalGo1876);
		ruleType();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred83_DebugInternalGo

	// $ANTLR start synpred85_DebugInternalGo
	public final void synpred85_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:638:3: ( ruleExpression '++' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:638:3: ruleExpression '++'
		{
		dbg.location(638,3);
		pushFollow(FOLLOW_ruleExpression_in_synpred85_DebugInternalGo1954);
		ruleExpression();
		state._fsp--;
		if (state.failed) return;dbg.location(639,3);
		match(input,44,FOLLOW_44_in_synpred85_DebugInternalGo1958); if (state.failed) return;
		}

	}
	// $ANTLR end synpred85_DebugInternalGo

	// $ANTLR start synpred86_DebugInternalGo
	public final void synpred86_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:664:3: ( ruleSimpleStmt ';' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:664:3: ruleSimpleStmt ';'
		{
		dbg.location(664,3);
		pushFollow(FOLLOW_ruleSimpleStmt_in_synpred86_DebugInternalGo2026);
		ruleSimpleStmt();
		state._fsp--;
		if (state.failed) return;dbg.location(665,3);
		match(input,51,FOLLOW_51_in_synpred86_DebugInternalGo2030); if (state.failed) return;
		}

	}
	// $ANTLR end synpred86_DebugInternalGo

	// $ANTLR start synpred90_DebugInternalGo
	public final void synpred90_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:696:3: ( ruleSimpleStmt ';' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:696:3: ruleSimpleStmt ';'
		{
		dbg.location(696,3);
		pushFollow(FOLLOW_ruleSimpleStmt_in_synpred90_DebugInternalGo2118);
		ruleSimpleStmt();
		state._fsp--;
		if (state.failed) return;dbg.location(697,3);
		match(input,51,FOLLOW_51_in_synpred90_DebugInternalGo2122); if (state.failed) return;
		}

	}
	// $ANTLR end synpred90_DebugInternalGo

	// $ANTLR start synpred95_DebugInternalGo
	public final void synpred95_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:757:4: ( ruleSendStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:757:4: ruleSendStmt
		{
		dbg.location(757,4);
		pushFollow(FOLLOW_ruleSendStmt_in_synpred95_DebugInternalGo2291);
		ruleSendStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred95_DebugInternalGo

	// $ANTLR start synpred97_DebugInternalGo
	public final void synpred97_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:769:3: ( ruleExpressionList '=' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:769:3: ruleExpressionList '='
		{
		dbg.location(769,3);
		pushFollow(FOLLOW_ruleExpressionList_in_synpred97_DebugInternalGo2338);
		ruleExpressionList();
		state._fsp--;
		if (state.failed) return;dbg.location(770,3);
		match(input,53,FOLLOW_53_in_synpred97_DebugInternalGo2342); if (state.failed) return;
		}

	}
	// $ANTLR end synpred97_DebugInternalGo

	// $ANTLR start synpred98_DebugInternalGo
	public final void synpred98_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:772:3: ( ruleIdentifierList ':=' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:772:3: ruleIdentifierList ':='
		{
		dbg.location(772,3);
		pushFollow(FOLLOW_ruleIdentifierList_in_synpred98_DebugInternalGo2354);
		ruleIdentifierList();
		state._fsp--;
		if (state.failed) return;dbg.location(773,3);
		match(input,50,FOLLOW_50_in_synpred98_DebugInternalGo2358); if (state.failed) return;
		}

	}
	// $ANTLR end synpred98_DebugInternalGo

	// $ANTLR start synpred99_DebugInternalGo
	public final void synpred99_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:790:2: ( ruleInitStmt )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:790:2: ruleInitStmt
		{
		dbg.location(790,2);
		pushFollow(FOLLOW_ruleInitStmt_in_synpred99_DebugInternalGo2395);
		ruleInitStmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred99_DebugInternalGo

	// $ANTLR start synpred105_DebugInternalGo
	public final void synpred105_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:846:3: ( RULE_BINARY_OP ruleExpression ruleExpression2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:846:3: RULE_BINARY_OP ruleExpression ruleExpression2
		{
		dbg.location(846,3);
		match(input,RULE_BINARY_OP,FOLLOW_RULE_BINARY_OP_in_synpred105_DebugInternalGo2542); if (state.failed) return;dbg.location(847,3);
		pushFollow(FOLLOW_ruleExpression_in_synpred105_DebugInternalGo2546);
		ruleExpression();
		state._fsp--;
		if (state.failed) return;dbg.location(848,3);
		pushFollow(FOLLOW_ruleExpression2_in_synpred105_DebugInternalGo2550);
		ruleExpression2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred105_DebugInternalGo

	// $ANTLR start synpred107_DebugInternalGo
	public final void synpred107_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:865:3: ( ruleOperand rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:865:3: ruleOperand rulePrimaryExpr2
		{
		dbg.location(865,3);
		pushFollow(FOLLOW_ruleOperand_in_synpred107_DebugInternalGo2601);
		ruleOperand();
		state._fsp--;
		if (state.failed) return;dbg.location(866,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred107_DebugInternalGo2605);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred107_DebugInternalGo

	// $ANTLR start synpred108_DebugInternalGo
	public final void synpred108_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:868:3: ( ruleConversion rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:868:3: ruleConversion rulePrimaryExpr2
		{
		dbg.location(868,3);
		pushFollow(FOLLOW_ruleConversion_in_synpred108_DebugInternalGo2617);
		ruleConversion();
		state._fsp--;
		if (state.failed) return;dbg.location(869,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred108_DebugInternalGo2621);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred108_DebugInternalGo

	// $ANTLR start synpred109_DebugInternalGo
	public final void synpred109_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:879:3: ( ruleSelector rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:879:3: ruleSelector rulePrimaryExpr2
		{
		dbg.location(879,3);
		pushFollow(FOLLOW_ruleSelector_in_synpred109_DebugInternalGo2654);
		ruleSelector();
		state._fsp--;
		if (state.failed) return;dbg.location(880,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred109_DebugInternalGo2658);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred109_DebugInternalGo

	// $ANTLR start synpred110_DebugInternalGo
	public final void synpred110_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:882:3: ( ruleIndex rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:882:3: ruleIndex rulePrimaryExpr2
		{
		dbg.location(882,3);
		pushFollow(FOLLOW_ruleIndex_in_synpred110_DebugInternalGo2670);
		ruleIndex();
		state._fsp--;
		if (state.failed) return;dbg.location(883,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred110_DebugInternalGo2674);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred110_DebugInternalGo

	// $ANTLR start synpred111_DebugInternalGo
	public final void synpred111_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:885:3: ( ruleSlice rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:885:3: ruleSlice rulePrimaryExpr2
		{
		dbg.location(885,3);
		pushFollow(FOLLOW_ruleSlice_in_synpred111_DebugInternalGo2686);
		ruleSlice();
		state._fsp--;
		if (state.failed) return;dbg.location(886,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred111_DebugInternalGo2690);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred111_DebugInternalGo

	// $ANTLR start synpred112_DebugInternalGo
	public final void synpred112_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:888:3: ( ruleTypeAssertion rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:888:3: ruleTypeAssertion rulePrimaryExpr2
		{
		dbg.location(888,3);
		pushFollow(FOLLOW_ruleTypeAssertion_in_synpred112_DebugInternalGo2702);
		ruleTypeAssertion();
		state._fsp--;
		if (state.failed) return;dbg.location(889,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred112_DebugInternalGo2706);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred112_DebugInternalGo

	// $ANTLR start synpred113_DebugInternalGo
	public final void synpred113_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:891:3: ( ruleArguments rulePrimaryExpr2 )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:891:3: ruleArguments rulePrimaryExpr2
		{
		dbg.location(891,3);
		pushFollow(FOLLOW_ruleArguments_in_synpred113_DebugInternalGo2718);
		ruleArguments();
		state._fsp--;
		if (state.failed) return;dbg.location(892,3);
		pushFollow(FOLLOW_rulePrimaryExpr2_in_synpred113_DebugInternalGo2722);
		rulePrimaryExpr2();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred113_DebugInternalGo

	// $ANTLR start synpred114_DebugInternalGo
	public final void synpred114_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:899:3: ( ruleLiteral )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:899:3: ruleLiteral
		{
		dbg.location(899,3);
		pushFollow(FOLLOW_ruleLiteral_in_synpred114_DebugInternalGo2740);
		ruleLiteral();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred114_DebugInternalGo

	// $ANTLR start synpred115_DebugInternalGo
	public final void synpred115_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:901:3: ( ruleOperandName )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:901:3: ruleOperandName
		{
		dbg.location(901,3);
		pushFollow(FOLLOW_ruleOperandName_in_synpred115_DebugInternalGo2752);
		ruleOperandName();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred115_DebugInternalGo

	// $ANTLR start synpred119_DebugInternalGo
	public final void synpred119_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:941:3: ( '[' ( ruleExpression )? ':' ( ruleExpression )? ']' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:941:3: '[' ( ruleExpression )? ':' ( ruleExpression )? ']'
		{
		dbg.location(941,3);
		match(input,54,FOLLOW_54_in_synpred119_DebugInternalGo2857); if (state.failed) return;dbg.location(942,3);
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:942:3: ( ruleExpression )?
		int alt108=2;
		try { dbg.enterSubRule(108);
		try { dbg.enterDecision(108, decisionCanBacktrack[108]);

		int LA108_0 = input.LA(1);
		if ( (LA108_0==RULE_DECIMALS||LA108_0==RULE_FLOAT_LIT||(LA108_0 >= RULE_INT_LIT && LA108_0 <= RULE_LETTER)||(LA108_0 >= RULE_STRING && LA108_0 <= RULE_UNARY_OP)||LA108_0==41||LA108_0==43||LA108_0==52||(LA108_0 >= 54 && LA108_0 <= 55)||LA108_0==60||LA108_0==68||(LA108_0 >= 72 && LA108_0 <= 73)||LA108_0==78) ) {
			alt108=1;
		}
		} finally {dbg.exitDecision(108);}

		switch (alt108) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:942:3: ruleExpression
				{
				dbg.location(942,3);
				pushFollow(FOLLOW_ruleExpression_in_synpred119_DebugInternalGo2861);
				ruleExpression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(108);}
		dbg.location(944,3);
		match(input,49,FOLLOW_49_in_synpred119_DebugInternalGo2869); if (state.failed) return;dbg.location(945,3);
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:945:3: ( ruleExpression )?
		int alt109=2;
		try { dbg.enterSubRule(109);
		try { dbg.enterDecision(109, decisionCanBacktrack[109]);

		int LA109_0 = input.LA(1);
		if ( (LA109_0==RULE_DECIMALS||LA109_0==RULE_FLOAT_LIT||(LA109_0 >= RULE_INT_LIT && LA109_0 <= RULE_LETTER)||(LA109_0 >= RULE_STRING && LA109_0 <= RULE_UNARY_OP)||LA109_0==41||LA109_0==43||LA109_0==52||(LA109_0 >= 54 && LA109_0 <= 55)||LA109_0==60||LA109_0==68||(LA109_0 >= 72 && LA109_0 <= 73)||LA109_0==78) ) {
			alt109=1;
		}
		} finally {dbg.exitDecision(109);}

		switch (alt109) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:945:3: ruleExpression
				{
				dbg.location(945,3);
				pushFollow(FOLLOW_ruleExpression_in_synpred119_DebugInternalGo2873);
				ruleExpression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(109);}
		dbg.location(947,3);
		match(input,57,FOLLOW_57_in_synpred119_DebugInternalGo2881); if (state.failed) return;
		}

	}
	// $ANTLR end synpred119_DebugInternalGo

	// $ANTLR start synpred121_DebugInternalGo
	public final void synpred121_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:973:4: ( ruleExpressionList )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:973:4: ruleExpressionList
		{
		dbg.location(973,4);
		pushFollow(FOLLOW_ruleExpressionList_in_synpred121_DebugInternalGo2965);
		ruleExpressionList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred121_DebugInternalGo

	// $ANTLR start synpred137_DebugInternalGo
	public final void synpred137_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1053:3: ( ruleKey ':' )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1053:3: ruleKey ':'
		{
		dbg.location(1053,3);
		pushFollow(FOLLOW_ruleKey_in_synpred137_DebugInternalGo3251);
		ruleKey();
		state._fsp--;
		if (state.failed) return;dbg.location(1054,3);
		match(input,49,FOLLOW_49_in_synpred137_DebugInternalGo3255); if (state.failed) return;
		}

	}
	// $ANTLR end synpred137_DebugInternalGo

	// $ANTLR start synpred138_DebugInternalGo
	public final void synpred138_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1062:3: ( ruleFieldName )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1062:3: ruleFieldName
		{
		dbg.location(1062,3);
		pushFollow(FOLLOW_ruleFieldName_in_synpred138_DebugInternalGo3276);
		ruleFieldName();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred138_DebugInternalGo

	// $ANTLR start synpred139_DebugInternalGo
	public final void synpred139_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1064:3: ( ruleExpression )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1064:3: ruleExpression
		{
		dbg.location(1064,3);
		pushFollow(FOLLOW_ruleExpression_in_synpred139_DebugInternalGo3288);
		ruleExpression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred139_DebugInternalGo

	// $ANTLR start synpred145_DebugInternalGo
	public final void synpred145_DebugInternalGo_fragment() throws RecognitionException {
		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1112:3: ( ruleIDENTIFIER )
		dbg.enterAlt(1);

		// C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\DebugInternalGo.g:1112:3: ruleIDENTIFIER
		{
		dbg.location(1112,3);
		pushFollow(FOLLOW_ruleIDENTIFIER_in_synpred145_DebugInternalGo3441);
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
	public final boolean synpred32_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred32_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred44_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred44_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred30_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred30_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred15_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred15_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred65_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred65_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred77_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred77_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred24_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred24_DebugInternalGo_fragment(); // can never throw exception
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
	public final boolean synpred42_DebugInternalGo() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred42_DebugInternalGo_fragment(); // can never throw exception
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


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA12 dfa12 = new DFA12(this);
	protected DFA24 dfa24 = new DFA24(this);
	protected DFA29 dfa29 = new DFA29(this);
	protected DFA48 dfa48 = new DFA48(this);
	protected DFA60 dfa60 = new DFA60(this);
	protected DFA69 dfa69 = new DFA69(this);
	protected DFA96 dfa96 = new DFA96(this);
	static final String DFA9_eotS =
		"\11\uffff";
	static final String DFA9_eofS =
		"\1\uffff\1\3\2\uffff\1\3\4\uffff";
	static final String DFA9_minS =
		"\1\27\1\12\1\0\1\uffff\1\12\1\27\1\uffff\2\0";
	static final String DFA9_maxS =
		"\1\27\1\123\1\0\1\uffff\1\123\1\27\1\uffff\2\0";
	static final String DFA9_acceptS =
		"\3\uffff\1\1\2\uffff\1\2\2\uffff";
	static final String DFA9_specialS =
		"\2\uffff\1\0\4\uffff\1\1\1\2}>";
	static final String[] DFA9_transitionS = {
			"\1\1",
			"\1\3\4\uffff\1\3\5\uffff\2\3\1\2\7\uffff\1\3\2\uffff\2\3\1\uffff\1\4"+
			"\3\uffff\3\3\1\uffff\1\3\1\uffff\1\5\2\3\1\uffff\5\3\1\uffff\10\3\1\uffff"+
			"\5\3\1\uffff\2\3\2\uffff\10\3",
			"\1\uffff",
			"",
			"\1\3\4\uffff\1\3\5\uffff\2\3\1\7\7\uffff\1\3\2\uffff\2\3\1\uffff\1\4"+
			"\3\uffff\3\3\1\uffff\1\3\1\uffff\1\5\2\3\1\uffff\5\3\1\uffff\10\3\1\uffff"+
			"\5\3\1\uffff\2\3\2\uffff\10\3",
			"\1\10",
			"",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "123:2: ( ruleIDENTIFIER | ruleQualifiedIdent )";
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
						int LA9_2 = input.LA(1);
						 
						int index9_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred15_DebugInternalGo()) ) {s = 3;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index9_2);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA9_7 = input.LA(1);
						 
						int index9_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred15_DebugInternalGo()) ) {s = 3;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index9_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA9_8 = input.LA(1);
						 
						int index9_8 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred15_DebugInternalGo()) ) {s = 3;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index9_8);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 9, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA12_eotS =
		"\7\uffff";
	static final String DFA12_eofS =
		"\7\uffff";
	static final String DFA12_minS =
		"\1\27\1\25\1\uffff\1\0\1\uffff\1\25\1\0";
	static final String DFA12_maxS =
		"\1\53\1\116\1\uffff\1\0\1\uffff\1\116\1\0";
	static final String DFA12_acceptS =
		"\2\uffff\1\2\1\uffff\1\1\2\uffff";
	static final String DFA12_specialS =
		"\3\uffff\1\0\2\uffff\1\1}>";
	static final String[] DFA12_transitionS = {
			"\1\1\23\uffff\1\2",
			"\1\2\1\uffff\1\3\7\uffff\1\2\5\uffff\1\5\3\uffff\1\4\1\uffff\1\4\1\uffff"+
			"\1\4\1\uffff\1\2\3\uffff\1\2\1\4\1\uffff\1\4\5\uffff\1\4\7\uffff\1\4"+
			"\3\uffff\2\4\4\uffff\1\4",
			"",
			"\1\uffff",
			"",
			"\1\2\1\uffff\1\6\7\uffff\1\2\5\uffff\1\5\3\uffff\1\4\1\uffff\1\4\1\uffff"+
			"\1\4\1\uffff\1\2\3\uffff\1\2\1\4\1\uffff\1\4\5\uffff\1\4\7\uffff\1\4"+
			"\3\uffff\2\4\4\uffff\1\4",
			"\1\uffff"
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "201:2: ( ruleIdentifierList ruleType | ruleEmbeddedField )";
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
						int LA12_3 = input.LA(1);
						 
						int index12_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred24_DebugInternalGo()) ) {s = 4;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index12_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA12_6 = input.LA(1);
						 
						int index12_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred24_DebugInternalGo()) ) {s = 4;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index12_6);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 12, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA24_eotS =
		"\5\uffff";
	static final String DFA24_eofS =
		"\5\uffff";
	static final String DFA24_minS =
		"\3\27\2\uffff";
	static final String DFA24_maxS =
		"\1\27\2\63\2\uffff";
	static final String DFA24_acceptS =
		"\3\uffff\1\1\1\2";
	static final String DFA24_specialS =
		"\5\uffff}>";
	static final String[] DFA24_transitionS = {
			"\1\1",
			"\1\2\15\uffff\1\2\3\uffff\1\3\5\uffff\1\4\3\uffff\1\4",
			"\1\2\15\uffff\1\2\3\uffff\1\3\5\uffff\1\4\3\uffff\1\4",
			"",
			""
	};

	static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
	static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
	static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
	static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
	static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
	static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
	static final short[][] DFA24_transition;

	static {
		int numStates = DFA24_transitionS.length;
		DFA24_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
		}
	}

	protected class DFA24 extends DFA {

		public DFA24(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 24;
			this.eot = DFA24_eot;
			this.eof = DFA24_eof;
			this.min = DFA24_min;
			this.max = DFA24_max;
			this.accept = DFA24_accept;
			this.special = DFA24_special;
			this.transition = DFA24_transition;
		}
		@Override
		public String getDescription() {
			return "303:2: ( ruleMethodName ruleSignature | ruleInterfaceTypeName )";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA29_eotS =
		"\25\uffff";
	static final String DFA29_eofS =
		"\2\uffff\1\3\16\uffff\1\3\3\uffff";
	static final String DFA29_minS =
		"\1\12\1\uffff\1\6\1\uffff\1\27\12\uffff\1\0\1\uffff\1\6\1\0\2\uffff";
	static final String DFA29_maxS =
		"\1\122\1\uffff\1\123\1\uffff\1\27\12\uffff\1\0\1\uffff\1\123\1\0\2\uffff";
	static final String DFA29_acceptS =
		"\1\uffff\1\1\1\uffff\1\3\1\uffff\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15"+
		"\1\16\1\17\1\uffff\1\2\2\uffff\1\4\1\10";
	static final String DFA29_specialS =
		"\17\uffff\1\1\2\uffff\1\0\2\uffff}>";
	static final String[] DFA29_transitionS = {
			"\1\3\4\uffff\1\3\6\uffff\1\3\1\2\12\uffff\2\3\5\uffff\1\3\1\uffff\1\3"+
			"\7\uffff\2\3\1\uffff\2\3\2\uffff\1\6\1\uffff\1\3\1\1\1\7\1\uffff\1\16"+
			"\1\uffff\1\10\1\15\1\3\1\4\1\12\1\uffff\2\3\2\uffff\1\5\1\14\1\3\1\13"+
			"\2\1\1\11",
			"",
			"\1\3\1\uffff\1\3\1\uffff\1\3\4\uffff\1\3\6\uffff\1\3\1\17\12\uffff\2"+
			"\3\1\uffff\1\21\3\uffff\1\3\1\uffff\5\3\1\uffff\1\20\3\3\1\uffff\2\3"+
			"\2\uffff\7\3\1\uffff\5\3\1\uffff\2\3\2\uffff\10\3",
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
			"\1\3\1\uffff\1\3\1\uffff\1\3\4\uffff\1\3\6\uffff\1\3\1\17\12\uffff\2"+
			"\3\1\uffff\1\21\3\uffff\1\3\1\uffff\5\3\1\uffff\1\20\3\3\1\uffff\2\3"+
			"\2\uffff\7\3\1\uffff\5\3\1\uffff\2\3\2\uffff\10\3",
			"\1\uffff",
			"",
			""
	};

	static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
	static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
	static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
	static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
	static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
	static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
	static final short[][] DFA29_transition;

	static {
		int numStates = DFA29_transitionS.length;
		DFA29_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
		}
	}

	protected class DFA29 extends DFA {

		public DFA29(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 29;
			this.eot = DFA29_eot;
			this.eof = DFA29_eof;
			this.min = DFA29_min;
			this.max = DFA29_max;
			this.accept = DFA29_accept;
			this.special = DFA29_special;
			this.transition = DFA29_transition;
		}
		@Override
		public String getDescription() {
			return "364:2: ( ruleDeclaration | ruleLabeledStmt | ruleSimpleStmt | ruleGoStmt | ruleReturnStmt | ruleBreakStmt | ruleContinueStmt | ruleGotoStmt | ruleFallthroughStmt | ruleBlock | ruleIfStmt | ruleSwitchStmt | ruleSelectStmt | ruleForStmt | ruleDeferStmt )";
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
						int LA29_18 = input.LA(1);
						 
						int index29_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred44_DebugInternalGo()) ) {s = 19;}
						else if ( (synpred48_DebugInternalGo()) ) {s = 20;}
						 
						input.seek(index29_18);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA29_15 = input.LA(1);
						 
						int index29_15 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred42_DebugInternalGo()) ) {s = 16;}
						else if ( (synpred43_DebugInternalGo()) ) {s = 3;}
						 
						input.seek(index29_15);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 29, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA48_eotS =
		"\12\uffff";
	static final String DFA48_eofS =
		"\2\uffff\1\5\3\uffff\4\5";
	static final String DFA48_minS =
		"\2\27\1\12\1\uffff\1\27\1\uffff\1\6\1\12\2\6";
	static final String DFA48_maxS =
		"\1\27\1\116\1\123\1\uffff\1\116\1\uffff\4\123";
	static final String DFA48_acceptS =
		"\3\uffff\1\1\1\uffff\1\2\4\uffff";
	static final String DFA48_specialS =
		"\12\uffff}>";
	static final String[] DFA48_transitionS = {
			"\1\1",
			"\1\2\15\uffff\1\4\3\uffff\1\5\1\uffff\1\5\10\uffff\1\5\1\3\1\5\5\uffff"+
			"\1\5\7\uffff\1\5\3\uffff\2\5\4\uffff\1\5",
			"\1\5\4\uffff\1\5\6\uffff\1\5\1\6\12\uffff\2\5\1\uffff\1\7\3\uffff\1"+
			"\5\1\uffff\1\5\3\uffff\1\5\3\uffff\2\5\1\3\2\5\2\uffff\7\5\1\uffff\5"+
			"\5\1\uffff\2\5\2\uffff\10\5",
			"",
			"\1\2\15\uffff\1\4\3\uffff\1\5\1\uffff\1\5\10\uffff\1\5\1\3\1\5\5\uffff"+
			"\1\5\7\uffff\1\5\3\uffff\2\5\4\uffff\1\5",
			"",
			"\1\5\1\uffff\1\5\1\uffff\1\5\4\uffff\1\5\6\uffff\1\5\1\10\12\uffff\2"+
			"\5\1\uffff\1\11\3\uffff\1\5\1\uffff\5\5\1\uffff\4\5\1\3\2\5\2\uffff\7"+
			"\5\1\uffff\5\5\1\uffff\2\5\2\uffff\10\5",
			"\1\5\4\uffff\1\5\6\uffff\1\5\1\6\12\uffff\2\5\1\uffff\1\7\3\uffff\1"+
			"\5\1\uffff\1\5\3\uffff\1\5\3\uffff\2\5\1\3\2\5\2\uffff\7\5\1\uffff\5"+
			"\5\1\uffff\2\5\2\uffff\10\5",
			"\1\5\1\uffff\1\5\1\uffff\1\5\4\uffff\1\5\6\uffff\1\5\1\10\12\uffff\2"+
			"\5\1\uffff\1\11\3\uffff\1\5\1\uffff\5\5\1\uffff\4\5\1\3\2\5\2\uffff\7"+
			"\5\1\uffff\5\5\1\uffff\2\5\2\uffff\10\5",
			"\1\5\1\uffff\1\5\1\uffff\1\5\4\uffff\1\5\6\uffff\1\5\1\10\12\uffff\2"+
			"\5\1\uffff\1\11\3\uffff\1\5\1\uffff\5\5\1\uffff\4\5\1\3\2\5\2\uffff\7"+
			"\5\1\uffff\5\5\1\uffff\2\5\2\uffff\10\5"
	};

	static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
	static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
	static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
	static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
	static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
	static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
	static final short[][] DFA48_transition;

	static {
		int numStates = DFA48_transitionS.length;
		DFA48_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
		}
	}

	protected class DFA48 extends DFA {

		public DFA48(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 48;
			this.eot = DFA48_eot;
			this.eof = DFA48_eof;
			this.min = DFA48_min;
			this.max = DFA48_max;
			this.accept = DFA48_accept;
			this.special = DFA48_special;
			this.transition = DFA48_transition;
		}
		@Override
		public String getDescription() {
			return "567:2: ( ruleAliasDecl | ruleTypeDef )";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA60_eotS =
		"\5\uffff";
	static final String DFA60_eofS =
		"\5\uffff";
	static final String DFA60_minS =
		"\1\12\1\27\1\uffff\1\27\1\uffff";
	static final String DFA60_maxS =
		"\1\116\1\122\1\uffff\1\122\1\uffff";
	static final String DFA60_acceptS =
		"\2\uffff\1\2\1\uffff\1\1";
	static final String DFA60_specialS =
		"\5\uffff}>";
	static final String[] DFA60_transitionS = {
			"\1\2\4\uffff\1\2\6\uffff\1\2\1\1\12\uffff\1\2\6\uffff\1\2\1\uffff\1\2"+
			"\10\uffff\1\2\1\uffff\2\2\4\uffff\1\2\7\uffff\1\2\3\uffff\2\2\4\uffff"+
			"\1\2",
			"\1\3\15\uffff\1\3\3\uffff\1\2\5\uffff\1\2\2\uffff\1\4\3\uffff\1\2\33"+
			"\uffff\1\2",
			"",
			"\1\3\15\uffff\1\3\3\uffff\1\2\5\uffff\1\2\2\uffff\1\4\3\uffff\1\2\33"+
			"\uffff\1\2",
			""
	};

	static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
	static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
	static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
	static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
	static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
	static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
	static final short[][] DFA60_transition;

	static {
		int numStates = DFA60_transitionS.length;
		DFA60_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
		}
	}

	protected class DFA60 extends DFA {

		public DFA60(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 60;
			this.eot = DFA60_eot;
			this.eof = DFA60_eof;
			this.min = DFA60_min;
			this.max = DFA60_max;
			this.accept = DFA60_accept;
			this.special = DFA60_special;
			this.transition = DFA60_transition;
		}
		@Override
		public String getDescription() {
			return "708:2: ( ruleIDENTIFIER ':=' )?";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA69_eotS =
		"\11\uffff";
	static final String DFA69_eofS =
		"\11\uffff";
	static final String DFA69_minS =
		"\1\12\1\uffff\1\10\1\uffff\1\10\1\12\1\uffff\2\10";
	static final String DFA69_maxS =
		"\1\116\1\uffff\1\122\1\uffff\1\122\1\116\1\uffff\2\122";
	static final String DFA69_acceptS =
		"\1\uffff\1\1\1\uffff\1\3\2\uffff\1\2\2\uffff";
	static final String DFA69_specialS =
		"\11\uffff}>";
	static final String[] DFA69_transitionS = {
			"\1\1\4\uffff\1\1\6\uffff\1\1\1\2\12\uffff\2\1\5\uffff\1\1\1\uffff\1\1"+
			"\10\uffff\1\1\1\uffff\2\1\4\uffff\1\1\7\uffff\1\1\3\uffff\2\1\1\uffff"+
			"\1\3\2\uffff\1\1",
			"",
			"\1\1\16\uffff\1\4\15\uffff\1\4\3\uffff\1\1\3\uffff\1\5\1\uffff\1\1\2"+
			"\uffff\1\6\2\uffff\2\1\33\uffff\1\1",
			"",
			"\1\1\16\uffff\1\4\15\uffff\1\4\3\uffff\1\1\3\uffff\1\5\1\uffff\1\1\2"+
			"\uffff\1\6\2\uffff\2\1\33\uffff\1\1",
			"\1\1\4\uffff\1\1\6\uffff\1\1\1\7\12\uffff\2\1\5\uffff\1\1\1\uffff\1"+
			"\1\10\uffff\1\1\1\uffff\2\1\4\uffff\1\1\7\uffff\1\1\3\uffff\2\1\4\uffff"+
			"\1\1",
			"",
			"\1\1\16\uffff\1\10\15\uffff\1\10\3\uffff\1\1\3\uffff\1\5\1\uffff\1\1"+
			"\2\uffff\1\6\2\uffff\2\1\33\uffff\1\1",
			"\1\1\16\uffff\1\10\15\uffff\1\10\3\uffff\1\1\3\uffff\1\5\1\uffff\1\1"+
			"\2\uffff\1\6\2\uffff\2\1\33\uffff\1\1"
	};

	static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
	static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
	static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
	static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
	static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
	static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
	static final short[][] DFA69_transition;

	static {
		int numStates = DFA69_transitionS.length;
		DFA69_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
		}
	}

	protected class DFA69 extends DFA {

		public DFA69(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 69;
			this.eot = DFA69_eot;
			this.eof = DFA69_eof;
			this.min = DFA69_min;
			this.max = DFA69_max;
			this.accept = DFA69_accept;
			this.special = DFA69_special;
			this.transition = DFA69_transition;
		}
		@Override
		public String getDescription() {
			return "802:2: ( ruleExpressionList '=' | ruleIdentifierList ':=' )?";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA96_eotS =
		"\11\uffff";
	static final String DFA96_eofS =
		"\1\uffff\1\4\3\uffff\1\4\3\uffff";
	static final String DFA96_minS =
		"\1\27\1\6\1\0\1\27\1\uffff\1\6\1\uffff\2\0";
	static final String DFA96_maxS =
		"\1\27\1\123\1\0\1\51\1\uffff\1\123\1\uffff\2\0";
	static final String DFA96_acceptS =
		"\4\uffff\1\1\1\uffff\1\2\2\uffff";
	static final String DFA96_specialS =
		"\2\uffff\1\1\4\uffff\1\0\1\2}>";
	static final String[] DFA96_transitionS = {
			"\1\1",
			"\1\4\1\uffff\1\4\1\uffff\1\4\4\uffff\1\4\6\uffff\1\4\1\2\12\uffff\2"+
			"\4\1\uffff\1\5\3\uffff\6\4\1\3\2\4\1\uffff\5\4\1\uffff\10\4\1\uffff\5"+
			"\4\1\uffff\2\4\2\uffff\10\4",
			"\1\uffff",
			"\1\7\21\uffff\1\4",
			"",
			"\1\4\1\uffff\1\4\1\uffff\1\4\4\uffff\1\4\6\uffff\1\4\1\10\12\uffff\2"+
			"\4\1\uffff\1\5\3\uffff\6\4\1\3\2\4\1\uffff\5\4\1\uffff\10\4\1\uffff\5"+
			"\4\1\uffff\2\4\2\uffff\10\4",
			"",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA96_eot = DFA.unpackEncodedString(DFA96_eotS);
	static final short[] DFA96_eof = DFA.unpackEncodedString(DFA96_eofS);
	static final char[] DFA96_min = DFA.unpackEncodedStringToUnsignedChars(DFA96_minS);
	static final char[] DFA96_max = DFA.unpackEncodedStringToUnsignedChars(DFA96_maxS);
	static final short[] DFA96_accept = DFA.unpackEncodedString(DFA96_acceptS);
	static final short[] DFA96_special = DFA.unpackEncodedString(DFA96_specialS);
	static final short[][] DFA96_transition;

	static {
		int numStates = DFA96_transitionS.length;
		DFA96_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA96_transition[i] = DFA.unpackEncodedString(DFA96_transitionS[i]);
		}
	}

	protected class DFA96 extends DFA {

		public DFA96(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 96;
			this.eot = DFA96_eot;
			this.eof = DFA96_eof;
			this.min = DFA96_min;
			this.max = DFA96_max;
			this.accept = DFA96_accept;
			this.special = DFA96_special;
			this.transition = DFA96_transition;
		}
		@Override
		public String getDescription() {
			return "1111:2: ( ruleIDENTIFIER | ruleQualifiedIdent )";
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
						int LA96_7 = input.LA(1);
						 
						int index96_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred145_DebugInternalGo()) ) {s = 4;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index96_7);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA96_2 = input.LA(1);
						 
						int index96_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred145_DebugInternalGo()) ) {s = 4;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index96_2);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA96_8 = input.LA(1);
						 
						int index96_8 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred145_DebugInternalGo()) ) {s = 4;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index96_8);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 96, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_ruleCompilation_initial_in_ruleModel19 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePackageClause_in_ruleCompilation_initial33 = new BitSet(new long[]{0x2000000000000002L,0x0000000000030090L});
	public static final BitSet FOLLOW_ruleImportDecl_in_ruleCompilation_initial37 = new BitSet(new long[]{0x2000000000000002L,0x0000000000030090L});
	public static final BitSet FOLLOW_ruleTopLevelDecl_in_ruleCompilation_initial45 = new BitSet(new long[]{0x2000000000000002L,0x0000000000030010L});
	public static final BitSet FOLLOW_ruleDeclaration_in_ruleTopLevelDecl67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFunctionDecl_in_ruleTopLevelDecl79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleMethodDecl_in_ruleTopLevelDecl91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_ruleMethodDecl104 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ruleReceiver_in_ruleMethodDecl107 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ruleMethodName_in_ruleMethodDecl110 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ruleSignature_in_ruleMethodDecl113 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_ruleFunctionBody_in_ruleMethodDecl116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameters_in_ruleReceiver129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleFunctionName139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_ruleFunctionDecl149 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ruleFunctionName_in_ruleFunctionDecl152 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ruleSignature_in_ruleFunctionDecl155 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_ruleFunctionBody_in_ruleFunctionDecl158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_rulePackageClause171 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_rulePackageName_in_rulePackageClause174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_LETTER_in_ruleIDENTIFIER184 = new BitSet(new long[]{0x0000002000800002L});
	public static final BitSet FOLLOW_set_in_ruleIMAGINARY_LIT217 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_ruleIMAGINARY_LIT239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_ruleRUNE_LIT249 = new BitSet(new long[]{0x0000008000000200L});
	public static final BitSet FOLLOW_set_in_ruleRUNE_LIT252 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ruleRUNE_LIT274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeName_in_ruleType317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeLit_in_ruleType329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleType341 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleType_in_ruleType345 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleType349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleTypeName366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleQualifiedIdent_in_ruleTypeName378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePackageName_in_ruleQualifiedIdent391 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_ruleQualifiedIdent394 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleQualifiedIdent397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_rulePackageName407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleArrayType_in_ruleTypeLit421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStructType_in_ruleTypeLit433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePointerType_in_ruleTypeLit445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFunctionType_in_ruleTypeLit457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInterfaceType_in_ruleTypeLit469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSliceType_in_ruleTypeLit481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleMapType_in_ruleTypeLit493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleChannelType_in_ruleTypeLit505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_ruleArrayType518 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleArrayLength_in_ruleArrayType521 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_ruleArrayType524 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleElementType_in_ruleArrayType527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLength537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleElementType547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_ruleSliceType557 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_ruleSliceType560 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleElementType_in_ruleSliceType563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_ruleStructType573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_ruleStructType576 = new BitSet(new long[]{0x0000080000800000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ruleFieldDecl_in_ruleStructType583 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_ruleStructType587 = new BitSet(new long[]{0x0000080000800000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_ruleStructType594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleFieldDecl608 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleType_in_ruleFieldDecl612 = new BitSet(new long[]{0x0000000080200002L});
	public static final BitSet FOLLOW_ruleEmbeddedField_in_ruleFieldDecl624 = new BitSet(new long[]{0x0000000080200002L});
	public static final BitSet FOLLOW_ruleTag_in_ruleFieldDecl630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleIdentifierList643 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_ruleIdentifierList650 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleIdentifierList654 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_43_in_ruleEmbeddedField668 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ruleTypeName_in_ruleEmbeddedField672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSTRING_LIT_in_ruleTag682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_rulePointerType692 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleBaseType_in_rulePointerType695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleBaseType705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_ruleFunctionType715 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ruleSignature_in_ruleFunctionType718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameters_in_ruleSignature728 = new BitSet(new long[]{0x10500A0000800002L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleResult_in_ruleSignature731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameters_in_ruleResult748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleResult760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleParameters773 = new BitSet(new long[]{0x10512E0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleParameterList_in_ruleParameters776 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleParameters782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameterDecl_in_ruleParameterList792 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_ruleParameterList799 = new BitSet(new long[]{0x10512A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleParameterDecl_in_ruleParameterList803 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleParameterDecl817 = new BitSet(new long[]{0x10510A0000800002L,0x0000000000004310L});
	public static final BitSet FOLLOW_48_in_ruleParameterDecl823 = new BitSet(new long[]{0x10500A0000800002L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleType_in_ruleParameterDecl827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_ruleInterfaceType840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_ruleInterfaceType843 = new BitSet(new long[]{0x0000000000800000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ruleMethodSpec_in_ruleInterfaceType850 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_ruleInterfaceType854 = new BitSet(new long[]{0x0000000000800000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_ruleInterfaceType861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleMethodName_in_ruleMethodSpec875 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ruleSignature_in_ruleMethodSpec879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInterfaceTypeName_in_ruleMethodSpec891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleMethodName904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeName_in_ruleInterfaceTypeName914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_ruleMapType924 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_ruleMapType927 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleKeyType_in_ruleMapType930 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_ruleMapType933 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleElementType_in_ruleMapType936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleKeyType946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_ruleChannelType960 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_52_in_ruleChannelType964 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_52_in_ruleChannelType977 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_ruleChannelType981 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleElementType_in_ruleChannelType987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_ruleBlock997 = new BitSet(new long[]{0x74D80A0C00C08400L,0x00000000000FF37DL});
	public static final BitSet FOLLOW_ruleStatementList_in_ruleBlock1000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_ruleBlock1003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStatement_in_ruleStatementList1017 = new BitSet(new long[]{0x74D80A0C00C08402L,0x000000000007F37DL});
	public static final BitSet FOLLOW_51_in_ruleStatementList1021 = new BitSet(new long[]{0x74D80A0C00C08402L,0x000000000007F37DL});
	public static final BitSet FOLLOW_ruleDeclaration_in_ruleStatement1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLabeledStmt_in_ruleStatement1052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_ruleStatement1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGoStmt_in_ruleStatement1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleReturnStmt_in_ruleStatement1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBreakStmt_in_ruleStatement1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleContinueStmt_in_ruleStatement1112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGotoStmt_in_ruleStatement1124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFallthroughStmt_in_ruleStatement1136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBlock_in_ruleStatement1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIfStmt_in_ruleStatement1160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSwitchStmt_in_ruleStatement1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSelectStmt_in_ruleStatement1184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleForStmt_in_ruleStatement1196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleDeferStmt_in_ruleStatement1208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleConstDecl_in_ruleDeclaration1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeDecl_in_ruleDeclaration1237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleVarDecl_in_ruleDeclaration1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLabel_in_ruleLabeledStmt1262 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_ruleLabeledStmt1265 = new BitSet(new long[]{0x74D80A0C00C08400L,0x000000000007F37DL});
	public static final BitSet FOLLOW_ruleStatement_in_ruleLabeledStmt1268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIncDecStmt_in_ruleSimpleStmt1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAssignment_in_ruleSimpleStmt1294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSendStmt_in_ruleSimpleStmt1306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleShortVarDecl_in_ruleSimpleStmt1318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionStmt_in_ruleSimpleStmt1330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleEmptyStmt_in_ruleSimpleStmt1342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_ruleGoStmt1355 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ruleLabel_in_ruleGoStmt1358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_ruleReturnStmt1368 = new BitSet(new long[]{0x10D00A0C00C08402L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleReturnStmt1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_ruleBreakStmt1384 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_ruleLabel_in_ruleBreakStmt1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_ruleContinueStmt1398 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_ruleLabel_in_ruleContinueStmt1401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_ruleGotoStmt1412 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ruleLabel_in_ruleGotoStmt1415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_ruleIfStmt1425 = new BitSet(new long[]{0x10D80A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_ruleIfStmt1432 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_ruleIfStmt1436 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleIfStmt1443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_ruleBlock_in_ruleIfStmt1446 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_ruleIfStmt1453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
	public static final BitSet FOLLOW_ruleIfStmt_in_ruleIfStmt1462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBlock_in_ruleIfStmt1476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_ruleFallthroughStmt1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExprSwitchStmt_in_ruleSwitchStmt1508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeSwitchStmt_in_ruleSwitchStmt1520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_ruleSelectStmt1533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_ruleSelectStmt1536 = new BitSet(new long[]{0x8800000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ruleCommClause_in_ruleSelectStmt1539 = new BitSet(new long[]{0x8800000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_ruleSelectStmt1545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_ruleForStmt1555 = new BitSet(new long[]{0x10D80A0C00C08400L,0x0000000000044B10L});
	public static final BitSet FOLLOW_ruleCondition_in_ruleForStmt1562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_ruleForClause_in_ruleForStmt1574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_ruleRangeClause_in_ruleForStmt1586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_ruleBlock_in_ruleForStmt1593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_ruleDeferStmt1603 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleDeferStmt1606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_ruleConstDecl1616 = new BitSet(new long[]{0x0000020000800000L});
	public static final BitSet FOLLOW_ruleConstSpec_in_ruleConstDecl1623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleConstDecl1635 = new BitSet(new long[]{0x0000040000800000L});
	public static final BitSet FOLLOW_ruleConstSpec_in_ruleConstDecl1644 = new BitSet(new long[]{0x0008040000800000L});
	public static final BitSet FOLLOW_51_in_ruleConstDecl1649 = new BitSet(new long[]{0x0000040000800000L});
	public static final BitSet FOLLOW_42_in_ruleConstDecl1659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleConstSpec1672 = new BitSet(new long[]{0x10700A0000800002L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleType_in_ruleConstSpec1679 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_ruleConstSpec1687 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleConstSpec1691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_ruleTypeDecl1705 = new BitSet(new long[]{0x0000020000800000L});
	public static final BitSet FOLLOW_ruleTypeSpec_in_ruleTypeDecl1712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleTypeDecl1724 = new BitSet(new long[]{0x0000040000800000L});
	public static final BitSet FOLLOW_ruleTypeSpec_in_ruleTypeDecl1733 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_ruleTypeDecl1738 = new BitSet(new long[]{0x0000040000800000L});
	public static final BitSet FOLLOW_42_in_ruleTypeDecl1747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAliasDecl_in_ruleTypeSpec1764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeDef_in_ruleTypeSpec1776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleTypeDef1789 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleType_in_ruleTypeDef1792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleAliasDecl1802 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_ruleAliasDecl1805 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleType_in_ruleAliasDecl1808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_ruleVarDecl1818 = new BitSet(new long[]{0x0000020000800000L});
	public static final BitSet FOLLOW_ruleVarSpec_in_ruleVarDecl1825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleVarDecl1837 = new BitSet(new long[]{0x0000040000800000L});
	public static final BitSet FOLLOW_ruleVarSpec_in_ruleVarDecl1846 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_ruleVarDecl1851 = new BitSet(new long[]{0x0000040000800000L});
	public static final BitSet FOLLOW_42_in_ruleVarDecl1860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleVarSpec1873 = new BitSet(new long[]{0x10700A0000800002L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleType_in_ruleVarSpec1876 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_53_in_ruleVarSpec1886 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleVarSpec1890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_ruleEmptyStmt1904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionStmt1914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleChannel_in_ruleSendStmt1924 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_ruleSendStmt1927 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSendStmt1930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleChannel1940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleIncDecStmt1954 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_ruleIncDecStmt1958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleIncDecStmt1970 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_ruleIncDecStmt1974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleAssignment1987 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_ASSING_OP_in_ruleAssignment1990 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleAssignment1993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleShortVarDecl2003 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_ruleShortVarDecl2006 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleShortVarDecl2009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_ruleExprSwitchStmt2019 = new BitSet(new long[]{0x10D80A0C00C08400L,0x0000000000044310L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_ruleExprSwitchStmt2026 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_ruleExprSwitchStmt2030 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000044310L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleExprSwitchStmt2037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_ruleExprSwitchStmt2043 = new BitSet(new long[]{0x8800000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ruleExprCaseClause_in_ruleExprSwitchStmt2046 = new BitSet(new long[]{0x8800000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_ruleExprSwitchStmt2052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExprSwitchCase_in_ruleExprCaseClause2062 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_ruleExprCaseClause2065 = new BitSet(new long[]{0x74D80A0C00C08400L,0x000000000007F37DL});
	public static final BitSet FOLLOW_ruleStatementList_in_ruleExprCaseClause2068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_ruleExprSwitchCase2082 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleExprSwitchCase2086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_ruleExprSwitchCase2098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_ruleTypeSwitchStmt2111 = new BitSet(new long[]{0x10D80A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_ruleTypeSwitchStmt2118 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_ruleTypeSwitchStmt2122 = new BitSet(new long[]{0x10D00A0400C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleTypeSwitchGuard_in_ruleTypeSwitchStmt2129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_ruleTypeSwitchStmt2132 = new BitSet(new long[]{0x8800000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ruleTypeCaseClause_in_ruleTypeSwitchStmt2135 = new BitSet(new long[]{0x8800000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_ruleTypeSwitchStmt2141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleTypeSwitchGuard2155 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_ruleTypeSwitchGuard2159 = new BitSet(new long[]{0x10D00A0400C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_rulePrimaryExpr_in_ruleTypeSwitchGuard2166 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_ruleTypeSwitchGuard2169 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_ruleTypeSwitchGuard2172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_ruleTypeSwitchGuard2175 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleTypeSwitchGuard2178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeSwitchCase_in_ruleTypeCaseClause2188 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_ruleTypeCaseClause2191 = new BitSet(new long[]{0x74D80A0C00C08400L,0x000000000007F37DL});
	public static final BitSet FOLLOW_ruleStatementList_in_ruleTypeCaseClause2194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_ruleTypeSwitchCase2208 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleTypeList_in_ruleTypeSwitchCase2212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_ruleTypeSwitchCase2224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleTypeList2237 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_ruleTypeList2244 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleType_in_ruleTypeList2248 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_ruleCommCase_in_ruleCommClause2262 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_ruleCommClause2265 = new BitSet(new long[]{0x74D80A0C00C08400L,0x000000000007F37DL});
	public static final BitSet FOLLOW_ruleStatementList_in_ruleCommClause2268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_ruleCommCase2282 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleSendStmt_in_ruleCommCase2291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleRecvStmt_in_ruleCommCase2305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_ruleCommCase2321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleRecvStmt2338 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_ruleRecvStmt2342 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleRecvStmt2354 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_ruleRecvStmt2358 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleRecvExpr_in_ruleRecvStmt2365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleRecvExpr2375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleCondition2385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInitStmt_in_ruleForClause2395 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_ruleForClause2401 = new BitSet(new long[]{0x10D80A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleCondition_in_ruleForClause2404 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_ruleForClause2410 = new BitSet(new long[]{0x10D80A0C00C08402L,0x0000000000004310L});
	public static final BitSet FOLLOW_rulePostStmt_in_ruleForClause2413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleRangeClause2430 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_ruleRangeClause2434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_ruleRangeClause2446 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_ruleRangeClause2450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_ruleRangeClause2457 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleRangeClause2460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_ruleInitStmt2470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_rulePostStmt2480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleLabel2490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList2500 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_ruleExpressionList2507 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList2511 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_ruleUnaryExpr_in_ruleExpression2525 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ruleExpression2_in_ruleExpression2528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_BINARY_OP_in_ruleExpression22542 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleExpression22546 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ruleExpression2_in_ruleExpression22550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePrimaryExpr_in_ruleUnaryExpr2568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_UNARY_OP_in_ruleUnaryExpr2580 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleUnaryExpr_in_ruleUnaryExpr2584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOperand_in_rulePrimaryExpr2601 = new BitSet(new long[]{0x0040820000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleConversion_in_rulePrimaryExpr2617 = new BitSet(new long[]{0x0040820000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleMethodExpr_in_rulePrimaryExpr2633 = new BitSet(new long[]{0x0040820000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr2637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSelector_in_rulePrimaryExpr22654 = new BitSet(new long[]{0x0040820000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIndex_in_rulePrimaryExpr22670 = new BitSet(new long[]{0x0040820000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSlice_in_rulePrimaryExpr22686 = new BitSet(new long[]{0x0040820000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeAssertion_in_rulePrimaryExpr22702 = new BitSet(new long[]{0x0040820000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleArguments_in_rulePrimaryExpr22718 = new BitSet(new long[]{0x0040820000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_rulePrimaryExpr22722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLiteral_in_ruleOperand2740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOperandName_in_ruleOperand2752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleOperand2764 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleOperand2768 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleOperand2772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleConversion2785 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_ruleConversion2788 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleConversion2791 = new BitSet(new long[]{0x0000240000000000L});
	public static final BitSet FOLLOW_45_in_ruleConversion2794 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleConversion2798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleReceiverType_in_ruleMethodExpr2808 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_ruleMethodExpr2811 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ruleMethodName_in_ruleMethodExpr2814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_ruleSelector2824 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleSelector2827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_ruleIndex2837 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleIndex2840 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_ruleIndex2843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_ruleSlice2857 = new BitSet(new long[]{0x10D20A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSlice2861 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_ruleSlice2869 = new BitSet(new long[]{0x12D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSlice2873 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_ruleSlice2881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_ruleSlice2893 = new BitSet(new long[]{0x10D20A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSlice2897 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_ruleSlice2905 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSlice2909 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_ruleSlice2913 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleSlice2917 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_ruleSlice2921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_ruleTypeAssertion2934 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_ruleTypeAssertion2937 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleType_in_ruleTypeAssertion2940 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleTypeAssertion2943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleArguments2953 = new BitSet(new long[]{0x10D00E0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleArguments2965 = new BitSet(new long[]{0x0001240000000000L});
	public static final BitSet FOLLOW_ruleType_in_ruleArguments2979 = new BitSet(new long[]{0x0001240000000000L});
	public static final BitSet FOLLOW_45_in_ruleArguments2990 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpressionList_in_ruleArguments2996 = new BitSet(new long[]{0x0001240000000000L});
	public static final BitSet FOLLOW_48_in_ruleArguments3010 = new BitSet(new long[]{0x0000240000000000L});
	public static final BitSet FOLLOW_45_in_ruleArguments3015 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleArguments3023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBasicLit_in_ruleLiteral3037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCompositeLit_in_ruleLiteral3049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFunctionLit_in_ruleLiteral3061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_ruleFunctionLit3074 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ruleSignature_in_ruleFunctionLit3077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_ruleFunctionBody_in_ruleFunctionLit3080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLiteralType_in_ruleCompositeLit3090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_ruleLiteralValue_in_ruleCompositeLit3093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStructType_in_ruleLiteralType3107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleArrayType_in_ruleLiteralType3119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_ruleLiteralType3131 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_ruleLiteralType3135 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_ruleLiteralType3139 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleElementType_in_ruleLiteralType3143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSliceType_in_ruleLiteralType3155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleMapType_in_ruleLiteralType3167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeName_in_ruleLiteralType3179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_ruleLiteralValue3192 = new BitSet(new long[]{0x10D00A0C00C08400L,0x00000000000C4310L});
	public static final BitSet FOLLOW_ruleElementList_in_ruleLiteralValue3199 = new BitSet(new long[]{0x0000200000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_45_in_ruleLiteralValue3203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_ruleLiteralValue3211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleKeyedElement_in_ruleElementList3221 = new BitSet(new long[]{0x10D02A0C00C08402L,0x0000000000044310L});
	public static final BitSet FOLLOW_45_in_ruleElementList3228 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000044310L});
	public static final BitSet FOLLOW_ruleKeyedElement_in_ruleElementList3233 = new BitSet(new long[]{0x10D02A0C00C08402L,0x0000000000044310L});
	public static final BitSet FOLLOW_ruleKey_in_ruleKeyedElement3251 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_ruleKeyedElement3255 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000044310L});
	public static final BitSet FOLLOW_ruleElement_in_ruleKeyedElement3262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFieldName_in_ruleKey3276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleKey3288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLiteralValue_in_ruleKey3300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleFieldName3313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_ruleElement3327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLiteralValue_in_ruleElement3339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_INT_LIT_in_ruleBasicLit3356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_FLOAT_LIT_in_ruleBasicLit3368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIMAGINARY_LIT_in_ruleBasicLit3380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleRUNE_LIT_in_ruleBasicLit3392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleBasicLit3404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_ruleReceiverType3417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBlock_in_ruleFunctionBody3427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleOperandName3441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleQualifiedIdent_in_ruleOperandName3453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_ruleImportDecl3466 = new BitSet(new long[]{0x0000820400800000L});
	public static final BitSet FOLLOW_ruleImportSpec_in_ruleImportDecl3473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleImportDecl3485 = new BitSet(new long[]{0x0000840400800000L});
	public static final BitSet FOLLOW_ruleImportSpec_in_ruleImportDecl3489 = new BitSet(new long[]{0x0000840400800000L});
	public static final BitSet FOLLOW_42_in_ruleImportDecl3497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_ruleImportSpec3514 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleImportSpec3526 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_ruleImportPath_in_ruleImportSpec3533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleImportPath3543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_synpred15_DebugInternalGo366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_synpred24_DebugInternalGo608 = new BitSet(new long[]{0x10500A0000800000L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleType_in_synpred24_DebugInternalGo612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_synpred26_DebugInternalGo650 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_synpred26_DebugInternalGo654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleResult_in_synpred28_DebugInternalGo731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameters_in_synpred29_DebugInternalGo748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParameterList_in_synpred30_DebugInternalGo776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_synpred32_DebugInternalGo817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred37_DebugInternalGo964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_synpred39_DebugInternalGo1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLabeledStmt_in_synpred42_DebugInternalGo1052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_synpred43_DebugInternalGo1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGoStmt_in_synpred44_DebugInternalGo1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleGotoStmt_in_synpred48_DebugInternalGo1124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIncDecStmt_in_synpred57_DebugInternalGo1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAssignment_in_synpred58_DebugInternalGo1294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSendStmt_in_synpred59_DebugInternalGo1306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleShortVarDecl_in_synpred60_DebugInternalGo1318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionStmt_in_synpred61_DebugInternalGo1330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_synpred62_DebugInternalGo1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLabel_in_synpred63_DebugInternalGo1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLabel_in_synpred64_DebugInternalGo1401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_synpred65_DebugInternalGo1432 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_synpred65_DebugInternalGo1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExprSwitchStmt_in_synpred68_DebugInternalGo1508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCondition_in_synpred70_DebugInternalGo1562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleForClause_in_synpred71_DebugInternalGo1574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleRangeClause_in_synpred72_DebugInternalGo1586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_synpred77_DebugInternalGo1679 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_synpred77_DebugInternalGo1687 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpressionList_in_synpred77_DebugInternalGo1691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleType_in_synpred83_DebugInternalGo1876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_synpred85_DebugInternalGo1954 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_synpred85_DebugInternalGo1958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_synpred86_DebugInternalGo2026 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_synpred86_DebugInternalGo2030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSimpleStmt_in_synpred90_DebugInternalGo2118 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_synpred90_DebugInternalGo2122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSendStmt_in_synpred95_DebugInternalGo2291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_synpred97_DebugInternalGo2338 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_synpred97_DebugInternalGo2342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIdentifierList_in_synpred98_DebugInternalGo2354 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred98_DebugInternalGo2358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleInitStmt_in_synpred99_DebugInternalGo2395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_BINARY_OP_in_synpred105_DebugInternalGo2542 = new BitSet(new long[]{0x10D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_synpred105_DebugInternalGo2546 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ruleExpression2_in_synpred105_DebugInternalGo2550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOperand_in_synpred107_DebugInternalGo2601 = new BitSet(new long[]{0x0040820000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred107_DebugInternalGo2605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleConversion_in_synpred108_DebugInternalGo2617 = new BitSet(new long[]{0x0040820000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred108_DebugInternalGo2621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSelector_in_synpred109_DebugInternalGo2654 = new BitSet(new long[]{0x0040820000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred109_DebugInternalGo2658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIndex_in_synpred110_DebugInternalGo2670 = new BitSet(new long[]{0x0040820000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred110_DebugInternalGo2674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSlice_in_synpred111_DebugInternalGo2686 = new BitSet(new long[]{0x0040820000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred111_DebugInternalGo2690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTypeAssertion_in_synpred112_DebugInternalGo2702 = new BitSet(new long[]{0x0040820000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred112_DebugInternalGo2706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleArguments_in_synpred113_DebugInternalGo2718 = new BitSet(new long[]{0x0040820000000000L});
	public static final BitSet FOLLOW_rulePrimaryExpr2_in_synpred113_DebugInternalGo2722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLiteral_in_synpred114_DebugInternalGo2740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOperandName_in_synpred115_DebugInternalGo2752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_synpred119_DebugInternalGo2857 = new BitSet(new long[]{0x10D20A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_synpred119_DebugInternalGo2861 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_synpred119_DebugInternalGo2869 = new BitSet(new long[]{0x12D00A0C00C08400L,0x0000000000004310L});
	public static final BitSet FOLLOW_ruleExpression_in_synpred119_DebugInternalGo2873 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_synpred119_DebugInternalGo2881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpressionList_in_synpred121_DebugInternalGo2965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleKey_in_synpred137_DebugInternalGo3251 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_synpred137_DebugInternalGo3255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFieldName_in_synpred138_DebugInternalGo3276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExpression_in_synpred139_DebugInternalGo3288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleIDENTIFIER_in_synpred145_DebugInternalGo3441 = new BitSet(new long[]{0x0000000000000002L});
}
