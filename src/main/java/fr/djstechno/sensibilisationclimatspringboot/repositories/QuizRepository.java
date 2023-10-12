package fr.djstechno.sensibilisationclimatspringboot.repositories;

import fr.djstechno.sensibilisationclimatspringboot.entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
