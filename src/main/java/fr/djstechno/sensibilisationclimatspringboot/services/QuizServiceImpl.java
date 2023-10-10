package fr.djstechno.sensibilisationclimatspringboot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import fr.djstechno.sensibilisationclimatspringboot.models.Option;
import fr.djstechno.sensibilisationclimatspringboot.models.Question;
import fr.djstechno.sensibilisationclimatspringboot.models.Quiz;

@Service
public class QuizServiceImpl implements QuizService {

    private List<Quiz> quizs;

    private void init() {
        this.quizs = new ArrayList<>();

        Quiz quiz1 = new Quiz();
        quiz1.setId("QZ001");
        quiz1.setLibelle("Quiz Niveau 1");
        quiz1.setDescription("Ce quiz niveau débutant permet d'évaluer votre connaissance du changement climatique.");

        List<Question> questions = new ArrayList<>();

        Question question1 = new Question();
        question1.setId(1);
        question1.setLibelle("Quelle serait la température de la Terre sans atmosphère ?");

        List<Option> options = new ArrayList<>();
        Option option1 = new Option();
        option1.setId("A");
        option1.setValeur("+15 °C");
        options.add(option1);

        Option option2 = new Option();
        option2.setId("B");
        option2.setValeur("0 °C");
        options.add(option2);

        Option option3 = new Option();
        option3.setId("C");
        option3.setValeur("-50 °C");
        options.add(option3);

        Option option4 = new Option();
        option4.setId("D");
        option4.setValeur("-18 °C");
        options.add(option4);

        question1.setOptions(options);
        question1.setIdResponse("A");
        question1.setExplication("Heureusement, le phénomène naturel de l’effet de serre conserve dans l’atmosphère une partie de la chaleur du soleil !");
        questions.add(question1);

        Question question2 = new Question();
        question2.setId(2);
        question2.setLibelle("Quel gaz a l'effet de serre le plus puissant ?");

        options = new ArrayList<>();
        option1 = new Option();
        option1.setId("A");
        option1.setValeur("CO2");
        options.add(option1);

        option2 = new Option();
        option2.setId("B");
        option2.setValeur("Vapeur d'eau");
        options.add(option2);

        option3 = new Option();
        option3.setId("C");
        option3.setValeur("Méthane");
        options.add(option3);

        option4 = new Option();
        option4.setId("D");
        option4.setValeur("Argon");
        options.add(option4);

        question2.setOptions(options);
        question2.setIdResponse("B");
        question2.setExplication("La vapeur d’eau contribue pour 60 % à l’effet de serre. Les émissions de ce gaz par l’humanité à travers l’industrie n’ont cependant qu’un effet limité car la durée de vie de la vapeur d’eau est courte.");
        questions.add(question2);

        Question question3 = new Question();
        question3.setId(3);
        question3.setLibelle("Où va la majorité du CO2 émis par l’Homme ?");

        options = new ArrayList<>();
        option1 = new Option();
        option1.setId("A");
        option1.setValeur("Dans l'atmosphère");
        options.add(option1);

        option2 = new Option();
        option2.setId("B");
        option2.setValeur("Vapeur d'eau");
        options.add(option2);

        option3 = new Option();
        option3.setId("C");
        option3.setValeur("Dans l'océan");
        options.add(option3);

        question3.setOptions(options);
        question3.setIdResponse("A");
        question3.setExplication("Plus de 50% est encore absorbé par l'atmosphère.");
        questions.add(question3);

        Question question4 = new Question();
        question4.setId(4);
        question4.setLibelle("En hiver et à quantité égale, lequel de ces aliments émet le plus de CO2 ?");

        options = new ArrayList<>();
        option1 = new Option();
        option1.setId("A");
        option1.setValeur("Banane de Martinique");
        options.add(option1);

        option2 = new Option();
        option2.setId("B");
        option2.setValeur("Tomates d'Espagne");
        options.add(option2);

        option3 = new Option();
        option3.setId("C");
        option3.setValeur("Le rutabaga picard");
        options.add(option3);

        option4 = new Option();
        option4.setId("D");
        option4.setValeur("Le café colombien");
        options.add(option4);

        question4.setOptions(options);
        question4.setIdResponse("B");
        question4.setExplication("À quantité égale, produire une tomate en hiver génère aujourd'hui plus de C02 que le transport des autres aliments...");
        questions.add(question4);

        quiz1.setQuestions(questions);
        quiz1.setInfo("Un jour passé à Pékin en respirant l’air a les mêmes effets sur la santé que fumer 21 cigarettes !");
        this.quizs.add(quiz1);

        Quiz quiz2 = new Quiz();
        quiz2.setId("QZ002");
        quiz2.setLibelle("Quiz Niveau Intermédiaire");
        quiz2.setDescription("Ce quiz niveau intermédiaire monte d'un cran sur le changement climatique.");

        questions = new ArrayList<>();

        question1 = new Question();
        question1.setId(1);
        question1.setLibelle("En quelle année le GEIC a été crée ?");

        options = new ArrayList<>();
        option1 = new Option();
        option1.setId("A");
        option1.setValeur("1988");
        options.add(option1);

        option2 = new Option();
        option2.setId("B");
        option2.setValeur("1999");
        options.add(option2);

        option3 = new Option();
        option3.setId("C");
        option3.setValeur("2005");
        options.add(option3);

        question1.setOptions(options);
        question1.setIdResponse("A");
        question1.setExplication("Le GEIC a bien été crée en 1988");
        questions.add(question1);

        quiz2.setQuestions(questions);
        quiz2.setInfo("Un jour passé à Pékin en respirant l’air a les mêmes effets sur la santé que fumer 21 cigarettes !");

        this.quizs.add(quiz2);

    }

    @Override
    public List<Quiz> getQuizs() {
        this.init();
        return this.quizs;
    }

    @Override
    public Quiz getQuiz(String id) {
        this.init();
        return this.quizs.stream().filter(q -> q.getId().equals(String.valueOf(id))).collect(Collectors.toList()).get(0);
    }

    @Override
    public List<Question> getQuizQuestions(String id) {
        Quiz quiz = this.getQuiz(id);
        return quiz.getQuestions();
    }
}
