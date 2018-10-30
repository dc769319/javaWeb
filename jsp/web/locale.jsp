<%@ page import="java.util.Locale" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>本地化信息展示</title>
</head>
<body>
<%
    //通过HTTP协议头的Accept-Language字段，获取用户使用的本地语言。例如：Accept-Language: en-US,en
    Locale locale = request.getLocale();
    String welcome = "";
    if (locale.equals(Locale.US)) {
        welcome = "Welcome, my friend";
    } else if (locale.equals(Locale.CHINA)) {
        welcome = "欢迎你";
    }
%>
<p>
    <%=welcome%>
</p>
</body>
</html>
