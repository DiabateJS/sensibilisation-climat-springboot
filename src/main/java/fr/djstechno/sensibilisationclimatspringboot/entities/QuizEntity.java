package fr.djstechno.sensibilisationclimatspringboot.entities;

import fr.djstechno.sensibilisationclimatspringboot.models.QuestionModel;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="ASC_QUIZ")
public class QuizEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String libelle;
    private String description;
    private String info;
}
