<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	   
    <form action="/result" method="post">
        <p>Name:<input type="text" name="name"></p>
        <p>Dojo Location:
            <select name = "location">
                <option>San Jose</option>
                <option>Seattle</option>
                <option>New York</option>
                <option>Dallas</option>
                <option>Boise</option>
            </select>
        </p>
        <p>Favorite Language:
                <select name= "language">
                    <option>Javascript</option>
                    <option>Python</option>
                    <option>Java</option>
                    <option>Ruby</option>
                    <option>C+</option>
                </select>
            </p>
        <textarea name="comment" id="" cols="30" rows="10"></textarea>
        <input type="submit" value="Submit">
        </form>
</body>
</html>