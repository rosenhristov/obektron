package com.obektron.persistence.user;

import com.obektron.core.Gender;
import com.obektron.core.address.Address;
import com.obektron.core.user.UserRole;
import com.obektron.persistence.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@SuperBuilder
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity implements BaseEntity {

    @Id
    private UUID id;
    private String name;
    private String patronym;
    private String surname;
    private String maidenName;
    private String nickname;
    private List<Address> addresses;
    private Gender gender;
    private String birthDate;
    private String phone;
    private String email;
    private String username;
    private String password;
    private UserRole role;

}
