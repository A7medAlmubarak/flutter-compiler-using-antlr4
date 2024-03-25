package AST.statement;

import AST.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class whileStatement extends Statement{
    private Expression expression;

    private List<Statement> statements;

    public whileStatement() {
        this.expression = new Expression();
        this.statements = new ArrayList<Statement>();
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setStatement(Statement statement) {
        this.statements.add(statement);
    }

    public Expression getExpression() {
        return expression;
    }

    public List<Statement> getStatement() {
        return statements;
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
        codeBuilder.append("while (").append(expression.generateJSCode()).append(") {\n");
        for (int i = 0; i < statements.size(); i++) {
            Statement statement = statements.get(i);
            if (statement != null) {
                codeBuilder.append(statement.generateJSCode());
            }
        }
        codeBuilder.append("\n}");
        return codeBuilder.toString();
    }

    @Override
    public String toString() {
        return "while (" + expression.toString() + ") " + statements.toString();
    }
}
