package com.dao;



import com.bean.Student;

public class StudentDao extends org.springframework.orm.hibernate3.support.HibernateDaoSupport {
	
	public void insertStudent(Student s)
	{
		getHibernateTemplate().save(s);
	}

}
