package mvc1.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "responseHtmlServlet",urlPatterns = "/response-html")
public class ResponseHtmlServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {


        //contentType : text/html; charset=urf-8
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");


        PrintWriter writer = res.getWriter();


        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>ㅎㅇㅎㅇ</h1>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
