package com.chris.airbnb_platform_back.listing.application.dto;

import com.chris.airbnb_platform_back.listing.application.dto.sub.PictureDTO;
import com.chris.airbnb_platform_back.listing.application.dto.vo.PriceVO;
import com.chris.airbnb_platform_back.listing.domain.BookingCategory;

import java.util.UUID;

public record DisplayCardListingDTO(PriceVO price,
                                    String location,
                                    PictureDTO cover,
                                    BookingCategory bookingCategory,
                                    UUID publicId) {
}
