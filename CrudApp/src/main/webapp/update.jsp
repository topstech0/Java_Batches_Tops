<%@page import="com.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

</head>
<body>

	<h2 align="center">Update Form</h2>
	<hr>
	<br>

	<%
		Employee e = (Employee)request.getAttribute("e");
		
	%>

	<form name="register" action="EmpController" method="post">


		<table align="center">
			<tr>
				<input type="hidden" name="id" value="<%=e.getId()%>">
			</tr>
			<tr>
				<td>First Name :</td>
				<td><input type="text" name="fname" value="<%=e.getFname()%>"></td>

			</tr>
			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="lname" value="<%=e.getLname()%>"></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="text" name="email" value="<%=e.getEmail()%>"></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile" value="<%=e.getMobile()%>"></td>

			</tr>

			<tr>
				<td>Date of Birth:</td>
				<td><input type="date" name="dob" value="<%=e.getDob()%>"></td>
			</tr>

			<tr>
				<td>Gender :</td>
				<%
					if(e.getGender().equals("male"))
					{
				%>
				<td><input type="radio" name="gender" value="male"
					checked="checked">Male <input type="radio" name="gender"
					value="female">Female</td>
				<%
					}
					else if(e.getGender().equals("female"))
					{
				%>
				<td><input type="radio" name="gender" value="male">Male
					<input type="radio" name="gender" value="female" checked="checked">Female
				</td>
				<%
					}
					else
					{
				%>
				<td><input type="radio" name="gender" value="male">Male
					<input type="radio" name="gender" value="female">Female</td>
				<%
					}
				%>


			</tr>


			<tr>
				<td>Address :</td>
				<td><textarea rows="5" name="address"><%=e.getAddress() %></textarea></td>
			</tr>


			<tr>
				<td></td>
				<td><input type="submit" name="action" value="Update"
					class="btn btn-danger"></td>
			</tr>
		</table>
	</form>





</body>
</html>