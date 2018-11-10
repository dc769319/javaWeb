package com.charles.servlet;

import com.charles.bean.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

@WebServlet(name = "BookListServlet", urlPatterns = "/bookList")
public class BookListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        try {
            //加载驱动类
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc_test";
            Connection conn = DriverManager.getConnection(url, "charles", "Charles@415");
            String sql = "select * from tb_books";
            Statement st = conn.createStatement();
            ResultSet set = st.executeQuery(sql);
            ArrayList<Book> bookList = new ArrayList<>();
            while (set.next()) {
                Book book = new Book();
                book.setId(set.getInt("id"));
                book.setName(set.getString("name"));
                book.setPrice(set.getDouble("price"));
                book.setBookCount(set.getInt("bookCount"));
                book.setAuthor(set.getString("author"));
                bookList.add(book);
            }
            req.setAttribute("bookList", bookList);
            set.close();
            st.close();
            conn.close();
            //pw.println(bookList.toString());
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("bookList.jsp").forward(req, resp);
    }
}
