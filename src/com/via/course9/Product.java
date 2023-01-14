/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course9;

import java.util.Objects;

/**
 * 
 * @author via
 * 
 * @date 4 Jan 2023
 */
public class Product {

    private int id;
    private String name;
    private double price;
    private String category;

    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Product Name: %s, price: %s, category: %s", name,
                price, category);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Product)) {
            return false;
        }

        Product product = (Product) obj;

        if (this.id == product.id && this.name.equals(product.name)
                && this.price == product.price
                && this.category.equals(product.category)) {

            return true;
        }

        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {

        // int hash = 23;
        //
        // hash = 37 * hash + ((Integer) id).hashCode();
        // hash = 37 * hash + name.hashCode();
        // hash = 37 * hash + ((Double) price).hashCode();
        // hash = 37 * hash + category.hashCode();
        //
        // return hash;

        return Objects.hash(id, name, price, category);
    }

}
