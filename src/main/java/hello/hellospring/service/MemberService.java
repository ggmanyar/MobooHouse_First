package hello.hellospring.service;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface MemberService {
    public Map<String, Object> join(Member member);
    public boolean validateDuplicateMember(Member member);
    public List<Member> findMembers();
    public Member findOne(Long memberId);
}
