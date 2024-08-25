package com.chris.airbnb_platform_back.booking.mapper;

import com.chris.airbnb_platform_back.booking.application.dto.BookedDateDTO;
import com.chris.airbnb_platform_back.booking.application.dto.NewBookingDTO;
import com.chris.airbnb_platform_back.booking.domain.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}
