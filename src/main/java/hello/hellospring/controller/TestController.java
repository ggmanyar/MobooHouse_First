package hello.hellospring.controller;

import hello.hellospring.domain.TestDTO;
import hello.hellospring.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Object test() {
        return "Hello World!";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<TestDTO> getUser() {
        return testService.getUserList();
    }

    @RequestMapping(value = "/userdata", method = RequestMethod.POST)
    public List<TestDTO> getUserData() {
        return testService.getUserData();
    }
}
