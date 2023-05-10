<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
    <h1>Pick a Number!</h1>
    <form method="post" action="/guess">
        <label for="number">Choose a number between 1 and 3!</label>
        <input type="text" id="number" name="number">

        <input type="submit" value="submit">
    </form>
</body>
</html>
