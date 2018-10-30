<%@ page import="java.net.URLDecoder" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>读取Cookie</title>
</head>
<body>
<%
    //读取cookies数组
    Cookie[] cookies = request.getCookies();
    String user;
    if (null != cookies && cookies.length > 0) {
        //循环遍历
        for (Cookie cur : cookies) {
            //找到名称为user的cookie
            if (!cur.getName().equals("user")) {
                continue;
            }
            //拿出cookie的value
            user = URLDecoder.decode(cur.getValue(), "utf-8");
            out.println("user value from cookies is " + user);
            break;
        }
    }
%>
</body>
</html>
