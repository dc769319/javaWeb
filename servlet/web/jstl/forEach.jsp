<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: charlesdong
  Date: 2018/11/27
  Time: 8:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>forEach</title>
</head>
<body>

<%
    List<String> list = new ArrayList<>();
    list.add("举世无双");
    list.add("倾国倾城");
    list.add("武功盖世");
    pageContext.setAttribute("list", list);
%>

<ul>
    <c:forEach items="${pageScope.list}" var="keyword" varStatus="id">
        <li>${id.index}:${keyword}</li>
    </c:forEach>
</ul>

<div>
    <h4>10以内的奇数</h4>
    <c:forEach begin="1" end="10" step="2" var="i">
        ${i}&nbsp;
    </c:forEach>
</div>
</body>
</html>
