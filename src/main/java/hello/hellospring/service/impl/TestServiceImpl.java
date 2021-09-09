package hello.hellospring.service.impl;

import hello.hellospring.domain.TestDTO;
import hello.hellospring.repository.TestMapper;
import hello.hellospring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private final TestMapper testMapper;

    @Autowired
    public TestServiceImpl(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @Override
    public List<TestDTO> getUserList() {
        return testMapper.getUserList();
    }

    @Override
    public List<TestDTO> getUserData() {
        return testMapper.getUserData();
    }
}
