package com.chris.airbnb_platform_back.listing.application.dto.vo;

import jakarta.validation.constraints.NotNull;

public record BedroomsVO(@NotNull(message = "Bedroom value must be present") int value) {
}
