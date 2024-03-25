package AST.widget.widgetAttribute;

import AST.Node;
import AST.expression.Expression;
import AST.function.class_call;
import AST.statement.Statement;
import AST.statement.navigator.navigator;

public class onPressed extends widgetAttribute{

    public Statement statement;
    public navigator navigator;
    public class_call class_call;
    public Expression expression;

    public Node node;

    public onPressed(){
        this.node= new Node();
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setStatement(Statement statement){
        this.statement= statement;
    }

    public void setNavigator(navigator navigator){
        this.navigator= navigator;
    }

    public void setClass_call(class_call class_call){
        this.class_call= class_call;
    }

    public String generateHTMLCode(String widgetParent) {
        return null;
    }

    public String generateCSSCode(String widgetParent) {
        return null;
    }

    public String generateJSCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();
        //stringBuilder.append(widgetParent+".addEventListener(\'click\', function() {\n");
        if (class_call != null) {
            class_call.generateJSCode();
            stringBuilder.append("} \n");
        }

        if (navigator != null) {
            navigator.generateJSCode(widgetParent);
        }
        System.out.println("\n----sss");

        if (statement != null) {
            stringBuilder.append(widgetParent+".addEventListener(\'click\', function() {\n");
            statement.generateJSCode();
            stringBuilder.append("} \n");
        }
        if (expression != null) {
            stringBuilder.append(widgetParent+".addEventListener(\'click\', function() {\n");
            expression.generateJSCode();
            stringBuilder.append("} \n");
        }

        return stringBuilder.toString();

    }

    @Override
    public String generateHTMLCode() {
        return null;
    }

    @Override
    public String generateCSSCode() {
        return null;
    }

    @Override
    public String generateJSCode() {
        return null;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "padding:" ;

    }

}
