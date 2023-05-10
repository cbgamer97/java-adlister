<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
    <h1>Pick a Number!</h1>
    <form method="post" action="/guess">
        <label for="guess">Choose a number between 1 and 3!</label>
        <input type="number" id="guess" name="guess">

        <input type="submit" value="Guess">
    </form>
</body>
</html>
