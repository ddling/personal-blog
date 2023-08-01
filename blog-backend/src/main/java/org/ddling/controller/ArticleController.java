package org.ddling.controller;

import org.ddling.common.Response;
import org.ddling.domain.Article;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/article")
@RestController
public class ArticleController {

    @RequestMapping(value = "/publish", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Response publish(@RequestBody Article article) {
        System.out.println(article);
        return new Response();
    }

}
