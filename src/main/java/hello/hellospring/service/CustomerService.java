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
     * 회원가입
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

}
