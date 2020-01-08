package cn.itcast.guestBook;

import cn.itcast.bean.Guestbook;
import cn.itcast.dao.GuestbookDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/7 20:09
 */
@WebServlet("/GuestbookAdd")
public class GuestbookAdd extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");


        Guestbook gb = new Guestbook();
        GuestbookDao gd = new GuestbookDao();

        String name = request.getParameter("name");
        String tel = request.getParameter("tel");
        String text = request.getParameter("text");
        gb.setName(name);
        gb.setTel(tel);
        gb.setText(text);
        try {
            gd.insert(gb);
            response.sendRedirect("ListGuestbook");
        }catch (Exception e){
            e.printStackTrace();
            response.getWriter().print("添加失败");
            return;
        }


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }

}