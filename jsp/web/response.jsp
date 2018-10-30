<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>响应</title>
</head>
<body>
<%
    //设置3秒后刷新网页
    response.setHeader("refresh", "3");
    //禁用缓存
    response.setHeader("Cache-Control", "no-cache");
    response.setDateHeader("Expires", 0);
%>
</body>
</html>
