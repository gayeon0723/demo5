package org.example.demo5;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "numberController", value = "/number")
public class NumberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet--------------");
        String n1 = req.getParameter("n1"); //input name이 n1
        String n2 = req.getParameter("n2"); //input name이 n2

        //Integer.parseInt(); 정수변환
        //Double.parseDouble(); 실수변환
        int i1 = Integer.parseInt(n1);
        int i2 = Integer.parseInt(n2);
        int result = i1 + i2;

        //응답
        resp.getWriter().println("sum result >> " + result);
    }
}
