<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/30
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>调查-提交表单</title>
</head>
<body>
<form method="post" action="surveyRes.jsp">
    <div>
        <label>掌握的语言</label>
        <input type="checkbox" value="Java" title="Java" name="languages">Java
        &nbsp;
        <input type="checkbox" value="PHP" title="PHP" name="languages">PHP
        &nbsp;
        <input type="checkbox" value="Javascript" title="Javascript" name="languages">Javascript
        &nbsp;
        <input type="checkbox" value="C" title="C" name="languages">C
        &nbsp;
        <input type="checkbox" value="C++" title="C++" name="languages">C++
        &nbsp;
        <input type="checkbox" value="Go" title="Go" name="languages">Go
    </div>
    <div>
        <label>喜欢的IDE</label>
        <input type="checkbox" value="IDEA" title="IDEA" name="ides">IDEA
        &nbsp;
        <input type="checkbox" value="PHPStorm" title="PHPStorm" name="ides">PHPStorm
        &nbsp;
        <input type="checkbox" value="WebStorm" title="WebStorm" name="ides">WebStorm
        &nbsp;
        <input type="checkbox" value="Clion" title="Clion" name="ides">Clion
        &nbsp;
        <input type="checkbox" value="Sublime" title="Sublime" name="ides">Sublime
        &nbsp;
        <input type="checkbox" value="Vim" title="Vim" name="ides">Vim
    </div>
    <div>
        <button type="submit">提交</button>
    </div>
</form>
</body>
</html>
