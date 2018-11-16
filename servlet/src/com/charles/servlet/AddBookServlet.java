package com.charles.servlet;

import com.charles.jdbc.Connect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 添加书籍
 */
@WebServlet(name = "AddBookServlet", urlPatterns = "/addBook")
public class AddBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        String bookName = req.getParameter("name");
        String author = req.getParameter("author");
        double price = Double.valueOf(req.getParameter("price"));
        int bookCount = Integer.valueOf(req.getParameter("bookCount"));
        PrintWriter pw = resp.getWriter();
        try {
            Connection conn = (new Connect()).getMysqlConn();
            if (null == conn) {
                pw.println("mysql连接失败");
                //销毁，终止代码执行
                this.destroy();
            }
            String sql = "insert into tb_books (`name`, `price`, `bookCount`, `author`) values (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, bookName);
            ps.setDouble(2, price);
            ps.setInt(3, bookCount);
            ps.setString(4, author);
            int row = ps.executeUpdate();
            conn.close();
            pw.println("数据写入" + row + "行");

        } catch (SQLException e) {
            pw.println(e.getMessage());
        }
        pw.close();
    }
}
