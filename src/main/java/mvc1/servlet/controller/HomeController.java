package mvc1.servlet.controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc1.servlet.domain.member.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

//    @GetMapping("/jsp/**")
//    public String test(HttpServletRequest request, Model model) {
//        Member.builder().age(1).name("a").id(1L).build();
//
//        List<Member> members = new ArrayList<>();
//        members.add(new Member("one",1));
//        members.add(new Member("two",2));
//        members.add(new Member("three",3));
//        members.add(new Member("four",4));
//        model.addAttribute("members", members);
//        Member member = new Member();
//        model.addAttribute("title", "ttttt");
//        model.addAttribute("id", member.getId());
//        model.addAttribute("name", member.getName());
//        model.addAttribute("name", "tetetete");
//        model.addAttribute("age", member.getAge());
//        System.out.println(member.getName());
//        return request.getServletPath();
//
//    }
    @GetMapping("/new-form")
    public String NewForm(HttpServletRequest request, HttpServletResponse response) {

        return "new-form";
    }
}
