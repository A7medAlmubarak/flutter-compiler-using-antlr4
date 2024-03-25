package AST.widget.blocBuild;

import AST.Node;
import AST.widget.widgetAttribute.child;

public class streamMethod {

    public String blocType;
    public String className;
    public String eventName;
    public String yieldName;
    public Node node;

    public streamMethod(){
        this.blocType= new String();
        this.className= new String();
        this.eventName= new String();
        this.yieldName= new String();
        this.node= new Node();
    }

    public void setNode(Node node){
        this.node = node;
    }

    public void setStreamMethod(String blocType,String className,String eventName,String yieldName) {
        this.blocType = blocType;
        this.className = className;
        this.eventName = eventName;
        this.yieldName = yieldName;
    }


    public String generateHTMLCode() {
        return null;
    }

    public String generateCSSCode() {
        return null;
    }

    public String generateJSCode() {
        return null;
    }
    @Override
    public String toString() {
        return "streamMethod(" +
                "blocType:" + blocType +
                ",className:" + className +
                ",eventName:" + eventName +
                ",yieldName:" + yieldName + ')';
    }

}
