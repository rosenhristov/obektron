package com.obectron.db.person;

import com.obectron.core.Gender;
import com.obectron.core.address.Address;
import com.obectron.core.person.PersonType;
import com.obectron.db.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import static com.obectron.common.utils.Constants.*;

@Data
@Entity
@Builder
@Table(name = PEOPLE_TABLE)
@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ID_COLUMN)
    private UUID id;

    @Column(name = TYPE_COLUMN)
    @Enumerated(EnumType.STRING)
    private PersonType type;

    @Column(name = NAME_COLUMN)
    private String name;

    @Column(name = PATRONYM_COLUMN)
    private String patronym;

    @Column(name = SURNAME_COLUMN)
    private String surname;

    @Column(name = MAIDEN_NAME_COLUMN)
    private String maidenName;

    @Column(name = NICKNAMES_COLUMN)
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> nicknames;

    @Column(name = ADDRESSES_COLUMN)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Address> addresses;

    @Column(name = GENDER_COLUMN)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = BIRTHDATE_COLUMN)
    private Date birthDate;

    @Column(name = PHONE_COLUMN)
    private String phone;

    @Column(name = EMAIL_COLUMN)
    private String email;
}
