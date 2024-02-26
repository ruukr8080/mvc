package mvc1.servlet.basic.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc1.servlet.basic.HelloData;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "responseJsonServlet", urlPatterns = "/response-json")
public class ResponseJsonServlet extends HttpServlet {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        //content-type
        res.setContentType("application/json");
        res.setCharacterEncoding("utf-8");

        //body
        HelloData helloData = new HelloData();
        helloData.setName("han");
        helloData.setAge(20);
        String result = mapper.writeValueAsString(helloData);


        res.getOutputStream().println(result);
//        res.getWriter().write(result);


    }
}
