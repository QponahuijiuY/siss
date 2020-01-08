package cn.itcast.servlet;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.itcast.bean.User;
import cn.itcast.utils.JDBCUtils;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "select * from user where username='"+username+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				User user = new User();
				user.setUsername(username);
				user.setPassword(password);
				request.getSession().setAttribute("user",user);
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			}else {
				response.getWriter().println("鐢ㄦ埛涓嶅瓨鍦�");
				response.setHeader("Refresh","2;url=login.jsp");
			}
			rs.close();
		    stmt.close();
		    conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
