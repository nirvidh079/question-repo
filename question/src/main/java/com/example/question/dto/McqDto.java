package com.example.question.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class McqDto {
    @JsonProperty("option_text")
    private String optionText;
    @JsonProperty("is_correct")
    private boolean isCorrect;
    @JsonProperty("score_if_selected")
    private int scoreIfSelected;
}
