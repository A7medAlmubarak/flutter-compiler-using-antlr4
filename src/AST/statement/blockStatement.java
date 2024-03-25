package AST.statement;

import java.util.ArrayList;
import java.util.List;

public class blockStatement extends Statement{
    private List<Statement> statements;

    public blockStatement() {
        this.statements = new ArrayList<>();
    }

    public void addStatement(Statement statement) {
        statements.add(statement);
    }

    public List<Statement> getStatements() {
        return statements;
    }


    public String generateHTMLCode(){
        StringBuilder codeBuilder = new StringBuilder();
        for (int i = 0; i < statements.size(); i++) {
            Statement statement = statements.get(i);
            if (statement != null) {
                codeBuilder.append(statement.generateHTMLCode());
            }
        }

        return codeBuilder.toString();
    }

    public String generateCSSCode(){
        StringBuilder codeBuilder = new StringBuilder();
        for (int i = 0; i < statements.size(); i++) {
            Statement statement = statements.get(i);
            if (statement != null) {
                codeBuilder.append(statement.generateCSSCode());
            }
        }
        return codeBuilder.toString();
    }

    public String generateJSCode(){
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append("{\n");
        for (int i = 0; i < statements.size(); i++) {
            Statement statement = statements.get(i);
            if (statement != null) {
                codeBuilder.append(statement.generateJSCode());
            }
        }

        codeBuilder.append("}");

        return codeBuilder.toString();
    }


    @Override
    public String toString() {
        StringBuilder stringRepresentationBuilder = new StringBuilder();
        stringRepresentationBuilder.append("{\n");
        for (Statement statement : statements) {
            stringRepresentationBuilder.append(statement).append("\n");
        }
        stringRepresentationBuilder.append("}");

        return stringRepresentationBuilder.toString();
    }

}
