package com.example.question.mapper;

import com.example.question.dto.QuestionDto;
import com.example.question.entity.Question;
import org.springframework.stereotype.Component;

@Component
public class QuestionMapper {

    public static Question toEntity(QuestionDto dto) {
        if (dto == null) {
            return null;
        }

        Question entity = new Question();
        entity.setType(dto.getType());
        entity.setTitle(dto.getTitle());
        entity.setProblemStatement(dto.getProblemStatement());
        entity.setDifficultyLevel(dto.getDifficultyLevel());
        entity.setMaxScore(dto.getMaxScore());
        entity.setNegativeScore(dto.getNegativeScore());
        entity.setTimeBoundSeconds(dto.getTimeBoundSeconds());
        entity.setActive(dto.isActive());
        entity.setDraft(dto.isDraft());
        entity.setAiEvaluationEnabled(dto.isAiEvaluationEnabled());
        return entity;
    }

    public static QuestionDto toDto(Question entity) {
        if (entity == null) {
            return null;
        }

        QuestionDto dto = new QuestionDto();
        dto.setId(entity.getId());
        dto.setType(entity.getType());
        dto.setTitle(entity.getTitle());
        dto.setProblemStatement(entity.getProblemStatement());
        dto.setDifficultyLevel(entity.getDifficultyLevel());
        dto.setMaxScore(entity.getMaxScore());
        dto.setNegativeScore(entity.getNegativeScore());
        dto.setTimeBoundSeconds(entity.getTimeBoundSeconds());
        dto.setActive(entity.isActive());
        dto.setDraft(entity.isDraft());
        dto.setAiEvaluationEnabled(entity.isAiEvaluationEnabled());
        return dto;
    }
}
