package mvc1.servlet.basic.requestuest;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*
1. 파라미터 전송 기능
  localhost:8080/request-param?username=hello&age=20
 */
@WebServlet(name="requestuestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        System.out.println(" =======전체파라미터 조회 Start========= ");
        request.getParameterNames().asIterator().forEachRemaining(paramName -> System.out.println(paramName +" = " + request.getParameter(paramName)));
        System.out.println(" =======전체파라미터 조회 End========= ");
        request.getParameterNames();
        System.out.println();
        System.out.println("단일 파라미터 조회");
        String name = request.getParameter("username");
        String age = request.getParameter("age");

        System.out.println("username : " + name + " age : " + age);

        String[] usernames = request.getParameterValues("username");
        for (String username : usernames) {
            System.out.println("username = " + username);
        }
        response.getWriter().write("okok");

    }
}

