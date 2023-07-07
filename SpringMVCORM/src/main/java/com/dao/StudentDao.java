package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.bean.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public void insertStudent(Student s)
	{
		getHibernateTemplate().saveOrUpdate(s);
	}
	
	@Transactional
	public List<Student> getAllStudent()
	{
		return hibernateTemplate.loadAll(Student.class);
	}
	

}
