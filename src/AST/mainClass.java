package AST;
import AST.statement.Statement;

import java.util.ArrayList;

public class mainClass {

    public runApp runApp;

    public ArrayList<Statement> statements;

    public mainClass(){
        this.statements = new ArrayList<>();
    }

    public void setRunApp(AST.runApp runApp) {
        this.runApp = runApp;
    }
    public void addChild(Statement stat) {
        this.statements.add(stat);
    }
    public String generateHTMLCode(){
        return null;
    }
    public String generateCSSCode(){
        return null;
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < statements.size(); i++) {
            Statement statement = statements.get(i);
            if (statement != null) {
                stringBuilder.append(statement.generateJSCode());
            }
        }

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "void main () { statements : "+statements+" }";
    }


}
