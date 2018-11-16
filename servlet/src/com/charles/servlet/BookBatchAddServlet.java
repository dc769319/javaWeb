package com.charles.servlet;

import com.charles.tools.RandomNumber;

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

@WebServlet(name = "BookBatchAddServlet", urlPatterns = "/bookBatchAdd")
public class BookBatchAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //批量插入
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc_test";
            String user = "charles";
            String password = "Charles@415";
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "insert into tb_books (`name`,`price`,`bookCount`,`author`) values (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            PrintWriter pw = resp.getWriter();
            for (int i = 0; i < 10; i++) {
                String bookName = "Book" + String.valueOf(i);
                String author = "Charles" + String.valueOf(i);
                double price = RandomNumber.generate(10, 100);
                int bookCount = 100;
                ps.setString(1, bookName);
                ps.setDouble(2, price);
                ps.setInt(3, bookCount);
                ps.setString(4, author);
                ps.addBatch();
            }
            int[] rows = ps.executeBatch();
            int insertCount = rows.length;
            pw.print("插入的数据行数：" + insertCount);
            ps.close();
            conn.close();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
