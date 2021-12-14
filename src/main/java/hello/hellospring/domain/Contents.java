package hello.hellospring.domain;

import lombok.Getter;

import javax.persistence.Embeddable;
import java.util.Objects;

/**
 * 문의, 상담후기 테이블에서사용하는 값타입[제목,내용]
 *
 **/
@Embeddable
@Getter
public class Contents {

    //제목
    private String tile;

    //내용
    private String content;

    public Contents() {
    }

    public Contents(String tile, String content) {
        this.tile = tile;
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contents contents = (Contents) o;
        return Objects.equals(getTile(), contents.getTile()) && Objects.equals(getContent(), contents.getContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTile(), getContent());
    }

}
