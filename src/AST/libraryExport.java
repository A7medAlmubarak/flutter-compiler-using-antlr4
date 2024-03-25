package AST;

public class libraryExport extends program{
    public String Value;

    public libraryExport(){
    }
    public void add(String s ){
        this.Value = s;
    }
    @Override
    public String toString() {
        return "export " + Value + ";";
    }

}
