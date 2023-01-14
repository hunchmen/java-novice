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
public class IPhone extends Phone {

    private boolean airpods;

    public IPhone(float basePrice, boolean airpods) {
        super("iOS", "iPhone 6s", basePrice);
        this.airpods = airpods;
    }

    @Override
    public String toString() {

        String superString = super.toString();

        return String.format("%s, airpods: %s", superString, airpods);
    }
}
