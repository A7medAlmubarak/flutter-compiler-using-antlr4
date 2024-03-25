package visitors;

import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {

    private List<Pair<String, String>> data = new ArrayList<>();


    public void setData(Pair<String, String> pair) {

        this.data.add(pair);
    }

    public void setData(String type, String value) {

        this.data.add(new Pair<>(type, value));
    }


    public List<Pair<String, String>> getData() {
        return data;
    }

    public void print() {

        for (Pair<String, String> d : data) {

            System.out.println("Type: "+d.a + "\t\t\t\t"+"ID: " + d.b);

        }


    }

}
