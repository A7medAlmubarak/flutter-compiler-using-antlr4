package AST.statement.navigator;

import AST.expression.Expression;
import AST.statement.Statement;

public class navigatorPush extends navigatorType{

    MaterialPageRoute materialPageRoute ;
    public navigatorPush() { }

    public void setNavigatorPush(MaterialPageRoute materialPageRoute) {
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
        return "navigator.push(" + materialPageRoute.toString() + ");" ;
    }


}
