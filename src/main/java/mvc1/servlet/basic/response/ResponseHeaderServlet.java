package mvc1.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "responseHeaderServlet",urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //[status line]
        res.setStatus(HttpServletResponse.SC_OK);

        //[response header]
        res.setHeader("Content-Type", "text/plain;charset=utf-8");
        res.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
        res.setHeader("Pragma", "no-store");
        res.setHeader("my_header", "hello");



        //[message body]
        PrintWriter writer = res.getWriter();
        writer.println("this is response하이요");
    }
}
