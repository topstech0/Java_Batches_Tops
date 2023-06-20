package com.dao;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.bean.Student;

public class StudentDao extends HibernateDaoSupport {

	public void insertStudent(Student s)
	{
		this.getHibernateTemplate().setCheckWriteOperations(true);
		getHibernateTemplate().save(s);
	}
}
