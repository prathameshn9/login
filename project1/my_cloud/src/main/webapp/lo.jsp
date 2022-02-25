<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
     <%@ include file="../p1.css"%>
</style>
<title>Insert title here</title>
</head>
<body >
<div>
	<img id="i1"src="pexels-photo-531880.jpeg" alt="no image">	
</div>
<div id="d1">
<a href="lo.jsp" >Home</a>
<a href="departmentLogin.jsp">Department login</a>
<a href="studentlogin.jsp">Student Login</a>
</div>
<div>
<h1>Administrator Login</h1>
<form action="login">
<table >
<tr>
<td>
Enter Mobile No<input type="text" placeholder="10-digit mobile no" required  autofocus name="n1" pattern="[0-9]{10}"><br><br>
Password<input type="password" id="p2" placeholder="Password" name="p1" required><br>
<a href="forgot.jsp" id="p5">Forgot Password</a>
</td>
</tr>
<tr>
<td id="p1"><input  type="submit"></td>
</tr>
</table>
</form>
</div>
</body>
</html>
