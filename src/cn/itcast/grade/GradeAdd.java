package cn.itcast.grade;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.itcast.bean.Grade;
import cn.itcast.dao.GradeDao;
@WebServlet("/GradeAdd")
public class GradeAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		double credit = Double.parseDouble(request.getParameter("credit"));
		int num = Integer.parseInt(request.getParameter("num"));
		String teacher = request.getParameter("teacher");
		String status = request.getParameter("status");
		Grade p = new Grade();
		p.setId(id);
		p.setName(name);p.setCredit(credit);p.setNum(num);p.setTeacher(teacher);
		p.setStatus(status);
		GradeDao pd = new GradeDao();
		try {
			pd.insert(p);
			response.sendRedirect("ListGrade");
		}catch(Exception e) {
			e.printStackTrace();
			response.getWriter().write("增加出错");
			return ;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}