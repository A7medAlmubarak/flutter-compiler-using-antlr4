package AST.statement.navigator;

public class navigatorPushReplacement extends navigatorType{
    MaterialPageRoute materialPageRoute ;

    public navigatorPushReplacement() { }

    public void setNavigatorPushReplacement(MaterialPageRoute materialPageRoute) {
        this.materialPageRoute = materialPageRoute;
    }

    public MaterialPageRoute getNavigatorPush() {
        return this.materialPageRoute;
    }

    public String generateJSCode() {
        return materialPageRoute.generateJSCode();
    }

    @Override
    public String toString() {
        return "navigator.pushReplacement(" + materialPageRoute.toString() + ");" ;
    }
}
