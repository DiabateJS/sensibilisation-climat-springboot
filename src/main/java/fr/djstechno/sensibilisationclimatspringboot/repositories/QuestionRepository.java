package fr.djstechno.sensibilisationclimatspringboot.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.djstechno.sensibilisationclimatspringboot.entities.QuestionEntity;

@Transactional
public interface QuestionRepository extends JpaRepository<QuestionEntity, Long> {

    @Query(value = "SELECT * FROM ASC_QUESTION Q WHERE Q.ID_QUIZ = ?", nativeQuery = true)
    List<QuestionEntity> getQuestionsById(Long idQuiz);

}
