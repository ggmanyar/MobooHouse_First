package hello.hellospring.domain;

import hello.hellospring.domain.reserve.ConsultingReserve;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 *고객정보 (예약자) , 핸드폰번호 인증으로 인증된 고객
 **/
@Entity
@Getter @Setter
public class Customer extends BaseEntity{

    @Id @GeneratedValue
    @Column(name = "customer_id")
    private Long id;

    //이름
    @Column(length = 10)
    private String name;

    //인증된 핸드폰 번호
    @Column(length=11)
    private String phoneNo;

    //이메일
    private String email;
    
    //상담예약목록
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<ConsultingReserve> consultingReserveList =new ArrayList<>();

    //문의목록
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Question> questionList = new ArrayList<>();

}
