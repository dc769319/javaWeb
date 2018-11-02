<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/31
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单提交图书信息</title>
</head>
<body>
<form method="post" action="addBook">
    <div>
        <label>图书名：</label>
        <input type="text" name="name" title="name" />
    </div>
    <div>
        <label>作者：</label>
        <input type="text" name="author" title="author" />
    </div>
    <div>
        <label>价格：</label>
        <input type="number" name="price" title="price" step="0.01" />
    </div>
    <div>
        <label>编号：</label>
        <input type="number" name="id" title="id" />
    </div>
    <div>
        <button type="submit">提交</button>
    </div>
</form>
</body>
</html>
