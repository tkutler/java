<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<h1><c:out value="${songs.title}"/></h1>
<p>Artist: <c:out value="${songs.artist}"/></p>
<p>Rating: <c:out value="${songs.rating}"/></p>
<form action="/delete/${song.id}" method="get">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
<a href ="/dashboard">Back to Dashboard</a>
</body>
</html>