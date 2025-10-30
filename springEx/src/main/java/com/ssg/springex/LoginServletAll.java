package com.ssg.springex;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login1")
public class LoginServletAll extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("LoginServlet init");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("LoginServlet doPost() 메소드 호출");
        doHandle(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet 메소드 호출");
        doHandle(requset, response);
    }


    private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doHandle 메소드 호출");
        request.setCharacterEncoding("UTF-8");

        String username = request.getParameter("user_id");
        System.out.println("doHandle 메소드 호출");
        String password = request.getParameter("user_pwd");
        System.out.println(username);
        System.out.println(password);


    }
}