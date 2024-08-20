package com.chris.airbnb_platform_back.booking.repository;

import com.chris.airbnb_platform_back.booking.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
