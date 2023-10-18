package fr.djstechno.sensibilisationclimatspringboot.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizModel {
    private Long id;
    private String code;
    private String libelle;
    private String description;
    private List<QuestionModel> questions;
    private String info;
}
