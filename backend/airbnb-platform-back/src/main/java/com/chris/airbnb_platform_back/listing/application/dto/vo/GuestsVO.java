package com.chris.airbnb_platform_back.listing.application.dto.vo;

import jakarta.validation.constraints.NotNull;

public record GuestsVO(@NotNull(message = "Guests value must be present") int value) {
}
