<%@ page import="java.net.URLEncoder" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>设置cookie</title>
</head>
<body>
<%
    String user = request.getParameter("user");
    if(null != user && !user.equals("")){
        //设置cookie
        user = URLEncoder.encode(user, "utf-8");
        Cookie cookie = new Cookie("user", user);
        //设置cookie存活时间30s
        cookie.setMaxAge(30);
        response.addCookie(cookie);
    }
%>
</body>
</html>
