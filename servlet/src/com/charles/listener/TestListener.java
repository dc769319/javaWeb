package com.charles.listener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class TestListener implements ServletContextListener, ServletRequestListener {

    private Log log = LogFactory.getLog(this.getClass());

    /**
     * 上下文初始化
     *
     * @param sce context事件
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        log.info("即将启动" + servletContext.getContextPath());
    }

    /**
     * 上下文被销毁
     *
     * @param sce context事件
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        log.info("即将关闭" + servletContext.getContextPath());
    }

    /**
     * 请求被销毁
     *
     * @param sre servlet请求事件
     */
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        HttpServletRequest req = (HttpServletRequest) sre.getServletRequest();
        long reqStartTime = (long) req.getAttribute("reqStartTime");
        long expendTime = System.currentTimeMillis() - reqStartTime;
        log.info("请求耗时：" + expendTime);
    }

    /**
     * 请求初始化
     *
     * @param sre servlet请求事件
     */
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest req = (HttpServletRequest) sre.getServletRequest();
        String uri = req.getRequestURI();
        String clientIp = req.getRemoteAddr();
        String url = req.getRequestURL().toString();
        this.log.info("IP:" + clientIp + ", uri:" + uri + ", url:" + url);
        req.setAttribute("reqStartTime", System.currentTimeMillis());
    }
}
