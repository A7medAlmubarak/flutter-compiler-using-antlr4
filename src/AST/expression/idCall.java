package AST.expression;

public class idCall extends  Expression{
    public String Value;
    public idCall(String Value) {
        this.Value = Value;
    }

    @Override
    public String generateJSCode() {
        return (Value);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return Value;
    }

}
