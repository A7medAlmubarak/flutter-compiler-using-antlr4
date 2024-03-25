package AST.widget.blocBuild;

import AST.Node;
import AST.widget.widgetAttribute.widgetAttribute;

import java.util.ArrayList;

public class blocProviderStatement {

    //blocProviderStatement: 'BlocProvider' ('<' blocType '>')? '(' blocProviderArguments ')' ','? ';'?;
    String blocType;
    blocProviderArguments arguments;
    Node node;

    public blocProviderStatement() {
        this.node =   new Node();
        this.arguments =  new blocProviderArguments();

    }
    public void setArguments(blocProviderArguments arguments) {
        this.arguments = arguments;
    }

    public void setBlocType(String blocType) {
        this.blocType = blocType;
    }


    public void setNode(Node node) {
        this.node = node;
    }

    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(arguments.generateHTMLCode());
        return stringBuilder.toString();
    }

    public String generateCSSCode() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(arguments.generateCSSCode());
        return stringBuilder.toString();
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(arguments.generateJSCode());
        return stringBuilder.toString();
    }
    @Override
    public String toString() {
        return "blocProviderStatement( type : "+ blocType +
                ", arguments:" + arguments.toString() +
                ')';
    }

}
