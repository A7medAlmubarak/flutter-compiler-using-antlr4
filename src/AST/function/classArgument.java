package AST.function;

import AST.Node;
import AST.expression.Expression;
import AST.type.namedArgument;
import AST.type.required;
import AST.widget.Widget;
import AST.widget.blocBuild.blocCall;

public class classArgument {

    Expression expression;
    namedArgument namedArgument;
    Node node;
    required required;

    public classArgument(){
    }

    public void setNode(Node node) {
        this.node = node;
    }


    public void setExpression(Expression expression) {
        this.expression = expression;
    }
    public void setNamedArgument(namedArgument namedArgument) {
        this.namedArgument = namedArgument;
    }

    public void setRequired(required required) {
        this.required = required;
    }

    public String generateHTMLCode(){
        return null;
    }

    public String generateCSSCode(){

        return null;
    }

    public String generateJSCode(){
        StringBuilder stringBuilder = new StringBuilder();
        if (expression != null) {
            stringBuilder.append(expression.generateJSCode());
        }
        if (required != null) {
            stringBuilder.append(required.generateJSCode());
        }
        if (namedArgument != null) {
            stringBuilder.append(namedArgument.generateJSCode());
        }
        return stringBuilder.toString();
    }
    public String toString() {
        return "--------------classArgumenttttttttttttttt----------- " ;
    }


}
