package ru.nsu.crpo.auth.service.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.crpo.auth.service.api.controller.spec.UserControllerSpec;
import ru.nsu.crpo.auth.service.api.dto.user.UserResponse;
import ru.nsu.crpo.auth.service.core.service.UserService;

import static ru.nsu.crpo.auth.service.api.ApiPaths.USERS;

@RestController
@RequiredArgsConstructor
@RequestMapping(USERS)
public class UserController implements UserControllerSpec {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<UserResponse> getUserByAuth() {
        UserResponse userResponse = userService.getUserByAuth();
        return ResponseEntity.ok(userResponse);
    }
}
