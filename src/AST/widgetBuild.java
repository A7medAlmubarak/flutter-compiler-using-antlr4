package AST;

import AST.statement.Statement;
import AST.widget.Widget;

import java.util.ArrayList;

public class widgetBuild {
// widgetBuild : OVERRIDE_ WIDGET_ BUILD_ '(' BUILDCONTEXT_ CONTEXT_ ')' '{' statement* RETURN_  widgetLiteral ';' '}' ;
    public ArrayList<Statement> statements;
    Node node;
    Widget widget;
    public widgetBuild(){
        this.statements = new ArrayList<>();
    }


    public void setWidget(Widget widget) {
        this.widget = widget;
    }
    public void setNode(Node node) {
        this.node = node;
    }

    public void setStatement(Statement stat) {
        this.statements.add(stat);
    }

    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        if( widget != null){
            stringBuilder.append(widget.generateHTMLCode());
        }
        for (int i = 0; i < statements.size(); i++) {
            Statement statement = statements.get(i);
            if (statement != null) {
                stringBuilder.append(statement.generateHTMLCode());
            }
        }

        return stringBuilder.toString();
    }

    public String generateCSSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        if( widget != null){
            stringBuilder.append(widget.generateCSSCode());
        }
        for (int i = 0; i < statements.size(); i++) {
            Statement statement = statements.get(i);
            if (statement != null) {
                stringBuilder.append(statement.generateCSSCode());
            }
        }
        return stringBuilder.toString();
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        if( widget != null){
            stringBuilder.append(widget.generateJSCode());
        }

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
        return "widgetBuild ( statement : "+ statements.toString()+", widget : "+widget.toString()+"" +
                " )";
    }
}
