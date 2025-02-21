package com.example.question.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDto {
    private long id;
    private String type;
    private String title;
    @JsonProperty("problem_statement")
    private String problemStatement;
    @JsonProperty("difficulty_level")
    private String difficultyLevel;
    @JsonProperty("max_score")
    private int maxScore;
    @JsonProperty("negative_score")
    private int negativeScore;
    @JsonProperty("time_bound_seconds")
    private int timeBoundSeconds;
    @JsonProperty("is_active")
    private boolean isActive = true;
    @JsonProperty("isDraft")
    private boolean isDraft = true;
    @JsonProperty("ai_evaluation_enabled")
    private boolean aiEvaluationEnabled = true;

    private List<McqDto> options;
}
