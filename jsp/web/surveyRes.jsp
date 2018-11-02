<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/30
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setCharacterEncoding("utf-8"); %>
<html>
<head>
    <title>调查-表单结果</title>
</head>
<body>
<jsp:useBean id="survey" class="com.charles.jsp.Survey">
    <jsp:setProperty name="survey" property="*"/>
</jsp:useBean>
<jsp:useBean id="convert" class="com.charles.jsp.Convert">

</jsp:useBean>
<div>
    <table>
        <tr>
            <td>掌握的语言：</td>
            <td>
                <%=convert.arr2Str(survey.getLanguages())%>
            </td>
        </tr>
        <tr>
            <td>喜欢的IDE：</td>
            <td>
                <%=convert.arr2Str(survey.getIdes())%>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
