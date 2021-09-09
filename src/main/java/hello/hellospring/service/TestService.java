package hello.hellospring.service;

import hello.hellospring.domain.TestDTO;

import java.util.List;

public interface TestService {

    public List<TestDTO> getUserList();

    public List<TestDTO> getUserData();
}
