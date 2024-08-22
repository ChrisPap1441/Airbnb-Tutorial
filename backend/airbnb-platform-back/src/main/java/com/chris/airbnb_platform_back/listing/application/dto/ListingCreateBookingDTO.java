package com.chris.airbnb_platform_back.listing.application.dto;

import com.chris.airbnb_platform_back.listing.application.dto.vo.PriceVO;

import java.util.UUID;

public record ListingCreateBookingDTO(UUID listingPublicId, PriceVO price) {
}
