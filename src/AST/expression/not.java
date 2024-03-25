package AST.expression;

public class not extends Expression {
    public Expression expression;

    public not(){
        this.expression = new Expression();
    }
    public void addChild( Expression expression ){
        this.expression = expression;
    }

    @Override
    public String generateJSCode() {
        return (" !" + expression.generateJSCode());
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  " !" + expression.toString();
    }
}
