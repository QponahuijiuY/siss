package cn.itcast.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.bean.User;
import cn.itcast.dao.LoginDao;
@WebServlet("/AlterServlet")
public class AlterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String oldpsd = request.getParameter("oldpsd");
		String newpsd = request.getParameter("newpsd");
		LoginDao ld = new LoginDao();
		String opsd = ld.findopsd(username);
		User user = new User();
		user.setUsername(username);user.setPassword(newpsd);
		if(opsd.equals(oldpsd)) {
			ld.update(user);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else if(oldpsd==""||newpsd=="") {
			response.getWriter().println("密码不能为空");
			response.setHeader("Refresh","1;url=useralter.jsp");
		}else {
			response.getWriter().println("修改成功");
			response.setHeader("Refresh","1;url=useralter.jsp");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
