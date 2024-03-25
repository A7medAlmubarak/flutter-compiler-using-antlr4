package AST.expression;

public class block extends Expression {
    public Expression expression;

    public block(){
        this.expression = new Expression();
    }
    public void addChild( Expression expression ){
        this.expression = expression;
    }

    @Override
    public String generateJSCode() {
        return ( "{" + expression.generateJSCode() + "}");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  "{ " + expression.toString()+" } ";
    }

}
