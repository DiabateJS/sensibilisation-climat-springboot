package fr.djstechno.sensibilisationclimatspringboot.services;

import java.util.List;

import fr.djstechno.sensibilisationclimatspringboot.models.QuestionModel;
import fr.djstechno.sensibilisationclimatspringboot.models.QuizModel;

public interface QuizService {
    List<QuizModel> getQuizs();

    QuizModel getQuiz(Long id);

    List<QuestionModel> getQuizQuestions(Long id);
}
