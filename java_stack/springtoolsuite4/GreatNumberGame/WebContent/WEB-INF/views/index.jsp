<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The Great Number Game</title>
</head>
<body>
	<div>
    <h1>Welcome to the Great Number Game!</h1>
    <h3>I am thinking of a number between 1 and 100</h3>
    <h3>take a guess!</h3>
</div>
<div>
    <form action="Guess" method="POST">
        <input type="text" name="guess">
        <input type="submit" name="submit">
    </form>

</div>
</body>
</html>