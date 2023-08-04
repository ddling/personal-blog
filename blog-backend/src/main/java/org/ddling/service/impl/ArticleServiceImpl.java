package org.ddling.service.impl;

import org.ddling.common.Utils;
import org.ddling.domain.Article;
import org.ddling.repository.ArticleRepository;
import org.ddling.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public int publish(Article article) {
        Timestamp timestamp = Utils.getCurrentTimeStamp();
        article.setCreateTime(timestamp);
        article.setUpdateTime(timestamp);
        return articleRepository.insertArticle(article);
    }

    @Override
    public List<Article> listArticles() {
        return articleRepository.listArticles();
    }

}
