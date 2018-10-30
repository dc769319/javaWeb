<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用javaBean中的属性</title>
</head>
<body>
<jsp:useBean id="produce" class="com.charles.jsp.Produce">
    <jsp:setProperty name="produce" property="name" value="吉他" />
    <jsp:setProperty name="produce" property="price" value="910.2" />
    <jsp:setProperty name="produce" property="factoryAdd" value="广东省" />
    <div>
        <ul>
            <li><jsp:getProperty name="produce" property="name" /></li>
            <li><jsp:getProperty name="produce" property="price" /></li>
            <li><jsp:getProperty name="produce" property="count" /></li>
            <li><jsp:getProperty name="produce" property="factoryAdd" /></li>
        </ul>
    </div>
</jsp:useBean>
</body>
</html>
