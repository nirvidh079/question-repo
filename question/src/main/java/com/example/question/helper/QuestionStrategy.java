package com.example.question.helper;

import com.example.question.dto.QuestionDto;

public interface QuestionStrategy {
    void createQuestion(final QuestionDto questionDto);
}