package com.chris.airbnb_platform_back.listing.application.dto;

import com.chris.airbnb_platform_back.booking.application.dto.BookedDateDTO;
import com.chris.airbnb_platform_back.listing.application.dto.sub.ListingInfoDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

public record SearchDTO(@Valid BookedDateDTO dates,
                        @Valid ListingInfoDTO infos,
                        @NotEmpty String location) {
}
