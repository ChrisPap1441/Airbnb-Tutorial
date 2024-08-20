package com.chris.airbnb_platform_back.listing.repository;

import com.chris.airbnb_platform_back.listing.domain.ListingPicture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingPictureRepository extends JpaRepository<ListingPicture, Long> {
}
