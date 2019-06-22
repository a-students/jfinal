<%--
  Created by IntelliJ IDEA.
  User: ABC
  Date: 2019/6/17
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    index jsp
<c:forEach items="${users}" var="user">
    <tr>
        <td>${user.id}</td>
        <td>${user.lastname}</td>
        <td>${user.gender}</td>
        <td>${user.d_id}</td>
        <br>
    </tr>
</c:forEach>
</body>
</html>
