package AST.widget.widgetAttribute;

import AST.Node;
import AST.expression.Expression;
import AST.type.BoxColor;

public class color extends widgetAttribute{

    public String Value;
    public Expression expression ;
    public BoxColor boxColor ;
    public Node node;

    public color(){
        this.Value= new String();
        this.expression= new Expression();
        this.boxColor= new BoxColor();
        this.node= new Node();
    }

    public void setBoxColor(BoxColor boxColor) {
        this.boxColor = boxColor;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public void setValue(String value) {
        Value = value;
    }

    @Override
    public String generateHTMLCode(String widgetParent) {
        return null;
    }

    @Override
    public String generateCSSCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("background-color: \n");
        if (Value != null) {
            stringBuilder.append("Value");
        }
        stringBuilder.append("; \n");
        return stringBuilder.toString();
    }


    @Override
    public String generateJSCode(String widgetParent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("function changeColorBloc() { \n");
        stringBuilder.append("var currentColor ="+ widgetParent +".style.backgroundColor; \n");
        stringBuilder.append("if (currentColor === 'blue') { \n");
        stringBuilder.append(widgetParent+".style.backgroundColor = 'red'; \n");
        stringBuilder.append("} else { \n");
        stringBuilder.append(widgetParent+".style.backgroundColor = 'blue'; \n");
        stringBuilder.append("} \n");
        stringBuilder.append("} \n");
        return stringBuilder.toString();
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
    public String toString() {
        // TODO Auto-generated method stub
        return "color:" + Value;
    }

}
