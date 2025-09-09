package ru.nsu.crpo.auth.service.core.service;

import ru.nsu.crpo.auth.service.api.dto.user.UserResponse;
import ru.nsu.crpo.auth.service.model.User;

public interface UserService {

    UserResponse getUser(int id);

    User saveUser(User user);

    UserResponse getUserByAuth();

    User findUser(int id);
}
