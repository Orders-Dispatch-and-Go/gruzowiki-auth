package ru.nsu.crpo.auth.service.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nsu.crpo.auth.service.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
