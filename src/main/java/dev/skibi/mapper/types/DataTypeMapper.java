package dev.skibi.mapper.types;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * https://mapstruct.org/documentation/stable/reference/html/#datatype-conversions
 */
@Mapper
interface DataTypeMapper {

    @Mappings({
            @Mapping(source = "data.intValue", target = "intFromValue"),
            @Mapping(source = "data.intString", target = "intFromString"),
            @Mapping(source = "data.longValue", target = "longFromValue"),
            @Mapping(source = "data.longString", target = "longFromString"),
            @Mapping(source = "data.priceValue", target = "priceFromValue", numberFormat = "$#.00"),
            @Mapping(source = "data.priceString", target = "priceFromString", numberFormat = "$#.00"),
            @Mapping(source = "data.booleanValue", target = "booleanFromValue"),
            @Mapping(source = "data.booleanString", target = "booleanFromString"),
            @Mapping(source = "data.enumValue", target = "enumFromValue"),
            @Mapping(source = "data.localDateTimeValue", target = "localDateTimeFromValue", dateFormat = "YYYY MM-dd"),
            @Mapping(source = "data.localDateTimeString", target = "localDateTimeFromString", dateFormat = "yyy-MM dd HH:mm:ss")
    })
    DataDto toDataDto(DataSource data);

}
