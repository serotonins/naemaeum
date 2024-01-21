package jisu.diy.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Article {

    @Id @GeneratedValue
    @Column(name = "articleId")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberId")
    private Member member;

    private String title;
    private String content;

    @Enumerated(EnumType.STRING)
    private ArticleStatus articleStatus;

    public void setMember(Member member) {
        this.member = member;
        member.getArticles().add(this);
    }



}
