package mvc1.servlet.domain.member;

import lombok.*;

@Getter @Setter
@Builder
@AllArgsConstructor
public class Member {


    private long id;
    private String name;
    private int age;

    public Member() {
    }
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}