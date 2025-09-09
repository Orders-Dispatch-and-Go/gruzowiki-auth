package ru.nsu.crpo.auth.service.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nsu.crpo.auth.service.model.AccessToken;

public interface AccessTokenRepository extends JpaRepository<AccessToken, String> {

    boolean existsAccessTokenByToken(String token);

    void deleteAllByUserId(int userId);

    void deleteByToken(String token);
}
