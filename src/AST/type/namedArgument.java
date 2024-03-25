package AST.type;

import AST.Node;
import AST.expression.Expression;

public class namedArgument {
    String id;

    Expression expression;
    Node node;

    public namedArgument(){
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }


    public String generateJSCode(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(id + ":"+ expression.generateJSCode());
        return stringBuilder.toString();
    }

}
