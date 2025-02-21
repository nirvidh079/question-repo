package com.example.question.service;

import com.example.question.dto.QuestionDto;
import com.example.question.entity.Question;
import com.example.question.mapper.QuestionMapper;
import com.example.question.repository.QuestionRepository;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public QuestionDto saveQuestion(final QuestionDto questionDto) {
        Question question = QuestionMapper.toEntity(questionDto);
        question = questionRepository.save(question);
        return QuestionMapper.toDto(question);
    }
}
