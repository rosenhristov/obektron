package com.obektron.api.user;

import com.obektron.api.DTO;
import com.obektron.core.Human;
import com.obektron.core.user.UserRole;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserDTO extends Human implements DTO {
    private UUID id;
    private UserRole role;
    private String username;
    private String password;
}
