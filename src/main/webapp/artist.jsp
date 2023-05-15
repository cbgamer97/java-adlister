<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List of Artists</title>
</head>
<body>
<c:forEach var="artist" items="${artists}">
    <div class="artist">
        <p>${artist.artist}</p>
    </div>
</c:forEach>
</body>
</html>
