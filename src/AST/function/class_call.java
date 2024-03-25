package AST.function;

import AST.Node;
import AST.widget.Widget;
import AST.widget.blocBuild.blocCall;
import org.stringtemplate.v4.ST;

public class class_call {
    Node node;
    classArgument classArgument;
    Widget widgetLiteral;
    blocCall blocCall;

    function_call function_call;

    String id;


    public class_call(){
        this.node = new Node();
    }

    public void setNode(Node node) {
        this.node = node;
    }


    public void setBlocCall(blocCall blocCall) {
        this.blocCall = blocCall;
    }
    public void setFunction_call(function_call function_call) {
        this.function_call = function_call;
    }

    public void setWidgetLiteral(Widget widgetLiteral) {
        this.widgetLiteral = widgetLiteral;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClassArgument(classArgument classArgument) {
        this.classArgument = classArgument;
    }

    public String generateHTMLCode(){
        StringBuilder stringBuilder = new StringBuilder();
        if (widgetLiteral != null) {
            stringBuilder.append(widgetLiteral.generateHTMLCode());

        }
        if (function_call != null) {
            stringBuilder.append(function_call.generateHTMLCode());
        }
        return stringBuilder.toString();
    }

    public String generateCSSCode(){
        StringBuilder stringBuilder = new StringBuilder();
        if (widgetLiteral != null) {
            stringBuilder.append(widgetLiteral.generateCSSCode());
        }
        if (function_call != null) {
            stringBuilder.append(function_call.generateCSSCode());
        }

        return stringBuilder.toString();
    }

    public String generateJSCode(){
        StringBuilder stringBuilder = new StringBuilder();
        if (classArgument != null && id == null) {
            stringBuilder.append(id+"(" + classArgument.generateJSCode() + ")");
        }
        if (classArgument == null && id != null) {
            stringBuilder.append(id+"( )");
        }
        if (function_call != null) {
            stringBuilder.append(function_call.generateJSCode());
        }

        if (widgetLiteral != null) {
            stringBuilder.append(widgetLiteral.generateJSCode());
        }
        return stringBuilder.toString();
    }

    public String toString() {
         return "else " ;
    }


    //class_call : ((CONST_)? IDENTIFIER '(' classArgument? ')' | widgetLiteral | blocCall | function_call );
}
