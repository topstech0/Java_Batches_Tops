package com.dao;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Employee;
import com.util.EmplUtil;

public class EmplDao {
	
	public static void insertEmployee(Employee e)
	{
		Session session = EmplUtil.createSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}

}
