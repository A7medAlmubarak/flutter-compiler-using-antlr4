package AST.widget.widgetAttribute;


import AST.Node;

public class ontap extends widgetAttribute{

    public String Value;
    public Node node;

    public ontap(){
        this.Value= new String();
    }

    public String generateHTMLCode(String widgetParent) {
        return null;
    }

    public String generateCSSCode(String widgetParent) {
        return null;
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

    public void addChild( String s ){
        this.Value = s;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ontap:" + Value;

    }
}
