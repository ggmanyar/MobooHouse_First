package hello.hellospring.repository;

import hello.hellospring.domain.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CustomerRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Customer customer){
        em.persist(customer);
        return customer.getId();
    }

    public Customer find(Long id){
        return em.find(Customer.class,id);
    }

}
