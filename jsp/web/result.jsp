<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单结果页</title>
</head>
<body>
<%
    String username = request.getParameter("username");
    String address = request.getParameter("address");
    if (null != username && !username.equals("")) {
        session.setAttribute("username", username);
    }
%>
<p>你的名字：<%=username%>
</p>
<p>你的地址：<%=address%>
</p>
</body>
</html>
