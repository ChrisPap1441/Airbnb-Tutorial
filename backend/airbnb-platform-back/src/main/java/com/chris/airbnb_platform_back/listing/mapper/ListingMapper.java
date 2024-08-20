package com.chris.airbnb_platform_back.listing.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListingMapper.class})
public interface ListingMapper {
}
