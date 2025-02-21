package com.example.question.service;

import com.example.question.dto.TagDto;
import com.example.question.entity.Tag;
import com.example.question.mapper.TagMapper;
import com.example.question.repository.TagRepository;
import org.springframework.stereotype.Service;

@Service
public class TagService {
    private final TagRepository tagRepository;

    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    public TagDto saveTag(final TagDto tagDto){
        Tag tag = TagMapper.toEntity(tagDto);
        tag=tagRepository.save(tag);
        return TagMapper.toDto(tag);
    }
}
