package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MemberMapper {
    int save(Member member);
    Member findById(Long id);
    Member findByName(String name);
    List<Member> findAll();
}
