package com.charles.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bookName = req.getParameter("name");
        String author = req.getParameter("author");
        double price = Double.valueOf(req.getParameter("price"));
        int id = Integer.valueOf(req.getParameter("id"));
        PrintWriter out = resp.getWriter();
        out.print("<p>图书名：" + bookName + "</p>");
        out.print("<p>作者：" + author + "</p>");
        out.print("<p>价格：" + price + "</p>");
        out.print("<p>图书编号：" + id + "</p>");
        out.flush();
        out.close();
    }
}
