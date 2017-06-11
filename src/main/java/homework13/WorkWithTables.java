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

        int exist = 0;

        Connection connection = DbUtil.getConnection();

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT " + parameterOfRecord + " FROM " + nameOfTheTable);

            while (resultSet.next()) {

                if (valueOfRecord.equals(resultSet.getString(parameterOfRecord))) {

                    exist++;
                }
            }

            String execute = "DELETE FROM " + nameOfTheTable + " " + "WHERE " + parameterOfRecord + " = '" + valueOfRecord + "'";

            if (exist > 0) {

                statement.executeUpdate(execute);
                System.out.println("Record executed!");

            }
            else {
                System.out.println("The record is not exist!");
            }
            connection.close();

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }
}