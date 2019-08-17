<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>

</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<h1>All Languages</h1>
<a href="/languages/new">Create New Language</a>
<table class = "table table-bordered">
    <thead>
        <tr>
            <th>Title</th>
            <th>Creator</th>
            <th>Current Version</th>
            <th>Actions</th>
          
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${languages}" var="language">
        <tr>
           <%--  <td><c:out value="${language.title}"/></td> --%>
            <td><c:out value="${language.title}"/></td>
            <td><c:out value="${language.creator}"/></td>
            <td><c:out value="${language.currentVersion}"/></td>
            <td><a href="/languages/edit/${language.id}">Edit Book</a></td>
	           <td> <form action="/languages/delete/${language.id}" method="get">
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