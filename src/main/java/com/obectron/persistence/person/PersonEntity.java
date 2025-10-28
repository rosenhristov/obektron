package com.obectron.persistence.person;

import com.obectron.core.Gender;
import com.obectron.core.address.Address;
import com.obectron.core.person.PersonType;
import com.obectron.core.user.UserRole;
import com.obectron.persistence.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Builder
@Table(name = "persons")
@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity implements BaseEntity {

    @Id
    private UUID id;
    private PersonType type;
    private String name;
    private String patronym;
    private String surname;
    private String maidenName;
    private List<String> nicknames;
    private List<Address> addresses;
    private Gender gender;
    private String birthDate;
    private String phone;
    private String email;
    private String username;
    private String password;
    private UserRole role;
}
