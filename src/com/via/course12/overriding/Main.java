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
public class Main {

    public static void main(String[] args) {

        ResidentialProperty alpha = new ResidentialProperty("Alpha", 1200,
                ResidentialProperty.Type.TOWNHOME, 4000);

        ResidentialProperty beta = new ResidentialProperty("Beta", 900,
                ResidentialProperty.Type.CONDO, 4000);

        alpha.printDetails();
        beta.printDetails();

        System.out.println();

        CommercialProperty gamma = new CommercialProperty("Gamma", 3000,
                CommercialProperty.Type.OFFICE, 7000);

        CommercialProperty delta = new CommercialProperty("Delta", 10000,
                CommercialProperty.Type.RETAIL, 15000);

        gamma.printDetails();
        delta.printDetails();

        System.out.println();

        System.out.println(
                "****** Method hiding for static methods with the same name");

        System.out.println(
                "Propery.getPropertyType(): " + Property.getPropertyType());
        System.out.println("ResidentialProperty.getPropertyType(): "
                + ResidentialProperty.getPropertyType());
        System.out.println("CommercialPropery.getPropertyType(): "
                + CommercialProperty.getPropertyType());

    }
}
