<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
String name=request.getParameter("val");
if(name==null||name.trim().equals(""))
{
	out.print("<p>Please Enter First Name : </p>");
}
else
{
	try{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/frameworks", "root", "");
		PreparedStatement pst = conn.prepareStatement("select * from employee where fname like '"+name+"%'");		
		ResultSet rs = pst.executeQuery();
		if(rs.isBeforeFirst())
		{
			out.print("<table border='5' cellpadding='5' width='100%'>");
			out.print("<tr><th>ID</th><th>FName</th><th>LName</th><th>Email</th><th>Gender</th><th>Address</th><th>Mobile</th></tr>");
			while(rs.next())
			{
				out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td></tr>");
			}
			out.print("</table>");
		}
		
		else
		{
			out.println("<p>Data Not Available.</p>");
		}
		conn.close();
	}
	catch(Exception e)
	{
		out.print(e);
	}
}

%>