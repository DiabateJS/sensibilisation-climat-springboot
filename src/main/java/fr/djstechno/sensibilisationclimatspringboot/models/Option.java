package fr.djstechno.sensibilisationclimatspringboot.models;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Option {
    private String id;
    private String valeur;
}
