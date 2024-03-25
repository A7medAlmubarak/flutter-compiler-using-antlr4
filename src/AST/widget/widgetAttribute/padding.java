package AST.widget.widgetAttribute;

import AST.Node;

public class padding extends widgetAttribute{
    public String Value;
    public Node node;

    public padding(){
        this.Value= new String();

    }

    public void setValue(String value) {
        Value = value;
    }

    public String generateHTMLCode(String widgetParent) {
        return "";
    }

    public String generateCSSCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("."+ widgetParent +"{\n");
        stringBuilder.append("padding: "+Value+"px; \n");
        stringBuilder.append("} \n");
        return stringBuilder.toString();
    }



    public String generateJSCode(String widgetParent) {
        return "";
    }

    @Override
    public String generateHTMLCode() {
        return "";
    }

    @Override
    public String generateCSSCode() {
        return "";
    }

    @Override
    public String generateJSCode() {
        return null;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "padding:" + Value;

    }
}
