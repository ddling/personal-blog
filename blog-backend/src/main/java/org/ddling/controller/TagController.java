package org.ddling.controller;

import org.ddling.common.Response;
import org.ddling.domain.Tag;
import org.ddling.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/tag")
@RestController
public class TagController {

    @Autowired
    private TagService tagService;

    @ResponseBody
    @GetMapping()
    public Response getAllTags() {
        List<Tag> tagList = tagService.getAllTags();
        return Response.success(tagList);
    }

    @ResponseBody
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response addTag(@RequestBody Tag tag) {
         tagService.addTag(tag);
         return Response.success();
    }

    @ResponseBody
    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteTag(@RequestBody Tag tag) {
        tagService.deleteTag(tag);
        return Response.success();
    }

}
