<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/8
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加图书信息</title>
</head>
<body>
<form method="post" action="">
    <div>
        <label>图书名称</label>
        <input type="text" name="name" title="输入图书名称" />
    </div>
    <div>
        <label>价格</label>
        <input type="number" step="0.01" name="price" title="输入价格" />
    </div>
    <div>
        <label>数量</label>
        <input type="number" name="bookCount" title="输入数量" />
    </div>
    <div>
        <label>作者</label>
        <input type="text" name="author" title="输入作者" />
    </div>
    <div>
        <button type="submit">提交</button>
    </div>
</form>
</body>
</html>
