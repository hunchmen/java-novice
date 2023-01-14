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
public class Car {

    public String name;
    public String type;
    public float mpg;
    public int price;

    public Car() {
        name = "Honda Accord";
        type = "sedan";
        mpg = 22.5f;
        price = 28000;

        System.out.println("Object constructed");
    }


    public void printCarInfo() {
        System.out.printf("Name: %s, Type: %s, MPG: %.1f, Price: %d\n", name,
                type, mpg, price);
    }
}
