package com.obectron.api.person;

import com.obectron.api.DTO;
import com.obectron.core.Human;
import com.obectron.core.person.PersonType;
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
