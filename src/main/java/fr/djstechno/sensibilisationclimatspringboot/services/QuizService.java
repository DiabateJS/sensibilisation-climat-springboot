package fr.djstechno.sensibilisationclimatspringboot.services;

import java.util.List;

import fr.djstechno.sensibilisationclimatspringboot.models.Question;
import fr.djstechno.sensibilisationclimatspringboot.models.Quiz;

public interface QuizService {
    List<Quiz> getQuizs();

    Quiz getQuiz(String id);

    List<Question> getQuizQuestions(String id);
}
