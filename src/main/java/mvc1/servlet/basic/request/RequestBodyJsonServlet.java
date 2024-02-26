package mvc1.servlet.basic.request;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc1.servlet.basic.HelloData;
import org.apache.tomcat.util.buf.Utf8Encoder;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "requestBodyJsonServlet",urlPatterns = "/request-body-json")
public class RequestBodyJsonServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

        ServletInputStream inputStream = req.getInputStream();
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
        System.out.println("================================================================");

        System.out.println("inputStream = " + messageBody);
        HelloData helloData = objectMapper.readValue(messageBody, HelloData.class);


        System.out.println("HelloDataUserName = " + helloData.getName());
        System.out.println("helloDataUserAge = " + helloData.getAge());

        response.getWriter().write("DOOoooit");
    }
}
