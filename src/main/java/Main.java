import homework13.RunQueries;
import homework13.WorkWithTables;

public class Main {

    public static void main(String[] args) {

        RunQueries.firstQuery(6);

        WorkWithTables.createATable("REGISTRATION", "first_name", "VARCHAR(255)", "family_name", "VARCHAR(255)", "age", "Integer");
    }
}
