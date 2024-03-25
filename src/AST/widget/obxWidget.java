package AST.widget;

import AST.Node;
import AST.widget.widgetAttribute.widgetAttribute;

import java.util.ArrayList;

public class obxWidget extends Widget{
    public Widget widget;
    public Node node;
    public obxWidget( ) {
        this.widget =   new Widget();
        this.node =   new Node();
    }
    public void setWidget(Widget widget) {
    this.widget =  widget;
    }
    public void setNode(Node node) {
        this.node =  node;
    }

    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(widget.generateHTMLCode());
        return stringBuilder.toString();
    }

    public String generateCSSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(widget.generateCSSCode());
        return stringBuilder.toString();
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(widget.generateJSCode());
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "obxWidget(" +
                "widget:" + widget.toString() +
                ')';
    }




}
