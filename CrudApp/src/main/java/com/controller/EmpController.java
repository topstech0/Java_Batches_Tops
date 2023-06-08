package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Employee;
import com.dao.EmpDao;


@WebServlet("/EmpController")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		System.out.println(action);
		
		if(action.equalsIgnoreCase("submit")) {
		/*	System.out.println(request.getParameter("fname"));
			System.out.println(request.getParameter("lname"));
			System.out.println(request.getParameter("email"));
			System.out.println(request.getParameter("mobile"));
			System.out.println(request.getParameter("dob"));
			System.out.println(request.getParameter("gender"));
			System.out.println(request.getParameter("address"));
		*/
			
			Employee e = new Employee();
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setEmail(request.getParameter("email"));
			e.setMobile(Long.parseLong(request.getParameter("mobile")));
			e.setDob(request.getParameter("dob"));
			e.setGender(request.getParameter("gender"));
			e.setAddress(request.getParameter("address"));
			EmpDao.insertEmp(e);
			response.sendRedirect("show.jsp");
		
		}
		
		else if(action.equalsIgnoreCase("edit"))
		{
			int id = Integer.parseInt(request.getParameter("id"));
			Employee e = EmpDao.getEmployeeById(id);
			request.setAttribute("e", e);
			request.getRequestDispatcher("update.jsp").forward(request, response);			
		}
		
		
		
	}

}
