package com.chris.airbnb_platform_back.listing.application.dto.vo;

import jakarta.validation.constraints.NotNull;

public record BathsVO(@NotNull(message = "Bath value must be present") int value) {
}
