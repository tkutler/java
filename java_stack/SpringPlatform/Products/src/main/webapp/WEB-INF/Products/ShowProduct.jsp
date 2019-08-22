<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Info</title>
</head>
<body>
	<div>
		<h1><c:out value="${products.name}"/></h1>
	</div>	
	<div>
	<h1>All Categories</h1>
	<c:forEach items="${categories}" var="category">
	<p><c:out value="${category.name}"/></p>
	</c:forEach> 
	</div>
	<div>
	<form:form action="/newProductCategory" method="post" modelAttribute="products">
	    <p>
        <form:label path="categories">Categories</form:label>
        <form:errors path="categories"/>
        <form:select path="categories" items="${categories}" itemLabel = "name" itemValue = "id" />
    	</p>
    	<input type="submit" value="Submit"/>
    	
	</form:form>
	</div>
</body>
</html>