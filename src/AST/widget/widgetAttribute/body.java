package AST.widget.widgetAttribute;

import AST.Node;
import AST.widget.blocBuild.blocProviderStatement;

import java.util.ArrayList;

public class body extends widgetAttribute{
    public Node node;
    public bodyArguments bodyArguments;
    public blocProviderStatement blocProviderStatement;

    public body() {
        this.node = new Node();
        this.bodyArguments =   new bodyArguments();
        this.blocProviderStatement =   new blocProviderStatement();
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public void setBlocProviderStatement(blocProviderStatement blocProviderStatement) {
        this.blocProviderStatement = blocProviderStatement;

    }

    public void setBodyArguments(bodyArguments bodyArguments) {
        this.bodyArguments = bodyArguments;
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
    public String generateHTMLCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();
        if (bodyArguments != null) {
            stringBuilder.append(bodyArguments.generateHTMLCode());
        }
        if (blocProviderStatement != null) {
            stringBuilder.append(blocProviderStatement.generateHTMLCode());
        }
        return stringBuilder.toString();
    }
    @Override
    public String generateCSSCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();

        if (bodyArguments != null) {
            stringBuilder.append(bodyArguments.generateCSSCode());
        }
        if (blocProviderStatement != null) {

            stringBuilder.append(blocProviderStatement.generateCSSCode());
        }
        return stringBuilder.toString();
    }

    @Override
    public String generateJSCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();
        if (bodyArguments != null) {
            stringBuilder.append(bodyArguments.generateJSCode());
        }
        if (blocProviderStatement != null) {
            stringBuilder.append(blocProviderStatement.generateJSCode());
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "body(" +
                "bodyArguments:" + bodyArguments.toString() +
                "blocProviderStatement:" + blocProviderStatement.toString() +
                ')';
    }

}
