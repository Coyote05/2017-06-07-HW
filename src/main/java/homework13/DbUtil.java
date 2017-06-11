package homework13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/helixlab";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "admin";
    private static final String POSTGRE_DRIVER_NAME = "org.postgresql.Driver";

    public static Connection getConnection() {

        Connection connection = null;

        try {
            Class.forName(POSTGRE_DRIVER_NAME);

            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}