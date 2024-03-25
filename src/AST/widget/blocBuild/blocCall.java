package AST.widget.blocBuild;

import AST.Node;

public class blocCall {

    //blocCall : 'BlocProvider' DOT 'of' '<' blocType '>' '(' (CONTEXT_ | blocProviderArguments ) ')'  ;

    blocProviderArguments arguments;
    String blocType;
    Node node;

    public blocCall() {
        this.arguments =   new blocProviderArguments();
        this.blocType =   new String();
        this.node =   new Node();
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
        if (arguments != null) {
            stringBuilder.append(arguments.generateHTMLCode());
        }
        return stringBuilder.toString();
    }

    public String generateCSSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        if (arguments != null) {
            stringBuilder.append(arguments.generateHTMLCode());
        }
        return stringBuilder.toString();
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        if (arguments != null) {
            stringBuilder.append(arguments.generateHTMLCode());
        }
        return stringBuilder.toString();
    }
    @Override
    public String toString() {
        return "blocCall( type : "+ blocType +
                ", arguments:" + arguments.toString() +
                ')';
    }


}
