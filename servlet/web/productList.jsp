<%--
  Created by IntelliJ IDEA.
  User: charlesdong
  Date: 2018/11/17
  Time: 10:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.charles.bean.Product" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>产品列表</title>
    <style type="text/css">
        table{
            border-collapse:collapse;
        }
        table,th,td{
            margin: 0;
            padding: 5px;
            border: gray 1px solid;
        }
    </style>
</head>
<body>
<%
    List<Product> productList = (List<Product>) request.getAttribute("productList");
    String pageStr = (String) request.getAttribute("pageStr");
%>
<table>
    <tr>
        <th>产品编号</th>
        <th>产品名称</th>
        <th>价格</th>
        <th>数量</th>
        <th>厂商</th>
    </tr>
    <% for(Product product:productList){ %>
    <tr>
        <td><%=product.getId()%></td>
        <td><%=product.getName()%></td>
        <td><%=product.getPrice()%></td>
        <td><%=product.getNum()%></td>
        <td><%=product.getUnit()%></td>
    </tr>
    <% } %>
</table>
<div>
    <%=pageStr%>
</div>
</body>
</html>
