package dev.skibi.mapper.simple;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserMapperSpec {

    private final UserMapperImpl sut = new UserMapperImpl();

    @Test
    public void testSourceToDtoMapping() {
        // given
        User input = new User("John", "Snow", 40, Gender.MALE,
                new Address("Poland", "Warsaw", "Quiet", "20/23", "9b"));

        // when
        UserDto result = sut.toSimpleUser(input);

        // then
        assertThat(result.getFirstName())
                .isEqualTo(input.getFirstName());
        assertThat(result.getUserAge())
                .isEqualTo(input.getAge());
        assertThat(result.getAddress().getCountryName())
                .isEqualTo(input.getAddress().getCountry());
        assertThat(result.getAddress().getCityName())
                .isEqualTo(input.getAddress().getCity());
    }

    @Test
    public void testDtoToSourceMapping() {
        // given
        UserDto input = new UserDto("John", "Snow", 42, new AddressDto());

        // when
        User result = sut.toUser(input);

        // then
        assertThat(result.getFirstName()).isEqualTo(input.getFirstName());
        assertThat(result.getAge()).isEqualTo(input.getUserAge());
    }

}
