/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.course8.methods;

/**
 * 
 * @author via
 * 
 * @date 19 Dec 2022
 */
public class Main2 {

    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println("(c1): " + c1);
        System.out.println("Name: " + c1.name);
        System.out.println("Type: " + c1.type);
        System.out.println("MPG: " + c1.mpg);
        System.out.println("Price: " + c1.price);

        System.out.println();

        Car c2 = new Car();
        System.out.println("(c1): " + c2);
        System.out.println("Name: " + c2.name);
        System.out.println("Type: " + c2.type);
        System.out.println("MPG: " + c2.mpg);
        System.out.println("Price: " + c2.price);

    }
}
