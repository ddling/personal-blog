package org.ddling.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Article {

    private String title;

    private String summary;

    private String body;

    private String renderBody;

    private Date createDate;

}
