package AST.expression;

public class indexArray extends Expression{
     Expression array;
     Expression index;

    public indexArray(Expression array, Expression index) {
        this.array = array;
        this.index = index;
    }

    public Expression getArray() {
        return array;
    }

    public Expression getIndex() {
        return index;
    }

    @Override
    public String generateJSCode() {
        String arrayCode = array.generateJSCode();
        String indexCode = index.generateJSCode();
        return arrayCode + "[" + indexCode + "]";
    }

    @Override
    public String toString() {
        return array.toString() + "[" + index.toString() + "]";
    }



}
