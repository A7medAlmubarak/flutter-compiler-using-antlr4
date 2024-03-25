package AST.widget.widgetAttribute;

import AST.Node;

public class style extends widgetAttribute{
    String buttonColor;
    public Node node;

    public style(){
        this.buttonColor= new String();
        this.node= new Node();
    }
    public void setStyle(String buttonColor){
        this.buttonColor= buttonColor;
    }

    public String generateHTMLCode(String widgetParent) {
        return null;
    }

    public String generateCSSCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("."+ widgetParent +"{\n");
        stringBuilder.append("background-color: "+buttonColor+"; \n");
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
        return "style: buttonColor :" + buttonColor;

    }
}
