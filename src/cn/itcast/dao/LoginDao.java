package cn.itcast.dao;

import java.sql.*;

import cn.itcast.bean.User;
import cn.itcast.utils.JDBCUtils;

public class LoginDao {
	
	public boolean insert(User user) {
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "insert into user values('"+user.getUsername()+"','"+user.getPassword()+"')";
			int num = stmt.executeUpdate(sql);
			if(num>0) {
				return true;
			}return false;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}return false;
	}
	
	public boolean delete(String username) {
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "delete from user where username='"+username+"'";
			int num = stmt.executeUpdate(sql);
			if(num>0) {
				System.out.println("删除成功");
				return true;
			}return false;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}return false;
	}
	
	public boolean update(User user) {
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "update user set password='"+user.getPassword()+"' where username='"+user.getUsername()+"'" ;
			int num = stmt.executeUpdate(sql);
			if(num>0) {
				return true;
			}return false;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}return false;
	}
	
	public User findbyun(String username) {
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "select * from user where username='"+username+"'";
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				User user = new User();
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				return user;
			}return null;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}return null;
	}
	
	public String findun(String username) {
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "select username from user where username='"+username+"'";
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				String un = rs.getString("username");
				return un;
			}return null;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}return null;
	}
	
	public String findopsd(String username) {
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "select password from user where username='"+username+"'";
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				String opsd = rs.getString("password");
				return opsd;
			}return null;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}return null;
	}
}