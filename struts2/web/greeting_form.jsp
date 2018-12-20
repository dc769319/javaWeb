<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/20
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Greeting表单</title>
</head>
<body>
<form action="greeting.action" method="post">
    <div>
        <label>姓名：</label>
        <input type="text" name="username" title="请输入姓名"/>
    </div>
    <div>
        <button type="submit">提交</button>
    </div>
</form>
</body>
</html>
