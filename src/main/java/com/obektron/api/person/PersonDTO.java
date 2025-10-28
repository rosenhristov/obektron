package com.obektron.api.person;

import com.obektron.api.DTO;
import com.obektron.core.Human;
import com.obektron.core.person.PersonType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.UUID;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PersonDTO extends Human implements DTO {
    private UUID id;
    private PersonType type;
    private String maidenName;
    private List<String> nicknames;
}
