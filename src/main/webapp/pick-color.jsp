<%--
  Created by IntelliJ IDEA.
  User: connorbrinkley
  Date: 5/10/23
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick a Color</title>
</head>
<body>
    <h1>Pick a Color!</h1>
    <form method="post" action="pickcolor">
        <label for="color-picker">Type in your color:</label>
        <input type="text" name="color-picker" id="color-picker">
        <input type="submit" value="submit">
    </form>
</body>
</html>
