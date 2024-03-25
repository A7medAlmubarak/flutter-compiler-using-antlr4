package AST.expression;

public class newArray extends Expression{
     Expression size;

    public newArray(Expression size) {
        this.size = size;
    }

    public Expression getSize() {
        return size;
    }

    @Override
    public String generateJSCode() {
        return "new Array(" + size.generateJSCode() + ")";
    }

    @Override
    public String toString() {
        return "new Array(" + size.toString() + ")";
    }


}
