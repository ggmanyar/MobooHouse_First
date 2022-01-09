package hello.hellospring.service;

import hello.hellospring.domain.Customer;
import hello.hellospring.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CustomerService {

    private final CustomerRepository customerRepository;

    /**
     * 고객가입
     * @param customer
     * @return
     */
    @Transactional
    public Long join(Customer customer){
        customer.cleanPhoneNo();
        validateDuplicateCustomerUpdate(customer);
        return customer.getId();
    }

    /**
     * 핸드폰번호기준 중복일경우 Update 아닐경우 Insert
     * @param customer
     */
    private void validateDuplicateCustomerUpdate(Customer customer) {
        
        String phoneNo = customer.getPhoneNo();

        //phoneNo가 빈값이거나 null이거나 길이가11이 아닐경우 에러
        if(!StringUtils.hasLength(phoneNo) || phoneNo.length() != 11 ){
            throw new IllegalStateException("폰번호 값 오류 입니다.");
        }

        List<Customer> byPhoneNo = customerRepository.findByPhoneNo(phoneNo);

        if(byPhoneNo.size()>0){
            Customer tempCustomer = byPhoneNo.stream().findFirst().orElseGet(Customer::new);
            tempCustomer.updateCustomer(customer);
        }else{
            customerRepository.save(customer);
        }

    }

    /**
     * 고객전체조회
     * @return
     */
    public List<Customer> findCustomers(){
        return customerRepository.findAll();
    }

    /**
     * 고객아이디로 조회
     * @param customerId
     * @return
     */
    public Customer findOne(Long customerId){
        return customerRepository.findOne(customerId);
    }

    /**
     * 고객 전화번호로 조회
     * @param customerPhoneNo
     * @return
     */
    public List<Customer> findByPhoneNo(String customerPhoneNo){
        return customerRepository.findByPhoneNo(customerPhoneNo);
    }
    

}
