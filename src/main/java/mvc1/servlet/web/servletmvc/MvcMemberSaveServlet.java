package mvc1.servlet.web.servletmvc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc1.servlet.domain.member.Member;
import mvc1.servlet.domain.member.MemberRepository;

import java.io.IOException;

@WebServlet(name="mvcMemberSaveServlet",urlPatterns = "/servlet-mvc/members/save")
public class MvcMemberSaveServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        Member.builder().name(req.getParameter("name")).age(Integer.parseInt(req.getParameter("age")));
        MemberRepository memberRepository = MemberRepository.getInstance();

        String name = req.getParameter("username");
        int age = Integer.parseInt(req.getParameter("age"));

        Member member = new Member(name,age);
        memberRepository.save(member);

        req.setAttribute("member", member);

        String viewPath = "/WEB-INF/views/save";
        RequestDispatcher dispatcher = req.getRequestDispatcher(viewPath);

        dispatcher.forward(req,resp);

    }
}
