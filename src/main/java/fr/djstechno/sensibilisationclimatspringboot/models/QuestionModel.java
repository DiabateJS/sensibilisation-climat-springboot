package fr.djstechno.sensibilisationclimatspringboot.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionModel {
    private Long id;
    private String libelle;
    private List<OptionModel> options;
    private String idResponse;
    private String explication;
}
