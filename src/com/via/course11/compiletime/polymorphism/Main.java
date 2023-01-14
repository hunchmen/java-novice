/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course11.compiletime.polymorphism;

/**
 * 
 * @author via
 * 
 * @date 7 Jan 2023
 */
public class Main {

    public static void main(String[] args) {

        Measure measure = new Measure();

        System.out.println(
                "Perimeter of rectangle in cm: " + measure.perimeter(4, 3));

        System.out
                .println("Area of rectangle in sq. cm: " + measure.area(4, 3));
    }
}
