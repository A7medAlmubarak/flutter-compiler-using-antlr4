package AST.statement;

import AST.expression.Expression;
import AST.expression.constant;

import java.util.ArrayList;
import java.util.List;

public class enumStatement extends Statement{

    private String identifier;
    private List<constant> constants;

    public enumStatement() {
        this.identifier = new String();
        this.constants = new ArrayList<constant>();
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void addConstants(constant constant) {
        this.constants.add(constant);
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<constant> getConstants() {
        return constants;
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
        codeBuilder.append("const ").append(identifier).append(" = {\n");
        for (int i = 0; i < constants.size(); i++) {
            codeBuilder.append("  ").append(constants.get(i).generateJSCode() ).append(": ").append(i);
            if (i < constants.size() - 1) {
                codeBuilder.append(",");
            }
            codeBuilder.append("\n");
        }
        codeBuilder.append("};");
        return codeBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentationBuilder = new StringBuilder();
        stringRepresentationBuilder.append("enum ").append(identifier).append(" { ");
        for (int i = 0; i < constants.size(); i++) {
            stringRepresentationBuilder.append(constants.get(i));
            if (i < constants.size() - 1) {
                stringRepresentationBuilder.append(", ");
            }
        }
        stringRepresentationBuilder.append(" }");
        return stringRepresentationBuilder.toString();
    }


}
