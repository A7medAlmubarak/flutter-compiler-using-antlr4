package AST;

import java.util.ArrayList;

public class runApp {
    public String id;
    public Node node;
    public runApp(){
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "runApp : "+ id.toString();
    }
}
