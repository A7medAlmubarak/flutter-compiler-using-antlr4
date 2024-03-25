package AST.statement.navigator;

public class navigatorPop extends navigatorType{

    public navigatorPop() { }

    public String generateJSCode() {
        return null;
    }

    @Override
    public String toString() {
        return "navigator.of(context).pop();" ;
    }

}
