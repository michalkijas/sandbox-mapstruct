package dev.skibi.mapper.types;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class DataTypeMapperSpec {

    @Test
    public void testDataConversions() {
        // given
        DataSource source = new DataSource();
        source.setIntValue(752);
        source.setIntString("183");
        source.setLongValue(435234L);
        source.setLongString("73432");
        source.setPriceValue(new BigDecimal("674.56"));
        source.setPriceString("$123.56");
        source.setBooleanValue(false);
        source.setBooleanString("true");
        source.setEnumValue(EnumData.ALWAYS);
        source.setEnumString("NEVER");
        source.setLocalDateTimeValue(LocalDateTime.parse("2021-11-13T10:15:30"));
        source.setLocalDateTimeString("2020-03 13 10:15:30");

        // when
        DataDto result = new DataTypeMapperImpl().toDataDto(source);

        // then
        assertThat(result.getIntFromValue()).isEqualTo("752");
        assertThat(result.getIntFromString()).isEqualTo(183);
        assertThat(result.getLongFromValue()).isEqualTo("435234");
        assertThat(result.getLongFromString()).isEqualTo(73432L);
        assertThat(result.getPriceFromValue()).isEqualTo("$674.56");
        assertThat(result.getPriceFromString()).isEqualTo(new BigDecimal("123.56"));
        assertThat(result.getBooleanFromValue()).isEqualTo("false");
        assertThat(result.getBooleanFromString()).isEqualTo(true);
        assertThat(result.getLocalDateTimeFromValue()).isEqualTo("2021 11-13");
        assertThat(result.getLocalDateTimeFromString()).isEqualTo(LocalDateTime.parse("2020-03-13T10:15:30"));
    }

}
