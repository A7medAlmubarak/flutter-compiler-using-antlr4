package AST;

import AST.statement.varDeclaration;

import java.util.ArrayList;

public class importOrExport{
    public ArrayList<libraryExport> libraryExports;
    public ArrayList<libraryImport> libraryImports;
    public importOrExport(){
        this.libraryExports =  new ArrayList<>();
        this.libraryImports =  new ArrayList<>();
    }

    public void addChild(libraryExport lib) {
        this.libraryExports.add(lib);
    }

    public void addChild(libraryImport lib) {
        this.libraryImports.add(lib);
    }


    @Override
    public String toString() {
        return "importOrExport:" +
                "libraryExport : "+libraryExports.toString()+
                "libraryImport : "+libraryImports.toString();
    }

}
