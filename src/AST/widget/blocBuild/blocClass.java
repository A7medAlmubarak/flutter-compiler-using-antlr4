package AST.widget.blocBuild;

import AST.Node;

public class blocClass {
//blocClass : CLASS_ IDENTIFIER EXTANDS_ 'Bloc' '<' blocType ',' blocType '>' '{' blocClassArguments '}' ;
    String blocType1;
    String blocType2;
    blocClassArguments arguments;
    Node node;

    public blocClass() {
        this.arguments =   new blocClassArguments();
        this.blocType1 =   new String();
        this.blocType2 =   new String();
        this.node =   new Node();
    }
    public void setArguments(blocClassArguments arguments) {
        this.arguments = arguments;
    }

    public void setBlocType(String blocType1 , String blocType2 ) {
        this.blocType1 = blocType1;
        this.blocType2 = blocType2;
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
        return "blocClass( type : "+ blocType1 + ","+blocType2+
                ", arguments:" + arguments.toString() +
                ')';
    }

}
