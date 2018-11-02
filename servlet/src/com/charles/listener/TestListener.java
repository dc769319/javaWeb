package com.charles.listener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class TestListener implements HttpSessionListener, ServletContextListener, ServletRequestListener {

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

    /**
     * session创建
     *
     * @param se session事件
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        this.log.info("创建新的session，ID为" + session.getId());
    }

    /**
     * session销毁
     *
     * @param se session事件
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        this.log.info("销毁session，ID为" + session.getId());
    }
}
