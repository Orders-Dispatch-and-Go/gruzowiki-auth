package ru.nsu.crpo.auth.service.api.dto.auth.signin;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
public class SignInRequest {

    @Schema(
            example = "gmail1@gmail.com"
    )
    @NotBlank
    @Email
    @Size(min = 5, max = 100)
    private String email;

    @Schema(
            example = "password1"
    )
    @NotBlank
    @Size(min = 8)
    private String password;

    @Schema(
            example = "name1"
    )
    @NotBlank
    @Size(min = 5, max = 100)
    private String firstName;

    @Schema(
            example = "name1"
    )
    @NotBlank
    @Size(min = 5, max = 100)
    private String secondName;

    @Schema(
            example = "name1"
    )
    @NotBlank
    @Size(min = 5, max = 100)
    private String thirdName;

    @Schema(
            example = "name1"
    )
    @NotBlank
    @Size(min = 11, max = 13)
    private String phone;

    @Schema(
            example = "2004-03-02"
    )
    @NotNull
    private LocalDate birthdate;

    @Schema(
            example = "1234"
    )
    @NotNull
    private int passportSeries;

    @Schema(
            example = "12345678"
    )
    @NotNull
    private int passportNumber;
}
