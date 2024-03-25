package AST;

public class libraryImport extends program{
    public String Value;
    public libraryImport(){
    }
    public void add(String s ){
        this.Value = s;
    }
    @Override
    public String toString() {
        return "import " + Value + ";";
    }

}
