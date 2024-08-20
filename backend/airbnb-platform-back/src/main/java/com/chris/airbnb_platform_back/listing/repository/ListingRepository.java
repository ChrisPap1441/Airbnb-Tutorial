package com.chris.airbnb_platform_back.listing.repository;

import com.chris.airbnb_platform_back.listing.domain.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing, Long> {
}
