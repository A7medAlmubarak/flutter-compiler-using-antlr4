package AST.widget;

import AST.Node;
import AST.widget.widgetAttribute.child;
import AST.widget.widgetAttribute.onPressed;
import AST.widget.widgetAttribute.style;
import AST.widget.widgetAttribute.widgetAttribute;

import java.util.ArrayList;

public class elevatedButtonWidget extends Widget{
    public onPressed onPressed;
    public style style ;
    public String child ;

    public Node node;

    public elevatedButtonWidget() {
        this.style =   new style();
        this.node = new Node();
    }
    public void addChild(String child) {
        this.child=child;
    }

    public void addOnPressed(onPressed onPressed) {
        this.onPressed=onPressed;
    }

    public void addStyle(style style) {
        this.style=style;
    }

    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<button id=\""+ node.getId() +"\"  class=\""+ node.getId() +"\" ");
        stringBuilder.append(">");
        stringBuilder.append(child);
        stringBuilder.append("</button>");
        return stringBuilder.toString();
    }

    public String generateCSSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        if (style != null) {
            stringBuilder.append(style.generateCSSCode(node.getId()));
        }
        return stringBuilder.toString();
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n var "+node.getId() + " = document.getElementById('"+node.getId()+"');");
        stringBuilder.append(onPressed.generateJSCode(node.getId()));
        return stringBuilder.toString();
    }





}
