<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/27
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
    <title>显示系统时间</title>
</head>
<body>
<!--声明标识，用于定义全局的变量和方法（服务器关闭后才会被销毁）-->
<%!
    private int number = 0;

    private int count() {
        return ++number;
    }
%>
<%
    //测试内置对象
    String id = request.getParameter("id");
%>
<div>
    <%
        if (null != id) {
            out.println("参数id=" + id);
        }
    %>
</div>
<%@ include file="top.jsp" %>
<div>
    <!--代码片段（页面关闭后才会被销毁）-->
    <%
        Date date = new Date();
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String curDate = dataFormat.format(date);
    %>
    <p>当前时间：<%=curDate%>
    </p>
    <p>访问次数：<%=count()%>
    </p>
    <%--隐藏的注释，在浏览器端，查看源码也看不到这段注释--%>
    <!--动态注释文本：<%=curDate%>-->
</div>
<!--动作标识，加载动态内容。包含文件时，程序会将请求转发到被包含页面，执行的是多个文件，JSP编译器会分别对这些页面进行编译-->
<jsp:include page="dynamic.jsp"/>
<!--加载文件，不支持表达式，被包含内容会原封不动地插入到包含页中。被包含文件中，不能有重名的变量和方法-->
<%@ include file="bottom.jsp" %>
</body>
</html>
