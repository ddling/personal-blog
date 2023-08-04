package org.ddling.service;

import org.ddling.domain.Tag;

import java.util.List;

public interface TagService {

    List<Tag> getAllTags();

    int addTag(Tag tag);

    int deleteTag(Tag tag);

}
