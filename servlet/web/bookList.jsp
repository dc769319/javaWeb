<%@ page import="java.util.List" %>
<%@ page import="com.charles.bean.Book" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/10
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示已添加的书籍列表</title>
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
    List<Book> bookList = (List<Book>) request.getAttribute("bookList");
    if (null != bookList) {
%>

<table>
    <tr>
        <th>ID</th>
        <th>书名</th>
        <th>价格</th>
        <th>数量</th>
        <th>作者</th>
        <th>操作</th>
    </tr>

    <%
        for (Book book : bookList) {
    %>
    <tr>
        <td><%=book.getId()%>
        </td>
        <td><%=book.getName()%>
        </td>
        <td><%=book.getPrice()%>
        </td>
        <td><%=book.getBookCount()%>
        </td>
        <td><%=book.getAuthor()%>
        </td>
        <td>
            <form method="post" action="bookUpdate">
                <input type="hidden" value="<%=book.getId()%>" name="id">
                <input type="text" name="bookCount" placeholder="输入数量">
                <button type="submit">修改</button>
            </form>
        </td>
    </tr>
    <%
        }
    %>
</table>
<%
    }
%>
</body>
</html>
