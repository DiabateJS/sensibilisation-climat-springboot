package fr.djstechno.sensibilisationclimatspringboot.services;

import java.util.List;

import fr.djstechno.sensibilisationclimatspringboot.models.Question;
import fr.djstechno.sensibilisationclimatspringboot.entities.Quiz;

public interface QuizService {
    List<Quiz> getQuizs();

    Quiz getQuiz(Long id);

    List<Question> getQuizQuestions(int id);
}
