<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/30
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Error信息提示</title>
</head>
<body>
<%
    out.print(exception.getMessage());
    out.print("<br />");
    out.print(exception.getStackTrace());
%>
</body>
</html>
