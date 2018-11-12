package com.charles.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "BookUpdateServlet", urlPatterns = "/bookUpdate")
public class BookUpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.valueOf(req.getParameter("id"));
        int bookCount = Integer.valueOf(req.getParameter("bookCount"));
        PrintWriter pw = resp.getWriter();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc_test";
            String user = "charles";
            String password = "Charles@415";
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "update tb_books set bookCount=? where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, bookCount);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                pw.print("更新成功");
            } else {
                pw.print("更新失败");
            }
            ps.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            pw.print("错误：");
            pw.print(e.getMessage());
        }
        resp.sendRedirect("bookList");
        pw.close();
    }
}
