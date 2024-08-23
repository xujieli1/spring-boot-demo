package com.boot.springbootdemo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : jieli.xu
 * @date : 2022/6/19
 */
@WebServlet(urlPatterns = "/test/servlet")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("test servlet request ");
        resp.getWriter().write("这是测试testServlet>>>>>>> /test/servlet");
    }

    @Override
    public void init() throws ServletException {
        System.out.println(">>>>>>>testServlet init");
    }
}
