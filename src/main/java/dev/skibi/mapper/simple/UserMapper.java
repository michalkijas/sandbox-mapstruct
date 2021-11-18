package dev.skibi.mapper.simple;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
interface UserMapper {

    @Mappings({
            @Mapping(source = "source.age", target = "userAge")
    })
    UserDto toSimpleUser(User source);

    @Mappings({
            @Mapping(source = "destination.userAge", target = "age")
    })
    User toUser(UserDto destination);


    /**
     * Automatically match implementation for fields Address/SimplyAddress types in User/SimpleUser
     */
    @Mappings({
            @Mapping(source = "source.country", target = "countryName"),
            @Mapping(source = "source.city", target = "cityName"),
    })
    AddressDto toSimpleAddress(Address source);

    @Mappings({
            @Mapping(source = "source.countryName", target = "country"),
            @Mapping(source = "source.cityName", target = "city"),
    })
    Address toAddress(AddressDto source);

}
