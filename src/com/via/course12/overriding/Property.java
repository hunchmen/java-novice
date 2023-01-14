/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course12.overriding;

/**
 * 
 * @author via
 * 
 * @date 7 Jan 2023
 */
public class Property {

    private String propertyType = "unknown";

    private final String projectName;
    private final int propertySize;

    public Property(String propertyType, String projectName, int propertySize) {
        super();
        this.propertyType = propertyType;
        this.projectName = projectName;
        this.propertySize = propertySize;
    }

    public void printDetails() {
        System.out.printf("Property {type=%s, projectName=%s, propertySize=%s}",
                propertyType, projectName, propertySize);
        System.out.println();
    }

    public static String getPropertyType() {
        return "unknown";
    }
}
