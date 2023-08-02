package org.ddling.respository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.ddling.domain.Article;

@Mapper
public interface ArticleRepository {

    @Insert("INSERT INTO article(title, summary, body, renderBody, createTime, updateTime)" +
            " VALUES(#{title}, #{summary}, #{body}, #{renderBody}, #{createTime}, #{updateTime})")
    int insert(Article article);

}
