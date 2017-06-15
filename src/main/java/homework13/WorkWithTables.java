package homework13;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class WorkWithTables {

    public static void createTable(String tableName, String columns) {

        Connection connection = DbUtil.getConnection();

        try {
            Statement statement = connection.createStatement();

            String createTable = "CREATE TABLE " + tableName + " (" + columns + ")";

            statement.executeUpdate(createTable);

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

            connection.close();

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }
}