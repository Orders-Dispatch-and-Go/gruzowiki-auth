package ru.nsu.crpo.auth.service.api.controller.spec;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import ru.nsu.crpo.auth.service.api.dto.user.UserResponse;

import static ru.nsu.crpo.auth.service.util.MessageKeys.SWAGGER_SECURITY_SCHEME_NAME;

public interface UserControllerSpec {

    @SecurityRequirement(name = SWAGGER_SECURITY_SCHEME_NAME)
    ResponseEntity<UserResponse> getUserByAuth();
}
