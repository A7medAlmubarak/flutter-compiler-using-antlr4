package AST.widget.widgetAttribute;

import AST.Node;
import AST.function.class_call;
import AST.widget.Widget;

import java.util.ArrayList;

public class child extends widgetAttribute{
    public class_call class_call;
    public Node node;

    public child(){
        this.node= new Node();
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public void setClass_call(class_call class_call) {
        this.class_call = class_call;
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

    public String generateHTMLCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();
        if (class_call != null) {
            stringBuilder.append(class_call.generateHTMLCode());
        }
        return stringBuilder.toString();
    }
    public String generateCSSCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();
        if (class_call != null) {
            stringBuilder.append(class_call.generateCSSCode());
        }
        return stringBuilder.toString();
    }
    public String generateJSCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();
        if (class_call != null) {
            stringBuilder.append(class_call.generateJSCode());
        }
        return stringBuilder.toString();
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "child:" ;
    }

}
