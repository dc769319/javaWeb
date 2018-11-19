<%--
  Created by IntelliJ IDEA.
  User: charlesdong
  Date: 2018/11/18
  Time: 10:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数组元素获取</title>
</head>
<body>
<%
    String[] books = {"Linux服务器编程", "Redis最佳实例", "Mysql高性能编程"};
    request.setAttribute("books", books);
%>
<ul>
    <%--将循环变量i保存到request范围内的变量中，否则el访问不到--%>
    <%
        String[] bookList = (String[]) request.getAttribute("books");
        for (int i = 0; i < bookList.length; i++) {
            request.setAttribute("reqI", i); %>
    <li>${books[reqI]}</li>
    <% } %>
</ul>
</body>
</html>
