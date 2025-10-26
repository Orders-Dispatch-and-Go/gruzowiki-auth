package ru.nsu.crpo.auth.service.api.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.crpo.auth.service.api.controller.spec.AuthControllerSpec;
import ru.nsu.crpo.auth.service.api.dto.auth.login.SignInRequest;
import ru.nsu.crpo.auth.service.api.dto.auth.login.SignInResponse;
import ru.nsu.crpo.auth.service.api.dto.auth.signin.SignUpRequest;
import ru.nsu.crpo.auth.service.api.dto.auth.signin.SignUpResponse;
import ru.nsu.crpo.auth.service.core.security.service.AuthService;

import static org.springframework.security.config.Elements.LOGOUT;
import static ru.nsu.crpo.auth.service.api.ApiPaths.AUTH;
import static ru.nsu.crpo.auth.service.api.ApiPaths.SIGN_IN;
import static ru.nsu.crpo.auth.service.api.ApiPaths.LOGOUT_ALL;
import static ru.nsu.crpo.auth.service.api.ApiPaths.SIGN_UP;

@RequiredArgsConstructor
@RestController
@RequestMapping(AUTH)
public class AuthController implements AuthControllerSpec {

    private final AuthService authService;

    @PostMapping(SIGN_UP)
    public ResponseEntity<SignUpResponse> signUp(@RequestBody @Valid SignUpRequest signUpRequest) {
        var signInResponse = authService.signUp(signUpRequest);
        return ResponseEntity.ok(signInResponse);
    }

//    @PreAuthorize("hasRole('ROLE_ADMIN')")
//    @PostMapping(CREATE + MANAGER)
//    public ResponseEntity<CreateUserResponse> createUser(@RequestBody @Valid CreateUserRequest createUserRequest) {
//        var createUserResponse = authService.createUser(createUserRequest);
//        return ResponseEntity.ok(createUserResponse);
//    }

    @PostMapping(SIGN_IN)
    public ResponseEntity<SignInResponse> signIn(@RequestBody @Valid SignInRequest signInRequest) {
        SignInResponse signInResponse = authService.signIn(signInRequest);
        return ResponseEntity.ok(signInResponse);
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
