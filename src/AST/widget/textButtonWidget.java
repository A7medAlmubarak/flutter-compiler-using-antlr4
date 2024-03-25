package AST.widget;

import AST.Node;
import AST.statement.Statement;
import AST.widget.widgetAttribute.widgetAttribute;

import java.util.ArrayList;

public class textButtonWidget extends Widget{
    public ArrayList<widgetAttribute> widgetAttributes;
    public Node node;


    public textButtonWidget() {
        this.node = new Node();

        this.widgetAttributes =   new ArrayList<>();
    }
    public void addChild(widgetAttribute wA) {
        this.widgetAttributes.add(wA);
    }


    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<div id=\""+ node.getId() +"\"  class=\""+ node.getId() +"\" ");

        for (int i = 0; i < widgetAttributes.size(); i++) {
            widgetAttribute widgetAttribute = widgetAttributes.get(i);
            if (widgetAttribute != null) {
                stringBuilder.append(widgetAttribute.generateHTMLCode(node.getId()));
            }
        }
        stringBuilder.append("</div>");
        return stringBuilder.toString();
    }

    public String generateCSSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("; \n");
        for (int i = 0; i < widgetAttributes.size(); i++) {
            widgetAttribute widgetAttribute = widgetAttributes.get(i);
            if (widgetAttribute != null) {
                stringBuilder.append(widgetAttribute.generateCSSCode(node.getId()));
            }
        }
        return stringBuilder.toString();
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("var "+node.getId() + " = document.getElementById('"+node.getId()+"');");
        for (int i = 0; i < widgetAttributes.size(); i++) {
            widgetAttribute widgetAttribute = widgetAttributes.get(i);
            if (widgetAttribute != null) {
                stringBuilder.append(widgetAttribute.generateJSCode(node.getId()));
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Container(" +
                "Attributes:" + widgetAttributes +
                ')';
    }
}
