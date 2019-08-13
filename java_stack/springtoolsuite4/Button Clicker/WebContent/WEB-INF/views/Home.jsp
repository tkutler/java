<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
    <form action="Count" method="get">
        <p><input type="submit" name="submit" value="click me"></p>
    </form> 
    <p> You have clicked the button times <%= session.getAttribute("submit")%>; 
</div>
</body>
</html>