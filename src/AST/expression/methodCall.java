package AST.expression;
import java.util.ArrayList;
import java.util.List;

public class methodCall extends Expression{

    private Expression methodName;
    private List<Expression> arguments;

    public methodCall(Expression methodName, List<Expression> arguments) {
        this.methodName = methodName;
        this.arguments = arguments;
    }

    public Expression getMethodName() {
        return methodName;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    @Override
    public String generateJSCode() {
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(methodName.generateJSCode());
        codeBuilder.append("(");
        if (arguments != null && !arguments.isEmpty()) {
            for (int i = 0; i < arguments.size(); i++) {
                codeBuilder.append(arguments.get(i).generateJSCode());
                if (i < arguments.size() - 1) {
                    codeBuilder.append(", ");
                }
            }
        }
        codeBuilder.append(")");
        return codeBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentationBuilder = new StringBuilder();
        stringRepresentationBuilder.append(methodName.toString());
        stringRepresentationBuilder.append("(");
        if (arguments != null && !arguments.isEmpty()) {
            for (int i = 0; i < arguments.size(); i++) {
                stringRepresentationBuilder.append(arguments.get(i).toString());
                if (i < arguments.size() - 1) {
                    stringRepresentationBuilder.append(", ");
                }
            }
        }
        stringRepresentationBuilder.append(")");
        return stringRepresentationBuilder.toString();
    }

}
