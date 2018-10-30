<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交表单，存到session</title>
</head>
<body>
<div>
    <%
        //试图从session中取出username
        Object tmp = session.getAttribute("username");
        String username = null;
        if (null != tmp) {
            username = tmp.toString();
        }
    %>
</div>
<form method="post" action="result.jsp">
    <p><label>Username:</label><input type="text" name="username" title="Username" value="<%
        if(null != username){
            out.print(username);
        }
    %>"></p>
    <p><label>Address:</label><input type="text" name="address" title="Address"></p>
    <p><input type="submit" title="提交"></p>
</form>
</body>
</html>
