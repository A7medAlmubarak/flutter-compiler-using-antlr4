package AST.widget.blocBuild;

import AST.Node;
import AST.widget.Widget;

public class blocBuildWidget extends Widget {

    String blocType1 ;
    String blocType2 ;
    blocBuilder blocBuilder;
    public Node node;
    public blocBuildWidget() {
        this.blocType1 = new String();
        this.blocType2 = new String();
        this.blocBuilder = new blocBuilder();
        this.node = new Node();
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public void setBlocBuilder(blocBuilder blocBuilder) {
        this.blocBuilder = blocBuilder;
    }

    public void setBlocType1(String blocType1) {
        this.blocType1 = blocType1;
    }

    public void setBlocType2(String blocType2) {
        this.blocType2 = blocType2;
    }

    public blocBuilder getBlocBuilder() {
        return blocBuilder;
    }

    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(blocBuilder.generateHTMLCode());
        return stringBuilder.toString();
    }

    public String generateCSSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(blocBuilder.generateCSSCode());
        return stringBuilder.toString();
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(blocBuilder.generateJSCode());
        return stringBuilder.toString();
    }
    @Override
    public String toString() {
        return "blocBuildWidget(" +
                "blocBuilder:" + blocBuilder.toString() +
                ')';
    }




}
