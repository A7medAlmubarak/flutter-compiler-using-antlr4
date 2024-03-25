package AST.expression;

public class notEqual extends Expression{

    Expression left;
    Expression right;

    public notEqual(Expression left, Expression right) {
        super();
        this.left = left;
        this.right = right;
    }

    @Override
    public String generateJSCode() {
        return (left.generateJSCode() + " != " + right.generateJSCode());
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return left.toString()+ " != " +right.toString();
    }
}
