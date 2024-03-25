package AST.widget.widgetAttribute;

import AST.Node;

public class appBar extends widgetAttribute{


    public String Value;
    public Node node;

    public appBar(){
        this.node = new Node();
    }

    public void setNode(Node node) {

        this.node = node;

    }

    public void setValue(String value) {
        Value = value;

    }

    @Override
    public String generateHTMLCode(String widgetParent) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n<header>\n");
        stringBuilder.append("<h1>"+Value+"</h1>\n");
        stringBuilder.append("</header>\n");
        return stringBuilder.toString();
    }

    @Override
    public String generateCSSCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("header {\n");
        stringBuilder.append("background-color: #2196F3;\n");
        stringBuilder.append("color: white;\n");
        stringBuilder.append("padding: 16px;\n");
        stringBuilder.append("} \n");
        return stringBuilder.toString();
    }

    @Override
    public String generateJSCode(String widgetParent) {
        return "";
    }

    @Override
    public String generateHTMLCode() {
        return null;
    }

    @Override
    public String generateCSSCode() {
        return null;
    }

    @Override
    public String generateJSCode() {
        return null;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "appBar:" + Value;

    }
}
