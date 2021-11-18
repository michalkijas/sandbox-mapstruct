package dev.skibi.mapper.types;

import java.math.BigDecimal;
import java.time.LocalDateTime;

class DataSource {

    private int intValue;
    private String intString;
    private long longValue;
    private String longString;
    private BigDecimal priceValue;
    private String priceString;
    private Boolean booleanValue;
    private String booleanString;
    private EnumData enumValue;
    private String enumString;
    private LocalDateTime localDateTimeValue;
    private String localDateTimeString;


    public String getIntString() {
        return intString;
    }

    public void setIntString(String intString) {
        this.intString = intString;
    }

    public String getLongString() {
        return longString;
    }

    public void setLongString(String longString) {
        this.longString = longString;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public BigDecimal getPriceValue() {
        return priceValue;
    }

    public void setPriceValue(BigDecimal priceValue) {
        this.priceValue = priceValue;
    }

    public String getPriceString() {
        return priceString;
    }

    public void setPriceString(String priceString) {
        this.priceString = priceString;
    }

    public LocalDateTime getLocalDateTimeValue() {
        return localDateTimeValue;
    }

    public void setLocalDateTimeValue(LocalDateTime localDateTimeValue) {
        this.localDateTimeValue = localDateTimeValue;
    }

    public String getLocalDateTimeString() {
        return localDateTimeString;
    }

    public void setLocalDateTimeString(String localDateTimeString) {
        this.localDateTimeString = localDateTimeString;
    }

    public String getBooleanString() {
        return booleanString;
    }

    public void setBooleanString(String booleanString) {
        this.booleanString = booleanString;
    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public EnumData getEnumValue() {
        return enumValue;
    }

    public void setEnumValue(EnumData enumValue) {
        this.enumValue = enumValue;
    }

    public String getEnumString() {
        return enumString;
    }

    public void setEnumString(String enumString) {
        this.enumString = enumString;
    }

}
