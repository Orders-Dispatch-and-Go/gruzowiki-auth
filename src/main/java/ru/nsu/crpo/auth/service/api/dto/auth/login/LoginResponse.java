package ru.nsu.crpo.auth.service.api.dto.auth.login;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {

    private String accessToken;
}
