<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/22
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Map型request/application/session</title>
</head>
<body>
<%=request.getAttribute("address")%>
<%=application.getAttribute("time")%>
<%=session.getAttribute("company")%>
</body>
</html>
