<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 19-11-4
  Time: 下午7:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>测试jsp表单输入</title>
</head>
<body>
    <h1>你好</h1>
<form action="/TestJspServlet">
   <label>账号</label> <input type="text" name="name"><br>
    <label>密码</label> <input type="password" name="pwd">
    <input type="submit" value="提交">
    <%= session.getAttribute("wd")%>
</form>
</body>
</html>
