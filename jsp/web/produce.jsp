<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/30
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用javaBean中的属性</title>
</head>
<body>
<jsp:useBean id="produce" class="">

</jsp:useBean>
<div>
    <ul>
        <li><jsp:getProperty name="produce" property="name" /></li>
        <li><jsp:getProperty name="produce" property="price" /></li>
        <li><jsp:getProperty name="produce" property="count" /></li>
        <li><jsp:getProperty name="produce" property="factoryAdd" /></li>
    </ul>
</div>
</body>
</html>
