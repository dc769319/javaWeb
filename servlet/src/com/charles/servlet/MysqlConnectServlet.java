package com.charles.servlet;

import com.charles.jdbc.Connect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MysqlConnectServlet", urlPatterns = "/mysqlConn")
public class MysqlConnectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html; charset=utf-8");
        try {
            Connect conn = new Connect();
            if (conn.run()) {
                pw.println("mysql 连接成功");
            } else {
                pw.println("mysql 连接失败");
            }
        } catch (ClassNotFoundException ce) {

            pw.println(ce.getMessage());
        }
    }
}
