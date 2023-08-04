package org.ddling.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Article {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer id;

    private Integer authorId;

    private String title;

    private String summary;

    private boolean published;

    private Date createdAt;

    private Date updatedAt;

    private Date publishedAt;

    private String content;

    private String coverImg;
}
