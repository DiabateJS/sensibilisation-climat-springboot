package fr.djstechno.sensibilisationclimatspringboot.models;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    private int id;
    private String libelle;
    private List<Option> options;
    private String idResponse;
    private String explication;
}
