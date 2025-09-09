package ru.nsu.crpo.auth.service.core.service;

import ru.nsu.crpo.auth.service.model.Role;

public interface RoleService {

    Role getRole(int id);

    Role getRole(String name);
}
