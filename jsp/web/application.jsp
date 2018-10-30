<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/30
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>应用程序初始化参数</title>
</head>
<body>
<%
    //添加application对象的属性
    application.setAttribute("version", "1.0.1");
    application.setAttribute("description", "charlesApp");
    Enumeration<String> attrNames = application.getAttributeNames();
    //遍历读取所有的属性
    while (attrNames.hasMoreElements()) {
        String attrKey = attrNames.nextElement();
        String attrVal = null;
        if (null != attrKey && !attrKey.equals("")) {
            //获取参数值
            attrVal = application.getAttribute(attrKey).toString();
        }
        out.println(attrKey + ":" + attrVal);
        out.println("<br />");
    }
    //application对象的使用，读取所有在WEB-INF/web.xml文件中定义的初始化参数名称
    Enumeration<String> paramNames = application.getInitParameterNames();
    //枚举类型遍历
    while (paramNames.hasMoreElements()) {
        String paramKey = paramNames.nextElement();
        String paramVal = null;
        if (null != paramKey && !paramKey.equals("")) {
            //获取参数值
            paramVal = application.getInitParameter(paramKey);
        }
        out.println(paramKey + ":" + paramVal);
    }
%>
</body>
</html>
