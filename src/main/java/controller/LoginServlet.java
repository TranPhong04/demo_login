package controller;

import dao.LoginDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Account;

import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/login.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String pass = req.getParameter("pass");
        Account account = LoginDao.login(username,pass);
       if(account!=null){
           if(account.getId_role()==1) {
               resp.sendRedirect("/user.jsp");
           }else
               resp.sendRedirect("/admin.jsp");
       }
       else
           resp.sendRedirect("/login.jsp");

//        String sql = "select* from accounts where username = 'phong' and pass = '12345678';
    }
}
