package com.obectron.db.user;

import com.obectron.core.Gender;
import com.obectron.core.address.Address;
import com.obectron.core.user.UserRole;
import com.obectron.db.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import static com.obectron.common.utils.Constants.*;

@Data
@Entity
@SuperBuilder
@Table(name = USERS_TABLE)
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ID_COLUMN)
    private UUID id;

    @Column(name = ROLE_COLUMN)
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Column(name = NAME_COLUMN)
    private String name;

    @Column(name = PATRONYM_COLUMN)
    private String patronym;

    @Column(name = SURNAME_COLUMN)
    private String surname;

    @Column(name = ADDRESSES_COLUMN)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @ElementCollection(fetch = FetchType.EAGER)
    private List<Address> addresses;

    @Column(name = GENDER_COLUMN)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = BIRTHDATE_COLUMN)
    private Date birthDate;

    @Column(name = PHONE_COLUMN)
    @Pattern(regexp = PHONE_NUMBER_PATTERN,message = INVALID_PHONE_NUMBER)
    private String phone;

    @Column(name = EMAIL_COLUMN)
    @Email(regexp = EMAIL_PATTERN, message = INVALID_EMAIL_ADDRESS)
    private String email;

    @Column(name = USERNAME_COLUMN)
    private String username;

    @Column(name = PASSWORD_COLUMN)
    @Pattern(regexp = PASSWORD_PATTERN, message = INVALID_PASSWORD_FORMAT)
    private String password;

}
