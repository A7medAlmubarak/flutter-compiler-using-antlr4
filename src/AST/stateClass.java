package AST;

import AST.statement.Statement;
import AST.widget.Widget;

import java.util.ArrayList;

public class stateClass {
    String id;
    String type;
    public ArrayList<Statement> statements;

    Node node;
    Widget widget;
    public stateClass(){
        this.statements = new ArrayList<>();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    public void setStatement(Statement stat) {
        this.statements.add(stat);
    }

    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<div id=\""+ node.getId() +"\"  class=\""+ node.getId() +"\" ");
        if( widget != null){
            stringBuilder.append(widget.generateHTMLCode());
        }
        stringBuilder.append("</div>");
        return stringBuilder.toString();
    }

    public String generateCSSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        if( widget != null){
            stringBuilder.append(widget.generateCSSCode());
        }
        return stringBuilder.toString();
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("var "+node.getId() + " = document.getElementById('"+node.getId()+"');");
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
        return "stateClass ( \'State\' | \'state\') type : "+type+"{ statements : "+statements+"" +
                ", widget : " +widget+
                " }";
    }




}
