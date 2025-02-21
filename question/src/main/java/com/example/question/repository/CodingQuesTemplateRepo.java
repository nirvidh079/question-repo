package com.example.question.repository;

import com.example.question.entity.CodingQuesTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodingQuesTemplateRepo extends JpaRepository<CodingQuesTemplate, Long> {
}
