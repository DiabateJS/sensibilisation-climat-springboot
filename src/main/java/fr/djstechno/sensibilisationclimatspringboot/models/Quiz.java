package fr.djstechno.sensibilisationclimatspringboot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {
    private String id;
    private String libelle;
    private List<Question> questions;
    private String info;
}
