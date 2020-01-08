package cn.itcast.guestBook;

import cn.itcast.bean.Guestbook;
import cn.itcast.dao.GuestbookDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/7 20:07
 */
@WebServlet("/ListGuestbook")
public class ListGuestbook extends HttpServlet {
        private static final long serialVersionUID = 1L;
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request,response);
        }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html;charset=utf-8");
            request.setCharacterEncoding("UTF-8");

            GuestbookDao gd = new GuestbookDao();
            ArrayList<Guestbook> list = gd.findalltext();

            request.setAttribute("list", list);
            request.getRequestDispatcher("text.jsp").forward(request,response);
        }
    }
