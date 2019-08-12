
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Demo JSP</title>
        <link rel = "stylesheet" href= "checkerboard.css">

    </head>
<body>
    <!-- getting the value for the name parameter -->
    <% int width = Integer.parseInt(request.getParameter("width")); %>
    <% int height = Integer.parseInt(request.getParameter("height")); %>
    
  
        <table>
        <% for(int i = 0; i < width; i++) { %>
        <tr> 
        
        	<% for(int j = 0; j < height; j++) { %>
            	
            	<td class= "color<%=(i+j)%2+1%>">hi</td>
            	
            <% } %>
            	
        </tr>
        <% } %>
    </table>
    

    
</body>
</html>