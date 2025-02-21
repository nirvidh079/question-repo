package com.example.question.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;


@Entity
@Data
@Table(name = "mcq")
@Builder
public class Mcq implements Serializable {
    @Serial
    private static final long serialVersionUID = 4076468265819394259L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question_id", nullable = false)
    private Long questionId;

    @Column(name = "option_text", nullable = false, columnDefinition = "TEXT")
    private String optionText;

    @Column(name = "is_correct", nullable = false, columnDefinition = "BOOLEAN DEFAULT FALSE")
    private boolean isCorrect;

    @Column(name = "score_if_selected", columnDefinition = "INTEGER DEFAULT 0")
    private int scoreIfSelected;

    @Version
    private Integer version;
}