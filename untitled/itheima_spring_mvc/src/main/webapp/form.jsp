<%--
  Created by IntelliJ IDEA.
  User: dalla
  Date: 2022/4/1
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick14" method="post">
    <%--表明是第几个User对象的username age--%>
    <input type="text" name="userList[0].name"><br>
        <input type="text" name="userList[0].age"><br>
        <input type="text" name="userList[1].name"><br>
        <input type="text" name="userList[1].age"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
