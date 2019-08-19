<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search by Artist</title>
</head>
<body>
<form:form action="/search" method="get" modelAttribute="songs">
<input type="text" name= "artist" placeholder="Search..">
<input type ="submit">
</form:form> 


<table class = "table table-bordered">
    <thead>
        <tr>
            <th>Title</th>
            <th>Rating</th>
            <th>Actions</th>
          
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${songs}" var="song">
        <tr>
           
           <td> 
           		<a href = "/songs/${song.id}"><c:out value="${song.title}"/></a>
           	</td>
            <td><c:out value="${song.rating}"/></td>
	           <td> <form action="/delete/${song.id}" method="get">
		    		<input type="hidden" name="_method" value="delete">
		    		<input type="submit" value="Delete">
		    	
	    		</form>
    		</td>
          
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>