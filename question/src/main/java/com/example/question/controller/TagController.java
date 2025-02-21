package com.example.question.controller;

import com.example.question.dto.TagDto;
import com.example.question.service.TagService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tags")
public class TagController {
    private final TagService tagService;

    public TagController(TagService tagService) {
        this.tagService = tagService;
    }
    @PostMapping
    public ResponseEntity<TagDto> saveTag(@RequestBody TagDto tagDto){
        return ResponseEntity.ok(tagService.saveTag(tagDto));
    }
}
