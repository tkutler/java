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
    <h1>Add a Dog</h1>
    <form action="Dog" method="get">
    <p>Name:<input type="text" name="dname" ></p>
    <p>Breed:<input type="text" name="dbreed" ></p>
    <p>Weight:<input type="text" name="dweight" ></p>
    <p><input type="submit"></p>
    
    </form> 
    <h1>Add a Cat</h1>
    <form action="Cat" method="get">
        <p>Name:<input type="text" name="cname" ></p>
        <p>Breed:<input type="text" name="cbreed" ></p>
        <p>Weight:<input type="text" name="cweight" ></p>
        <p><input type="submit"></p>
        </form> 
</div>


</body>
</html>