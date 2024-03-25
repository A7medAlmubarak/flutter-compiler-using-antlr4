package visitors;

import AST.*;
import AST.expression.*;
import AST.function.classArgument;
import AST.function.class_call;
import AST.function.function_call;
import AST.statement.*;
import AST.statement.navigator.*;
import AST.statement.showDialog.ShowDialogBuilder;
import AST.statement.showDialog.ShowDialogProperties;
import AST.statement.showDialog.showDialog;
import AST.type.BoxColor;
import AST.type.namedArgument;
import AST.type.required;
import AST.type.stringInterpolation;
import AST.widget.*;
import AST.widget.blocBuild.*;
import AST.widget.widgetAttribute.*;
import antlr.dartBaseVisitor;
import antlr.dartParser;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends dartBaseVisitor {
    public final SymbolTable symbolTable = new SymbolTable();
    public final VariableTable variableTable = new VariableTable();
    public static final Error errors = new Error();
    public final static List<Node> nodes = new ArrayList<>();
    public SemanticErrors semanticCheck;

    @Override
    public program visitProgram(dartParser.ProgramContext ctx) {
        program program = new program();

        for (int i = 0; i < ctx.libraryImport().size(); i++) {
            program.addimport( visitLibraryImport( ctx.libraryImport().get(i) ));
        }

        for (int i = 0; i < ctx.widgetClass().size(); i++) {
            program.addwidgetclass( visitWidgetClass( ctx.widgetClass().get(i) ));
        }
        for (int i = 0; i < ctx.getxClass().size(); i++) {
            program.addGetxClass( visitGetxClass( ctx.getxClass().get(i) ));
        }
        if( ctx.mainClass() != null )
             visitMainClass( ctx.mainClass());

        this.semanticCheck = new SemanticErrors(variableTable);

        semanticCheck.check();

        System.out.println("-----------------------Symbol Table-----------------------");
        System.out.println();
        this.symbolTable.print();
        System.out.println();

        return program;
    }

    @Override
    public libraryImport visitLibraryImport(dartParser.LibraryImportContext ctx) {
        libraryImport libraryImport = new libraryImport();
        libraryImport.add(String.valueOf(ctx.STRING_LITERAL()));
        return libraryImport;
    }

    @Override
    public libraryExport visitLibraryExport(dartParser.LibraryExportContext ctx) {
        libraryExport libraryExport = new libraryExport();
        libraryExport.add(String.valueOf(ctx.getChild(0)));
        return libraryExport;
    }

    @Override
    public getxClass visitGetxClass(dartParser.GetxClassContext ctx) {
        getxClass getxClass = new getxClass();
        getxClass.setClassName(String.valueOf(ctx.getChild(1)));
        for (int i = 0; i < ctx.class_call().size(); i++) {
            getxClass.setClass_call(visitClass_call(ctx.class_call().get(i)));
        }
        for (int i = 0; i < ctx.statement().size(); i++) {
            getxClass.setStatement(visitStatement(ctx.statement().get(i)));
        }

        Pair<String, String> pair = new Pair<>("getxClass", getxClass.className);
        this.symbolTable.setData(pair);

        return getxClass;
    }

    @Override
    public Object visitBlocClass(dartParser.BlocClassContext ctx) {
        blocClass blocClass = new blocClass();
        blocClass.setBlocType(String.valueOf(ctx.getChild(5)),String.valueOf(ctx.getChild(7)));
        blocClass.setArguments(visitBlocClassArguments(ctx.blocClassArguments()));

        Pair<String, String> pair = new Pair<>("BlocClass", String.valueOf(ctx.getChild(1)));
        this.symbolTable.setData(pair);

        return blocClass;

    }

    @Override
    public blocClassArguments visitBlocClassArguments(dartParser.BlocClassArgumentsContext ctx) {
        blocClassArguments blocClassArguments = new blocClassArguments();
        blocClassArguments.setBlocConstructor(visitBlocConstructor(ctx.blocConstructor()));
        blocClassArguments.setStreamMethod(visitStreamMethod(ctx.streamMethod()));
        return blocClassArguments;
    }

    @Override
    public blocConstructor visitBlocConstructor(dartParser.BlocConstructorContext ctx) {
        blocConstructor blocConstructor = new blocConstructor();
        blocConstructor.setClassName(String.valueOf(ctx.getChild(0)));
        blocConstructor.setExpression( (Expression) visit(ctx.expression()));
        return blocConstructor;
    }

    @Override
    public streamMethod visitStreamMethod(dartParser.StreamMethodContext ctx) {
        streamMethod streamMethod = new streamMethod();
        streamMethod.setStreamMethod(String.valueOf(ctx.getChild(3)),String.valueOf(ctx.getChild(7))
        ,String.valueOf(ctx.getChild(8)),String.valueOf(ctx.getChild(12)));
        return streamMethod;
    }

    @Override
    public widgetClass visitWidgetClass(dartParser.WidgetClassContext ctx) {
        widgetClass widgetClass = new widgetClass();

        if( ctx.statelessWidget() != null )
            return visitStatelessWidget( ctx.statelessWidget());
        /*if( ctx.statefulWidget() != null )
          return   visitStatefulWidget( ctx.statefulWidget());*/

        return null;
    }

    @Override
    public Object visitStatefulWidget(dartParser.StatefulWidgetContext ctx) {
        return super.visitStatefulWidget(ctx);
    }

    @Override
    public Object visitCreateState(dartParser.CreateStateContext ctx) {
        return super.visitCreateState(ctx);
    }

    @Override
    public Object visitStateClass(dartParser.StateClassContext ctx) {
        return super.visitStateClass(ctx);
    }

    @Override
    public statelessWidget visitStatelessWidget(dartParser.StatelessWidgetContext ctx) {
        statelessWidget statelessWidget = new statelessWidget();

        statelessWidget.setClassName(String.valueOf(ctx.getChild(1)));
        statelessWidget.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), statelessWidget.ClassName  );

        if( ctx.widgetBuild() != null ){
        statelessWidget.setWidgetBuildWidget( visitWidgetBuild(ctx.widgetBuild()));}

        for (int i = 0; i < ctx.class_call().size(); i++) {
            statelessWidget.setClass_calls(visitClass_call(ctx.class_call().get(i)));
        }
        for (int i = 0; i < ctx.statement().size(); i++) {
            statelessWidget.setStatement(visitStatement(ctx.statement().get(i)));
        }
        Pair<String, String> pair = new Pair<>("StatelessWidgetClass", statelessWidget.ClassName);
        this.symbolTable.setData(pair);
        return statelessWidget;
    }

    @Override
    public widgetBuild visitWidgetBuild(dartParser.WidgetBuildContext ctx) {
        widgetBuild widgetBuild = new widgetBuild();
        widgetBuild.setWidget(visitWidgetLiteral(ctx.widgetLiteral()));
        for (int i = 0; i < ctx.statement().size(); i++) {
            widgetBuild.setStatement(visitStatement(ctx.statement().get(i)));
        }
        return widgetBuild;
    }

    @Override
    public Widget visitWidgetLiteral(dartParser.WidgetLiteralContext ctx) {
        Widget widget = new Widget();

        if(ctx.card() != null ){
            return visitCard( ctx.card() );
        }

        if(ctx.row() != null ){
            return visitRow(ctx.row());
        }

        if(ctx.gestureDetector() != null ){
            return visitGestureDetector( ctx.gestureDetector() );

        }
        if(ctx.container() != null ){
            return visitContainer( ctx.container() );
        }
        if(ctx.column() != null ){
            return visitColumn( ctx.column() );
        }
        if(ctx.center() != null ){
            return visitCenter( ctx.center() );
        }

        if(ctx.text() !=null ){

            return visitText( ctx.text());
        }
        if(ctx.blocBuildWidget() != null ){
            return visitBlocBuildWidget( ctx.blocBuildWidget());
        }
        if(ctx.obxWidget() != null ){
            return visitObxWidget( ctx.obxWidget());
        }

        if(ctx.scaffold() != null ){
            return visitScaffold( ctx.scaffold());
        }
        if(ctx.alertDialog() != null ){
            return visitAlertDialog( ctx.alertDialog());
        }
        if(ctx.textButton() != null ){
            return visitTextButton( ctx.textButton());
        }
        if(ctx.textField() != null ){
            return visitTextField( ctx.textField());
        }
        if(ctx.elevatedButton() != null ){
            return visitElevatedButton( ctx.elevatedButton());
        }
        if(ctx.materialApp() != null ){
            return visitMaterialApp( ctx.materialApp());
        }
        if(ctx.sizedBox() != null ){
            return visitSizedBox( ctx.sizedBox());
        }
        return null;
    }

    @Override
    public materialApp visitMaterialApp(dartParser.MaterialAppContext ctx) {
        materialApp materialApp = new materialApp();
        materialApp.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), "materialApp"  );
        for (int i = 0; i < ctx.widgetAttribute().size(); i++) {
            materialApp.addChild( visitWidgetAttribute(ctx.widgetAttribute().get(i)));
        }
        return materialApp;
    }

    @Override
    public gestureDetectorWidget visitGestureDetector(dartParser.GestureDetectorContext ctx) {
        gestureDetectorWidget gestureDetectorWidget = new gestureDetectorWidget();
        for (int i = 0; i < ctx.widgetAttribute().size(); i++) {
            gestureDetectorWidget.addChild( visitWidgetAttribute(ctx.widgetAttribute().get(i)));
        }
        return gestureDetectorWidget;
    }

    @Override
    public scaffoldWidget visitScaffold(dartParser.ScaffoldContext ctx) {
        scaffoldWidget scaffoldWidget = new scaffoldWidget();
        scaffoldWidget.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), "scaffoldWidget"  );

        for (int i = 0; i < ctx.widgetAttribute().size(); i++) {
            scaffoldWidget.addChild( visitWidgetAttribute(ctx.widgetAttribute().get(i)));
        }
        return scaffoldWidget;
    }

    @Override
    public containerWidget visitContainer(dartParser.ContainerContext ctx) {
        containerWidget containerWidget = new containerWidget();
        containerWidget.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), "container"  );

        for (int i = 0; i < ctx.widgetAttribute().size(); i++) {
            containerWidget.addChild( visitWidgetAttribute(ctx.widgetAttribute().get(i)));
        }
        return containerWidget;
    }

    @Override
    public cardWidget visitCard(dartParser.CardContext ctx) {
        cardWidget cardWidget = new cardWidget();
        cardWidget.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), "card"  );
        for (int i = 0; i < ctx.widgetAttribute().size(); i++) {
            cardWidget.addChild( visitWidgetAttribute(ctx.widgetAttribute().get(i)));
        }
        return cardWidget;
    }

    @Override
    public textButtonWidget visitTextButton(dartParser.TextButtonContext ctx) {
        textButtonWidget textButtonWidget = new textButtonWidget();
        textButtonWidget.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), "textButton"  );

        for (int i = 0; i < ctx.widgetAttribute().size(); i++) {
            textButtonWidget.addChild( visitWidgetAttribute(ctx.widgetAttribute().get(i)));
        }
        return textButtonWidget;
    }

    @Override
    public textFieldWidget visitTextField(dartParser.TextFieldContext ctx) {
        textFieldWidget textFieldWidget = new textFieldWidget();
        textFieldWidget.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), "textField"  );

        textFieldWidget.setLabelText( String.valueOf(ctx.getChild(11)));
        textFieldWidget.setLabelText( String.valueOf(ctx.getChild(11)));
        if(ctx.constant() != null ){
            textFieldWidget.setObscureText( String.valueOf(ctx.constant()));
        }
        return textFieldWidget;
    }

    @Override
    public elevatedButtonWidget visitElevatedButton(dartParser.ElevatedButtonContext ctx) {

        elevatedButtonWidget elevatedButtonWidget = new elevatedButtonWidget();
        elevatedButtonWidget.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), "elevatedButton"  );

        for (int i = 0; i < ctx.elevatedButtonAttribute().size(); i++) {
            if(ctx.elevatedButtonAttribute().get(i).child() != null ){
                elevatedButtonWidget.addChild( String.valueOf((ctx.elevatedButtonAttribute().get(i).child().getChild(1).getChild(0).getChild(0) .getChild(2).getChild(0)  )));
            }
            if(ctx.elevatedButtonAttribute().get(i).style() != null ){
                elevatedButtonWidget.addStyle( visitStyle(ctx.elevatedButtonAttribute().get(i).style()));
            }
            if(ctx.elevatedButtonAttribute().get(i).onPressed() != null ){
                elevatedButtonWidget.addOnPressed( visitOnPressed(ctx.elevatedButtonAttribute().get(i).onPressed()));
            }
        }
        return elevatedButtonWidget;
    }

    @Override
    public Object visitElevatedButtonAttribute(dartParser.ElevatedButtonAttributeContext ctx) {
        return super.visitElevatedButtonAttribute(ctx);
    }

    @Override
    public sizedBox visitSizedBox(dartParser.SizedBoxContext ctx) {
        sizedBox sizedBox = new sizedBox();
        sizedBox.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), "sizedBox"  );

        for (int i = 0; i < ctx.widgetAttribute().size(); i++) {
            sizedBox.addChild( visitWidgetAttribute(ctx.widgetAttribute().get(i)));
        }
        return sizedBox;
    }

    @Override
    public alertDialogWidget visitAlertDialog(dartParser.AlertDialogContext ctx) {
        alertDialogWidget alertDialogWidget = new alertDialogWidget();
        alertDialogWidget.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), "alertDialog"  );

        alertDialogWidget.setTitle(String.valueOf(ctx.title().STRING_LITERAL()));
        alertDialogWidget.setContent(String.valueOf(ctx.content().STRING_LITERAL()));
        return alertDialogWidget;
    }

    @Override
    public centerWidget visitCenter(dartParser.CenterContext ctx) {
        centerWidget centerWidget = new centerWidget();
        centerWidget.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), "center"  );

        for (int i = 0; i < ctx.widgetAttribute().size(); i++) {
            centerWidget.addChild( visitWidgetAttribute(ctx.widgetAttribute().get(i)));
        }
        return centerWidget;
    }

    @Override
    public columnWidget visitColumn(dartParser.ColumnContext ctx) {
        columnWidget columnWidget = new columnWidget();
        columnWidget.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), "column"  );

        for (int i = 0; i < ctx.widgetAttribute().size(); i++) {
            columnWidget.addChild( visitWidgetAttribute(ctx.widgetAttribute().get(i)));
        }
        return columnWidget;
    }

    @Override
    public rowWidget visitRow(dartParser.RowContext ctx) {
        rowWidget rowWidget = new rowWidget();
        rowWidget.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), "row"  );

        for (int i = 0; i < ctx.widgetAttribute().size(); i++) {
            rowWidget.addChild( visitWidgetAttribute(ctx.widgetAttribute().get(i)));
        }
        return rowWidget;
    }

    @Override
    public listviewWidget visitListview(dartParser.ListviewContext ctx) {
        listviewWidget listviewWidget = new listviewWidget();

        for (int i = 0; i < ctx.widgetAttribute().size(); i++) {
            listviewWidget.addChild( visitWidgetAttribute(ctx.widgetAttribute().get(i)));
        }
        return listviewWidget;
    }

    @Override
    public imageWidget visitImage(dartParser.ImageContext ctx) {
        imageWidget imageWidget = new imageWidget();
        return imageWidget;
    }

    @Override
    public textWidget visitText(dartParser.TextContext ctx) {
        textWidget textWidget = new textWidget();
        textWidget.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), "text"  );

        textWidget.setValue( visitStringInterpolation( ctx.stringInterpolation()) );
        return textWidget;
    }

    @Override
    public obxWidget visitObxWidget(dartParser.ObxWidgetContext ctx) {
        obxWidget obxWidget = new obxWidget();
        obxWidget.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), "obxWidget"  );

        obxWidget.setWidget( visitWidgetLiteral(ctx.widgetLiteral()));
        return obxWidget;
    }

    @Override
    public blocBuildWidget visitBlocBuildWidget(dartParser.BlocBuildWidgetContext ctx) {
        blocBuildWidget blocBuildWidget = new blocBuildWidget();
        blocBuildWidget.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), "blocBuildWidget"  );

        blocBuildWidget.setBlocBuilder( visitBlocBuilder(ctx.blocBuilder()));
        blocBuildWidget.setBlocType1( String.valueOf(ctx.getChild(2)));
        blocBuildWidget.setBlocType2( String.valueOf(ctx.getChild(4)));
        return blocBuildWidget;
    }

    @Override
    public blocBuilder visitBlocBuilder(dartParser.BlocBuilderContext ctx) {
        blocBuilder blocBuilder = new blocBuilder();
        blocBuilder.setWidget( visitWidgetLiteral(ctx.widgetLiteral()));
        return blocBuilder;
    }

    @Override
    public Object visitAssetImage(dartParser.AssetImageContext ctx) {
        return super.visitAssetImage(ctx);
    }

    @Override
    public Object visitNetworkImage(dartParser.NetworkImageContext ctx) {
        return super.visitNetworkImage(ctx);
    }

    @Override
    public widgetAttribute visitWidgetAttribute(dartParser.WidgetAttributeContext ctx) {

        if(ctx.hight() != null ){
            return visitHight( ctx.hight() );
        }
        if(ctx.width() != null ){
            return visitWidth( ctx.width() );
        }
        if(ctx.ontap() != null ){
            return visitOntap( ctx.ontap() );
        }
        if(ctx.children() != null ){
            return visitChildren( ctx.children() );
        }
        if(ctx.child() != null ){
            return visitChild( ctx.child() );
        }
        if(ctx.margin() != null ){
            return visitMargin( ctx.margin() );
        }
        if(ctx.padding() != null ){
            return visitPadding( ctx.padding() );
        }
        if(ctx.color() != null ){
            return visitColor( ctx.color() );
        }
        if(ctx.appBar() != null ){
            return visitAppBar( ctx.appBar() );
        }
        if(ctx.body() != null ){
            return visitBody( ctx.body() );
        }
        if(ctx.onPressed() != null ){
            return visitOnPressed( ctx.onPressed() );
        }
        if(ctx.home() != null ){
            return visitHome( ctx.home() );
        }
        if(ctx.mainAxisAlignment() != null ){
            return visitMainAxisAlignment( ctx.mainAxisAlignment() );
        }
        if(ctx.style() != null ){
            return visitStyle( ctx.style() );
        }
        return null;
    }

    @Override
    public appBar visitAppBar(dartParser.AppBarContext ctx) {
        appBar appBar = new appBar();
        appBar.setValue( String.valueOf(ctx.title().STRING_LITERAL()));
        return appBar;
    }

    @Override
    public body visitBody(dartParser.BodyContext ctx) {
        body body = new body();
        if(ctx.bodyArguments() != null ) {
            body.setBodyArguments( visitBodyArguments(ctx.bodyArguments()) );
        }
        if(ctx.blocProviderStatement() != null ) {
            body.setBlocProviderStatement( visitBlocProviderStatement(ctx.blocProviderStatement()) );
        }
        return body;
    }

    @Override
    public style visitStyle(dartParser.StyleContext ctx) {
        style style = new style();
        style.setStyle( String.valueOf(ctx.primarySwatch().getChild(3)) );
        return style;
    }

    @Override
    public bodyArguments visitBodyArguments(dartParser.BodyArgumentsContext ctx) {
        bodyArguments bodyArguments = new bodyArguments();
        bodyArguments.node.setNode(String.valueOf(ctx.getStart().getLine()),String.valueOf(ctx.getStart().getCharPositionInLine()), "body"  );
        for (int i = 0; i < ctx.widgetAttribute().size(); i++) {
            bodyArguments.addChild( visitWidgetAttribute( ctx.widgetAttribute().get(i) ));
        }
        return bodyArguments;
    }

    @Override
    public onPressed visitOnPressed(dartParser.OnPressedContext ctx) {
        onPressed onPressed = new onPressed();
        if(ctx.navigator() != null ) {
            onPressed.setNavigator( visitNavigator(ctx.navigator()) );
        }
        if(ctx.statement() != null ) {
            onPressed.setStatement( visitStatement(ctx.statement()) );
        }
        if(ctx.class_call() != null ) {
            onPressed.setClass_call( visitClass_call(ctx.class_call()) );
        }
        if(ctx.expression() != null ) {
            onPressed.setExpression( (Expression) visit(ctx.expression()) );
        }
        return onPressed;
    }

    @Override
    public mainAxisAlignment visitMainAxisAlignment(dartParser.MainAxisAlignmentContext ctx) {
        mainAxisAlignment mainAxisAlignment = new mainAxisAlignment();
        return mainAxisAlignment;
    }

    @Override
    public child visitChild(dartParser.ChildContext ctx) {
        child child = new child();
        child.setClass_call( visitClass_call(ctx.class_call()) );

        return child;
    }

    @Override
    public children visitChildren(dartParser.ChildrenContext ctx) {
        children children = new children();
        for (int i = 0; i < ctx.class_call().size(); i++) {
            children.addChild( visitClass_call( ctx.class_call().get(i) ));
        }
        return children;
    }

    @Override
    public ontap visitOntap(dartParser.OntapContext ctx) {
        ontap ontap = new ontap();
        return ontap;
    }

    @Override
    public color visitColor(dartParser.ColorContext ctx) {
        color color = new color();
        if(ctx.expression() != null ) {
            color.setExpression( (Expression) visit(ctx.expression()) );
        } else if (ctx.boxcolor() != null ) {
            color.setBoxColor( visitBoxcolor(ctx.boxcolor()) );
        }else {
            color.setValue( String.valueOf(ctx.getChild(1)) );
        }
        return color;
    }

    @Override
    public BoxColor visitBoxcolor(dartParser.BoxcolorContext ctx) {
        BoxColor BoxColor = new BoxColor();
        BoxColor.setBoxColor( String.valueOf(ctx.getChild(2)) , String.valueOf(ctx.getChild(7)) ,String.valueOf(ctx.getChild(10)));
        return BoxColor;
    }

    @Override
    public hight visitHight(dartParser.HightContext ctx) {
        hight hight = new hight();
        hight.setValue(String.valueOf(ctx.NUMBER()) );
        return hight;
    }

    @Override
    public width visitWidth(dartParser.WidthContext ctx) {
        width width = new width();
        width.setValue(String.valueOf(ctx.NUMBER()) );
        return width;
    }

    @Override
    public padding visitPadding(dartParser.PaddingContext ctx) {
        padding padding = new padding();
        padding.setValue(String.valueOf(ctx.NUMBER()) );
        return padding;
    }

    @Override
    public margin visitMargin(dartParser.MarginContext ctx) {
        margin margin = new margin();
        margin.setValue(String.valueOf(ctx.NUMBER()) );
        return margin;
    }

    @Override
    public title visitTitle(dartParser.TitleContext ctx) {
        title title = new title();
        title.setText(String.valueOf(ctx.STRING_LITERAL()) );
        return title;
    }

    @Override
    public Object visitContent(dartParser.ContentContext ctx) {
        return super.visitContent(ctx);
    }

    @Override
    public Object visitTheme(dartParser.ThemeContext ctx) {
        return super.visitTheme(ctx);
    }

    @Override
    public Object visitPrimarySwatch(dartParser.PrimarySwatchContext ctx) {
        return super.visitPrimarySwatch(ctx);
    }

    @Override
    public home visitHome(dartParser.HomeContext ctx) {
        home home = new home();
        home.setBlocProviderStatement(visitBlocProviderStatement(ctx.blocProviderStatement()) );
        return home;
    }

    @Override
    public Object visitActions(dartParser.ActionsContext ctx) {
        return super.visitActions(ctx);
    }

    @Override
    public blocProviderStatement visitBlocProviderStatement(dartParser.BlocProviderStatementContext ctx) {
        blocProviderStatement blocProviderStatement = new blocProviderStatement();
        if(ctx.blocType() != null ) {
            blocProviderStatement.setBlocType( String.valueOf(ctx.getChild(2)) );
        }
        if (ctx.blocProviderArguments() != null ) {
            blocProviderStatement.setArguments( visitBlocProviderArguments(ctx.blocProviderArguments()) );
        }
        return blocProviderStatement;
    }

    @Override
    public Object visitBlocType(dartParser.BlocTypeContext ctx) {
        return super.visitBlocType(ctx);
    }

    @Override
    public blocProviderArguments visitBlocProviderArguments(dartParser.BlocProviderArgumentsContext ctx) {
        blocProviderArguments blocProviderArguments = new blocProviderArguments();
        blocProviderArguments.setChild( visitChild(ctx.child()) );
        blocProviderArguments.setCreateStatement( visitCreateStatement(ctx.createStatement()) );
        return blocProviderArguments;
    }

    @Override
    public createStatement visitCreateStatement(dartParser.CreateStatementContext ctx) {
        String id;
        String className;
        createStatement createStatement = new createStatement();
        if(ctx.IDENTIFIER() != null ) {
            createStatement.setId( String.valueOf(ctx.IDENTIFIER()) );
        }
        createStatement.setClassName( String.valueOf(ctx.className()) );
        return createStatement;
    }

    @Override
    public navigator visitNavigator(dartParser.NavigatorContext ctx) {
        navigator navigator = new navigator();
        navigator.setNavigator( visitNavigatortype(ctx.navigatortype()) );
        return navigator;
    }

    @Override
    public navigatorType visitNavigatortype(dartParser.NavigatortypeContext ctx) {
        navigatorType navigatorType = new navigatorType();

        if(ctx.navigatorPop() != null ){
            navigatorPop navigatorPop = new navigatorPop();
            return visitNavigatorPop( ctx.navigatorPop() );
        }
        if(ctx.navigatorPush() != null ){
            navigatorPush navigatorPush = new navigatorPush();
            return visitNavigatorPush( ctx.navigatorPush() );
        }
        if(ctx.navigatorPushReplacement() != null ){
            navigatorPushReplacement navigatorPushReplacement = new navigatorPushReplacement();
            return visitNavigatorPushReplacement( ctx.navigatorPushReplacement() );
        }
        return null;
    }

    @Override
    public navigatorPop visitNavigatorPop(dartParser.NavigatorPopContext ctx) {
        navigatorPop navigatorPop = new navigatorPop();
        return navigatorPop;
    }

    @Override
    public navigatorPush visitNavigatorPush(dartParser.NavigatorPushContext ctx) {
        navigatorPush navigatorPush = new navigatorPush();
        navigatorPush.setNavigatorPush( visitMaterialPageRoute(ctx.materialPageRoute()) );
        return navigatorPush;
    }

    @Override
    public navigatorPushReplacement visitNavigatorPushReplacement(dartParser.NavigatorPushReplacementContext ctx) {
        navigatorPushReplacement navigatorPushReplacement = new navigatorPushReplacement();
        navigatorPushReplacement.setNavigatorPushReplacement( visitMaterialPageRoute(ctx.materialPageRoute()) );
        return navigatorPushReplacement;
    }

    @Override
    public MaterialPageRoute visitMaterialPageRoute(dartParser.MaterialPageRouteContext ctx) {
        MaterialPageRoute MaterialPageRoute = new MaterialPageRoute();
        MaterialPageRoute.setMaterialPageRoute( String.valueOf(ctx.className()),String.valueOf(ctx.IDENTIFIER()),String.valueOf(ctx.IDENTIFIER()) );
        return MaterialPageRoute;
        }

    @Override
    public Object visitMainClass(dartParser.MainClassContext ctx) {
        mainClass mainClass = new mainClass();
        mainClass.setRunApp( visitRunApp(ctx.runApp()) );
        for (int i = 0; i < ctx.statement().size(); i++) {
            mainClass.addChild( visitStatement( ctx.statement().get(i) ));
        }
        return mainClass;
    }

    @Override
    public runApp visitRunApp(dartParser.RunAppContext ctx) {
        runApp runApp = new runApp();
        runApp.setId( String.valueOf(ctx.IDENTIFIER()) );
        return runApp;
    }

    @Override
    public Object visitClassName(dartParser.ClassNameContext ctx) {
        return super.visitClassName(ctx);
    }

    @Override
    public function_call visitFunction_call(dartParser.Function_callContext ctx) {
        function_call function_call = new function_call();
        if(ctx.class_call() != null ){
            function_call.setClass_call( visitClass_call(ctx.class_call()) );
        }
        if(ctx.expression() != null ){
            function_call.setExpression( String.valueOf(ctx.expression()) );
        }
        function_call.setFunctionName(String.valueOf(ctx.IDENTIFIER()));
        return function_call;
    }

    @Override
    public class_call visitClass_call(dartParser.Class_callContext ctx) {
        class_call class_call = new class_call();
        if(ctx.IDENTIFIER() != null ){
            class_call.setId(String.valueOf(ctx.IDENTIFIER()) );
        }
        if(ctx.classArgument() != null ){
            class_call.setClassArgument(visitClassArgument(ctx.classArgument()) );
        }
        if(ctx.widgetLiteral() != null ){
            class_call.setWidgetLiteral(visitWidgetLiteral(ctx.widgetLiteral()) );
        }
        if(ctx.function_call() != null ){
            class_call.setFunction_call(visitFunction_call(ctx.function_call()) );
        }
        if(ctx.blocCall() != null ){
            class_call.setBlocCall(visitBlocCall(ctx.blocCall()) );
        }
        return class_call;

    }

    @Override
    public classArgument visitClassArgument(dartParser.ClassArgumentContext ctx) {
        classArgument classArgument = new classArgument();
        if(ctx.expression() != null ){
            classArgument.setExpression((Expression) visit(ctx.expression()) );
        }
        if(ctx.namedArgument() != null ){
            classArgument.setNamedArgument(visitNamedArgument(ctx.namedArgument()) );
        }
        if(ctx.required() != null ){
            classArgument.setRequired(visitRequired(ctx.required()) );
        }
        return classArgument;
    }

    @Override
    public blocCall visitBlocCall(dartParser.BlocCallContext ctx) {
        blocCall blocCall = new blocCall();
        if(ctx.blocType() != null ){
            blocCall.setBlocType( String.valueOf(ctx.blocType()));
        }
        if(ctx.blocProviderArguments() != null ){
            blocCall.setArguments(visitBlocProviderArguments(ctx.blocProviderArguments()) );
        }
        return blocCall;
    }

    @Override
    public namedArgument visitNamedArgument(dartParser.NamedArgumentContext ctx) {
        namedArgument namedArgument = new namedArgument();
        namedArgument.setId(String.valueOf(ctx.IDENTIFIER()));
        namedArgument.setExpression((Expression) visit(ctx.expression()));
        return namedArgument;
    }

    @Override
    public required visitRequired(dartParser.RequiredContext ctx) {
        required required = new required();
        required.setRequired(String.valueOf(ctx.IDENTIFIER()));
        return required;
    }

    @Override
    public Statement visitStatement(dartParser.StatementContext ctx) {
        Statement statement = new Statement();
        if(ctx.ifStatement() != null ){
            ifStatement ifStatement = new ifStatement();
            return visitIfStatement( ctx.ifStatement() );
        }
        if(ctx.setStateStatement() != null ){
            setStateStatement setStateStatement = new setStateStatement();
            return visitSetStateStatement( ctx.setStateStatement() );
        }
        if(ctx.navigator() != null ){
            navigator navigator = new navigator();
            return visitNavigator( ctx.navigator() );
        }
        if(ctx.blockStatement() != null ){
            blockStatement blockStatement = new blockStatement();
            return visitBlockStatement( ctx.blockStatement() );
        }
        if(ctx.varAssignment() != null ){
            varAssignment varAssignment = new varAssignment();
            return visitVarAssignment( ctx.varAssignment() );
        }
        if(ctx.printStatement() != null ){
            printStatement printStatement = new printStatement();
            return visitPrintStatement( ctx.printStatement() );
        }
        if(ctx.whileStatement() != null ){
            whileStatement whileStatement = new whileStatement();
            return visitWhileStatement( ctx.whileStatement() );
        }
        if(ctx.varDeclaration() != null ){
            return visitVarDeclaration( ctx.varDeclaration() );
        }
        if(ctx.enumStatement() != null ){
            enumStatement enumStatement = new enumStatement();
            return visitEnumStatement( ctx.enumStatement() );
        }
        if(ctx.showDialogStatement() != null ){
            showDialog showDialogStatement = new showDialog();
            return visitShowDialogStatement( ctx.showDialogStatement() );
        }
        if(ctx.methodcallStatement() != null ){
            methodcallStatement methodcallStatement = new methodcallStatement();
            return visitMethodcallStatement( ctx.methodcallStatement() );
        }
        if(ctx.methodStatement() != null ){
            methodStatement methodStatement = new methodStatement();
            return visitMethodStatement( ctx.methodStatement() );
        }

        return null;
    }

    @Override
    public setStateStatement visitSetStateStatement(dartParser.SetStateStatementContext ctx) {
        setStateStatement setStateStatement = new setStateStatement();
        for (int i = 0; i < ctx.statement().size(); i++) {
            setStateStatement.addStatement( visitStatement( ctx.statement().get(i) ));
        }
        return setStateStatement;
    }

    @Override
    public methodStatement visitMethodStatement(dartParser.MethodStatementContext ctx) {
        methodStatement methodStatement = new methodStatement();
        methodStatement.setMethodId(String.valueOf(ctx.IDENTIFIER(2)));
        methodStatement.setMethodType(String.valueOf(ctx.IDENTIFIER(1)));
        for (int i = 0; i < ctx.statement().size(); i++) {
            methodStatement.setStatement( visitStatement( ctx.statement().get(i) ));
        }
        return methodStatement;
    }

    @Override
    public showDialog visitShowDialogStatement(dartParser.ShowDialogStatementContext ctx) {
        showDialog showDialog = new showDialog();
        showDialog.setProperties(visitShowDialogProperities( ctx.showDialogProperities() ));
        return showDialog;
    }

    @Override
    public ShowDialogProperties visitShowDialogProperities(dartParser.ShowDialogProperitiesContext ctx) {
        ShowDialogProperties ShowDialogProperties = new ShowDialogProperties();
        ShowDialogProperties.setBuilder(visitShowDialogBuilder( ctx.showDialogBuilder() ));
        return ShowDialogProperties;
    }

    @Override
    public ShowDialogBuilder visitShowDialogBuilder(dartParser.ShowDialogBuilderContext ctx) {
        ShowDialogBuilder ShowDialogBuilder = new ShowDialogBuilder();
        ShowDialogBuilder.setWidgetLiteral(visitWidgetLiteral( ctx.widgetLiteral() ));
        return ShowDialogBuilder;
    }

    @Override
    public methodcallStatement visitMethodcallStatement(dartParser.MethodcallStatementContext ctx) {
        methodcallStatement methodcallStatement = new methodcallStatement();
        methodcallStatement.setMethodName(String.valueOf(ctx.IDENTIFIER(0)));
        if(ctx.function_call() != null ){
            methodcallStatement.setFunction_call(visitFunction_call(ctx.function_call()));
        }else {
            methodcallStatement.setId(String.valueOf(ctx.getChild(2)));
        }
        return methodcallStatement;
    }

    @Override
    public blockStatement visitBlockStatement(dartParser.BlockStatementContext ctx) {
        blockStatement blockStatement = new blockStatement();
        for (int i = 0; i < ctx.statement().size(); i++) {
            blockStatement.addStatement( visitStatement( ctx.statement().get(i) ));
        }
        return blockStatement;
    }

    @Override
    public varDeclaration visitVarDeclaration(dartParser.VarDeclarationContext ctx) {
        //varDeclaration : FINAL_? type IDENTIFIER ( '=' ( expression | class_call )  )? ';' ;
        varDeclaration varDeclaration = new varDeclaration();
        varDeclaration.setType(String.valueOf(ctx.type()));
        varDeclaration.setIdentifier(String.valueOf(ctx.IDENTIFIER()));
        if(ctx.expression() != null ){
            varDeclaration.setExpression((Expression) visit(ctx.expression()));
        }
        this.variableTable.setData(String.valueOf(ctx.type().getChild(0)+","+String.valueOf(ctx.IDENTIFIER()+",Null")));

        return varDeclaration;
    }

    @Override
    public ifStatement visitIfStatement(dartParser.IfStatementContext ctx) {
        ifStatement ifStatement = new ifStatement();
        ifStatement.setCondition((Expression) visit(ctx.expression()));
        ifStatement.setStatement(visitStatement(ctx.statement()));
        if(ctx.elseCond() != null ){
            ifStatement.setElseStatement(visitElseCond(ctx.elseCond()));
        }
        return ifStatement;
    }

    @Override
    public elseCondStatement visitElseCond(dartParser.ElseCondContext ctx) {
        elseCondStatement elseCondStatement = new elseCondStatement();
        elseCondStatement.setStatement(visitStatement(ctx.statement()));
        return elseCondStatement;
    }

    @Override
    public whileStatement visitWhileStatement(dartParser.WhileStatementContext ctx) {
        whileStatement whileStatement = new whileStatement();
        whileStatement.setExpression((Expression) visit(ctx.expression()));
        for (int i = 0; i < ctx.statement().size(); i++) {
            whileStatement.setStatement( visitStatement( ctx.statement().get(i) ));
        }
        return whileStatement;
    }

    @Override
    public printStatement visitPrintStatement(dartParser.PrintStatementContext ctx) {
        printStatement printStatement = new printStatement();
        printStatement.setExpression((Expression) visit(ctx.expression()));
        return printStatement;
    }

    @Override
    public varAssignment visitVarAssignment(dartParser.VarAssignmentContext ctx) {
        varAssignment varAssignment = new varAssignment();
        varAssignment.setIdentifier(String.valueOf(ctx.IDENTIFIER()));
        varAssignment.setExpression((Expression) visit(ctx.expression()));
        this.variableTable.setData(ctx.IDENTIFIER()+","+"="+",null");

        return varAssignment;
    }

    @Override
    public enumStatement visitEnumStatement(dartParser.EnumStatementContext ctx) {
        enumStatement enumStatement = new enumStatement();
        enumStatement.setIdentifier(String.valueOf(ctx.IDENTIFIER()));
        for (int i = 0; i < ctx.constant().size(); i++) {
            enumStatement.addConstants( visitConstant( ctx.constant().get(i) ));
        }
        return enumStatement;
    }

    @Override
    public Object visitIndexArray(dartParser.IndexArrayContext ctx) {
        return super.visitIndexArray(ctx);
    }

    @Override
    public fieldAccess visitFieldAccess(dartParser.FieldAccessContext ctx) {
        fieldAccess fieldAccess = new fieldAccess();

        fieldAccess.setIdentifier(String.valueOf(ctx.IDENTIFIER()));

        return fieldAccess;
    }

    @Override
    public Object visitConstantVal(dartParser.ConstantValContext ctx) {

        return new constant(String.valueOf(ctx.getChild(0).getChild(0)));
    }

    @Override
    public Object visitNewArray(dartParser.NewArrayContext ctx) {
        return super.visitNewArray(ctx);
    }

    @Override
    public Object visitPropertyAccess(dartParser.PropertyAccessContext ctx) {
        return super.visitPropertyAccess(ctx);
    }

    @Override
    public Object visitNotequal(dartParser.NotequalContext ctx) {
        Expression left = (Expression) visit(ctx.getChild(0));
        Expression right = (Expression) visit(ctx.getChild(2));
        return new notEqual(left, right);    }

    @Override
    public Object visitParenExpr(dartParser.ParenExprContext ctx) {
        return super.visitParenExpr(ctx);
    }

    @Override
    public Object visitEqual(dartParser.EqualContext ctx) {
        Expression left = (Expression) visit(ctx.getChild(0));
        Expression right = (Expression) visit(ctx.getChild(2));
        return new equal(left, right);    }

    @Override
    public Object visitNewClass(dartParser.NewClassContext ctx) {
        return super.visitNewClass(ctx);
    }

    @Override
    public Object visitNotExpr(dartParser.NotExprContext ctx) {
        return super.visitNotExpr(ctx);
    }

    @Override
    public Object visitIdCall(dartParser.IdCallContext ctx) {
        return super.visitIdCall(ctx);
    }

    @Override
    public Object visitAnd(dartParser.AndContext ctx) {
        Expression left = (Expression) visit(ctx.getChild(0));
        Expression right = (Expression) visit(ctx.getChild(2));
        return new and(left, right);
    }

    @Override
    public Object visitLessThan(dartParser.LessThanContext ctx) {
        return super.visitLessThan(ctx);
    }

    @Override
    public Object visitMultiplication(dartParser.MultiplicationContext ctx) {
        return super.visitMultiplication(ctx);
    }

    @Override
    public Object visitExprBlock(dartParser.ExprBlockContext ctx) {
        return super.visitExprBlock(ctx);
    }

    @Override
    public Object visitTernary(dartParser.TernaryContext ctx) {
        return super.visitTernary(ctx);
    }

    @Override
    public Object visitAddition(dartParser.AdditionContext ctx) {
        return super.visitAddition(ctx);
    }

    @Override
    public Object visitMethodCall(dartParser.MethodCallContext ctx) {
        return super.visitMethodCall(ctx);
    }

    @Override
    public Object visitObjectAccess(dartParser.ObjectAccessContext ctx) {
        return super.visitObjectAccess(ctx);
    }

    @Override
    public Object visitType(dartParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public constant visitConstant(dartParser.ConstantContext ctx) {
        constant constant = new constant();
        constant.setValue(String.valueOf(ctx.getChild(0)));
        return constant;
    }

    @Override
    public Object visitColorName(dartParser.ColorNameContext ctx) {
        return super.visitColorName(ctx);
    }

    @Override
    public stringInterpolation visitStringInterpolation(dartParser.StringInterpolationContext ctx) {
        stringInterpolation stringInterpolation = new stringInterpolation();
        stringInterpolation.addText(String.valueOf(ctx.getChild(0)));
        if(ctx.interpolationPart() != null ){
            stringInterpolation.addVar(String.valueOf(ctx.getChild(1).getChild(1)));
        }
        return stringInterpolation;
    }

    @Override
    public Object visitInterpolationPart(dartParser.InterpolationPartContext ctx) {
        return super.visitInterpolationPart(ctx);
    }
}
