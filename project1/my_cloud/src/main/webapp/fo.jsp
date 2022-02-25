<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="my_db.db" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="po" >
<input type="hidden" name="q" value="<%= request.getAttribute("name")%>">
Enter your new password<input type="text" name="q1">
Re enter your password<input type="text" name="q2">
<input type="submit">
</form>
</body>


</html>