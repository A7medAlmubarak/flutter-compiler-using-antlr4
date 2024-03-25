package AST.statement.showDialog;

import AST.statement.Statement;
import AST.widget.Widget;

public class ShowDialogBuilder {
     String buildContext;
     String context;
     Widget widgetLiteral;

    public ShowDialogBuilder() {
        this.buildContext = new String();
        this.context = new String();
        this.widgetLiteral = new Widget();
    }

    public void setBuildContext(String buildContext) {
        this.buildContext = buildContext;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setWidgetLiteral(Widget widgetLiteral) {
        this.widgetLiteral = widgetLiteral;
    }

    public String getBuildContext() {
        return buildContext;
    }

    public String getContext() {
        return context;
    }

    public Widget getWidgetLiteral() {
        return widgetLiteral;
    }


    public String generateHTMLCode(){
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(widgetLiteral.generateHTMLCode());
        return codeBuilder.toString();
    }
    public String generateCSSCode(){
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(widgetLiteral.generateCSSCode());
        return codeBuilder.toString();
    }
    public String generateJSCode(){
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(widgetLiteral.generateJSCode());
        return codeBuilder.toString();
    }

    @Override
    public String toString() {
        return "BuildContext context  { return " + widgetLiteral.toString() + "; }";
    }

}
