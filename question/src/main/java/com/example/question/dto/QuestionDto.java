package com.example.question.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDto {
    private long id;
    private String type;
    private String title;
    private String problemStatement;
    private String difficultyLevel;
    private int maxScore;
    private int negativeScore;
    private int timeBoundSeconds;
    private boolean isActive = true;
    private boolean isDraft = true;
    private boolean aiEvaluationEnabled = true;
}
