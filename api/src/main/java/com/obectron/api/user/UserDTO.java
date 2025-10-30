package com.obectron.api.user;

import com.obectron.api.DTO;
import com.obectron.core.Human;
import com.obectron.core.user.UserRole;
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
