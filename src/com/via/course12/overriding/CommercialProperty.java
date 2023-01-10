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
public class CommercialProperty extends Property {

    public enum Type {
        OFFICE, RETAIL, INDUSTRIAL
    }

    private Type commercialPropertyType = Type.OFFICE;
    private float contractedServicesFees;

    public CommercialProperty(String projectName, int propertySize,
            Type commercialPropertyType, float contractedServicesFees) {

        super("Commercial", projectName, propertySize);
        this.commercialPropertyType = commercialPropertyType;
        this.contractedServicesFees = contractedServicesFees;

    }

    public static String getPropertyType() {

        return "Commercial";

    }

}
