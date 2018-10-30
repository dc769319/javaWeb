<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>重定向</title>
</head>
<body>
<div>
    <%
        //重定向到另一个页面
        response.sendRedirect("serverMsg.jsp");
    %>
</div>
</body>
</html>
