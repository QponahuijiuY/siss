package cn.itcast.dao;

import java.sql.*;
import java.util.ArrayList;

import cn.itcast.utils.JDBCUtils;
import cn.itcast.bean.Student;
public class StudentDao {
	
	public ArrayList<Student> listall(){
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		ArrayList<Student> list = new ArrayList<Student>();
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "select * from student";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Student student = new Student();
				student.setId(rs.getString("id"));
				student.setName(rs.getString("name"));
				student.setGrade(rs.getString("grade"));
				student.setDepartment(rs.getString("department"));
				student.setCla(rs.getString("cla"));
				list.add(student);
			}return list;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}
		return null;
	}
	
	
	public Student findById(String id) {
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql="select * from student where id='"+id+"'";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Student student = new Student();
				student.setId(rs.getString("id"));
				student.setName(rs.getString("name"));
				student.setGrade(rs.getString("grade"));
				student.setDepartment(rs.getString("department"));
				student.setCla(rs.getString("cla"));
				return student;
			}return null;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}return null;
	}
	
	
	public ArrayList<Student> findByName(String name) {
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		ArrayList<Student> list = new ArrayList<Student>();
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql="select * from student where name='"+name+"'";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Student student = new Student();
				student.setId(rs.getString("id"));
				student.setName(rs.getString("name"));
				student.setGrade(rs.getString("grade"));
				student.setDepartment(rs.getString("department"));
				student.setCla(rs.getString("cla"));
				list.add(student);
			}return list;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}return null;
	}


	public boolean insert(Student student) {
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "insert into student values('"+student.getId()+"','"
					+student.getName()+"','"+student.getGrade()+"','"
					+student.getDepartment()+"','"+student.getCla()+"')";
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
	
	
	public boolean update(Student student) {
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "update student set id='"+student.getId()+"',name='"
					+student.getName()+"',grade='"+student.getGrade()+"',department='"
					+student.getDepartment()+"',cla='"+student.getCla()
					+"' where id='"+student.getId()+"'";
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
	
	
	public boolean delete(Student student) {
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "delete from student where id='"+student.getId()+"'";
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