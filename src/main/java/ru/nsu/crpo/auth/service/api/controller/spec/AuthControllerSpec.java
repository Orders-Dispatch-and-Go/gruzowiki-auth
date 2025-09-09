package ru.nsu.crpo.auth.service.api.controller.spec;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import ru.nsu.crpo.auth.service.api.dto.auth.signin.CreateUserRequest;
import ru.nsu.crpo.auth.service.api.dto.auth.signin.CreateUserResponse;

import static ru.nsu.crpo.auth.service.util.MessageKeys.SWAGGER_SECURITY_SCHEME_NAME;

public interface AuthControllerSpec {

    @SecurityRequirement(name = SWAGGER_SECURITY_SCHEME_NAME)
    ResponseEntity<CreateUserResponse> createUser(@RequestBody @Valid CreateUserRequest createUserRequest);

    @SecurityRequirement(name = SWAGGER_SECURITY_SCHEME_NAME)
    ResponseEntity<Void> logout();

    @SecurityRequirement(name = SWAGGER_SECURITY_SCHEME_NAME)
    ResponseEntity<Void> logoutAllTokens();
}
