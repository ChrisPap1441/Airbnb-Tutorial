package com.chris.airbnb_platform_back.listing.application.dto.sub;

import com.chris.airbnb_platform_back.listing.application.dto.vo.DescriptionVO;
import com.chris.airbnb_platform_back.listing.application.dto.vo.TitleVO;
import jakarta.validation.constraints.NotNull;

public record DescriptionDTO(@NotNull TitleVO title,
                             @NotNull DescriptionVO description) {
}
