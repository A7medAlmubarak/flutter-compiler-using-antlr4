package AST.widget;

import AST.Node;
import AST.type.stringInterpolation;
import AST.widget.widgetAttribute.widgetAttribute;

import java.util.ArrayList;

public class textWidget extends Widget{
    public stringInterpolation Value;
    public Node node;


    public textWidget() {
        this.node = new Node();
        this.Value = new stringInterpolation();
    }

    public void setValue(stringInterpolation value) {
        Value = value;
    }

    public String generateHTMLCode() {
        return "\n<p id=\"" + node.getId() + "\">" +
                Value.generateHTMLCode() +
                "</p>\n";
    }

    public String generateCSSCode() {
        return null;
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("var "+node.getId() + " = document.getElementById('"+node.getId()+"');");
        return Value.generateJSCode();
    }

    @Override
    public String toString() {
        return "Text(" + Value +")";
    }
}
