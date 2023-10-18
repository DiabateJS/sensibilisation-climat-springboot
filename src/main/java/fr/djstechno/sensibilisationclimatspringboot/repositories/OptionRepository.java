package fr.djstechno.sensibilisationclimatspringboot.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.djstechno.sensibilisationclimatspringboot.entities.OptionEntity;

@Transactional
public interface OptionRepository extends JpaRepository<OptionEntity, Long> {
    @Query(value = "SELECT * FROM ASC_OPTION O WHERE O.ID_QUESTION = ?", nativeQuery = true)
    List<OptionEntity> getQuestionOptions(Long idQuestion);
}
