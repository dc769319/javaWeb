package com.charles.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    private String errMsg;
    private int errCode;

    public String getErrMsg() {
        return errMsg;
    }

    public int getErrCode() {
        return errCode;
    }

    public boolean run() throws ClassNotFoundException {
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
            this.errCode = e.getErrorCode();
            this.errMsg = e.getMessage();
            return false;
        }
    }

    public Connection getMysqlConn() {
        Connection conn = null;
        try {
            //加载驱动器
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc_test";
            String user = "charles";
            String password = "Charles@415";
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
        return conn;
    }
}
