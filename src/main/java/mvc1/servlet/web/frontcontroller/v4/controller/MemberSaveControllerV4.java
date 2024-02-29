package mvc1.servlet.web.frontcontroller.v4.controller;

import mvc1.servlet.domain.member.Member;
import mvc1.servlet.domain.member.MemberRepository;
import mvc1.servlet.web.frontcontroller.v4.ControllerV4;

import java.util.Map;

public class MemberSaveControllerV4 implements ControllerV4 {
    private MemberRepository memberRepository = MemberRepository.getInstance();


    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {

        String name = paramMap.get("name");
        int age = Integer.parseInt(paramMap.get(("age")));

        Member member = new Member(name, age);
        memberRepository.save(member);

        model.put("member", member);
        return "save-result";
    }
}
