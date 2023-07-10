package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.bean.Employee;

public class EmployeeDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public void insertEmp(Employee e)
	{
		this.hibernateTemplate.saveOrUpdate(e);
	}
	
	@Transactional
	public List<Employee> getAllEmployee()
	{
		return this.hibernateTemplate.loadAll(Employee.class);
	}
	
}
