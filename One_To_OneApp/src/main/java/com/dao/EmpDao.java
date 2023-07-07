package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Emp;
import com.bean.EmpInfo;
import com.util.EmpUtil;

public class EmpDao {
	
	public static void insertEmpInfo(EmpInfo e)
	{
		Session session = EmpUtil.createSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	
	public static void insertEmp(Emp e)
	{
		Session session = EmpUtil.createSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	
	public static List<Emp> getAllEmp()
	{
		Session session = EmpUtil.createSession();
		List<Emp> list = session.createQuery("from Emp").list();
		session.close();
		return list;
	}
	

}
