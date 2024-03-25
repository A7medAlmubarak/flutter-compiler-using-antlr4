package visitors;

import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class Error {



    private final List<String> errors = new ArrayList<>();

    public void setError(String value) {
        this.errors.add(value);
    }

    public List<String> getErrors() {
        return errors;
    }

    public void print() {

        for (String error : errors) {

            System.out.println(error);

        }



    }
}
