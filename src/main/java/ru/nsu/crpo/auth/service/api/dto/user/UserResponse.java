package ru.nsu.crpo.auth.service.api.dto.user;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
public class UserResponse {

    private int id;

    private String email;

    private Set<Integer> rolesId;

    private String firstName;

    private String secondName;

    private String thirdName;

    private String phone;

    private LocalDate birthdate;

    private Instant createdAt;
}
