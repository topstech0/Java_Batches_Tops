<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
	String name=request.getParameter("val");
	if(name==null||name.trim().equals(""))
	{
		out.print("<p>Please Enter Email</p>");
	}
	else
	{
		try{
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/frameworks", "root", "");
			PreparedStatement pst = conn.prepareStatement("select * from student where email=?");
			pst.setString(1, name);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				out.println("<p>Email-Id Already Registered.</p>");
			}
			else
			{
				out.println("<p>This Email-Id is Available for Registeration.</p>");
			}
			conn.close();
		}
		catch(Exception e)
		{
			out.print(e);
		}
	}

%>