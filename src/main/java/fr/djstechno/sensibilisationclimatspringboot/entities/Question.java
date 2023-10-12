package fr.djstechno.sensibilisationclimatspringboot.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="ASC_QUESTION")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    private String idResponse;
    private String explication;
    private Long idQuiz;

}
