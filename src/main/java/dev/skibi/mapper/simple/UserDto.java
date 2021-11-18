package dev.skibi.mapper.simple;

public class UserDto {

    private String firstName;
    private String lastName;
    private int userAge;
    private AddressDto address;


    public UserDto(String firstName, String lastName, int userAge, AddressDto address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userAge = userAge;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

}
