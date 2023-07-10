package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.dao.EmployeeDao;


public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
          
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		
		ApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeDao employeeDao = (EmployeeDao)a.getBean("employeeDao");
		
		if(action.equalsIgnoreCase("Insert"))
		{
			Employee e = new Employee();
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setEmail(request.getParameter("email"));
			employeeDao.insertEmp(e);
			response.sendRedirect("show.jsp");
		}
	}

}
