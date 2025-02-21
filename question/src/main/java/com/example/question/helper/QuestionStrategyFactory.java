package com.example.question.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class QuestionStrategyFactory {

    private final Map<String, QuestionStrategy> strategyMap;

    @Autowired
    public QuestionStrategyFactory(Map<String, QuestionStrategy> strategyMap) {
        this.strategyMap = strategyMap;
    }

    public QuestionStrategy getStrategy(String questionType) {
        return strategyMap.get(questionType);
    }
}
