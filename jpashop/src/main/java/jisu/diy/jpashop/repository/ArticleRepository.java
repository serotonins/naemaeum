package jisu.diy.jpashop.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jisu.diy.jpashop.domain.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleRepository {

//    @PersistenceContext
    private final EntityManager em;
//

    public ArticleRepository(EntityManager em) {
        this.em = em;
    }

    public void save(Article article) {
        em.persist(article);
    }

    public Article findOne(Long id) {
        return em.find(Article.class, id);
    }

//    public List<Article> findAllByString(ArticleSearch articleSearch)
}
