package cn.itcast.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.bean.User;
import cn.itcast.dao.LoginDao;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String psd1 = request.getParameter("psd1");
		String psd2 = request.getParameter("psd2");
		User user = new User();
		LoginDao ld = new LoginDao();
		String un = ld.findun(username);
		if(username==""||psd1==""||psd2=="") {
			response.getWriter().println("输入不能为空");
			response.setHeader("Refresh","2;url=register.jsp");
		}else if(un!=null&&un.equals(username)) {
			response.getWriter().println("用户已存在");
			response.setHeader("Refresh","2;url=register.jsp");
		}else if(psd1.equals(psd2)&&psd1!="") {
			user.setUsername(username);
			user.setPassword(psd1);
			ld.insert(user);
			response.getWriter().println("注册成功");
			response.setHeader("Refresh","2;url=login.jsp");
		}else {
			response.getWriter().println("密码不一致");
			response.setHeader("Refresh","2;url=register.jsp");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}