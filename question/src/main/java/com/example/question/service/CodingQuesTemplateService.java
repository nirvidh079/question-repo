package com.example.question.service;

import com.example.question.dto.CodingQuesTemplateDto;
import com.example.question.dto.TagDto;
import com.example.question.entity.CodingQuesTemplate;
import com.example.question.entity.Tag;
import com.example.question.mapper.CodingQuesTemplateMapper;
import com.example.question.mapper.TagMapper;
import com.example.question.repository.CodingQuesTemplateRepo;
import org.springframework.stereotype.Service;

@Service
public class CodingQuesTemplateService {
    private final CodingQuesTemplateRepo codingQuesTemplateRepo;

    public CodingQuesTemplateService(CodingQuesTemplateRepo codingQuesTemplateRepo) {
        this.codingQuesTemplateRepo = codingQuesTemplateRepo;
    }
    public CodingQuesTemplateDto saveTemplate(final CodingQuesTemplateDto codeDto){
        CodingQuesTemplate code = CodingQuesTemplateMapper.toEntity(codeDto);
        code = codingQuesTemplateRepo.save(code);
        return CodingQuesTemplateMapper.toDto(code);
    }
}
