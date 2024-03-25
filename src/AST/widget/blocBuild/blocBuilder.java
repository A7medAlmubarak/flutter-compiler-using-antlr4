package AST.widget.blocBuild;

import AST.Node;
import AST.expression.Expression;
import AST.widget.Widget;

public class blocBuilder {
    Widget widget;
    public Node node;
    public blocBuilder() {
        this.widget = new Widget();
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Widget getWidget() {
        return widget;
    }

    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(widget.generateHTMLCode());
        return stringBuilder.toString();
    }

    public String generateCSSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(widget.generateCSSCode());
        return stringBuilder.toString();
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(widget.generateJSCode());
        return stringBuilder.toString();
    }
    @Override
    public String toString() {
        return "blocBuilder(" +
                "widget:" + widget.toString() +
                ')';
    }
}
