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

@WebServlet(name = "BookDeleteServlet", urlPatterns = "/bookDelete")
public class BookDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.valueOf(req.getParameter("id"));
        PrintWriter pw = resp.getWriter();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc_test";
            String user = "charles";
            String password = "Charles@415";
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "delete from tb_books where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            pw.print(e.getMessage());
        }
        resp.sendRedirect("bookList");
        pw.close();
    }
}
