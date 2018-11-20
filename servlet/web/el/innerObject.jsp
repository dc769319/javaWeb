<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/20
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>访问内置对象</title>
</head>
<body>
<ul>
    <li>serverPort:${pageContext.request.serverPort}</li>
    <li>localPort:${pageContext.request.localPort}</li>
    <li>response.contentType:${pageContext.response.contentType}</li>
    <li>out.bufferSize:${pageContext.out.bufferSize}</li>
    <li>session.maxInactiveInterval:${pageContext.session.maxInactiveInterval}</li>
    <li>servletContext.contextPath:${pageContext.servletContext.contextPath}</li>
</ul>
</body>
</html>
