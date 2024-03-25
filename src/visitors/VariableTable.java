package visitors;

import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class VariableTable {

    private final List<String> data = new ArrayList<>();


    public void setData(String data) {

        this.data.add(data);
    }




    public List<String> getData() {
        return data;
    }

    public void print() {

        for (String d : data) {

            System.out.println(d + "\t\t\t\t" + d);

        }


    }
}
