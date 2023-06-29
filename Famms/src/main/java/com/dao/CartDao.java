package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Cart;
import com.bean.Wishlist;
import com.util.FammsUtil;

public class CartDao {
	
	public static void addToCart(Cart c)
	{
		try {
			
			Connection conn = FammsUtil.createConnection();
			String sql = "insert into cart (pid,uid,c_price,c_qty,total_price) values (?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getPid());
			pst.setInt(2, c.getUid());
			pst.setInt(3, c.getC_price());
			pst.setInt(4, c.getC_qty());
			pst.setInt(5, c.getTotal_price());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<Cart> getCartByUser(int uid)
	{
		List<Cart> list = new ArrayList<Cart>();
				
		try {
			Connection conn = FammsUtil.createConnection();
			String sql = "select * from cart where uid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs = pst.executeQuery();			
			while(rs.next())
			{
				Cart c = new Cart();
				c.setCid(rs.getInt("cid"));
				c.setPid(rs.getInt("pid"));
				c.setUid(rs.getInt("uid"));
				c.setC_price(rs.getInt("c_price"));
				c.setC_qty(rs.getInt("c_qty"));
				c.setTotal_price(rs.getInt("total_price"));
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static boolean checkCart(int uid,int pid)
	{
		boolean flag = false;
		try {
			Connection conn = FammsUtil.createConnection();
			String sql = "select * from cart where uid=? and pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2, pid);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public static void removeFromCart(Cart c)
	{
		try {
			Connection conn = FammsUtil.createConnection();
			String sql = "delete from cart where pid=? and uid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getPid());
			pst.setInt(2, c.getUid());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
