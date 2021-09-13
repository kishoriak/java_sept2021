package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.User;

public class LoginDaoImpl implements LoginDao{
	static Connection con;
	static PreparedStatement pselect;
	static {
		con=DBUtil.getMyConnection();
		try {
			pselect=con.prepareStatement("select * from user where uname=? and pass=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public User checkCredentials(String uname, String pass) {
		try {
			pselect.setString(1, uname);pselect.setString(2, pass);
			ResultSet rs=pselect.executeQuery();
			if(rs.next()) {
				if((rs.getString(1).equals(uname)) && (rs.getString(2).equals(pass))){
					return new User(rs.getString(1),rs.getString(2),rs.getString(3));
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
