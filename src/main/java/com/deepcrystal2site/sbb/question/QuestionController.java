package com.deepcrystal2site.sbb;

import com.deepcrystal2site.sbb.question.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class QuestionController {
    private final QuestionRepository questionRepository;

    @GetMapping("/question/list")

    public String list() {
        return "question_list";
    }
}
