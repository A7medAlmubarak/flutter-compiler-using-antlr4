package AST.widget.widgetAttribute;

public class title extends widgetAttribute{
    String text ;
    public title() {
        this.text = new String();
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String generateHTMLCode(String widgetParent) {
        return null;
    }

    @Override
    public String generateCSSCode(String widgetParent) {
        return null;
    }

    @Override
    public String generateJSCode(String widgetParent) {
        return null;
    }

    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<h1>");
        stringBuilder.append(text);
        stringBuilder.append("</h1>");
        return stringBuilder.toString();
    }


    public String generateCSSCode() {
        return null;
    }

    public String generateJSCode() {
        return null ;
    }
}
