package com.obectron.core;

import com.obectron.core.address.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;

import static java.util.Objects.isNull;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class Human {
    protected String name;
    protected String patronym;
    protected String surname;
    protected List<Address> addresses;
    protected Gender gender;
    protected Date birthDate;
    protected String phone;
    protected String email;

    protected String getFullName() {
        return (isNull(patronym))
                ? String.format("%s %s", name, surname)
                : String.format("%s %s %s", name, patronym, surname);
    }
}
