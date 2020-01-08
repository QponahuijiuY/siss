package cn.itcast.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.itcast.bean.Test;
import cn.itcast.dao.TestDao;
@WebServlet("/AddTest")
public class AddTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		Test test = new Test();
		TestDao sd = new TestDao();
		test.setId(request.getParameter("id"));test.setTeacher(request.getParameter("teacher"));
		test.setCourse(request.getParameter("course"));test.setClassName(request.getParameter("className"));
		test.setTestTime(request.getParameter("testTime"));test.setPlace(request.getParameter("place"));
		try {
			sd.insert(test);
			response.sendRedirect("ListTest");
		}catch(Exception e) {
			e.printStackTrace();
			response.getWriter().print("增加失败!");
			return ;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
