package org.ddling.controller;

import org.ddling.common.Response;
import org.ddling.domain.Article;
import org.ddling.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(path = "/article")
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("publish")
    public Response publish(@RequestBody Article article) {
        System.out.println(article);
        articleService.publish(article);
        return new Response();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Response listArticles() {
        List<Article> articles = new ArrayList<>();

        return Response.success(articles);
    }

}
