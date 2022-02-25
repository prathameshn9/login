<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="up">
 ID:<input type="text"value="<%=request.getParameter("h1") %>" name="h1"><br>
 Name:<input type="text"value="<%=request.getParameter("h2") %>"name="h2"><br>
 Mobile No:<input type="text"value="<%=request.getParameter("h3") %>"name="h3"><br>
 Department:<input type="text"value="<%=request.getParameter("h4") %>"name="h4"><br>
 Total Fee<input type="text"value="<%=request.getParameter("h5") %>"name="h5"><br>
 Fee Paid:<input type="text"value="<%=request.getParameter("h6") %>"name="h6"><br>
 Balance:<input type="text"value="<%=request.getParameter("h7") %>"name="h7"><br>
 <input type="submit" value="Update">
</form>
</body>
</html>