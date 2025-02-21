package com.example.question.mapper;

import com.example.question.dto.CodingQuesTemplateDto;
import com.example.question.entity.CodingQuesTemplate;
import org.springframework.stereotype.Component;

@Component
public class CodingQuesTemplateMapper {
    public static CodingQuesTemplateDto toDto(CodingQuesTemplate entity) {
        if (entity == null) {
            return null;
        }

        CodingQuesTemplateDto dto = new CodingQuesTemplateDto();
        dto.setId(entity.getId());
        dto.setLanguageCode(entity.getLanguageCode());
        dto.setSnippet(entity.getSnippet());
        return dto;
    }
    public static CodingQuesTemplate toEntity(CodingQuesTemplateDto dto) {
        if (dto == null) {
            return null;
        }

        CodingQuesTemplate entity = new CodingQuesTemplate();
        entity.setLanguageCode(dto.getLanguageCode());
        entity.setSnippet(dto.getSnippet());
        return entity;
    }
}
