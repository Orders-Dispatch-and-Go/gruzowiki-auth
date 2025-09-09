package ru.nsu.crpo.auth.service.core.service;

import ru.nsu.crpo.auth.service.model.User;

public interface TokenService {

    boolean tokenIsPresent(String token);

    void saveToken(String token, User user);

    void deleteToken(String token);

    void deleteAllPresentTokenByUserId(int userId);
}
