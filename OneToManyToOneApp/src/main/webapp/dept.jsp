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
<h3 align="center">Add Department</h3>
<hr>
<form action="EmpController" method="post">
<table align="center">
	<tr>
		<td>Department Name : </td>
		<td><input type="text" name="dname"></td>
	</tr>
	<tr>
		<td>Location : </td>
		<td><input type="text" name="loc"></td>
	</tr>	
	
	<tr>
		<td> </td>
		<td><input type="submit" name="action" value="Add Department" class="btn btn-danger"></td>
	</tr>
</table>
</form>
</body>
</html>