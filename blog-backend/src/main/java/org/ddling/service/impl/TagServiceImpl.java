package org.ddling.service.impl;

import org.ddling.domain.Tag;
import org.ddling.repository.TagRepository;
import org.ddling.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;

    @Override
    public List<Tag> getAllTags() {
        return tagRepository.fetchTags();
    }

    @Override
    public int addTag(Tag tag) {
        return tagRepository.addTag(tag);
    }

    @Override
    public int deleteTag(Tag tag) {
        return tagRepository.deleteTag(tag);
    }


}
