package hello.hellospring.domain.reserve;

import hello.hellospring.domain.BaseEntity;
import hello.hellospring.domain.Counselor;
import hello.hellospring.domain.Customer;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 *상담예약테이블
 **/
@Entity
@Getter
@Table(name = "consulting_reserve")
public class ConsultingReserve extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "consulting_reserve_id")
    private Long id;

    //상담유형
    @Enumerated(EnumType.STRING)
    private ConsultingType consultingType;

    //상담유형디테일
    @Enumerated(EnumType.STRING)
    private ConsultingDetailType consultingDetailType;

    //상담제공시간
    private int consultingProvideTime;

    //상담비용
    private int consultingPay;

    //상담예약날짜및시간
    private LocalDateTime consultingReserveTime;

    //예약자 고객정보
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    //상담자(대표 김정태) 정보
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "counselor_id")
    private Counselor counselor;

    //상담내용
    private String consultingContent;

    //상담진행상황
    private ConsultingProgress consultingProgress;

}
