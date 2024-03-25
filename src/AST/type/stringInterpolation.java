package AST.type;

public class stringInterpolation {
    String text ;
    String var ;
    public stringInterpolation() {
        this.text = new String();
        this.var = new String();
    }
    public void addText(String text) {
        this.text = text;
    }
    public void addVar(String var) {
        this.var = var;
    }

    public String generateHTMLCode() {
        return null;
    }


    public String generateCSSCode() {
        return null;
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();

        if (var != null) {
            stringBuilder.append("document.write(\"<h1>");
            stringBuilder.append(text);
            stringBuilder.append("\"");
            stringBuilder.append(" + "+var+" + ");
            stringBuilder.append("\"");
            stringBuilder.append("</h1>\"");
            stringBuilder.append("); \n");
        }
        else{
            stringBuilder.append("<h1>");
            stringBuilder.append(text);
            stringBuilder.append("</h1>");
        }

        return stringBuilder.toString();
    }



}
