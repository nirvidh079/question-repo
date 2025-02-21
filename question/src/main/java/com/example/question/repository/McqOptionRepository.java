package com.example.question.repository;

import com.example.question.entity.Mcq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface McqOptionRepository extends JpaRepository<Mcq, Long> {
}
