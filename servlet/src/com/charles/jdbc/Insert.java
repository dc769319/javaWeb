package com.charles.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

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
                //测试数据写入
                String sql = "insert into `tb_books` (`name`,`price`,`bookCount`,`author`) values (?,?,?,?);";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, "Bobo");
                ps.setDouble(2, 23.5);
                ps.setInt(3, 12);
                ps.setString(4, "Charles");
                int row = ps.executeUpdate();
                ps.close();
                if (row > 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException e) {
            this.errCode = e.getErrorCode();
            this.errMsg = e.getMessage();
            return false;
        }
    }
}
