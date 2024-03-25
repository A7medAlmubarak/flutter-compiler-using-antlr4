package visitors;

import java.util.Objects;

import static visitors.BaseVisitor.errors;

public class SemanticErrors {
    VariableTable variableTable;

    public SemanticErrors(VariableTable variableTable){
        this.variableTable = variableTable;
    }

    void check(){
        checkDuplication();
        checkDeclaration();
    }

    private void checkDeclaration() {

        for (int i = 0; i < variableTable.getData().size(); i++) {

            String string1 = variableTable.getData().get(i).split(",")[0];

            if ((!Objects.equals(string1, "int")) && (!Objects.equals(string1, "float")) && (!Objects.equals(string1, "string")) && (!Objects.equals(string1, "double"))) {

                if (lookFor(string1)) {

                    errors.setError("variable " + string1 + " is not declared ");

                }
            }
        }
    }

    private boolean lookFor(String var)
    {
        for (int i = 0; i < variableTable.getData().size(); i++) {

            String string1 = variableTable.getData().get(i).split(",")[1];
            if (Objects.equals(var, string1)) {
                return false;
            }
            if (Objects.equals("null", string1)) {
                return false;
            }

        }
        return true;
    }

    private void checkDuplication() {

        for (int i = 0; i < variableTable.getData().size() - 1; i++) {

            String string1 = variableTable.getData().get(i).split(",")[1];
            String string2 = variableTable.getData().get(i + 1).split(",")[1];

            if (Objects.equals(string1, string2)) {
                errors.setError("variable " + string1 + " is already declared ");
            }
        }
    }
}
