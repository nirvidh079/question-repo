package com.example.question.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;

@Entity
@Table(name = "question")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Question extends Auditable implements Serializable {
    private static final long serialVersionUID = 4076468265819394259L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String problemStatement;
    private String difficultyLevel;
    private int maxScore;
    private int negativeScore;
    private int timeBoundSeconds;
    private boolean isActive = true;
    private boolean isDraft = true;
    private boolean aiEvaluationEnabled = true;
}
