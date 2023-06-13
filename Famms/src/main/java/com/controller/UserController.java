package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.User;
import com.dao.ContactDao;
import com.dao.UserDao;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action= request.getParameter("action");
		
		if(action.equalsIgnoreCase("sign up"))
		{
			boolean flag = UserDao.checkEmail(request.getParameter("email"));
			if(flag==true)
			{
				request.setAttribute("msg", "Email-Id already Registered.");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
			else if(request.getParameter("password").equals(request.getParameter("cpassword")))
			{
				User u = new User();
				u.setFname(request.getParameter("fname"));
				u.setLname(request.getParameter("lname"));
				u.setEmail(request.getParameter("email"));
				u.setMobile(Long.parseLong(request.getParameter("mobile")));
				u.setPassword(request.getParameter("password"));
				u.setCpassword(request.getParameter("cpassword"));
				u.setGender(request.getParameter("gender"));
				u.setAddress(request.getParameter("address"));
				UserDao.createUser(u);
				request.setAttribute("msg", "User Sign up successfully.");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "Password and Confirm password doesn't match.");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
			
			
		}
		
	}

}
