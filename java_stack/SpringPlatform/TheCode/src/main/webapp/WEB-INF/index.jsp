<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h3>You must train harder!</h3>
<form action="/code" method="post">
    <p><input type="text" name="guess"></p>
    <p><input type="submit"></p>
</form> 

<div>
<c:out value="${error}"/>
</div>