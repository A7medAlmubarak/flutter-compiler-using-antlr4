package AST.expression;

public class fieldAccess extends Expression{

    private Expression objectAccess;
    private String identifier;

    public fieldAccess() {
    }

    public Expression getObjectAccess() {
        return objectAccess;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String generateJSCode() {

        return identifier;
    }

    @Override
    public String toString() {
        return  identifier;
    }

    public void setObjectAccess(Expression objectAccess) {
        this.objectAccess = objectAccess;
    }

    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }
}
