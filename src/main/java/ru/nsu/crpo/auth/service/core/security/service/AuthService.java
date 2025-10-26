package ru.nsu.crpo.auth.service.core.security.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.nsu.crpo.auth.service.api.dto.auth.login.SignInRequest;
import ru.nsu.crpo.auth.service.api.dto.auth.login.SignInResponse;
import ru.nsu.crpo.auth.service.api.dto.auth.signin.CreateUserRequest;
import ru.nsu.crpo.auth.service.api.dto.auth.signin.CreateUserResponse;
import ru.nsu.crpo.auth.service.api.dto.auth.signin.SignUpRequest;
import ru.nsu.crpo.auth.service.api.dto.auth.signin.SignUpResponse;

public interface AuthService {

    boolean setAuthentication(HttpServletRequest request, HttpServletResponse response);

    SignUpResponse signUp(SignUpRequest signUpRequest);

    CreateUserResponse createUser(CreateUserRequest createUserRequest);

    SignInResponse signIn(SignInRequest signInRequest);

    void logout();

    void logoutAllToken();
}
