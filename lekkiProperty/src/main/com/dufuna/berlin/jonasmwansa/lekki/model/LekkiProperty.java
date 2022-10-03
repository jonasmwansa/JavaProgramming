package com.dufuna.berlin.jonasmwansa.lekki.model;

import com.dufuna.berlin.jonasmwansa.lekki.enums.propertyType;
import java.util.Date;

public class LekkiProperty {

    //fields
    private int id;
    private String address;
    private propertyType type;
    private int numberOfBedrooms;
    private int numberOfSittingRooms;
    private int numberOfKitchens;
    private int numberOfBathrooms;
    private int numberOfToilets;
    private String owner;
    private String Description;
    private Date validFrom;
    private Date validTo;

    //methods
    public LekkiProperty() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public propertyType getType() {
        return type;
    }

    public void setType(propertyType type) {
        this.type = type;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfSittingRooms() {
        return numberOfSittingRooms;
    }

    public void setNumberOfSittingRooms(int numberOfSittingRooms) {
        this.numberOfSittingRooms = numberOfSittingRooms;
    }

    public int getNumberOfKitchens() {
        return numberOfKitchens;
    }

    public void setNumberOfKitchens(int numberOfKitchens) {
        this.numberOfKitchens = numberOfKitchens;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    @Override
    public String toString(){
        return id + ", "+ address + ", " + type +"\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof LekkiProperty property) {
            return this.getId() == property.getId();
        }
        return false;
    }

    @Override
    public int hashCode(){
        return id;
    }


}
