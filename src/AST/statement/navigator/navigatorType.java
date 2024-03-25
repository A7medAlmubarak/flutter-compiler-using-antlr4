package AST.statement.navigator;

import AST.statement.Statement;

public class navigatorType {

    navigatorPop pop;
    navigatorPush push ;
    navigatorPushReplacement pushRep;

    public navigatorType( ) {
    }

    public navigatorType(navigatorPop pop ) {
        this.pop = pop;
    }

    public navigatorType( navigatorPush push ) {
        this.push = push;
    }

    public navigatorType(navigatorPushReplacement pushRep ) {
        this.pushRep = pushRep;
    }

    public String generateHTMLCode(){
        return null;
    }

    public String generateCSSCode(){
        return null;
    }



    public String generateJSCode() {
        StringBuilder codeBuilder = new StringBuilder();
        System.out.println( "\n -----fasasfa" );

        if (pop != null) {
            codeBuilder.append("\n");
            codeBuilder.append(pop.generateJSCode( )).append("\n");
        }
        if (push != null) {
            codeBuilder.append("\n");
            codeBuilder.append(push.generateJSCode( )).append("\n");
        }
        if (pushRep != null) {
            codeBuilder.append("\n");
            codeBuilder.append(pushRep.generateJSCode( )).append("\n");
        }

        return codeBuilder.toString();
    }
}
