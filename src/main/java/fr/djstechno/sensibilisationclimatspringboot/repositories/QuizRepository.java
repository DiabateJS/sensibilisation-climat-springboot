package fr.djstechno.sensibilisationclimatspringboot.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.djstechno.sensibilisationclimatspringboot.entities.QuizEntity;

@Transactional
public interface QuizRepository extends JpaRepository<QuizEntity, Long> {
}
