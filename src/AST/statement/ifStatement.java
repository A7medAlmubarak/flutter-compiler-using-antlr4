package AST.statement;

import AST.expression.Expression;

import java.util.ArrayList;

public class ifStatement extends Statement{
    public Expression condition;
    public Statement statement;
    public Statement elseStatement;



    public ifStatement() {
        this.condition = new Expression();
        this.statement = new Statement();
        this.elseStatement = elseStatement;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public void setElseStatement(Statement elseStatement) {
        this.elseStatement = elseStatement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public Expression getCondition() {
        return condition;
    }

    public Statement getStatement() {
        return statement;
    }

    public Statement getElseStatement() {
        return elseStatement;
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
        codeBuilder.append("if (").append(condition.generateJSCode()).append(") {\n");
        codeBuilder.append(statement.generateJSCode()).append("\n");
        codeBuilder.append("}");

        if (elseStatement != null) {
            codeBuilder.append("\n");
            codeBuilder.append(elseStatement.generateJSCode()).append("\n");
        }
        return codeBuilder.toString();

    }

    @Override
    public String toString() {
        StringBuilder stringRepresentationBuilder = new StringBuilder();
        stringRepresentationBuilder.append("if (").append(condition).append(") {\n");
        stringRepresentationBuilder.append(statement).append("\n");
        stringRepresentationBuilder.append("}");

        if (elseStatement != null) {
            stringRepresentationBuilder.append(" else {\n");
            stringRepresentationBuilder.append(elseStatement).append("\n");
            stringRepresentationBuilder.append("}");
        }

        return stringRepresentationBuilder.toString();
    }


}
