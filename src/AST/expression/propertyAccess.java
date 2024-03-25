package AST.expression;

import org.stringtemplate.v4.ST;

public class propertyAccess extends Expression{


    Expression expression;
    String value;

    public propertyAccess(Expression array, String value) {
        this.expression = array;
        this.value = value;
    }

    public Expression getExpression() {
        return expression;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String generateJSCode() {
        return expression.generateJSCode() + "." + value;
    }

    @Override
    public String toString() {
        return expression.toString() + "." + value;
    }



}
