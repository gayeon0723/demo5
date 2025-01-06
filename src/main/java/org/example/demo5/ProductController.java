package org.example.demo5;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductController {
    public void insert(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("제품 정보 생성 컨트롤 요청");
        req.setAttribute("result", "제품 정보 생성 성공함.");
        RequestDispatcher rd = req.getRequestDispatcher("views/product_result.jsp");
        rd.forward(req, res);
    }

    public void delete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("제품 정보 삭제 컨트롤 요청");
        req.setAttribute("result", "제품 정보 삭제 성공함.");
        RequestDispatcher rd = req.getRequestDispatcher("views/product_result.jsp");
        rd.forward(req, res);
    }
}
