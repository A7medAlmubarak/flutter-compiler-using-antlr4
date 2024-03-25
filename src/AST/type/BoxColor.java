package AST.type;

import AST.expression.Expression;

public class BoxColor {
    String id;
    String firstColor ;
    String secondColor;
    public BoxColor( ) {
        this.id = new String();
        this.firstColor = new String();
        this.secondColor = new String();
    }
    public void setBoxColor(String id , String firstColor ,String secondColor  ) {
        this.id = id;
        this.firstColor = firstColor;
        this.secondColor = secondColor;
    }

    public String generateHTMLCode(String widgetParent) {
        return null;
    }

    public String generateCSSCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".red{ \n");
        stringBuilder.append("background-color:red;");
        stringBuilder.append("} \n");
        stringBuilder.append(".blue{ \n");
        stringBuilder.append("background-color:blue;");
        stringBuilder.append("} \n");
        return null ;
    }

    public String generateJSCode( String widgetParent ) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("var boxColor = \"blue\"; \n");
        stringBuilder.append("function updateBoxColor() { \n");
        stringBuilder.append("box.className = \"box \" + boxColor; } \n");
        stringBuilder.append("redButton.addEventListener(\"click\", function() {\n \n");
        stringBuilder.append("boxColor = \"red\"; \n");
        stringBuilder.append("updateBoxColor(); \n }); \n");
        stringBuilder.append("blueButton.addEventListener(\"click\", function() {\n");
        stringBuilder.append("boxColor = \"blue\";\n");
        stringBuilder.append("updateBoxColor();\n  }); \n");
        stringBuilder.append("updateBoxColor();\n");
        return stringBuilder.toString();
    }





}
