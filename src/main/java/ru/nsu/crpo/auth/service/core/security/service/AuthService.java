package ru.nsu.crpo.auth.service.core.security.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.nsu.crpo.auth.service.api.dto.auth.login.LoginRequest;
import ru.nsu.crpo.auth.service.api.dto.auth.login.LoginResponse;
import ru.nsu.crpo.auth.service.api.dto.auth.signin.CreateUserRequest;
import ru.nsu.crpo.auth.service.api.dto.auth.signin.CreateUserResponse;
import ru.nsu.crpo.auth.service.api.dto.auth.signin.SignInRequest;
import ru.nsu.crpo.auth.service.api.dto.auth.signin.SignInResponse;

public interface AuthService {

    boolean setAuthentication(HttpServletRequest request, HttpServletResponse response);

    SignInResponse signIn(SignInRequest signInRequest);

    CreateUserResponse createUser(CreateUserRequest createUserRequest);

    LoginResponse login(LoginRequest loginRequest);

    void logout();

    void logoutAllToken();
}
