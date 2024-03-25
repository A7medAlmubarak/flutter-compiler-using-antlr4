
grammar dart;

program: (libraryImport | libraryExport)*  mainClass? ( widgetClass | blocClass | stateClass | getxClass | statement   )*   EOF ;


libraryImport
    :   IMPORT_  STRING_LITERAL (',' STRING_LITERAL)*   ';'
    ;

libraryExport
    :   EXPORT_  STRING_LITERAL (',' STRING_LITERAL)*  ';'
    ;

getxClass:CLASS_ IDENTIFIER EXTANDS_ GETXCONTROLLER_ '{' (class_call ';' | statement)* '}' ;
blocClass : CLASS_ IDENTIFIER EXTANDS_ 'Bloc' '<' blocType ',' blocType '>' '{' blocClassArguments '}' ;
blocClassArguments : blocConstructor streamMethod;
blocConstructor : className '(' ')' ':' 'super' '(' expression ')' ';';
streamMethod : OVERRIDE_ 'Stream''<' blocType '>' 'mapEventToState' '(' className IDENTIFIER ')' 'async*'
  '{' 'yield' IDENTIFIER ';'  '}' ;

widgetClass
    :   statelessWidget | statefulWidget ;


statefulWidget
  : CLASS_ IDENTIFIER EXTANDS_ STATEFULWIDGET_ '{' (stateClass|createState )* '}'
  ;
createState : OVERRIDE_ IDENTIFIER CREATESTATE_ '(' ')' '=>' class_call ';';
stateClass
  : CLASS_ IDENTIFIER EXTANDS_ ( 'State' | 'state') '<' IDENTIFIER '>' '{' statement* widgetBuild? '}'
  ;


statelessWidget
  : CLASS_ IDENTIFIER EXTANDS_ STATELESSWIDGET_ '{' (class_call ';' | statement)*  widgetBuild '}'
  ;
 widgetBuild : OVERRIDE_ WIDGET_ BUILD_ '(' BUILDCONTEXT_ CONTEXT_ ')' '{' statement* RETURN_  widgetLiteral ';' '}' ;


widgetLiteral:  blocBuildWidget |obxWidget | scaffold | alertDialog | textButton | textField | elevatedButton | materialApp | container | sizedBox | gestureDetector | card | center |  column | row | listview | image | text;
materialApp : MaterialApp_ '(' (widgetAttribute (',' widgetAttribute)*  )? ','?  ')' ;
gestureDetector : GESTUREDETECTOR_ '(' (widgetAttribute (',' widgetAttribute)*  )? ','? ')';

scaffold : SCAFFOLD_ '(' (widgetAttribute (',' widgetAttribute)*  )? ','? ')';

container: CONTAINER_ '(' (widgetAttribute (',' widgetAttribute)*  )? ','? ')';

card: CARD_ '(' (widgetAttribute (',' widgetAttribute)*  )?  ','? ')';

textButton : TEXTBUTTON_ '(' (widgetAttribute (',' widgetAttribute)*  )? ','?  ')';


textField: 'TextField' '(' 'controller' ':' IDENTIFIER ',' 'decoration' ':' 'InputDecoration'
    '(' 'labelText' ':' STRING_LITERAL ','? ')' ','? ('obscureText' ':' constant)? ','?
     ')' ','?;

elevatedButton : ELEVATEDBUTTON_ '(' elevatedButtonAttribute*   ','?  ')';
elevatedButtonAttribute: ( onPressed | style | child );

sizedBox : SIZEDBOX_ '(' (widgetAttribute (',' widgetAttribute)*  )? ','?  ')';

alertDialog : ALERTDIALOG_ '(' title  ',' content ',' actions ','?  ')';

center: CENTER_ '(' (widgetAttribute (',' widgetAttribute)*  )? ','?  ')' ;

column: COLUMN_ '(' (widgetAttribute (',' widgetAttribute)*  )? ','? ')';

row: ROW_ '(' (widgetAttribute (',' widgetAttribute)* ',' )? ','? ')';

listview : LISTVIEW_  '(' (widgetAttribute (',' widgetAttribute)*  )? ','?  ')';

image : IMAGE_ ':' DECORATIONIMAGE_ '(' assetImage | networkImage ')' ;

text : ('text' | 'Text') '(' stringInterpolation ','? ')' ','? ;

obxWidget: 'Obx' '(' '(' ')' '=>' widgetLiteral  ','? ')'  ','? ;
blocBuildWidget : 'BlocBuilder' '<' blocType ',' blocType '>' '(' blocBuilder ')' ','?   ;
blocBuilder : 'builder' ':' '(' CONTEXT_ ',' ( 'State' | 'state') ')' '{' RETURN_ widgetLiteral ';' '}' ','? ;

assetImage : ASSETIMAGE_ '(' STRING_LITERAL ')' ;
networkImage: NETWORKIMAGE_ '(' STRING_LITERAL ')' ;

widgetAttribute :( appBar | body | onPressed | home | mainAxisAlignment | style | color | hight | width | padding |  margin | ontap | actions | theme | content | title | child | children);
appBar : APPBAR_ ':' APPBAR_ '(' title ')' ','? ;
body : 'body' ':' (bodyArguments | blocProviderStatement ) ;
style : 'style' ':' ELEVATEDBUTTON_ DOT 'styleFrom' '(' primarySwatch ')' ','? ;

bodyArguments : (CENTER_|PADDING_) '(' (widgetAttribute (',' widgetAttribute)*  )? ','? ')' ;

onPressed : ONPRESSED_ ':' ('(' ')' '{'  (navigator | statement | class_call )  '}' | expression ) ','?;
mainAxisAlignment : MAINAXISALIGNMENT_ ':' MAINAXISALIGNMENT_ DOT CENTER_  ;
child: CHILD_ class_call ','? ;
children: CHILDREN_  ( class_call  | ('[' class_call  ( ',' class_call )* ','? ']')  ) ','? ;
ontap: ONTAP_ ':' ONTAP_ ;
color: COLOR_ (HEX_COLOR | expression | boxcolor);
boxcolor : 'state' '==' IDENTIFIER DOT expression '?' 'Colors.' 'red' ':' 'Colors.' 'blue' ','? ;
hight: HIGHT_ ':'? NUMBER;
width: WIDTH_ NUMBER;
padding: PADDING_ ':'? EDGEINSET_ DOT ( ALL_ '(' NUMBER ')'| CENTER_ ) ','?;
margin: MARGIN_ EDGEINSET_ DOT ( ALL_ '(' NUMBER ')'| CENTER_ ) ;
title: TITLE_ ':' (STRING_LITERAL | ('text' | 'Text') '(' STRING_LITERAL ')'  ) ','? ;
content : CONTENT_ ':' ('text' | 'Text') '(' STRING_LITERAL ')' ;
theme : THEME_ ':' THEMEDATA_ '(' primarySwatch ')' ','?;
primarySwatch : ('primarySwatch'| 'primary' ) ':' 'Colors.'(HEX_COLOR|( 'red' | 'blue' )) ','? ;
home : HOME_ ':' blocProviderStatement ;
actions : ACTIONS_ ':' ( class_call  | '[' class_call  ( ',' class_call )* ',' ']'  ) ','? ;




blocProviderStatement: 'BlocProvider' ('<' blocType '>')? '(' blocProviderArguments ')' ','? ';'?;
blocType: className;
blocProviderArguments: 'create' ':' createStatement ',' child ','? ;
createStatement: '(' ('context'| IDENTIFIER)? ')' '=>' className '(' ')';

navigator: navigatortype ';';
navigatortype: (navigatorPop | navigatorPush | navigatorPushReplacement) ;
navigatorPop : NAVIGATOR_ '.' 'of' '(' CONTEXT_ ')' '.pop()' ;
navigatorPush : NAVIGATOR_ '.' PUSH_ '(' CONTEXT_ ',' materialPageRoute ','? ')';
navigatorPushReplacement : NAVIGATOR_ '.' PUSHREPLACEMENT_ '(' CONTEXT_ ',' materialPageRoute ','? ')' ;

materialPageRoute :MATERIALPAGEROUTE_ '(' BUILDER_ ':' '(' CONTEXT_ ')' '=>' className '(' ( IDENTIFIER ':' IDENTIFIER )? ')' ','? ')' ','? ;

mainClass : VOID_ MAIN_ '(' ')' '{'   runApp statement* '}';
runApp : 'runApp' '(' IDENTIFIER '(' ')' ')' ';';
className : IDENTIFIER ;

function_call :  IDENTIFIER '('  ( class_call| expression)? ')' ;

class_call : ((CONST_)? IDENTIFIER '(' classArgument? ')' | widgetLiteral | blocCall | function_call );
classArgument : (expression | namedArgument | required );

blocCall : 'BlocProvider' DOT 'of' '<' blocType '>' '(' (CONTEXT_ | blocProviderArguments ) ')'  ;

namedArgument
  : IDENTIFIER ':' expression
  ;

required : '{' 'required' 'this' DOT IDENTIFIER '}' ;

statement : ifStatement
    | showDialogStatement
    | enumStatement
    | varDeclaration
	| whileStatement
	| printStatement
	| varAssignment
	| blockStatement
	| methodcallStatement
	| methodStatement
	| setStateStatement
	| navigator
	;

setStateStatement: SETSTATE_ '(' '(' ')' '{' statement* '}' ')' ';' ;
methodStatement
: OVERRIDE_? type IDENTIFIER '(' (type IDENTIFIER (',' type IDENTIFIER)*)? ')' '{'statement* '}' ;

showDialogStatement : SHOWDIALOG_ '(' showDialogProperities ','? ')' ';';
showDialogProperities : CONTEXT_ ':' CONTEXT_ ',' showDialogBuilder;
showDialogBuilder : BUILDER_ ':' '(' 'BuildContext' CONTEXT_ ')' '{' RETURN_ widgetLiteral ';' '}';

methodcallStatement: IDENTIFIER'.'(function_call | IDENTIFIER) ';' ;
blockStatement : '{' (statement)* '}';
varDeclaration : FINAL_? type IDENTIFIER ( '=' ( expression | class_call )  )? ';' ;
ifStatement : IF_ '(' expression ')' statement (elseCond)? ;
elseCond : ELSE_ statement ;
whileStatement: WHILE_ '(' expression ')' statement* ;
printStatement : PRINT_ '(' expression ')' ';' ;
varAssignment : IDENTIFIER '=' expression ';' ;
enumStatement : 'enum' IDENTIFIER '{' constant (',' constant)* '}';

expression
  : '(' expression ')'                                                         #parenExpr
  | '!' expression                                                               #notExpr
  | expression ('*' | '/' | '÷') expression                                     #multiplication
  | expression ('+' | '-') expression                                           #addition
  | expression '<' expression                                                    #lessThan
  | expression '&&' expression                                                   #and
  | expression '==' expression                                                   #equal
  | expression '!=' expression                                                   #notequal
  | expression '[' expression ']'                                                #indexArray
  | expression '.' ('length' | 'text' | IDENTIFIER)                               #propertyAccess
  | expression '(' (expression (',' expression)*)? ')'                          #methodCall
  |expression '?' expression ':' expression                                    #ternary
  | constant                                                                     #constantVal
  | objectAccess (IDENTIFIER|constant)                                           #fieldAccess
  | IDENTIFIER                                                                   #idCall
  | NEW_ INT '[' expression ']'                                                  #newArray
  | NEW_ className '(' ')'                                                       #newClass
  | '{' expression '}'                                                           #exprBlock
  ;





objectAccess: (IDENTIFIER '.')* ;

type : INT '[' ']'
	| VAR
	| BOOLEAN
	| INT
	| FLOAT
	| VOID_
	| FINAL_
	| className
	;


constant :  colorName |TRUE | FALSE | NULL | NUMBER | STRING_LITERAL;

colorName : ( 'red' | 'blue' ) ;


IMPORT_:'import';
EXPORT_:'export';
WIDGET_:'Widget';
GESTUREDETECTOR_: 'GestureDetector';
STATELESSWIDGET_:'StatelessWidget';
STATEFULWIDGET_:'StatefulWidget';
BUILD_:'build';
BUILDCONTEXT_:'BuildContext';
CONTEXT_:'context';
CHILD_:'child:';
CHILDREN_:'children:';
CARD_:'card';
CENTER_:('center' | 'Center' );
COLUMN_:'column' | 'Column';
ROW_:( 'Row' |'row');
MaterialApp_: 'MaterialApp';
FINAL_: 'final';
LISTVIEW_:'listview';
IMAGE_:'Image';
DECORATIONIMAGE_:'DecorationImage';
ASSETIMAGE_:'Image:AssetImage';
NETWORKIMAGE_:'Image:NetworkImage';
ONTAP_:'onTap';
ONPRESSED_ : 'onPressed';
COLOR_:'color:';
HIGHT_:( 'height:' |'hight:');
WIDTH_:'width:';
PADDING_:('padding'| 'Padding');
EDGEINSET_:('EdgeInset'|'EdgeInsets');
ALL_:'all';
MARGIN_:'margin';
TITLE_: 'title';
THEME_:'theme';
THEMEDATA_ : 'ThemeData';
HOME_:'home';
IF_:'if';
ELSE_:'else';
WHILE_:'while';
PRINT_:'print';
ACTIONS_: 'actions';
DOT:'.';
CONTAINER_:'Container';
OVERRIDE_:'@override';
EXTANDS_:'extends';
RETURN_:'return';
NEW_:'new';
PUBLIC_:'public';
CLASS_:'class';
MAIN_:'main';
VOID_: 'void';
FLOAT: 'float';
INT : 'int' ;
VAR : 'var';
BOOLEAN : ('boolean' | 'bool' );
FLOAT_LITERAL :'g';
NULL:('null' | 'NULL');
TRUE: 'true';
FALSE:'false';
CONST_ : 'const';
CREATESTATE_:  'createState';
SETSTATE_: 'setState';
NAVIGATOR_ : 'Navigator';
PUSH_ : 'push';
MATERIALPAGEROUTE_ :'MaterialPageRoute';
BUILDER_ : 'builder';
PUSHREPLACEMENT_ : 'pushReplacement';
TEXTBUTTON_:'TextButton';
SHOWDIALOG_:'showDialog';
ALERTDIALOG_ :'AlertDialog';
CONTENT_: 'content';
SCAFFOLD_ : 'Scaffold';
APPBAR_: ('appBar' | 'AppBar');
MAINAXISALIGNMENT_ : ('mainAxisAlignment' | 'MainAxisAlignment');
SIZEDBOX_: 'SizedBox';
ELEVATEDBUTTON_: 'ElevatedButton';
GETXCONTROLLER_ : 'GetxController';
//COLOR_NAME: ( 'red' | 'blue' );

stringInterpolation
  : STRING_LITERAL
  | STRING_LITERAL interpolationPart
  ;

interpolationPart
  : '$' IDENTIFIER
  ;


STRING_LITERAL
  : '"' (ESC_SEQ | ~('\\'|'"'))* '"'
  | '\'' (ESC_SEQ | ~('\\'|'"'))* '\''
  ;



  fragment
  ESC_SEQ
   : '\\"'
   | '\\\\'
 //  | '\\/'
   | '\\b'
   | '\\f'
   | '\\n'
   | '\\r'
   | '\\t'
   ;

HEX_COLOR: '#' (HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT);
NUMBER: DIGIT+ ('.' DIGIT+)?;
fragment DIGIT: '0'..'9';
fragment HEX_DIGIT: DIGIT | 'a'..'f' | 'A'..'F';
IDENTIFIER
  : '_'? [a-zA-Z_][a-zA-Z0-9_]*
  ;

WS: [ \t\r\n]+ -> skip;
LINE_COMMENT : '//' ~('\n' | '\r')* -> skip;
//MULTI_COMMENT : '/*' .* '*/' -> skip;
