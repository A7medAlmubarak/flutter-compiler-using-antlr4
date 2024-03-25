package AST.function;

import AST.Node;
import AST.expression.Expression;
import AST.type.namedArgument;
import AST.type.required;

public class function_call {
//function_call :  IDENTIFIER '('  ( class_call| expression)? ')' ;
    Node node ;
    String functionName;
    String expression;
    class_call class_call;


    public function_call(){
    }

    public void setNode(Node node) {
        this.node = node;
    }


    public void setExpression(String expression) {
        this.expression = expression;
    }
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void setClass_call(class_call class_call ) {
        this.class_call  = class_call ;
    }

    public String generateHTMLCode(){
        StringBuilder stringBuilder = new StringBuilder();
        if (class_call != null) {
            stringBuilder.append(class_call.generateHTMLCode());
        }
        return stringBuilder.toString();
    }

    public String generateCSSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        if (class_call != null) {
            stringBuilder.append(class_call.generateCSSCode());
        }
        return stringBuilder.toString();
    }

    public String generateJSCode(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append( functionName +"(");

        if (expression != null) {
            stringBuilder.append( expression );
        }
        if (class_call != null) {
            stringBuilder.append(class_call.generateJSCode());
        }
        stringBuilder.append( ")");
        return stringBuilder.toString();
    }

}
