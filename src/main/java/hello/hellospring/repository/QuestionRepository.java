package hello.hellospring.repository;

import hello.hellospring.domain.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@RequiredArgsConstructor
public class QuestionRepository {

    private final EntityManager em;

    public Long save(Question question){
        em.persist(question);
        return question.getId();
    }

}
