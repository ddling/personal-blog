package org.ddling.repository;

import org.apache.ibatis.annotations.Mapper;
import org.ddling.domain.Article;

import java.util.List;

@Mapper
public interface ArticleRepository {

    int insertArticle(Article article);

    List<Article> listArticles();

}
