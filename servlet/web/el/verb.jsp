<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: charlesdong
  Date: 2018/11/19
  Time: 下午9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>运算</title>
</head>
<body>
<%
    List<String> students = new ArrayList<>();
    students.add("小白");
    students.add("小黑");
    students.add("小栗子");
    students.add("小押司");
    request.setAttribute("students", students);
%>
<%
    List<String> studentList = (ArrayList<String>) request.getAttribute("students");
    for (int i = 0; i < studentList.size(); i++) {
        request.setAttribute("stuIndex", i); %>
${students[stuIndex]}
<%
    }
%>


<%
    request.setAttribute("user", "charles");
    request.setAttribute("password", "Charles@415");
%>
<div>user=${user}</div>
<div>password=${password}</div>
<div>
    \${user!='' && password != ''}${user!='' && password != ''}
</div>
<%
    request.setAttribute("cart", "cart");
%>
<div>
    ${not empty cart?cart:'空'}
</div>
</body>
</html>
