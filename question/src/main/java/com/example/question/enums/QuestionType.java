package com.example.question.enums;

public enum QuestionType {
    MCQ("MCQ"),
    CODING("CODING"),
    SUBJECTIVE("SUBJECTIVE"),
    FULL_STACK("FULL_STACK");

    private final String description;

    QuestionType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

