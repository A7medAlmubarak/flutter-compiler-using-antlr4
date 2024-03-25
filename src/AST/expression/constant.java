package AST.expression;

public class constant extends Expression {
    public String Value;
    public constant() {
    this.Value = new String();
    }
    public constant(String Value) {
        super();
        this.Value = Value;
    }


    public void setValue(String value) {
        Value = value;
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
