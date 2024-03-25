package AST.type;

public class number extends type {
    public String num;

    public number() {
        this.num = new String();
    }

    @Override
    public String toString() {
        return num;
    }

}
