package com.charles.servlet;

import com.charles.jdbc.Insert;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MysqlInsertServlet", urlPatterns = "/mysqlInsert")
public class MysqlInsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html; charset=utf-8");
        try {
            Insert in = new Insert();
            if (in.run()) {
                pw.println("写入成功");
            } else {
                pw.println("失败");
                pw.println(in.getErrMsg());
            }
            pw.close();
        } catch (ClassNotFoundException ce) {
            pw.println(ce.getMessage());
        }
    }
}
