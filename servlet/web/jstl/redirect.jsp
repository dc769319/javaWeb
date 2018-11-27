<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/27
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>重定向</title>
</head>
<body>
<!--/servlet/el/bookList.jsp-->
<c:redirect url="/el/bookList.jsp" context="/servlet">
    <c:param name="username" value="charles" />
</c:redirect>
</body>
</html>
