package cn.itcast.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtils {
	public static Connection getConnection() throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/siss";
		String user = "root";
		String password = "";
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	public static void release(Statement stmt,Connection conn) {
		if(stmt != null) {
			try {
				stmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}stmt=null;
		}
		if(conn != null) {
			try {
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}conn = null;
		}
	}
	public static void release(ResultSet rs,Statement stmt,Connection conn) {
		if(rs != null) {
			try {
				rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}rs=null;
		}
		release(stmt,conn);
	}
}