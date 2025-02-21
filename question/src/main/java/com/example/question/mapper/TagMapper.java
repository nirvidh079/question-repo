package com.example.question.mapper;

import com.example.question.dto.TagDto;
import com.example.question.entity.Tag;
import org.springframework.stereotype.Component;

@Component
public class TagMapper {
    public static Tag toEntity(TagDto dto) {
        if (dto == null) {
            return null;
        }

        Tag entity = new Tag();
        entity.setName(dto.getName());

        return entity;
    }

    public static TagDto toDto(Tag entity) {
        if (entity == null) {
            return null;
        }

        TagDto dto = new TagDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }
}
