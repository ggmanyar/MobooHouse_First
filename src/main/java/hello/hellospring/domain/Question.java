package hello.hellospring.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
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

}
