package dev.skibi.mapper.types;

import java.math.BigDecimal;
import java.time.LocalDateTime;

class DataDto {

    private int intFromString;
    private long longFromString;
    private String intFromValue;
    private String longFromValue;
    private String localDateTime;
    private String priceFromValue;
    private BigDecimal priceFromString;
    private Boolean booleanFromString;
    private String booleanFromValue;
    private EnumData enumFromString;
    private String enumFromValue;
    private LocalDateTime localDateTimeFromString;
    private String localDateTimeFromValue;


    public int getIntFromString() {
        return intFromString;
    }

    public void setIntFromString(int intFromString) {
        this.intFromString = intFromString;
    }

    public long getLongFromString() {
        return longFromString;
    }

    public void setLongFromString(long longFromString) {
        this.longFromString = longFromString;
    }

    public String getIntFromValue() {
        return intFromValue;
    }

    public void setIntFromValue(String intFromValue) {
        this.intFromValue = intFromValue;
    }

    public String getLongFromValue() {
        return longFromValue;
    }

    public void setLongFromValue(String longFromValue) {
        this.longFromValue = longFromValue;
    }

    public String getPriceFromValue() {
        return priceFromValue;
    }

    public void setPriceFromValue(String priceFromValue) {
        this.priceFromValue = priceFromValue;
    }

    public BigDecimal getPriceFromString() {
        return priceFromString;
    }

    public void setPriceFromString(BigDecimal priceFromString) {
        this.priceFromString = priceFromString;
    }

    public String getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(String localDateTime) {
        this.localDateTime = localDateTime;
    }

    public LocalDateTime getLocalDateTimeFromString() {
        return localDateTimeFromString;
    }

    public void setLocalDateTimeFromString(LocalDateTime localDateTimeFromString) {
        this.localDateTimeFromString = localDateTimeFromString;
    }

    public Boolean getBooleanFromString() {
        return booleanFromString;
    }

    public void setBooleanFromString(Boolean booleanFromString) {
        this.booleanFromString = booleanFromString;
    }

    public String getBooleanFromValue() {
        return booleanFromValue;
    }

    public void setBooleanFromValue(String booleanFromValue) {
        this.booleanFromValue = booleanFromValue;
    }

    public EnumData getEnumFromString() {
        return enumFromString;
    }

    public void setEnumFromString(EnumData enumFromString) {
        this.enumFromString = enumFromString;
    }

    public String getEnumFromValue() {
        return enumFromValue;
    }

    public void setEnumFromValue(String enumFromValue) {
        this.enumFromValue = enumFromValue;
    }

    public String getLocalDateTimeFromValue() {
        return localDateTimeFromValue;
    }

    public void setLocalDateTimeFromValue(String localDateTimeFromValue) {
        this.localDateTimeFromValue = localDateTimeFromValue;
    }

}
