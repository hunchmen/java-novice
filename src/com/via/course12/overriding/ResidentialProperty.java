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
public class ResidentialProperty extends Property {

    public enum Type {

        SINGLE_FAMILY_Home, CONDO, TOWNHOME

    }

    private Type residentialPropertyType = Type.CONDO;
    private float hoaFees;

    public ResidentialProperty(String projectName, int propertySize,
            Type residentialPropertyType, float hoaFees) {

        super("Residential", projectName, propertySize);
        this.residentialPropertyType = residentialPropertyType;
        this.hoaFees = hoaFees;

    }

    @Override
    public void printDetails() {

        super.printDetails();

        System.out.printf("ResidentialProperty {type=%s, HOA Fees=%.1f}",
                residentialPropertyType, hoaFees);
        System.out.println();
    }

    public static String getPropertyType() {

        return "Residential";

    }

}
