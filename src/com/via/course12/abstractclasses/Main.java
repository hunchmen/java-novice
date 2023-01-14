/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course12.abstractclasses;

/**
 * 
 * @author via
 * 
 * @date 7 Jan 2023
 */
public class Main {

    public static void main(String[] args) {

        OnePlus onePlus = new OnePlus(499, true);
        IPhone iPhone = new IPhone(1199, true);

        // Phone motorola = new Phone("Android", "Moto G", 299);

        System.out.println("One plus: " + onePlus);
        System.out.println("iPhone: " + iPhone);
        // System.out.println("Motorola: " + motorola);

    }
}
