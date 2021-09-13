package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Category;
import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao{
    static Connection con;
    static PreparedStatement pselcat,pprodByCat;
    static {
    	con=DBUtil.getMyConnection();
    	try {
			pselcat=con.prepareStatement("select * from category");
			pprodByCat=con.prepareStatement("select * from producthsbc where cid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	@Override
	public List<Category> findCategory() {
		List<Category> clist=new ArrayList<>();
		try {
			ResultSet rs=pselcat.executeQuery();
			while(rs.next()) {
				Category c=new Category(rs.getInt(1),rs.getString(2),rs.getString(3));
				clist.add(c);
				
			}
			return clist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<Product> findProductsByCategory(int cid) {
		
		try {
			pprodByCat.setInt(1, cid);
			ResultSet rs=pprodByCat.executeQuery();
			List<Product> plist=new ArrayList<>();
			while(rs.next()) {
				plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getString(5),rs.getDate(6),rs.getInt(7)));
			}
			return plist;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
   
	   
}
