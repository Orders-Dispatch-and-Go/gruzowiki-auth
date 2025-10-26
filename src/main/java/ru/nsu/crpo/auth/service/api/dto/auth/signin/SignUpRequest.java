package ru.nsu.crpo.auth.service.api.dto.auth.signin;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
public class SignUpRequest {

    @Schema(
            example = "gmail1@gmail.com"
    )
    @NotBlank
    @Email
    @Size(min = 5, max = 128)
    private String email;

    @Schema(
            example = "password1"
    )
    @NotBlank
    @Size(min = 8, max = 64)
    private String password;

    @Schema(
            example = "name1"
    )
    @NotBlank
    @Size(min = 1, max = 40)
    private String firstName;

    @Schema(
            example = "secondName1"
    )
    @NotBlank
    @Size(min = 1, max = 40)
    private String secondName;

    @Schema(
            example = "thirdName1"
    )
    @NotBlank
    @Size(min = 1, max = 100)
    private String thirdName;

    @Schema(
            example = "+71234567890"
    )
    @NotBlank
    @Size(min = 10, max = 13)
    @Pattern(regexp = "^\\+7\\d{10}$")
    private String phone;

    @NotBlank
    @Pattern(regexp = "ROLE_CONSIGNER|ROLE_CARRIER")
    private String role;

    @Schema(
            example = "2004-03-02"
    )
    @NotNull
    private LocalDate birthdate;
}
