package cn.itcast.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.itcast.bean.Student;
import cn.itcast.dao.StudentDao;
@WebServlet("/AddStudent")
public class AddStduent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		Student student = new Student();
		StudentDao sd = new StudentDao();
		student.setId(request.getParameter("id"));student.setName(request.getParameter("name"));
		student.setGrade(request.getParameter("grade"));student.setDepartment(request.getParameter("department"));
		student.setCla(request.getParameter("cla"));
		try {
			sd.insert(student);
			response.sendRedirect("ListStudents");
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
