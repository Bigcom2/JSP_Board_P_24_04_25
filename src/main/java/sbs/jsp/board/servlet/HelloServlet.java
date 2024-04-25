package sbs.jsp.board.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); //들어오는 데이터
        resp.setCharacterEncoding("UTF-8"); //출력되는 데이터
        resp.setContentType("text/html; charset-ut-8"); //브라우저에게 결과물이 UTF-8이라는걸 알림
        
        resp.getWriter().append("HI!!!!!!!!!!!!!");
        resp.getWriter().append("안녕");
    }
}
