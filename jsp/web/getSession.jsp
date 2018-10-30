<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>读取Session</title>
</head>
<body>
<%
    Object username = session.getAttribute("username");
    if (null != username && !username.equals("")) {
        out.println("Session[username] = " + username.toString());
    } else {
        out.println("当前未设置username session");
    }
%>
</body>
</html>
