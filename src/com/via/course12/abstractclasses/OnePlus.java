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
public class OnePlus extends Phone {

    private boolean stylusSupport;

    public OnePlus(float basePrice, boolean stylusSupport) {
        super("Android", "OnePlus", basePrice);
        this.stylusSupport = stylusSupport;
    }

    @Override
    public String toString() {

        String superString = super.toString();

        return String.format("%s, stylusSupport: %s", superString,
                stylusSupport);
    }
}
