package AST;

public class Node {
    public String lineNumber;
    public String charNumber;
    public String nodeName;


    public void setNode(String lineNumber, String charNumber , String nodeName) {
        this.lineNumber = lineNumber;
        this.charNumber = charNumber;
        this.nodeName = nodeName;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public String getCharNumber() {
        return charNumber;
    }
    public String getId() {
        return nodeName + lineNumber + "_" + charNumber;
    }



}

