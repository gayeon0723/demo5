package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CityServlet2 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("CityServlet2 initialized");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cityName = req.getParameter("cityName");
        String cityPopulation = req.getParameter("cityPopulation");

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter()
                .append("<h1>GET request received</h1>")
                .append("<p>City Name: ").append(cityName).append("</p>")
                .append("<p>City Population: ").append(cityPopulation).append("</p>");

        System.out.println("doGet method called");
        System.out.println("City Name: " + cityName);
        System.out.println("City Population: " + cityPopulation);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cityName = req.getParameter("cityName");
        String cityPopulation = req.getParameter("cityPopulation");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter()
                .append("<h1>POST request received</h1>")
                .append("<p>City Name: ").append(cityName).append("</p>")
                .append("<p>City Population: ").append(cityPopulation).append("</p>");

        System.out.println("doPost method called");
        System.out.println("City Name: " + cityName);
        System.out.println("City Population: " + cityPopulation);

    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("CityServlet2 destroyed");
    }
}
