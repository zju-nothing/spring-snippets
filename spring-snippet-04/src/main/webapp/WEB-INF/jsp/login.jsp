<%--
  Created by IntelliJ IDEA.
  User: chenliu
  Date: 9/17/14
  Time: 11:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:if test="${!empty error}">
    <c:out value="${error}"/>
</c:if>

<form action="<c:url value="/loginCheck.html"/>" method="post">
    用户名：
    <input type="text" name="userName"/>
    <br/>
    密码：
    <input type="password" name="password"/>
    <br/>

    <input type="submit" value="登陆"/>
</form>
</form>
</body>
</html>
