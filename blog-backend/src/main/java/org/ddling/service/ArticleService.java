package org.ddling.service;

import org.ddling.domain.Article;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticleService {

    int publish(Article article);

    List<Article> listArticles();

}
