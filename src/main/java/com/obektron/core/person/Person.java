package com.obektron.core.person;


import com.obektron.core.Gender;
import com.obektron.core.Human;
import com.obektron.core.Model;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.UUID;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Person extends Human implements Model {

    private UUID id;
    protected PersonType type;
    protected String maidenName;
    protected List<String> nicknames;

    protected String getFullNameWithMaidenName() {
        if (gender == Gender.FEMALE && !surname.contains("-")) {
            return String.format("%s %s %s (%s)", name, patronym, surname, maidenName);
        }
        return String.format("%s %s %s", name, patronym, surname);
    }
}
