package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        //return "home";
        return "page/intro";
    }

    @GetMapping("/moveMain")
    public String moveMain(){
        return "page/intro";
    }

    @GetMapping("/moveIntroduction")
    public String moveIntroduction(){
        //return "page/introduction";
        return "page/introduction";
    }

    @GetMapping("/moveConsulting")
    public String moveConsulting(){
        return "page/consulting01";
    }

    @GetMapping("/moveReview")
    public String moveReview(){
        return "page/review";
    }

    @GetMapping("/moveContact")
    public String moveContact(){
        return "page/contact";
    }

    @GetMapping("/moveLogin")
    public String moveLogin(){
        return "page/login";
    }

    @GetMapping("/moveJoin01")
    public String moveJoin(){
        return "page/join01";
    }
}
