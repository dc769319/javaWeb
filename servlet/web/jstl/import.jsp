<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/24
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>导入子页面</title>
</head>
<body>
<c:set var="tagList" value="首页|用户中心|产品中心" />
<h1>我是标题</h1>
<c:import url="head.jsp" charEncoding="UTF-8">
    <c:param name="tab" value="${tagList}"/>
</c:import>
</body>
</html>
