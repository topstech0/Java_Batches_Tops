package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;
import com.bo.StudentBo;

/**
 * Servlet implementation class StudController
 */
@WebServlet("/StudController")
public class StudController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
		StudentBo studentBo = (StudentBo)a.getBean("studentBo");
		
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("insert"))
		{
			Student s = new Student();
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			studentBo.insertStudent(s);
			response.sendRedirect("show.jsp");
		}
	}

}
