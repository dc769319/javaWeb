<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/26
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>生成带参数的超链接</title>
</head>
<body>
<c:url var="registerUrl" scope="page" value="register.jsp">
    <c:param name="username" value="charles" />
    <c:param name="password" value="charles111" />
</c:url>
<%--生成register.jsp?username=charles&password=charles111--%>
<a href="${registerUrl}">注册</a>
</body>
</html>
