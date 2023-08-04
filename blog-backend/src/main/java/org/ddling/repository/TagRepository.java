package org.ddling.repository;

import org.apache.ibatis.annotations.Mapper;
import org.ddling.domain.Tag;

import java.util.List;

@Mapper
public interface TagRepository {

    List<Tag> getAllTags();

    int addTag(Tag newTag);

    int deleteTag(Tag tag);

}
