import homework13.RunQueries;
import homework13.WorkWithTables;

public class Main {

    public static void main(String[] args) {

        RunQueries.firstQuery(6);

        WorkWithTables.createTable("REGISTRATION", "id INTEGER not NULL, first_name VARCHAR(255) not NULL, family_name VARCHAR(255) not NULL, age INTEGER not NULL, PRIMARY KEY ( id )");

        WorkWithTables.deleteRecordsFromTable("REGISTRATION", "family_name", "Brodén");
    }
}
