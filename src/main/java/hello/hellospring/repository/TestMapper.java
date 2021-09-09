package hello.hellospring.repository;

import hello.hellospring.domain.TestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {

    List<TestDTO> getUserList();

    List<TestDTO> getUserData();
}
