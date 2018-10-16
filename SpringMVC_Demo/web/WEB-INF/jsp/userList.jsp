<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xhzhang
  Date: 2018/10/16
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/queryUsers.action" method="post">
    用户列表：
    <table width="100%" border=1>
        <tr>
            <td>用户id</td>
            <td>用户名称</td>
            <td>用户年龄</td>
            <td>用户住址</td>
        </tr>
        <c:forEach items="${userList }" var="user">
            <tr>
                <td>${user.id }</td>
                <td>${user.name }</td>
                <td>${user.age}</td>
                <td>${user.address }</td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
