package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String USERNAME = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/mysql";
    private static final String PASSWORD = "qwertyui";
    public static Connection connection;
    static {
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    // реализуйте настройку соеденения с БД
}
