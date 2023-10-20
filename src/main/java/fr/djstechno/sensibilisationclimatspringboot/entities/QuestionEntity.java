package fr.djstechno.sensibilisationclimatspringboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ASC_QUESTION")
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long ordre;
    private String libelle;
    private String idResponse;
    private String explication;
    private Long idQuiz;

}
