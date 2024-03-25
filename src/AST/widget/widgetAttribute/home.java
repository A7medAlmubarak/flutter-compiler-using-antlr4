package AST.widget.widgetAttribute;

import AST.Node;
import AST.widget.blocBuild.blocProviderArguments;
import AST.widget.blocBuild.blocProviderStatement;

public class home extends widgetAttribute{
    blocProviderStatement  blocProviderStatement;
    Node node;

    public home() {
        this.node = new Node();
    }
    public void setBlocProviderStatement(blocProviderStatement blocProviderStatement) {
        this.blocProviderStatement = blocProviderStatement;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    @Override
    public String generateHTMLCode(String widgetParent) {
        return null;
    }

    @Override
    public String generateCSSCode(String widgetParent) {
        return null;
    }

    @Override
    public String generateJSCode(String widgetParent) {
        return null;
    }

    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(blocProviderStatement.generateHTMLCode());
        return stringBuilder.toString();
    }

    public String generateCSSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(blocProviderStatement.generateCSSCode());
        return stringBuilder.toString();
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(blocProviderStatement.generateJSCode());
        return stringBuilder.toString();
    }
    @Override
    public String toString() {
        return "home( blocProviderStatement : "+ blocProviderStatement.toString()+
                ')';
    }

}
