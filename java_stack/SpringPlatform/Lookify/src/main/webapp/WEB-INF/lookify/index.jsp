<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<h1>All Songs</h1>
<a href="/songs/new">Create New Song</a>
<a href="/songs/topten">Top Ten Songs</a>
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