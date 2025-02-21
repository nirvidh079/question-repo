package com.example.question.controller;

import com.example.question.dto.QuestionDto;
import com.example.question.service.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping()
    public ResponseEntity<QuestionDto> saveQuestion(@RequestBody QuestionDto questionDto) {
        return ResponseEntity.ok(questionService.saveQuestion(questionDto));
    }
}
