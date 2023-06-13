package com.bo;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentBo {

	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void insertStudent(Student s)
	{
		this.studentDao.insertStudent(s);
	}
	
	
}
