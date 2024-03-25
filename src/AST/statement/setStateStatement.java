package AST.statement;

import java.util.ArrayList;
import java.util.List;

public class setStateStatement extends Statement{

    public List<Statement> statements;

    public setStateStatement() {
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
                codeBuilder.append(statement.generateHTMLCode());
            }
        }

        codeBuilder.append("}");

        return codeBuilder.toString();
    }


    @Override
    public String toString() {
        StringBuilder stringRepresentationBuilder = new StringBuilder();
        stringRepresentationBuilder.append("{\n");
        for (int i = 0; i < statements.size(); i++) {
            Statement statement = statements.get(i);
            if (statement != null) {
                stringRepresentationBuilder.append(statement.generateHTMLCode());
            }
        }

        stringRepresentationBuilder.append("}");

        return stringRepresentationBuilder.toString();
    }

}
