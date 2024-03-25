package AST.expression;

public class Ternary extends Expression {
     Expression condition;
     Expression trueExpression;
     Expression falseExpression;

    public Ternary(Expression condition, Expression trueExpression, Expression falseExpression) {
        this.condition = condition;
        this.trueExpression = trueExpression;
        this.falseExpression = falseExpression;
    }

    public Expression getCondition() {
        return condition;
    }

    public Expression getTrueExpression() {
        return trueExpression;
    }

    public Expression getFalseExpression() {
        return falseExpression;
    }

    @Override
    public String generateJSCode() {
        String conditionCode = condition.generateJSCode();
        String trueExpressionCode = trueExpression.generateJSCode();
        String falseExpressionCode = falseExpression.generateJSCode();
        return "(" + conditionCode + " ? " + trueExpressionCode + " : " + falseExpressionCode + ")";
    }

    @Override
    public String toString() {
        String conditionString = condition.toString();
        String trueExpressionString = trueExpression.toString();
        String falseExpressionString = falseExpression.toString();
        return "(" + conditionString + " ? " + trueExpressionString + " : " + falseExpressionString + ")";
    }

}
