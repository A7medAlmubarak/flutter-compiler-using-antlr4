package AST.widget.widgetAttribute;

import AST.Node;
import AST.function.class_call;
import AST.widget.Widget;

import java.util.ArrayList;

public class children extends widgetAttribute{
    public ArrayList<class_call> class_calls;
    public Node node;

    public children(){
        this.class_calls= new ArrayList<>();
        this.node= new Node();
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public void addChild(class_call class_call) {
        this.class_calls.add(class_call);
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
        for (int i = 0; i < class_calls.size(); i++) {
            class_call class_call = class_calls.get(i);
            if (class_call != null) {
                stringBuilder.append(class_call.generateHTMLCode());
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String generateCSSCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < class_calls.size(); i++) {
            class_call class_call = class_calls.get(i);
            if (class_call != null) {
                stringBuilder.append(class_call.generateCSSCode());
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String generateJSCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < class_calls.size(); i++) {
            class_call class_call = class_calls.get(i);
            if (class_call != null) {
                stringBuilder.append(class_call.generateJSCode());
            }
        }
        return stringBuilder.toString();
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "children:" + class_calls.toString();
    }

}
