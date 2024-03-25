package AST.statement;

public class elseCondStatement extends Statement{


    Statement statement;

    public elseCondStatement() {
        this.statement = new Statement();
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public Statement getStatement() {
        return statement;
    }

    @Override
    public String generateHTMLCode(){
        return statement.generateHTMLCode();
    }

    @Override
    public String generateCSSCode(){
        return statement.generateCSSCode();
    }

    @Override
    public String generateJSCode(){
        return "else {\n" + statement.generateJSCode() + "\n}";
    }

    @Override
    public String toString() {
        return "else " + statement.toString();
    }


}
