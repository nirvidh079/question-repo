package com.example.question.controller;

import com.example.question.dto.CodingQuesTemplateDto;
import com.example.question.service.CodingQuesTemplateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/template")
public class CodingQuesTemplateController {

    private final CodingQuesTemplateService codingQuesTemplateService;

    public CodingQuesTemplateController(CodingQuesTemplateService codingQuesTemplateService) {
        this.codingQuesTemplateService = codingQuesTemplateService;
    }

    @PostMapping
    public ResponseEntity<CodingQuesTemplateDto> saveTemplate(@RequestBody CodingQuesTemplateDto dto){
        return ResponseEntity.ok(codingQuesTemplateService.saveTemplate(dto));
    }
}
