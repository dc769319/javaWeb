<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试请求转发</title>
</head>
<body>
<%
    //向request对象设置两个属性
    request.setAttribute("result", "Unknown error");
    request.setAttribute("title", "Unknown title");
%>
<!--请求转发到login页面，url依然显示的是forward页面。请求转发到的页面可以读取request对象上的属性-->
<jsp:forward page="login.jsp" />
</body>
</html>
