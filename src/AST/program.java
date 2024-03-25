package AST;

import AST.statement.Statement;
import AST.widget.blocBuild.blocClass;
import AST.widget.widgetAttribute.widgetAttribute;

import java.util.ArrayList;

public class program {
    public ArrayList<libraryExport> libraryExports;
    public ArrayList<libraryImport> libraryImports;
    public ArrayList<widgetClass> widgetClasses;
    public ArrayList<Statement> statements;
    public ArrayList<stateClass> stateClasses;
    public ArrayList<blocClass> blocClasses;
    public ArrayList<getxClass> getxClasses;

    public mainClass main;

    public program(){
        this.libraryImports =  new ArrayList<>();
        this.libraryExports = new ArrayList<>();
        this.widgetClasses = new ArrayList<>();
        this.statements = new ArrayList<>();
        this.stateClasses = new ArrayList<>();
        this.blocClasses =  new ArrayList<>();
        this.getxClasses =  new ArrayList<>();
    }
//program: (libraryImport | libraryExport)*  mainClass? ( widgetClass | blocClass | stateClass | getxClass | statement   )*   EOF ;
    public void setStatement(Statement statement) {
        statements.add(statement);
    }
    public void addimport(libraryImport imp){
            libraryImports.add(imp);
    }
    public void addexport(libraryExport exp){
        libraryExports.add(exp);
    }
    public void addwidgetclass(widgetClass wid){
        widgetClasses.add(wid);
    }
    public void addwidgetclass(blocClass blocClass){
        blocClasses.add(blocClass);
    }
    public void addGetxClass(getxClass getxClass){
        getxClasses.add(getxClass);
    }

    public void setStateClasses(stateClass stateClass) {
        this.stateClasses.add(stateClass);
    }

    public void addMain(mainClass main){
        this.main = main;
    }

    public String generateCode() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("<head>\n");
        stringBuilder.append("<style>\n");

        for (int i = 0; i < widgetClasses.size(); i++) {
            widgetClass widgetClass = widgetClasses.get(i);
            if (widgetClass != null) {
                stringBuilder.append(widgetClass.generateCSSCode());
            }
        }

        for (int i = 0; i < stateClasses.size(); i++) {
            stateClass stateClass = stateClasses.get(i);
            if (stateClass != null) {
                stringBuilder.append(stateClass.generateCSSCode());
            }
        }

        for (int i = 0; i < statements.size(); i++) {
            Statement statement = statements.get(i);
            if (statement != null) {
                stringBuilder.append(statement.generateCSSCode());
            }
        }

        for (int i = 0; i < getxClasses.size(); i++) {
            getxClass getxClass = getxClasses.get(i);
            if (getxClass != null) {
                stringBuilder.append(getxClass.generateCSSCode());
            }
        }

        for (int i = 0; i < blocClasses.size(); i++) {
            blocClass blocClass = blocClasses.get(i);
            if (blocClass != null) {
                stringBuilder.append(blocClass.generateCSSCode());
            }
        }

        if( main != null){
            stringBuilder.append(main.generateCSSCode());
        }


        stringBuilder.append("</style>\n");
        stringBuilder.append("</head>\n");

        stringBuilder.append("<body>\n");

        for (int i = 0; i < widgetClasses.size(); i++) {
            widgetClass widgetClass = widgetClasses.get(i);
            if (widgetClass != null) {
                stringBuilder.append(widgetClass.generateHTMLCode());
            }
        }

        for (int i = 0; i < stateClasses.size(); i++) {
            stateClass stateClass = stateClasses.get(i);
            if (stateClass != null) {
                stringBuilder.append(stateClass.generateHTMLCode());
            }
        }

        for (int i = 0; i < statements.size(); i++) {
            Statement statement = statements.get(i);
            if (statement != null) {
                stringBuilder.append(statement.generateHTMLCode());
            }
        }

        for (int i = 0; i < getxClasses.size(); i++) {
            getxClass getxClass = getxClasses.get(i);
            if (getxClass != null) {
                stringBuilder.append(getxClass.generateHTMLCode());
            }
        }

        for (int i = 0; i < blocClasses.size(); i++) {
            blocClass blocClass = blocClasses.get(i);
            if (blocClass != null) {
                stringBuilder.append(blocClass.generateHTMLCode());
            }
        }

        if( main != null){
            stringBuilder.append(main.generateHTMLCode());
        }


        stringBuilder.append("\n<script>");

        for (int i = 0; i < widgetClasses.size(); i++) {
            widgetClass widgetClass = widgetClasses.get(i);
            if (widgetClass != null) {
                stringBuilder.append(widgetClass.generateJSCode());
            }
        }

        for (int i = 0; i < stateClasses.size(); i++) {
            stateClass stateClass = stateClasses.get(i);
            if (stateClass != null) {
                stringBuilder.append(stateClass.generateJSCode());
            }
        }

        for (int i = 0; i < statements.size(); i++) {
            Statement statement = statements.get(i);
            if (statement != null) {
                stringBuilder.append(statement.generateJSCode());
            }
        }

        for (int i = 0; i < getxClasses.size(); i++) {
            getxClass getxClass = getxClasses.get(i);
            if (getxClass != null) {
                stringBuilder.append(getxClass.generateJSCode());
            }
        }

        for (int i = 0; i < blocClasses.size(); i++) {
            blocClass blocClass = blocClasses.get(i);
            if (blocClass != null) {
                stringBuilder.append(blocClass.generateJSCode());
            }
        }

        if( main != null){
            stringBuilder.append(main.generateJSCode());
        }

        stringBuilder.append("</script>\n");
        stringBuilder.append("</body>\n");
        stringBuilder.append("</html>\n");
        return stringBuilder.toString();
    }
    @Override
    public String toString() {
        System.out.println("PROGRAM :"+'\n');
        if( libraryImports.size()>0 ){
            System.out.println("IMPORT :"+'\n'+libraryImports+'\n');
        }
        if( libraryExports.size()>0 ){
            System.out.println("EXPORT :"+'\n'+libraryExports+'\n');
        }
        if( widgetClasses.size()>0 ){
            System.out.println("WIDGET_CLASSES :"+'\n'+widgetClasses +'\n');
        }

        return "";
    }





}
