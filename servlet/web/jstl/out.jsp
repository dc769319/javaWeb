<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/24
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSTL输出</title>
</head>
<body>
<div>
    <h5>JSTL将内容中的特殊字符转换成html实体</h5>
    <c:out value="test<hr>" escapeXml="true"></c:out>
</div>
<div>
    <h5>不转换成html实体</h5>
    <c:out value="test<hr>" escapeXml="false"></c:out>
</div>
</body>
</html>
