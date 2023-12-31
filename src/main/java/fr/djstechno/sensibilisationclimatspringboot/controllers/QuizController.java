package fr.djstechno.sensibilisationclimatspringboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.djstechno.sensibilisationclimatspringboot.models.QuizModel;
import fr.djstechno.sensibilisationclimatspringboot.services.QuizService;

@CrossOrigin(origins = "*")
@RestController
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/quizs")
    public List<QuizModel> getQuizs() {
        return this.quizService.getQuizs();
    }

    @GetMapping("/quizs/{id}")
    public QuizModel getQuiz(@PathVariable Long id) {
        return this.quizService.getQuiz(id);
    }

}
