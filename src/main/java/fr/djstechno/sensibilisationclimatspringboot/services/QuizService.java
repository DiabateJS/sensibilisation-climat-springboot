package fr.djstechno.sensibilisationclimatspringboot.services;

import java.util.List;

import fr.djstechno.sensibilisationclimatspringboot.models.Question;

public interface QuizService {
    List<fr.djstechno.sensibilisationclimatspringboot.models.Quiz> getQuizs();

    fr.djstechno.sensibilisationclimatspringboot.models.Quiz getQuiz(Long id);

    List<Question> getQuizQuestions(Long id);
}
