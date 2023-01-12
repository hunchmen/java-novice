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
public class Main {

    public static void main(String[] args) {

        Automobile sedan = new Sedan("Honda", "Civic", 12000);

        System.out.println("Sedan make: " + sedan.getMake());
        System.out.println("Sedan model: " + sedan.getModel());
        System.out.println("Sedan price: " + sedan.getPrice());

        System.out.println(
                "Sedan is an instance of Sedan: " + (sedan instanceof Sedan));
        System.out.println("Sedan is an instance of Automobile: "
                + (sedan instanceof Automobile));


    }
}
