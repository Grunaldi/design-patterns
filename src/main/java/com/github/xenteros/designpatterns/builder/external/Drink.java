package com.github.xenteros.designpatterns.builder.external;

/**
 * In this class, fields are all Strings in purpose.
 */
public class Drink {

    private String manufacturer;
    private String validUntil;
    private String quantity;
    private String packaging;
    private String unit;
    private String drinkName;

    public Drink(String drinkName, String quantity, String unit, String manufacturer, String packaging, String validUntil) {
        this.drinkName = drinkName;
        this.quantity = quantity;
        this.unit = unit;
        this.manufacturer = manufacturer;
        this.packaging = packaging;
        this.validUntil = validUntil;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPackaging() {
        return packaging;
    }

    public String getValidUntil() {
        return validUntil;
    }

    @Override
    public String toString() {
        return "Supplement{" +
                "drinkName='" + drinkName + '\'' +
                ", quantity='" + quantity + '\'' +
                ", unit='" + unit + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", packaging='" + packaging + '\'' +
                ", validUntil='" + validUntil + '\'' +
                '}';
    }

    public static class Builder {
        //TODO
    }
}
