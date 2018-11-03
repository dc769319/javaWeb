package com.charles.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(
        filterName = "PVFilter",
        urlPatterns = "/index.jsp",
        initParams = {
                @WebInitParam(name = "pv", value = "5000")
        })
public class PVFilter implements Filter {

    private int pv = 0;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //从web.xml配置文件中，读取初始化配置
        this.pv = Integer.valueOf(filterConfig.getInitParameter("pv"));
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        this.pv++;//pv加1
        HttpServletRequest req = (HttpServletRequest) request;
        //获取servlet上下文对象
        ServletContext context = req.getServletContext();
        //设置新的pv
        context.setAttribute("pv", this.pv);
        //向下传递过滤器
        chain.doFilter(req, response);
    }

    @Override
    public void destroy() {

    }
}
