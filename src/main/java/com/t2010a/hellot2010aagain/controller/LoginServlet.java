package com.t2010a.hellot2010aagain.controller;

import com.t2010a.hellot2010aagain.entity.Account;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/admin/login.jsp").forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        account.setEmail("duc@gmail.com");
        account.setPhone("myphone");
        HttpSession session = req.getSession();
        session.setAttribute("account", account);
        resp.sendRedirect("/admin/information");
    }
}
