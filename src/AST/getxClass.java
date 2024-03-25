package AST;

import AST.function.class_call;
import AST.statement.Statement;
import AST.widget.Widget;

import java.util.ArrayList;

public class getxClass {
    public String className;
    public ArrayList<class_call> class_calls;

    public ArrayList<Statement> statements;

    public Node node;
    public Widget widget;
    public getxClass(){
        this.className = new String();
        this.statements = new ArrayList<>();
        this.class_calls = new ArrayList<>();
        this.node = new Node();
    }

    public void setClassName(String className) {
        this.className = className;
    }


    public void setClass_call(class_call class_call) {
        this.class_calls.add(class_call);
    }

    public void setStatement(Statement stat) {
        this.statements.add(stat);
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<div id=\""+ node.getId() +"\"  class=\""+ node.getId() +"\" ");

        for (int i = 0; i < class_calls.size(); i++) {
            class_call class_call = class_calls.get(i);
            if (class_call != null) {
                stringBuilder.append(class_call.generateHTMLCode());
            }
        }

        stringBuilder.append("</div>");
        return stringBuilder.toString();
    }

    public String generateCSSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < class_calls.size(); i++) {
            class_call class_call = class_calls.get(i);
            if (class_call != null) {
                stringBuilder.append(class_call.generateCSSCode());
            }
        }
        return stringBuilder.toString();
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("var "+node.getId() + " = document.getElementById('"+node.getId()+"');");

        for (int i = 0; i < class_calls.size(); i++) {
            class_call class_call = class_calls.get(i);
            if (class_call != null) {
                stringBuilder.append(class_call.generateJSCode());
            }
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
        return "class "+className+" extands GETXCONTROLLER { class_call : "+class_calls+", statements : "+statements+"" +
                " }";
    }


}
