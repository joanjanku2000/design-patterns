package creational.singleton.lazy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection("connectionString");
        }
        return connection;
    }

    private SqlConnection(){

    }
}
