<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交表单-注册Person</title>
</head>
<body>
<form method="post" action="personMsg.jsp">
    <p><label>姓名：</label><input type="text" name="name" title="name"></p>
    <p><label>年龄：</label><input type="number" name="age" title="age"></p>
    <p><label>班级：</label><input type="number" name="classNo" title="classNo"></p>
    <p><label>住址：</label><input type="text" name="address" title="address"></p>
    <p><button type="submit">提交</button></p>
</form>
</body>
</html>
