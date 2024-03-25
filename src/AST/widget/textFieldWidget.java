package AST.widget;

import AST.Node;
import AST.widget.widgetAttribute.widgetAttribute;

import java.util.ArrayList;

public class textFieldWidget extends Widget{


    /*
    * textField: 'TextField' '(' 'controller' ':' IDENTIFIER ',' 'decoration' ':' 'InputDecoration'
    '(' 'labelText' ':' STRING_LITERAL ','? ')' ','? ('obscureText' ':' expression)? ','?
     ')' ','?;

* */
    String labelText;
    String obscureText;
    public Node node;


    public textFieldWidget() {
        this.labelText =   new String();
        this.obscureText =   new String();
        this.node = new Node();
    }
    public void setLabelText( String labelText) {
        this.labelText= labelText;
    }

    public void setObscureText( String obscureText) {
        this.obscureText= obscureText;
    }

    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<label for=\""+node.getId()+"\">"+labelText+"</label>");
        if( obscureText != null && obscureText == "true" ){
            stringBuilder.append("<input type=\"password\" id=\""+node.getId()+"\" />");
        }
        else{
            stringBuilder.append("<input type=\"text\" id=\""+node.getId()+"\" />");
        }
        return stringBuilder.toString();
    }

    public String generateCSSCode() {
        return null;
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("var "+node.getId() + " = document.getElementById('"+node.getId()+"');");
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "textFieldWidget(" +
                ')';
    }




}
