package AST.statement.showDialog;

import AST.statement.Statement;

public class showDialog extends Statement {
    ShowDialogProperties properties;

    public showDialog() {
        this.properties = new ShowDialogProperties();
    }

    public void setProperties(ShowDialogProperties properties) {
        this.properties = properties;
    }

    public ShowDialogProperties getProperties() {
        return properties;
    }


    public String generateHTMLCode(){
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(properties.generateHTMLCode());
        return codeBuilder.toString();
    }
    public String generateCSSCode(){
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(properties.generateCSSCode());
        return codeBuilder.toString();
    }
    public String generateJSCode(){
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(properties.generateJSCode());
        return codeBuilder.toString();
    }

    @Override
    public String toString() {
        return "ShowDialog(" + properties.toString() + ");";
    }

}
