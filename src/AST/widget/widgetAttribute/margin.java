package AST.widget.widgetAttribute;

import AST.Node;

public class margin extends widgetAttribute{

    public String Value;
    public Node node;

    public margin(){
        this.Value= new String();
    }

    public void setValue(String value) {
        Value = value;
    }

    public String generateHTMLCode(String widgetParent) {
        return null;
    }

    public String generateCSSCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("."+ widgetParent +"{\n");
        stringBuilder.append("margin: "+Value+"px; \n");
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
        return "margin:" + Value;

    }
}
