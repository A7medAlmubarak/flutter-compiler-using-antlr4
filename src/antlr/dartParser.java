// Generated from dart.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dartParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		IMPORT_=60, EXPORT_=61, WIDGET_=62, GESTUREDETECTOR_=63, STATELESSWIDGET_=64, 
		STATEFULWIDGET_=65, BUILD_=66, BUILDCONTEXT_=67, CONTEXT_=68, CHILD_=69, 
		CHILDREN_=70, CARD_=71, CENTER_=72, COLUMN_=73, ROW_=74, MaterialApp_=75, 
		FINAL_=76, LISTVIEW_=77, IMAGE_=78, DECORATIONIMAGE_=79, ASSETIMAGE_=80, 
		NETWORKIMAGE_=81, ONTAP_=82, ONPRESSED_=83, COLOR_=84, HIGHT_=85, WIDTH_=86, 
		PADDING_=87, EDGEINSET_=88, ALL_=89, MARGIN_=90, TITLE_=91, THEME_=92, 
		THEMEDATA_=93, HOME_=94, IF_=95, ELSE_=96, WHILE_=97, PRINT_=98, ACTIONS_=99, 
		DOT=100, CONTAINER_=101, OVERRIDE_=102, EXTANDS_=103, RETURN_=104, NEW_=105, 
		PUBLIC_=106, CLASS_=107, MAIN_=108, VOID_=109, FLOAT=110, INT=111, VAR=112, 
		BOOLEAN=113, FLOAT_LITERAL=114, NULL=115, TRUE=116, FALSE=117, CONST_=118, 
		CREATESTATE_=119, SETSTATE_=120, NAVIGATOR_=121, PUSH_=122, MATERIALPAGEROUTE_=123, 
		BUILDER_=124, PUSHREPLACEMENT_=125, TEXTBUTTON_=126, SHOWDIALOG_=127, 
		ALERTDIALOG_=128, CONTENT_=129, SCAFFOLD_=130, APPBAR_=131, MAINAXISALIGNMENT_=132, 
		SIZEDBOX_=133, ELEVATEDBUTTON_=134, GETXCONTROLLER_=135, STRING_LITERAL=136, 
		HEX_COLOR=137, NUMBER=138, IDENTIFIER=139, WS=140, LINE_COMMENT=141;
	public static final int
		RULE_program = 0, RULE_libraryImport = 1, RULE_libraryExport = 2, RULE_getxClass = 3, 
		RULE_blocClass = 4, RULE_blocClassArguments = 5, RULE_blocConstructor = 6, 
		RULE_streamMethod = 7, RULE_widgetClass = 8, RULE_statefulWidget = 9, 
		RULE_createState = 10, RULE_stateClass = 11, RULE_statelessWidget = 12, 
		RULE_widgetBuild = 13, RULE_widgetLiteral = 14, RULE_materialApp = 15, 
		RULE_gestureDetector = 16, RULE_scaffold = 17, RULE_container = 18, RULE_card = 19, 
		RULE_textButton = 20, RULE_textField = 21, RULE_elevatedButton = 22, RULE_elevatedButtonAttribute = 23, 
		RULE_sizedBox = 24, RULE_alertDialog = 25, RULE_center = 26, RULE_column = 27, 
		RULE_row = 28, RULE_listview = 29, RULE_image = 30, RULE_text = 31, RULE_obxWidget = 32, 
		RULE_blocBuildWidget = 33, RULE_blocBuilder = 34, RULE_assetImage = 35, 
		RULE_networkImage = 36, RULE_widgetAttribute = 37, RULE_appBar = 38, RULE_body = 39, 
		RULE_style = 40, RULE_bodyArguments = 41, RULE_onPressed = 42, RULE_mainAxisAlignment = 43, 
		RULE_child = 44, RULE_children = 45, RULE_ontap = 46, RULE_color = 47, 
		RULE_boxcolor = 48, RULE_hight = 49, RULE_width = 50, RULE_padding = 51, 
		RULE_margin = 52, RULE_title = 53, RULE_content = 54, RULE_theme = 55, 
		RULE_primarySwatch = 56, RULE_home = 57, RULE_actions = 58, RULE_blocProviderStatement = 59, 
		RULE_blocType = 60, RULE_blocProviderArguments = 61, RULE_createStatement = 62, 
		RULE_navigator = 63, RULE_navigatortype = 64, RULE_navigatorPop = 65, 
		RULE_navigatorPush = 66, RULE_navigatorPushReplacement = 67, RULE_materialPageRoute = 68, 
		RULE_mainClass = 69, RULE_runApp = 70, RULE_className = 71, RULE_function_call = 72, 
		RULE_class_call = 73, RULE_classArgument = 74, RULE_blocCall = 75, RULE_namedArgument = 76, 
		RULE_required = 77, RULE_statement = 78, RULE_setStateStatement = 79, 
		RULE_methodStatement = 80, RULE_showDialogStatement = 81, RULE_showDialogProperities = 82, 
		RULE_showDialogBuilder = 83, RULE_methodcallStatement = 84, RULE_blockStatement = 85, 
		RULE_varDeclaration = 86, RULE_ifStatement = 87, RULE_elseCond = 88, RULE_whileStatement = 89, 
		RULE_printStatement = 90, RULE_varAssignment = 91, RULE_enumStatement = 92, 
		RULE_expression = 93, RULE_objectAccess = 94, RULE_type = 95, RULE_constant = 96, 
		RULE_colorName = 97, RULE_stringInterpolation = 98, RULE_interpolationPart = 99;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "libraryImport", "libraryExport", "getxClass", "blocClass", 
			"blocClassArguments", "blocConstructor", "streamMethod", "widgetClass", 
			"statefulWidget", "createState", "stateClass", "statelessWidget", "widgetBuild", 
			"widgetLiteral", "materialApp", "gestureDetector", "scaffold", "container", 
			"card", "textButton", "textField", "elevatedButton", "elevatedButtonAttribute", 
			"sizedBox", "alertDialog", "center", "column", "row", "listview", "image", 
			"text", "obxWidget", "blocBuildWidget", "blocBuilder", "assetImage", 
			"networkImage", "widgetAttribute", "appBar", "body", "style", "bodyArguments", 
			"onPressed", "mainAxisAlignment", "child", "children", "ontap", "color", 
			"boxcolor", "hight", "width", "padding", "margin", "title", "content", 
			"theme", "primarySwatch", "home", "actions", "blocProviderStatement", 
			"blocType", "blocProviderArguments", "createStatement", "navigator", 
			"navigatortype", "navigatorPop", "navigatorPush", "navigatorPushReplacement", 
			"materialPageRoute", "mainClass", "runApp", "className", "function_call", 
			"class_call", "classArgument", "blocCall", "namedArgument", "required", 
			"statement", "setStateStatement", "methodStatement", "showDialogStatement", 
			"showDialogProperities", "showDialogBuilder", "methodcallStatement", 
			"blockStatement", "varDeclaration", "ifStatement", "elseCond", "whileStatement", 
			"printStatement", "varAssignment", "enumStatement", "expression", "objectAccess", 
			"type", "constant", "colorName", "stringInterpolation", "interpolationPart"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", "'{'", "'}'", "'Bloc'", "'<'", "'>'", "'('", "')'", 
			"':'", "'super'", "'Stream'", "'mapEventToState'", "'async*'", "'yield'", 
			"'=>'", "'State'", "'state'", "'TextField'", "'controller'", "'decoration'", 
			"'InputDecoration'", "'labelText'", "'obscureText'", "'text'", "'Text'", 
			"'Obx'", "'BlocBuilder'", "'body'", "'style'", "'styleFrom'", "'['", 
			"']'", "'=='", "'?'", "'Colors.'", "'red'", "'blue'", "'primarySwatch'", 
			"'primary'", "'BlocProvider'", "'create'", "'of'", "'.pop()'", "'runApp'", 
			"'required'", "'this'", "'='", "'enum'", "'!'", "'*'", "'/'", "'\u00C3\u00B7'", 
			"'+'", "'-'", "'&&'", "'!='", "'length'", "'$'", "'import'", "'export'", 
			"'Widget'", "'GestureDetector'", "'StatelessWidget'", "'StatefulWidget'", 
			"'build'", "'BuildContext'", "'context'", "'child:'", "'children:'", 
			"'card'", null, null, null, "'MaterialApp'", "'final'", "'listview'", 
			"'Image'", "'DecorationImage'", "'Image:AssetImage'", "'Image:NetworkImage'", 
			"'onTap'", "'onPressed'", "'color:'", null, "'width:'", null, null, "'all'", 
			"'margin'", "'title'", "'theme'", "'ThemeData'", "'home'", "'if'", "'else'", 
			"'while'", "'print'", "'actions'", "'.'", "'Container'", "'@override'", 
			"'extends'", "'return'", "'new'", "'public'", "'class'", "'main'", "'void'", 
			"'float'", "'int'", "'var'", null, "'g'", null, "'true'", "'false'", 
			"'const'", "'createState'", "'setState'", "'Navigator'", "'push'", "'MaterialPageRoute'", 
			"'builder'", "'pushReplacement'", "'TextButton'", "'showDialog'", "'AlertDialog'", 
			"'content'", "'Scaffold'", null, null, "'SizedBox'", "'ElevatedButton'", 
			"'GetxController'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"IMPORT_", "EXPORT_", "WIDGET_", "GESTUREDETECTOR_", "STATELESSWIDGET_", 
			"STATEFULWIDGET_", "BUILD_", "BUILDCONTEXT_", "CONTEXT_", "CHILD_", "CHILDREN_", 
			"CARD_", "CENTER_", "COLUMN_", "ROW_", "MaterialApp_", "FINAL_", "LISTVIEW_", 
			"IMAGE_", "DECORATIONIMAGE_", "ASSETIMAGE_", "NETWORKIMAGE_", "ONTAP_", 
			"ONPRESSED_", "COLOR_", "HIGHT_", "WIDTH_", "PADDING_", "EDGEINSET_", 
			"ALL_", "MARGIN_", "TITLE_", "THEME_", "THEMEDATA_", "HOME_", "IF_", 
			"ELSE_", "WHILE_", "PRINT_", "ACTIONS_", "DOT", "CONTAINER_", "OVERRIDE_", 
			"EXTANDS_", "RETURN_", "NEW_", "PUBLIC_", "CLASS_", "MAIN_", "VOID_", 
			"FLOAT", "INT", "VAR", "BOOLEAN", "FLOAT_LITERAL", "NULL", "TRUE", "FALSE", 
			"CONST_", "CREATESTATE_", "SETSTATE_", "NAVIGATOR_", "PUSH_", "MATERIALPAGEROUTE_", 
			"BUILDER_", "PUSHREPLACEMENT_", "TEXTBUTTON_", "SHOWDIALOG_", "ALERTDIALOG_", 
			"CONTENT_", "SCAFFOLD_", "APPBAR_", "MAINAXISALIGNMENT_", "SIZEDBOX_", 
			"ELEVATEDBUTTON_", "GETXCONTROLLER_", "STRING_LITERAL", "HEX_COLOR", 
			"NUMBER", "IDENTIFIER", "WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "dart.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dartParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(dartParser.EOF, 0); }
		public List<LibraryImportContext> libraryImport() {
			return getRuleContexts(LibraryImportContext.class);
		}
		public LibraryImportContext libraryImport(int i) {
			return getRuleContext(LibraryImportContext.class,i);
		}
		public List<LibraryExportContext> libraryExport() {
			return getRuleContexts(LibraryExportContext.class);
		}
		public LibraryExportContext libraryExport(int i) {
			return getRuleContext(LibraryExportContext.class,i);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public List<WidgetClassContext> widgetClass() {
			return getRuleContexts(WidgetClassContext.class);
		}
		public WidgetClassContext widgetClass(int i) {
			return getRuleContext(WidgetClassContext.class,i);
		}
		public List<BlocClassContext> blocClass() {
			return getRuleContexts(BlocClassContext.class);
		}
		public BlocClassContext blocClass(int i) {
			return getRuleContext(BlocClassContext.class,i);
		}
		public List<StateClassContext> stateClass() {
			return getRuleContexts(StateClassContext.class);
		}
		public StateClassContext stateClass(int i) {
			return getRuleContext(StateClassContext.class,i);
		}
		public List<GetxClassContext> getxClass() {
			return getRuleContexts(GetxClassContext.class);
		}
		public GetxClassContext getxClass(int i) {
			return getRuleContext(GetxClassContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT_ || _la==EXPORT_) {
				{
				setState(202);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IMPORT_:
					{
					setState(200);
					libraryImport();
					}
					break;
				case EXPORT_:
					{
					setState(201);
					libraryExport();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(207);
				mainClass();
				}
				break;
			}
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__48 || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (FINAL_ - 76)) | (1L << (IF_ - 76)) | (1L << (WHILE_ - 76)) | (1L << (PRINT_ - 76)) | (1L << (OVERRIDE_ - 76)) | (1L << (CLASS_ - 76)) | (1L << (VOID_ - 76)) | (1L << (FLOAT - 76)) | (1L << (INT - 76)) | (1L << (VAR - 76)) | (1L << (BOOLEAN - 76)) | (1L << (SETSTATE_ - 76)) | (1L << (NAVIGATOR_ - 76)) | (1L << (SHOWDIALOG_ - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
				{
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(210);
					widgetClass();
					}
					break;
				case 2:
					{
					setState(211);
					blocClass();
					}
					break;
				case 3:
					{
					setState(212);
					stateClass();
					}
					break;
				case 4:
					{
					setState(213);
					getxClass();
					}
					break;
				case 5:
					{
					setState(214);
					statement();
					}
					break;
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibraryImportContext extends ParserRuleContext {
		public TerminalNode IMPORT_() { return getToken(dartParser.IMPORT_, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(dartParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(dartParser.STRING_LITERAL, i);
		}
		public LibraryImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterLibraryImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitLibraryImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitLibraryImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibraryImportContext libraryImport() throws RecognitionException {
		LibraryImportContext _localctx = new LibraryImportContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_libraryImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(IMPORT_);
			setState(223);
			match(STRING_LITERAL);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(224);
				match(T__0);
				setState(225);
				match(STRING_LITERAL);
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibraryExportContext extends ParserRuleContext {
		public TerminalNode EXPORT_() { return getToken(dartParser.EXPORT_, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(dartParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(dartParser.STRING_LITERAL, i);
		}
		public LibraryExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryExport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterLibraryExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitLibraryExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitLibraryExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibraryExportContext libraryExport() throws RecognitionException {
		LibraryExportContext _localctx = new LibraryExportContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_libraryExport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(EXPORT_);
			setState(234);
			match(STRING_LITERAL);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(235);
				match(T__0);
				setState(236);
				match(STRING_LITERAL);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetxClassContext extends ParserRuleContext {
		public TerminalNode CLASS_() { return getToken(dartParser.CLASS_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EXTANDS_() { return getToken(dartParser.EXTANDS_, 0); }
		public TerminalNode GETXCONTROLLER_() { return getToken(dartParser.GETXCONTROLLER_, 0); }
		public List<Class_callContext> class_call() {
			return getRuleContexts(Class_callContext.class);
		}
		public Class_callContext class_call(int i) {
			return getRuleContext(Class_callContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public GetxClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getxClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterGetxClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitGetxClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitGetxClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetxClassContext getxClass() throws RecognitionException {
		GetxClassContext _localctx = new GetxClassContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_getxClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(CLASS_);
			setState(245);
			match(IDENTIFIER);
			setState(246);
			match(EXTANDS_);
			setState(247);
			match(GETXCONTROLLER_);
			setState(248);
			match(T__2);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__18) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__40) | (1L << T__48) | (1L << GESTUREDETECTOR_))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (CARD_ - 71)) | (1L << (CENTER_ - 71)) | (1L << (COLUMN_ - 71)) | (1L << (ROW_ - 71)) | (1L << (MaterialApp_ - 71)) | (1L << (FINAL_ - 71)) | (1L << (LISTVIEW_ - 71)) | (1L << (IMAGE_ - 71)) | (1L << (NETWORKIMAGE_ - 71)) | (1L << (IF_ - 71)) | (1L << (WHILE_ - 71)) | (1L << (PRINT_ - 71)) | (1L << (CONTAINER_ - 71)) | (1L << (OVERRIDE_ - 71)) | (1L << (VOID_ - 71)) | (1L << (FLOAT - 71)) | (1L << (INT - 71)) | (1L << (VAR - 71)) | (1L << (BOOLEAN - 71)) | (1L << (CONST_ - 71)) | (1L << (SETSTATE_ - 71)) | (1L << (NAVIGATOR_ - 71)) | (1L << (TEXTBUTTON_ - 71)) | (1L << (SHOWDIALOG_ - 71)) | (1L << (ALERTDIALOG_ - 71)) | (1L << (SCAFFOLD_ - 71)) | (1L << (SIZEDBOX_ - 71)) | (1L << (ELEVATEDBUTTON_ - 71)))) != 0) || _la==IDENTIFIER) {
				{
				setState(253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(249);
					class_call();
					setState(250);
					match(T__1);
					}
					break;
				case 2:
					{
					setState(252);
					statement();
					}
					break;
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocClassContext extends ParserRuleContext {
		public TerminalNode CLASS_() { return getToken(dartParser.CLASS_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EXTANDS_() { return getToken(dartParser.EXTANDS_, 0); }
		public List<BlocTypeContext> blocType() {
			return getRuleContexts(BlocTypeContext.class);
		}
		public BlocTypeContext blocType(int i) {
			return getRuleContext(BlocTypeContext.class,i);
		}
		public BlocClassArgumentsContext blocClassArguments() {
			return getRuleContext(BlocClassArgumentsContext.class,0);
		}
		public BlocClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterBlocClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitBlocClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitBlocClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocClassContext blocClass() throws RecognitionException {
		BlocClassContext _localctx = new BlocClassContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blocClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(CLASS_);
			setState(261);
			match(IDENTIFIER);
			setState(262);
			match(EXTANDS_);
			setState(263);
			match(T__4);
			setState(264);
			match(T__5);
			setState(265);
			blocType();
			setState(266);
			match(T__0);
			setState(267);
			blocType();
			setState(268);
			match(T__6);
			setState(269);
			match(T__2);
			setState(270);
			blocClassArguments();
			setState(271);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocClassArgumentsContext extends ParserRuleContext {
		public BlocConstructorContext blocConstructor() {
			return getRuleContext(BlocConstructorContext.class,0);
		}
		public StreamMethodContext streamMethod() {
			return getRuleContext(StreamMethodContext.class,0);
		}
		public BlocClassArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocClassArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterBlocClassArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitBlocClassArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitBlocClassArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocClassArgumentsContext blocClassArguments() throws RecognitionException {
		BlocClassArgumentsContext _localctx = new BlocClassArgumentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blocClassArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			blocConstructor();
			setState(274);
			streamMethod();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocConstructorContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlocConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterBlocConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitBlocConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitBlocConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocConstructorContext blocConstructor() throws RecognitionException {
		BlocConstructorContext _localctx = new BlocConstructorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blocConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			className();
			setState(277);
			match(T__7);
			setState(278);
			match(T__8);
			setState(279);
			match(T__9);
			setState(280);
			match(T__10);
			setState(281);
			match(T__7);
			setState(282);
			expression(0);
			setState(283);
			match(T__8);
			setState(284);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StreamMethodContext extends ParserRuleContext {
		public TerminalNode OVERRIDE_() { return getToken(dartParser.OVERRIDE_, 0); }
		public BlocTypeContext blocType() {
			return getRuleContext(BlocTypeContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(dartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(dartParser.IDENTIFIER, i);
		}
		public StreamMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterStreamMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitStreamMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitStreamMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamMethodContext streamMethod() throws RecognitionException {
		StreamMethodContext _localctx = new StreamMethodContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_streamMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(OVERRIDE_);
			setState(287);
			match(T__11);
			setState(288);
			match(T__5);
			setState(289);
			blocType();
			setState(290);
			match(T__6);
			setState(291);
			match(T__12);
			setState(292);
			match(T__7);
			setState(293);
			className();
			setState(294);
			match(IDENTIFIER);
			setState(295);
			match(T__8);
			setState(296);
			match(T__13);
			setState(297);
			match(T__2);
			setState(298);
			match(T__14);
			setState(299);
			match(IDENTIFIER);
			setState(300);
			match(T__1);
			setState(301);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidgetClassContext extends ParserRuleContext {
		public StatelessWidgetContext statelessWidget() {
			return getRuleContext(StatelessWidgetContext.class,0);
		}
		public StatefulWidgetContext statefulWidget() {
			return getRuleContext(StatefulWidgetContext.class,0);
		}
		public WidgetClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgetClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterWidgetClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitWidgetClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitWidgetClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetClassContext widgetClass() throws RecognitionException {
		WidgetClassContext _localctx = new WidgetClassContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_widgetClass);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				statelessWidget();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				statefulWidget();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatefulWidgetContext extends ParserRuleContext {
		public TerminalNode CLASS_() { return getToken(dartParser.CLASS_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EXTANDS_() { return getToken(dartParser.EXTANDS_, 0); }
		public TerminalNode STATEFULWIDGET_() { return getToken(dartParser.STATEFULWIDGET_, 0); }
		public List<StateClassContext> stateClass() {
			return getRuleContexts(StateClassContext.class);
		}
		public StateClassContext stateClass(int i) {
			return getRuleContext(StateClassContext.class,i);
		}
		public List<CreateStateContext> createState() {
			return getRuleContexts(CreateStateContext.class);
		}
		public CreateStateContext createState(int i) {
			return getRuleContext(CreateStateContext.class,i);
		}
		public StatefulWidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statefulWidget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterStatefulWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitStatefulWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitStatefulWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatefulWidgetContext statefulWidget() throws RecognitionException {
		StatefulWidgetContext _localctx = new StatefulWidgetContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statefulWidget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(CLASS_);
			setState(308);
			match(IDENTIFIER);
			setState(309);
			match(EXTANDS_);
			setState(310);
			match(STATEFULWIDGET_);
			setState(311);
			match(T__2);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OVERRIDE_ || _la==CLASS_) {
				{
				setState(314);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS_:
					{
					setState(312);
					stateClass();
					}
					break;
				case OVERRIDE_:
					{
					setState(313);
					createState();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateStateContext extends ParserRuleContext {
		public TerminalNode OVERRIDE_() { return getToken(dartParser.OVERRIDE_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode CREATESTATE_() { return getToken(dartParser.CREATESTATE_, 0); }
		public Class_callContext class_call() {
			return getRuleContext(Class_callContext.class,0);
		}
		public CreateStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterCreateState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitCreateState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitCreateState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStateContext createState() throws RecognitionException {
		CreateStateContext _localctx = new CreateStateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(OVERRIDE_);
			setState(322);
			match(IDENTIFIER);
			setState(323);
			match(CREATESTATE_);
			setState(324);
			match(T__7);
			setState(325);
			match(T__8);
			setState(326);
			match(T__15);
			setState(327);
			class_call();
			setState(328);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateClassContext extends ParserRuleContext {
		public TerminalNode CLASS_() { return getToken(dartParser.CLASS_, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(dartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(dartParser.IDENTIFIER, i);
		}
		public TerminalNode EXTANDS_() { return getToken(dartParser.EXTANDS_, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WidgetBuildContext widgetBuild() {
			return getRuleContext(WidgetBuildContext.class,0);
		}
		public StateClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterStateClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitStateClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitStateClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateClassContext stateClass() throws RecognitionException {
		StateClassContext _localctx = new StateClassContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stateClass);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(CLASS_);
			setState(331);
			match(IDENTIFIER);
			setState(332);
			match(EXTANDS_);
			setState(333);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(334);
			match(T__5);
			setState(335);
			match(IDENTIFIER);
			setState(336);
			match(T__6);
			setState(337);
			match(T__2);
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(338);
					statement();
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE_) {
				{
				setState(344);
				widgetBuild();
				}
			}

			setState(347);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatelessWidgetContext extends ParserRuleContext {
		public TerminalNode CLASS_() { return getToken(dartParser.CLASS_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EXTANDS_() { return getToken(dartParser.EXTANDS_, 0); }
		public TerminalNode STATELESSWIDGET_() { return getToken(dartParser.STATELESSWIDGET_, 0); }
		public WidgetBuildContext widgetBuild() {
			return getRuleContext(WidgetBuildContext.class,0);
		}
		public List<Class_callContext> class_call() {
			return getRuleContexts(Class_callContext.class);
		}
		public Class_callContext class_call(int i) {
			return getRuleContext(Class_callContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatelessWidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statelessWidget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterStatelessWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitStatelessWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitStatelessWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatelessWidgetContext statelessWidget() throws RecognitionException {
		StatelessWidgetContext _localctx = new StatelessWidgetContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statelessWidget);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(CLASS_);
			setState(350);
			match(IDENTIFIER);
			setState(351);
			match(EXTANDS_);
			setState(352);
			match(STATELESSWIDGET_);
			setState(353);
			match(T__2);
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(358);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(354);
						class_call();
						setState(355);
						match(T__1);
						}
						break;
					case 2:
						{
						setState(357);
						statement();
						}
						break;
					}
					} 
				}
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(363);
			widgetBuild();
			setState(364);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidgetBuildContext extends ParserRuleContext {
		public TerminalNode OVERRIDE_() { return getToken(dartParser.OVERRIDE_, 0); }
		public TerminalNode WIDGET_() { return getToken(dartParser.WIDGET_, 0); }
		public TerminalNode BUILD_() { return getToken(dartParser.BUILD_, 0); }
		public TerminalNode BUILDCONTEXT_() { return getToken(dartParser.BUILDCONTEXT_, 0); }
		public TerminalNode CONTEXT_() { return getToken(dartParser.CONTEXT_, 0); }
		public TerminalNode RETURN_() { return getToken(dartParser.RETURN_, 0); }
		public WidgetLiteralContext widgetLiteral() {
			return getRuleContext(WidgetLiteralContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WidgetBuildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgetBuild; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterWidgetBuild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitWidgetBuild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitWidgetBuild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetBuildContext widgetBuild() throws RecognitionException {
		WidgetBuildContext _localctx = new WidgetBuildContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_widgetBuild);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(OVERRIDE_);
			setState(367);
			match(WIDGET_);
			setState(368);
			match(BUILD_);
			setState(369);
			match(T__7);
			setState(370);
			match(BUILDCONTEXT_);
			setState(371);
			match(CONTEXT_);
			setState(372);
			match(T__8);
			setState(373);
			match(T__2);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__48 || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (FINAL_ - 76)) | (1L << (IF_ - 76)) | (1L << (WHILE_ - 76)) | (1L << (PRINT_ - 76)) | (1L << (OVERRIDE_ - 76)) | (1L << (VOID_ - 76)) | (1L << (FLOAT - 76)) | (1L << (INT - 76)) | (1L << (VAR - 76)) | (1L << (BOOLEAN - 76)) | (1L << (SETSTATE_ - 76)) | (1L << (NAVIGATOR_ - 76)) | (1L << (SHOWDIALOG_ - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
				{
				{
				setState(374);
				statement();
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
			match(RETURN_);
			setState(381);
			widgetLiteral();
			setState(382);
			match(T__1);
			setState(383);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidgetLiteralContext extends ParserRuleContext {
		public BlocBuildWidgetContext blocBuildWidget() {
			return getRuleContext(BlocBuildWidgetContext.class,0);
		}
		public ObxWidgetContext obxWidget() {
			return getRuleContext(ObxWidgetContext.class,0);
		}
		public ScaffoldContext scaffold() {
			return getRuleContext(ScaffoldContext.class,0);
		}
		public AlertDialogContext alertDialog() {
			return getRuleContext(AlertDialogContext.class,0);
		}
		public TextButtonContext textButton() {
			return getRuleContext(TextButtonContext.class,0);
		}
		public TextFieldContext textField() {
			return getRuleContext(TextFieldContext.class,0);
		}
		public ElevatedButtonContext elevatedButton() {
			return getRuleContext(ElevatedButtonContext.class,0);
		}
		public MaterialAppContext materialApp() {
			return getRuleContext(MaterialAppContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public SizedBoxContext sizedBox() {
			return getRuleContext(SizedBoxContext.class,0);
		}
		public GestureDetectorContext gestureDetector() {
			return getRuleContext(GestureDetectorContext.class,0);
		}
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
		public CenterContext center() {
			return getRuleContext(CenterContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public ListviewContext listview() {
			return getRuleContext(ListviewContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WidgetLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgetLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterWidgetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitWidgetLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitWidgetLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetLiteralContext widgetLiteral() throws RecognitionException {
		WidgetLiteralContext _localctx = new WidgetLiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_widgetLiteral);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				blocBuildWidget();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				obxWidget();
				}
				break;
			case SCAFFOLD_:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				scaffold();
				}
				break;
			case ALERTDIALOG_:
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				alertDialog();
				}
				break;
			case TEXTBUTTON_:
				enterOuterAlt(_localctx, 5);
				{
				setState(389);
				textButton();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(390);
				textField();
				}
				break;
			case ELEVATEDBUTTON_:
				enterOuterAlt(_localctx, 7);
				{
				setState(391);
				elevatedButton();
				}
				break;
			case MaterialApp_:
				enterOuterAlt(_localctx, 8);
				{
				setState(392);
				materialApp();
				}
				break;
			case CONTAINER_:
				enterOuterAlt(_localctx, 9);
				{
				setState(393);
				container();
				}
				break;
			case SIZEDBOX_:
				enterOuterAlt(_localctx, 10);
				{
				setState(394);
				sizedBox();
				}
				break;
			case GESTUREDETECTOR_:
				enterOuterAlt(_localctx, 11);
				{
				setState(395);
				gestureDetector();
				}
				break;
			case CARD_:
				enterOuterAlt(_localctx, 12);
				{
				setState(396);
				card();
				}
				break;
			case CENTER_:
				enterOuterAlt(_localctx, 13);
				{
				setState(397);
				center();
				}
				break;
			case COLUMN_:
				enterOuterAlt(_localctx, 14);
				{
				setState(398);
				column();
				}
				break;
			case ROW_:
				enterOuterAlt(_localctx, 15);
				{
				setState(399);
				row();
				}
				break;
			case LISTVIEW_:
				enterOuterAlt(_localctx, 16);
				{
				setState(400);
				listview();
				}
				break;
			case IMAGE_:
			case NETWORKIMAGE_:
				enterOuterAlt(_localctx, 17);
				{
				setState(401);
				image();
				}
				break;
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 18);
				{
				setState(402);
				text();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaterialAppContext extends ParserRuleContext {
		public TerminalNode MaterialApp_() { return getToken(dartParser.MaterialApp_, 0); }
		public List<WidgetAttributeContext> widgetAttribute() {
			return getRuleContexts(WidgetAttributeContext.class);
		}
		public WidgetAttributeContext widgetAttribute(int i) {
			return getRuleContext(WidgetAttributeContext.class,i);
		}
		public MaterialAppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialApp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterMaterialApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitMaterialApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitMaterialApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterialAppContext materialApp() throws RecognitionException {
		MaterialAppContext _localctx = new MaterialAppContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_materialApp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(MaterialApp_);
			setState(406);
			match(T__7);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28 || _la==T__29 || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHILD_ - 69)) | (1L << (CHILDREN_ - 69)) | (1L << (ONTAP_ - 69)) | (1L << (ONPRESSED_ - 69)) | (1L << (COLOR_ - 69)) | (1L << (HIGHT_ - 69)) | (1L << (WIDTH_ - 69)) | (1L << (PADDING_ - 69)) | (1L << (MARGIN_ - 69)) | (1L << (TITLE_ - 69)) | (1L << (THEME_ - 69)) | (1L << (HOME_ - 69)) | (1L << (ACTIONS_ - 69)) | (1L << (CONTENT_ - 69)) | (1L << (APPBAR_ - 69)) | (1L << (MAINAXISALIGNMENT_ - 69)))) != 0)) {
				{
				setState(407);
				widgetAttribute();
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(408);
						match(T__0);
						setState(409);
						widgetAttribute();
						}
						} 
					}
					setState(414);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
			}

			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(417);
				match(T__0);
				}
			}

			setState(420);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GestureDetectorContext extends ParserRuleContext {
		public TerminalNode GESTUREDETECTOR_() { return getToken(dartParser.GESTUREDETECTOR_, 0); }
		public List<WidgetAttributeContext> widgetAttribute() {
			return getRuleContexts(WidgetAttributeContext.class);
		}
		public WidgetAttributeContext widgetAttribute(int i) {
			return getRuleContext(WidgetAttributeContext.class,i);
		}
		public GestureDetectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gestureDetector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterGestureDetector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitGestureDetector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitGestureDetector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GestureDetectorContext gestureDetector() throws RecognitionException {
		GestureDetectorContext _localctx = new GestureDetectorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_gestureDetector);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(GESTUREDETECTOR_);
			setState(423);
			match(T__7);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28 || _la==T__29 || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHILD_ - 69)) | (1L << (CHILDREN_ - 69)) | (1L << (ONTAP_ - 69)) | (1L << (ONPRESSED_ - 69)) | (1L << (COLOR_ - 69)) | (1L << (HIGHT_ - 69)) | (1L << (WIDTH_ - 69)) | (1L << (PADDING_ - 69)) | (1L << (MARGIN_ - 69)) | (1L << (TITLE_ - 69)) | (1L << (THEME_ - 69)) | (1L << (HOME_ - 69)) | (1L << (ACTIONS_ - 69)) | (1L << (CONTENT_ - 69)) | (1L << (APPBAR_ - 69)) | (1L << (MAINAXISALIGNMENT_ - 69)))) != 0)) {
				{
				setState(424);
				widgetAttribute();
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(425);
						match(T__0);
						setState(426);
						widgetAttribute();
						}
						} 
					}
					setState(431);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
			}

			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(434);
				match(T__0);
				}
			}

			setState(437);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaffoldContext extends ParserRuleContext {
		public TerminalNode SCAFFOLD_() { return getToken(dartParser.SCAFFOLD_, 0); }
		public List<WidgetAttributeContext> widgetAttribute() {
			return getRuleContexts(WidgetAttributeContext.class);
		}
		public WidgetAttributeContext widgetAttribute(int i) {
			return getRuleContext(WidgetAttributeContext.class,i);
		}
		public ScaffoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterScaffold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitScaffold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitScaffold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldContext scaffold() throws RecognitionException {
		ScaffoldContext _localctx = new ScaffoldContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_scaffold);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(SCAFFOLD_);
			setState(440);
			match(T__7);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28 || _la==T__29 || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHILD_ - 69)) | (1L << (CHILDREN_ - 69)) | (1L << (ONTAP_ - 69)) | (1L << (ONPRESSED_ - 69)) | (1L << (COLOR_ - 69)) | (1L << (HIGHT_ - 69)) | (1L << (WIDTH_ - 69)) | (1L << (PADDING_ - 69)) | (1L << (MARGIN_ - 69)) | (1L << (TITLE_ - 69)) | (1L << (THEME_ - 69)) | (1L << (HOME_ - 69)) | (1L << (ACTIONS_ - 69)) | (1L << (CONTENT_ - 69)) | (1L << (APPBAR_ - 69)) | (1L << (MAINAXISALIGNMENT_ - 69)))) != 0)) {
				{
				setState(441);
				widgetAttribute();
				setState(446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(442);
						match(T__0);
						setState(443);
						widgetAttribute();
						}
						} 
					}
					setState(448);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
			}

			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(451);
				match(T__0);
				}
			}

			setState(454);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode CONTAINER_() { return getToken(dartParser.CONTAINER_, 0); }
		public List<WidgetAttributeContext> widgetAttribute() {
			return getRuleContexts(WidgetAttributeContext.class);
		}
		public WidgetAttributeContext widgetAttribute(int i) {
			return getRuleContext(WidgetAttributeContext.class,i);
		}
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_container);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(CONTAINER_);
			setState(457);
			match(T__7);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28 || _la==T__29 || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHILD_ - 69)) | (1L << (CHILDREN_ - 69)) | (1L << (ONTAP_ - 69)) | (1L << (ONPRESSED_ - 69)) | (1L << (COLOR_ - 69)) | (1L << (HIGHT_ - 69)) | (1L << (WIDTH_ - 69)) | (1L << (PADDING_ - 69)) | (1L << (MARGIN_ - 69)) | (1L << (TITLE_ - 69)) | (1L << (THEME_ - 69)) | (1L << (HOME_ - 69)) | (1L << (ACTIONS_ - 69)) | (1L << (CONTENT_ - 69)) | (1L << (APPBAR_ - 69)) | (1L << (MAINAXISALIGNMENT_ - 69)))) != 0)) {
				{
				setState(458);
				widgetAttribute();
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(459);
						match(T__0);
						setState(460);
						widgetAttribute();
						}
						} 
					}
					setState(465);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
			}

			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(468);
				match(T__0);
				}
			}

			setState(471);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CardContext extends ParserRuleContext {
		public TerminalNode CARD_() { return getToken(dartParser.CARD_, 0); }
		public List<WidgetAttributeContext> widgetAttribute() {
			return getRuleContexts(WidgetAttributeContext.class);
		}
		public WidgetAttributeContext widgetAttribute(int i) {
			return getRuleContext(WidgetAttributeContext.class,i);
		}
		public CardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitCard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitCard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardContext card() throws RecognitionException {
		CardContext _localctx = new CardContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_card);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(CARD_);
			setState(474);
			match(T__7);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28 || _la==T__29 || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHILD_ - 69)) | (1L << (CHILDREN_ - 69)) | (1L << (ONTAP_ - 69)) | (1L << (ONPRESSED_ - 69)) | (1L << (COLOR_ - 69)) | (1L << (HIGHT_ - 69)) | (1L << (WIDTH_ - 69)) | (1L << (PADDING_ - 69)) | (1L << (MARGIN_ - 69)) | (1L << (TITLE_ - 69)) | (1L << (THEME_ - 69)) | (1L << (HOME_ - 69)) | (1L << (ACTIONS_ - 69)) | (1L << (CONTENT_ - 69)) | (1L << (APPBAR_ - 69)) | (1L << (MAINAXISALIGNMENT_ - 69)))) != 0)) {
				{
				setState(475);
				widgetAttribute();
				setState(480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(476);
						match(T__0);
						setState(477);
						widgetAttribute();
						}
						} 
					}
					setState(482);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
			}

			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(485);
				match(T__0);
				}
			}

			setState(488);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextButtonContext extends ParserRuleContext {
		public TerminalNode TEXTBUTTON_() { return getToken(dartParser.TEXTBUTTON_, 0); }
		public List<WidgetAttributeContext> widgetAttribute() {
			return getRuleContexts(WidgetAttributeContext.class);
		}
		public WidgetAttributeContext widgetAttribute(int i) {
			return getRuleContext(WidgetAttributeContext.class,i);
		}
		public TextButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textButton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterTextButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitTextButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitTextButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextButtonContext textButton() throws RecognitionException {
		TextButtonContext _localctx = new TextButtonContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_textButton);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(TEXTBUTTON_);
			setState(491);
			match(T__7);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28 || _la==T__29 || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHILD_ - 69)) | (1L << (CHILDREN_ - 69)) | (1L << (ONTAP_ - 69)) | (1L << (ONPRESSED_ - 69)) | (1L << (COLOR_ - 69)) | (1L << (HIGHT_ - 69)) | (1L << (WIDTH_ - 69)) | (1L << (PADDING_ - 69)) | (1L << (MARGIN_ - 69)) | (1L << (TITLE_ - 69)) | (1L << (THEME_ - 69)) | (1L << (HOME_ - 69)) | (1L << (ACTIONS_ - 69)) | (1L << (CONTENT_ - 69)) | (1L << (APPBAR_ - 69)) | (1L << (MAINAXISALIGNMENT_ - 69)))) != 0)) {
				{
				setState(492);
				widgetAttribute();
				setState(497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(493);
						match(T__0);
						setState(494);
						widgetAttribute();
						}
						} 
					}
					setState(499);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
			}

			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(502);
				match(T__0);
				}
			}

			setState(505);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextFieldContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(dartParser.STRING_LITERAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TextFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterTextField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitTextField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitTextField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldContext textField() throws RecognitionException {
		TextFieldContext _localctx = new TextFieldContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_textField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(T__18);
			setState(508);
			match(T__7);
			setState(509);
			match(T__19);
			setState(510);
			match(T__9);
			setState(511);
			match(IDENTIFIER);
			setState(512);
			match(T__0);
			setState(513);
			match(T__20);
			setState(514);
			match(T__9);
			setState(515);
			match(T__21);
			setState(516);
			match(T__7);
			setState(517);
			match(T__22);
			setState(518);
			match(T__9);
			setState(519);
			match(STRING_LITERAL);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(520);
				match(T__0);
				}
			}

			setState(523);
			match(T__8);
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(524);
				match(T__0);
				}
				break;
			}
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(527);
				match(T__23);
				setState(528);
				match(T__9);
				setState(529);
				constant();
				}
			}

			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(532);
				match(T__0);
				}
			}

			setState(535);
			match(T__8);
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(536);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElevatedButtonContext extends ParserRuleContext {
		public TerminalNode ELEVATEDBUTTON_() { return getToken(dartParser.ELEVATEDBUTTON_, 0); }
		public List<ElevatedButtonAttributeContext> elevatedButtonAttribute() {
			return getRuleContexts(ElevatedButtonAttributeContext.class);
		}
		public ElevatedButtonAttributeContext elevatedButtonAttribute(int i) {
			return getRuleContext(ElevatedButtonAttributeContext.class,i);
		}
		public ElevatedButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elevatedButton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterElevatedButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitElevatedButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitElevatedButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElevatedButtonContext elevatedButton() throws RecognitionException {
		ElevatedButtonContext _localctx = new ElevatedButtonContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elevatedButton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(ELEVATEDBUTTON_);
			setState(540);
			match(T__7);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (T__29 - 30)) | (1L << (CHILD_ - 30)) | (1L << (ONPRESSED_ - 30)))) != 0)) {
				{
				{
				setState(541);
				elevatedButtonAttribute();
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(547);
				match(T__0);
				}
			}

			setState(550);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElevatedButtonAttributeContext extends ParserRuleContext {
		public OnPressedContext onPressed() {
			return getRuleContext(OnPressedContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public ElevatedButtonAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elevatedButtonAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterElevatedButtonAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitElevatedButtonAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitElevatedButtonAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElevatedButtonAttributeContext elevatedButtonAttribute() throws RecognitionException {
		ElevatedButtonAttributeContext _localctx = new ElevatedButtonAttributeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elevatedButtonAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONPRESSED_:
				{
				setState(552);
				onPressed();
				}
				break;
			case T__29:
				{
				setState(553);
				style();
				}
				break;
			case CHILD_:
				{
				setState(554);
				child();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizedBoxContext extends ParserRuleContext {
		public TerminalNode SIZEDBOX_() { return getToken(dartParser.SIZEDBOX_, 0); }
		public List<WidgetAttributeContext> widgetAttribute() {
			return getRuleContexts(WidgetAttributeContext.class);
		}
		public WidgetAttributeContext widgetAttribute(int i) {
			return getRuleContext(WidgetAttributeContext.class,i);
		}
		public SizedBoxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizedBox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterSizedBox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitSizedBox(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitSizedBox(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizedBoxContext sizedBox() throws RecognitionException {
		SizedBoxContext _localctx = new SizedBoxContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sizedBox);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(SIZEDBOX_);
			setState(558);
			match(T__7);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28 || _la==T__29 || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHILD_ - 69)) | (1L << (CHILDREN_ - 69)) | (1L << (ONTAP_ - 69)) | (1L << (ONPRESSED_ - 69)) | (1L << (COLOR_ - 69)) | (1L << (HIGHT_ - 69)) | (1L << (WIDTH_ - 69)) | (1L << (PADDING_ - 69)) | (1L << (MARGIN_ - 69)) | (1L << (TITLE_ - 69)) | (1L << (THEME_ - 69)) | (1L << (HOME_ - 69)) | (1L << (ACTIONS_ - 69)) | (1L << (CONTENT_ - 69)) | (1L << (APPBAR_ - 69)) | (1L << (MAINAXISALIGNMENT_ - 69)))) != 0)) {
				{
				setState(559);
				widgetAttribute();
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(560);
						match(T__0);
						setState(561);
						widgetAttribute();
						}
						} 
					}
					setState(566);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				}
			}

			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(569);
				match(T__0);
				}
			}

			setState(572);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlertDialogContext extends ParserRuleContext {
		public TerminalNode ALERTDIALOG_() { return getToken(dartParser.ALERTDIALOG_, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public AlertDialogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alertDialog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterAlertDialog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitAlertDialog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitAlertDialog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlertDialogContext alertDialog() throws RecognitionException {
		AlertDialogContext _localctx = new AlertDialogContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_alertDialog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(ALERTDIALOG_);
			setState(575);
			match(T__7);
			setState(576);
			title();
			setState(577);
			match(T__0);
			setState(578);
			content();
			setState(579);
			match(T__0);
			setState(580);
			actions();
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(581);
				match(T__0);
				}
			}

			setState(584);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CenterContext extends ParserRuleContext {
		public TerminalNode CENTER_() { return getToken(dartParser.CENTER_, 0); }
		public List<WidgetAttributeContext> widgetAttribute() {
			return getRuleContexts(WidgetAttributeContext.class);
		}
		public WidgetAttributeContext widgetAttribute(int i) {
			return getRuleContext(WidgetAttributeContext.class,i);
		}
		public CenterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_center; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterCenter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitCenter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitCenter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenterContext center() throws RecognitionException {
		CenterContext _localctx = new CenterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_center);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(CENTER_);
			setState(587);
			match(T__7);
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28 || _la==T__29 || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHILD_ - 69)) | (1L << (CHILDREN_ - 69)) | (1L << (ONTAP_ - 69)) | (1L << (ONPRESSED_ - 69)) | (1L << (COLOR_ - 69)) | (1L << (HIGHT_ - 69)) | (1L << (WIDTH_ - 69)) | (1L << (PADDING_ - 69)) | (1L << (MARGIN_ - 69)) | (1L << (TITLE_ - 69)) | (1L << (THEME_ - 69)) | (1L << (HOME_ - 69)) | (1L << (ACTIONS_ - 69)) | (1L << (CONTENT_ - 69)) | (1L << (APPBAR_ - 69)) | (1L << (MAINAXISALIGNMENT_ - 69)))) != 0)) {
				{
				setState(588);
				widgetAttribute();
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(589);
						match(T__0);
						setState(590);
						widgetAttribute();
						}
						} 
					}
					setState(595);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				}
			}

			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(598);
				match(T__0);
				}
			}

			setState(601);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode COLUMN_() { return getToken(dartParser.COLUMN_, 0); }
		public List<WidgetAttributeContext> widgetAttribute() {
			return getRuleContexts(WidgetAttributeContext.class);
		}
		public WidgetAttributeContext widgetAttribute(int i) {
			return getRuleContext(WidgetAttributeContext.class,i);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_column);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(COLUMN_);
			setState(604);
			match(T__7);
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28 || _la==T__29 || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHILD_ - 69)) | (1L << (CHILDREN_ - 69)) | (1L << (ONTAP_ - 69)) | (1L << (ONPRESSED_ - 69)) | (1L << (COLOR_ - 69)) | (1L << (HIGHT_ - 69)) | (1L << (WIDTH_ - 69)) | (1L << (PADDING_ - 69)) | (1L << (MARGIN_ - 69)) | (1L << (TITLE_ - 69)) | (1L << (THEME_ - 69)) | (1L << (HOME_ - 69)) | (1L << (ACTIONS_ - 69)) | (1L << (CONTENT_ - 69)) | (1L << (APPBAR_ - 69)) | (1L << (MAINAXISALIGNMENT_ - 69)))) != 0)) {
				{
				setState(605);
				widgetAttribute();
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(606);
						match(T__0);
						setState(607);
						widgetAttribute();
						}
						} 
					}
					setState(612);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
			}

			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(615);
				match(T__0);
				}
			}

			setState(618);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public TerminalNode ROW_() { return getToken(dartParser.ROW_, 0); }
		public List<WidgetAttributeContext> widgetAttribute() {
			return getRuleContexts(WidgetAttributeContext.class);
		}
		public WidgetAttributeContext widgetAttribute(int i) {
			return getRuleContext(WidgetAttributeContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_row);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(ROW_);
			setState(621);
			match(T__7);
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28 || _la==T__29 || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHILD_ - 69)) | (1L << (CHILDREN_ - 69)) | (1L << (ONTAP_ - 69)) | (1L << (ONPRESSED_ - 69)) | (1L << (COLOR_ - 69)) | (1L << (HIGHT_ - 69)) | (1L << (WIDTH_ - 69)) | (1L << (PADDING_ - 69)) | (1L << (MARGIN_ - 69)) | (1L << (TITLE_ - 69)) | (1L << (THEME_ - 69)) | (1L << (HOME_ - 69)) | (1L << (ACTIONS_ - 69)) | (1L << (CONTENT_ - 69)) | (1L << (APPBAR_ - 69)) | (1L << (MAINAXISALIGNMENT_ - 69)))) != 0)) {
				{
				setState(622);
				widgetAttribute();
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(623);
						match(T__0);
						setState(624);
						widgetAttribute();
						}
						} 
					}
					setState(629);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(630);
				match(T__0);
				}
			}

			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(634);
				match(T__0);
				}
			}

			setState(637);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListviewContext extends ParserRuleContext {
		public TerminalNode LISTVIEW_() { return getToken(dartParser.LISTVIEW_, 0); }
		public List<WidgetAttributeContext> widgetAttribute() {
			return getRuleContexts(WidgetAttributeContext.class);
		}
		public WidgetAttributeContext widgetAttribute(int i) {
			return getRuleContext(WidgetAttributeContext.class,i);
		}
		public ListviewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listview; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterListview(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitListview(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitListview(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListviewContext listview() throws RecognitionException {
		ListviewContext _localctx = new ListviewContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_listview);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(LISTVIEW_);
			setState(640);
			match(T__7);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28 || _la==T__29 || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHILD_ - 69)) | (1L << (CHILDREN_ - 69)) | (1L << (ONTAP_ - 69)) | (1L << (ONPRESSED_ - 69)) | (1L << (COLOR_ - 69)) | (1L << (HIGHT_ - 69)) | (1L << (WIDTH_ - 69)) | (1L << (PADDING_ - 69)) | (1L << (MARGIN_ - 69)) | (1L << (TITLE_ - 69)) | (1L << (THEME_ - 69)) | (1L << (HOME_ - 69)) | (1L << (ACTIONS_ - 69)) | (1L << (CONTENT_ - 69)) | (1L << (APPBAR_ - 69)) | (1L << (MAINAXISALIGNMENT_ - 69)))) != 0)) {
				{
				setState(641);
				widgetAttribute();
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(642);
						match(T__0);
						setState(643);
						widgetAttribute();
						}
						} 
					}
					setState(648);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				}
			}

			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(651);
				match(T__0);
				}
			}

			setState(654);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImageContext extends ParserRuleContext {
		public TerminalNode IMAGE_() { return getToken(dartParser.IMAGE_, 0); }
		public TerminalNode DECORATIONIMAGE_() { return getToken(dartParser.DECORATIONIMAGE_, 0); }
		public AssetImageContext assetImage() {
			return getRuleContext(AssetImageContext.class,0);
		}
		public NetworkImageContext networkImage() {
			return getRuleContext(NetworkImageContext.class,0);
		}
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_image);
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMAGE_:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				match(IMAGE_);
				setState(657);
				match(T__9);
				setState(658);
				match(DECORATIONIMAGE_);
				setState(659);
				match(T__7);
				setState(660);
				assetImage();
				}
				break;
			case NETWORKIMAGE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				networkImage();
				setState(662);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public StringInterpolationContext stringInterpolation() {
			return getRuleContext(StringInterpolationContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(667);
			match(T__7);
			setState(668);
			stringInterpolation();
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(669);
				match(T__0);
				}
			}

			setState(672);
			match(T__8);
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(673);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObxWidgetContext extends ParserRuleContext {
		public WidgetLiteralContext widgetLiteral() {
			return getRuleContext(WidgetLiteralContext.class,0);
		}
		public ObxWidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obxWidget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterObxWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitObxWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitObxWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObxWidgetContext obxWidget() throws RecognitionException {
		ObxWidgetContext _localctx = new ObxWidgetContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_obxWidget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(T__26);
			setState(677);
			match(T__7);
			setState(678);
			match(T__7);
			setState(679);
			match(T__8);
			setState(680);
			match(T__15);
			setState(681);
			widgetLiteral();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(682);
				match(T__0);
				}
			}

			setState(685);
			match(T__8);
			setState(687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(686);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocBuildWidgetContext extends ParserRuleContext {
		public List<BlocTypeContext> blocType() {
			return getRuleContexts(BlocTypeContext.class);
		}
		public BlocTypeContext blocType(int i) {
			return getRuleContext(BlocTypeContext.class,i);
		}
		public BlocBuilderContext blocBuilder() {
			return getRuleContext(BlocBuilderContext.class,0);
		}
		public BlocBuildWidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocBuildWidget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterBlocBuildWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitBlocBuildWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitBlocBuildWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocBuildWidgetContext blocBuildWidget() throws RecognitionException {
		BlocBuildWidgetContext _localctx = new BlocBuildWidgetContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_blocBuildWidget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(T__27);
			setState(690);
			match(T__5);
			setState(691);
			blocType();
			setState(692);
			match(T__0);
			setState(693);
			blocType();
			setState(694);
			match(T__6);
			setState(695);
			match(T__7);
			setState(696);
			blocBuilder();
			setState(697);
			match(T__8);
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(698);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocBuilderContext extends ParserRuleContext {
		public TerminalNode BUILDER_() { return getToken(dartParser.BUILDER_, 0); }
		public TerminalNode CONTEXT_() { return getToken(dartParser.CONTEXT_, 0); }
		public TerminalNode RETURN_() { return getToken(dartParser.RETURN_, 0); }
		public WidgetLiteralContext widgetLiteral() {
			return getRuleContext(WidgetLiteralContext.class,0);
		}
		public BlocBuilderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocBuilder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterBlocBuilder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitBlocBuilder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitBlocBuilder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocBuilderContext blocBuilder() throws RecognitionException {
		BlocBuilderContext _localctx = new BlocBuilderContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_blocBuilder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(BUILDER_);
			setState(702);
			match(T__9);
			setState(703);
			match(T__7);
			setState(704);
			match(CONTEXT_);
			setState(705);
			match(T__0);
			setState(706);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(707);
			match(T__8);
			setState(708);
			match(T__2);
			setState(709);
			match(RETURN_);
			setState(710);
			widgetLiteral();
			setState(711);
			match(T__1);
			setState(712);
			match(T__3);
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(713);
				match(T__0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssetImageContext extends ParserRuleContext {
		public TerminalNode ASSETIMAGE_() { return getToken(dartParser.ASSETIMAGE_, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(dartParser.STRING_LITERAL, 0); }
		public AssetImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assetImage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterAssetImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitAssetImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitAssetImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssetImageContext assetImage() throws RecognitionException {
		AssetImageContext _localctx = new AssetImageContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assetImage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(ASSETIMAGE_);
			setState(717);
			match(T__7);
			setState(718);
			match(STRING_LITERAL);
			setState(719);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NetworkImageContext extends ParserRuleContext {
		public TerminalNode NETWORKIMAGE_() { return getToken(dartParser.NETWORKIMAGE_, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(dartParser.STRING_LITERAL, 0); }
		public NetworkImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_networkImage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterNetworkImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitNetworkImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitNetworkImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NetworkImageContext networkImage() throws RecognitionException {
		NetworkImageContext _localctx = new NetworkImageContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_networkImage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(NETWORKIMAGE_);
			setState(722);
			match(T__7);
			setState(723);
			match(STRING_LITERAL);
			setState(724);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidgetAttributeContext extends ParserRuleContext {
		public AppBarContext appBar() {
			return getRuleContext(AppBarContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public OnPressedContext onPressed() {
			return getRuleContext(OnPressedContext.class,0);
		}
		public HomeContext home() {
			return getRuleContext(HomeContext.class,0);
		}
		public MainAxisAlignmentContext mainAxisAlignment() {
			return getRuleContext(MainAxisAlignmentContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public HightContext hight() {
			return getRuleContext(HightContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public PaddingContext padding() {
			return getRuleContext(PaddingContext.class,0);
		}
		public MarginContext margin() {
			return getRuleContext(MarginContext.class,0);
		}
		public OntapContext ontap() {
			return getRuleContext(OntapContext.class,0);
		}
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public ThemeContext theme() {
			return getRuleContext(ThemeContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public WidgetAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgetAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterWidgetAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitWidgetAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitWidgetAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetAttributeContext widgetAttribute() throws RecognitionException {
		WidgetAttributeContext _localctx = new WidgetAttributeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_widgetAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPBAR_:
				{
				setState(726);
				appBar();
				}
				break;
			case T__28:
				{
				setState(727);
				body();
				}
				break;
			case ONPRESSED_:
				{
				setState(728);
				onPressed();
				}
				break;
			case HOME_:
				{
				setState(729);
				home();
				}
				break;
			case MAINAXISALIGNMENT_:
				{
				setState(730);
				mainAxisAlignment();
				}
				break;
			case T__29:
				{
				setState(731);
				style();
				}
				break;
			case COLOR_:
				{
				setState(732);
				color();
				}
				break;
			case HIGHT_:
				{
				setState(733);
				hight();
				}
				break;
			case WIDTH_:
				{
				setState(734);
				width();
				}
				break;
			case PADDING_:
				{
				setState(735);
				padding();
				}
				break;
			case MARGIN_:
				{
				setState(736);
				margin();
				}
				break;
			case ONTAP_:
				{
				setState(737);
				ontap();
				}
				break;
			case ACTIONS_:
				{
				setState(738);
				actions();
				}
				break;
			case THEME_:
				{
				setState(739);
				theme();
				}
				break;
			case CONTENT_:
				{
				setState(740);
				content();
				}
				break;
			case TITLE_:
				{
				setState(741);
				title();
				}
				break;
			case CHILD_:
				{
				setState(742);
				child();
				}
				break;
			case CHILDREN_:
				{
				setState(743);
				children();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AppBarContext extends ParserRuleContext {
		public List<TerminalNode> APPBAR_() { return getTokens(dartParser.APPBAR_); }
		public TerminalNode APPBAR_(int i) {
			return getToken(dartParser.APPBAR_, i);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public AppBarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appBar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterAppBar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitAppBar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitAppBar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppBarContext appBar() throws RecognitionException {
		AppBarContext _localctx = new AppBarContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_appBar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(APPBAR_);
			setState(747);
			match(T__9);
			setState(748);
			match(APPBAR_);
			setState(749);
			match(T__7);
			setState(750);
			title();
			setState(751);
			match(T__8);
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(752);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public BodyArgumentsContext bodyArguments() {
			return getRuleContext(BodyArgumentsContext.class,0);
		}
		public BlocProviderStatementContext blocProviderStatement() {
			return getRuleContext(BlocProviderStatementContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(T__28);
			setState(756);
			match(T__9);
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CENTER_:
			case PADDING_:
				{
				setState(757);
				bodyArguments();
				}
				break;
			case T__40:
				{
				setState(758);
				blocProviderStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StyleContext extends ParserRuleContext {
		public TerminalNode ELEVATEDBUTTON_() { return getToken(dartParser.ELEVATEDBUTTON_, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public PrimarySwatchContext primarySwatch() {
			return getRuleContext(PrimarySwatchContext.class,0);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(T__29);
			setState(762);
			match(T__9);
			setState(763);
			match(ELEVATEDBUTTON_);
			setState(764);
			match(DOT);
			setState(765);
			match(T__30);
			setState(766);
			match(T__7);
			setState(767);
			primarySwatch();
			setState(768);
			match(T__8);
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(769);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyArgumentsContext extends ParserRuleContext {
		public TerminalNode CENTER_() { return getToken(dartParser.CENTER_, 0); }
		public TerminalNode PADDING_() { return getToken(dartParser.PADDING_, 0); }
		public List<WidgetAttributeContext> widgetAttribute() {
			return getRuleContexts(WidgetAttributeContext.class);
		}
		public WidgetAttributeContext widgetAttribute(int i) {
			return getRuleContext(WidgetAttributeContext.class,i);
		}
		public BodyArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterBodyArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitBodyArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitBodyArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyArgumentsContext bodyArguments() throws RecognitionException {
		BodyArgumentsContext _localctx = new BodyArgumentsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_bodyArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_la = _input.LA(1);
			if ( !(_la==CENTER_ || _la==PADDING_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(773);
			match(T__7);
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28 || _la==T__29 || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHILD_ - 69)) | (1L << (CHILDREN_ - 69)) | (1L << (ONTAP_ - 69)) | (1L << (ONPRESSED_ - 69)) | (1L << (COLOR_ - 69)) | (1L << (HIGHT_ - 69)) | (1L << (WIDTH_ - 69)) | (1L << (PADDING_ - 69)) | (1L << (MARGIN_ - 69)) | (1L << (TITLE_ - 69)) | (1L << (THEME_ - 69)) | (1L << (HOME_ - 69)) | (1L << (ACTIONS_ - 69)) | (1L << (CONTENT_ - 69)) | (1L << (APPBAR_ - 69)) | (1L << (MAINAXISALIGNMENT_ - 69)))) != 0)) {
				{
				setState(774);
				widgetAttribute();
				setState(779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(775);
						match(T__0);
						setState(776);
						widgetAttribute();
						}
						} 
					}
					setState(781);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				}
			}

			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(784);
				match(T__0);
				}
			}

			setState(787);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnPressedContext extends ParserRuleContext {
		public TerminalNode ONPRESSED_() { return getToken(dartParser.ONPRESSED_, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NavigatorContext navigator() {
			return getRuleContext(NavigatorContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Class_callContext class_call() {
			return getRuleContext(Class_callContext.class,0);
		}
		public OnPressedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onPressed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterOnPressed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitOnPressed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitOnPressed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnPressedContext onPressed() throws RecognitionException {
		OnPressedContext _localctx = new OnPressedContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_onPressed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(ONPRESSED_);
			setState(790);
			match(T__9);
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(791);
				match(T__7);
				setState(792);
				match(T__8);
				setState(793);
				match(T__2);
				setState(797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(794);
					navigator();
					}
					break;
				case 2:
					{
					setState(795);
					statement();
					}
					break;
				case 3:
					{
					setState(796);
					class_call();
					}
					break;
				}
				setState(799);
				match(T__3);
				}
				break;
			case 2:
				{
				setState(801);
				expression(0);
				}
				break;
			}
			setState(805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(804);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainAxisAlignmentContext extends ParserRuleContext {
		public List<TerminalNode> MAINAXISALIGNMENT_() { return getTokens(dartParser.MAINAXISALIGNMENT_); }
		public TerminalNode MAINAXISALIGNMENT_(int i) {
			return getToken(dartParser.MAINAXISALIGNMENT_, i);
		}
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode CENTER_() { return getToken(dartParser.CENTER_, 0); }
		public MainAxisAlignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainAxisAlignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterMainAxisAlignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitMainAxisAlignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitMainAxisAlignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainAxisAlignmentContext mainAxisAlignment() throws RecognitionException {
		MainAxisAlignmentContext _localctx = new MainAxisAlignmentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_mainAxisAlignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(MAINAXISALIGNMENT_);
			setState(808);
			match(T__9);
			setState(809);
			match(MAINAXISALIGNMENT_);
			setState(810);
			match(DOT);
			setState(811);
			match(CENTER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildContext extends ParserRuleContext {
		public TerminalNode CHILD_() { return getToken(dartParser.CHILD_, 0); }
		public Class_callContext class_call() {
			return getRuleContext(Class_callContext.class,0);
		}
		public ChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_child; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildContext child() throws RecognitionException {
		ChildContext _localctx = new ChildContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_child);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(CHILD_);
			setState(814);
			class_call();
			setState(816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(815);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildrenContext extends ParserRuleContext {
		public TerminalNode CHILDREN_() { return getToken(dartParser.CHILDREN_, 0); }
		public List<Class_callContext> class_call() {
			return getRuleContexts(Class_callContext.class);
		}
		public Class_callContext class_call(int i) {
			return getRuleContext(Class_callContext.class,i);
		}
		public ChildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_children; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitChildren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildrenContext children() throws RecognitionException {
		ChildrenContext _localctx = new ChildrenContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_children);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(CHILDREN_);
			setState(834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__40:
			case GESTUREDETECTOR_:
			case CARD_:
			case CENTER_:
			case COLUMN_:
			case ROW_:
			case MaterialApp_:
			case LISTVIEW_:
			case IMAGE_:
			case NETWORKIMAGE_:
			case CONTAINER_:
			case CONST_:
			case TEXTBUTTON_:
			case ALERTDIALOG_:
			case SCAFFOLD_:
			case SIZEDBOX_:
			case ELEVATEDBUTTON_:
			case IDENTIFIER:
				{
				setState(819);
				class_call();
				}
				break;
			case T__31:
				{
				{
				setState(820);
				match(T__31);
				setState(821);
				class_call();
				setState(826);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(822);
						match(T__0);
						setState(823);
						class_call();
						}
						} 
					}
					setState(828);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(829);
					match(T__0);
					}
				}

				setState(832);
				match(T__32);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(836);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OntapContext extends ParserRuleContext {
		public List<TerminalNode> ONTAP_() { return getTokens(dartParser.ONTAP_); }
		public TerminalNode ONTAP_(int i) {
			return getToken(dartParser.ONTAP_, i);
		}
		public OntapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ontap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterOntap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitOntap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitOntap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OntapContext ontap() throws RecognitionException {
		OntapContext _localctx = new OntapContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ontap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(ONTAP_);
			setState(840);
			match(T__9);
			setState(841);
			match(ONTAP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR_() { return getToken(dartParser.COLOR_, 0); }
		public TerminalNode HEX_COLOR() { return getToken(dartParser.HEX_COLOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BoxcolorContext boxcolor() {
			return getRuleContext(BoxcolorContext.class,0);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(COLOR_);
			setState(847);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEX_COLOR:
				{
				setState(844);
				match(HEX_COLOR);
				}
				break;
			case T__2:
			case T__7:
			case T__36:
			case T__37:
			case T__49:
			case NEW_:
			case NULL:
			case TRUE:
			case FALSE:
			case STRING_LITERAL:
			case NUMBER:
			case IDENTIFIER:
				{
				setState(845);
				expression(0);
				}
				break;
			case T__17:
				{
				setState(846);
				boxcolor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoxcolorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BoxcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterBoxcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitBoxcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitBoxcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxcolorContext boxcolor() throws RecognitionException {
		BoxcolorContext _localctx = new BoxcolorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_boxcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(T__17);
			setState(850);
			match(T__33);
			setState(851);
			match(IDENTIFIER);
			setState(852);
			match(DOT);
			setState(853);
			expression(0);
			setState(854);
			match(T__34);
			setState(855);
			match(T__35);
			setState(856);
			match(T__36);
			setState(857);
			match(T__9);
			setState(858);
			match(T__35);
			setState(859);
			match(T__37);
			setState(861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(860);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HightContext extends ParserRuleContext {
		public TerminalNode HIGHT_() { return getToken(dartParser.HIGHT_, 0); }
		public TerminalNode NUMBER() { return getToken(dartParser.NUMBER, 0); }
		public HightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterHight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitHight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitHight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HightContext hight() throws RecognitionException {
		HightContext _localctx = new HightContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_hight);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(HIGHT_);
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(864);
				match(T__9);
				}
			}

			setState(867);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidthContext extends ParserRuleContext {
		public TerminalNode WIDTH_() { return getToken(dartParser.WIDTH_, 0); }
		public TerminalNode NUMBER() { return getToken(dartParser.NUMBER, 0); }
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(WIDTH_);
			setState(870);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PaddingContext extends ParserRuleContext {
		public TerminalNode PADDING_() { return getToken(dartParser.PADDING_, 0); }
		public TerminalNode EDGEINSET_() { return getToken(dartParser.EDGEINSET_, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode ALL_() { return getToken(dartParser.ALL_, 0); }
		public TerminalNode NUMBER() { return getToken(dartParser.NUMBER, 0); }
		public TerminalNode CENTER_() { return getToken(dartParser.CENTER_, 0); }
		public PaddingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterPadding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitPadding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitPadding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaddingContext padding() throws RecognitionException {
		PaddingContext _localctx = new PaddingContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_padding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(PADDING_);
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(873);
				match(T__9);
				}
			}

			setState(876);
			match(EDGEINSET_);
			setState(877);
			match(DOT);
			setState(883);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL_:
				{
				setState(878);
				match(ALL_);
				setState(879);
				match(T__7);
				setState(880);
				match(NUMBER);
				setState(881);
				match(T__8);
				}
				break;
			case CENTER_:
				{
				setState(882);
				match(CENTER_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(885);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarginContext extends ParserRuleContext {
		public TerminalNode MARGIN_() { return getToken(dartParser.MARGIN_, 0); }
		public TerminalNode EDGEINSET_() { return getToken(dartParser.EDGEINSET_, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode ALL_() { return getToken(dartParser.ALL_, 0); }
		public TerminalNode NUMBER() { return getToken(dartParser.NUMBER, 0); }
		public TerminalNode CENTER_() { return getToken(dartParser.CENTER_, 0); }
		public MarginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_margin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterMargin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitMargin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitMargin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarginContext margin() throws RecognitionException {
		MarginContext _localctx = new MarginContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_margin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(MARGIN_);
			setState(889);
			match(EDGEINSET_);
			setState(890);
			match(DOT);
			setState(896);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL_:
				{
				setState(891);
				match(ALL_);
				setState(892);
				match(T__7);
				setState(893);
				match(NUMBER);
				setState(894);
				match(T__8);
				}
				break;
			case CENTER_:
				{
				setState(895);
				match(CENTER_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TITLE_() { return getToken(dartParser.TITLE_, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(dartParser.STRING_LITERAL, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(TITLE_);
			setState(899);
			match(T__9);
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				{
				setState(900);
				match(STRING_LITERAL);
				}
				break;
			case T__24:
			case T__25:
				{
				setState(901);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(902);
				match(T__7);
				setState(903);
				match(STRING_LITERAL);
				setState(904);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(907);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public TerminalNode CONTENT_() { return getToken(dartParser.CONTENT_, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(dartParser.STRING_LITERAL, 0); }
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(CONTENT_);
			setState(911);
			match(T__9);
			setState(912);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(913);
			match(T__7);
			setState(914);
			match(STRING_LITERAL);
			setState(915);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThemeContext extends ParserRuleContext {
		public TerminalNode THEME_() { return getToken(dartParser.THEME_, 0); }
		public TerminalNode THEMEDATA_() { return getToken(dartParser.THEMEDATA_, 0); }
		public PrimarySwatchContext primarySwatch() {
			return getRuleContext(PrimarySwatchContext.class,0);
		}
		public ThemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterTheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitTheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitTheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThemeContext theme() throws RecognitionException {
		ThemeContext _localctx = new ThemeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_theme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			match(THEME_);
			setState(918);
			match(T__9);
			setState(919);
			match(THEMEDATA_);
			setState(920);
			match(T__7);
			setState(921);
			primarySwatch();
			setState(922);
			match(T__8);
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(923);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimarySwatchContext extends ParserRuleContext {
		public TerminalNode HEX_COLOR() { return getToken(dartParser.HEX_COLOR, 0); }
		public PrimarySwatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primarySwatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterPrimarySwatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitPrimarySwatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitPrimarySwatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimarySwatchContext primarySwatch() throws RecognitionException {
		PrimarySwatchContext _localctx = new PrimarySwatchContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_primarySwatch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__39) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(927);
			match(T__9);
			setState(928);
			match(T__35);
			setState(931);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEX_COLOR:
				{
				setState(929);
				match(HEX_COLOR);
				}
				break;
			case T__36:
			case T__37:
				{
				setState(930);
				_la = _input.LA(1);
				if ( !(_la==T__36 || _la==T__37) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(933);
				match(T__0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HomeContext extends ParserRuleContext {
		public TerminalNode HOME_() { return getToken(dartParser.HOME_, 0); }
		public BlocProviderStatementContext blocProviderStatement() {
			return getRuleContext(BlocProviderStatementContext.class,0);
		}
		public HomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterHome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitHome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitHome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HomeContext home() throws RecognitionException {
		HomeContext _localctx = new HomeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_home);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(HOME_);
			setState(937);
			match(T__9);
			setState(938);
			blocProviderStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionsContext extends ParserRuleContext {
		public TerminalNode ACTIONS_() { return getToken(dartParser.ACTIONS_, 0); }
		public List<Class_callContext> class_call() {
			return getRuleContexts(Class_callContext.class);
		}
		public Class_callContext class_call(int i) {
			return getRuleContext(Class_callContext.class,i);
		}
		public ActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitActions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionsContext actions() throws RecognitionException {
		ActionsContext _localctx = new ActionsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_actions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(ACTIONS_);
			setState(941);
			match(T__9);
			setState(955);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__40:
			case GESTUREDETECTOR_:
			case CARD_:
			case CENTER_:
			case COLUMN_:
			case ROW_:
			case MaterialApp_:
			case LISTVIEW_:
			case IMAGE_:
			case NETWORKIMAGE_:
			case CONTAINER_:
			case CONST_:
			case TEXTBUTTON_:
			case ALERTDIALOG_:
			case SCAFFOLD_:
			case SIZEDBOX_:
			case ELEVATEDBUTTON_:
			case IDENTIFIER:
				{
				setState(942);
				class_call();
				}
				break;
			case T__31:
				{
				setState(943);
				match(T__31);
				setState(944);
				class_call();
				setState(949);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(945);
						match(T__0);
						setState(946);
						class_call();
						}
						} 
					}
					setState(951);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				setState(952);
				match(T__0);
				setState(953);
				match(T__32);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(957);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocProviderStatementContext extends ParserRuleContext {
		public BlocProviderArgumentsContext blocProviderArguments() {
			return getRuleContext(BlocProviderArgumentsContext.class,0);
		}
		public BlocTypeContext blocType() {
			return getRuleContext(BlocTypeContext.class,0);
		}
		public BlocProviderStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocProviderStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterBlocProviderStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitBlocProviderStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitBlocProviderStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocProviderStatementContext blocProviderStatement() throws RecognitionException {
		BlocProviderStatementContext _localctx = new BlocProviderStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_blocProviderStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(T__40);
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(961);
				match(T__5);
				setState(962);
				blocType();
				setState(963);
				match(T__6);
				}
			}

			setState(967);
			match(T__7);
			setState(968);
			blocProviderArguments();
			setState(969);
			match(T__8);
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(970);
				match(T__0);
				}
				break;
			}
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(973);
				match(T__1);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocTypeContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public BlocTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterBlocType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitBlocType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitBlocType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocTypeContext blocType() throws RecognitionException {
		BlocTypeContext _localctx = new BlocTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_blocType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			className();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocProviderArgumentsContext extends ParserRuleContext {
		public CreateStatementContext createStatement() {
			return getRuleContext(CreateStatementContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public BlocProviderArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocProviderArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterBlocProviderArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitBlocProviderArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitBlocProviderArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocProviderArgumentsContext blocProviderArguments() throws RecognitionException {
		BlocProviderArgumentsContext _localctx = new BlocProviderArgumentsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_blocProviderArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(T__41);
			setState(979);
			match(T__9);
			setState(980);
			createStatement();
			setState(981);
			match(T__0);
			setState(982);
			child();
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(983);
				match(T__0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateStatementContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode CONTEXT_() { return getToken(dartParser.CONTEXT_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public CreateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterCreateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitCreateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitCreateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStatementContext createStatement() throws RecognitionException {
		CreateStatementContext _localctx = new CreateStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_createStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(T__7);
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTEXT_ || _la==IDENTIFIER) {
				{
				setState(987);
				_la = _input.LA(1);
				if ( !(_la==CONTEXT_ || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(990);
			match(T__8);
			setState(991);
			match(T__15);
			setState(992);
			className();
			setState(993);
			match(T__7);
			setState(994);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NavigatorContext extends ParserRuleContext {
		public NavigatortypeContext navigatortype() {
			return getRuleContext(NavigatortypeContext.class,0);
		}
		public NavigatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterNavigator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitNavigator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitNavigator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigatorContext navigator() throws RecognitionException {
		NavigatorContext _localctx = new NavigatorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_navigator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			navigatortype();
			setState(997);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NavigatortypeContext extends ParserRuleContext {
		public NavigatorPopContext navigatorPop() {
			return getRuleContext(NavigatorPopContext.class,0);
		}
		public NavigatorPushContext navigatorPush() {
			return getRuleContext(NavigatorPushContext.class,0);
		}
		public NavigatorPushReplacementContext navigatorPushReplacement() {
			return getRuleContext(NavigatorPushReplacementContext.class,0);
		}
		public NavigatortypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigatortype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterNavigatortype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitNavigatortype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitNavigatortype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigatortypeContext navigatortype() throws RecognitionException {
		NavigatortypeContext _localctx = new NavigatortypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_navigatortype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(999);
				navigatorPop();
				}
				break;
			case 2:
				{
				setState(1000);
				navigatorPush();
				}
				break;
			case 3:
				{
				setState(1001);
				navigatorPushReplacement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NavigatorPopContext extends ParserRuleContext {
		public TerminalNode NAVIGATOR_() { return getToken(dartParser.NAVIGATOR_, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode CONTEXT_() { return getToken(dartParser.CONTEXT_, 0); }
		public NavigatorPopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigatorPop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterNavigatorPop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitNavigatorPop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitNavigatorPop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigatorPopContext navigatorPop() throws RecognitionException {
		NavigatorPopContext _localctx = new NavigatorPopContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_navigatorPop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(NAVIGATOR_);
			setState(1005);
			match(DOT);
			setState(1006);
			match(T__42);
			setState(1007);
			match(T__7);
			setState(1008);
			match(CONTEXT_);
			setState(1009);
			match(T__8);
			setState(1010);
			match(T__43);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NavigatorPushContext extends ParserRuleContext {
		public TerminalNode NAVIGATOR_() { return getToken(dartParser.NAVIGATOR_, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode PUSH_() { return getToken(dartParser.PUSH_, 0); }
		public TerminalNode CONTEXT_() { return getToken(dartParser.CONTEXT_, 0); }
		public MaterialPageRouteContext materialPageRoute() {
			return getRuleContext(MaterialPageRouteContext.class,0);
		}
		public NavigatorPushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigatorPush; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterNavigatorPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitNavigatorPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitNavigatorPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigatorPushContext navigatorPush() throws RecognitionException {
		NavigatorPushContext _localctx = new NavigatorPushContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_navigatorPush);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(NAVIGATOR_);
			setState(1013);
			match(DOT);
			setState(1014);
			match(PUSH_);
			setState(1015);
			match(T__7);
			setState(1016);
			match(CONTEXT_);
			setState(1017);
			match(T__0);
			setState(1018);
			materialPageRoute();
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(1019);
				match(T__0);
				}
			}

			setState(1022);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NavigatorPushReplacementContext extends ParserRuleContext {
		public TerminalNode NAVIGATOR_() { return getToken(dartParser.NAVIGATOR_, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode PUSHREPLACEMENT_() { return getToken(dartParser.PUSHREPLACEMENT_, 0); }
		public TerminalNode CONTEXT_() { return getToken(dartParser.CONTEXT_, 0); }
		public MaterialPageRouteContext materialPageRoute() {
			return getRuleContext(MaterialPageRouteContext.class,0);
		}
		public NavigatorPushReplacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigatorPushReplacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterNavigatorPushReplacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitNavigatorPushReplacement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitNavigatorPushReplacement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigatorPushReplacementContext navigatorPushReplacement() throws RecognitionException {
		NavigatorPushReplacementContext _localctx = new NavigatorPushReplacementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_navigatorPushReplacement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			match(NAVIGATOR_);
			setState(1025);
			match(DOT);
			setState(1026);
			match(PUSHREPLACEMENT_);
			setState(1027);
			match(T__7);
			setState(1028);
			match(CONTEXT_);
			setState(1029);
			match(T__0);
			setState(1030);
			materialPageRoute();
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(1031);
				match(T__0);
				}
			}

			setState(1034);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaterialPageRouteContext extends ParserRuleContext {
		public TerminalNode MATERIALPAGEROUTE_() { return getToken(dartParser.MATERIALPAGEROUTE_, 0); }
		public TerminalNode BUILDER_() { return getToken(dartParser.BUILDER_, 0); }
		public TerminalNode CONTEXT_() { return getToken(dartParser.CONTEXT_, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(dartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(dartParser.IDENTIFIER, i);
		}
		public MaterialPageRouteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialPageRoute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterMaterialPageRoute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitMaterialPageRoute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitMaterialPageRoute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterialPageRouteContext materialPageRoute() throws RecognitionException {
		MaterialPageRouteContext _localctx = new MaterialPageRouteContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_materialPageRoute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			match(MATERIALPAGEROUTE_);
			setState(1037);
			match(T__7);
			setState(1038);
			match(BUILDER_);
			setState(1039);
			match(T__9);
			setState(1040);
			match(T__7);
			setState(1041);
			match(CONTEXT_);
			setState(1042);
			match(T__8);
			setState(1043);
			match(T__15);
			setState(1044);
			className();
			setState(1045);
			match(T__7);
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1046);
				match(IDENTIFIER);
				setState(1047);
				match(T__9);
				setState(1048);
				match(IDENTIFIER);
				}
			}

			setState(1051);
			match(T__8);
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(1052);
				match(T__0);
				}
			}

			setState(1055);
			match(T__8);
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1056);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainClassContext extends ParserRuleContext {
		public TerminalNode VOID_() { return getToken(dartParser.VOID_, 0); }
		public TerminalNode MAIN_() { return getToken(dartParser.MAIN_, 0); }
		public RunAppContext runApp() {
			return getRuleContext(RunAppContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_mainClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			match(VOID_);
			setState(1060);
			match(MAIN_);
			setState(1061);
			match(T__7);
			setState(1062);
			match(T__8);
			setState(1063);
			match(T__2);
			setState(1064);
			runApp();
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__48 || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (FINAL_ - 76)) | (1L << (IF_ - 76)) | (1L << (WHILE_ - 76)) | (1L << (PRINT_ - 76)) | (1L << (OVERRIDE_ - 76)) | (1L << (VOID_ - 76)) | (1L << (FLOAT - 76)) | (1L << (INT - 76)) | (1L << (VAR - 76)) | (1L << (BOOLEAN - 76)) | (1L << (SETSTATE_ - 76)) | (1L << (NAVIGATOR_ - 76)) | (1L << (SHOWDIALOG_ - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
				{
				{
				setState(1065);
				statement();
				}
				}
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1071);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RunAppContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public RunAppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runApp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterRunApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitRunApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitRunApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunAppContext runApp() throws RecognitionException {
		RunAppContext _localctx = new RunAppContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_runApp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			match(T__44);
			setState(1074);
			match(T__7);
			setState(1075);
			match(IDENTIFIER);
			setState(1076);
			match(T__7);
			setState(1077);
			match(T__8);
			setState(1078);
			match(T__8);
			setState(1079);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public Class_callContext class_call() {
			return getRuleContext(Class_callContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			match(IDENTIFIER);
			setState(1084);
			match(T__7);
			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1085);
				class_call();
				}
				break;
			case 2:
				{
				setState(1086);
				expression(0);
				}
				break;
			}
			setState(1089);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public WidgetLiteralContext widgetLiteral() {
			return getRuleContext(WidgetLiteralContext.class,0);
		}
		public BlocCallContext blocCall() {
			return getRuleContext(BlocCallContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode CONST_() { return getToken(dartParser.CONST_, 0); }
		public ClassArgumentContext classArgument() {
			return getRuleContext(ClassArgumentContext.class,0);
		}
		public Class_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterClass_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitClass_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitClass_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_callContext class_call() throws RecognitionException {
		Class_callContext _localctx = new Class_callContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_class_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST_) {
					{
					setState(1091);
					match(CONST_);
					}
				}

				setState(1094);
				match(IDENTIFIER);
				setState(1095);
				match(T__7);
				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__36) | (1L << T__37) | (1L << T__49))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (NEW_ - 105)) | (1L << (NULL - 105)) | (1L << (TRUE - 105)) | (1L << (FALSE - 105)) | (1L << (STRING_LITERAL - 105)) | (1L << (NUMBER - 105)) | (1L << (IDENTIFIER - 105)))) != 0)) {
					{
					setState(1096);
					classArgument();
					}
				}

				setState(1099);
				match(T__8);
				}
				break;
			case 2:
				{
				setState(1100);
				widgetLiteral();
				}
				break;
			case 3:
				{
				setState(1101);
				blocCall();
				}
				break;
			case 4:
				{
				setState(1102);
				function_call();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext namedArgument() {
			return getRuleContext(NamedArgumentContext.class,0);
		}
		public RequiredContext required() {
			return getRuleContext(RequiredContext.class,0);
		}
		public ClassArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterClassArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitClassArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitClassArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassArgumentContext classArgument() throws RecognitionException {
		ClassArgumentContext _localctx = new ClassArgumentContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_classArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1105);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1106);
				namedArgument();
				}
				break;
			case 3:
				{
				setState(1107);
				required();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocCallContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public BlocTypeContext blocType() {
			return getRuleContext(BlocTypeContext.class,0);
		}
		public TerminalNode CONTEXT_() { return getToken(dartParser.CONTEXT_, 0); }
		public BlocProviderArgumentsContext blocProviderArguments() {
			return getRuleContext(BlocProviderArgumentsContext.class,0);
		}
		public BlocCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterBlocCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitBlocCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitBlocCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocCallContext blocCall() throws RecognitionException {
		BlocCallContext _localctx = new BlocCallContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_blocCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			match(T__40);
			setState(1111);
			match(DOT);
			setState(1112);
			match(T__42);
			setState(1113);
			match(T__5);
			setState(1114);
			blocType();
			setState(1115);
			match(T__6);
			setState(1116);
			match(T__7);
			setState(1119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTEXT_:
				{
				setState(1117);
				match(CONTEXT_);
				}
				break;
			case T__41:
				{
				setState(1118);
				blocProviderArguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1121);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedArgumentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedArgumentContext namedArgument() throws RecognitionException {
		NamedArgumentContext _localctx = new NamedArgumentContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			match(IDENTIFIER);
			setState(1124);
			match(T__9);
			setState(1125);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiredContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public RequiredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_required; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterRequired(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitRequired(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitRequired(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequiredContext required() throws RecognitionException {
		RequiredContext _localctx = new RequiredContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_required);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			match(T__2);
			setState(1128);
			match(T__45);
			setState(1129);
			match(T__46);
			setState(1130);
			match(DOT);
			setState(1131);
			match(IDENTIFIER);
			setState(1132);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ShowDialogStatementContext showDialogStatement() {
			return getRuleContext(ShowDialogStatementContext.class,0);
		}
		public EnumStatementContext enumStatement() {
			return getRuleContext(EnumStatementContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public MethodcallStatementContext methodcallStatement() {
			return getRuleContext(MethodcallStatementContext.class,0);
		}
		public MethodStatementContext methodStatement() {
			return getRuleContext(MethodStatementContext.class,0);
		}
		public SetStateStatementContext setStateStatement() {
			return getRuleContext(SetStateStatementContext.class,0);
		}
		public NavigatorContext navigator() {
			return getRuleContext(NavigatorContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_statement);
		try {
			setState(1146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1135);
				showDialogStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1136);
				enumStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1137);
				varDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1138);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1139);
				printStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1140);
				varAssignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1141);
				blockStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1142);
				methodcallStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1143);
				methodStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1144);
				setStateStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1145);
				navigator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetStateStatementContext extends ParserRuleContext {
		public TerminalNode SETSTATE_() { return getToken(dartParser.SETSTATE_, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SetStateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterSetStateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitSetStateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitSetStateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStateStatementContext setStateStatement() throws RecognitionException {
		SetStateStatementContext _localctx = new SetStateStatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_setStateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			match(SETSTATE_);
			setState(1149);
			match(T__7);
			setState(1150);
			match(T__7);
			setState(1151);
			match(T__8);
			setState(1152);
			match(T__2);
			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__48 || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (FINAL_ - 76)) | (1L << (IF_ - 76)) | (1L << (WHILE_ - 76)) | (1L << (PRINT_ - 76)) | (1L << (OVERRIDE_ - 76)) | (1L << (VOID_ - 76)) | (1L << (FLOAT - 76)) | (1L << (INT - 76)) | (1L << (VAR - 76)) | (1L << (BOOLEAN - 76)) | (1L << (SETSTATE_ - 76)) | (1L << (NAVIGATOR_ - 76)) | (1L << (SHOWDIALOG_ - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
				{
				{
				setState(1153);
				statement();
				}
				}
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1159);
			match(T__3);
			setState(1160);
			match(T__8);
			setState(1161);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodStatementContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(dartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(dartParser.IDENTIFIER, i);
		}
		public TerminalNode OVERRIDE_() { return getToken(dartParser.OVERRIDE_, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterMethodStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitMethodStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitMethodStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodStatementContext methodStatement() throws RecognitionException {
		MethodStatementContext _localctx = new MethodStatementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_methodStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE_) {
				{
				setState(1163);
				match(OVERRIDE_);
				}
			}

			setState(1166);
			type();
			setState(1167);
			match(IDENTIFIER);
			setState(1168);
			match(T__7);
			setState(1180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (FINAL_ - 76)) | (1L << (VOID_ - 76)) | (1L << (FLOAT - 76)) | (1L << (INT - 76)) | (1L << (VAR - 76)) | (1L << (BOOLEAN - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
				{
				setState(1169);
				type();
				setState(1170);
				match(IDENTIFIER);
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(1171);
					match(T__0);
					setState(1172);
					type();
					setState(1173);
					match(IDENTIFIER);
					}
					}
					setState(1179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1182);
			match(T__8);
			setState(1183);
			match(T__2);
			setState(1187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__48 || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (FINAL_ - 76)) | (1L << (IF_ - 76)) | (1L << (WHILE_ - 76)) | (1L << (PRINT_ - 76)) | (1L << (OVERRIDE_ - 76)) | (1L << (VOID_ - 76)) | (1L << (FLOAT - 76)) | (1L << (INT - 76)) | (1L << (VAR - 76)) | (1L << (BOOLEAN - 76)) | (1L << (SETSTATE_ - 76)) | (1L << (NAVIGATOR_ - 76)) | (1L << (SHOWDIALOG_ - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
				{
				{
				setState(1184);
				statement();
				}
				}
				setState(1189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1190);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowDialogStatementContext extends ParserRuleContext {
		public TerminalNode SHOWDIALOG_() { return getToken(dartParser.SHOWDIALOG_, 0); }
		public ShowDialogProperitiesContext showDialogProperities() {
			return getRuleContext(ShowDialogProperitiesContext.class,0);
		}
		public ShowDialogStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDialogStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterShowDialogStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitShowDialogStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitShowDialogStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowDialogStatementContext showDialogStatement() throws RecognitionException {
		ShowDialogStatementContext _localctx = new ShowDialogStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_showDialogStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(SHOWDIALOG_);
			setState(1193);
			match(T__7);
			setState(1194);
			showDialogProperities();
			setState(1196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(1195);
				match(T__0);
				}
			}

			setState(1198);
			match(T__8);
			setState(1199);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowDialogProperitiesContext extends ParserRuleContext {
		public List<TerminalNode> CONTEXT_() { return getTokens(dartParser.CONTEXT_); }
		public TerminalNode CONTEXT_(int i) {
			return getToken(dartParser.CONTEXT_, i);
		}
		public ShowDialogBuilderContext showDialogBuilder() {
			return getRuleContext(ShowDialogBuilderContext.class,0);
		}
		public ShowDialogProperitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDialogProperities; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterShowDialogProperities(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitShowDialogProperities(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitShowDialogProperities(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowDialogProperitiesContext showDialogProperities() throws RecognitionException {
		ShowDialogProperitiesContext _localctx = new ShowDialogProperitiesContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_showDialogProperities);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			match(CONTEXT_);
			setState(1202);
			match(T__9);
			setState(1203);
			match(CONTEXT_);
			setState(1204);
			match(T__0);
			setState(1205);
			showDialogBuilder();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowDialogBuilderContext extends ParserRuleContext {
		public TerminalNode BUILDER_() { return getToken(dartParser.BUILDER_, 0); }
		public TerminalNode BUILDCONTEXT_() { return getToken(dartParser.BUILDCONTEXT_, 0); }
		public TerminalNode CONTEXT_() { return getToken(dartParser.CONTEXT_, 0); }
		public TerminalNode RETURN_() { return getToken(dartParser.RETURN_, 0); }
		public WidgetLiteralContext widgetLiteral() {
			return getRuleContext(WidgetLiteralContext.class,0);
		}
		public ShowDialogBuilderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDialogBuilder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterShowDialogBuilder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitShowDialogBuilder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitShowDialogBuilder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowDialogBuilderContext showDialogBuilder() throws RecognitionException {
		ShowDialogBuilderContext _localctx = new ShowDialogBuilderContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_showDialogBuilder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(BUILDER_);
			setState(1208);
			match(T__9);
			setState(1209);
			match(T__7);
			setState(1210);
			match(BUILDCONTEXT_);
			setState(1211);
			match(CONTEXT_);
			setState(1212);
			match(T__8);
			setState(1213);
			match(T__2);
			setState(1214);
			match(RETURN_);
			setState(1215);
			widgetLiteral();
			setState(1216);
			match(T__1);
			setState(1217);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodcallStatementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(dartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(dartParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public MethodcallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodcallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterMethodcallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitMethodcallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitMethodcallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodcallStatementContext methodcallStatement() throws RecognitionException {
		MethodcallStatementContext _localctx = new MethodcallStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_methodcallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(IDENTIFIER);
			setState(1220);
			match(DOT);
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1221);
				function_call();
				}
				break;
			case 2:
				{
				setState(1222);
				match(IDENTIFIER);
				}
				break;
			}
			setState(1225);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			match(T__2);
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__48 || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (FINAL_ - 76)) | (1L << (IF_ - 76)) | (1L << (WHILE_ - 76)) | (1L << (PRINT_ - 76)) | (1L << (OVERRIDE_ - 76)) | (1L << (VOID_ - 76)) | (1L << (FLOAT - 76)) | (1L << (INT - 76)) | (1L << (VAR - 76)) | (1L << (BOOLEAN - 76)) | (1L << (SETSTATE_ - 76)) | (1L << (NAVIGATOR_ - 76)) | (1L << (SHOWDIALOG_ - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
				{
				{
				setState(1228);
				statement();
				}
				}
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1234);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode FINAL_() { return getToken(dartParser.FINAL_, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Class_callContext class_call() {
			return getRuleContext(Class_callContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1236);
				match(FINAL_);
				}
				break;
			}
			setState(1239);
			type();
			setState(1240);
			match(IDENTIFIER);
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__47) {
				{
				setState(1241);
				match(T__47);
				setState(1244);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1242);
					expression(0);
					}
					break;
				case 2:
					{
					setState(1243);
					class_call();
					}
					break;
				}
				}
			}

			setState(1248);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF_() { return getToken(dartParser.IF_, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseCondContext elseCond() {
			return getRuleContext(ElseCondContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			match(IF_);
			setState(1251);
			match(T__7);
			setState(1252);
			expression(0);
			setState(1253);
			match(T__8);
			setState(1254);
			statement();
			setState(1256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1255);
				elseCond();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseCondContext extends ParserRuleContext {
		public TerminalNode ELSE_() { return getToken(dartParser.ELSE_, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterElseCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitElseCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitElseCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseCondContext elseCond() throws RecognitionException {
		ElseCondContext _localctx = new ElseCondContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_elseCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			match(ELSE_);
			setState(1259);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE_() { return getToken(dartParser.WHILE_, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_whileStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			match(WHILE_);
			setState(1262);
			match(T__7);
			setState(1263);
			expression(0);
			setState(1264);
			match(T__8);
			setState(1268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1265);
					statement();
					}
					} 
				}
				setState(1270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT_() { return getToken(dartParser.PRINT_, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			match(PRINT_);
			setState(1272);
			match(T__7);
			setState(1273);
			expression(0);
			setState(1274);
			match(T__8);
			setState(1275);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_varAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			match(IDENTIFIER);
			setState(1278);
			match(T__47);
			setState(1279);
			expression(0);
			setState(1280);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public EnumStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterEnumStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitEnumStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitEnumStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumStatementContext enumStatement() throws RecognitionException {
		EnumStatementContext _localctx = new EnumStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_enumStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			match(T__48);
			setState(1283);
			match(IDENTIFIER);
			setState(1284);
			match(T__2);
			setState(1285);
			constant();
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(1286);
				match(T__0);
				setState(1287);
				constant();
				}
				}
				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1293);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IndexArrayContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IndexArrayContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterIndexArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitIndexArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitIndexArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldAccessContext extends ExpressionContext {
		public ObjectAccessContext objectAccess() {
			return getRuleContext(ObjectAccessContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FieldAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantValContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantValContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterConstantVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitConstantVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitConstantVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewArrayContext extends ExpressionContext {
		public TerminalNode NEW_() { return getToken(dartParser.NEW_, 0); }
		public TerminalNode INT() { return getToken(dartParser.INT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NewArrayContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitNewArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropertyAccessContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public PropertyAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterPropertyAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitPropertyAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitPropertyAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotequalContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotequalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterNotequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitNotequal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitNotequal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewClassContext extends ExpressionContext {
		public TerminalNode NEW_() { return getToken(dartParser.NEW_, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public NewClassContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterNewClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitNewClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitNewClass(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdCallContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public IdCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterIdCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitIdCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitIdCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplicationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBlockContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprBlockContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterExprBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitExprBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitExprBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitTernary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitTernary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AdditionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MethodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 186;
		enterRecursionRule(_localctx, 186, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1296);
				match(T__7);
				setState(1297);
				expression(0);
				setState(1298);
				match(T__8);
				}
				break;
			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1300);
				match(T__49);
				setState(1301);
				expression(17);
				}
				break;
			case 3:
				{
				_localctx = new ConstantValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1302);
				constant();
				}
				break;
			case 4:
				{
				_localctx = new FieldAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1303);
				objectAccess();
				setState(1306);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(1304);
					match(IDENTIFIER);
					}
					break;
				case T__36:
				case T__37:
				case NULL:
				case TRUE:
				case FALSE:
				case STRING_LITERAL:
				case NUMBER:
					{
					setState(1305);
					constant();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				{
				_localctx = new IdCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1308);
				match(IDENTIFIER);
				}
				break;
			case 6:
				{
				_localctx = new NewArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1309);
				match(NEW_);
				setState(1310);
				match(INT);
				setState(1311);
				match(T__31);
				setState(1312);
				expression(0);
				setState(1313);
				match(T__32);
				}
				break;
			case 7:
				{
				_localctx = new NewClassContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1315);
				match(NEW_);
				setState(1316);
				className();
				setState(1317);
				match(T__7);
				setState(1318);
				match(T__8);
				}
				break;
			case 8:
				{
				_localctx = new ExprBlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1320);
				match(T__2);
				setState(1321);
				expression(0);
				setState(1322);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1371);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1326);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1327);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__51) | (1L << T__52))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1328);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1329);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1330);
						_la = _input.LA(1);
						if ( !(_la==T__53 || _la==T__54) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1331);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new LessThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1332);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1333);
						match(T__5);
						setState(1334);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1335);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1336);
						match(T__55);
						setState(1337);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new EqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1338);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1339);
						match(T__33);
						setState(1340);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new NotequalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1341);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1342);
						match(T__56);
						setState(1343);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new TernaryContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1344);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1345);
						match(T__34);
						setState(1346);
						expression(0);
						setState(1347);
						match(T__9);
						setState(1348);
						expression(8);
						}
						break;
					case 8:
						{
						_localctx = new IndexArrayContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1350);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1351);
						match(T__31);
						setState(1352);
						expression(0);
						setState(1353);
						match(T__32);
						}
						break;
					case 9:
						{
						_localctx = new PropertyAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1355);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1356);
						match(DOT);
						setState(1357);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__57 || _la==IDENTIFIER) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 10:
						{
						_localctx = new MethodCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1358);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1359);
						match(T__7);
						setState(1368);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__36) | (1L << T__37) | (1L << T__49))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (NEW_ - 105)) | (1L << (NULL - 105)) | (1L << (TRUE - 105)) | (1L << (FALSE - 105)) | (1L << (STRING_LITERAL - 105)) | (1L << (NUMBER - 105)) | (1L << (IDENTIFIER - 105)))) != 0)) {
							{
							setState(1360);
							expression(0);
							setState(1365);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__0) {
								{
								{
								setState(1361);
								match(T__0);
								setState(1362);
								expression(0);
								}
								}
								setState(1367);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(1370);
						match(T__8);
						}
						break;
					}
					} 
				}
				setState(1375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ObjectAccessContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(dartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(dartParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(dartParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(dartParser.DOT, i);
		}
		public ObjectAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterObjectAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitObjectAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitObjectAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectAccessContext objectAccess() throws RecognitionException {
		ObjectAccessContext _localctx = new ObjectAccessContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_objectAccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1376);
					match(IDENTIFIER);
					setState(1377);
					match(DOT);
					}
					} 
				}
				setState(1382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(dartParser.INT, 0); }
		public TerminalNode VAR() { return getToken(dartParser.VAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(dartParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(dartParser.FLOAT, 0); }
		public TerminalNode VOID_() { return getToken(dartParser.VOID_, 0); }
		public TerminalNode FINAL_() { return getToken(dartParser.FINAL_, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_type);
		try {
			setState(1393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1383);
				match(INT);
				setState(1384);
				match(T__31);
				setState(1385);
				match(T__32);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1386);
				match(VAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1387);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1388);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1389);
				match(FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1390);
				match(VOID_);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1391);
				match(FINAL_);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1392);
				className();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ColorNameContext colorName() {
			return getRuleContext(ColorNameContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(dartParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(dartParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(dartParser.NULL, 0); }
		public TerminalNode NUMBER() { return getToken(dartParser.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(dartParser.STRING_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_constant);
		try {
			setState(1401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(1395);
				colorName();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1396);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1397);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1398);
				match(NULL);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1399);
				match(NUMBER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1400);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorNameContext extends ParserRuleContext {
		public ColorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterColorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitColorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitColorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorNameContext colorName() throws RecognitionException {
		ColorNameContext _localctx = new ColorNameContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_colorName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			_la = _input.LA(1);
			if ( !(_la==T__36 || _la==T__37) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringInterpolationContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(dartParser.STRING_LITERAL, 0); }
		public InterpolationPartContext interpolationPart() {
			return getRuleContext(InterpolationPartContext.class,0);
		}
		public StringInterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringInterpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterStringInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitStringInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitStringInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringInterpolationContext stringInterpolation() throws RecognitionException {
		StringInterpolationContext _localctx = new StringInterpolationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_stringInterpolation);
		try {
			setState(1408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1405);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1406);
				match(STRING_LITERAL);
				setState(1407);
				interpolationPart();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterpolationPartContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public InterpolationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).enterInterpolationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartListener ) ((dartListener)listener).exitInterpolationPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartVisitor ) return ((dartVisitor<? extends T>)visitor).visitInterpolationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationPartContext interpolationPart() throws RecognitionException {
		InterpolationPartContext _localctx = new InterpolationPartContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_interpolationPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			match(T__58);
			setState(1411);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 93:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008f\u0588\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\3\2\3\2\7\2\u00cd\n\2\f\2\16\2\u00d0"+
		"\13\2\3\2\5\2\u00d3\n\2\3\2\3\2\3\2\3\2\3\2\7\2\u00da\n\2\f\2\16\2\u00dd"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u00e5\n\3\f\3\16\3\u00e8\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\7\4\u00f0\n\4\f\4\16\4\u00f3\13\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0100\n\5\f\5\16\5\u0103\13\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u0134\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u013d\n\13\f\13\16\13\u0140\13\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u0156\n\r\f\r\16\r\u0159\13\r\3\r\5\r\u015c\n\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0169\n\16\f\16\16\16\u016c\13"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u017a"+
		"\n\17\f\17\16\17\u017d\13\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u0196\n\20\3\21\3\21\3\21\3\21\3\21\7\21\u019d\n\21\f\21\16\21"+
		"\u01a0\13\21\5\21\u01a2\n\21\3\21\5\21\u01a5\n\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u01ae\n\22\f\22\16\22\u01b1\13\22\5\22\u01b3\n\22"+
		"\3\22\5\22\u01b6\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u01bf\n"+
		"\23\f\23\16\23\u01c2\13\23\5\23\u01c4\n\23\3\23\5\23\u01c7\n\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\7\24\u01d0\n\24\f\24\16\24\u01d3\13\24\5"+
		"\24\u01d5\n\24\3\24\5\24\u01d8\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u01e1\n\25\f\25\16\25\u01e4\13\25\5\25\u01e6\n\25\3\25\5\25\u01e9"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u01f2\n\26\f\26\16\26\u01f5"+
		"\13\26\5\26\u01f7\n\26\3\26\5\26\u01fa\n\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u020c\n\27"+
		"\3\27\3\27\5\27\u0210\n\27\3\27\3\27\3\27\5\27\u0215\n\27\3\27\5\27\u0218"+
		"\n\27\3\27\3\27\5\27\u021c\n\27\3\30\3\30\3\30\7\30\u0221\n\30\f\30\16"+
		"\30\u0224\13\30\3\30\5\30\u0227\n\30\3\30\3\30\3\31\3\31\3\31\5\31\u022e"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\7\32\u0235\n\32\f\32\16\32\u0238\13\32"+
		"\5\32\u023a\n\32\3\32\5\32\u023d\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u0249\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\7\34\u0252\n\34\f\34\16\34\u0255\13\34\5\34\u0257\n\34\3\34\5\34\u025a"+
		"\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\7\35\u0263\n\35\f\35\16\35\u0266"+
		"\13\35\5\35\u0268\n\35\3\35\5\35\u026b\n\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\7\36\u0274\n\36\f\36\16\36\u0277\13\36\3\36\3\36\5\36\u027b\n"+
		"\36\3\36\5\36\u027e\n\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\7\37\u0287"+
		"\n\37\f\37\16\37\u028a\13\37\5\37\u028c\n\37\3\37\5\37\u028f\n\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u029b\n \3!\3!\3!\3!\5!\u02a1\n!\3!\3"+
		"!\5!\u02a5\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u02ae\n\"\3\"\3\"\5\"\u02b2"+
		"\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u02be\n#\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\5$\u02cd\n$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02eb"+
		"\n\'\3(\3(\3(\3(\3(\3(\3(\5(\u02f4\n(\3)\3)\3)\3)\5)\u02fa\n)\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\5*\u0305\n*\3+\3+\3+\3+\3+\7+\u030c\n+\f+\16+\u030f"+
		"\13+\5+\u0311\n+\3+\5+\u0314\n+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0320"+
		"\n,\3,\3,\3,\5,\u0325\n,\3,\5,\u0328\n,\3-\3-\3-\3-\3-\3-\3.\3.\3.\5."+
		"\u0333\n.\3/\3/\3/\3/\3/\3/\7/\u033b\n/\f/\16/\u033e\13/\3/\5/\u0341\n"+
		"/\3/\3/\5/\u0345\n/\3/\5/\u0348\n/\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\5\61\u0352\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\5\62\u0360\n\62\3\63\3\63\5\63\u0364\n\63\3\63\3\63\3\64\3"+
		"\64\3\64\3\65\3\65\5\65\u036d\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u0376\n\65\3\65\5\65\u0379\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\5\66\u0383\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u038c"+
		"\n\67\3\67\5\67\u038f\n\67\38\38\38\38\38\38\38\39\39\39\39\39\39\39\5"+
		"9\u039f\n9\3:\3:\3:\3:\3:\5:\u03a6\n:\3:\5:\u03a9\n:\3;\3;\3;\3;\3<\3"+
		"<\3<\3<\3<\3<\3<\7<\u03b6\n<\f<\16<\u03b9\13<\3<\3<\3<\5<\u03be\n<\3<"+
		"\5<\u03c1\n<\3=\3=\3=\3=\3=\5=\u03c8\n=\3=\3=\3=\3=\5=\u03ce\n=\3=\5="+
		"\u03d1\n=\3>\3>\3?\3?\3?\3?\3?\3?\5?\u03db\n?\3@\3@\5@\u03df\n@\3@\3@"+
		"\3@\3@\3@\3@\3A\3A\3A\3B\3B\3B\5B\u03ed\nB\3C\3C\3C\3C\3C\3C\3C\3C\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\5D\u03ff\nD\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\5E\u040b"+
		"\nE\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u041c\nF\3F\3F\5F"+
		"\u0420\nF\3F\3F\5F\u0424\nF\3G\3G\3G\3G\3G\3G\3G\7G\u042d\nG\fG\16G\u0430"+
		"\13G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3J\3J\3J\3J\5J\u0442\nJ\3J\3"+
		"J\3K\5K\u0447\nK\3K\3K\3K\5K\u044c\nK\3K\3K\3K\3K\5K\u0452\nK\3L\3L\3"+
		"L\5L\u0457\nL\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0462\nM\3M\3M\3N\3N\3N\3"+
		"N\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u047d\n"+
		"P\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u0485\nQ\fQ\16Q\u0488\13Q\3Q\3Q\3Q\3Q\3R\5R\u048f"+
		"\nR\3R\3R\3R\3R\3R\3R\3R\3R\3R\7R\u049a\nR\fR\16R\u049d\13R\5R\u049f\n"+
		"R\3R\3R\3R\7R\u04a4\nR\fR\16R\u04a7\13R\3R\3R\3S\3S\3S\3S\5S\u04af\nS"+
		"\3S\3S\3S\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3V\3V"+
		"\3V\3V\5V\u04ca\nV\3V\3V\3W\3W\7W\u04d0\nW\fW\16W\u04d3\13W\3W\3W\3X\5"+
		"X\u04d8\nX\3X\3X\3X\3X\3X\5X\u04df\nX\5X\u04e1\nX\3X\3X\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\5Y\u04eb\nY\3Z\3Z\3Z\3[\3[\3[\3[\3[\7[\u04f5\n[\f[\16[\u04f8\13["+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\7^\u050b\n^"+
		"\f^\16^\u050e\13^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u051d\n_\3"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u052f\n_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\7_\u0556\n_\f_\16_\u0559\13_\5_\u055b"+
		"\n_\3_\7_\u055e\n_\f_\16_\u0561\13_\3`\3`\7`\u0565\n`\f`\16`\u0568\13"+
		"`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u0574\na\3b\3b\3b\3b\3b\3b\5b\u057c"+
		"\nb\3c\3c\3d\3d\3d\5d\u0583\nd\3e\3e\3e\3e\2\3\u00bcf\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\2\13\3\2\23\24\3\2\33\34\4\2JJYY\3\2)*\3\2\'(\4\2F"+
		"F\u008d\u008d\3\2\65\67\3\289\5\2\33\33<<\u008d\u008d\2\u05fc\2\u00ce"+
		"\3\2\2\2\4\u00e0\3\2\2\2\6\u00eb\3\2\2\2\b\u00f6\3\2\2\2\n\u0106\3\2\2"+
		"\2\f\u0113\3\2\2\2\16\u0116\3\2\2\2\20\u0120\3\2\2\2\22\u0133\3\2\2\2"+
		"\24\u0135\3\2\2\2\26\u0143\3\2\2\2\30\u014c\3\2\2\2\32\u015f\3\2\2\2\34"+
		"\u0170\3\2\2\2\36\u0195\3\2\2\2 \u0197\3\2\2\2\"\u01a8\3\2\2\2$\u01b9"+
		"\3\2\2\2&\u01ca\3\2\2\2(\u01db\3\2\2\2*\u01ec\3\2\2\2,\u01fd\3\2\2\2."+
		"\u021d\3\2\2\2\60\u022d\3\2\2\2\62\u022f\3\2\2\2\64\u0240\3\2\2\2\66\u024c"+
		"\3\2\2\28\u025d\3\2\2\2:\u026e\3\2\2\2<\u0281\3\2\2\2>\u029a\3\2\2\2@"+
		"\u029c\3\2\2\2B\u02a6\3\2\2\2D\u02b3\3\2\2\2F\u02bf\3\2\2\2H\u02ce\3\2"+
		"\2\2J\u02d3\3\2\2\2L\u02ea\3\2\2\2N\u02ec\3\2\2\2P\u02f5\3\2\2\2R\u02fb"+
		"\3\2\2\2T\u0306\3\2\2\2V\u0317\3\2\2\2X\u0329\3\2\2\2Z\u032f\3\2\2\2\\"+
		"\u0334\3\2\2\2^\u0349\3\2\2\2`\u034d\3\2\2\2b\u0353\3\2\2\2d\u0361\3\2"+
		"\2\2f\u0367\3\2\2\2h\u036a\3\2\2\2j\u037a\3\2\2\2l\u0384\3\2\2\2n\u0390"+
		"\3\2\2\2p\u0397\3\2\2\2r\u03a0\3\2\2\2t\u03aa\3\2\2\2v\u03ae\3\2\2\2x"+
		"\u03c2\3\2\2\2z\u03d2\3\2\2\2|\u03d4\3\2\2\2~\u03dc\3\2\2\2\u0080\u03e6"+
		"\3\2\2\2\u0082\u03ec\3\2\2\2\u0084\u03ee\3\2\2\2\u0086\u03f6\3\2\2\2\u0088"+
		"\u0402\3\2\2\2\u008a\u040e\3\2\2\2\u008c\u0425\3\2\2\2\u008e\u0433\3\2"+
		"\2\2\u0090\u043b\3\2\2\2\u0092\u043d\3\2\2\2\u0094\u0451\3\2\2\2\u0096"+
		"\u0456\3\2\2\2\u0098\u0458\3\2\2\2\u009a\u0465\3\2\2\2\u009c\u0469\3\2"+
		"\2\2\u009e\u047c\3\2\2\2\u00a0\u047e\3\2\2\2\u00a2\u048e\3\2\2\2\u00a4"+
		"\u04aa\3\2\2\2\u00a6\u04b3\3\2\2\2\u00a8\u04b9\3\2\2\2\u00aa\u04c5\3\2"+
		"\2\2\u00ac\u04cd\3\2\2\2\u00ae\u04d7\3\2\2\2\u00b0\u04e4\3\2\2\2\u00b2"+
		"\u04ec\3\2\2\2\u00b4\u04ef\3\2\2\2\u00b6\u04f9\3\2\2\2\u00b8\u04ff\3\2"+
		"\2\2\u00ba\u0504\3\2\2\2\u00bc\u052e\3\2\2\2\u00be\u0566\3\2\2\2\u00c0"+
		"\u0573\3\2\2\2\u00c2\u057b\3\2\2\2\u00c4\u057d\3\2\2\2\u00c6\u0582\3\2"+
		"\2\2\u00c8\u0584\3\2\2\2\u00ca\u00cd\5\4\3\2\u00cb\u00cd\5\6\4\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d3\5\u008cG\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00db"+
		"\3\2\2\2\u00d4\u00da\5\22\n\2\u00d5\u00da\5\n\6\2\u00d6\u00da\5\30\r\2"+
		"\u00d7\u00da\5\b\5\2\u00d8\u00da\5\u009eP\2\u00d9\u00d4\3\2\2\2\u00d9"+
		"\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2"+
		"\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\2\2\3\u00df\3\3\2\2\2"+
		"\u00e0\u00e1\7>\2\2\u00e1\u00e6\7\u008a\2\2\u00e2\u00e3\7\3\2\2\u00e3"+
		"\u00e5\7\u008a\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ea\7\4\2\2\u00ea\5\3\2\2\2\u00eb\u00ec\7?\2\2\u00ec\u00f1\7\u008a"+
		"\2\2\u00ed\u00ee\7\3\2\2\u00ee\u00f0\7\u008a\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\4\2\2\u00f5\7\3\2\2\2\u00f6\u00f7"+
		"\7m\2\2\u00f7\u00f8\7\u008d\2\2\u00f8\u00f9\7i\2\2\u00f9\u00fa\7\u0089"+
		"\2\2\u00fa\u0101\7\5\2\2\u00fb\u00fc\5\u0094K\2\u00fc\u00fd\7\4\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u0100\5\u009eP\2\u00ff\u00fb\3\2\2\2\u00ff\u00fe"+
		"\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\6\2\2\u0105\t\3\2\2\2"+
		"\u0106\u0107\7m\2\2\u0107\u0108\7\u008d\2\2\u0108\u0109\7i\2\2\u0109\u010a"+
		"\7\7\2\2\u010a\u010b\7\b\2\2\u010b\u010c\5z>\2\u010c\u010d\7\3\2\2\u010d"+
		"\u010e\5z>\2\u010e\u010f\7\t\2\2\u010f\u0110\7\5\2\2\u0110\u0111\5\f\7"+
		"\2\u0111\u0112\7\6\2\2\u0112\13\3\2\2\2\u0113\u0114\5\16\b\2\u0114\u0115"+
		"\5\20\t\2\u0115\r\3\2\2\2\u0116\u0117\5\u0090I\2\u0117\u0118\7\n\2\2\u0118"+
		"\u0119\7\13\2\2\u0119\u011a\7\f\2\2\u011a\u011b\7\r\2\2\u011b\u011c\7"+
		"\n\2\2\u011c\u011d\5\u00bc_\2\u011d\u011e\7\13\2\2\u011e\u011f\7\4\2\2"+
		"\u011f\17\3\2\2\2\u0120\u0121\7h\2\2\u0121\u0122\7\16\2\2\u0122\u0123"+
		"\7\b\2\2\u0123\u0124\5z>\2\u0124\u0125\7\t\2\2\u0125\u0126\7\17\2\2\u0126"+
		"\u0127\7\n\2\2\u0127\u0128\5\u0090I\2\u0128\u0129\7\u008d\2\2\u0129\u012a"+
		"\7\13\2\2\u012a\u012b\7\20\2\2\u012b\u012c\7\5\2\2\u012c\u012d\7\21\2"+
		"\2\u012d\u012e\7\u008d\2\2\u012e\u012f\7\4\2\2\u012f\u0130\7\6\2\2\u0130"+
		"\21\3\2\2\2\u0131\u0134\5\32\16\2\u0132\u0134\5\24\13\2\u0133\u0131\3"+
		"\2\2\2\u0133\u0132\3\2\2\2\u0134\23\3\2\2\2\u0135\u0136\7m\2\2\u0136\u0137"+
		"\7\u008d\2\2\u0137\u0138\7i\2\2\u0138\u0139\7C\2\2\u0139\u013e\7\5\2\2"+
		"\u013a\u013d\5\30\r\2\u013b\u013d\5\26\f\2\u013c\u013a\3\2\2\2\u013c\u013b"+
		"\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\6\2\2\u0142\25\3\2\2"+
		"\2\u0143\u0144\7h\2\2\u0144\u0145\7\u008d\2\2\u0145\u0146\7y\2\2\u0146"+
		"\u0147\7\n\2\2\u0147\u0148\7\13\2\2\u0148\u0149\7\22\2\2\u0149\u014a\5"+
		"\u0094K\2\u014a\u014b\7\4\2\2\u014b\27\3\2\2\2\u014c\u014d\7m\2\2\u014d"+
		"\u014e\7\u008d\2\2\u014e\u014f\7i\2\2\u014f\u0150\t\2\2\2\u0150\u0151"+
		"\7\b\2\2\u0151\u0152\7\u008d\2\2\u0152\u0153\7\t\2\2\u0153\u0157\7\5\2"+
		"\2\u0154\u0156\5\u009eP\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u015a\u015c\5\34\17\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015e\7\6\2\2\u015e\31\3\2\2\2\u015f\u0160\7m\2\2"+
		"\u0160\u0161\7\u008d\2\2\u0161\u0162\7i\2\2\u0162\u0163\7B\2\2\u0163\u016a"+
		"\7\5\2\2\u0164\u0165\5\u0094K\2\u0165\u0166\7\4\2\2\u0166\u0169\3\2\2"+
		"\2\u0167\u0169\5\u009eP\2\u0168\u0164\3\2\2\2\u0168\u0167\3\2\2\2\u0169"+
		"\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2"+
		"\2\2\u016c\u016a\3\2\2\2\u016d\u016e\5\34\17\2\u016e\u016f\7\6\2\2\u016f"+
		"\33\3\2\2\2\u0170\u0171\7h\2\2\u0171\u0172\7@\2\2\u0172\u0173\7D\2\2\u0173"+
		"\u0174\7\n\2\2\u0174\u0175\7E\2\2\u0175\u0176\7F\2\2\u0176\u0177\7\13"+
		"\2\2\u0177\u017b\7\5\2\2\u0178\u017a\5\u009eP\2\u0179\u0178\3\2\2\2\u017a"+
		"\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2"+
		"\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7j\2\2\u017f\u0180\5\36\20\2\u0180"+
		"\u0181\7\4\2\2\u0181\u0182\7\6\2\2\u0182\35\3\2\2\2\u0183\u0196\5D#\2"+
		"\u0184\u0196\5B\"\2\u0185\u0196\5$\23\2\u0186\u0196\5\64\33\2\u0187\u0196"+
		"\5*\26\2\u0188\u0196\5,\27\2\u0189\u0196\5.\30\2\u018a\u0196\5 \21\2\u018b"+
		"\u0196\5&\24\2\u018c\u0196\5\62\32\2\u018d\u0196\5\"\22\2\u018e\u0196"+
		"\5(\25\2\u018f\u0196\5\66\34\2\u0190\u0196\58\35\2\u0191\u0196\5:\36\2"+
		"\u0192\u0196\5<\37\2\u0193\u0196\5> \2\u0194\u0196\5@!\2\u0195\u0183\3"+
		"\2\2\2\u0195\u0184\3\2\2\2\u0195\u0185\3\2\2\2\u0195\u0186\3\2\2\2\u0195"+
		"\u0187\3\2\2\2\u0195\u0188\3\2\2\2\u0195\u0189\3\2\2\2\u0195\u018a\3\2"+
		"\2\2\u0195\u018b\3\2\2\2\u0195\u018c\3\2\2\2\u0195\u018d\3\2\2\2\u0195"+
		"\u018e\3\2\2\2\u0195\u018f\3\2\2\2\u0195\u0190\3\2\2\2\u0195\u0191\3\2"+
		"\2\2\u0195\u0192\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196"+
		"\37\3\2\2\2\u0197\u0198\7M\2\2\u0198\u01a1\7\n\2\2\u0199\u019e\5L\'\2"+
		"\u019a\u019b\7\3\2\2\u019b\u019d\5L\'\2\u019c\u019a\3\2\2\2\u019d\u01a0"+
		"\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u0199\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2"+
		"\2\2\u01a3\u01a5\7\3\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a7\7\13\2\2\u01a7!\3\2\2\2\u01a8\u01a9\7A\2\2"+
		"\u01a9\u01b2\7\n\2\2\u01aa\u01af\5L\'\2\u01ab\u01ac\7\3\2\2\u01ac\u01ae"+
		"\5L\'\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01aa\3\2"+
		"\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b6\7\3\2\2\u01b5"+
		"\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\7\13"+
		"\2\2\u01b8#\3\2\2\2\u01b9\u01ba\7\u0084\2\2\u01ba\u01c3\7\n\2\2\u01bb"+
		"\u01c0\5L\'\2\u01bc\u01bd\7\3\2\2\u01bd\u01bf\5L\'\2\u01be\u01bc\3\2\2"+
		"\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c4"+
		"\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01bb\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c6\3\2\2\2\u01c5\u01c7\7\3\2\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\7\13\2\2\u01c9%\3\2\2\2\u01ca\u01cb"+
		"\7g\2\2\u01cb\u01d4\7\n\2\2\u01cc\u01d1\5L\'\2\u01cd\u01ce\7\3\2\2\u01ce"+
		"\u01d0\5L\'\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4"+
		"\u01cc\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d8\7\3"+
		"\2\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01da\7\13\2\2\u01da\'\3\2\2\2\u01db\u01dc\7I\2\2\u01dc\u01e5\7\n\2\2"+
		"\u01dd\u01e2\5L\'\2\u01de\u01df\7\3\2\2\u01df\u01e1\5L\'\2\u01e0\u01de"+
		"\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01dd\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e9\7\3\2\2\u01e8\u01e7\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\7\13\2\2\u01eb)\3\2\2\2"+
		"\u01ec\u01ed\7\u0080\2\2\u01ed\u01f6\7\n\2\2\u01ee\u01f3\5L\'\2\u01ef"+
		"\u01f0\7\3\2\2\u01f0\u01f2\5L\'\2\u01f1\u01ef\3\2\2\2\u01f2\u01f5\3\2"+
		"\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f6\u01ee\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2"+
		"\2\2\u01f8\u01fa\7\3\2\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01fc\7\13\2\2\u01fc+\3\2\2\2\u01fd\u01fe\7\25\2"+
		"\2\u01fe\u01ff\7\n\2\2\u01ff\u0200\7\26\2\2\u0200\u0201\7\f\2\2\u0201"+
		"\u0202\7\u008d\2\2\u0202\u0203\7\3\2\2\u0203\u0204\7\27\2\2\u0204\u0205"+
		"\7\f\2\2\u0205\u0206\7\30\2\2\u0206\u0207\7\n\2\2\u0207\u0208\7\31\2\2"+
		"\u0208\u0209\7\f\2\2\u0209\u020b\7\u008a\2\2\u020a\u020c\7\3\2\2\u020b"+
		"\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\7\13"+
		"\2\2\u020e\u0210\7\3\2\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u0214\3\2\2\2\u0211\u0212\7\32\2\2\u0212\u0213\7\f\2\2\u0213\u0215\5"+
		"\u00c2b\2\u0214\u0211\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2"+
		"\u0216\u0218\7\3\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219"+
		"\3\2\2\2\u0219\u021b\7\13\2\2\u021a\u021c\7\3\2\2\u021b\u021a\3\2\2\2"+
		"\u021b\u021c\3\2\2\2\u021c-\3\2\2\2\u021d\u021e\7\u0088\2\2\u021e\u0222"+
		"\7\n\2\2\u021f\u0221\5\60\31\2\u0220\u021f\3\2\2\2\u0221\u0224\3\2\2\2"+
		"\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222"+
		"\3\2\2\2\u0225\u0227\7\3\2\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228\u0229\7\13\2\2\u0229/\3\2\2\2\u022a\u022e\5V,\2\u022b"+
		"\u022e\5R*\2\u022c\u022e\5Z.\2\u022d\u022a\3\2\2\2\u022d\u022b\3\2\2\2"+
		"\u022d\u022c\3\2\2\2\u022e\61\3\2\2\2\u022f\u0230\7\u0087\2\2\u0230\u0239"+
		"\7\n\2\2\u0231\u0236\5L\'\2\u0232\u0233\7\3\2\2\u0233\u0235\5L\'\2\u0234"+
		"\u0232\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2"+
		"\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u0231\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\u023c\3\2\2\2\u023b\u023d\7\3\2\2\u023c\u023b\3\2"+
		"\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\7\13\2\2\u023f"+
		"\63\3\2\2\2\u0240\u0241\7\u0082\2\2\u0241\u0242\7\n\2\2\u0242\u0243\5"+
		"l\67\2\u0243\u0244\7\3\2\2\u0244\u0245\5n8\2\u0245\u0246\7\3\2\2\u0246"+
		"\u0248\5v<\2\u0247\u0249\7\3\2\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2"+
		"\2\u0249\u024a\3\2\2\2\u024a\u024b\7\13\2\2\u024b\65\3\2\2\2\u024c\u024d"+
		"\7J\2\2\u024d\u0256\7\n\2\2\u024e\u0253\5L\'\2\u024f\u0250\7\3\2\2\u0250"+
		"\u0252\5L\'\2\u0251\u024f\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2"+
		"\2\2\u0253\u0254\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0256"+
		"\u024e\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258\u025a\7\3"+
		"\2\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u025c\7\13\2\2\u025c\67\3\2\2\2\u025d\u025e\7K\2\2\u025e\u0267\7\n\2"+
		"\2\u025f\u0264\5L\'\2\u0260\u0261\7\3\2\2\u0261\u0263\5L\'\2\u0262\u0260"+
		"\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u025f\3\2\2\2\u0267\u0268\3\2"+
		"\2\2\u0268\u026a\3\2\2\2\u0269\u026b\7\3\2\2\u026a\u0269\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\7\13\2\2\u026d9\3\2\2\2"+
		"\u026e\u026f\7L\2\2\u026f\u027a\7\n\2\2\u0270\u0275\5L\'\2\u0271\u0272"+
		"\7\3\2\2\u0272\u0274\5L\'\2\u0273\u0271\3\2\2\2\u0274\u0277\3\2\2\2\u0275"+
		"\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0275\3\2"+
		"\2\2\u0278\u0279\7\3\2\2\u0279\u027b\3\2\2\2\u027a\u0270\3\2\2\2\u027a"+
		"\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c\u027e\7\3\2\2\u027d\u027c\3\2"+
		"\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\7\13\2\2\u0280"+
		";\3\2\2\2\u0281\u0282\7O\2\2\u0282\u028b\7\n\2\2\u0283\u0288\5L\'\2\u0284"+
		"\u0285\7\3\2\2\u0285\u0287\5L\'\2\u0286\u0284\3\2\2\2\u0287\u028a\3\2"+
		"\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028c\3\2\2\2\u028a"+
		"\u0288\3\2\2\2\u028b\u0283\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028e\3\2"+
		"\2\2\u028d\u028f\7\3\2\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\u0291\7\13\2\2\u0291=\3\2\2\2\u0292\u0293\7P\2\2"+
		"\u0293\u0294\7\f\2\2\u0294\u0295\7Q\2\2\u0295\u0296\7\n\2\2\u0296\u029b"+
		"\5H%\2\u0297\u0298\5J&\2\u0298\u0299\7\13\2\2\u0299\u029b\3\2\2\2\u029a"+
		"\u0292\3\2\2\2\u029a\u0297\3\2\2\2\u029b?\3\2\2\2\u029c\u029d\t\3\2\2"+
		"\u029d\u029e\7\n\2\2\u029e\u02a0\5\u00c6d\2\u029f\u02a1\7\3\2\2\u02a0"+
		"\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\7\13"+
		"\2\2\u02a3\u02a5\7\3\2\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"A\3\2\2\2\u02a6\u02a7\7\35\2\2\u02a7\u02a8\7\n\2\2\u02a8\u02a9\7\n\2\2"+
		"\u02a9\u02aa\7\13\2\2\u02aa\u02ab\7\22\2\2\u02ab\u02ad\5\36\20\2\u02ac"+
		"\u02ae\7\3\2\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\3\2"+
		"\2\2\u02af\u02b1\7\13\2\2\u02b0\u02b2\7\3\2\2\u02b1\u02b0\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2C\3\2\2\2\u02b3\u02b4\7\36\2\2\u02b4\u02b5\7\b\2\2"+
		"\u02b5\u02b6\5z>\2\u02b6\u02b7\7\3\2\2\u02b7\u02b8\5z>\2\u02b8\u02b9\7"+
		"\t\2\2\u02b9\u02ba\7\n\2\2\u02ba\u02bb\5F$\2\u02bb\u02bd\7\13\2\2\u02bc"+
		"\u02be\7\3\2\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02beE\3\2\2\2"+
		"\u02bf\u02c0\7~\2\2\u02c0\u02c1\7\f\2\2\u02c1\u02c2\7\n\2\2\u02c2\u02c3"+
		"\7F\2\2\u02c3\u02c4\7\3\2\2\u02c4\u02c5\t\2\2\2\u02c5\u02c6\7\13\2\2\u02c6"+
		"\u02c7\7\5\2\2\u02c7\u02c8\7j\2\2\u02c8\u02c9\5\36\20\2\u02c9\u02ca\7"+
		"\4\2\2\u02ca\u02cc\7\6\2\2\u02cb\u02cd\7\3\2\2\u02cc\u02cb\3\2\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cdG\3\2\2\2\u02ce\u02cf\7R\2\2\u02cf\u02d0\7\n\2\2\u02d0"+
		"\u02d1\7\u008a\2\2\u02d1\u02d2\7\13\2\2\u02d2I\3\2\2\2\u02d3\u02d4\7S"+
		"\2\2\u02d4\u02d5\7\n\2\2\u02d5\u02d6\7\u008a\2\2\u02d6\u02d7\7\13\2\2"+
		"\u02d7K\3\2\2\2\u02d8\u02eb\5N(\2\u02d9\u02eb\5P)\2\u02da\u02eb\5V,\2"+
		"\u02db\u02eb\5t;\2\u02dc\u02eb\5X-\2\u02dd\u02eb\5R*\2\u02de\u02eb\5`"+
		"\61\2\u02df\u02eb\5d\63\2\u02e0\u02eb\5f\64\2\u02e1\u02eb\5h\65\2\u02e2"+
		"\u02eb\5j\66\2\u02e3\u02eb\5^\60\2\u02e4\u02eb\5v<\2\u02e5\u02eb\5p9\2"+
		"\u02e6\u02eb\5n8\2\u02e7\u02eb\5l\67\2\u02e8\u02eb\5Z.\2\u02e9\u02eb\5"+
		"\\/\2\u02ea\u02d8\3\2\2\2\u02ea\u02d9\3\2\2\2\u02ea\u02da\3\2\2\2\u02ea"+
		"\u02db\3\2\2\2\u02ea\u02dc\3\2\2\2\u02ea\u02dd\3\2\2\2\u02ea\u02de\3\2"+
		"\2\2\u02ea\u02df\3\2\2\2\u02ea\u02e0\3\2\2\2\u02ea\u02e1\3\2\2\2\u02ea"+
		"\u02e2\3\2\2\2\u02ea\u02e3\3\2\2\2\u02ea\u02e4\3\2\2\2\u02ea\u02e5\3\2"+
		"\2\2\u02ea\u02e6\3\2\2\2\u02ea\u02e7\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea"+
		"\u02e9\3\2\2\2\u02ebM\3\2\2\2\u02ec\u02ed\7\u0085\2\2\u02ed\u02ee\7\f"+
		"\2\2\u02ee\u02ef\7\u0085\2\2\u02ef\u02f0\7\n\2\2\u02f0\u02f1\5l\67\2\u02f1"+
		"\u02f3\7\13\2\2\u02f2\u02f4\7\3\2\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3"+
		"\2\2\2\u02f4O\3\2\2\2\u02f5\u02f6\7\37\2\2\u02f6\u02f9\7\f\2\2\u02f7\u02fa"+
		"\5T+\2\u02f8\u02fa\5x=\2\u02f9\u02f7\3\2\2\2\u02f9\u02f8\3\2\2\2\u02fa"+
		"Q\3\2\2\2\u02fb\u02fc\7 \2\2\u02fc\u02fd\7\f\2\2\u02fd\u02fe\7\u0088\2"+
		"\2\u02fe\u02ff\7f\2\2\u02ff\u0300\7!\2\2\u0300\u0301\7\n\2\2\u0301\u0302"+
		"\5r:\2\u0302\u0304\7\13\2\2\u0303\u0305\7\3\2\2\u0304\u0303\3\2\2\2\u0304"+
		"\u0305\3\2\2\2\u0305S\3\2\2\2\u0306\u0307\t\4\2\2\u0307\u0310\7\n\2\2"+
		"\u0308\u030d\5L\'\2\u0309\u030a\7\3\2\2\u030a\u030c\5L\'\2\u030b\u0309"+
		"\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e"+
		"\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0308\3\2\2\2\u0310\u0311\3\2"+
		"\2\2\u0311\u0313\3\2\2\2\u0312\u0314\7\3\2\2\u0313\u0312\3\2\2\2\u0313"+
		"\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\7\13\2\2\u0316U\3\2\2\2"+
		"\u0317\u0318\7U\2\2\u0318\u0324\7\f\2\2\u0319\u031a\7\n\2\2\u031a\u031b"+
		"\7\13\2\2\u031b\u031f\7\5\2\2\u031c\u0320\5\u0080A\2\u031d\u0320\5\u009e"+
		"P\2\u031e\u0320\5\u0094K\2\u031f\u031c\3\2\2\2\u031f\u031d\3\2\2\2\u031f"+
		"\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\7\6\2\2\u0322\u0325\3\2"+
		"\2\2\u0323\u0325\5\u00bc_\2\u0324\u0319\3\2\2\2\u0324\u0323\3\2\2\2\u0325"+
		"\u0327\3\2\2\2\u0326\u0328\7\3\2\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2"+
		"\2\2\u0328W\3\2\2\2\u0329\u032a\7\u0086\2\2\u032a\u032b\7\f\2\2\u032b"+
		"\u032c\7\u0086\2\2\u032c\u032d\7f\2\2\u032d\u032e\7J\2\2\u032eY\3\2\2"+
		"\2\u032f\u0330\7G\2\2\u0330\u0332\5\u0094K\2\u0331\u0333\7\3\2\2\u0332"+
		"\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333[\3\2\2\2\u0334\u0344\7H\2\2\u0335"+
		"\u0345\5\u0094K\2\u0336\u0337\7\"\2\2\u0337\u033c\5\u0094K\2\u0338\u0339"+
		"\7\3\2\2\u0339\u033b\5\u0094K\2\u033a\u0338\3\2\2\2\u033b\u033e\3\2\2"+
		"\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u0340\3\2\2\2\u033e\u033c"+
		"\3\2\2\2\u033f\u0341\7\3\2\2\u0340\u033f\3\2\2\2\u0340\u0341\3\2\2\2\u0341"+
		"\u0342\3\2\2\2\u0342\u0343\7#\2\2\u0343\u0345\3\2\2\2\u0344\u0335\3\2"+
		"\2\2\u0344\u0336\3\2\2\2\u0345\u0347\3\2\2\2\u0346\u0348\7\3\2\2\u0347"+
		"\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348]\3\2\2\2\u0349\u034a\7T\2\2\u034a"+
		"\u034b\7\f\2\2\u034b\u034c\7T\2\2\u034c_\3\2\2\2\u034d\u0351\7V\2\2\u034e"+
		"\u0352\7\u008b\2\2\u034f\u0352\5\u00bc_\2\u0350\u0352\5b\62\2\u0351\u034e"+
		"\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0350\3\2\2\2\u0352a\3\2\2\2\u0353"+
		"\u0354\7\24\2\2\u0354\u0355\7$\2\2\u0355\u0356\7\u008d\2\2\u0356\u0357"+
		"\7f\2\2\u0357\u0358\5\u00bc_\2\u0358\u0359\7%\2\2\u0359\u035a\7&\2\2\u035a"+
		"\u035b\7\'\2\2\u035b\u035c\7\f\2\2\u035c\u035d\7&\2\2\u035d\u035f\7(\2"+
		"\2\u035e\u0360\7\3\2\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360c"+
		"\3\2\2\2\u0361\u0363\7W\2\2\u0362\u0364\7\f\2\2\u0363\u0362\3\2\2\2\u0363"+
		"\u0364\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366\7\u008c\2\2\u0366e\3\2"+
		"\2\2\u0367\u0368\7X\2\2\u0368\u0369\7\u008c\2\2\u0369g\3\2\2\2\u036a\u036c"+
		"\7Y\2\2\u036b\u036d\7\f\2\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d"+
		"\u036e\3\2\2\2\u036e\u036f\7Z\2\2\u036f\u0375\7f\2\2\u0370\u0371\7[\2"+
		"\2\u0371\u0372\7\n\2\2\u0372\u0373\7\u008c\2\2\u0373\u0376\7\13\2\2\u0374"+
		"\u0376\7J\2\2\u0375\u0370\3\2\2\2\u0375\u0374\3\2\2\2\u0376\u0378\3\2"+
		"\2\2\u0377\u0379\7\3\2\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2\2\u0379"+
		"i\3\2\2\2\u037a\u037b\7\\\2\2\u037b\u037c\7Z\2\2\u037c\u0382\7f\2\2\u037d"+
		"\u037e\7[\2\2\u037e\u037f\7\n\2\2\u037f\u0380\7\u008c\2\2\u0380\u0383"+
		"\7\13\2\2\u0381\u0383\7J\2\2\u0382\u037d\3\2\2\2\u0382\u0381\3\2\2\2\u0383"+
		"k\3\2\2\2\u0384\u0385\7]\2\2\u0385\u038b\7\f\2\2\u0386\u038c\7\u008a\2"+
		"\2\u0387\u0388\t\3\2\2\u0388\u0389\7\n\2\2\u0389\u038a\7\u008a\2\2\u038a"+
		"\u038c\7\13\2\2\u038b\u0386\3\2\2\2\u038b\u0387\3\2\2\2\u038c\u038e\3"+
		"\2\2\2\u038d\u038f\7\3\2\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f"+
		"m\3\2\2\2\u0390\u0391\7\u0083\2\2\u0391\u0392\7\f\2\2\u0392\u0393\t\3"+
		"\2\2\u0393\u0394\7\n\2\2\u0394\u0395\7\u008a\2\2\u0395\u0396\7\13\2\2"+
		"\u0396o\3\2\2\2\u0397\u0398\7^\2\2\u0398\u0399\7\f\2\2\u0399\u039a\7_"+
		"\2\2\u039a\u039b\7\n\2\2\u039b\u039c\5r:\2\u039c\u039e\7\13\2\2\u039d"+
		"\u039f\7\3\2\2\u039e\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039fq\3\2\2\2"+
		"\u03a0\u03a1\t\5\2\2\u03a1\u03a2\7\f\2\2\u03a2\u03a5\7&\2\2\u03a3\u03a6"+
		"\7\u008b\2\2\u03a4\u03a6\t\6\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a4\3\2\2"+
		"\2\u03a6\u03a8\3\2\2\2\u03a7\u03a9\7\3\2\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9"+
		"\3\2\2\2\u03a9s\3\2\2\2\u03aa\u03ab\7`\2\2\u03ab\u03ac\7\f\2\2\u03ac\u03ad"+
		"\5x=\2\u03adu\3\2\2\2\u03ae\u03af\7e\2\2\u03af\u03bd\7\f\2\2\u03b0\u03be"+
		"\5\u0094K\2\u03b1\u03b2\7\"\2\2\u03b2\u03b7\5\u0094K\2\u03b3\u03b4\7\3"+
		"\2\2\u03b4\u03b6\5\u0094K\2\u03b5\u03b3\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7"+
		"\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03b7\3\2"+
		"\2\2\u03ba\u03bb\7\3\2\2\u03bb\u03bc\7#\2\2\u03bc\u03be\3\2\2\2\u03bd"+
		"\u03b0\3\2\2\2\u03bd\u03b1\3\2\2\2\u03be\u03c0\3\2\2\2\u03bf\u03c1\7\3"+
		"\2\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1w\3\2\2\2\u03c2\u03c7"+
		"\7+\2\2\u03c3\u03c4\7\b\2\2\u03c4\u03c5\5z>\2\u03c5\u03c6\7\t\2\2\u03c6"+
		"\u03c8\3\2\2\2\u03c7\u03c3\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\3\2"+
		"\2\2\u03c9\u03ca\7\n\2\2\u03ca\u03cb\5|?\2\u03cb\u03cd\7\13\2\2\u03cc"+
		"\u03ce\7\3\2\2\u03cd\u03cc\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d0\3\2"+
		"\2\2\u03cf\u03d1\7\4\2\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"y\3\2\2\2\u03d2\u03d3\5\u0090I\2\u03d3{\3\2\2\2\u03d4\u03d5\7,\2\2\u03d5"+
		"\u03d6\7\f\2\2\u03d6\u03d7\5~@\2\u03d7\u03d8\7\3\2\2\u03d8\u03da\5Z.\2"+
		"\u03d9\u03db\7\3\2\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db}\3"+
		"\2\2\2\u03dc\u03de\7\n\2\2\u03dd\u03df\t\7\2\2\u03de\u03dd\3\2\2\2\u03de"+
		"\u03df\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\7\13\2\2\u03e1\u03e2\7"+
		"\22\2\2\u03e2\u03e3\5\u0090I\2\u03e3\u03e4\7\n\2\2\u03e4\u03e5\7\13\2"+
		"\2\u03e5\177\3\2\2\2\u03e6\u03e7\5\u0082B\2\u03e7\u03e8\7\4\2\2\u03e8"+
		"\u0081\3\2\2\2\u03e9\u03ed\5\u0084C\2\u03ea\u03ed\5\u0086D\2\u03eb\u03ed"+
		"\5\u0088E\2\u03ec\u03e9\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03eb\3\2\2"+
		"\2\u03ed\u0083\3\2\2\2\u03ee\u03ef\7{\2\2\u03ef\u03f0\7f\2\2\u03f0\u03f1"+
		"\7-\2\2\u03f1\u03f2\7\n\2\2\u03f2\u03f3\7F\2\2\u03f3\u03f4\7\13\2\2\u03f4"+
		"\u03f5\7.\2\2\u03f5\u0085\3\2\2\2\u03f6\u03f7\7{\2\2\u03f7\u03f8\7f\2"+
		"\2\u03f8\u03f9\7|\2\2\u03f9\u03fa\7\n\2\2\u03fa\u03fb\7F\2\2\u03fb\u03fc"+
		"\7\3\2\2\u03fc\u03fe\5\u008aF\2\u03fd\u03ff\7\3\2\2\u03fe\u03fd\3\2\2"+
		"\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\7\13\2\2\u0401"+
		"\u0087\3\2\2\2\u0402\u0403\7{\2\2\u0403\u0404\7f\2\2\u0404\u0405\7\177"+
		"\2\2\u0405\u0406\7\n\2\2\u0406\u0407\7F\2\2\u0407\u0408\7\3\2\2\u0408"+
		"\u040a\5\u008aF\2\u0409\u040b\7\3\2\2\u040a\u0409\3\2\2\2\u040a\u040b"+
		"\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\7\13\2\2\u040d\u0089\3\2\2\2"+
		"\u040e\u040f\7}\2\2\u040f\u0410\7\n\2\2\u0410\u0411\7~\2\2\u0411\u0412"+
		"\7\f\2\2\u0412\u0413\7\n\2\2\u0413\u0414\7F\2\2\u0414\u0415\7\13\2\2\u0415"+
		"\u0416\7\22\2\2\u0416\u0417\5\u0090I\2\u0417\u041b\7\n\2\2\u0418\u0419"+
		"\7\u008d\2\2\u0419\u041a\7\f\2\2\u041a\u041c\7\u008d\2\2\u041b\u0418\3"+
		"\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041f\7\13\2\2\u041e"+
		"\u0420\7\3\2\2\u041f\u041e\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421\3\2"+
		"\2\2\u0421\u0423\7\13\2\2\u0422\u0424\7\3\2\2\u0423\u0422\3\2\2\2\u0423"+
		"\u0424\3\2\2\2\u0424\u008b\3\2\2\2\u0425\u0426\7o\2\2\u0426\u0427\7n\2"+
		"\2\u0427\u0428\7\n\2\2\u0428\u0429\7\13\2\2\u0429\u042a\7\5\2\2\u042a"+
		"\u042e\5\u008eH\2\u042b\u042d\5\u009eP\2\u042c\u042b\3\2\2\2\u042d\u0430"+
		"\3\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0431\3\2\2\2\u0430"+
		"\u042e\3\2\2\2\u0431\u0432\7\6\2\2\u0432\u008d\3\2\2\2\u0433\u0434\7/"+
		"\2\2\u0434\u0435\7\n\2\2\u0435\u0436\7\u008d\2\2\u0436\u0437\7\n\2\2\u0437"+
		"\u0438\7\13\2\2\u0438\u0439\7\13\2\2\u0439\u043a\7\4\2\2\u043a\u008f\3"+
		"\2\2\2\u043b\u043c\7\u008d\2\2\u043c\u0091\3\2\2\2\u043d\u043e\7\u008d"+
		"\2\2\u043e\u0441\7\n\2\2\u043f\u0442\5\u0094K\2\u0440\u0442\5\u00bc_\2"+
		"\u0441\u043f\3\2\2\2\u0441\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443"+
		"\3\2\2\2\u0443\u0444\7\13\2\2\u0444\u0093\3\2\2\2\u0445\u0447\7x\2\2\u0446"+
		"\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\7\u008d"+
		"\2\2\u0449\u044b\7\n\2\2\u044a\u044c\5\u0096L\2\u044b\u044a\3\2\2\2\u044b"+
		"\u044c\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u0452\7\13\2\2\u044e\u0452\5"+
		"\36\20\2\u044f\u0452\5\u0098M\2\u0450\u0452\5\u0092J\2\u0451\u0446\3\2"+
		"\2\2\u0451\u044e\3\2\2\2\u0451\u044f\3\2\2\2\u0451\u0450\3\2\2\2\u0452"+
		"\u0095\3\2\2\2\u0453\u0457\5\u00bc_\2\u0454\u0457\5\u009aN\2\u0455\u0457"+
		"\5\u009cO\2\u0456\u0453\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0455\3\2\2"+
		"\2\u0457\u0097\3\2\2\2\u0458\u0459\7+\2\2\u0459\u045a\7f\2\2\u045a\u045b"+
		"\7-\2\2\u045b\u045c\7\b\2\2\u045c\u045d\5z>\2\u045d\u045e\7\t\2\2\u045e"+
		"\u0461\7\n\2\2\u045f\u0462\7F\2\2\u0460\u0462\5|?\2\u0461\u045f\3\2\2"+
		"\2\u0461\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464\7\13\2\2\u0464"+
		"\u0099\3\2\2\2\u0465\u0466\7\u008d\2\2\u0466\u0467\7\f\2\2\u0467\u0468"+
		"\5\u00bc_\2\u0468\u009b\3\2\2\2\u0469\u046a\7\5\2\2\u046a\u046b\7\60\2"+
		"\2\u046b\u046c\7\61\2\2\u046c\u046d\7f\2\2\u046d\u046e\7\u008d\2\2\u046e"+
		"\u046f\7\6\2\2\u046f\u009d\3\2\2\2\u0470\u047d\5\u00b0Y\2\u0471\u047d"+
		"\5\u00a4S\2\u0472\u047d\5\u00ba^\2\u0473\u047d\5\u00aeX\2\u0474\u047d"+
		"\5\u00b4[\2\u0475\u047d\5\u00b6\\\2\u0476\u047d\5\u00b8]\2\u0477\u047d"+
		"\5\u00acW\2\u0478\u047d\5\u00aaV\2\u0479\u047d\5\u00a2R\2\u047a\u047d"+
		"\5\u00a0Q\2\u047b\u047d\5\u0080A\2\u047c\u0470\3\2\2\2\u047c\u0471\3\2"+
		"\2\2\u047c\u0472\3\2\2\2\u047c\u0473\3\2\2\2\u047c\u0474\3\2\2\2\u047c"+
		"\u0475\3\2\2\2\u047c\u0476\3\2\2\2\u047c\u0477\3\2\2\2\u047c\u0478\3\2"+
		"\2\2\u047c\u0479\3\2\2\2\u047c\u047a\3\2\2\2\u047c\u047b\3\2\2\2\u047d"+
		"\u009f\3\2\2\2\u047e\u047f\7z\2\2\u047f\u0480\7\n\2\2\u0480\u0481\7\n"+
		"\2\2\u0481\u0482\7\13\2\2\u0482\u0486\7\5\2\2\u0483\u0485\5\u009eP\2\u0484"+
		"\u0483\3\2\2\2\u0485\u0488\3\2\2\2\u0486\u0484\3\2\2\2\u0486\u0487\3\2"+
		"\2\2\u0487\u0489\3\2\2\2\u0488\u0486\3\2\2\2\u0489\u048a\7\6\2\2\u048a"+
		"\u048b\7\13\2\2\u048b\u048c\7\4\2\2\u048c\u00a1\3\2\2\2\u048d\u048f\7"+
		"h\2\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\3\2\2\2\u0490"+
		"\u0491\5\u00c0a\2\u0491\u0492\7\u008d\2\2\u0492\u049e\7\n\2\2\u0493\u0494"+
		"\5\u00c0a\2\u0494\u049b\7\u008d\2\2\u0495\u0496\7\3\2\2\u0496\u0497\5"+
		"\u00c0a\2\u0497\u0498\7\u008d\2\2\u0498\u049a\3\2\2\2\u0499\u0495\3\2"+
		"\2\2\u049a\u049d\3\2\2\2\u049b\u0499\3\2\2\2\u049b\u049c\3\2\2\2\u049c"+
		"\u049f\3\2\2\2\u049d\u049b\3\2\2\2\u049e\u0493\3\2\2\2\u049e\u049f\3\2"+
		"\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\7\13\2\2\u04a1\u04a5\7\5\2\2\u04a2"+
		"\u04a4\5\u009eP\2\u04a3\u04a2\3\2\2\2\u04a4\u04a7\3\2\2\2\u04a5\u04a3"+
		"\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a8\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a8"+
		"\u04a9\7\6\2\2\u04a9\u00a3\3\2\2\2\u04aa\u04ab\7\u0081\2\2\u04ab\u04ac"+
		"\7\n\2\2\u04ac\u04ae\5\u00a6T\2\u04ad\u04af\7\3\2\2\u04ae\u04ad\3\2\2"+
		"\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1\7\13\2\2\u04b1"+
		"\u04b2\7\4\2\2\u04b2\u00a5\3\2\2\2\u04b3\u04b4\7F\2\2\u04b4\u04b5\7\f"+
		"\2\2\u04b5\u04b6\7F\2\2\u04b6\u04b7\7\3\2\2\u04b7\u04b8\5\u00a8U\2\u04b8"+
		"\u00a7\3\2\2\2\u04b9\u04ba\7~\2\2\u04ba\u04bb\7\f\2\2\u04bb\u04bc\7\n"+
		"\2\2\u04bc\u04bd\7E\2\2\u04bd\u04be\7F\2\2\u04be\u04bf\7\13\2\2\u04bf"+
		"\u04c0\7\5\2\2\u04c0\u04c1\7j\2\2\u04c1\u04c2\5\36\20\2\u04c2\u04c3\7"+
		"\4\2\2\u04c3\u04c4\7\6\2\2\u04c4\u00a9\3\2\2\2\u04c5\u04c6\7\u008d\2\2"+
		"\u04c6\u04c9\7f\2\2\u04c7\u04ca\5\u0092J\2\u04c8\u04ca\7\u008d\2\2\u04c9"+
		"\u04c7\3\2\2\2\u04c9\u04c8\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\7\4"+
		"\2\2\u04cc\u00ab\3\2\2\2\u04cd\u04d1\7\5\2\2\u04ce\u04d0\5\u009eP\2\u04cf"+
		"\u04ce\3\2\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2"+
		"\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d5\7\6\2\2\u04d5"+
		"\u00ad\3\2\2\2\u04d6\u04d8\7N\2\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2"+
		"\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\5\u00c0a\2\u04da\u04e0\7\u008d\2"+
		"\2\u04db\u04de\7\62\2\2\u04dc\u04df\5\u00bc_\2\u04dd\u04df\5\u0094K\2"+
		"\u04de\u04dc\3\2\2\2\u04de\u04dd\3\2\2\2\u04df\u04e1\3\2\2\2\u04e0\u04db"+
		"\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e3\7\4\2\2\u04e3"+
		"\u00af\3\2\2\2\u04e4\u04e5\7a\2\2\u04e5\u04e6\7\n\2\2\u04e6\u04e7\5\u00bc"+
		"_\2\u04e7\u04e8\7\13\2\2\u04e8\u04ea\5\u009eP\2\u04e9\u04eb\5\u00b2Z\2"+
		"\u04ea\u04e9\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u00b1\3\2\2\2\u04ec\u04ed"+
		"\7b\2\2\u04ed\u04ee\5\u009eP\2\u04ee\u00b3\3\2\2\2\u04ef\u04f0\7c\2\2"+
		"\u04f0\u04f1\7\n\2\2\u04f1\u04f2\5\u00bc_\2\u04f2\u04f6\7\13\2\2\u04f3"+
		"\u04f5\5\u009eP\2\u04f4\u04f3\3\2\2\2\u04f5\u04f8\3\2\2\2\u04f6\u04f4"+
		"\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u00b5\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f9"+
		"\u04fa\7d\2\2\u04fa\u04fb\7\n\2\2\u04fb\u04fc\5\u00bc_\2\u04fc\u04fd\7"+
		"\13\2\2\u04fd\u04fe\7\4\2\2\u04fe\u00b7\3\2\2\2\u04ff\u0500\7\u008d\2"+
		"\2\u0500\u0501\7\62\2\2\u0501\u0502\5\u00bc_\2\u0502\u0503\7\4\2\2\u0503"+
		"\u00b9\3\2\2\2\u0504\u0505\7\63\2\2\u0505\u0506\7\u008d\2\2\u0506\u0507"+
		"\7\5\2\2\u0507\u050c\5\u00c2b\2\u0508\u0509\7\3\2\2\u0509\u050b\5\u00c2"+
		"b\2\u050a\u0508\3\2\2\2\u050b\u050e\3\2\2\2\u050c\u050a\3\2\2\2\u050c"+
		"\u050d\3\2\2\2\u050d\u050f\3\2\2\2\u050e\u050c\3\2\2\2\u050f\u0510\7\6"+
		"\2\2\u0510\u00bb\3\2\2\2\u0511\u0512\b_\1\2\u0512\u0513\7\n\2\2\u0513"+
		"\u0514\5\u00bc_\2\u0514\u0515\7\13\2\2\u0515\u052f\3\2\2\2\u0516\u0517"+
		"\7\64\2\2\u0517\u052f\5\u00bc_\23\u0518\u052f\5\u00c2b\2\u0519\u051c\5"+
		"\u00be`\2\u051a\u051d\7\u008d\2\2\u051b\u051d\5\u00c2b\2\u051c\u051a\3"+
		"\2\2\2\u051c\u051b\3\2\2\2\u051d\u052f\3\2\2\2\u051e\u052f\7\u008d\2\2"+
		"\u051f\u0520\7k\2\2\u0520\u0521\7q\2\2\u0521\u0522\7\"\2\2\u0522\u0523"+
		"\5\u00bc_\2\u0523\u0524\7#\2\2\u0524\u052f\3\2\2\2\u0525\u0526\7k\2\2"+
		"\u0526\u0527\5\u0090I\2\u0527\u0528\7\n\2\2\u0528\u0529\7\13\2\2\u0529"+
		"\u052f\3\2\2\2\u052a\u052b\7\5\2\2\u052b\u052c\5\u00bc_\2\u052c\u052d"+
		"\7\6\2\2\u052d\u052f\3\2\2\2\u052e\u0511\3\2\2\2\u052e\u0516\3\2\2\2\u052e"+
		"\u0518\3\2\2\2\u052e\u0519\3\2\2\2\u052e\u051e\3\2\2\2\u052e\u051f\3\2"+
		"\2\2\u052e\u0525\3\2\2\2\u052e\u052a\3\2\2\2\u052f\u055f\3\2\2\2\u0530"+
		"\u0531\f\22\2\2\u0531\u0532\t\b\2\2\u0532\u055e\5\u00bc_\23\u0533\u0534"+
		"\f\21\2\2\u0534\u0535\t\t\2\2\u0535\u055e\5\u00bc_\22\u0536\u0537\f\20"+
		"\2\2\u0537\u0538\7\b\2\2\u0538\u055e\5\u00bc_\21\u0539\u053a\f\17\2\2"+
		"\u053a\u053b\7:\2\2\u053b\u055e\5\u00bc_\20\u053c\u053d\f\16\2\2\u053d"+
		"\u053e\7$\2\2\u053e\u055e\5\u00bc_\17\u053f\u0540\f\r\2\2\u0540\u0541"+
		"\7;\2\2\u0541\u055e\5\u00bc_\16\u0542\u0543\f\t\2\2\u0543\u0544\7%\2\2"+
		"\u0544\u0545\5\u00bc_\2\u0545\u0546\7\f\2\2\u0546\u0547\5\u00bc_\n\u0547"+
		"\u055e\3\2\2\2\u0548\u0549\f\f\2\2\u0549\u054a\7\"\2\2\u054a\u054b\5\u00bc"+
		"_\2\u054b\u054c\7#\2\2\u054c\u055e\3\2\2\2\u054d\u054e\f\13\2\2\u054e"+
		"\u054f\7f\2\2\u054f\u055e\t\n\2\2\u0550\u0551\f\n\2\2\u0551\u055a\7\n"+
		"\2\2\u0552\u0557\5\u00bc_\2\u0553\u0554\7\3\2\2\u0554\u0556\5\u00bc_\2"+
		"\u0555\u0553\3\2\2\2\u0556\u0559\3\2\2\2\u0557\u0555\3\2\2\2\u0557\u0558"+
		"\3\2\2\2\u0558\u055b\3\2\2\2\u0559\u0557\3\2\2\2\u055a\u0552\3\2\2\2\u055a"+
		"\u055b\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055e\7\13\2\2\u055d\u0530\3"+
		"\2\2\2\u055d\u0533\3\2\2\2\u055d\u0536\3\2\2\2\u055d\u0539\3\2\2\2\u055d"+
		"\u053c\3\2\2\2\u055d\u053f\3\2\2\2\u055d\u0542\3\2\2\2\u055d\u0548\3\2"+
		"\2\2\u055d\u054d\3\2\2\2\u055d\u0550\3\2\2\2\u055e\u0561\3\2\2\2\u055f"+
		"\u055d\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u00bd\3\2\2\2\u0561\u055f\3\2"+
		"\2\2\u0562\u0563\7\u008d\2\2\u0563\u0565\7f\2\2\u0564\u0562\3\2\2\2\u0565"+
		"\u0568\3\2\2\2\u0566\u0564\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u00bf\3\2"+
		"\2\2\u0568\u0566\3\2\2\2\u0569\u056a\7q\2\2\u056a\u056b\7\"\2\2\u056b"+
		"\u0574\7#\2\2\u056c\u0574\7r\2\2\u056d\u0574\7s\2\2\u056e\u0574\7q\2\2"+
		"\u056f\u0574\7p\2\2\u0570\u0574\7o\2\2\u0571\u0574\7N\2\2\u0572\u0574"+
		"\5\u0090I\2\u0573\u0569\3\2\2\2\u0573\u056c\3\2\2\2\u0573\u056d\3\2\2"+
		"\2\u0573\u056e\3\2\2\2\u0573\u056f\3\2\2\2\u0573\u0570\3\2\2\2\u0573\u0571"+
		"\3\2\2\2\u0573\u0572\3\2\2\2\u0574\u00c1\3\2\2\2\u0575\u057c\5\u00c4c"+
		"\2\u0576\u057c\7v\2\2\u0577\u057c\7w\2\2\u0578\u057c\7u\2\2\u0579\u057c"+
		"\7\u008c\2\2\u057a\u057c\7\u008a\2\2\u057b\u0575\3\2\2\2\u057b\u0576\3"+
		"\2\2\2\u057b\u0577\3\2\2\2\u057b\u0578\3\2\2\2\u057b\u0579\3\2\2\2\u057b"+
		"\u057a\3\2\2\2\u057c\u00c3\3\2\2\2\u057d\u057e\t\6\2\2\u057e\u00c5\3\2"+
		"\2\2\u057f\u0583\7\u008a\2\2\u0580\u0581\7\u008a\2\2\u0581\u0583\5\u00c8"+
		"e\2\u0582\u057f\3\2\2\2\u0582\u0580\3\2\2\2\u0583\u00c7\3\2\2\2\u0584"+
		"\u0585\7=\2\2\u0585\u0586\7\u008d\2\2\u0586\u00c9\3\2\2\2\u008e\u00cc"+
		"\u00ce\u00d2\u00d9\u00db\u00e6\u00f1\u00ff\u0101\u0133\u013c\u013e\u0157"+
		"\u015b\u0168\u016a\u017b\u0195\u019e\u01a1\u01a4\u01af\u01b2\u01b5\u01c0"+
		"\u01c3\u01c6\u01d1\u01d4\u01d7\u01e2\u01e5\u01e8\u01f3\u01f6\u01f9\u020b"+
		"\u020f\u0214\u0217\u021b\u0222\u0226\u022d\u0236\u0239\u023c\u0248\u0253"+
		"\u0256\u0259\u0264\u0267\u026a\u0275\u027a\u027d\u0288\u028b\u028e\u029a"+
		"\u02a0\u02a4\u02ad\u02b1\u02bd\u02cc\u02ea\u02f3\u02f9\u0304\u030d\u0310"+
		"\u0313\u031f\u0324\u0327\u0332\u033c\u0340\u0344\u0347\u0351\u035f\u0363"+
		"\u036c\u0375\u0378\u0382\u038b\u038e\u039e\u03a5\u03a8\u03b7\u03bd\u03c0"+
		"\u03c7\u03cd\u03d0\u03da\u03de\u03ec\u03fe\u040a\u041b\u041f\u0423\u042e"+
		"\u0441\u0446\u044b\u0451\u0456\u0461\u047c\u0486\u048e\u049b\u049e\u04a5"+
		"\u04ae\u04c9\u04d1\u04d7\u04de\u04e0\u04ea\u04f6\u050c\u051c\u052e\u0557"+
		"\u055a\u055d\u055f\u0566\u0573\u057b\u0582";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}