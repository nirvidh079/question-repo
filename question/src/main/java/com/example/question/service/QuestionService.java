package com.example.question.service;

import com.example.question.dto.QuestionDto;
import com.example.question.helper.QuestionStrategy;
import com.example.question.helper.QuestionStrategyFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class QuestionService {

    private final QuestionStrategyFactory questionStrategyFactory;

    public QuestionService(QuestionStrategyFactory questionStrategyFactory) {
        this.questionStrategyFactory = questionStrategyFactory;
    }

    @Transactional(timeout = 300)
    public String saveQuestion(final QuestionDto questionDto) {
        String questionType = questionDto.getType();
        QuestionStrategy strategy = questionStrategyFactory.getStrategy(questionType);
        if (strategy != null) {
            strategy.createQuestion(questionDto);
            return "Question created successfully!";
        } else {
            throw new IllegalArgumentException("Invalid Question Type: " + questionType);
        }

    }
}
