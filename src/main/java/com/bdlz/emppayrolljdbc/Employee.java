package com.bdlz.emppayrolljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Employee {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/payroll_service";
        String username = "root";
        String password = "rootpassword";
        Connection connection = null;
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established");
        } catch (
                SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return connection;
    }
}
