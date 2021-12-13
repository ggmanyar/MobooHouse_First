package hello.hellospring.repository;

import hello.hellospring.domain.Customer;
import hello.hellospring.repository.CustomerRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    public void testCustomer() throws Exception{
        //given
        Customer customer = new Customer();
        customer.setUsername("김웅태");

        //when
        Long saveId = customerRepository.save(customer);
        Customer findCustomer = customerRepository.find(saveId);
        //then
        Assertions.assertThat(findCustomer.getId()).isEqualTo(saveId);
        Assertions.assertThat(findCustomer.getUsername()).isEqualTo(customer.getUsername());


    }

}