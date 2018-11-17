package com.charles.servlet;

import com.charles.bean.Product;
import com.charles.dao.ProductDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductListServlet", urlPatterns = "/productList")
public class ProductListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收参数
        String pageParam = req.getParameter("page");
        int page = (null == pageParam) ? 1 : Integer.valueOf(req.getParameter("page"));
        ProductDao dao = new ProductDao();
        List<Product> productList = dao.find(page);
        int productCount = dao.getCount();
        req.setAttribute("productList", productList);
        int totalPage = (productCount % Product.PAGE_SIZE == 0)
                ? productCount / Product.PAGE_SIZE : (productCount / Product.PAGE_SIZE + 1);
        //分页导航html
        String pageStr = this.pageStr(totalPage, page);
        req.setAttribute("pageStr", pageStr);
        //将请求转发给jsp页面
        req.getRequestDispatcher("productList.jsp").forward(req, resp);
    }

    private String pageStr(int totalPage, int curPage) {
        StringBuilder buffer = new StringBuilder();
        for (int i = 1; i <= totalPage; i++) {
            String pStr = "";
            if (curPage == i) {
                pStr = "[" + i + "]";

            } else {
                pStr = "<a href='productList?page=" + i + "'>" + i + "</a>";
            }
            buffer.append(pStr);
        }
        return buffer.toString();
    }
}
