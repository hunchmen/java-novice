/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course12.abstractclasses;

/**
 * 
 * @author via
 * 
 * @date 7 Jan 2023
 */
public abstract class Phone {

    private final String operatingSystem;
    private final String brandName;
    private final float basePrice;

    public Phone(String operatingSystem, String brandName, float basePrice) {
        super();
        this.operatingSystem = operatingSystem;
        this.brandName = brandName;
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return String.format("Operating System: %s, Brand: %s, Base price: %s",
                operatingSystem, brandName, basePrice);
    }

}
