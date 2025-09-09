package ru.nsu.crpo.auth.service.api.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {

    private int errorCode;

    private String message;
}
