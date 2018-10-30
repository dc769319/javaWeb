<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //设置请求的编码格式为utf-8
    request.setCharacterEncoding("utf-8");
%>
<html>
<head>
    <title>javaBean展示表单数据</title>
</head>
<body>
<jsp:useBean id="person" class="com.charles.jsp.Person">
    <!--设置所有属性值-->
    <jsp:setProperty name="person" property="*" />
</jsp:useBean>
<div>
    <ul>
        <li><jsp:getProperty name="person" property="name" /></li>
        <li><jsp:getProperty name="person" property="age" /></li>
        <li><jsp:getProperty name="person" property="classNo" /></li>
        <li><jsp:getProperty name="person" property="address" /></li>
    </ul>
</div>
</body>
</html>
