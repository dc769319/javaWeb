<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Locale" %>
<%@ page import="java.util.Random" %><%--
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
<c:choose>
    <c:when test="${empty param.username}">
        <form method="get" action="">
            <label title="username">Username:
            </label>
            <input title="username" type="text" name="username" value=""/>
            <div>
                <button type="submit">提交</button>
            </div>
        </form>
    </c:when>
    <c:otherwise>
        <h3>Welcome, ${param.username}</h3>
    </c:otherwise>
</c:choose>
<c:set var="hour">
    <%=Calendar.getInstance(Locale.CHINA).get(Calendar.HOUR_OF_DAY)%>
</c:set>
<c:set var="minute">
    <%=Calendar.getInstance(Locale.CHINA).get(Calendar.MINUTE)%>
</c:set>
<c:choose>
    <c:when test="${hour > 1 && hour < 7}">早上好</c:when>
    <c:when test="${hour > 7 && hour < 12}">上午好</c:when>
    <c:when test="${hour > 12 && hour < 14}">中午好</c:when>
    <c:when test="${hour > 14 && hour < 18}">下午好</c:when>
    <c:when test="${hour > 18 && hour < 24}">晚上好</c:when>
</c:choose>
<h4>当前时间：${hour}:${minute}</h4>
<div>
<%
    Random rm = new Random();
    int ra = rm.nextInt(10);
    out.print(ra);
%>
</div>
</body>
</html>
