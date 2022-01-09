package hello.hellospring.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 문의테이블
 */
@Entity
@Getter @Setter
public class Question extends BaseEntity{

    @Id @GeneratedValue
    @Column(name = "question_id")
    private Long id;

    //제목, 내용
    @Embedded
    private Contents contents;

    //문의고객정보
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    //양방향 연관관계 매서드
    public void writeCustomer(Customer customer){
        this.customer = customer;
        customer.getQuestionList().add(this);
    }


}
