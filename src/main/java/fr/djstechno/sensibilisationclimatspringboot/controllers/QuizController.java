package fr.djstechno.sensibilisationclimatspringboot.controllers;

import fr.djstechno.sensibilisationclimatspringboot.models.Quiz;
import fr.djstechno.sensibilisationclimatspringboot.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/quizs")
    public List<Quiz> getQuizs(){
        return this.quizService.getQuizs();
    }


}
