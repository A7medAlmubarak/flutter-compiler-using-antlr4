package AST.statement;

import AST.expression.Expression;
import AST.function.function_call;

public class methodcallStatement extends Statement{
    public String methodName;
    public String id;
    public function_call function_call;

    public methodcallStatement() {
        this.methodName = new String();
        this.id = new String();
        this.function_call = new function_call();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFunction_call(function_call function_call) {
        this.function_call = function_call;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
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
        codeBuilder.append(methodName + ".");
        if (function_call != null) {
            codeBuilder.append(function_call.generateJSCode());
        }
        if (id != null) {
            codeBuilder.append(id);
        }
        return codeBuilder.toString();
    }

    @Override
    public String toString() {
        return "methodcallStatement(" + function_call.toString() + ");";
    }

}
