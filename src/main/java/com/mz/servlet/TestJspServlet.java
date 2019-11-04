package com.mz.servlet;


import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;


public class TestJspServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        System.out.println("获取前台传入的 name ： "+ name+"\t密码 ---->"+pwd);
        PrintWriter writer = resp.getWriter();
        HttpSession session = req.getSession();
        session.setAttribute("wd",UUID.randomUUID());
        resp.sendRedirect("/index.jsp");
        System.out.println(req.getContextPath());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
