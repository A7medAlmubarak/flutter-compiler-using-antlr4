package AST.widget.blocBuild;

import AST.Node;
import AST.widget.widgetAttribute.child;

public class blocClassArguments {
    //blocClassArguments : blocConstructor streamMethod;
    public blocConstructor blocConstructor;
    public streamMethod streamMethod;
    public Node node;

    public blocClassArguments(){
        this.blocConstructor= new blocConstructor();
        this.streamMethod= new streamMethod();
        this.node= new Node();
    }

    public void setNode(Node node){
        this.node = node;
    }
    public void setBlocConstructor(blocConstructor blocConstructor){
        this.blocConstructor = blocConstructor;
    }
    public void setStreamMethod(streamMethod streamMethod){
        this.streamMethod = streamMethod;
    }


    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(blocConstructor.generateHTMLCode());
        stringBuilder.append(streamMethod.generateHTMLCode());
        return stringBuilder.toString();
    }

    public String generateCSSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(blocConstructor.generateCSSCode());
        stringBuilder.append(streamMethod.generateCSSCode());
        return stringBuilder.toString();
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(blocConstructor.generateJSCode());
        stringBuilder.append(streamMethod.generateJSCode());
        return stringBuilder.toString();
    }
    @Override
    public String toString() {
        return "blocClassArguments(" +
                "blocConstructor:" + blocConstructor.toString() +
                "streamMethod:" + streamMethod.toString() +
                ')';
    }
}
