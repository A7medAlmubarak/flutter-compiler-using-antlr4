package AST.widget.blocBuild;

import AST.Node;
import AST.widget.widgetAttribute.child;

public class blocProviderArguments {
//blocProviderArguments: 'create' ':' createStatement ',' child ','? ;
    createStatement createStatement;
    child child;

    Node node;

    public blocProviderArguments(){
        this.createStatement= new createStatement();
        this.child= new child();
        this.node= new Node();
    }
    public void setNode(Node node){
        this.node = node;
    }
    public void setCreateStatement(createStatement createStatement){
        this.createStatement = createStatement;
    }
    public void setChild(child child){
        this.child = child;
    }


    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<div id=\""+ node.getId() +"\"  class=\""+ node.getId() +"\" ");
        stringBuilder.append(child.generateHTMLCode(node.getId()));
        stringBuilder.append("</div>");
        return stringBuilder.toString();
    }

    public String generateCSSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(child.generateCSSCode(node.getId()));

        return stringBuilder.toString();
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("var "+node.getId() + " = document.getElementById('"+node.getId()+"');");
        stringBuilder.append(child.generateJSCode(node.getId()));
        return stringBuilder.toString();
    }
    @Override
    public String toString() {
        return "blocProviderArguments(" +
                "child:" + child.toString() +
                "createStatement:" + createStatement.toString() +
                ')';
    }

}
