package AST.statement;

import AST.expression.Expression;

public class varDeclaration extends Statement {

    private String type;
    private String identifier;
    private Expression expression;

    public varDeclaration() {
        this.type = new String();
        this.identifier = new String();
        this.expression = new Expression();
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
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
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append("let ");
        codeBuilder.append(identifier);
        if (expression != null) {
            codeBuilder.append(" = ").append(expression.generateJSCode());
        }
        codeBuilder.append(";");

        return codeBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentationBuilder = new StringBuilder();
        stringRepresentationBuilder.append(type).append(" ").append(identifier);
        if (expression != null) {
            stringRepresentationBuilder.append(" = ").append(expression.toString());
        }
        stringRepresentationBuilder.append(";");

        return stringRepresentationBuilder.toString();
    }

}
