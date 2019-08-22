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
		<h1><c:out value="${categories.name}"/></h1>
	</div>	
	<div>
	<h1>All Products</h1>
	<c:forEach items="${products}" var="product">
	<p><c:out value="${product.name}"/></p>
	</c:forEach> 
	</div>
	<div>
	<form:form action="/newCategoryProduct" method="post" modelAttribute="categories">
	    <p>
        <form:label path="products">products</form:label>
        <form:errors path="products"/>
        <form:select path="products" items="${products}" itemLabel = "name" itemValue = "id" />
    	</p>
    	<input type="submit" value="Submit"/>
    	
	</form:form>
	</div>
</body>
</html>