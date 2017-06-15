package homework13;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class WorkWithTables {

    public static void createTable(String newTable) {

        Connection connection = DbUtil.getConnection();

        try {
            Statement statement = connection.createStatement();

            statement.executeUpdate(newTable);

            connection.close();
            System.out.println("Table created." + "\n");

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }

    public static void deleteRecordsFromTable(String nameOfTheTable, String parameterOfRecord, String valueOfRecord) {

        Connection connection = DbUtil.getConnection();

        try {
            Statement statement = connection.createStatement();

            String execute = "DELETE FROM " + nameOfTheTable + " " + "WHERE " + parameterOfRecord + " = '" + valueOfRecord + "'";

            statement.executeUpdate(execute);

            System.out.println("Record executed!");

            connection.close();

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }
}