<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>显示用户</title>
</head>
<body>
    <table border="1" align="center" width="50%">
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>AGE</th>
        </tr>
        <c:forEach items="${list }" var="user">
            <tr>
                <td>${user.userId}</td>
                <td>${user.userName}</td>
                <td>${user.age}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
