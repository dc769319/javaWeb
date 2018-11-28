<%--
  Created by IntelliJ IDEA.
  User: charlesdong
  Date: 2018/11/27
  Time: 8:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>条件判断标签</title>
</head>
<body>
<c:if test="${empty param.username}" var="result">
    <form method="get" action="">
        <label title="username">Username:
        </label>
        <input title="username" type="text" name="username" value=""/>
        <div>
            <button type="submit">提交</button>
        </div>
    </form>
</c:if>
<c:if test="${!result}">
    <h3>Welcome, ${param.username}</h3>
</c:if>
</body>
</html>
