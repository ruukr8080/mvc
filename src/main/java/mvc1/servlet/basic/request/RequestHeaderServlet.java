package mvc1.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "requestHeaderServlet", urlPatterns = "/request-header")
public class RequestHeaderServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        printStartLine(req);
    }

    private void printStartLine(HttpServletRequest req) {

        System.out.println("====리퀘스트 라인====");

        System.out.println(" req.getmethod " +req.getMethod());
        System.out.println(req.getProtocol());
        System.out.println(req.getScheme());
        System.out.println(req.getRequestURL());
        System.out.println(req.getRequestURI());
        System.out.println(req.getQueryString());
        System.out.println(req.isSecure());

        System.out.println("====리퀘스트 끝");
    }

    private void printHeader(HttpServletRequest req) {
        System.out.println("==== 헤더 - 시작 ====");

//        Enumeration<String> headerNames = req.getHeaderNames();
//        while (headerNames.hasMoreElements()) {
//            String headerName = headerNames.nextElement();
//            System.out.println(headerName + "  ==  " +headerName);
//        System.out.println("====헤더 - 끝 ====");
//        System.out.println();
        req.getHeaderNames().asIterator().forEachRemaining(headerName -> System.out.println(headerName + "  ==  " +headerName));

        }

    }

