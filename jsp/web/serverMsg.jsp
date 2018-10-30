<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取请求头中的信息</title>
</head>
<body>
<%
    String uri = request.getRequestURI();
    String url = request.getRequestURL().toString();
    String host = request.getHeader("host");
    String userAgent = request.getHeader("user-agent");
%>
<p>URI: <%=uri%></p>
<p>URL: <%=url%></p>
<p>HOST: <%=host%></p>
<p>UserAgent: <%=userAgent%></p>
</body>
</html>
