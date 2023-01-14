/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course10.inheritance;

/**
 * 
 * @author via
 * 
 * @date 5 Jan 2023
 */
public class Book {

    private String bindingType = "Paperback";

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public void checkoutBook() {
        System.out.println("The book has been checked out successfully");
    }
}
