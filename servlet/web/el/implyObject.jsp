<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/20
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>访问隐含对象信息</title>
</head>
<body>
<form method="post" action="">
    <div>
        User:<input type="text" name="user" title="user"/>
    </div>
    <div>
        Description:<input type="text" name="description" title="user"/>
    </div>
    <div>
        爱好：<input type="checkbox" name="hobby" value="1">喝酒
        <input type="checkbox" name="hobby" value="2">打牌
        <input type="checkbox" name="hobby" value="3">玩游戏
    </div>
    <div>
        <input type="submit" title="提交" value="提交">
    </div>
</form>
<div>
    ${param.user}
</div>
<div>
    ${param.description}
</div>
<div>
    ${paramValues.hobby[0]}&nbsp;
    ${paramValues.hobby[1]}&nbsp;
    ${paramValues.hobby[2]}
</div>
<div>
    ${header.connection}
</div>
<div>
    ${header['user-agent']}
</div>
<div>
    ${initParam.author}
</div>
<div>
    <%
        Cookie cookie = new Cookie("uuid", "c3B1v");
        response.addCookie(cookie);
    %>
    <!--隐含cookie对象-->
    ${cookie.uuid.value}
</div>
</body>
</html>
