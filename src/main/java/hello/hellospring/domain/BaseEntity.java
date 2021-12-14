package hello.hellospring.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    //생성일시
    @CreatedDate
    @Column(name = "created_date",updatable = false)
    private LocalDateTime createdDate;

    //수정일시
    @LastModifiedDate
    @Column(name="last_modified_date")
    private LocalDateTime lastModifiedDate;
}
