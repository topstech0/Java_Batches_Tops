<%@page import="com.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>

<%
	Student s = (Student)request.getAttribute("s");
%>
<br>
<h3 align="center">Update : Spring MVC-ORM</h3>
<br>
<hr>
<form action="update" method="post" name="update">
<input type="hidden" name="id" value="<%=s.getId()%>">
<table align="center" >
<tr>
	<td>First Name : </td>
	<td><input type="text" name="fname" value="<%=s.getFname()%>"></td>
</tr>
<tr>
	<td>Last Name : </td>
	<td><input type="text" name="lname" value="<%=s.getLname()%>"></td>
</tr>
<tr>
	<td>Email : </td>
	<td><input type="text" name="email" value="<%=s.getEmail()%>"></td>
</tr>
<tr>
	<td></td>
	<td><input type="submit" name="action" value="Update" class="btn btn-danger"></td>
</tr>
</table>
</form>


</body>
</html>