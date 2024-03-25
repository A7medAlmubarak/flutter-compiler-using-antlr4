package AST.widget.widgetAttribute;

public abstract class widgetAttribute {
    public abstract String generateHTMLCode(String widgetParent);
    public abstract String generateCSSCode(String widgetParent);
    public abstract String generateJSCode(String widgetParent);

    public abstract String generateHTMLCode();
    public abstract String generateCSSCode();
    public abstract String generateJSCode();

}
