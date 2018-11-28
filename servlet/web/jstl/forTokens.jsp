<%--
  Created by IntelliJ IDEA.
  User: charlesdong
  Date: 2018/11/27
  Time: 9:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>forTokens</title>
</head>
<body>
<c:set var="sourceStr" value="Javascript;Java;PHP;C++,Ruby"/>
<div>
    <h5>原字符串</h5>
    <p>${sourceStr}</p>
</div>
<div>
    <h5>分割后的字符串</h5>
    <c:forTokens items="${sourceStr}" delims=";," var="item">
        <p>${item}</p>
    </c:forTokens>
</div>
</body>
</html>
