package com.charles.jdbc;

import com.charles.tools.Log2File;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    public boolean run() throws ClassNotFoundException, IOException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/jdbc_test?serverTimezone=UTC";
        String user = "charles";
        String pwd = "Charles@415";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, pwd);
            if (null == conn) {
                return false;
            } else {
                conn.close();
                return true;
            }
        } catch (SQLException e) {
            //记录错误日志
            Log2File.write("logs/mysql.log", "mysql-connect", e.getMessage());
            return false;
        }
    }
}
