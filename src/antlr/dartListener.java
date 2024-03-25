// Generated from dart.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dartParser}.
 */
public interface dartListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dartParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(dartParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(dartParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#libraryImport}.
	 * @param ctx the parse tree
	 */
	void enterLibraryImport(dartParser.LibraryImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#libraryImport}.
	 * @param ctx the parse tree
	 */
	void exitLibraryImport(dartParser.LibraryImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#libraryExport}.
	 * @param ctx the parse tree
	 */
	void enterLibraryExport(dartParser.LibraryExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#libraryExport}.
	 * @param ctx the parse tree
	 */
	void exitLibraryExport(dartParser.LibraryExportContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#getxClass}.
	 * @param ctx the parse tree
	 */
	void enterGetxClass(dartParser.GetxClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#getxClass}.
	 * @param ctx the parse tree
	 */
	void exitGetxClass(dartParser.GetxClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#blocClass}.
	 * @param ctx the parse tree
	 */
	void enterBlocClass(dartParser.BlocClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#blocClass}.
	 * @param ctx the parse tree
	 */
	void exitBlocClass(dartParser.BlocClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#blocClassArguments}.
	 * @param ctx the parse tree
	 */
	void enterBlocClassArguments(dartParser.BlocClassArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#blocClassArguments}.
	 * @param ctx the parse tree
	 */
	void exitBlocClassArguments(dartParser.BlocClassArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#blocConstructor}.
	 * @param ctx the parse tree
	 */
	void enterBlocConstructor(dartParser.BlocConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#blocConstructor}.
	 * @param ctx the parse tree
	 */
	void exitBlocConstructor(dartParser.BlocConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#streamMethod}.
	 * @param ctx the parse tree
	 */
	void enterStreamMethod(dartParser.StreamMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#streamMethod}.
	 * @param ctx the parse tree
	 */
	void exitStreamMethod(dartParser.StreamMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#widgetClass}.
	 * @param ctx the parse tree
	 */
	void enterWidgetClass(dartParser.WidgetClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#widgetClass}.
	 * @param ctx the parse tree
	 */
	void exitWidgetClass(dartParser.WidgetClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#statefulWidget}.
	 * @param ctx the parse tree
	 */
	void enterStatefulWidget(dartParser.StatefulWidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#statefulWidget}.
	 * @param ctx the parse tree
	 */
	void exitStatefulWidget(dartParser.StatefulWidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#createState}.
	 * @param ctx the parse tree
	 */
	void enterCreateState(dartParser.CreateStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#createState}.
	 * @param ctx the parse tree
	 */
	void exitCreateState(dartParser.CreateStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#stateClass}.
	 * @param ctx the parse tree
	 */
	void enterStateClass(dartParser.StateClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#stateClass}.
	 * @param ctx the parse tree
	 */
	void exitStateClass(dartParser.StateClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#statelessWidget}.
	 * @param ctx the parse tree
	 */
	void enterStatelessWidget(dartParser.StatelessWidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#statelessWidget}.
	 * @param ctx the parse tree
	 */
	void exitStatelessWidget(dartParser.StatelessWidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#widgetBuild}.
	 * @param ctx the parse tree
	 */
	void enterWidgetBuild(dartParser.WidgetBuildContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#widgetBuild}.
	 * @param ctx the parse tree
	 */
	void exitWidgetBuild(dartParser.WidgetBuildContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#widgetLiteral}.
	 * @param ctx the parse tree
	 */
	void enterWidgetLiteral(dartParser.WidgetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#widgetLiteral}.
	 * @param ctx the parse tree
	 */
	void exitWidgetLiteral(dartParser.WidgetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#materialApp}.
	 * @param ctx the parse tree
	 */
	void enterMaterialApp(dartParser.MaterialAppContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#materialApp}.
	 * @param ctx the parse tree
	 */
	void exitMaterialApp(dartParser.MaterialAppContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#gestureDetector}.
	 * @param ctx the parse tree
	 */
	void enterGestureDetector(dartParser.GestureDetectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#gestureDetector}.
	 * @param ctx the parse tree
	 */
	void exitGestureDetector(dartParser.GestureDetectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void enterScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void exitScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(dartParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(dartParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#card}.
	 * @param ctx the parse tree
	 */
	void enterCard(dartParser.CardContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#card}.
	 * @param ctx the parse tree
	 */
	void exitCard(dartParser.CardContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textButton}.
	 * @param ctx the parse tree
	 */
	void enterTextButton(dartParser.TextButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textButton}.
	 * @param ctx the parse tree
	 */
	void exitTextButton(dartParser.TextButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textField}.
	 * @param ctx the parse tree
	 */
	void enterTextField(dartParser.TextFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textField}.
	 * @param ctx the parse tree
	 */
	void exitTextField(dartParser.TextFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#elevatedButton}.
	 * @param ctx the parse tree
	 */
	void enterElevatedButton(dartParser.ElevatedButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#elevatedButton}.
	 * @param ctx the parse tree
	 */
	void exitElevatedButton(dartParser.ElevatedButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#elevatedButtonAttribute}.
	 * @param ctx the parse tree
	 */
	void enterElevatedButtonAttribute(dartParser.ElevatedButtonAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#elevatedButtonAttribute}.
	 * @param ctx the parse tree
	 */
	void exitElevatedButtonAttribute(dartParser.ElevatedButtonAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void enterSizedBox(dartParser.SizedBoxContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void exitSizedBox(dartParser.SizedBoxContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#alertDialog}.
	 * @param ctx the parse tree
	 */
	void enterAlertDialog(dartParser.AlertDialogContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#alertDialog}.
	 * @param ctx the parse tree
	 */
	void exitAlertDialog(dartParser.AlertDialogContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#center}.
	 * @param ctx the parse tree
	 */
	void enterCenter(dartParser.CenterContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#center}.
	 * @param ctx the parse tree
	 */
	void exitCenter(dartParser.CenterContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(dartParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(dartParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(dartParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(dartParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#listview}.
	 * @param ctx the parse tree
	 */
	void enterListview(dartParser.ListviewContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#listview}.
	 * @param ctx the parse tree
	 */
	void exitListview(dartParser.ListviewContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(dartParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(dartParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(dartParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(dartParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#obxWidget}.
	 * @param ctx the parse tree
	 */
	void enterObxWidget(dartParser.ObxWidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#obxWidget}.
	 * @param ctx the parse tree
	 */
	void exitObxWidget(dartParser.ObxWidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#blocBuildWidget}.
	 * @param ctx the parse tree
	 */
	void enterBlocBuildWidget(dartParser.BlocBuildWidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#blocBuildWidget}.
	 * @param ctx the parse tree
	 */
	void exitBlocBuildWidget(dartParser.BlocBuildWidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#blocBuilder}.
	 * @param ctx the parse tree
	 */
	void enterBlocBuilder(dartParser.BlocBuilderContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#blocBuilder}.
	 * @param ctx the parse tree
	 */
	void exitBlocBuilder(dartParser.BlocBuilderContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#assetImage}.
	 * @param ctx the parse tree
	 */
	void enterAssetImage(dartParser.AssetImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#assetImage}.
	 * @param ctx the parse tree
	 */
	void exitAssetImage(dartParser.AssetImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#networkImage}.
	 * @param ctx the parse tree
	 */
	void enterNetworkImage(dartParser.NetworkImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#networkImage}.
	 * @param ctx the parse tree
	 */
	void exitNetworkImage(dartParser.NetworkImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#widgetAttribute}.
	 * @param ctx the parse tree
	 */
	void enterWidgetAttribute(dartParser.WidgetAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#widgetAttribute}.
	 * @param ctx the parse tree
	 */
	void exitWidgetAttribute(dartParser.WidgetAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#appBar}.
	 * @param ctx the parse tree
	 */
	void enterAppBar(dartParser.AppBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#appBar}.
	 * @param ctx the parse tree
	 */
	void exitAppBar(dartParser.AppBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(dartParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(dartParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(dartParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(dartParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#bodyArguments}.
	 * @param ctx the parse tree
	 */
	void enterBodyArguments(dartParser.BodyArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#bodyArguments}.
	 * @param ctx the parse tree
	 */
	void exitBodyArguments(dartParser.BodyArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#onPressed}.
	 * @param ctx the parse tree
	 */
	void enterOnPressed(dartParser.OnPressedContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#onPressed}.
	 * @param ctx the parse tree
	 */
	void exitOnPressed(dartParser.OnPressedContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#mainAxisAlignment}.
	 * @param ctx the parse tree
	 */
	void enterMainAxisAlignment(dartParser.MainAxisAlignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#mainAxisAlignment}.
	 * @param ctx the parse tree
	 */
	void exitMainAxisAlignment(dartParser.MainAxisAlignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#child}.
	 * @param ctx the parse tree
	 */
	void enterChild(dartParser.ChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#child}.
	 * @param ctx the parse tree
	 */
	void exitChild(dartParser.ChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#children}.
	 * @param ctx the parse tree
	 */
	void enterChildren(dartParser.ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#children}.
	 * @param ctx the parse tree
	 */
	void exitChildren(dartParser.ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#ontap}.
	 * @param ctx the parse tree
	 */
	void enterOntap(dartParser.OntapContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#ontap}.
	 * @param ctx the parse tree
	 */
	void exitOntap(dartParser.OntapContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(dartParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(dartParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#boxcolor}.
	 * @param ctx the parse tree
	 */
	void enterBoxcolor(dartParser.BoxcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#boxcolor}.
	 * @param ctx the parse tree
	 */
	void exitBoxcolor(dartParser.BoxcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#hight}.
	 * @param ctx the parse tree
	 */
	void enterHight(dartParser.HightContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#hight}.
	 * @param ctx the parse tree
	 */
	void exitHight(dartParser.HightContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#width}.
	 * @param ctx the parse tree
	 */
	void enterWidth(dartParser.WidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#width}.
	 * @param ctx the parse tree
	 */
	void exitWidth(dartParser.WidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#padding}.
	 * @param ctx the parse tree
	 */
	void enterPadding(dartParser.PaddingContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#padding}.
	 * @param ctx the parse tree
	 */
	void exitPadding(dartParser.PaddingContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#margin}.
	 * @param ctx the parse tree
	 */
	void enterMargin(dartParser.MarginContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#margin}.
	 * @param ctx the parse tree
	 */
	void exitMargin(dartParser.MarginContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(dartParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(dartParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(dartParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(dartParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#theme}.
	 * @param ctx the parse tree
	 */
	void enterTheme(dartParser.ThemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#theme}.
	 * @param ctx the parse tree
	 */
	void exitTheme(dartParser.ThemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#primarySwatch}.
	 * @param ctx the parse tree
	 */
	void enterPrimarySwatch(dartParser.PrimarySwatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#primarySwatch}.
	 * @param ctx the parse tree
	 */
	void exitPrimarySwatch(dartParser.PrimarySwatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#home}.
	 * @param ctx the parse tree
	 */
	void enterHome(dartParser.HomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#home}.
	 * @param ctx the parse tree
	 */
	void exitHome(dartParser.HomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#actions}.
	 * @param ctx the parse tree
	 */
	void enterActions(dartParser.ActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#actions}.
	 * @param ctx the parse tree
	 */
	void exitActions(dartParser.ActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#blocProviderStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlocProviderStatement(dartParser.BlocProviderStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#blocProviderStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlocProviderStatement(dartParser.BlocProviderStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#blocType}.
	 * @param ctx the parse tree
	 */
	void enterBlocType(dartParser.BlocTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#blocType}.
	 * @param ctx the parse tree
	 */
	void exitBlocType(dartParser.BlocTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#blocProviderArguments}.
	 * @param ctx the parse tree
	 */
	void enterBlocProviderArguments(dartParser.BlocProviderArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#blocProviderArguments}.
	 * @param ctx the parse tree
	 */
	void exitBlocProviderArguments(dartParser.BlocProviderArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateStatement(dartParser.CreateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateStatement(dartParser.CreateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#navigator}.
	 * @param ctx the parse tree
	 */
	void enterNavigator(dartParser.NavigatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#navigator}.
	 * @param ctx the parse tree
	 */
	void exitNavigator(dartParser.NavigatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#navigatortype}.
	 * @param ctx the parse tree
	 */
	void enterNavigatortype(dartParser.NavigatortypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#navigatortype}.
	 * @param ctx the parse tree
	 */
	void exitNavigatortype(dartParser.NavigatortypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#navigatorPop}.
	 * @param ctx the parse tree
	 */
	void enterNavigatorPop(dartParser.NavigatorPopContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#navigatorPop}.
	 * @param ctx the parse tree
	 */
	void exitNavigatorPop(dartParser.NavigatorPopContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#navigatorPush}.
	 * @param ctx the parse tree
	 */
	void enterNavigatorPush(dartParser.NavigatorPushContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#navigatorPush}.
	 * @param ctx the parse tree
	 */
	void exitNavigatorPush(dartParser.NavigatorPushContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#navigatorPushReplacement}.
	 * @param ctx the parse tree
	 */
	void enterNavigatorPushReplacement(dartParser.NavigatorPushReplacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#navigatorPushReplacement}.
	 * @param ctx the parse tree
	 */
	void exitNavigatorPushReplacement(dartParser.NavigatorPushReplacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#materialPageRoute}.
	 * @param ctx the parse tree
	 */
	void enterMaterialPageRoute(dartParser.MaterialPageRouteContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#materialPageRoute}.
	 * @param ctx the parse tree
	 */
	void exitMaterialPageRoute(dartParser.MaterialPageRouteContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(dartParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(dartParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#runApp}.
	 * @param ctx the parse tree
	 */
	void enterRunApp(dartParser.RunAppContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#runApp}.
	 * @param ctx the parse tree
	 */
	void exitRunApp(dartParser.RunAppContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(dartParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(dartParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(dartParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(dartParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#class_call}.
	 * @param ctx the parse tree
	 */
	void enterClass_call(dartParser.Class_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#class_call}.
	 * @param ctx the parse tree
	 */
	void exitClass_call(dartParser.Class_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#classArgument}.
	 * @param ctx the parse tree
	 */
	void enterClassArgument(dartParser.ClassArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#classArgument}.
	 * @param ctx the parse tree
	 */
	void exitClassArgument(dartParser.ClassArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#blocCall}.
	 * @param ctx the parse tree
	 */
	void enterBlocCall(dartParser.BlocCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#blocCall}.
	 * @param ctx the parse tree
	 */
	void exitBlocCall(dartParser.BlocCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#namedArgument}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgument(dartParser.NamedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#namedArgument}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgument(dartParser.NamedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#required}.
	 * @param ctx the parse tree
	 */
	void enterRequired(dartParser.RequiredContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#required}.
	 * @param ctx the parse tree
	 */
	void exitRequired(dartParser.RequiredContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(dartParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(dartParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#setStateStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetStateStatement(dartParser.SetStateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#setStateStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetStateStatement(dartParser.SetStateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#methodStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodStatement(dartParser.MethodStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#methodStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodStatement(dartParser.MethodStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#showDialogStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowDialogStatement(dartParser.ShowDialogStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#showDialogStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowDialogStatement(dartParser.ShowDialogStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#showDialogProperities}.
	 * @param ctx the parse tree
	 */
	void enterShowDialogProperities(dartParser.ShowDialogProperitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#showDialogProperities}.
	 * @param ctx the parse tree
	 */
	void exitShowDialogProperities(dartParser.ShowDialogProperitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#showDialogBuilder}.
	 * @param ctx the parse tree
	 */
	void enterShowDialogBuilder(dartParser.ShowDialogBuilderContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#showDialogBuilder}.
	 * @param ctx the parse tree
	 */
	void exitShowDialogBuilder(dartParser.ShowDialogBuilderContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#methodcallStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodcallStatement(dartParser.MethodcallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#methodcallStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodcallStatement(dartParser.MethodcallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(dartParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(dartParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(dartParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(dartParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(dartParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(dartParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#elseCond}.
	 * @param ctx the parse tree
	 */
	void enterElseCond(dartParser.ElseCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#elseCond}.
	 * @param ctx the parse tree
	 */
	void exitElseCond(dartParser.ElseCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(dartParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(dartParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(dartParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(dartParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(dartParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(dartParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#enumStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnumStatement(dartParser.EnumStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#enumStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnumStatement(dartParser.EnumStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexArray}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexArray(dartParser.IndexArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexArray}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexArray(dartParser.IndexArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldAccess}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(dartParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldAccess}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(dartParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantVal}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstantVal(dartParser.ConstantValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantVal}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstantVal(dartParser.ConstantValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newArray}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewArray(dartParser.NewArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newArray}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewArray(dartParser.NewArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertyAccess}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccess(dartParser.PropertyAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertyAccess}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccess(dartParser.PropertyAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notequal}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotequal(dartParser.NotequalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notequal}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotequal(dartParser.NotequalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(dartParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(dartParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqual(dartParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqual(dartParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newClass}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewClass(dartParser.NewClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newClass}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewClass(dartParser.NewClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(dartParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(dartParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idCall}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdCall(dartParser.IdCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idCall}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdCall(dartParser.IdCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd(dartParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd(dartParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(dartParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(dartParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(dartParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(dartParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBlock}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprBlock(dartParser.ExprBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBlock}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprBlock(dartParser.ExprBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternary}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernary(dartParser.TernaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternary}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernary(dartParser.TernaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addition}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddition(dartParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddition(dartParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(dartParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(dartParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#objectAccess}.
	 * @param ctx the parse tree
	 */
	void enterObjectAccess(dartParser.ObjectAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#objectAccess}.
	 * @param ctx the parse tree
	 */
	void exitObjectAccess(dartParser.ObjectAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(dartParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(dartParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(dartParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(dartParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#colorName}.
	 * @param ctx the parse tree
	 */
	void enterColorName(dartParser.ColorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#colorName}.
	 * @param ctx the parse tree
	 */
	void exitColorName(dartParser.ColorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#stringInterpolation}.
	 * @param ctx the parse tree
	 */
	void enterStringInterpolation(dartParser.StringInterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#stringInterpolation}.
	 * @param ctx the parse tree
	 */
	void exitStringInterpolation(dartParser.StringInterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#interpolationPart}.
	 * @param ctx the parse tree
	 */
	void enterInterpolationPart(dartParser.InterpolationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#interpolationPart}.
	 * @param ctx the parse tree
	 */
	void exitInterpolationPart(dartParser.InterpolationPartContext ctx);
}