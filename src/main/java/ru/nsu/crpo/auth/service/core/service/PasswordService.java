package ru.nsu.crpo.auth.service.core.service;

public interface PasswordService {

    String generateRandomPassword();

    String encodePassword(String password);
}
