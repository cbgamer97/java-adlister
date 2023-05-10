<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View Color</title>
    <style>
        <c:if test="${backgroundColor != null}">
        html {
            background: ${backgroundColor};
        }
        </c:if>
    </style>
</head>
<body>
    <h1>Color Page!</h1>
    <h2>Enjoy our colorful page!</h2>
</body>
</html>
