<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/5
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form method="post" enctype="multipart/form-data" action="fileUpload">
    <div>
        <label>点击选择要上传文件</label>
    </div>
    <div>
        <input type="file" name="cover" id="cover-img" />
    </div>
    <div>&nbsp;</div>
    <div>
        <button>提交</button>
    </div>
</form>
</body>
</html>
