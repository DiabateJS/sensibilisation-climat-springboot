package fr.djstechno.sensibilisationclimatspringboot.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="ASC_OPTION")
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String valeur;
    private Long idQuestion;

}
