package mvc1.servlet.web.frontcontroller.v3.controller;

import mvc1.servlet.domain.member.Member;
import mvc1.servlet.domain.member.MemberRepository;
import mvc1.servlet.web.frontcontroller.ModelView;
import mvc1.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;
public class MemberSaveControllerV3 implements ControllerV3 {
    private final MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public ModelView process(Map<String, String> paramMap) {
        String name = paramMap.get("name");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(name, age);
        memberRepository.save(member);


        ModelView mv = new ModelView("save-result");
        mv.getModel().put("member", member);
        return mv;
    }
}
