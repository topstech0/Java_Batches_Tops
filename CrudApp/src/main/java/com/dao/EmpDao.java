package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;
import com.util.EmpUtil;

public class EmpDao {

	public static void insertEmp(Employee e)
	{
		try {
			Connection conn = EmpUtil.createConnection();
			String sql = "insert into emp (fname,lname,email,mobile,dob,gender,address) values (?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, e.getFname());
			pst.setString(2, e.getLname());
			pst.setString(3, e.getEmail());
			pst.setLong(4, e.getMobile());
			pst.setString(5, e.getDob());
			pst.setString(6, e.getGender());
			pst.setString(7, e.getAddress());
			pst.executeUpdate();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	public static List<Employee> getAllEmployee()
	{
		List<Employee> list = new ArrayList<Employee>();
		
		try {
			Connection conn = EmpUtil.createConnection();
			String sql = "select * from emp";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
				e.setLname(rs.getString("lname"));
				e.setEmail(rs.getString("email"));
				e.setMobile(rs.getLong("mobile"));
				e.setDob(rs.getString("dob"));
				e.setGender(rs.getString("gender"));
				e.setAddress(rs.getString("address"));
				list.add(e);				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static Employee getEmployeeById(int id)
	{
		Employee e = null;
		
		try {
			Connection conn = EmpUtil.createConnection();
			String sql = "select * from emp where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				e = new Employee();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
				e.setLname(rs.getString("lname"));
				e.setEmail(rs.getString("email"));
				e.setMobile(rs.getLong("mobile"));
				e.setDob(rs.getString("dob"));
				e.setGender(rs.getString("gender"));
				e.setAddress(rs.getString("address"));
			}
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return e;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
