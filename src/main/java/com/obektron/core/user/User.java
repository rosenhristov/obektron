package com.obektron.core.user;

import com.obektron.core.Human;
import com.obektron.core.Model;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends Human implements Model {
    private UUID id;
    private UserRole role;
    private String username;
    private String password;
}
