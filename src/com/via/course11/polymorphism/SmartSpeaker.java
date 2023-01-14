/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course11.polymorphism;

/**
 * 
 * @author via
 * 
 * @date 7 Jan 2023
 */
public class SmartSpeaker {

    private String productName = "unknown";

    /**
     * 
     */
    public SmartSpeaker(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void wakePhrase() {
        System.out.format("Activates on saying %s's wake phrase.\n",
                productName);
    }
}
