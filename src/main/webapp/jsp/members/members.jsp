<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<a href="/index.html">메인</a>
<table>
    <thead>
    <th>id</th>
    <th>username</th>
    <th>age</th>
    </thead>
    <tbody>


    <c:forEach items="${members}" var="member">
        <tr>
            <td>${member.id}</td>
            <td>${member.name}</td>
            <td>${member.age}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>