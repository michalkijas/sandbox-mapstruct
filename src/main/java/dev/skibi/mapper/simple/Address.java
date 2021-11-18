package dev.skibi.mapper.simple;

public class Address {

    private String country;
    private String city;
    private String street;
    private String buildingNumber;
    private String apparentNumber;


    public Address(String country, String city, String street, String buildingNumber, String apparentNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.apparentNumber = apparentNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getApparentNumber() {
        return apparentNumber;
    }

    public void setApparentNumber(String apparentNumber) {
        this.apparentNumber = apparentNumber;
    }
}
