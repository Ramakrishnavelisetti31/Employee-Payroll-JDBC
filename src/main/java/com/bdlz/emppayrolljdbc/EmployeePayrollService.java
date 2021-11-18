package com.bdlz.emppayrolljdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeePayrollService {
    public static void main(String[] args) {
        EmployeePayrollService service = new EmployeePayrollService();
        service.getConnection();
    }
    private void getConnection() {
        Employee.getConnection();
    }
}
