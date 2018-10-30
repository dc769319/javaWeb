<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加Session</title>
</head>
<body>
<%
    //添加session
    session.setAttribute("username", "dongchao");
    //设置session有效期
    session.setMaxInactiveInterval(3);
    //移除session
    //session.removeAttribute("username");
    //销毁session
    //session.invalidate();
%>
</body>
</html>
