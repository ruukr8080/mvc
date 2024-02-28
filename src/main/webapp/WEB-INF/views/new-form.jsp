<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
form action="" <-액션 안에 들어가는건 호출 대상. -> /jsp/members/save"
<form action="save" method="post">
    username : <input type="text" name="name"/>
    age : <input type="text" name="age"/>
    <button type="submit">gogo</button>
</form>
</body>
</html>