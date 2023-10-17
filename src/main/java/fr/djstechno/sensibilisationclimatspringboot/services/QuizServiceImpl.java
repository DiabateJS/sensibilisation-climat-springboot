package fr.djstechno.sensibilisationclimatspringboot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.djstechno.sensibilisationclimatspringboot.entities.Question;
import fr.djstechno.sensibilisationclimatspringboot.entities.Quiz;
import fr.djstechno.sensibilisationclimatspringboot.repositories.OptionRepository;
import fr.djstechno.sensibilisationclimatspringboot.repositories.QuestionRepository;
import fr.djstechno.sensibilisationclimatspringboot.repositories.QuizRepository;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private OptionRepository optionRepository;

    @Override
    public List<fr.djstechno.sensibilisationclimatspringboot.models.Quiz> getQuizs() {
        List<fr.djstechno.sensibilisationclimatspringboot.models.Quiz> quizsModel = new ArrayList<>();
        List<Quiz> quizs = new ArrayList<>();
        quizs = this.quizRepository.findAll();
        List<Question> questions = new ArrayList<>();
        fr.djstechno.sensibilisationclimatspringboot.models.Quiz quizModel = new fr.djstechno.sensibilisationclimatspringboot.models.Quiz();
        for (Quiz quiz : quizs) {
            Long idQuiz = quiz.getId();
            quizModel = new fr.djstechno.sensibilisationclimatspringboot.models.Quiz();
            quizModel.setId(idQuiz);
            quizModel.setLibelle(quiz.getLibelle());
            quizModel.setCode(quiz.getCode());
            quizModel.setInfo(quiz.getInfo());
            quizModel.setDescription(quiz.getDescription());
            questions = questionRepository.getQuestionsById(idQuiz);
            List<fr.djstechno.sensibilisationclimatspringboot.models.Question> questionsModel = new ArrayList<>();
            for (Question question : questions) {
                fr.djstechno.sensibilisationclimatspringboot.models.Question q = new fr.djstechno.sensibilisationclimatspringboot.models.Question();
                q.setId(question.getId());
                q.setExplication(question.getExplication());
                q.setLibelle(question.getLibelle());
                q.setIdResponse(question.getIdResponse());
                questionsModel.add(q);
            }
            quizModel.setQuestions(questionsModel);
            quizsModel.add(quizModel);
        }
        return quizsModel;
    }

    @Override
    public fr.djstechno.sensibilisationclimatspringboot.models.Quiz getQuiz(Long id) {
        fr.djstechno.sensibilisationclimatspringboot.models.Quiz quiz = new fr.djstechno.sensibilisationclimatspringboot.models.Quiz();
        Optional<Quiz> result = this.quizRepository.findById(id);
        fr.djstechno.sensibilisationclimatspringboot.entities.Quiz quizEntity = new fr.djstechno.sensibilisationclimatspringboot.entities.Quiz();
        if (result.isPresent()) {
            quizEntity = result.get();
            quiz.setId(quizEntity.getId());
            quiz.setCode(quizEntity.getCode());
            quiz.setDescription(quizEntity.getDescription());
            quiz.setLibelle(quizEntity.getLibelle());
        }
        return quiz;
    }

    @Override
    public List<fr.djstechno.sensibilisationclimatspringboot.models.Question> getQuizQuestions(Long id) {
        return new ArrayList<>();
    }
}
