package AST.statement;

import AST.expression.Expression;
import AST.function.function_call;

import java.util.ArrayList;
import java.util.List;

public class methodStatement extends Statement{
 /*   methodStatement
: OVERRIDE_? type IDENTIFIER '(' (type IDENTIFIER (',' type IDENTIFIER)*)? ')' '{'statement* '}' ;*/

    public String methodType;
    public String methodId;
    public String parameterType;
    public String parameterId;
    public List<Statement> statements;
    public methodStatement() {
        this.methodType = new String();
        this.methodId = new String();
        this.parameterType = new String();
        this.parameterId = new String();
        this.statements = new ArrayList<Statement>();
    }

    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType;
    }

    public void setParameterId(String parameterId) {
        this.parameterId = parameterId;
    }

    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }

    public void setStatement (Statement statement) {
        statements.add(statement);
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
        codeBuilder.append( methodType +" " +methodId +"(");
        if (parameterType != null) {
            codeBuilder.append(parameterType +" " +parameterId );
        }
        codeBuilder.append(") {");
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
        return "methodStatement(" + statements.toString() + ");";
    }


}
