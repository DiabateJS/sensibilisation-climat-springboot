package fr.djstechno.sensibilisationclimatspringboot.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.djstechno.sensibilisationclimatspringboot.entities.Question;

@Transactional
public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query(value = "SELECT * FROM ASC_QUESTION Q WHERE Q.ID_QUIZ = ?", nativeQuery = true)
    List<Question> getQuestionsById(Long idQuiz);

}
