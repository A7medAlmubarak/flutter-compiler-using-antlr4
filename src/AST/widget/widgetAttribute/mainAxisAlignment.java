package AST.widget.widgetAttribute;

import AST.Node;

public class mainAxisAlignment extends widgetAttribute{

    public Node node;

    public mainAxisAlignment(){
    }

    public String generateHTMLCode(String widgetParent) {
        return "";
    }

    public String generateCSSCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("."+ widgetParent +"{\n");
        stringBuilder.append("justify-content: center; \n");
        stringBuilder.append("} \n");
        return stringBuilder.toString();
    }



    public String generateJSCode(String widgetParent) {
        return null;
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
        return "mainAxisAlignment:center";

    }

}
