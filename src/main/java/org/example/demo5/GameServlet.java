package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GameServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("GameServlet 초기화");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET----------------------");
        //받을 때 한글 처리 server.xml 설정에 따라감.
        //서버에서 데이터를 받자.
        String gameName = req.getParameter("gameName");
        String gameType = req.getParameter("gameType");

        //응답을 보내자. 한글로!!
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        System.out.println("<html><body>");
        System.out.println("<h1>게임서블릿이 받은 값들</h1>");
        System.out.println("<h2>" + gameName + "</h2>");
        System.out.println("<h2>" + gameType + "</h2>");
        System.out.println("</body></html>");
        out.close();
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("GameServlet 소멸됨.");
    }
}
