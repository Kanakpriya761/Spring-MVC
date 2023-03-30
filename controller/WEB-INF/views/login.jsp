<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to View Page </h1>

<form action="/home" method="POST">
<p><font style="color:red">${error}</font></p>
Name : <input name="name" type="text"/>
Password :  <input name ="pass" type ="password"/>
<input type="submit" value="Login"/>
</form>
</body>
</html>