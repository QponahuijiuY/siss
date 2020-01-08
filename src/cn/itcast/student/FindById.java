package cn.itcast.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.itcast.dao.StudentDao;
import cn.itcast.bean.Student;
@WebServlet("/FindById")
public class FindById extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		StudentDao sd = new StudentDao();
		String id = request.getParameter("id");
		try {
			Student student = sd.findById(id);
			request.setAttribute("student",student);
			request.getRequestDispatcher("sm1.jsp").forward(request, response);
			return ;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
