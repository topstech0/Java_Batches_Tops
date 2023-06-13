package com.dao;



import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.Student;

public class StudentDao extends HibernateDaoSupport {
	
	public void insertStudent(Student s)
	{
		getHibernateTemplate().save(s);
	}

}
