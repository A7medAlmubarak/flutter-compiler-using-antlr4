package AST.statement;

import AST.expression.Expression;

import java.util.ArrayList;

public class printStatement extends Statement{
    private Expression expression;

    public printStatement() {
        this.expression = new Expression();
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }


    @Override
    public String generateHTMLCode(){
        return null;
    }

    @Override
    public String generateCSSCode(){
        return null;
    }

    @Override
    public String generateJSCode(){
        return "console.log(" + expression.generateJSCode() + ");";
    }

    @Override
    public String toString() {
        return "print(" + expression.toString() + ");";
    }
}
