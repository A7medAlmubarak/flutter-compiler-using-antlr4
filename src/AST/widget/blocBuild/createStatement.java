package AST.widget.blocBuild;

import AST.Node;

public class createStatement {
 //   createStatement: '(' ('context'| IDENTIFIER)? ')' '=>' className '(' ')';
    String id;
    String className;
    Node node;
    public createStatement() {
        this.id =   new String();
        this.className =   new String();
        this.node =   new Node();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    public void setNode(Node node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "createStatement(" +
                "context: => " + className +
                ')';
    }

}
