package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class JoinController {
    @PostMapping("/join/acceptTerm")
    @ResponseBody
    public Map<String, Object> acceptTerm(Model model, @RequestParam Map<String, Object> paramMap){

        Map<String, Object> resultMap = new HashMap<String, Object>();

        // 이용약관 동의내역 처리

        return resultMap;
    }

    @PostMapping("/join/verifyPhoneNumber")
    @ResponseBody
    public Map<String, Object> verifyPhoneNumber(Model model, @RequestParam Map<String, Object> paramMap){

        Map<String, Object> resultMap = new HashMap<String, Object>();

        // 휴대전화 인증완료 처리

        return resultMap;
    }

    @PostMapping("/join/registerMemberInfo")
    @ResponseBody
    public Map<String, Object> registerMemberInfo(Model model, @RequestParam Map<String, Object> paramMap){

        Map<String, Object> resultMap = new HashMap<String, Object>();

        // 회원정보 등록 처리

        return resultMap;
    }

    @GetMapping("/moveJoin02")
    public String moveJoin02(){
        return "page/join02";
    }

    @GetMapping("/moveJoin03")
    public String moveJoin03(){
        return "page/join03";
    }

    @GetMapping("/moveJoin04")
    public String moveJoin04(){
        return "page/join04";
    }
}
