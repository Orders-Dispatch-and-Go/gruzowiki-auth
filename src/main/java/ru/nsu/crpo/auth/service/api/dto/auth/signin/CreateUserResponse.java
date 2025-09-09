package ru.nsu.crpo.auth.service.api.dto.auth.signin;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserResponse {

    private int id;

    private String login;

    private String password;
}
