package fr.djstechno.sensibilisationclimatspringboot.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {
    private int id;
    private String code;
    private String libelle;
    private String description;
    private List<Question> questions;
    private String info;
}
