package AST.type;

import AST.Node;
import AST.expression.Expression;

public class required {
    String id;
    Node node;

    public required(){
        this.node= new Node();
        this.id= new String();
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public void setRequired( String id) {
        this.id = id;
    }

    public String generateJSCode(){
        return null;
    }

}
