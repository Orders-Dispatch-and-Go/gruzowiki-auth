package ru.nsu.crpo.auth.service.api.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.crpo.auth.service.api.controller.spec.AuthControllerSpec;
import ru.nsu.crpo.auth.service.api.dto.auth.login.LoginRequest;
import ru.nsu.crpo.auth.service.api.dto.auth.login.LoginResponse;
import ru.nsu.crpo.auth.service.api.dto.auth.signin.CreateUserRequest;
import ru.nsu.crpo.auth.service.api.dto.auth.signin.CreateUserResponse;
import ru.nsu.crpo.auth.service.api.dto.auth.signin.SignInRequest;
import ru.nsu.crpo.auth.service.api.dto.auth.signin.SignInResponse;
import ru.nsu.crpo.auth.service.core.security.service.AuthService;

import static ru.nsu.crpo.auth.service.api.ApiPaths.AUTH;
import static ru.nsu.crpo.auth.service.api.ApiPaths.CREATE;
import static ru.nsu.crpo.auth.service.api.ApiPaths.LOGIN;
import static ru.nsu.crpo.auth.service.api.ApiPaths.LOGOUT;
import static ru.nsu.crpo.auth.service.api.ApiPaths.LOGOUT_ALL;
import static ru.nsu.crpo.auth.service.api.ApiPaths.MANAGER;
import static ru.nsu.crpo.auth.service.api.ApiPaths.SIGN_IN;

@RequiredArgsConstructor
@RestController
@RequestMapping(AUTH)
public class AuthController implements AuthControllerSpec {

    private final AuthService authService;

    @PostMapping(SIGN_IN)
    public ResponseEntity<SignInResponse> signIn(@RequestBody @Valid SignInRequest signInRequest) {
        var signInResponse = authService.signIn(signInRequest);
        return ResponseEntity.ok(signInResponse);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping(CREATE + MANAGER)
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody @Valid CreateUserRequest createUserRequest) {
        var createUserResponse = authService.createUser(createUserRequest);
        return ResponseEntity.ok(createUserResponse);
    }

    @PostMapping(LOGIN)
    public ResponseEntity<LoginResponse> login(@RequestBody @Valid LoginRequest loginRequest) {
        LoginResponse loginResponse = authService.login(loginRequest);
        return ResponseEntity.ok(loginResponse);
    }

    @PostMapping(LOGOUT)
    public ResponseEntity<Void> logout() {
        authService.logout();
        return ResponseEntity.ok().build();
    }

    @PostMapping(LOGOUT_ALL)
    public ResponseEntity<Void> logoutAllTokens() {
        authService.logoutAllToken();
        return ResponseEntity.ok().build();
    }
}
