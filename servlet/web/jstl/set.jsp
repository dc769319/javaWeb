<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/24
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="userInfo" class="com.charles.bean.UserInfo" />
<html>
<head>
    <title>设置变量的值，设置javaBean属性的值</title>
</head>
<body>
<c:set var="username" value="charles" scope="request" />
<div>
    设置的name变量值为
    <c:out value="${username}" />
</div>
<div>设置User Bean属性值</div>

<c:set target="${userInfo}" property="username">${username}</c:set>
<c:out value="${userInfo.username}"/>
<div>移除变量</div>
<c:remove var="username" scope="request"/>
<c:out value="变量值为：${username}"/>
<div>异常捕获</div>
<c:catch var="error">
    <c:set target="${userInfo}" property="password">111</c:set>
</c:catch>
<c:out value="${error}" escapeXml="false"/>
</body>
</html>
