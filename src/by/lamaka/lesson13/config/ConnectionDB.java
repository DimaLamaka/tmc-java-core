package by.lamaka.lesson13.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
        String user = "postgres";
        String password = "postgres";
        return DriverManager.getConnection(url,user,password);
    }
}
