package fr.djstechno.sensibilisationclimatspringboot.models;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OptionModel {
    private String id;
    private String valeur;
}
