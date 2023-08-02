package org.ddling.service.impl;

import org.ddling.domain.Article;
import org.ddling.respository.ArticleRepository;
import org.ddling.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public int publish(Article article) {
        article.setCreateTime(new Date());
        article.setUpdateTime(new Date());
        return articleRepository.insert(article);
    }

}
