package fr.djstechno.sensibilisationclimatspringboot.services;

import fr.djstechno.sensibilisationclimatspringboot.models.Question;
import fr.djstechno.sensibilisationclimatspringboot.models.Quiz;

import java.util.List;

public interface QuizService {
    public List<Quiz> getQuizs();
    public Quiz getQuiz(int id);

    public List<Question> getQuizQuestions(int id);
}
