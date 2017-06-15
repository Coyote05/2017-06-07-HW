package homework13;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WorkWithTables {

    public static void createATable(String nameOfTheNewTable, String secondColumn, String typeOfTheSecondColumn, String thirdColumn, String typeOfTheThirdColumn, String fourthColumn, String typeOfTheFourthColumn) {

        Connection connenction = DbUtil.getConnection();

        try {
            Statement statement = connenction.createStatement();

            String newTable = "CREATE TABLE " + nameOfTheNewTable +
                    "(id INTEGER not NULL, " +
                    " " + secondColumn + " " + typeOfTheSecondColumn + ", " +
                    " " + thirdColumn + " " + typeOfTheThirdColumn + ", " +
                    " " + fourthColumn + " " + typeOfTheFourthColumn + ", " +
                    " PRIMARY KEY ( id ))";

            statement.executeUpdate(newTable);

            connenction.close();
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