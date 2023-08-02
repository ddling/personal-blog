package org.ddling.service;

import org.ddling.domain.Article;
import org.springframework.stereotype.Service;

public interface ArticleService {

    int publish(Article article);

}
