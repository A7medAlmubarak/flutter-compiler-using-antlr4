package AST.statement.navigator;

import AST.statement.Statement;

public class navigator extends Statement {
     navigatorType type;
    public navigator() {
        this.type = new navigatorType();
    }

    public void setNavigator(navigatorType type ) {
        this.type = type;
    }

    public navigatorType getNavigatorType() {
        return type;
    }

    public String generateHTMLCode() {
        return type.generateHTMLCode();
    }

    public String generateCSSCode() {
        return type.generateCSSCode();
    }

    public String generateJSCode() {
        return type.generateJSCode();
    }




}
