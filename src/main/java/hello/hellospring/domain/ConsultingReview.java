package hello.hellospring.domain;

import hello.hellospring.domain.reserve.ConsultingReserve;
import lombok.Getter;

import javax.persistence.*;

/**
 *상담후기테이블
 *
 **/
@Entity
@Table(name = "consulting_review")
@Getter
public class ConsultingReview extends BaseEntity{

    @Id @GeneratedValue
    @Column(name = "consulting_review_id")
    private Long id;

    //제목, 내용
    @Embedded
    private Contents contents;
}
