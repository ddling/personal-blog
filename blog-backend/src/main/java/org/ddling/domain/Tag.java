package org.ddling.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class Tag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer id;

    private String title;
}
