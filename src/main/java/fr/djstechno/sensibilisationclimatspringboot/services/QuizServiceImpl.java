package fr.djstechno.sensibilisationclimatspringboot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.djstechno.sensibilisationclimatspringboot.entities.OptionEntity;
import fr.djstechno.sensibilisationclimatspringboot.entities.QuestionEntity;
import fr.djstechno.sensibilisationclimatspringboot.entities.QuizEntity;
import fr.djstechno.sensibilisationclimatspringboot.models.OptionModel;
import fr.djstechno.sensibilisationclimatspringboot.models.QuestionModel;
import fr.djstechno.sensibilisationclimatspringboot.models.QuizModel;
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
    public List<fr.djstechno.sensibilisationclimatspringboot.models.QuizModel> getQuizs() {
        List<QuizModel> quizsModel = new ArrayList<>();
        List<QuizEntity> quizs = new ArrayList<>();
        quizs = this.quizRepository.findAll();
        List<QuestionEntity> questions = new ArrayList<>();
        QuizModel quizModel = new QuizModel();
        for (QuizEntity quiz : quizs) {
            Long idQuiz = quiz.getId();
            quizModel = new QuizModel();
            quizModel.setId(idQuiz);
            quizModel.setLibelle(quiz.getLibelle());
            quizModel.setCode(quiz.getCode());
            quizModel.setInfo(quiz.getInfo());
            quizModel.setDescription(quiz.getDescription());
            questions = questionRepository.getQuestionsById(idQuiz);
            List<QuestionModel> questionsModel = new ArrayList<>();
            for (QuestionEntity question : questions) {
                QuestionModel q = new QuestionModel();
                q.setId(question.getId());
                q.setExplication(question.getExplication());
                q.setLibelle(question.getLibelle());
                q.setIdResponse(question.getIdResponse());
                //Ajout des Options de la question
                List<OptionEntity> optionsEntities = optionRepository.getQuestionOptions(question.getId());
                List<OptionModel> optionsModel = new ArrayList<>();
                for (OptionEntity optionEntity: optionsEntities){
                    OptionModel optionModel = new OptionModel();
                    optionModel.setId(optionEntity.getIdOption());
                    optionModel.setValeur(optionEntity.getValeur());
                    optionsModel.add(optionModel);
                }
                q.setOptions(optionsModel);
                questionsModel.add(q);
            }
            quizModel.setQuestions(questionsModel);
            quizsModel.add(quizModel);
        }
        return quizsModel;
    }

    @Override
    public QuizModel getQuiz(Long id) {
        QuizModel quizModel = new QuizModel();
        Optional<QuizEntity> result = this.quizRepository.findById(id);
        if (result.isPresent()) {
            QuizEntity quizEntity = result.get();
            quizModel.setId(quizEntity.getId());
            quizModel.setCode(quizEntity.getCode());
            quizModel.setDescription(quizEntity.getDescription());
            quizModel.setLibelle(quizEntity.getLibelle());
            quizModel.setInfo(quizEntity.getInfo());
            List<QuestionEntity> questionsEntities = questionRepository.getQuestionsById(id);
            List<QuestionModel> questionsModel = new ArrayList<>();
            for (QuestionEntity questionEntity : questionsEntities) {
                QuestionModel questionModel = new QuestionModel();
                questionModel.setId(questionEntity.getId());
                questionModel.setLibelle(questionEntity.getLibelle());
                questionModel.setExplication(questionEntity.getExplication());
                questionModel.setIdResponse(questionEntity.getIdResponse());
                // Ajout des Options de la question
                List<OptionEntity> optionsEntities = optionRepository.getQuestionOptions(questionEntity.getId());
                List<OptionModel> optionsModel = new ArrayList<>();
                for (OptionEntity optionEntity : optionsEntities) {
                    OptionModel optionModel = new OptionModel();
                    optionModel.setId(optionEntity.getIdOption());
                    optionModel.setValeur(optionEntity.getValeur());
                    optionsModel.add(optionModel);
                }
                questionModel.setOptions(optionsModel);
                questionsModel.add(questionModel);
            }
            quizModel.setQuestions(questionsModel);
        }
        return quizModel;
    }

    @Override
    public List<QuestionModel> getQuizQuestions(Long id) {
        return new ArrayList<>();
    }
}
