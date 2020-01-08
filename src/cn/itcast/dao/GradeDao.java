package cn.itcast.dao;

import java.sql.*;
import java.util.ArrayList;
import cn.itcast.bean.Grade;
import cn.itcast.utils.JDBCUtils;
public class GradeDao {
	
	public boolean insert(Grade grade) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "insert into grade(id,name,credit,num,teacher,status) "
					+ "values('"+grade.getId()+"','"+grade.getName()+"',"+grade.getCredit()+","
					+grade.getNum()+",'"+grade.getTeacher()+"','"+grade.getStatus()+"')";
			int num = stmt.executeUpdate(sql);
			System.out.println("ds");
			if(num>0) {
				return true;
			}return false;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}return false;
	}
	
	public boolean updatestatus(String id) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "update grade set status='已完成'  where id='"+id+"'";
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
	
	public ArrayList<Grade> findall(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Grade> list = new ArrayList<Grade>();
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "select * from grade";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Grade p = new Grade();
				p.setId(rs.getString("id"));
				p.setName(rs.getString("name"));
				p.setCredit(rs.getDouble("credit"));
				p.setNum(rs.getInt("num"));
				p.setTeacher(rs.getString("teacher"));
				p.setStatus(rs.getString("status"));
				list.add(p);
			}return list;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}return null;
	}
	
	public ArrayList<Grade> find(String name,double credit,int num,String teacher,String status) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Grade> list = new ArrayList<Grade>();
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "select * from grade where name='"+name+"' and credit="
					+credit+" and num="+num+" and teacher='"+teacher+" and status='"+status+"'";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Grade p = new Grade();
				p.setId(rs.getString("id"));
				p.setName(rs.getString("name"));
				p.setCredit(rs.getDouble("credit"));
				p.setNum(rs.getInt("num"));
				p.setTeacher(rs.getString("teacher"));
				p.setStatus(rs.getString("status"));
				list.add(p);
			}return list;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}return null;
	}
}