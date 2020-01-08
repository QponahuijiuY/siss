package cn.itcast.dao;

import java.sql.*;
import java.util.ArrayList;

import cn.itcast.utils.JDBCUtils;
import cn.itcast.bean.Test;
public class TestDao {
	
	public ArrayList<Test> listall(){
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		ArrayList<Test> list = new ArrayList<Test>();
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "select * from test order by testTime desc";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Test test = new Test();
				test.setId(rs.getString("id"));
				test.setTeacher(rs.getString("teacher"));
				test.setCourse(rs.getString("course"));
				test.setClassName(rs.getString("className"));
				test.setTestTime(rs.getString("testTime"));
				test.setPlace(rs.getString("place"));
				list.add(test);
			}return list;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}
		return null;
	}
	
	
	public Test findById(String id) {
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql="select * from test where id='"+id+"' order by testTime desc";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Test test = new Test();
				test.setId(rs.getString("id"));
				test.setTeacher(rs.getString("teacher"));
				test.setCourse(rs.getString("course"));
				test.setClassName(rs.getString("className"));
				test.setTestTime(rs.getString("testTime"));
				test.setPlace(rs.getString("place"));
				return test;
			}return null;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}return null;
	}
	
	
	public ArrayList<Test> findByCourse(String course) {
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		ArrayList<Test> list = new ArrayList<Test>();
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql="select * from test where course='"+course+"' order by testTime desc";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Test test = new Test();
				test.setId(rs.getString("id"));
				test.setTeacher(rs.getString("teacher"));
				test.setCourse(rs.getString("course"));
				test.setClassName(rs.getString("className"));
				test.setTestTime(rs.getString("testTime"));
				test.setPlace(rs.getString("place"));
				list.add(test);
			}return list;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}return null;
	}


	public boolean insert(Test test) {
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "insert into test values('"+test.getId()+"','"
					+test.getTeacher()+"','"+test.getCourse()+"','"
					+test.getClassName()+"','"+test.getTestTime()
					+"','"+test.getPlace()+"')";
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
	
	
	public boolean update(Test test) {
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "update test set id='"+test.getId()+"',teacher='"
					+test.getTeacher()+"',course='"+test.getCourse()+"',className='"
					+test.getClassName()+"',testTime='"+test.getTestTime()+"',place='"
					+test.getPlace()+"' where id='"+test.getId()+"'";
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
	
	
	public boolean delete(String id) {
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "delete from test where id='"+id+"'";
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
}