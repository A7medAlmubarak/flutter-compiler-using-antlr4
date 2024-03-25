package AST.widget.blocBuild;

import AST.Node;
import AST.expression.Expression;
import AST.widget.widgetAttribute.child;

public class blocConstructor {
    //blocConstructor : className '(' ')' ':' 'super' '(' expression ')' ';';
    public String className;
    public Expression expression;
    public Node node;

    public blocConstructor(){
        this.className= new String();
        this.expression= new Expression();
        this.node= new Node();
    }

    public void setNode(Node node){
        this.node = node;
    }
    public void setClassName(String className){
        this.className = className;
    }
    public void setExpression(Expression expression){
        this.expression = expression;
    }


    public String generateHTMLCode() {
        return null;
    }

    public String generateCSSCode() {
        return null;
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(expression.generateJSCode());
        return stringBuilder.toString();
    }
    @Override
    public String toString() {
        return "blocConstructor " +className+" (" +
                "expression:" + expression.toString() +
                ')';
    }

}
