<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%ResultSet ps=(ResultSet) request.getAttribute("name");%>
  <TABLE BORDER="1">
      <TR>
      <TH>ID</TH>
      <TH>Name</TH>
      <TH>Mobile NO</TH>
      <TH>Department</TH>
      <TH>Total Fees</TH>
      <TH>Fees Paid</TH>
      <TH>Balance</TH>
      </TR>
      <% while(ps.next()){ %>
      <TR>
       <TD> <%= ps.getString(1) %></td>
       <TD> <%= ps.getString(2) %></TD>
       <TD> <%= ps.getString(3) %></TD>
       <TD> <%= ps.getString(5) %></TD>
       <TD> <%= ps.getString(6) %></TD>
       <TD> <%= ps.getString(7) %></TD>
       <TD> <%= ps.getString(8) %></TD>
       <TD><form action="edi.jsp">
       <input type="hidden" name="h1"value="<%= ps.getString(1) %>">
       <input type="hidden" name="h2"value="<%= ps.getString(2) %>">
       <input type="hidden" name="h3"value="<%= ps.getString(3) %>">
       <input type="hidden" name="h4"value="<%= ps.getString(5) %>">
       <input type="hidden" name="h5"value="<%= ps.getString(6) %>">
       <input type="hidden" name="h6"value="<%= ps.getString(7) %>">
       <input type="hidden" name="h7"value="<%= ps.getString(8) %>">
       <input type="submit" value="Edit">
       </form></TD>
       <td> <form action="dele">
       <input type="hidden" name="h1" value="<%= ps.getString(1) %>">
       <input type="submit" value="Delete">
       </form>
       </td>
      </TR>
      
      <% } %>
     </TABLE>
     <table>
     <tr>
     <td>
     <form action="cre.jsp">
       <input type="submit" value="Create">
       </form>
     </tr></table>     
</body>
</html>