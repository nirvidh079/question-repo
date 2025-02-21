package com.example.question.enums;

public enum DifficultyType {
    EASY("EASY"),
    MEDIUM("MEDIUM"),
    HARD("HARD");

    private final String description;

    DifficultyType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
