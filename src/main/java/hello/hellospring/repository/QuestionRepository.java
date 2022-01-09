package hello.hellospring.repository;

import hello.hellospring.domain.Question;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class QuestionRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Question question){
        em.persist(question);
        return question.getId();
    }

}
