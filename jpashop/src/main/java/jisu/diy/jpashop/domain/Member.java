package jisu.diy.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "memberId")
    private Long id;

    private String username;
    private String nickname;
    private String password;

    @OneToMany(mappedBy = "member")
    private List<Article> articles = new ArrayList<>();


}
