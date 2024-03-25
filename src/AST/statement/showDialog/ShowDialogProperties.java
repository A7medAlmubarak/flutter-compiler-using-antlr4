package AST.statement.showDialog;

import AST.statement.Statement;

public class ShowDialogProperties {
    public String context1;
    public String context2;
    public ShowDialogBuilder builder;

    public ShowDialogProperties() {
        this.context1 = new String();
        this.context2 = new String();
        this.builder = new ShowDialogBuilder();
    }

    public void setBuilder(ShowDialogBuilder builder) {
        this.builder = builder;
    }

    public void setContext1(String context1) {
        this.context1 = context1;
    }

    public void setContext2(String context2) {
        this.context2 = context2;
    }

    public String getContext1() {
        return context1;
    }

    public String getContext2() {
        return context2;
    }

    public ShowDialogBuilder getBuilder() {
        return builder;
    }


    public String generateHTMLCode(){
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(builder.generateHTMLCode());
        return codeBuilder.toString();
    }
    public String generateCSSCode(){
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(builder.generateCSSCode());
        return codeBuilder.toString();
    }
    public String generateJSCode(){
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(builder.generateJSCode());
        return codeBuilder.toString();
    }
    @Override
    public String toString() {
        return "context1: context , context:context , builder: " + builder.toString();
    }


}
