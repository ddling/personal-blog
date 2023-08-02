package org.ddling.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Article {

    private Integer id;

    private String title;

    private String summary;

    private String body;

    private String renderBody;

    private Date createTime;

    private Date updateTime;

}
