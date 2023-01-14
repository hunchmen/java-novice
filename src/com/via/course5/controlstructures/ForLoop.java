/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.course5.controlstructures;

/**
 * 
 * @author via
 * 
 * @date 1 Dec 2022
 */
public class ForLoop {

    public static void main(String[] args) {

        String[] productNames =
                {"Mouse", "Speaker", "Watch", "Earphones", "Charger"};
        double[] productPriceUSD = {9.90, 79.0, 110.0, 42.50, 55.0};
        double USDToEUR = 0.82;

        System.out.println("What are the product prices in USD and Euros");

        for (int i = 0; i < productPriceUSD.length; i++) {
            System.out.printf("\nProduct %s costs %f USD or %f EUR",
                    productNames[i], productPriceUSD[i],
                    (USDToEUR * productPriceUSD[i]));

        }

        String[] products =
                {"Mouse", "Speaker", "Watch", "Earphones", "Charger"};
        String[] brands = {"Raganza", "Qenel", "Zoflina"};

        System.out.println("What are the product in the catalog?\n");

        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < brands.length; j++) {
                System.out.println(brands[j] + " " + products[i]);
            }
        }
    }
}
