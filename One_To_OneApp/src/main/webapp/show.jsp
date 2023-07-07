<%@page import="com.dao.EmpDao"%>
<%@page import="com.bean.Emp"%>
<%@page import="java.util.List"%>
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
<table class="table table-hover">

<tr>
<th>EINFO</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Eid</th>
<th>Job</th>
<th>Salary</th>

</tr>

<%
	List<Emp> list = EmpDao.getAllEmp();
	for(Emp e : list)
	{
%>
<tr>
	<td><%=e.getEinfo().getEinfo() %></td>
	<td><%=e.getEinfo().getFname() %></td>
	<td><%=e.getEinfo().getLname() %></td>
	<td><%=e.getEinfo().getEmail() %></td>
	<td><%=e.getEid() %></td>
	<td><%=e.getJob()%></td>
	<td><%=e.getSalary() %></td>
</tr>
<%		
	}
	
%>




</table>
</body>
</html>