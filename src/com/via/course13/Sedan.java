/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course13;

/**
 * 
 * @author via
 * 
 * @date 11 Jan 2023
 */
public class Sedan implements Automobile {

    private String make;
    private String model;
    private double price;

    public Sedan(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.via.course13.Automobile#getMake()
     */
    @Override
    public String getMake() {
        // TODO Auto-generated method stub
        return make;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.via.course13.Automobile#getModel()
     */
    @Override
    public String getModel() {
        // TODO Auto-generated method stub
        return model;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.via.course13.Automobile#getPrice()
     */
    @Override
    public Double getPrice() {
        // TODO Auto-generated method stub
        return price;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Make: %s, Model: %s, Price: $s", make, model,
                price);
    }

}
