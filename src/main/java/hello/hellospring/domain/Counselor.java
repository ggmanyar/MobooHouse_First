package hello.hellospring.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *상담자 정보(대표 김정태)
 **/
@Entity
@Getter
public class Counselor extends BaseEntity{

    @Id @GeneratedValue
    @Column(name = "counselor_id")
    private Long id;

    //이름
    @Column(length = 10)
    private String name;
    
    //사무소 주소
    private String address;

}
