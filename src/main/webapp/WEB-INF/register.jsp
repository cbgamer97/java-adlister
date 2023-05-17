<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h1>Create Your Ad Account!</h1>
    <form action="/register" method="post">
        <label for="email">Email: </label>
        <input type="email" name="email" id="email">
        <label for="username">Username: </label>
        <input type="text" name="username" id="username">
        <label for="password">Password: </label>
        <input type="password" name="password" id="password">
        <label for="confirm_password">Confirm Password: </label>
        <input id="confirm_password" name="confirm_password" type="password">
        <input type="submit" value="submit">
    </form>
</body>
</html>
