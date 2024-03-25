package AST.statement;

import AST.expression.Expression;

public class varAssignment extends Statement{
    private String identifier;
    private Expression expression;

    public varAssignment() {
        this.identifier = new String();
        this.expression = new Expression();
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
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
        return identifier + " = " + expression.generateJSCode() + ";";
    }

    @Override
    public String toString() {
        return identifier + " = " + expression.toString() + ";";
    }


}
