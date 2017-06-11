package homework13;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RunQueries {

    public static void firstQuery(int column) {

        Connection connection = DbUtil.getConnection();

        try {
            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery("SELECT * FROM PAYMENT");

            while (result.next()) {

                System.out.println(result.getString(column) + "\n");
            }
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}