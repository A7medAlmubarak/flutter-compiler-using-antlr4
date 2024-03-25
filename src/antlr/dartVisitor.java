// Generated from dart.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dartVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dartParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(dartParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#libraryImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryImport(dartParser.LibraryImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#libraryExport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryExport(dartParser.LibraryExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#getxClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetxClass(dartParser.GetxClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#blocClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocClass(dartParser.BlocClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#blocClassArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocClassArguments(dartParser.BlocClassArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#blocConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocConstructor(dartParser.BlocConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#streamMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreamMethod(dartParser.StreamMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#widgetClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgetClass(dartParser.WidgetClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#statefulWidget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatefulWidget(dartParser.StatefulWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#createState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateState(dartParser.CreateStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#stateClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateClass(dartParser.StateClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#statelessWidget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatelessWidget(dartParser.StatelessWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#widgetBuild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgetBuild(dartParser.WidgetBuildContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#widgetLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgetLiteral(dartParser.WidgetLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#materialApp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialApp(dartParser.MaterialAppContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#gestureDetector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGestureDetector(dartParser.GestureDetectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(dartParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#card}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard(dartParser.CardContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#textButton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextButton(dartParser.TextButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#textField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextField(dartParser.TextFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#elevatedButton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElevatedButton(dartParser.ElevatedButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#elevatedButtonAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElevatedButtonAttribute(dartParser.ElevatedButtonAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#sizedBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizedBox(dartParser.SizedBoxContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#alertDialog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlertDialog(dartParser.AlertDialogContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#center}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenter(dartParser.CenterContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(dartParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(dartParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#listview}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListview(dartParser.ListviewContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(dartParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(dartParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#obxWidget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObxWidget(dartParser.ObxWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#blocBuildWidget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocBuildWidget(dartParser.BlocBuildWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#blocBuilder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocBuilder(dartParser.BlocBuilderContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#assetImage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssetImage(dartParser.AssetImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#networkImage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetworkImage(dartParser.NetworkImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#widgetAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgetAttribute(dartParser.WidgetAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#appBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBar(dartParser.AppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(dartParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(dartParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#bodyArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyArguments(dartParser.BodyArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#onPressed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnPressed(dartParser.OnPressedContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#mainAxisAlignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainAxisAlignment(dartParser.MainAxisAlignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild(dartParser.ChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#children}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildren(dartParser.ChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#ontap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOntap(dartParser.OntapContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(dartParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#boxcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxcolor(dartParser.BoxcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#hight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHight(dartParser.HightContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(dartParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#padding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding(dartParser.PaddingContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#margin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMargin(dartParser.MarginContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(dartParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(dartParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#theme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheme(dartParser.ThemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#primarySwatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarySwatch(dartParser.PrimarySwatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#home}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome(dartParser.HomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActions(dartParser.ActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#blocProviderStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocProviderStatement(dartParser.BlocProviderStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#blocType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocType(dartParser.BlocTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#blocProviderArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocProviderArguments(dartParser.BlocProviderArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#createStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStatement(dartParser.CreateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#navigator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigator(dartParser.NavigatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#navigatortype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigatortype(dartParser.NavigatortypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#navigatorPop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigatorPop(dartParser.NavigatorPopContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#navigatorPush}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigatorPush(dartParser.NavigatorPushContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#navigatorPushReplacement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigatorPushReplacement(dartParser.NavigatorPushReplacementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#materialPageRoute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialPageRoute(dartParser.MaterialPageRouteContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(dartParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#runApp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunApp(dartParser.RunAppContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(dartParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(dartParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_call(dartParser.Class_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#classArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassArgument(dartParser.ClassArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#blocCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocCall(dartParser.BlocCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#namedArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(dartParser.NamedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#required}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequired(dartParser.RequiredContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(dartParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#setStateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStateStatement(dartParser.SetStateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#methodStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodStatement(dartParser.MethodStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#showDialogStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDialogStatement(dartParser.ShowDialogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#showDialogProperities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDialogProperities(dartParser.ShowDialogProperitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#showDialogBuilder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDialogBuilder(dartParser.ShowDialogBuilderContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#methodcallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodcallStatement(dartParser.MethodcallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(dartParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(dartParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(dartParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#elseCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseCond(dartParser.ElseCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(dartParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(dartParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#varAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(dartParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#enumStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumStatement(dartParser.EnumStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexArray}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexArray(dartParser.IndexArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldAccess}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(dartParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantVal}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantVal(dartParser.ConstantValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newArray}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArray(dartParser.NewArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertyAccess}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccess(dartParser.PropertyAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notequal}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotequal(dartParser.NotequalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(dartParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(dartParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newClass}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewClass(dartParser.NewClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(dartParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idCall}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdCall(dartParser.IdCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(dartParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(dartParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(dartParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBlock}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBlock(dartParser.ExprBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternary}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary(dartParser.TernaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(dartParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(dartParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#objectAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectAccess(dartParser.ObjectAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(dartParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(dartParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#colorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorName(dartParser.ColorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#stringInterpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringInterpolation(dartParser.StringInterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#interpolationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationPart(dartParser.InterpolationPartContext ctx);
}