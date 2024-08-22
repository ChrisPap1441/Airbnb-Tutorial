package com.chris.airbnb_platform_back.booking.application.dto;

import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public record BookedDateDTO(@NotNull OffsetDateTime startDate,
                            @NotNull OffsetDateTime endDate) {
}
