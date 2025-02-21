package com.example.question.helper;

import com.example.question.dto.McqDto;
import com.example.question.dto.QuestionDto;
import com.example.question.entity.Mcq;
import com.example.question.entity.Question;
import com.example.question.mapper.QuestionMapper;
import com.example.question.repository.McqOptionRepository;
import com.example.question.repository.QuestionRepository;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Component("MCQ")
public class McqQuestionStrategy implements QuestionStrategy {
    private final QuestionRepository questionRepository;
    private final McqOptionRepository mcqOptionRepository;

    public McqQuestionStrategy(QuestionRepository questionRepository,
                               McqOptionRepository mcqOptionRepository) {
        this.questionRepository = questionRepository;
        this.mcqOptionRepository = mcqOptionRepository;
    }

    @Override
    public void createQuestion(QuestionDto questionDto) {

        Question question = questionRepository.save(QuestionMapper.toEntity(questionDto));
        Long queId = question.getId();

        List<McqDto> mcqDtos = questionDto.getOptions();

        if(!ObjectUtils.isEmpty(mcqDtos)){
            List<Mcq> mcqs = mcqDtos.stream().map(option ->
                            Mcq.builder()
                                    .questionId(queId)
                                    .optionText(option.getOptionText())
                                    .isCorrect(option.isCorrect())
                                    .scoreIfSelected(option.getScoreIfSelected()).build())
                    .toList();
            mcqOptionRepository.saveAll(mcqs);
        }
    }
}
