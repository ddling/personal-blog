package org.ddling.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Tag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer id;

    @Size(max = 30, message = "tag title's length should be less than 30")
    private String title;
}
