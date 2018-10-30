<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%
    String result = request.getAttribute("result").toString();
    String title = request.getAttribute("title").toString();
%>
<div><%=result%></div>
<div><%=title%></div>
<div>
    <form method="get">
        <p><label>Username:</label><input type="text" title="Username"/></p>
        <p><label>Password:</label><input type="text" title="Password"/></p>
    </form>
</div>
</body>
</html>
