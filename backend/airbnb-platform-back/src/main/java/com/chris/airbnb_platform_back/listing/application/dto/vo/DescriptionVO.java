package com.chris.airbnb_platform_back.listing.application.dto.vo;

import jakarta.validation.constraints.NotNull;

public record DescriptionVO(@NotNull(message = "Description value must be present") String value) {
}
