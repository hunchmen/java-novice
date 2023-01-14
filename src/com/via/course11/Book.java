/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course11;

/**
 * 
 * @author via
 * 
 * @date 7 Jan 2023
 */
public class Book {

    private String name = "unknown";

    public Book() {
        System.out.println("Book: default no-argument constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkoutBook() {
        System.out.printf("The book: %s has been checked out successfully",
                name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Name: %s", name);
    }
}
