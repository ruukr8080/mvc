package mvc1.servlet.web.frontcontroller.v3.controller;

import mvc1.servlet.web.frontcontroller.ModelView;
import mvc1.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {

    @Override

    public ModelView process(Map<String, String> paremMap) {

        return new ModelView("new-form");
    }
}
