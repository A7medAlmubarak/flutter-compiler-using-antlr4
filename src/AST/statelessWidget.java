package AST;

import AST.function.class_call;
import AST.statement.Statement;
import AST.widget.Widget;

import java.util.ArrayList;

public class statelessWidget extends widgetClass{

    public String ClassName;
    public widgetBuild widgetBuild;
    public Node node;
    public ArrayList<Statement> statements;
    public ArrayList<class_call> class_calls;

    public statelessWidget() {
        this.statements = new ArrayList<>();
        this.class_calls = new ArrayList<>();
        this.node = new Node();
    }
    public void setClassName(String ClassName){
        this.ClassName = ClassName;
    }
    public void setWidgetBuildWidget(widgetBuild widgetBuild){
        this.widgetBuild = widgetBuild;
    }

    public void setStatement(Statement statement) {
        statements.add(statement);
    }
    public void setClass_calls(class_call class_call) {
        class_calls.add(class_call);
    }

    @Override
    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<div id=\""+ node.getId() +"\"  class=\""+ node.getId() +"\" >");
        if( widgetBuild != null){
            stringBuilder.append(widgetBuild.generateHTMLCode());
        }
        for (int i = 0; i < statements.size(); i++) {
            Statement statement = statements.get(i);
            if (statement != null) {
                stringBuilder.append(statement.generateHTMLCode());
            }
        }

        for (int i = 0; i < class_calls.size(); i++) {
            class_call class_call = class_calls.get(i);
            if (class_call != null) {
                stringBuilder.append(class_call.generateHTMLCode());
            }
        }

        stringBuilder.append("</div>");
        return stringBuilder.toString();
    }

    @Override
    public String generateCSSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        if( widgetBuild != null){
            stringBuilder.append(widgetBuild.generateCSSCode());
        }

        for (int i = 0; i < statements.size(); i++) {
            Statement statement = statements.get(i);
            if (statement != null) {
                stringBuilder.append(statement.generateCSSCode());
            }
        }

        for (int i = 0; i < class_calls.size(); i++) {
            class_call class_call = class_calls.get(i);
            if (class_call != null) {
                stringBuilder.append(class_call.generateCSSCode());
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("var "+node.getId() + " = document.getElementById('"+node.getId()+"');");
        if( widgetBuild != null){
            stringBuilder.append(widgetBuild.generateJSCode());
        }
        for (int i = 0; i < statements.size(); i++) {
            Statement statement = statements.get(i);
            if (statement != null) {
                stringBuilder.append(statement.generateJSCode());
            }
        }

        for (int i = 0; i < class_calls.size(); i++) {
            class_call class_call = class_calls.get(i);
            if (class_call != null) {
                stringBuilder.append(class_call.generateJSCode());
            }
        }
        return stringBuilder.toString();
    }


    @Override
    public String toString() {
        return "class "+ClassName+" extends statelessWidget { statement: " + statements.toString() +
                ",class Call :"+ class_calls.toString() + ", widgetBuild :"+ widgetBuild.toString() +"}";
    }

}
