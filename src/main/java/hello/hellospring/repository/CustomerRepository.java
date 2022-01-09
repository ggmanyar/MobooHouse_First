package hello.hellospring.repository;

import hello.hellospring.domain.Customer;
import hello.hellospring.domain.reserve.ConsultingReserve;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CustomerRepository {

    private final EntityManager em;

    public Long save(Customer customer){
        em.persist(customer);
        return customer.getId();
    }

    public void remove(Customer customer){
        em.remove(customer);
    }

    public Customer findOne(Long id){
        return em.find(Customer.class,id);
    }

    public List<Customer> findAll(){
        return em.createQuery("select c from Customer c",Customer.class)
                .getResultList();
    }

    public List<Customer> findByPhoneNo(String phoneNo){
        return em.createQuery("select c from Customer c where c.phoneNo = :phoneNo",Customer.class)
                .setParameter("phoneNo",phoneNo)
                .getResultList();
    }

    public List<Customer> findConsultingReserveList(){
        return em.createQuery("select c from Customer c inner join fetch c.consultingReserveList",Customer.class )
                .getResultList();
    }

    public List<Customer> findQuestionList(){
        return em.createQuery("select c from Customer c inner join fetch c.questionList",Customer.class )
                .getResultList();
    }

}
