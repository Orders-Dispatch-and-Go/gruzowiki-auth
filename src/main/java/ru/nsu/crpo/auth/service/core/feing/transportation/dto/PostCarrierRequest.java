package ru.nsu.crpo.auth.service.core.feing.transportation.dto;

import lombok.Builder;

@Builder
public record PostCarrierRequest(int id, String driverCategory) {}
