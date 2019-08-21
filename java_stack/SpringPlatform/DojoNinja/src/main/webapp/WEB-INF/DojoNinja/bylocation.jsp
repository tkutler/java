<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${ninjas}" var="ninja">
	<p><c:out value="${ninja.firstName}"/></p>
	<p><c:out value="${ninja.lastName}"/></p>
	<p><c:out value="${ninja.age}"/></p>
	</c:forEach>
</body>
</html>